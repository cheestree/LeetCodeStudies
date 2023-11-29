package letterTilePossibilities

import kotlin.test.Test
import kotlin.test.assertEquals

class LetterTilePossibilitiesTest {
    @Test
    fun numTilePossibilities1(){
        val str = "AAB"
        val output = numTilePossibilities(str)
        val correctOutput = 8
        assertEquals(correctOutput, output)
    }

    @Test
    fun numTilePossibilities2(){
        val str = "AAABBC"
        val output = numTilePossibilities(str)
        val correctOutput = 188
        assertEquals(correctOutput, output)
    }
}