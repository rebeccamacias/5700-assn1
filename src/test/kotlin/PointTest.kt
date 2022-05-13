import org.junit.jupiter.api.Assertions.*

internal class PointTest {
    @org.junit.jupiter.api.Test
    fun test() {
        val point = Point()
        point.setX(1.0)
        point.setY(2.0)
        assertEquals(1.0, point.getX())
        assertEquals(2.0, point.getY())
    }
}