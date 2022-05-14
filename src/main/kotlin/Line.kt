import kotlin.math.pow
import kotlin.math.sqrt

class Line(): Shape() {
    var givenPoint1 = MyPoint()
    private set
    var givenPoint2: MyPoint? = null
    private set
    override fun getArea(): Double {
        if (givenPoint2 == null) {
            return 0.0
        }
        return sqrt(
            (givenPoint1.x - givenPoint2!!.x).pow(2.0) + (givenPoint1.y - givenPoint2!!.y).pow(2.0)
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
        return (givenPoint1.y - givenPoint2!!.y) / (givenPoint1.x - givenPoint2!!.x)
    }

    fun setGivenPoint1(givenPoint1: MyPoint) {
        this.givenPoint1 = givenPoint1
    }

    fun setGivenPoint2(givenPoint2: MyPoint?) {
        if (this.givenPoint2 == givenPoint1) {
            throw IllegalArgumentException("Points cannot be the same")
        } else {
            this.givenPoint2 = givenPoint2
        }
    }

}