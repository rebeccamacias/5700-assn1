import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RectangleTest {

    @Test
    fun getSetTopLeftCorner() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        rectangle.setTopLeftCorner(point1)
        assertEquals(1.0, rectangle.topLeftCorner.x)
        assertEquals(2.0, rectangle.topLeftCorner.y)
    }

    @Test
    fun getSetTopLeftCornerNeg() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(-1.0)
        point1.setY(-2.0)
        rectangle.setTopLeftCorner(point1)
        assertEquals(-1.0, rectangle.topLeftCorner.x)
        assertEquals(-2.0, rectangle.topLeftCorner.y)
    }

    @Test
    fun getSetTopLeftCornerZero() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        rectangle.setTopLeftCorner(point1)
        assertEquals(0.0, rectangle.topLeftCorner.x)
        assertEquals(0.0, rectangle.topLeftCorner.y)
    }

    @Test
    fun getSetBottomRightCorner() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        rectangle.setBottomRightCorner(point1)
        assertEquals(1.0, rectangle.bottomRightCorner.x)
        assertEquals(2.0, rectangle.bottomRightCorner.y)
    }

    @Test
    fun getSetBottomRightCornerNeg() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(-3.0)
        point1.setY(-4.0)
        rectangle.setBottomRightCorner(point1)
        assertEquals(-3.0, rectangle.bottomRightCorner.x)
        assertEquals(-4.0, rectangle.bottomRightCorner.y)
    }

    @Test
    fun getSetBottomRightCornerZero() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(0.0)
        point2.setY(0.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        assertEquals(0.0, rectangle.bottomRightCorner.x)
        assertEquals(0.0, rectangle.bottomRightCorner.y)
    }

    @Test
    fun getWidth() {
        val rectangle = Rectangle()
        val point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(4.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        assertEquals(2.0, rectangle.getWidth())
    }

    @Test
    fun tryZeroWidth() {
        val rectangle = Rectangle()
        val point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(1.0)
        point2.setY(7.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        assertEquals(1.0, rectangle.getWidth()) //width cannot be 0
    }

    @Test
    fun getHeight() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(5.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        assertEquals(3.0, rectangle.getHeight())
    }

    @Test
    fun setZeroHeight() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(2.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        assertEquals(1.0, rectangle.getHeight()) //height cannot be 0
    }

    @Test
    fun getArea() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(5.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        assertEquals(6.0, rectangle.getArea())
    }

    @Test
    fun getAreaWithNegs() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(-1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(-3.0)
        point2.setY(5.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        assertEquals(6.0, rectangle.getArea())
    }

    @Test
    fun moveShape() {
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(5.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        rectangle.moveShape(3.0, 4.0)
        assertEquals(4.0, rectangle.topLeftCorner.x)
        assertEquals(6.0, rectangle.topLeftCorner.y)
        assertEquals(6.0, rectangle.bottomRightCorner.x)
        assertEquals(9.0, rectangle.bottomRightCorner.y)
    }

    @Test
    fun moveShapeNegDelta(){
        var rectangle = Rectangle()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(5.0)
        rectangle.setTopLeftCorner(point1)
        rectangle.setBottomRightCorner(point2)
        rectangle.moveShape(-3.0, -4.0)
        assertEquals(-2.0, rectangle.topLeftCorner.x)
        assertEquals(-2.0, rectangle.topLeftCorner.y)
        assertEquals(0.0, rectangle.bottomRightCorner.x)
        assertEquals(1.0, rectangle.bottomRightCorner.y)
    }
}