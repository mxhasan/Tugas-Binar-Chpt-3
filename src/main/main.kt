
fun main() {
    do {

        println("------------------------")
        println("Game Suit Gunting Batu Kertas")
        println("------------------------")
        println("Masukan Angka 1 = Gunting")
        println("Masukan Angka 2 = Kertas")
        println("Masukan Angka 3 = Batu")
        println("------------------------")
        println("Note :")
        println("Masukan Angka selain dari yang di")
        println("untuk tentukan mengakhiri game ini :)")
        println("------------------------")

        print("Player 1 : ")

        val input1 = readLine()?.toInt()
        val input2 = (1..3).random()

        println("Player 2 : $input2")

        println("------------------------")
        println("-------Hasil-nya--------")
        println("------------------------")

        val controller = Controller(munculAhh)
        if (input1!! >= 4) {
            println(".....")
        } else {
            controller.hitung(
                input1.minus(1), input2.minus(1)
            )
        }
    } while (input1!! <= 3)
    println("udahan yuk.. capek..")
}

val munculAhh = object : CallBack {
    override fun munculkanHasilnya(msg: String) {
        println(msg)
    }
}