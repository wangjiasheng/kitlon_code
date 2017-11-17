package studay7

import javax.swing.JTree
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.TreeNode

inline fun <reified T> TreeNode.findParentOfType1():T?
{
   var p=parent;
    while(p!=null&&p !is T)
    {
        println(p)
        p=p.parent;
    }
    return p as T?
}
fun main(args:Array<String>)
{
    println("" is String)
    println(String::class.isInstance(""))
    println("------------------------------------")
    var node1 =  DefaultMutableTreeNode("软件部");
    node1.add(DefaultMutableTreeNode(User("小花")));
    node1.add(DefaultMutableTreeNode(User("小虎")));
    node1.add(DefaultMutableTreeNode(User("小龙")));

    val node2 = DefaultMutableTreeNode("销售部")
    node2.add(DefaultMutableTreeNode(User("小叶")))
    node2.add(DefaultMutableTreeNode(User("小雯")))
    node2.add(DefaultMutableTreeNode(User("小夏")))

    val top = DefaultMutableTreeNode("职员管理")

    top.add(DefaultMutableTreeNode(User("总经理")));
    top.add(node1);
    top.add(node2);

    val tree = JTree(top)
    var node:TreeNode=top.root //Node就是Top 0.是经理 1是node1 2是node2
    node.getChildAt(1).getChildAt(1).findParentOfType1<DefaultMutableTreeNode>()
}