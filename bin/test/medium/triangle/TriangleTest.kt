package medium.triangle

import kotlin.test.Test
import kotlin.test.assertEquals

class TriangleTest {
    @Test
    fun triangle1(){
        val triangle = listOf(listOf(2),listOf(3,4),listOf(6,5,7), listOf(4,1,8,3))
        val output = minimumTotal(triangle)
        val correctOutput = 11
        assertEquals(correctOutput, output)
    }

    @Test
    fun triangle2(){
        val triangle = listOf(listOf(-10))
        val output = minimumTotal(triangle)
        val correctOutput = -10
        assertEquals(correctOutput, output)
    }
}