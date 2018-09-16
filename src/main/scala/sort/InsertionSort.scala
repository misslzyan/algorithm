package sort

/**
  * 描述：
  * insertion sort  插入排序
  *
  * *
  *
  * @author duanweidong
  * @date 2018/9/15 下午3:30
  * @version 1.0
  */
object InsertionSort {

  def main(args: Array[String]): Unit = {
    //    val input = Array(8, 7, 6, 5, 4, 3, 2, 1)
    //    input.foreach(print(_))
    //    println()
    //    val output = insertionSort(input)
    //    output.foreach(print(_))
    //
    //    for(i <- 0 to 10){
    //      println(i)
    //    }
    //    for(i <- (1 to 10).reverse){
    //      println(i)
    //    }
    //
    //
    //    val p = new Person(1,"ligoudan")
    //    println(p.->(p))


    for (i <- 1 to 10) {
      println(i)
    }

    for (i <- 1 until 10) {
      println(i)
    }

    for (i <- (1 to 10).reverse) {
      println(i)
    }

    for (i <- (1 until 10).reverse) {
      println(i)
    }

    for (i <- (1 until 2).reverse) {
      println(i)
    }

  }

  /**
    * 插入排序
    *
    * @param arr
    * @return
    */
  def insertionSort(arr: Array[Int]): Array[Int] = {
    if (arr == null || arr.length == 0) {
      return arr;
    }
    if (arr.length == 1) {
      return arr;
    }
    for (i <- 1 until arr.length) {
      val key = arr(i)
      var index = i
      for (j <- (0 to i - 1).reverse if arr(j) > key) {
        arr(j + 1) = arr(j)
        index = j
      }
      arr(index) = key
    }
    arr
  }
}
