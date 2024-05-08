package com.example.lab1

fun main() {
    println("Phùng Mạnh Hùng - Ph32870\n")
    println("-------------------------\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")

    println("\n bai 2")
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))

    println("\nvd1:Các kiểu dữ liệu cơ bản ")
    val c: Char = 'A'
    val i: Int = 100
    val l: Long = 10000000000
    val f: Float = 0.3f
    val d: Double = 10.5
    val bl: Boolean = true
    /////vd2:kieu du lieu chuoi
    println("\nvd2:kieu du lieu chuoi ")
    val str1 = "Hello"
    val str2 = "world"
    val str3 = "$str1 $str2"
    println("hi: $str3")
    //// vd3: Sử dụng biến với String templates
    println("\nvd3: Sử dụng biến với String templates")
    val x = 30
    val y = 10
    println("x la  :$x vaf y la :$y")
    ////vd4: Sử dụng biến với biểu thức
    println("\nvd4: Sử dụng biến với biểu thức")
    println("tổng của x và y là ${x + y}")
    ////vd5: Làm việc với null
    println("\nvd5: Làm việc với null")
    var name: String? = null
    println("Name length: ${name?.length ?: "Name is null"}")
    ///vd6: if-else
    println("\nvd6: if-else")
    val num1 = 30
    val num2 = 20
    val maxNum = if (num1 > num2) num1 else num2
    println("so lon nhat la $maxNum")
    ////vd7:When expression tương tự switch-case trong java
    println("\nvd7:When expression ")
    val number = 3
    when (number) {
        1 -> println("no la 1")
        2 -> println("no la 2")
        else -> println("ngoai le")
    }
    ////vd8:tong ca so trong mot day so
    println("\nvd8:Tính tổng các số trong một dãy số ")
    val numberr = listOf(1, 2, 3, 4, 5, 6)
    var sum = 0
    for (numb in numberr) {
        sum += numb
    }
    println("tong cac so: $sum ")
    //// vd9:tính giá trị gia thừa của 1 số
    println("\nvd9:tính giá trị gia thừa của 1 số  ")
    val number9 = 5
    var factorial = 1
    for (i in 1..number9) {
        factorial *= i
    }
    println("giai thừa của $number9 là $factorial")
    ///vd10: so sánh giá trị số lơn hơn 1 giá trị cụ thể
    println("\nvd10: so sánh giá trị số lơn hơn 1 giá trị cụ thể")
    val number10 = 10
    val threshold = 5
    when {
        number10 < threshold -> println("Số 10 <5")
        number10 == threshold -> println("Số 10==5")
        else -> println("Số 10 >5")
    }
}
