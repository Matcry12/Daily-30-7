package `Daily 30`

//2. Nhập vào năm sinh và in ra số tuổi tính đến năm 2021, bao nhiêu năm nữa thì sẽ tốt nghiệp đại học

fun main() {
    var Year_of_Birth: Int = 0
    val this_Year: Int = 2021
    var tuoi: Int = 0
    val tuoi_tot_nghiep_dai_hoc: Int = 22


    println("Bai 2 ")

    println("nhap nam sinh cua ban:")

    Year_of_Birth = readLine()!!.toInt()

    tuoi = this_Year - Year_of_Birth

    println("tuoi hien tai cua ban la $tuoi ")

    println("va gia su hoc dai hoc can 4 nam de tot nghiep thi")

    if (tuoi_tot_nghiep_dai_hoc - tuoi >= 0) {

        println("con ${tuoi_tot_nghiep_dai_hoc - tuoi} nam nua thi ban se tot nghiep dai hoc")

    }
    else {
        println("ban da do dai hoc (neu ban do)")
    }
}