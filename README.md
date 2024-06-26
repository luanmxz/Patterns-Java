# Patterns-Java

## Overview

This project is a study of design patterns implemented in Java. It includes various common design patterns, providing examples and explanations to help developers understand and apply these patterns in their own projects.

## Table of Contents

- [Getting Started](#getting-started)
- [Design Patterns Included](#design-patterns-included)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To get started with this project, you will need to clone the repository and have Java installed on your machine.

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/luanmxz/Patterns-Java.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Patterns-Java
    ```

## Design Patterns Included

The project includes the following design patterns:

1. **Singleton Pattern**
   - Ensures a class has only one instance and provides a global point of access to it.
   - Files: `SingletonPattern.java`, `TestSingleton.java`
2. **Observer Pattern**
   - Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   - Files: `MyObservable.java`, `MyObserver.java`, `ObserverApp.java`

## Usage

Each design pattern is implemented in its respective Java file(s). You can run these examples to see how each pattern works.

### Example

To run the Singleton pattern example:
```bash
javac SingletonPattern.java
java SingletonPattern
```

## Contributing

Contributions are welcome! Please fork this repository and submit pull requests for any improvements or additional patterns you would like to add.

### Steps to Contribute

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Open a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
