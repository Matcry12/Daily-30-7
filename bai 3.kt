package `Daily 30`

//3. Cho 2 số a và b. Hãy tìm ra số lớn nhất và nhỏ nhất mà không dùng câu lệnh điều kiện - rẽ nhánh
fun main() {
    var a: Int = 0
    var b: Int = 0
    a = readLine()!!.toInt()
    b = readLine()!!.toInt()
    val MyTrue: Boolean = true
    val MyFalse: Boolean = false
    val result1 = a<b
    val result2 = a>b


    println("a<b is $result1")
    println("a>b is $result2")

}