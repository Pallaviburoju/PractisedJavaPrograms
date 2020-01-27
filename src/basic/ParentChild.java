package basic;

class Parent
{
       int a=100;
       public void display()
       {
              System.out.println("Display in parent A: "+a);
       }
}

class Child extends Parent
{
       int b=200;

       public void display()
       {
              System.out.println("Display in parent B: "+b);
       }
}


public class ParentChild {

      public static void main(String args[])
       {
    	   //here object is created for child, so child class display is executed
              Parent obj = new Child();
              obj.display();
       }
}


