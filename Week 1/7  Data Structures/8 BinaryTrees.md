# Binary Trees

What if you have a bunch of solutions, and to find the correct solution, you answer a bunch of yes/no question. For example, the first question could be is it hot? If it is hot, the solution is to use an A/C, and if it is no, you use a heater

The solution to out problem is to use a binary tree.

### Definitions

##### Binary Tree

Either an empty tree or a root node(typically storing some data) that refers to two other trees known as the left subtree and the right subtree.

#### Branch (Branch Node)

A node that has two empty subtree.

#### Parent/ChildSibling/Ancestor.Descendant

For every node *p* that has a subtree with root node *q*,
we say that *p* is the parent of *q* and *q* is the child of *p*, which
leads logically to ancestor relationship (parent of parent of ...),
descendant relationship (child of child of...), and sibling relationships (two nodes with same parent).

#### Root of a Tree (Overall Root)

The node at the top of binary tree, the only node in the tree that has no parent.

![img_8.png](img_8.png)

### Benefits

- Binary hierarchical relationships
- Can quickly add and delete nodes (log time to find it)
- Decsuion trees
- Binary Search Trees

### Drawbacks

- Extra data required to store location of child nodes
- Recursion is required to visit all nodes

