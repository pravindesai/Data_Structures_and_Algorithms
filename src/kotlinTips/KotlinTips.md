<h2 align="center">Kotlin Tips</h2>

### [1. Measure execution time of code snippet](https://github.com/pravindesai/Data_Structures_and_Algorithms/blob/master/src/kotlinTips/MeasureExecutionTime.kt)
    Kotlin provides some methods to measure execution time of code. 

### [2.Sequences]()
#### In kotlin sequences are lazily evaluated that means object is created only when required.
    
* They have two types of operations: <b>intermediate and terminal</b>.
  * Intermediate operations are not performed on the spot; they’re just stored. Only when a terminal operation is called, the intermediate operations are triggered on each element in a row and finally, the terminal operation is applied. 
  * Intermediate operations (like map, distinct, groupBy etc) return another sequence whereas terminal operations (like first, toList, count etc) don’t.

  
   <i>Lazy initialization is a delegation that initializes something only once and only when it’s called. It’s meant to avoid unnecessary object creation.
  </i>

#### Collections eagerly evaluate your data while sequences do so lazily. Depending on the size of your data, pick the one that fits best: collections — for small lists or sequences — for larger ones, and pay attention to the order of the transformations.

### <i>Creating sequences</i>
    val list= (1, 2, 3, 4)
    val sequence = sequence{
        list.forEach {
            yield(it)
        }
    }

#### How evaluation works in sequence
   Consider mapping square of list of 1 to 5 with collection and finding some value equals 9.
  * without sequence execution
    

    [1,2,3,4,5] -> [1,4,9,16,25] -> look for 9 -> return 3
    
  * with sequence execution
  
      
      [1,2,3,4,5] -> [1,4,9] -> found 9 -> return 3


### [3. Generic type `<T>`](https://github.com/pravindesai/Data_Structures_and_Algorithms/blob/master/src/kotlinTips/GenericClass.kt)
#### Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

* Advantages of generic –
    * <b>Type casting is evitable</b>- No need to typecast the object.
    * <b>Type safety</b>- Generic allows only single type of object at a time.
    * <b>Compile time safety</b>- Generics code is checked at compile time for the parameterized type so that it avoids run time error.
  
### [4.Extension functions](https://github.com/pravindesai/Data_Structures_and_Algorithms/blob/master/src/kotlinTips/ExtensionFunction.kt)

Kotlin gives the programmer the ability to add more functionality to the existing classes, without inheriting them. <br>This is achieved through a feature known as extensions. <br>When a function is added to an existing class it is known as Extension Function.

      fun ExistingClass.functionName():<ReturnType>{
        return <ReturnValue>  
      }

### [5.Destructing](https://github.com/pravindesai/Data_Structures_and_Algorithms/blob/master/src/kotlinTips/Destructuring.kt)

####A destructuring declaration creates multiple variables at once.<br>
The variable number that was destructuring the declaration defined the class, 
which provided the number of components and functions starting from component1 and ending with components.


    val location = Pair(4232.54739, 923423.01127)
    val (latitude,longitude) = location
    println("Lat: $latitude - Long: $longitude")

Under the hood kotlin calls component() function on the object like o`bject.component1()`


    val location = Pair(4232.54739, 923423.01127)
    val (latitude,longitude) = location
    println("Lat: ${location.component1()} - Long: ${location.component2()}")

To add destructing in simple classes we can add `operator fun component1()` like

      class Vector(val x:Int, val y:Int){
          operator fun component1(): Int = x
          operator fun component1(): Int = y
      }