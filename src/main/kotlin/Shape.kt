abstract class Shape {
    var point1 = Point()
    var point2 = Point()
    abstract fun getArea(): Double
    abstract fun moveShape(xDelta: Double, yDelta: Double)
}