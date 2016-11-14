import java.util.Scanner;
import java.util.Stack;

/**
 * Created by shilpagu on 11/30/2014.
 */
public class ParanthesisCheker {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String str = myScan.nextLine();
        System.out.println(isBalanced(str));
    }
    public static boolean isBalanced(String S){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<S.length(); i++){
            Character ch = S.charAt(i);
            if(ch=='['){
                stack.push(ch);
                continue;
            }else if(ch=='{'){
                stack.push(ch);
                continue;
            }else if (ch=='('){
                stack.push(ch);
                continue;
            }else if(ch==')'){
                if(stack.peek()=='('){
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
            }else if (ch=='}'){
                if (stack.peek() == '{'){
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
            }else if (ch==']'){
                if (stack.peek()=='['){
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}
