package Tree;

/*
 * 二叉查找树
 * @author WLNSSS
 * @time 2017.12.26
 * */
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	
	/*
	 * 二叉查找树内置节点(内部类)
	 * */
	private static class BinaryNode<AnyType> {
		//构造器
		BinaryNode(AnyType theElement) {
			this(theElement,null,null);
		}
		
		BinaryNode(AnyType theElement,BinaryNode leftTree,BinaryNode rightTree) {
			element = theElement;
			left = leftTree;
			right = rightTree;
		}
		
		//存储的数据
		AnyType element;
		//左子树
		BinaryNode<AnyType> left;
		//右子树
		BinaryNode<AnyType> right;
	}
	
	// 根节点
	private BinaryNode<AnyType> root;
	
	//构造器
	public BinarySearchTree(){
		this.init();
	}
	
	public void makeEmpty(){
		this.init();
	}
	
	//初始化二叉查找树
	public void init(){
		root = null;
	}
	
	//判断二叉查找树是否为空
	public boolean isEmpty(){
		return root == null;
	}
	
	//判断树里是否存在该节点
	public boolean contains(AnyType x){
		return contains(x,root);
	}
	
	private boolean contains(AnyType x,BinaryNode<AnyType> t){
		if(t == null){
			return false;
		}
		
		//返回比对结果
		int compareResult = x.compareTo(t.element);
		
		//递归进行匹配
		if(compareResult <0){
			return contains(x,t.left);
		}else if(compareResult >0){
			return contains(x,t.right);
		}else{
			return true;
		}
	}
	
	//查找树里值的最小节点
	public AnyType findMin(){
		if(isEmpty()){
			throw new NullPointerException();
		}
		return findMin(root).element;
	}
	
	//查找树里值的最大节点
	public AnyType findMax(){
		if(isEmpty()){
			throw new NullPointerException();
		}
		return findMax(root).element;
	}
	
	// 利用查找树特性查找最大最小值的具体实现
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
	
	//树的插入
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
			//什么都不做
			;
		}
		return t;
		
	}
	
	//树的删除
	private BinaryNode<AnyType> remove(AnyType x,BinaryNode<AnyType> t){
		//没查找到该节点，返回空
		if(t == null) {
			return t;
		}
		
		//返回树对比的结果
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
