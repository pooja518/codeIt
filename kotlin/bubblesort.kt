fun bubbleSort(arr: MutableList<Int>) {
    val n = arr.size
    var swapped: Boolean

    do {
        swapped = false
        for (i in 1 until n) {
            if (arr[i - 1] > arr[i]) {
                val temp = arr[i - 1]
                arr[i - 1] = arr[i]
                arr[i] = temp
                swapped = true
            }
        }
    } while (swapped)
}

fun main() {
    val arr = mutableListOf(1000,911,69,143,518,83)
    bubbleSort(arr)
    println("Sorted array: $arr")
}