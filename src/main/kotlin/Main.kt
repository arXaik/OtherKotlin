fun main() {
    val arraySize = 14
    val array = IntArray(arraySize)

    println("Введите $arraySize целых чисел:")
    for (i in 0 until arraySize) {
        print("Элемент $i: ")
        array[i] = readLine()!!.toInt()
    }

    var countOfEvenPositive = 0
    var sumOfEvenPositive = 0
    for (element in array) {
        if (element > 0 && element % 2 == 0) {
            countOfEvenPositive++
            sumOfEvenPositive += element
        }
    }

    // Вывод результата
    println("Количество чётных положительных элементов: $countOfEvenPositive")
    println("Сумма чётных положительных элементов: $sumOfEvenPositive")
}
