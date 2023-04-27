package chalenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidateStackSequencesTest{

    @Test
    fun testingAValidInput(){
        assertTrue(ValidateStackSequences().validateStackSequences(intArrayOf(1,2,3,4,5),intArrayOf(4,5,3,2,1) ))
    }

    @Test
    fun testingAInvalidInput(){
        assertFalse(ValidateStackSequences().validateStackSequences(intArrayOf(1,2,3,4,5),intArrayOf(4,3,5,1,2) ))
    }
}