fun main(){
    print("Informe um número inteiro: ")
    var numero = readLine()!!.toInt()

    println(tipoNumeroInteiro(numero))
}

fun tipoNumeroInteiro(numero:Int):String {
    if(numero>0){
        return "P"
    }else{
        return "N"
    }
}