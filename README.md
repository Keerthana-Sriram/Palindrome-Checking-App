# Palindrome-Checking-App
// this is the sixth use case
// this is also user input program
// it checks using linked list datastructure approach and returns true or false
// Algorithm:
//Return true if the list is empty or has only one node, since such lists are palindromes by default.
//Use two pointers ‘slow’ and ‘fast’ to find the middle node, where slow moves one step and fast moves two steps at a time.
//Reverse the second half of the linked list starting from the node after the middle (slow->next), preparing it for comparison.
//Set two pointers: one at the head of the list and the other at the head of the reversed second half, to compare both halves.
//Compare both halves node by node; if any mismatch occurs, return false, otherwise continue till the end of either list.
//Reverse the second half again to restore the original list structure, and return true if all nodes matched successfully.

// accordingly, the output is printed.