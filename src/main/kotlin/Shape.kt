abstract class Shape {
    var point1 = MyPoint()
    var point2 = MyPoint()
    abstract fun getArea(): Double
    abstract fun moveShape(xDelta: Double, yDelta: Double)
}