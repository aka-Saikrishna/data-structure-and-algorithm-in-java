<h2><a href="https://www.geeksforgeeks.org/problems/ease-the-array0633/1">Ease the Array</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of integers of size, <strong>N</strong>. Assume ‘0’ as the invalid number and all others as a valid number. Write a program that modifies the array in such a way that if the next number is a valid number and is the same as the current number, double the current number value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end and the sequence of the valid number or new doubled number is maintained as in the original array.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>â€‹Input :</strong> arr[ ] = {2, 2, 0, 4, 0, 8}
<strong>Output :</strong> 4 4 8 0 0 0
<strong>Explanation:
</strong>At index 0 and 1 both the elements are same.
So, we can change the element at index 0 to 
4 and element at index 1 is 0 then we shift 
all the values to the end of the array. 
So, array will become [4, 4, 8, 0, 0, 0].

</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}<strong>
Output :</strong>  4 2 12 8 0 0 0 0 0 0</span></pre>

<p><br>
<br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>modifyAndRearrangeArr()</strong> that takes an array <strong>(arr) </strong>and its size&nbsp;<strong>(n)</strong>, and modifies it in-place.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Zoho</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;