# Shell Sort

#### Shell sort is a generalized version of the insertion sort algorithm. This algorithm first sorts the elements that are far away from each other, then it subsequently reduces the gap between them. This gap is called as interval. This interval can be calculated by using the Knuth's formula given below

- h = h \* 3 + 1, where, 'h' is the interval having initial value 1.

![image](https://user-images.githubusercontent.com/72748315/208669896-90d04a2d-9fda-42af-a5bf-256133171fbf.png)
![image](https://user-images.githubusercontent.com/72748315/208669924-200df388-6ea5-44d8-b6b2-b9e1ef4f5f2e.png)

#### After performing above step, we will simply apply insertion sort on this array.

![image](https://user-images.githubusercontent.com/72748315/208669963-ae69e8a6-99e0-4494-a1b8-03279cf20985.png)

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
