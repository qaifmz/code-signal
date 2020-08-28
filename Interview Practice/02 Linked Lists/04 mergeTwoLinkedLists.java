// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    ListNode temp=l1,currentNode,nextNode;
    int tempValue;
    if(l1 ==null && l2 ==null)
    {
        return   null;
    }
    else 
    {
        if(temp!=null)
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
        }
        else
        {
            if(temp==null)
                l1=l2;
            else
                temp=l2;
        }
        if(temp!=null)
            temp.next = l2;
        currentNode=l1;
        while(currentNode!=null)
        {
            nextNode=currentNode.next;
            while(nextNode!=null)
            {
                if((Integer)currentNode.value > (Integer)nextNode.value)
                {
                    tempValue=(Integer)currentNode.value;
                    currentNode.value=nextNode.value;
                    nextNode.value=tempValue;
                }
                nextNode=nextNode.next;
            }
            currentNode=currentNode.next;
        }
    }
    return l1;
}
