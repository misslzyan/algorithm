package sort

/**
  * 描述：
  *
  * * merge sort 归并排序
  *
  * @author duanweidong
  * @date 2018/9/15 下午8:28
  * @version 1.0
  */
class MergeSort {


  def mergeSort(array: Array[Int]): Array[Int] = {
    val from = 0
    val to = array.length
    mergeSort(array, from, to)
  }

  def mergeSort(array: Array[Int], from: Int, to: Int): Array[Int] = {
    if (to - from <= 1) {
      return array
    }
    val mid = (from + to) / 2
    mergeSort(array, from, mid)
    mergeSort(array, mid, to)
    merge(array, from, mid, to)
  }

  def merge(array: Array[Int], from: Int, mid: Int, to: Int) = {

    val l = new Array[Int](mid - from)
    var li = 0
    for (m <- from until mid) {
      l(li) = array(m)
      li += 1
    }

    val r = new Array[Int](to - mid)
    var ri = 0
    for (n <- mid until to) {
      r(ri) = array(n)
      ri += 1
    }

    var i = 0
    var j = 0
    var index = from
    while (i < l.length && j < r.length) {
      if (l(i) < r(j)) {
        array(index) = l(i)
        index += 1
        i += 1
      } else {
        array(index) = r(j)
        index += 1
        j += 1
      }
    }
    while (i < l.length) {
      array(index) = l(i)
      index += 1
      i += 1
    }
    while (j < r.length) {
      array(index) = r(j)
      index += 1
      j += 1

    }
    array
  }
}
