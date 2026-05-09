# 📌 Problem: Rotated Digits

## 📝 Problem Statement
An integer `x` is a **good number** if after rotating each digit individually by 180 degrees, we get a valid number that is **different from x**.

Each digit must be rotated — we cannot leave it unchanged.

A number is valid if each digit remains a digit after rotation:

- 0, 1, 8 → remain same  
- 2 ↔ 5 (interchange)  
- 6 ↔ 9 (interchange)  
- 3, 4, 7 → invalid  

Return the number of good integers in the range `[1, n]`.

---

## 📥 Example 1
Input:
n = 10

Output:
4

Explanation:
Good numbers → 2, 5, 6, 9

---

## 📥 Example 2
Input:
n = 1

Output:
0

---

## 📥 Example 3
Input:
n = 2

Output:
1

---

## ⚙️ Constraints
- 1 <= n <= 10^4

---

## 🧠 My Understanding
- Check each number from 1 to n
- For each digit:
  - If digit is invalid → reject number
  - If digit changes (2,5,6,9) → mark as "good"
- Number is good if:
  - All digits are valid ✅
  - At least one digit changes 🔥

---

## 💡 Approach
1. Iterate from 1 → n  
2. Extract digits one by one  
3. Check:
   - Invalid digits → skip  
   - Changed digits → mark flag  
4. Count numbers where flag is true  

---

## ⏱️ Complexity
- Time: O(n * digits)
- Space: O(1)

---

## 🔗 Problem Link
👉 https://leetcode.com/problems/rotated-digits/description/?envType=daily-question&envId=2026-05-02
