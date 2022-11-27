# LINEAR SEARCH
***

## Searching

Searching is the process of finding some particular element in the list. <br>
If the element is present in the list,  <br>
then the process is called successful and the process returns the location of that element, <br>
otherwise the search is called unsuccessful.<br>

****

|Complexity	|Best Case	|Average Case	|Worst Case
|-----------|-----------|---------------|----------
|Time	    |    O(1)	|    O(n)	    |    O(n)
|Space		|	 --     |     --        |     O(1)


************************************************************************************************************************

## ALGORITHM:

 LINEAR_SEARCH(A, N, VAL)
*   Step 1: [INITIALIZE] SET POS = -1
*   Step 2: [INITIALIZE] SET I = 1
*   Step 3: Repeat Step 4 while I<=N
*   Step 4: IF A[I] = VAL
*   SET POS = I
*   PRINT POS
*   Go to Step 6
*   [END OF IF]
*   SET I = I + 1
*   [END OF LOOP]
*   Step 5: IF POS = -1
*   PRINT " VALUE IS NOT PRESENTIN THE ARRAY "
*   [END OF IF]
*   Step 6: EXIT

************************************************************************************************************************
