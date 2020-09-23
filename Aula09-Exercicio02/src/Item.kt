class Item(numero:Int, nome:String, var quantidade:Int, var precoUnitario:Double) {

    init {
        if (quantidade < 0) {
            quantidade = 0
        }

        if (precoUnitario< 0.0){
            precoUnitario = 0.0
        }
    }
}