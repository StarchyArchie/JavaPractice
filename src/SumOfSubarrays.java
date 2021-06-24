/**
 * Vishal Nigam
 * 11/12/19
 */
public class SumOfSubarrays {
    public static void main(String[]args){
        /*Given array of integers, find the maximum sum over all subarrays
        ex. [-5, 10, -2, 7] max is 15 from [10, -2, 7] subarray
        1. Precompute sums of all subarrays starting with index 0 {s[k]}
        s[k] = sum(A[0,k]) for all k
        A = [-5, 10, -2, 7]
        s = [-5, 5, 3, 10] (-5, -5+10, -5+10-2, -5+10-2+7)
        2. For each subarray of A, A[i,j]=s[j]-s[i-1]
        3. return max sum
        Time complexity - O(n){1} + O(n^2){2} = O(n^2)
        Space complexity - O(n)
        ******************************************************************
        KEY INSIGHT: Max subarry at ending at index j or max(j) = s[j] - min(s[k]) where k<=j
        1. Traverse original array A from left to right one element at a time
         keeping track of s[j], min, s[k], k<=j max(j)
        2. return max(j)
        Time complexity - O(n)
        Space complexity - O(1)
        A = [-5, 10, -2, 7]
        iteration 1 s[j] = -5, min k<=j s[k] = 0, max(j) = -5 - 0
        iteration 2 s[j] = -5+10 = 5, min k<=j s[k] = 0, max(j) = 5
        repeat until end is reached
        */

    }
}
