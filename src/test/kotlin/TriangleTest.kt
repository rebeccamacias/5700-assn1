import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TriangleTest {
    @Test
    fun getSetBasePoint1() {
        val point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var triangle = Triangle()
        triangle.setBasePoint1(point1)
        assertEquals(0.0, triangle.basePoint1.x)
        assertEquals(0.0, triangle.basePoint1.y)
    }

    @Test
    fun getSetBasePoint2() {
        val point = MyPoint()
        point.setX(4.0)
        point.setY(0.0)
        val triangle = Triangle()
        triangle.setBasePoint2(point)
        assertEquals(4.0, triangle.basePoint2.x)
        assertEquals(0.0, triangle.basePoint2.y)
    }

    @Test
    fun getSetTopPoint() {
        val point = MyPoint()
        point.setX(-3.0)
        point.setY(2.0)
        val triangle = Triangle()
        triangle.setTopPoint(point)
        assertEquals(-3.0, triangle.topPoint.x)
        assertEquals(2.0, triangle.topPoint.y)
    }


    @Test
    fun getAreaPos() { //right triangle
        val point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        val point2 = MyPoint()
        point2.setX(4.0)
        point2.setY(0.0)
        val point3 = MyPoint()
        point3.setX(4.0)
        point3.setY(2.0)
        val triangle = Triangle()
        triangle.setBasePoint1(point1)
        triangle.setBasePoint2(point2)
        triangle.setTopPoint(point3)
        assertEquals(4.0, triangle.getArea())
    }

    @Test
    fun getAreaNeg() { //right triangle
        val point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        val point2 = MyPoint()
        point2.setX(-4.0)
        point2.setY(0.0)
        val point3 = MyPoint()
        point3.setX(-4.0)
        point3.setY(2.0)
        val triangle = Triangle()
        triangle.setBasePoint1(point1)
        triangle.setBasePoint2(point2)
        triangle.setTopPoint(point3)
        assertEquals(4.0, triangle.getArea())
    }

    @Test
    fun getAreaScalene() {
        val point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        val point2 = MyPoint()
        point2.setX(-5.0)
        point2.setY(0.0)
        val point3 = MyPoint()
        point3.setX(-2.0)
        point3.setY(2.0)
        val triangle = Triangle()
        triangle.setBasePoint1(point1)
        triangle.setBasePoint2(point2)
        triangle.setTopPoint(point3)
        assertEquals(5.0, triangle.getArea())
    }

    @Test
    fun getZeroArea() {
        val point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        val point2 = MyPoint()
        point2.setX(0.0)
        point2.setY(0.0)
        val point3 = MyPoint()
        point3.setX(0.0)
        point3.setY(0.0)
        val triangle = Triangle()
        triangle.setBasePoint1(point1)
        triangle.setBasePoint2(point2)
        triangle.setTopPoint(point3)
        assertNotEquals(0.0, triangle.getArea())
    }

    @Test
    fun moveShape() {
        val point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        val point2 = MyPoint()
        point2.setX(-5.0)
        point2.setY(0.0)
        val point3 = MyPoint()
        point3.setX(-2.0)
        point3.setY(2.0)
        val triangle = Triangle()
        triangle.setBasePoint1(point1)
        triangle.setBasePoint2(point2)
        triangle.setTopPoint(point3)
        triangle.moveShape(1.0, -1.0)
        assertEquals(1.0, triangle.basePoint1.x)
        assertEquals(-1.0, triangle.basePoint1.y)
        assertEquals(-4.0, triangle.basePoint2.x)
        assertEquals(-1.0, triangle.basePoint2.y)
        assertEquals(-1.0, triangle.topPoint.x)
        assertEquals(1.0, triangle.topPoint.y)
    }
}