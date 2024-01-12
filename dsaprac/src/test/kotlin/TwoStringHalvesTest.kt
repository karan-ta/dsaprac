import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

//Leetcode 1704
class TwoStringHalvesTest {
    @org.junit.jupiter.api.Test
    fun testUnequalLengths() {
        Assertions.assertEquals(TwoStringHalves().isStringHalvesAlike("Books"),false)
    }

    @Test
    fun alikeHalves() {
        Assertions.assertEquals(TwoStringHalves().isStringHalvesAlike("Book"),true)
    }
    @Test
    fun unlikeHalves() {
        Assertions.assertEquals(TwoStringHalves().isStringHalvesAlike("textbook"),false)
    }

}