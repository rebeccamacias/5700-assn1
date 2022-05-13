import kotlin.math.pow
import kotlin.math.sqrt

class Line(point1: Point, point2: Point): Shape() {
    override fun getArea(): Double {
        return sqrt(
            (point1.getX() - point2.getX()).toDouble().pow(2.0) + (point1.getY() - point2.getY()).toDouble().pow(2.0)
        )
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        point1.movePoint(xDelta, yDelta)
        point2.movePoint(xDelta, yDelta)
    }

    fun getPoints(): List<Point> {
        return listOf(point1, point2)
    }

}