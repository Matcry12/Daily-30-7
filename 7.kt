package `Daily 30`

import java.util.concurrent.CompletableFuture

//1. Nhập từ bàn phím 2 cạnh của hình chữ nhật và tính chu vi, diện tích của hính chữ nhật đó.

fun main() {
    var width: Int = 0
    var length: Int = 0

    println("bai 1")
    println("nhap chieu dai va chieu rong:")
    width = readLine()!!.toInt()
    length = readLine()!!.toInt()
    println("chu vi la ${(width+length)*2}")
    println("dien tich la ${width*length}")




}