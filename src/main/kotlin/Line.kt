import kotlin.math.pow
import kotlin.math.sqrt

class Line(private var givenPoint1: MyPoint, private var givenPoint2: MyPoint?): Shape() {
    override fun getArea(): Double {
        if (givenPoint2 == null) {
            return 0.0
        }
        return sqrt(
            (givenPoint1.getX() - givenPoint2!!.getX()).pow(2.0) + (givenPoint1.getY() - givenPoint2!!.getY()).pow(2.0)
        )
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        givenPoint1.movePoint(xDelta, yDelta)
        if (givenPoint2 != null) {
            givenPoint2!!.movePoint(xDelta, yDelta)
        }
    }

    fun getPoints(): List<MyPoint> {
        if (givenPoint2 == null) {
            return listOf(givenPoint1)
        }
        return listOf(givenPoint1, givenPoint2!!)
    }

    fun getSlope() : Double {
        if (givenPoint2 == null) {
            return 0.0
        }
        return (givenPoint1.getY() - givenPoint2!!.getY()) / (givenPoint1.getX() - givenPoint2!!.getX())
    }

    fun getGivenPoint1(): MyPoint {
        return givenPoint1
    }

    fun getGivenPoint2(): MyPoint? {
        return givenPoint2
    }

    fun setGivenPoint1(givenPoint1: MyPoint) {
        this.givenPoint1 = givenPoint1
    }

    fun setGivenPoint2(givenPoint2: MyPoint?) {
        this.givenPoint2 = givenPoint2
    }

}