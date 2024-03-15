public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a + b + carry;
            ListNode n = new ListNode(sum%10);
            p.next = n;
            p = p.next;
            carry = sum/10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (carry != 0) p.next = new ListNode(carry);

        return dummy.next;
    }