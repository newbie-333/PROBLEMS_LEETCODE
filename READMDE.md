***********************************
        LEETCODE PROBLEMS
***********************************
PROBLEM_1 (EASY). You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 
Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.

**MENTAL SOLUTION (NO CODING)

1. First thing to do is get the lenght for each String.
2. We can see also that problem says that if one of the string is longer we will have to append the aditional letters to the end of the merged string.
3. before that we need to merge the letters of each string (letter1 String1 + letter1 String2), we will try the class String builder with the metod appends, i think that will work.

***PROBLEM_1.SOLVED***

PROBLEM_2(EASY): For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 
Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.

1. The first thing I noticed is that this problem is a simple devision betwen two caracthers, its obvious but 
is the same as dividing ABCABC/ABC, if we treat ABC as an integer we would see something like this x^2/x, the result of that is x. 
So the first thing we doing is trying to substract the sequence that repeats in str1.

2.when we get that we gonna try to save that sequence in to a variable and se how many times it repeats

(MOORE TMR, IM GONNA SLEEP)