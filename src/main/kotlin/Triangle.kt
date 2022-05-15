import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(): Shape() {
    var basePoint1 = MyPoint()
    var basePoint2 = MyPoint()
    var topPoint = MyPoint()
    var base: Double = sqrt(
        (basePoint1.x - basePoint2!!.x).pow(2.0) + (basePoint1.y - basePoint2!!.y).pow(2.0)
    )
    override fun getArea(): Double {
//        return abs(0.5 * base * height)
        return 1.0
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        TODO("Not yet implemented")
    }

}