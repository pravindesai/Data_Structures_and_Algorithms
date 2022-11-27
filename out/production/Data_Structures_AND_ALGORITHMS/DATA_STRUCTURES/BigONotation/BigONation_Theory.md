## Big-O Analysis of Algorithms

We can express algorithmic complexity using the big-O notation. <br> 
For a problem of size N:

|                                                         |             |
|---------------------------------------------------------|-------------|
| A constant-time function/method is “order 1”            |: O(1)       |
| A linear-time function/method is “order N”              |: O(N)       |
| A quadratic-time function/method is “order N squared”   |: O(N 2 )    |

we mainly used to measure and compare the worst-case theoretical running time complexities of algorithms for the performance analysis.

****

The algorithms can be classified as follows from the best-to-worst performance (Running Time Complexity):

|                         |                    |                                                                    |
|-------------------------|--------------------|--------------------------------------------------------------------
|A logarithmic algorithm|Runtime grows logarithmically in proportion to n. | O(log n)
|A linear algorithm |Runtime grows directly in proportion to n|O(n)
|A super linear algorithm|Runtime grows in proportion to n|O(n log n)
|A polynomial algorithm|Runtime grows quicker than previous all based on n|O(nc)
|A exponential algorithm|Runtime grows even faster than polynomial algorithm based on n|O(cn)
|A factorial algorithm |Runtime grows the fastest and becomes quickly unusable for even small values of n|O(n!)


***

Algorithmic Examples of Runtime Analysis:
Some of the examples of all those types of algorithms (in worst-case scenarios) are mentioned below:

|                            |            |                                                                                                 |
|----------------------------|------------|-------------------------------------------------------------------------------------------------|
| Logarithmic algorithm      |  O(log n)  |  Binary Search.                                                                                 |
| Linear algorithm           |  O(n)      |  Linear Search.                                                                                 |
| Super linear algorithm     |  O(n log n)|  Heap Sort, Merge Sort.                                                                         |
| Polynomial algorithm       |  O(n^c)    |  Strassen’s Matrix Multiplication, Bubble Sort, Selection Sort, Insertion Sort, Bucket Sort.    |
| Exponential algorithm      |  O(c^n)    |  Tower of Hanoi.                                                                                |
| Factorial algorithm        |  O(n!)     |  Determinant Expansion by Minors, Brute force Search algorithm for Traveling Salesman Problem.  |

***

### Reference Links:
https://www.freecodecamp.org/news/big-o-notation-why-it-matters-and-why-it-doesnt-1674cfa8a23c/
****