fun main(){
    calc()
}

fun sum(a: Number?, b: Number?): Double?{
    return (a?.toDouble() ?: 0.0) + (b?.toDouble() ?: 0.0)
}

fun sub(a: Number?, b: Number?): Double?{
    return (a?.toDouble() ?: 0.0) - (b?.toDouble() ?: 0.0)
}

fun multi(a: Number?, b: Number?): Double?{
    return (a?.toDouble() ?: 0.0) * (b?.toDouble() ?: 0.0)
}

fun div(a: Number?, b: Number?): Double?{
    return (a?.toDouble() ?: 0.0) / (b?.toDouble() ?: 0.0)
}

fun enterNumber(notice: String): Double?{
    print(notice)
    val value = readln()
    if (value.isBlank()) return null
    return try {
        value.toDouble()
    } catch (e: NumberFormatException){
        return null
    }
}

fun enterAction(notice: String?): Char?{
    print(notice)
    val value = readln()
    if (value.isBlank()) return null

    return value.firstOrNull()
}

fun calculating(num1: Double?, num2: Double?, action: Char?): Double? {
    var result: Double? = null
    if (action == '+') result = sum(num1, num2)
    else if (action == '-') result = sub(num1, num2)
    else if (action == '*') result = multi(num1, num2)
    else if (action == '/') result = div(num1, num2)
    return result
}

fun calc(){
    val firstNumber = enterNumber("Enter first number: ")
    val action = enterAction("Enter an action - +, -, * or / : ")
    val secondNumber = enterNumber("Enter second number: ")

    val result = calculating(firstNumber, secondNumber, action)
    println("Solution: " + result)
}