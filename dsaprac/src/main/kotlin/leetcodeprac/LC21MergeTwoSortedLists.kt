package leetcodeprac

fun main() {
    val myNode = ListNode(5)
    val myNext =  ListNode(4)
    val myNextNext = ListNode(3)
    myNode.next = myNext
    myNext.next = myNextNext
    println(myNode)

}
class ListNode(var `val`:Int){
    var next:ListNode? = null
    override fun toString():String{
        if(next != null){
            return "${`val`.toString()} ${"->"} ${next.toString()}"
        }
        else
        {
            return `val`.toString()
        }
    }
}

class LC21MergeTwoSortedLists {
    fun mergeTwoLists(l1:ListNode,l2:ListNode){
        val result = ListNode(0)
        result.next = null
        while l1.next != null && l2.next != null)
    }
}