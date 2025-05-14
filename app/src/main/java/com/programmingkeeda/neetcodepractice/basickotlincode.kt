package com.programmingkeeda.neetcodepractice

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = HashSet<Int>()
    for (num in nums) {
        if (!seen.add(num)) {
            return true // Duplicate found
        }
    }
    return false // No duplicates
}
fun main() {
    val nums1 = intArrayOf(1, 2, 3, 3)
    println(containsDuplicate(nums1)) // Output: true

    val nums2 = intArrayOf(1, 2, 3, 4)
    println(containsDuplicate(nums2)) // Output: false
}
