### SOLID stands for:

* S - Single-responsiblity Principle
* O - Open-closed Principle
* L - Liskov Substitution Principle
* I - Interface Segregation Principle
* D - Dependency Inversion Principle

***

<p>

* These principles establish practices that lend to developing software with considerations for maintaining and extending as the project grows.

* Adopting these practices can also contribute to avoiding code smells, refactoring code, and Agile or Adaptive software development.
</p>

***

### Explanation of SOLID principles:

* S - Single-responsiblity Principle 

> A class should have one and only one reason to change, meaning that a class should have only one job.
>>This principle aims to separate behaviours so that if bugs arise as a result of your change, it won’t affect other unrelated behaviours.
> 
* O - Open-closed Principle
> Objects or entities should be open for extension but closed for modification.<br/>
> This means that a class should be extendable without modifying the class itself.
>>This principle aims to extend a Class’s behaviour without changing the existing behaviour of that Class.<br/> 
>> This is to avoid causing bugs wherever the Class is being used.

* L - Liskov Substitution Principle
>Let q(x) be a property provable about objects of x of type T. 
> Then q(y) should be provable for objects y of type S where S is a subtype of T.<br/>
>>This means that every subclass or derived class should be substitutable for their base or parent class<br/>
>>This principle aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.


* I - Interface Segregation Principle
>A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
>>This principle aims at splitting a set of actions into smaller sets so that a Class executes ONLY the set of actions it requires.

* D - Dependency Inversion Principle
>Entities must depend on abstractions, not on concretions.<br/>
> It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
>  * High-level Module(or Class): Class that executes an action with a tool.
>  * Low-level Module (or Class): The tool that is needed to execute the action
>>This principle aims at reducing the dependency of a high-level Class on the low-level Class by introducing an interface.

