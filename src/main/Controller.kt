class Controller(private val munculkan: CallBack) {
    val data = mutableListOf("Batu", "Gunting", "Kertas")

    fun hitung(player1: Int, player2: Int) {
        val p1 = data[player1]
        val p2 = data[player2]

        munculkan.munculkanHasilnya(
            "Player 1 = $p1"
        )
        munculkan.munculkanHasilnya(
            "Player 2 = $p2"
        )

        when {
                    p1 == data[0] && p2 == data[1]
                            ||
                    p1 == data[1] && p2 == data[2]
                            ||
                    p1 == data[2] && p2 == data[0]
                    -> {
                // player 1 menang
                println("------------------------")
                munculkan.munculkanHasilnya("Player 1 Menang Nihyee! Lagi yuk...")
                println("------------------------")
            }
                    p2 == data[0] && p1 == data[1]
                                ||
                    p2 == data[1] && p1 == data[2]
                                ||
                    p2 == data[2] && p1 == data[0]
            -> {
                //player2 menang
                println("------------------------")
                munculkan.munculkanHasilnya("Player 2 Menang Nihyee! Lagi yuk...")
                println("------------------------")
            }
            else -> {
                // seri
                        p1 == data[2] && p2 == data[2]
                                ||
                        p1 == data[1] && p2 == data[1]
                                ||
                        p1 == data[0] && p2 == data[0]
                println("------------------------")
                munculkan.munculkanHasilnya("Seri Dong! Lagi yukk")
                println("------------------------")
            }
        }
    }
}

