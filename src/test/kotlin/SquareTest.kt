import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertDoesNotThrow

internal class SquareTest {

    @Test
    fun getSetTopLeftCorner() {
        var square = Square()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        square.setTopLeftCorner(point1)
        assertEquals(1.0, square.topLeftCorner.x)
        assertEquals(2.0, square.topLeftCorner.y)
    }

    @Test
    fun getSetBottomRightCorner() {
        var square = Square()
        var point1 = MyPoint()
        point1.setX(-3.0)
        point1.setY(2.0)
        square.setBottomRightCorner(point1)
        assertEquals(-3.0, square.bottomRightCorner.x)
        assertEquals(2.0, square.bottomRightCorner.y)
    }


    @Test
    fun setTopLeftCorner() {
        var square = Square()
        var point1 = MyPoint()
        point1.setX(1.0)
        point1.setY(2.0)
        square.setTopLeftCorner(point1)
        assertEquals(1.0, square.topLeftCorner.x)
        assertEquals(2.0, square.topLeftCorner.y)
    }

    @Test
    fun setBottomRightCorner() {
        var square = Square()
        var point1 = MyPoint()
        point1.setX(-3.0)
        point1.setY(2.0)
        square.setBottomRightCorner(point1)
        assertEquals(-3.0, square.bottomRightCorner.x)
        assertEquals(2.0, square.bottomRightCorner.y)
    }

    @Test
    fun getArea() {
        var square = Square()
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(3.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(0.0)
        square.setTopLeftCorner(point1)
        square.setBottomRightCorner(point2)
        assertEquals(9.0, square.getArea())
    }

    @Test
    fun moveShape() {
        var square = Square()
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(3.0)
        var point2 = MyPoint()
        point2.setX(3.0)
        point2.setY(0.0)
        square.setTopLeftCorner(point1)
        square.setBottomRightCorner(point2)
        square.moveShape(1.0, 1.0)
        assertEquals(1.0,square.topLeftCorner.x)
        assertEquals(4.0, square.topLeftCorner.y)
        assertEquals(4.0, square.bottomRightCorner.x)
        assertEquals(1.0, square.bottomRightCorner.y)
    }
}