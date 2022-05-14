class MyPoint () {
    var x: Double = 0.0
    private set
    var y: Double = 0.0
    private set

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