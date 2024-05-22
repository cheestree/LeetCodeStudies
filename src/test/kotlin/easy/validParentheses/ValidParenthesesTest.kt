package easy.validParentheses

import kotlin.test.Test
import kotlin.test.assertEquals

class ValidParenthesesTest {
    @Test
    fun isParentheses1(){
        val str = "()"
        val output = isValid(str)
        val correctOutput = true
        assertEquals(correctOutput, output)
    }

    @Test
    fun isParentheses2(){
        val str = "()[]{}"
        val output = isValid(str)
        val correctOutput = true
        assertEquals(correctOutput, output)
    }

    @Test
    fun isParentheses3(){
        val str = "(]"
        val output = isValid(str)
        val correctOutput = false
        assertEquals(correctOutput, output)
    }

    @Test
    fun isParentheses4(){
        val str = "([)]"
        val output = isValid(str)
        val correctOutput = false
        assertEquals(correctOutput, output)
    }
}