
Here is an example of how the code could be fixed:
```
val explicitDouble: Double = 70.0
```
The bug in the original code was that the `Double` type was not specified, so Kotlin inferred the variable to have type `Any`, which is a supertype of all classes in Kotlin. By specifying the type explicitly as `Double`, the code will now compile and run correctly.