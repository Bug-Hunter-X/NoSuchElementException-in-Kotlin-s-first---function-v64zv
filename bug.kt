```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //This will throw an exception
    val firstEven = list.first { it % 2 == 0 }
    println(firstEven)
}
```