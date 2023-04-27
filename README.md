# KotlinPractices Project

This project is to practice some kotlin features, by implementing coding chalenges.

## Chalenges

### MedianOfTwoSortedArrays
**Description**
```
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:

    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -106 <= nums1[i], nums2[i] <= 106
```
Tests:
    [MedianOfTwoSortedArraysTest](src/test/kotlin/chalenges/MedianOfTwoSortedArraysTest.kt)

Resolution:
[MedianOfTwoSortedArrays](src/main/kotlin/chalenges/MedianOfTwoSortedArrays.kt)


*I get this from [LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/description/)*

-------------------------------------------------------------------------------------------------

### ValidateStackSequences
**Description**
```
Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.

Example 1:

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

Example 2:

Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.

Constraints:

    1 <= pushed.length <= 1000
    0 <= pushed[i] <= 1000
    All the elements of pushed are unique.
    popped.length == pushed.length
    popped is a permutation of pushed.
```
Tests:
[ValidateStackSequencesTest](src/test/kotlin/chalenges/ValidateStackSequencesTest.kt)

Resolution:
[ValidateStackSequences](src/main/kotlin/chalenges/ValidateStackSequences.kt)


*I get this from [LeetCode](https://leetcode.com/problems/validate-stack-sequences/description/)*