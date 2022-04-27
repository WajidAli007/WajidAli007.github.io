

fun main() {

//    Rearrange the array item on ascending order based on their digits.
//    For e.g:
//    Arr1 = [521, 263, 891, 105, 496] => [125, 236, 189, 015, 469]
//    Arr2 = [11, 62, 80, 47, 32] => [11, 26, 08, 47, 23]

//    need to solve it by keeping time and space complexity in mind.

    sort(arrayOf(521, 263, 891, 105, 496)).forEach {
        print("$it, ")
    }

}

// 5, 2, 1

fun sort(input: Array<Int>) : Array<Int>{
    val result = ArrayList<Int>()

    input.forEach {
        val item = it.toString().toCharArray()
        val digitsArrayList = ArrayList<Int>()
        item.forEach {
            digitsArrayList.add(it.digitToInt())
        }
        digitsArrayList.sort()
        val stringified = digitsArrayList.joinToString {
            it.toString()
        }
        result.add(stringified.replace(", ", "").toInt())
    }

    return result.toTypedArray()
}

