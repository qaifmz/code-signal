// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) 
{
    ListNode slow = l;
  ListNode fast = l;
  ListNode next = l;
  if (l == null) {
    return true;
  }
  ListNode prev = null, half;
  while(fast.next != null && fast.next.next != null) {
    slow = slow.next;
    fast = fast.next.next;
  }
  half = slow;
  slow = slow.next;
  while(slow != null) {
    next = slow.next;
    slow.next = prev;
    prev = slow;
    slow = next;
  }
  half.next = null;
  while(l != null && prev != null && l.value.equals(prev.value)) {
    l = l.next;
    prev = prev.next;
  }
  if (l != null && prev != null) {
    return false;
  }
  else
    return true;
}
