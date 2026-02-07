# Car - Static vs Final in Java

Simple Java exercise to understand `static`, `final` and `static final`:

- `brand` → `static final` (global constant, never changes)
- `model` → `static` (shared by all car instances)
- `power` → `final` (unique per car instance)

Methods:

- `Car.brake()`     → static method
- `car.accelerate()` → instance method

Main:

- Calls static method without creating any object
- Creates a Car and calls accelerate()

**Key observations:**

- `brand` is immutable forever
- Changing `model` affects **all** cars
- Each car keeps its own `power`

🚗 Built with Conventional Commits

**QUESTIONS**
Which of these attributes can be initialized by the constructor?

- Model

```java
public void Cars(String model) {
    Car.model = model;
}
```

Which one can never be modified?

- Brand is static final attribute.

Which one affects all instances of the class?

- Brand and model because are static attributes.