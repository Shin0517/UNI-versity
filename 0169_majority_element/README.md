# [169. Majority Element](https://leetcode.com/problems/majority-element/description/)

Given an array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

**Example 1:** 

```
Input: nums = [3,2,3]
Output: 3
```

**Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

**Constraints:** 

- `n == nums.length`
- `1 <= n <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`

**Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

-----
## Python Solution
>解法:   
Sorting -- 最直覺的解法，透過排序找出眾數
Moore Voting -- 要

### 學習重點:
1. `sort()`/`sorted()` 比較
2. Big-O notation 複習

### `sort()`/`sorted()` 比較
**異:**  
- `sort()`會直接**覆蓋掉**原有列表，且只能作用於list  
- `sorted()`**保留**原有列表，並以其為基礎進行排列，可作用於iterable  

**同:**  
- 皆有兩個可選參數，`key`(default: None) 以及`reverse`(default: false)


### Big-O notation 複習 <sub>(效率由高到低)</sub>
- O(1)
- O(logN)
- O(N)
- O(N logN)
- O(N<sup>2</sup>)
- O(2<sup>n</sup>)
- O(N!)
