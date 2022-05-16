abstract class Shape {
    open var point1 = MyPoint()
    open var point2 = MyPoint()
    abstract fun getArea(): Double
    abstract fun moveShape(xDelta: Double, yDelta: Double)
}