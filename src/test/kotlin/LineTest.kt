import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class LineTest {

    @Test
    fun getAreaInLine() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(0.0)
        point2.setY(1.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(1.0, line.getArea())
    }

    @Test
    fun getAreaDiag(){
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(1.0)
        point2.setY(1.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(1.4142135623730951, line.getArea())
    }

    @Test
    fun getAreaNegDiag(){
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(-1.0)
        point2.setY(1.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(1.4142135623730951, line.getArea())
    }

    @Test
    fun getAreaWithNullPt2() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = null
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(0.0, line.getArea())
    }

    @Test
    fun getPoints() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(1.0)
        point2.setY(1.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(2, line.getPoints().size)
        assertEquals(0.0, line.getPoints()[0].x)
        assertEquals(0.0, line.getPoints()[0].y)
        assertEquals(1.0, line.getPoints()[1].x)
        assertEquals(1.0, line.getPoints()[1].y)
    }

    @Test
    fun getPointsWithNullPt2() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = null
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(1, line.getPoints().size)
        assertEquals(0.0, line.getPoints()[0].x)
        assertEquals(0.0, line.getPoints()[0].y)
        assertThrows(IndexOutOfBoundsException::class.java) {
            line.getPoints()[1]
        }
    }

    @Test
    fun moveShape() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(1.0)
        point2.setY(1.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        line.moveShape(1.0, 1.0)
        assertEquals(1.0, line.getPoints()[0].x)
        assertEquals(1.0, line.getPoints()[0].y)
        assertEquals(2.0, line.getPoints()[1].x)
        assertEquals(2.0, line.getPoints()[1].y)
    }

    @Test
    fun moveShapeWithNullPt2() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(null)
        line.moveShape(1.0, 2.0)
        assertEquals(1.0, line.getPoints()[0].x)
        assertEquals(2.0, line.getPoints()[0].y)
        assertThrows(java.lang.IndexOutOfBoundsException::class.java) {
            line.getPoints()[1]
        }
    }

    @Test
    fun getPosSlope() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(1.0)
        point2.setY(1.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun getNegSlope() {
        var point1 = MyPoint()
        point1.setX(0.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(-1.0)
        point2.setY(7.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(-7.0, line.getSlope())
    }

    @Test
    fun getZeroSlope() {
        var point1 = MyPoint()
        point1.setX(7.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(0.0)
        point2.setY(0.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        assertEquals(0.0, line.getSlope())
    }

    @Test
    fun getSlopeWithNullPt2() {
        var point1 = MyPoint()
        point1.setX(7.0)
        point1.setY(0.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(null)
        assertEquals(0.0, line.getSlope())
    }

    @Test
    fun getSetPoint1() {
        var point1 = MyPoint()
        point1.setX(7.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(0.0)
        point2.setY(0.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(null)
        var point3 = MyPoint()
        point3.setX(1.0)
        point3.setY(1.0)
        line.setGivenPoint1(point3)
        assertEquals(1.0, line.givenPoint1.x)
        assertEquals(1.0, line.givenPoint1.y)
    }

    @Test
    fun getSetGivenPoint1WithNullPoint2() {
        var point1 = MyPoint()
        point1.setX(7.0)
        point1.setY(0.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(null)
        var point3 = MyPoint()
        point3.setX(1.0)
        point3.setY(1.0)
        line.setGivenPoint1(point3)
        assertEquals(1.0, line.givenPoint1.x)
        assertEquals(1.0, line.givenPoint1.y)
    }

    @Test
    fun getSetGivenPoint2() {
        var point1 = MyPoint()
        point1.setX(7.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(0.0)
        point2.setY(0.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(point2)
        var point3 = MyPoint()
        point3.setX(1.0)
        point3.setY(1.0)
        line.setGivenPoint2(point3)
        assertNotNull(line.givenPoint2)
    }

    @Test
    fun getSetGivenPoint2WithNullPoint2() {
        var point1 = MyPoint()
        point1.setX(7.0)
        point1.setY(0.0)
        var point2 = MyPoint()
        point2.setX(0.0)
        point2.setY(0.0)
        var line = Line()
        line.setGivenPoint1(point1)
        line.setGivenPoint2(null)
        assertNull(line.givenPoint2)
    }
}