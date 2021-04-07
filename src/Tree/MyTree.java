package Tree;

/*
 * ��������
 * @author WLNSSS
 * @time 2017.12.22
 * */
public class MyTree<T> {

	// ��¼����
	private Node root;

	// ��¼�ڵ���
	private int nodeCount;
	
	// ��¼�ڵ��ʶ��λ��
	private int superFlag;

	public MyTree(T data) {
		//��ʼ������������װ��һ�����ڵ�
		root = new Node(data);
	}
	// ��ָ��λ����ӽڵ�
	public void add(T data, int flag) {

		// ��λ��ָ����λ��
		Node point = getNodePost(flag);

		// �����飬�ж��Ƿ��ǿգ�������׳��쳣
		if (point == null) {
			throw new NullPointerException("û�д�Ԫ��");
		} else {

			// �жϺ��ӽڵ�ջ�ǿգ�Ȼ����в�ͬ�Ĳ���
			if (point.getChlid() == null) {
				point.setChlid(new Node(data));
			}

			if (point.getChlid() != null) {
				Node temp = point.getChlid();

				Node newNode = new Node(data);
				newNode.setBrother(temp);

				point.setChlid(newNode);

			}
			
			// Ԫ�ر�ʶ+1
			flag++;
		}
	}

	// ��λ�ڵ�λ�ã��ҳ��ýڵ�
	public Node getNodePost(int flag) {

		// ��������һ�����÷���ʵ��
		return getNodePost(flag, root);

	}

	// ��λ�ڵ�λ�ã��ҳ��ýڵ�
	private Node getNodePost(int flag, Node ponit) {

		// �ڵ�ָ��,�ȴ�root�ڵ㿪ʼ�ݹ�
		Node point = root;

		// ���ݹ鵽һ��Ԫ�ص�flag����Ҫ���ҵ�flag�򷵻ص�ǰ��ָ��
		if (point.flag == flag) {
			return point;
		}

		// ���ֵܽڵ�ǿգ���ݹ�ȡ��Ԫ��
		if (point.getBrother() != null) {
			return getNodePost(flag, point.getBrother());
		}

		// ���ӽڵ�ǿգ���ݹ�ȡ��Ԫ��
		if (point.getChlid() != null) {
			return getNodePost(flag, ponit.getChlid());
		}

		// ��û�ҵ��򷵻�null
		return null;
	}

	/*
	 * ���Ľڵ�(�ڲ���)
	 */
	private class Node {

		// �洢������
		T data;

		

		// �ӽڵ�λ��
		Node chlid;

		// �ֵܽڵ�λ��
		Node brother;

		// Ψһ��ʶ�ýڵ�ı���
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
