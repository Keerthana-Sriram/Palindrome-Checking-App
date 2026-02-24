# Palindrome-Checking-App
// this is the sixth use case
// this is also user input program
// it checks using recursion and returns true or false
// Algorithm:
// Base case 1: If the left pointer crosses or meets the right pointer,
// it means all characters have been compared and matched, so it is a palindrome.
// Base case 2: If the characters at the current left and right positions
// do not match, it is not a palindrome.
// Recursive case: If the current characters match,
// recursively call the function for the inner substring
// by moving the pointers inward.