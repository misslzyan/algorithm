package sort

/**
  * 描述：  找出某个数组中，和最大的那个子数据
  *
  * 利用 divide and conquer
  *
  * 最大数据存在三种情况。
  * 根据原数据的mid进行分割，
  * 数组存在左边的数组
  * 数组存在右边的数组
  * 数组存在跨越mid的数组。
  *
  * *
  *
  * @author duanweidong
  * @date 2018/9/16 下午3:49
  * @version 1.0
  */
class FindMaximumSubarray {


  def findMaxmumSubarray(array: Array[Int]): (Array[Int], Int, Int, Int) = {
    findMaxmumSubarray(array, 0, array.length)
  }

  def findCrossSubarray(array: Array[Int], from: Int, mid: Int, to: Int): (Int, Int, Int) = {
    var leftSum = Int.MinValue
    var sum = 0
    var leftIndex = mid - 1
    for (i <- (from until mid).reverse) {
      sum += array(i)
      if (sum >= (leftSum)) {
        leftSum = sum
        leftIndex = i
      }
    }

    var rightSum = Int.MinValue
    sum = 0
    var rightIndex = 0
    for (i <- (mid until to)) {
      sum += array(i)
      if (sum >= rightSum) {
        rightSum = sum
        rightIndex = i
      }
    }
    (leftIndex, rightIndex+1, leftSum + rightSum)
  }

  /**
    *
    * @param array
    * @param from contains
    * @param to   noncontains
    * @return array from to sum
    */
  def findMaxmumSubarray(array: Array[Int], from: Int, to: Int): (Array[Int], Int, Int, Int) = {
    if (to - from <= 1) {
      return (array, from, to, array(from))
    }
    val mid = (from + to) / 2
    val left = findMaxmumSubarray(array, from, mid)
    val right = findMaxmumSubarray(array, mid, to)
    val cross = findCrossSubarray(array, from, mid, to);

    if (left._4 >= right._4 && left._4 >= cross._3) {
      return left
    } else if (right._4 >= left._4 && right._4 >= cross._3) {
      return right
    } else {
      return (array, cross._1, cross._2, cross._3)
    }


  }


}
