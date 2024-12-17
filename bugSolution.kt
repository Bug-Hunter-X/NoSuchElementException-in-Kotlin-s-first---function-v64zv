```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //This will not throw exception, instead return null.
    val firstEven = list.firstOrNull { it % 2 == 0 }
    println(firstEven) //Prints 2

    val list2 = listOf(1,3,5)
    val firstEven2 = list2.firstOrNull { it % 2 == 0 }
    println(firstEven2) //Prints null
}
```