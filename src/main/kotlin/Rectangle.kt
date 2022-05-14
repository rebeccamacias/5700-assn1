import kotlin.math.abs

open class Rectangle(private var topLeftCorner: MyPoint, private var bottomRightCorner: MyPoint ): Shape() {
    private val width: Double = abs(bottomRightCorner.getX() - topLeftCorner.getX())
    private val height: Double = abs(bottomRightCorner.getY() - topLeftCorner.getY())

    fun getWidth(): Double {
        return width
    }

    fun getHeight(): Double {
        return height
    }

    override fun getArea(): Double {
        return width * height
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        topLeftCorner.movePoint(xDelta, yDelta)
        bottomRightCorner.movePoint(xDelta, yDelta)
    }
}