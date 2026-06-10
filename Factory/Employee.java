package DesignPatterns.Factory;

interface Employee {
    int salary();
}


//Factory Pattern : When there is superclass and multiple subclasses we want to get object
// of subclasses based on inputs of requirement.
// Then we create factory class which takes the responsibility creating objects of class based on inputs.
// Advantages : 1). Loose Coupling , more robust code
//              2). focus on creating objects for interface rather than implementation
