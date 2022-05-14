import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MyPointTest {
    @Test
    fun testPosGetSet() {
        // Ensure Getters & Setters work for positive values
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        assertEquals(1.0, point.x)
        assertEquals(2.0, point.y)
    }

    @Test
    fun testNegGetSet() {
        // Ensure Getters & Setters work for negative values
        val point = MyPoint()
        point.setX(-1.0)
        point.setY(-2.0)
        assertEquals(-1.0, point.x)
        assertEquals(-2.0, point.y)
    }

    @Test
    fun testMovePointPos() {
        //Ensure movePoint works in the positive direction
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        point.movePoint(1.0, 1.0)
        assertEquals(2.0, point.x)
        assertEquals(3.0, point.y)
    }

    @Test
    fun testMovePointNeg() {
        //Ensure movePoint works in the negative direction
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        point.movePoint(-2.0, -4.0)
        assertEquals(-1.0, point.x)
        assertEquals(-2.0, point.y)
    }

    @Test
    fun testMovePointZero() {
        //Ensure movePoint works in the zero direction
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        point.movePoint(0.0, 0.0)
        assertEquals(1.0, point.x)
        assertEquals(2.0, point.y)
    }

    @Test
    fun testMovePointNegZero() {
        //Ensure movePoint works in the negative zero direction
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        point.movePoint(-0.0, -0.0)
        assertEquals(1.0, point.x)
        assertEquals(2.0, point.y)
    }

    @Test
    fun testMovePointNegPos() {
        //Ensure movePoint works in the negative positive direction
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        point.movePoint(-1.0, 1.0)
        assertEquals(0.0, point.x)
        assertEquals(3.0, point.y)
    }

    @Test
    fun testMovePointPosNeg() {
        //Ensure movePoint works in the positive negative direction
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        point.movePoint(1.0, -1.0)
        assertEquals(2.0, point.x)
        assertEquals(1.0, point.y)
    }

    @Test
    fun testClonePoint() {
        //Ensure clonePoint works
        val point = MyPoint()
        point.setX(1.0)
        point.setY(2.0)
        val point2 = point.clonePoint()
        assertEquals(1.0, point2.x)
        assertEquals(2.0, point2.y)
    }

}