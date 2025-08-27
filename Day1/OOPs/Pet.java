package Day1.OOPs;

Class Pet
    Attributes:
        name
        age
    Constructor(name, age)
        this.name = name
        this.age = age
    Method displayInfo()
        Print "Pet Name: " + name
        Print "Age: " + age

Class Dog extends Pet
    Attribute: breed
    Constructor(name, age, breed)
        Call super(name, age)
        this.breed = breed
    Method displayInfo()
        Call super.displayInfo()
        Print "Breed: " + breed

Class Cat extends Pet
    Attribute: color
    Constructor(name, age, color)
        Call super(name, age)
        this.color = color
    Method displayInfo()
        Call super.displayInfo()
        Print "Color: " + color

Class Bird extends Pet
    Attribute: canFly
    Constructor(name, age, canFly)
        Call super(name, age)
        this.canFly = canFly
    Method displayInfo()
        Call super.displayInfo()
        Print "Can Fly: " + canFly

Pet
    Create Dog("Bruno", 3, "Labrador")
    Create Cat("Kitty", 2, "White")
    Create Bird("Mithu", 1, true)

    Call dog.displayInfo()
    Call cat.displayInfo()
    Call bird.displayInfo()

