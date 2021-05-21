import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static int maxHeight; 
    static int currHeight;

    Solution(){
        this.maxHeight=0;
        this.currHeight=1;
    }

    public static int getHeight(Node root){
      //Write your code here
      if (root==null){
        if (currHeight>maxHeight){
            maxHeight=currHeight;
        }
        currHeight--;
              }
      else{
          currHeight++;
          getHeight(root.left);          
          getHeight(root.right);
      }
      return maxHeight;
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}