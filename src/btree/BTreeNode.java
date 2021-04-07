package btree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * B树内节点
 * @author WLNSSS
 * @time 2018.1.30
 * */
public class BTreeNode {
	
	// 关键字
	private List<Integer> keys;
	
	//内节点的子节点
	private List<BTreeNode> childNodes;
	
	//父节点
	private BTreeNode parent;

	/**
	 * 初始化节点
	 * */
	public BTreeNode() {
		
		//初始化关键字
		keys = new LinkedList<Integer>();
		
		//初始化子节点
		childNodes = new ArrayList<BTreeNode>();
		
	}
	
    /** 
     * 初始化节点
     * @param parent BTreeNode  父节点
     */  
	public BTreeNode(BTreeNode parent) {
		this();
		this.parent = parent;
	}
	
    /** 
     * 获取所有关键字列表 
     * @return List<Integer> 
     */  
    public List<Integer> getKeys()   
    {  
        return keys;  
    }
    
    /**
     * 获取索引是index的关键字
     * @param index int 要搜索的索引
     * */
    public Integer getKet(int index) {
    	return keys.get(index);
    }
    
    /** 
     * 设置父节点并批量添加孩子结点,添加后需要排序 
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
          
        //排序  
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
