import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EllipseTest {

    @Test
    fun getSetCenterPoint() {
        val point = MyPoint()
        point.setX(0.0)
        point.setY(0.0)
        val ellipse = Ellipse()
        ellipse.setCenterPoint(point)
        assertEquals(0.0, ellipse.centerPoint.x)
        assertEquals(0.0, ellipse.centerPoint.y)
    }

    @Test
    fun getSetRadius1() {
        val radius1 = 1.0
        val ellipse = Ellipse()
        ellipse.setRadius1(radius1)
        assertEquals(1.0, ellipse.radius1)
    }

    @Test
    fun getSetRadius2() {
        val radius2 = 2.0
        val ellipse = Ellipse()
        ellipse.setRadius2(radius2)
        assertEquals(2.0, ellipse.radius2)
    }

    @Test
    fun getArea() {
        val radius1 = 1.0
        val radius2 = 2.0
        val ellipse = Ellipse()
        ellipse.setRadius1(radius1)
        ellipse.setRadius2(radius2)
        assertEquals(Math.PI * radius1 * radius2, ellipse.getArea())
    }

    @Test
    fun getAreaOneZero() {
        val radius1 = 0.0
        val radius2 = 2.0
        val ellipse = Ellipse()
        ellipse.setRadius1(radius1)
        ellipse.setRadius2(radius2)
        assertNotEquals(0.0, ellipse.getArea())
    }

    @Test
    fun getAreaBothZeros() {
        val radius1 = 0.0
        val radius2 = 0.0
        val ellipse = Ellipse()
        ellipse.setRadius1(radius1)
        ellipse.setRadius2(radius2)
        assertNotEquals(0.0, ellipse.getArea())
    }

    @Test
    fun moveShape() {
        val point = MyPoint()
        point.setX(0.0)
        point.setY(0.0)
        val ellipse = Ellipse()
        ellipse.setCenterPoint(point)
        ellipse.moveShape(1.0, 1.0)
        assertEquals(1.0, ellipse.centerPoint.x)
        assertEquals(1.0, ellipse.centerPoint.y)
    }
}