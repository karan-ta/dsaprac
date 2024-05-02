package leetcode
fun main() {
    MajorityElement().majorityElement(intArrayOf(2,2,3))
}
class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var myMajorityElement = 0
        var count = 0
        nums.forEachIndexed { index, it ->
            when {
                count == 0 -> {
                    myMajorityElement = it
                    count ++
                }
                myMajorityElement == it -> {
                    count++
                }

                myMajorityElement != it -> {
                    count--

                }
            }
        }
//        println(myMajorityElement)
//        println(count)
        return myMajorityElement
        }


}