package btree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * B���ڽڵ�
 * @author WLNSSS
 * @time 2018.1.30
 * */
public class BTreeNode {
	
	// �ؼ���
	private List<Integer> keys;
	
	//�ڽڵ���ӽڵ�
	private List<BTreeNode> childNodes;
	
	//���ڵ�
	private BTreeNode parent;

	/**
	 * ��ʼ���ڵ�
	 * */
	public BTreeNode() {
		
		//��ʼ���ؼ���
		keys = new LinkedList<Integer>();
		
		//��ʼ���ӽڵ�
		childNodes = new ArrayList<BTreeNode>();
		
	}
	
    /** 
     * ��ʼ���ڵ�
     * @param parent BTreeNode  ���ڵ�
     */  
	public BTreeNode(BTreeNode parent) {
		this();
		this.parent = parent;
	}
	
    /** 
     * ��ȡ���йؼ����б� 
     * @return List<Integer> 
     */  
    public List<Integer> getKeys()   
    {  
        return keys;  
    }
    
    /**
     * ��ȡ������index�Ĺؼ���
     * @param index int Ҫ����������
     * */
    public Integer getKet(int index) {
    	return keys.get(index);
    }
    
    /** 
     * ���ø��ڵ㲢������Ӻ��ӽ��,��Ӻ���Ҫ���� 
     * @param children 
     * @return boolean 
     */  
    public boolean addChildren(List<BTreeNode> children)  
    {  
        for(BTreeNode node: children)  
        {  
            node.setParent(this);  
        }  
          
        childNodes.addAll(children);  
          
        //����  
        Collections.sort(childNodes, new Comparator<BTreeNode>() {  
  
              
            public int compare(BTreeNode o1, BTreeNode o2)   
            {  
                return o1.getKeys().get(0).compareTo(o2.getKeys().get(0));  
            }

			@Override
			public int compare(BTreeNode arg0, BTreeNode arg1) {
				// TODO Auto-generated method stub
				return 0;
			}  
        });  
          
        return true;  
    } 
    
    
    
    
    
    
    

	public List<BTreeNode> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<BTreeNode> childNodes) {
		this.childNodes = childNodes;
	}

	public BTreeNode getParent() {
		return parent;
	}

	public void setParent(BTreeNode parent) {
		this.parent = parent;
	}

	public void setKeys(List<Integer> keys) {
		this.keys = keys;
	}  
}
