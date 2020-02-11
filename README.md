# UCSD Extension: Unit Testing: Supporting Modern Software Development Methods

## Videos: 

[Lecture 8: Maintainable Tests](URL link here)

## Assignment/Classwork:

Quiz #8

Exercise #1:

A Car is a Sports Car if …

After three months of analysis a team of business analysts have decided that a car can be marked with
the "sports" tag if it satisfies all of the following requirements:
• it is red,
• it was manufactured by Ferrari,
• its engine has more than 6 cylinders.

Based on these detailed requirements a team of top-notch developers have come up with the following
implementation of the CarSearch class:

CarSearch Class Implementation
```java
public class CarSearch {
 private List<Car> cars = new ArrayList<Car>();
 public void addCar(Car car) {
 cars.add(car);
 }
 public List<Car> findSportCars() {
 List<Car> sportCars = new ArrayList<Car>();
 for (Car car : cars) {
 if (car.getEngine().getNbOfCylinders() > 6
 && Color.RED == car.getColor()
 && "Ferrari".equals(car.getManufacturer().getName())) {
 sportCars.add(car);
 }
 }
 return sportCars;
 }
}
```
 
The Car, Engine and Manufacturer interfaces are presented below:
 
Car Interface
```java
 public interface Car {
  Engine getEngine();
  Color getColor();
  Manufacturer getManufacturer();
 }
  ```
  
Engine Interface
```java
public interface Engine {
 int getNbOfCylinders();
}  
``` 

Manufacturing Interface
```java
public interface Manufacturer {
 String getName();
}  
```

Your task is to write some tests for the findSportCars() method of the CarSearch class. Basically,
what you have to do is pass some cars to the CarSearch class (using its addCar()) method, and then
verify, whether only sports cars are being returned by the findSportsCars() method.
Initially, do this for the original implementation of the CarSearch class. Then, redesign the Car
interface, so that the CarSearch class does not violate either the "Law of Demeter" or the "Tell, Don’t
Ask!" principles, and write the tests once again. Compare the amount of work involved in each case.

## Topics Covered: 

o	Test Behavior, Not Methods

o	Complexity Leads to Bugs

o	Rewriting Tests When the Code Changes
