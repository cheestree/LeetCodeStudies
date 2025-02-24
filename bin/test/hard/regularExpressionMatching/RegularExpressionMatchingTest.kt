package hard.regularExpressionMatching

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RegularExpressionMatchingTest {
    @Test
    fun regularExpressionMatching1(){
        val s = "aa"
        val p = "a"
        val isMatch = isMatch(s, p)
        assertEquals(false, isMatch)
    }

    @Test
    fun regularExpressionMatching2(){
        val s = "aa"
        val p = "a*"
        val isMatch = isMatch(s, p)
        assertEquals(true, isMatch)
    }

    @Test
    fun regularExpressionMatching3(){
        val s = "ab"
        val p = ".*"
        val isMatch = isMatch(s, p)
        assertEquals(true, isMatch)
    }

    @Test
    fun regularExpressionMatching4(){
        val s = "aab"
        val p = "c*a*b"
        val isMatch = isMatch(s, p)
        assertEquals(true, isMatch)
    }

    @Test
    fun regularExpressionMatching5(){
        val s = "abc"
        val p = "a***abc"
        val isMatch = isMatch(s, p)
        assertEquals(true, isMatch)
    }

    @Test
    fun regularExpressionMatching6(){
        val s = "mississippi"
        val p = "mis*is*ip*."
        val isMatch = isMatch(s, p)
        assertEquals(true, isMatch)
    }

    @Test
    fun regularExpressionMatching7(){
        val s = "a"
        val p = "..*"
        val isMatch = isMatch(s, p)
        assertEquals(true, isMatch)
    }

}