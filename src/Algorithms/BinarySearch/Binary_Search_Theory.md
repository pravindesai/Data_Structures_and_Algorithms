# BINARY SEARCH ALGORITHM
****

Binary search is the search technique which works efficiently on the sorted lists. <br>
Hence, in order to search an element into some list by using binary search technique, <br>
we must ensure that the list is sorted.<br>

Binary search follows divide and conquer approach in which, the list is divided into two halves and 
the item is compared with the middle element of the list.
If the match is found then, the location of middle element is returned otherwise, <br>
we search into either of the halves depending upon the result produced through the match.   <br>

****
### ALGORITHM:

BINARY_SEARCH(A, lower_bound, upper_bound, VAL)
<ul>
<li>   Step 1: [INITIALIZE] SET BEG = lower_bound
<li>   END = upper_bound, POS = - 1
<li>   Step 2: Repeat Steps 3 and 4 while BEG <=END
<li>   Step 3: SET MID = (BEG + END)/2
<li>   Step 4: IF A[MID] = VAL
<li>   SET POS = MID
<li>   PRINT POS
<li>   Go to Step 6
<li>   ELSE IF A[MID] > VAL
<li>   SET END = MID - 1
<li>   ELSE
<li>   SET BEG = MID + 1
<li>   [END OF IF]
[END    OF LOOP]
<li>   Step 5: IF POS = -1
<li>   PRINT "VALUE IS NOT PRESENT IN THE ARRAY"
<li>   [END OF IF]
<li>    Step 6: EXIT </li>

</ul>

***

## Complexity

|   SN	        | Performance	                       |     Complexity
|---------------|--------------------------------------|---------------
|   1	        | Worst case	                       |  O(log n)     
|   2	        | Best case	                           |  O(1)         
|   3	        | Average Case	                       |  O(log n)     
|   4	        | Worst case space complexity	       |  O(1)         


***