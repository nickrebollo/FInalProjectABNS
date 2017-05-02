
package adventuregame;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author brettdeetz
 */
public interface Queue1 {
    
public void isEmpty();
public void add();
public void remove();
public void size();

public class class1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
    }

    private static void printStack(Stack<String> s) {
        if(s.isEmpty())
            System.out.println("This is empty");
        else
            System.out.printf("%s TOP\n", s);
    
    }
}Stack lifo = new Stack();
}

