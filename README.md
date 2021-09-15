# Design patterns
- Design patterns are the best formalized practices a programmer can use to solve common problems when designing an application or system.
- Design patterns can speed up the development process by providing tested, proven development paradigms.
- Reusing design patterns help prevent subtle issues that cause major problems, and it also improves code readability for coders and architects who are familiar with the patterns.

** Java Design Patterns are divided into three categories : **
> 1. creational:

>> ** - Singleton** :  Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java virtual machine.
Singleton pattern is used for logging, drivers objects, caching and thread pool.

>>> ** EagerInitializedSingleton :** If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios, Singleton classes are created for resources such as File System, Database connections, etc. We should avoid the instantiation until unless client calls the getInstance method. Also, this method doesn’t provide any options for exception handling.

>>> ** StaticBlockSingleton :** Both eager initialization and static block initialization creates the instance even before it’s being used and that is not the best practice to use. 

>>> ** LazyInitializedSingleton :** The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern and both threads will get the different instances of the singleton class.  

>>> ** ThreadSafeSingleton :** Above implementation works fine and provides thread-safety but it reduces the performance because of the cost associated with the synchronized method, although we need it only for the first few threads who might create the separate instances (Read: Java Synchronization). To avoid this extra overhead every time, double checked locking principle is used. In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only one instance of a singleton class is created.

>> ** - Factory ;** The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class

>>> ** Factory Design Pattern Advantages:**
- Factory design pattern provides approach to code for interface rather than implementation.
- Factory pattern removes the instantiation of actual implementation classes from client code. 
- Factory pattern makes our code more robust, less coupled and easy to extend. 
- Factory pattern provides abstraction between implementation and client classes through inheritance.