package chalenges

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MedianOfTwoSortedArraysTest {

    @Test
    fun findMedianSortedArrays() {

        assertEquals(2.0, MedianOfTwoSortedArrays().findMedianSortedArrays(intArrayOf(1,3), intArrayOf(2)))

        assertEquals(2.5, MedianOfTwoSortedArrays().findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4)))

        assertEquals(2.5, MedianOfTwoSortedArrays().findMedianSortedArrays(intArrayOf(1,3), intArrayOf(2,7)))


    }
}