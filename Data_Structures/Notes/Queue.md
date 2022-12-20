# Queue

#### A queue is defined as a linear data structure that is open at both ends and the operations are performed in `First In First Out (FIFO) order`.

#### We define a queue to be a list in which all additions to the list are made at one end, and all deletions from the list are made at the other end. The element, which is first pushed into the order, the operation is first performed on that.

![image](https://user-images.githubusercontent.com/72748315/208666067-ad2e6ae1-0a3b-4376-b28e-60fd6b495d83.png)

### Standard Queue Operations:

- `enqueue()` − add (store) an item to the queue.
- `dequeue()` − remove (access) an item from the queue.
- `peek()` − Gets the element at the front of the queue without removing it.
- `isfull()` − Checks if the queue is full.
- `isempty()` − Checks if the queue is empty.

### Application of Queue:

- Keyboard Buffer (letter should appear on the screen in the order they’re pressed)
- Printer Queue (Print jobs should be completed in order)
- Used in Linked Lists, Priority Queue, Breadth-First Search

### Time Complexity

<table>
    <tr>
        <th>&nbsp;</th>
        <th>Average</th>
        <th>Worst</th>
    </tr>
    <tr>
        <td>Access</td>
        <td>θ(n)</td>
        <td>θ(n)</td>
    </tr>
    <tr>
        <td>Search</td>
        <td>θ(n)</td>
        <td>θ(n)</td>
    </tr>
    <tr>
        <td>Insertion</td>
        <td>θ(1)</td>
        <td>θ(1)</td>
    </tr>
    <tr>
        <td>Deletion</td>
        <td>θ(1)</td>
        <td>θ(1)</td>
    </tr>
</table>

<a style="float:right; margin-top: 30px"
 href='#'>
<button>Next ⏭</button>
</a>
<a style="float: right; margin-top:30px"
 href='../../README.md'>
<button>Return to Homepage 🏠</button>
</a>
<a style="float:right; margin-top: 30px"
 href='./Stack.md'>
<button>⏮ Previous</button>
</a>
