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
        if (givenPoint2 == null) {
            this.givenPoint2 = null
            return
        }
        if (givenPoint2!!.x == this.givenPoint1.x && givenPoint2!!.y == this.givenPoint1.y) {
            println(
                "Error: givenPoint2 cannot be the same as givenPoint1. " +
                "Setting to automatic value (givenPoint1.x + 1.0, givenPoint1.y + 1.0)"
            )
            var autoPoint = MyPoint()
            autoPoint.setX(this.givenPoint1.x + 1.0)
            autoPoint.setY(this.givenPoint1.y + 1.0)
            this.givenPoint2 = autoPoint
        } else {
            this.givenPoint2 = givenPoint2
        }
    }

}