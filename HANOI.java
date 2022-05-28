import java.util.Stack;

public class HANOI {
    
    Stack<Integer> StackS1,StackS2,StackS3;
    int num,step; 
    double limit;
    
public HANOI() {
    
	StackS1 = new Stack<Integer>();
	StackS2 = new Stack<Integer>();  //the stacks
	StackS3 = new Stack<Integer>(); 
    step = 1; //the step number
}

private void MoveHanoi () {
	num = 4; //number of disks
    limit = (Math.pow(2.0, ((double)(num+1))))-1; //the limit of moves
    System.out.println("The limit number of moves is " + ((int)limit) + " moves.");
    for (int i=num; i>=1; i--) {
    	StackS1.push(i);
    }
    
    if (IsEven(num) == true) {
        //The steps for an even number of disks.
        //A-B Combinations
        for (int i=0; i<limit; i++) {
            
            if (StackS1.empty() && StackS2.empty()) break;
            
        if (StackS2.empty() == true) {
        	StackS2.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (StackS1.empty() == true) {
        	StackS1.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (IsBig(StackS1,StackS2) == true) {
        	StackS1.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else {
        	StackS2.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } //end of A-B combinations
        
        //A-C combinations
        if (StackS3.empty() && StackS1.empty()) break;
        
        if (StackS3.empty() == true) {
        	StackS3.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (StackS1.empty() == true) {
        	StackS1.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (IsBig(StackS1,StackS3) == true){
        	StackS1.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else {
        	StackS3.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } //end of A-C combination
        
        //C-B combinations
        if (StackS2.empty() && StackS3.empty()) break;
        
        if (StackS2.empty() == true) {
        	StackS2.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (StackS3.empty() == true) {
        	StackS3.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (IsBig(StackS3,StackS2) == true) {
        	StackS3.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else {
        	StackS2.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } //end of C-B combinations
      }
        
    } else {
        //The steps for an odd number of disks.
        //A-C combinations
        for (int i=0; i<limit; i++) {
            if (StackS1.empty() && StackS3.empty()) break;
            
        if (StackS3.empty() == true) {
        	StackS3.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (StackS1.empty() == true) {
        	StackS1.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (IsBig(StackS1,StackS3) == true){
        	StackS1.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else {
        	StackS3.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } //end of A-C combinations
        
        //A-B combinations
        if (StackS2.empty() && StackS1.empty()) break;
        
        if (StackS2.empty() && !StackS1.empty()) {
        	StackS2.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (StackS1.empty() && !StackS2.empty()) {
        	StackS1.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (IsBig(StackS1,StackS2) == true) {
        	StackS1.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else {
        	StackS2.push(StackS1.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } //and of A-B combinations
        
        //C-B combinations
        if (StackS2.empty() && StackS3.empty()) break;
        
        if (StackS2.empty() == true) {
        	StackS2.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (StackS3.empty() == true) {
        	StackS3.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else if (IsBig(StackS3,StackS2) == true) {
        	StackS3.push(StackS2.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } else {
        	StackS2.push(StackS3.pop());
            System.out.println(step++ + "\n" + StackS1.toString() + " " + StackS2.toString() + " " + StackS3.toString());
        } //end of C-B combinations
      }
    }
}

private static boolean IsBig(Stack<Integer> a, Stack<Integer> b) {
    if (a.peek() > b.peek()) {
        return true;
    } else {
        return false; 
    }
} //check which disk is bigger (if allowed to move) 

private static boolean IsEven(int num) {
    if (num%2 == 0) {
        return true;
    } else {
        return false;
    }
} //check if the number is even 

public static void main (String[] args) { HANOI c = new HANOI();
c.MoveHanoi();
} //main 

} 
	