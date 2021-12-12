class Exercise_1 {
  public static void main(String args[])
  {
class Stack {
 
  static final int MAX = 7;
  int top;

  int [] Stack;// Maximum size of Stack

 public boolean isEmpty()
  {
     return top == -1;
      //Write your code here
  }
    public  boolean isFull()
  {
       return top == MAX -1;
      //Write your code here
  }
   

  Stack()
  {
 
      top=-1;//Initialize your constructor
      Stack = new int[MAX];
  }

public  boolean push(int x)
  {
      if(isFull())
      {
        return false;//  System.out.println("Stack is full");
      }
      Stack[++top] = x;
     return true;
}      
           //Check for stack Overflow
      //Write your code her
  int pop()
  {
      if(isEmpty()){
          System.out.println("Stack is empty");
      }

    return  Stack[top--];
  }  
     
      //If empty return 0 and print " Stack Underflow"
      //Write your code here
 
 

public  int peek()
  {
   
      return Stack[top];      //Write your code here
  }
 public void Desplay(){
        for (int i : Stack)
        {
            System.out.println(i);
         }
}
    //testing
}

      Stack s = new Stack();
      s.push(10);
      s.push(20);
      s.push(30);
       s.push(40);
       s.push(50);
       s.push(60);
       s.push(70);
      
     s.Desplay();
      System.out.println(s.isEmpty());
      System.out.println(s.isFull());
      System.out.println(s.peek() + " top from stack");
 System.out.println(s.pop() + " Popped from stack");
     

  }
}
