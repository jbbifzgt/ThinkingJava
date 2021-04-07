package Tree;

/*
 * 树的整体
 * @author WLNSSS
 * @time 2017.12.22
 * */
public class MyTree<T> {

	// 记录根树
	private Node root;

	// 记录节点数
	private int nodeCount;
	
	// 记录节点标识的位置
	private int superFlag;

	public MyTree(T data) {
		//初始化，构造器先装配一个根节点
		root = new Node(data);
	}
	// 在指定位置添加节点
	public void add(T data, int flag) {

		// 定位到指定的位置
		Node point = getNodePost(flag);

		// 错误检查，判断是否是空，如果空抛出异常
		if (point == null) {
			throw new NullPointerException("没有此元素");
		} else {

			// 判断孩子节点空或非空，然后进行不同的操作
			if (point.getChlid() == null) {
				point.setChlid(new Node(data));
			}

			if (point.getChlid() != null) {
				Node temp = point.getChlid();

				Node newNode = new Node(data);
				newNode.setBrother(temp);

				point.setChlid(newNode);

			}
			
			// 元素标识+1
			flag++;
		}
	}

	// 定位节点位置，找出该节点
	public Node getNodePost(int flag) {

		// 调用另外一个复用方法实现
		return getNodePost(flag, root);

	}

	// 定位节点位置，找出该节点
	private Node getNodePost(int flag, Node ponit) {

		// 节点指针,先从root节点开始递归
		Node point = root;

		// 当递归到一个元素的flag等于要查找的flag则返回当前的指针
		if (point.flag == flag) {
			return point;
		}

		// 若兄弟节点非空，则递归取出元素
		if (point.getBrother() != null) {
			return getNodePost(flag, point.getBrother());
		}

		// 若子节点非空，则递归取出元素
		if (point.getChlid() != null) {
			return getNodePost(flag, ponit.getChlid());
		}

		// 若没找到则返回null
		return null;
	}

	/*
	 * 树的节点(内部类)
	 */
	private class Node {

		// 存储的数据
		T data;

		

		// 子节点位置
		Node chlid;

		// 兄弟节点位置
		Node brother;

		// 唯一标识该节点的变量
		int flag;
		
		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getChlid() {
			return chlid;
		}

		public void setChlid(Node chlid) {
			this.chlid = chlid;
		}

		public Node getBrother() {
			return brother;
		}

		public void setBrother(Node brother) {
			this.brother = brother;
		}

		public Node(T data) {
			this(data, null, null,superFlag);
		}

		public Node(T data, Node chlid, Node brother,int flag) {

			this.data = data;
			this.chlid = chlid;
			this.brother = brother;
			this.flag = flag;
		}
		
		

	}
	
	
	public static void main(String[] args) {
		MyTree<Integer> myTree = new MyTree(12);
		myTree.add(1,0);
		myTree.add(2,0);
		System.out.println(myTree.root.chlid.brother.getData());
	}

}
