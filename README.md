# Java Print Utility Library

Welcome to the Java Printer Library! This library provides a simple and flexible way to print any data type in Java. Whether you're dealing with primitive types, complex objects, or custom data structures like binary trees, this library makes it easy to display data in a readable format.

## Table of Contents

- [Features](#features)
- [Examples](#examples)
  - [TreeNode Class](#treenode-class-example)
  - [PrefixTreeNode Class](#prefixtreenode-class-example)
- [Installation](#installation)
- [Supported JDK versions](#supported-jdk-versions)
- [Contributing](#contributing)

## Features
- **Print int/Integer**: Support for printing both `int` and `Integer` types. See the example [here](#Print-int-and-Integer-Example)
```java
(value: 1234)
```
- **Print TreeNode**: Support for printing `TreeNode` in a vertical format. See the example [here](#Print-TreeNode-Example)
```java
         1
   ┌─────┴─────┐
   2           2
┌──┘
3
```
- **Helper Classes**: Includes utility classes like `TreeNode` and `PrefixTreeNode` for working with binary and prefix trees. See the example of TreeNode [here](#treenode-class-example) and PrefixTreeNode [here](#prefixtreenode-class-example)

## Examples
### Print int and Integer Example
```java
public static void main(String[] args) {
    int intValue = 42;
    
    Printer.prettyPrint(intValue);
    Printer.prettyPrint(Integer.valueOf(intValue));
}
```
Output:
```java
(value: 42)
(value: 42)
```
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

### PrefixTreeNode Class Example
The PrefixTreeNode class represents a node in a prefix tree, also known as a Trie. This data structure is particularly useful for efficient retrieval of strings based on their prefixes, making it ideal for applications such as autocomplete, spell checking, and IP routing.

```java
// Create the root node of the Trie
PrefixTreeNode rootNode = new PrefixTreeNode(null);

// Add a word to the Trie
String word = "apple";
PrefixTreeNode currentNode = rootNode;

for (char ch : word.toCharArray()) {
    currentNode.children.putIfAbsent(ch, new PrefixTreeNode(ch));
    currentNode = currentNode.children.get(ch);
}

// The word "apple" is now added to the Trie
```

## Installation

To use this library in your project, you can either clone the repository or include it as a dependency in your build tool.

## Supported JDK versions

- JDK11+

## Contributing
Contributions are welcome! If you have suggestions for new features, optimizations, or find a bug, please open an issue or submit a pull request. Make sure your code follows the project's coding standards.