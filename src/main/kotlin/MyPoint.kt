class MyPoint () {
    private var x: Double = 0.0
    private var y: Double = 0.0

    fun getX(): Double {
        return x
    }
    fun getY(): Double {
        return y
    }
    fun setX(x: Double) {
        this.x = x
    }
    fun setY(y: Double) {
        this.y = y
    }
    fun clonePoint(): MyPoint {
        val newPoint = MyPoint()
        newPoint.setX(this.x)
        newPoint.setY(this.y)
        return newPoint
    }
    fun movePoint(xDelta: Double, yDelta: Double) {
        x += xDelta
        y += yDelta
    }
}