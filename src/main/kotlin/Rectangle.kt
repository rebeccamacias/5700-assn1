import kotlin.math.abs

open class Rectangle: Shape() {
    var topLeftCorner = MyPoint()
        private set
    var bottomRightCorner = MyPoint()
        private set
    private var width: Double = abs(bottomRightCorner.x - topLeftCorner.x)
    private var height: Double = abs(bottomRightCorner.y - topLeftCorner.y)

    private fun recalculateWidthAndHeight() {
        setWidth(abs(bottomRightCorner.x - topLeftCorner.x))
        if (width == 0.0) {
            println("Width cannot be 0. Setting width to 1.0 and updating bottomRightCorner.")
            bottomRightCorner.setX(topLeftCorner.x + 1.0)
            setWidth(abs(bottomRightCorner.x - topLeftCorner.x))
        }
        setHeight(abs(bottomRightCorner.y - topLeftCorner.y))
        if (height == 0.0) {
            println("Height cannot be 0. Setting height to 1.0 and updating bottomRightCorner.")
            bottomRightCorner.setY(topLeftCorner.y - 1.0)
            setHeight(abs(bottomRightCorner.y - topLeftCorner.y))
        }
    }

    fun setTopLeftCorner(point: MyPoint) {
        this.topLeftCorner = point
    }

    fun setBottomRightCorner(point: MyPoint) {
        this.bottomRightCorner = point
        recalculateWidthAndHeight()
    }
    fun getWidth(): Double {
        return width
    }

    private fun setWidth(newWidth: Double) {
        width = newWidth
    }

    fun getHeight(): Double {
        return height
    }

    private fun setHeight(newHeight: Double) {
        height = newHeight
    }

    override fun getArea(): Double {
        return abs(width * height)
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        topLeftCorner.movePoint(xDelta, yDelta)
        bottomRightCorner.movePoint(xDelta, yDelta)
    }
}