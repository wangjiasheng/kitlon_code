package studay7

import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.TreeNode
import javax.swing.JTree

fun <T> TreeNode.findParentOfType(clazz:Class<T>):T?
{
    var p=parent
    while(p !=null&&!clazz.isInstance(p))
    {
        println(p)
        p = p.parent;
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}
data class User(var username:String)
{
    override fun toString(): String {
        return username;
    }
}
fun main(args:Array<String>)
{
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
    printlnNode(0,node)
    println("------------------------------------------------------")
    node=node.getChildAt(1)
    node=node.getChildAt(1)
    var fnode=node.findParentOfType(DefaultMutableTreeNode::class.java)

}
fun printlnNode(int:Int=0,treenode:TreeNode)
{
    for(x in 0..treenode.childCount-1)
    {
        for(x in 0..int-1)
        {
            print(" ") //打印空格
        }
        var node:TreeNode=treenode.getChildAt(x);
        println(node)//打印节点
        printlnNode((int+1)*4,node);
    }
}