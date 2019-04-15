import java.util.Arrays

fun main(args: Array<String>) {
    val integersArray = arrayOf(3, 3, 3, 3, 18, 5, 5, 5, 8, 8, 8, 7, 7, 7)
    runs(integersArray)
}

fun runs(numbersArray: Array<Int>) {
    var runsCounter: Int = 1
    var currentElement = numbersArray[0]
    
    for (element in numbersArray) {
        if (currentElement != element) {
            currentElement = element
            runsCounter++
        }
    }
	println("The number of runs in an array is $runsCounter.")
}