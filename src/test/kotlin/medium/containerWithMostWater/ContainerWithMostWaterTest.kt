package medium.containerWithMostWater

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainerWithMostWaterTest {
    @Test
    fun maxArea1(){
        val height = intArrayOf(1,8,6,2,5,4,8,3,7)
        val output = maxArea(height)
        val correctOutput = 49
        assertEquals(correctOutput, output)
    }

    @Test
    fun maxArea2(){
        val height = intArrayOf(1,1)
        val output = maxArea(height)
        val correctOutput = 1
        assertEquals(correctOutput, output)
    }
}