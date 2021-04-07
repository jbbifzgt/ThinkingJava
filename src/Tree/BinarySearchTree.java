package Tree;

/*
 * ���������
 * @author WLNSSS
 * @time 2017.12.26
 * */
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	
	/*
	 * ������������ýڵ�(�ڲ���)
	 * */
	private static class BinaryNode<AnyType> {
		//������
		BinaryNode(AnyType theElement) {
			this(theElement,null,null);
		}
		
		BinaryNode(AnyType theElement,BinaryNode leftTree,BinaryNode rightTree) {
			element = theElement;
			left = leftTree;
			right = rightTree;
		}
		
		//�洢������
		AnyType element;
		//������
		BinaryNode<AnyType> left;
		//������
		BinaryNode<AnyType> right;
	}
	
	// ���ڵ�
	private BinaryNode<AnyType> root;
	
	//������
	public BinarySearchTree(){
		this.init();
	}
	
	public void makeEmpty(){
		this.init();
	}
	
	//��ʼ�����������
	public void init(){
		root = null;
	}
	
	//�ж϶���������Ƿ�Ϊ��
	public boolean isEmpty(){
		return root == null;
	}
	
	//�ж������Ƿ���ڸýڵ�
	public boolean contains(AnyType x){
		return contains(x,root);
	}
	
	private boolean contains(AnyType x,BinaryNode<AnyType> t){
		if(t == null){
			return false;
		}
		
		//���رȶԽ��
		int compareResult = x.compareTo(t.element);
		
		//�ݹ����ƥ��
		if(compareResult <0){
			return contains(x,t.left);
		}else if(compareResult >0){
			return contains(x,t.right);
		}else{
			return true;
		}
	}
	
	//��������ֵ����С�ڵ�
	public AnyType findMin(){
		if(isEmpty()){
			throw new NullPointerException();
		}
		return findMin(root).element;
	}
	
	//��������ֵ�����ڵ�
	public AnyType findMax(){
		if(isEmpty()){
			throw new NullPointerException();
		}
		return findMax(root).element;
	}
	
	// ���ò��������Բ��������Сֵ�ľ���ʵ��
	private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t){
		if(t == null){
			return null;
		}else if(t.left ==null){
			return t;
		}
		
		return findMin(t.left);
	}
	
	private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t){
		if(t != null){
			while(t.right != null){
				t = t.right;
			}
		}
		
		return t;
	}
	
	//���Ĳ���
	private BinaryNode<AnyType> insert(AnyType x,BinaryNode<AnyType> t){
		if(t == null){
			return new BinaryNode(x,null,null);
		}
		
		int compareResult = x.compareTo(t.element);
		
		if(compareResult <0){
			t.left = insert(x, t.left);
		}else if(compareResult >0){
			t.right = insert(x, t.right);
		}else{
			//ʲô������
			;
		}
		return t;
		
	}
	
	//����ɾ��
	private BinaryNode<AnyType> remove(AnyType x,BinaryNode<AnyType> t){
		//û���ҵ��ýڵ㣬���ؿ�
		if(t == null) {
			return t;
		}
		
		//�������ԱȵĽ��
		int compareResult = x.compareTo(t.element);
		
		if(compareResult < 0) {
			t.left = remove(x, t.left);
		}else if(compareResult > 0) {
			t.right = remove(x, t.right);
		}else if(t.left != null && t.right != null) {
			t.element = findMin(t.right).element;
			t.right = remove(t.element, t.right);
		}else {
			t = (t.left != null) ? t.left : t.right;
		}
		
		return t;
	}

	public static void main(String[] args) {
		
	}
	
	

}
