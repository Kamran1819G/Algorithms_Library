# Shell Sort

#### Shell sort is a generalized version of the insertion sort algorithm. This algorithm first sorts the elements that are far away from each other, then it subsequently reduces the gap between them. This gap is called as interval. This interval can be calculated by using the Knuth's formula given below

- h = h \* 3 + 1, where, 'h' is the interval having initial value 1.

#### After performing above step, we will simply apply insertion sort on this array.

### Time Complexity:

<table> 
    <tr>
        <th>Best Case</th> 
        <th>Average Case</th>
        <th>Worst Case</th>
    </tr>
    <tr>
        <td> O (n log n) </td>
        <td> O (n log n)</td>
        <td>O(N^2) </td>
    </tr>
</table>
