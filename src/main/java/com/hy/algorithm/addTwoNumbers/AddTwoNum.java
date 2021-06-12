package com.hy.algorithm.addTwoNumbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Hero
 * @version 1.0.0
 * @description TODO
 * @date 2021-6-12 0:01
 */
public class AddTwoNum {
  /*  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> s1 = new LinkedBlockingQueue<>();
        Queue<Integer> s2 = new LinkedBlockingQueue();
        ListNode node1 = l1;
        ListNode node2 = l2;

       while(node1!=null){
          s1.add(node1.val);
           node1 = node1.next;
       }
        while(node2 !=null){
            s2.add(node2.val);
            node2 = node2.next;
        }

        int max = Math.max(s1.size() , s2.size());

        Long val = 0L;
        for(int i = 0 ; i < max ; i++){
            Integer v1 = s1.size() <=0 ? 0: s1.poll();
            Integer v2 = s2.size() <=0 ? 0:  s2.poll();
            val += Double.valueOf((v1==null ? 0 : v1 + (v2==null ? 0 : v2)) * Math.pow(10 , i)).longValue();
        }

        Long temp =val;  //0

       // System.out.println("val::" + val);
        if(val == 0 ){
            return new ListNode(0);
        }
        Queue<Integer> q = new LinkedBlockingDeque<>();
        while( temp > 0 ){
            Long a = temp % 10;
            Long b = temp / 10;
            q.add(Integer.valueOf(a+""));
            temp = b ;

        }

        Integer temp2;
        ListNode node = null;
        ListNode lastNode = null;
        while( (temp2 = q.poll())!=null){
            if(node == null){
                node = new ListNode(temp2);
                lastNode = node;
            }else{
                lastNode = (lastNode.next = new ListNode(temp2));
            }

        }

        return node;
    }*/

    public static void main(String[] args) {

        //System.out.println( 13%10);
        ListNode node0 = new ListNode(9);


        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(1);

        node10.next = node9;
        node9.next = node8;
        node8.next = node7;
        node7.next = node6;
        node6.next = node5;
        node5.next = node4;
        node4.next = node3;
        node3.next = node2;
        node2.next = node1;




        ListNode listNode = addTwoNumbers2(node0, node10);

        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }




    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        Queue<Integer> s1 = new LinkedList<>();
        Queue<Integer> s2 = new LinkedList<>();
        ListNode node1 = l1;
        ListNode node2 = l2;

        while(node1!=null){
            s1.add(node1.val);
            node1 = node1.next;
        }
        while(node2 !=null){
            s2.add(node2.val);
            node2 = node2.next;
        }

        int max = Math.max(s1.size() , s2.size());


        Boolean carryBit = false;
        List<Integer> list = new ArrayList<>(max + 1);
        for(int i = 0 ; i < max ; i++){
            Integer v1 = s1.size() <=0 ? 0: s1.poll();
            Integer v2 = s2.size() <=0 ? 0:  s2.poll();

            list.add((v1 + v2 + (carryBit ? 1 : 0) ) % 10 );
            carryBit = (v1 + v2 + (carryBit ? 1 : 0) ) >= 10 ;

            if(i == max-1 && carryBit){  //最高位且需进位
                list.add(1);
            }

        }
        ListNode firstNode = null;
        ListNode lastNode = null;
        for(Integer nodeVal : list){
            ListNode node = new ListNode(nodeVal);
            if(null == lastNode){
                firstNode = node;
                lastNode = node;
            }else{
                lastNode = (lastNode.next = new ListNode(nodeVal));
            }

        }

        return firstNode;
    }



    public static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0 ;
        while(l1!=null || l2!=null){
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2  + carry;

            if(head == null){
                head = tail = new ListNode(sum % 10 );
            }else{
                tail.next  = new ListNode( sum % 10 );
                tail = tail.next;
            }

            carry = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            if (carry > 0) {
                tail.next = new ListNode(carry);
            }

        }



        return head;
    }
}
