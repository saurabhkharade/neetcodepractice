package com.programmingkeeda.neetcodepractice

class ValidAnagram {

    // Function to check if two strings are anagrams
    fun isAnagram(s: String, t: String): Boolean {
        // Step 1: Check if lengths are equal
        if (s.length != t.length) return false

        // Step 2: Convert both strings to char arrays, sort and compare
        return s.toCharArray().sorted() == t.toCharArray().sorted()
    }
}

// Main function to test the ValidAnagram class
fun main() {
    val validAnagram = ValidAnagram()

    // Test Case 1
    val s1 = "racecar"
    val t1 = "carrace"
    println("Are \"$s1\" and \"$t1\" anagrams? ${validAnagram.isAnagram(s1, t1)}")  // Output: true

    // Test Case 2
    val s2 = "jar"
    val t2 = "jam"
    println("Are \"$s2\" and \"$t2\" anagrams? ${validAnagram.isAnagram(s2, t2)}")  // Output: false
}
