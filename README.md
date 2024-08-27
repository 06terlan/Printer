# Java Print Utility Library

Welcome to the Java Printer Library! This library provides a simple and flexible way to print any data type in Java. Whether you're dealing with primitive types, complex objects, or custom data structures like binary trees, this library makes it easy to display data in a readable format.

## Table of Contents

- [Features](#features)
- [Examples](#examples)
  - [TreeNode Class](#treenode-class)
- [Installation](#installation)
- [Supported JDK versions](#supported-jdk-versions)
- [Contributing](#contributing)

## Features

- **Print TreeNode**: Support for printing TreeNode in a vertical format. See the example [here](#Print-TreeNode-Example)
```c
         1
   ┌─────┴─────┐
   2           2
┌──┘
3
```
- **Helper Classes**: Includes utility classes like `TreeNode` for working with binary trees. See the example of TreeNode [here](#TreeNode-Class-Example)

## Examples
### Print TreeNode Example
```java
TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3)), new TreeNode(2));

Printer.prettyPrint(root);
```

Output:
```c
         1
   ┌─────┴─────┐
   2           2
┌──┘
3
```

### TreeNode Class Example

The TreeNode class is a simple helper class for creating and managing binary trees. Each TreeNode object has an integer value, and references to its left and right children.

```java
TreeNode root = new TreeNode(10);
root.left = new TreeNode(5);
root.right = new TreeNode(15);
```

You can also define it like that.
```java
TreeNode root = new TreeNode(10, new TreeNode(5), new TreeNode(15));
```
## Installation

To use this library in your project, you can either clone the repository or include it as a dependency in your build tool.

## Supported JDK versions

- JDK11+

## Contributing
Contributions are welcome! If you have suggestions for new features, optimizations, or find a bug, please open an issue or submit a pull request. Make sure your code follows the project's coding standards.