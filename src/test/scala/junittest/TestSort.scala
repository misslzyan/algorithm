package junittest

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import sort.{FindMaximumSubarray, InsertionSort, MergeSort}


/**
  * 描述： 测试排序
  * *
  *
  * @author duanweidong
  * @date 2018/9/15 下午5:43
  * @version 1.0
  */
@RunWith(classOf[JUnitRunner])
class TestSort extends Specification {

  "testInsertionSort" >> {
    val array = Array(8, 7, 6, 5, 4, 3)
    var r = ""
    InsertionSort.insertionSort(array).foreach(r += _)
    r == "345678"
  }

  "mergeSort" >> {
    val merge = new MergeSort
    var r = ""
    merge.mergeSort(Array(8, 7, 6, 5, 4, 3, 2, 1)).foreach(r += _)
    print(r)
    r == "12345678"
  }

  "findMaximumSubarray">>{
    println("findMaximumSubarray")
    val r = (new FindMaximumSubarray).findMaxmumSubarray(Array(-5,1,2,3,4,-5))
    println(r)
    r._4==10
  }

}
