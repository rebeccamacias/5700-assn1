import kotlin.math.abs

class Square: Shape() {
    var topLeftCorner = MyPoint()
        private set
    var bottomRightCorner = MyPoint()
        private set
    private var width: Double = abs(bottomRightCorner.x - topLeftCorner.x)
    private var height: Double = abs(bottomRightCorner.y - topLeftCorner.y)

    private fun setWidth(width: Double) {
        this.width = width
    }

    private fun setHeight(height: Double) {
        if (height != width) {
            println("The height and width must be equal. Adjusting height to be equal." +
                    " Adjusting bottom right corner as well.")
            bottomRightCorner.setX(topLeftCorner.x + 5.0)
            bottomRightCorner.setY(topLeftCorner.y - 5.0)
            this.height = abs(bottomRightCorner.y - topLeftCorner.y)
        } else {
            this.height = height
        }
    }

    fun setTopLeftCorner(point: MyPoint) {
        this.topLeftCorner = point
    }

    fun setBottomRightCorner(point: MyPoint) {
        if (bottomRightCorner.x == 0.0 && bottomRightCorner.y == 0.0) {
            this.bottomRightCorner = point
        } else {
            this.bottomRightCorner = point
            recalculateWidthAndHeight()
        }
    }

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


    override fun getArea(): Double {
        recalculateWidthAndHeight()
        return width * height
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        topLeftCorner.movePoint(xDelta, yDelta)
        bottomRightCorner.movePoint(xDelta, yDelta)
    }

}