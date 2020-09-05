fun main(){
    print("Informe a temperatura em Fahrenheit: ")
    var temperaturaCelsius = readLine()!!.toFloat()
    var temperaturaFahrenheit = 5 * ((temperaturaCelsius-32)/9)
    print("A temperatura em Celsius é " + "%.2f".format(temperaturaFahrenheit))
}
