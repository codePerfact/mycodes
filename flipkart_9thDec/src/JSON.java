import com.company.JSONTreeNode;

import java.util.*;

public class JSON {
    private static JSONTreeNode root=null;
    public static void main(String[] args){

        Scanner myScan = new Scanner(System.in);
        int flag=1;
        while(flag==1){
            String input = myScan.next();
            int value = myScan.nextInt();
            putInTree(input, value);
            System.out.println("Please enter 1 for more input else 0 : ");
            flag = myScan.nextInt();
            System.out.println("now the root is : "+root.getName());
        }

        printJSON(root);
    }
    public static void putInTree(String input,int value){
            JSONTreeNode parent = new JSONTreeNode(root);
        for(int i=0; i<input.length(); i++){
            JSONTreeNode node = search(input.charAt(i),root);
            if(node == null){
                node = new JSONTreeNode();
            }
            if(root ==null){
                root=node;
                node.setName(input.charAt(i));
                parent = node;
            }else {
                node.setName(input.charAt(i));
                parent.addjSon(node);
                parent = node;
            }
        }
        parent.addI(value);
    }

    public static JSONTreeNode search(char c, JSONTreeNode temproot){
        if(temproot!=null) {
            if (temproot.getjSon() != null) {
                for (JSONTreeNode temp : temproot.getjSon()) {
                    if (temp.getName() == c) {
                        return temp;
                    }else{
                        search(c,temp);
                    }
                }
            }
        }
        return null;
    }

    public static void printJSON(JSONTreeNode root){
        Stack<JSONTreeNode> stack = new Stack<JSONTreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            JSONTreeNode treeNode = stack.pop();
            System.out.print(treeNode.getName()+" : ");
            if(treeNode.getjSon().isEmpty()){
                if(treeNode.getI().size()==1){
                    System.out.print(treeNode.getI().get(0)+",");
                    System.out.println();
                }else{
                    Collection<JSONTreeNode> collection = treeNode.getjSon();
                    System.out.print(collection+",");
                    System.out.println();
                }
            }else{
                System.out.println("{");
                for(JSONTreeNode temp : treeNode.getjSon()) {
                    printJSON(temp);
                }
                System.out.println("}");
            }
        }
    }

}
