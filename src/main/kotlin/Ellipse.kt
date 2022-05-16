class Ellipse() : Shape() {
    var centerPoint = MyPoint()
        private set
    var radius1: Double = 1.0
        private set
    var radius2: Double = 1.0
        private set

    fun setCenterPoint(point: MyPoint) {
        centerPoint = point
    }

    fun setRadius1(radius: Double) {
        if (radius <= 0){
            println("Radius must be greater than 0. Setting radius to 1")
            this.radius1 = 1.0
        } else {
            this.radius1 = radius
        }
    }

    fun setRadius2(radius: Double) {
        if (radius <= 0){
            println("Radius must be greater than 0. Setting radius to 1")
            this.radius2 = 1.0
        } else {
            this.radius2 = radius
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