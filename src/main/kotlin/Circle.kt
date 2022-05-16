import kotlin.math.abs

class Circle: Shape() {
    var centerPoint = MyPoint()
        private set
    var radius1: Double = Double.NEGATIVE_INFINITY
        private set
    var radius2: Double = Double.NEGATIVE_INFINITY
        private set

    fun setCenterPoint(point: MyPoint) {
        centerPoint = point
    }

    fun setRadius1(radius: Double) {
        if (radius == 0.0 || (radius != radius2 && radius2 != Double.NEGATIVE_INFINITY)) {
            println("Radius cannot be 0 and must be equal to radius 2. Setting radius equal to radius 2")
            this.radius1 = radius2
        } else {
            if (radius < 0) {
                println("Radius cannot be negative. Using absolute value of passed in radius")
            }
            this.radius1 = abs(radius)
        }
    }

    fun setRadius2(radius: Double) {
        if (radius == 0.0 || (radius != radius1 && radius1 != Double.NEGATIVE_INFINITY)){
            println("Radius cannot be 0 and must be equal to radius 1. Setting radius equal to radius 2")
            this.radius2 = radius1
        } else {
            if (radius < 0) {
                println("Radius cannot be negative. Using absolute value of passed in radius")
            }
            this.radius2 = abs(radius)
        }
    }

    override fun getArea(): Double {
        return Math.PI * radius1 * radius2
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        centerPoint.setX(centerPoint.x + xDelta)
        centerPoint.setY(centerPoint.y + yDelta)
    }
}