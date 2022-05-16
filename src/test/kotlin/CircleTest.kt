import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CircleTest {

    @Test
    fun getSetCenterPoint() {
        val point = MyPoint()
        point.setX(0.0)
        point.setY(0.0)
        val circle = Circle()
        circle.setCenterPoint(point)
        assertEquals(0.0, circle.centerPoint.x)
        assertEquals(0.0, circle.centerPoint.y)
    }

    @Test
    fun getSetRadius1() {
        val circle = Circle()
        val radius = 1.0
        circle.setRadius1(radius)
        assertEquals(1.0, circle.radius1)
    }

    @Test
    fun getSetRadius2() {
        val circle = Circle()
        val radius = -7.0
        circle.setRadius2(radius)
        assertEquals(7.0, circle.radius2)
    }

    @Test
    fun getArea() {
        val circle = Circle()
        circle.setRadius1(1.0)
        circle.setRadius2(2.0)
        assertEquals(Math.PI, circle.getArea())
    }

    @Test
    fun moveShape() {
        val circle = Circle()
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        circle.setRadius1(1.0)
        circle.setRadius2(2.0)
        circle.setCenterPoint(point)
        circle.moveShape(1.0, 1.0)
        assertEquals(2.0, circle.centerPoint.x)
        assertEquals(3.0, circle.centerPoint.y)
    }
}