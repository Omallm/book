The Student class represents a student with the following features:

    Attributes:
        name: The student's name.
        studentID: Unique identifier for the student.
        major: The field of study.
        GPA: The student's grade point average.

    Constructors:
        Default Constructor: Initializes attributes to default values (empty strings and GPA of 0.0).
        Parameterized Constructor: Allows the creation of a Student object with specific values for each attribute.

    Methods:
        displayInfo(): Prints the student's details.
        updateGPA(double newGPA): Updates the GPA if the new value is valid (between 0.0 and 4.0).

    Main Method:
        Creates instances of Student using both constructors.
        Displays their information and updates the GPA for one student, showing changes.

How It Meets the Requirements

    Class Definition: Defines a Student class.
    UML Class Diagram: The structure can be visualized with a UML diagram showing attributes and methods.
    Attributes: Contains four key attributes as specified.
    Constructors: Implements both default and parameterized constructors.
    Methods: Includes a displayInfo method and another method to update GPA.
    Testing the Class: The main method tests object creation, displays information, and demonstrates method functionality.
