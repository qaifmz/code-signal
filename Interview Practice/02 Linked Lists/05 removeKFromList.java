// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) 
{
    if (l == null)
    {
        return l;
    }
    while(l.value == k && l != null)
    {
        l = l.next;
        if (l == null)
            break;
    }
    if (l == null){
        return l;
    }
    ListNode c = l;
    while(c.next != null)
    {
        if ((int)(c.next.value) == k)
        {
            c.next = c.next.next;
        }
        else
        {
            c=c.next;
        }
    }
    return l;
}
