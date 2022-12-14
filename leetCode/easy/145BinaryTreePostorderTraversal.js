/**

  날짜 : 2022.12.02
  난이도 : Easy
  제목 : 145. Binary Tree Postorder Traversal
  URL : https://leetcode.com/problems/binary-tree-postorder-traversal/

*/

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
 var postorderTraversal = function(root) {
  let res = [];
  helper(root, res);
  return res;
};

var helper = function (root, res) {
  if (!root) return;
  helper(root.left, res);
  helper(root.right, res);
  res.push(root.val);
};