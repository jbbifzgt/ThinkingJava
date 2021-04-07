package ParceTest;

public class MethodInParcel {
	 public  void showInner() { 
         /**
           * <h4>i 字段 :该字段 用 final 修饰后，可在方法内部类中调用；</h4>
           */
          int i =52; 
         class InnerClass{
             private int s = 325; 
             private void showInnerClass() {
                 System.out.println("方法内部类使用："+s); 
                 System.out.println("此处我改如何获得    i 的值" + i);  
                 }
             } 
  
             InnerClass ic = new InnerClass(); 
             ic.showInnerClass();
     }
     public static void main(String [] args){
         MethodInParcel hello = new MethodInParcel();
         hello.showInner();
    }  

}
