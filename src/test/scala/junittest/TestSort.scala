package junittest

import java.io.ByteArrayOutputStream

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import sort.InsertionSort

import scala.xml.XML


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
    InsertionSort.insertionSort(array).foreach(r+=_)
    r=="345678"
  }

}
