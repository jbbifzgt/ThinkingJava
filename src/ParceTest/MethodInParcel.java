package ParceTest;

public class MethodInParcel {
	 public  void showInner() { 
         /**
           * <h4>i �ֶ� :���ֶ� �� final ���κ󣬿��ڷ����ڲ����е��ã�</h4>
           */
          int i =52; 
         class InnerClass{
             private int s = 325; 
             private void showInnerClass() {
                 System.out.println("�����ڲ���ʹ�ã�"+s); 
                 System.out.println("�˴��Ҹ���λ��    i ��ֵ" + i);  
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
