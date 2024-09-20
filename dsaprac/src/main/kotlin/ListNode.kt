fun main() {
    val myLinkedList = ListNode(1,ListNode(2,ListNode(3,null)))
    println(myLinkedList)
    myLinkedList.printReverse()
}
data class ListNode<T>(
    var value:T,
    var next:ListNode<T>? = null

){
    override fun toString(): String {
        if(next != null){
            return "$value -> ${next.toString()}"
        }
        else{
            return "$value"
        }
    }
    fun printReverse(){
        next?.printReverse()
        if(next != null)
            print(" -> ")
        print(value)
    }
}