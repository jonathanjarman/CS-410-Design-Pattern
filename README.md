Factory Method Design Pattern - Vehicle Example
This code repository demonstrates the implementation of the Factory Method Design Pattern using a vehicle example. The Factory Method pattern is a creational design pattern that provides a way to delegate the responsibility of object creation to subclasses, allowing for flexible and extensible object creation.

Description
The code consists of the following classes:

Vehicle: An interface representing the common behavior for different types of vehicles.
Car and Motorcycle: Concrete classes that implement the Vehicle interface, representing specific types of vehicles.
VehicleFactory: An abstract class that defines the factory method createVehicle(), which subclasses will implement to create instances of the Vehicle interface.
CarFactory and MotorcycleFactory: Concrete classes that extend the VehicleFactory class and provide implementations for creating specific types of vehicles.
VehicleFactoryDemo: The main class that showcases the usage of the Factory Method Design Pattern by creating instances of vehicles using different factories.

License
This code is released under the MIT License.

Copyright (c) 2023 Jonathan Jarman

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.