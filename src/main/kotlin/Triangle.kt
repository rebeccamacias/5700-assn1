import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(): Shape() {
    var basePoint1 = MyPoint()
        private set
    var basePoint2 = MyPoint()
        private set
    var topPoint = MyPoint()
        private set

    fun setBasePoint1(newPoint: MyPoint) {
        basePoint1 = newPoint
    }

    fun setBasePoint2(newPoint: MyPoint) {
        if (newPoint.x == basePoint1.x && newPoint.y == basePoint1.y) {
            println("The second base point cannot be the same as the first one. Adjusting 2nd base point")
            newPoint.setX(newPoint.x + 1.0)
            newPoint.setY(newPoint.y + 1.0)
        }
        basePoint2 = newPoint
    }

    fun setTopPoint(newPoint: MyPoint) {
        if ((newPoint.x == basePoint1.x && newPoint.x == basePoint2.x) || (newPoint.y == basePoint1.y && newPoint.y == basePoint2.y) || (newPoint.x == basePoint1.x && newPoint.y == basePoint1.y) || (newPoint.x == basePoint2.x && newPoint.y == basePoint2.y)) {
            println("The top point cannot be on the same line as the base point or be equal to another point. Adjusting top point.")
            newPoint.setX(newPoint.x + 5.0)
            newPoint.setY(newPoint.y + 3.0)
        }
        topPoint = newPoint
    }

//    Referenced Geeks For Geeks
//    https://www.geeksforgeeks.org/c-program-find-area-triangle/
    override fun getArea(): Double {
        val b1b2Distance = sqrt(
            (basePoint1.x - basePoint2.x).pow(2.0) + (basePoint1.y - basePoint2.y).pow(2.0)
        )
        val b1topDistance = sqrt(
            (basePoint1.x - topPoint.x).pow(2.0) + (basePoint1.y - topPoint.y).pow(2.0)
        )
        val b2topDistance = sqrt(
            (basePoint2.x - topPoint.x).pow(2.0) + (basePoint2.y - topPoint.y).pow(2.0)
        )
        val s = (b1b2Distance + b1topDistance + b2topDistance) / 2
        val possibleArea = sqrt(s * (s - b1b2Distance) * (s - b1topDistance) * (s - b2topDistance))
        if (possibleArea == 0.0) {
            println("Area cannot be zero. Adjusting top point to produce non-zero area.")
            topPoint.setX(topPoint.x + 2.0)
            topPoint.setY(topPoint.y + 2.0)
            val newB1topDistance = sqrt(
                (basePoint1.x - topPoint.x).pow(2.0) + (basePoint1.y - topPoint.y).pow(2.0)
            )
            val newB2topDistance = sqrt(
                (basePoint2.x - topPoint.x).pow(2.0) + (basePoint2.y - topPoint.y).pow(2.0)
            )
            val newS = (b1b2Distance + newB1topDistance + newB2topDistance) / 2
            return sqrt(newS * (newS - b1b2Distance) * (newS - newB1topDistance) * (newS - newB2topDistance))
        }
        return possibleArea
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        basePoint1.movePoint(xDelta, yDelta)
        basePoint2.movePoint(xDelta, yDelta)
        topPoint.movePoint(xDelta, yDelta)
    }

}