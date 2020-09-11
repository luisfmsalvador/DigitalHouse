fun main() {
    do {
        print("Informe um nome com mais de três caracteres: ")
    } while(readLine()!!.toString().length <= 3)

    do {
        print("Informe a idade. Ela deve estar entre 0 e 150 anos: ")
    } while(!(readLine()!!.toInt() in 1..149))

    do {
        print("Informe o salário. Ela deve ser maior que 0: ")
    } while(readLine()!!.toInt() <= 0)

    do {
        print("Informe o sexo. Os valores válidos são f e m: ")
        var sexo = readLine()!!.toString().toUpperCase()
    } while(!sexo.equals("F") && !sexo.equals("M"))

    do {
        print("Informe o estado civil. Os valores válidos são c, s, d, v: ")
        var sexo = readLine()!!.toString().toUpperCase()
    } while(!sexo.equals("C") && !sexo.equals("S") && !sexo.equals("D") && !sexo.equals("V"))

}