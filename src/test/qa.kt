/*
Question 1:
Given an array of strings such as
["A", "B", "C"]
return an array of objects such as
[ {"name": "A"}, {"name": "B"}, {"name": "C"} ]


-------------------------------------------------------------------------------------------------------------------------------------
Question 2:
Given an array of string, such as
["A", "B", "C", "Z", "Q"]
return an object such as
{ "A": 0, "B": 1, "C": 2, "Z" : 3, "Q": 4 }
The numbers here are the positions of the string in the input array.

-------------------------------------------------------------------------------------------------------------------------------------
Question 3:
Suppose the tree
1
/ \
2 4
/ / \
3 5 6
is represented by the object
tree = {
    value: 1,
    children: [ { value: 2,
        children: [ { value: 3,
            children: []
        }
        ]
    },

    { value: 4,
        children: [ { value: 5,
            children: []
        },
        {
            value: 6,
            children: []
        }
        ]
    }
    ]
}

How would you total up the "value" of all the nodes. For example, here the answer would be 1 + 2 +
3 + 4 + 5 + 6 = 21.

-------------------------------------------------------------------------------------------------------------------------------------

Question 4:
Given an array of words, pick out only those words that have two or
more vowels in them. For the purposes of this question, a vowel is one
of the letters a, e, i, o, u.
For example, given
["dog", "cat", "mouse", "sky", "eleven"]

return

["mouse", "eleven"]
-------------------------------------------------------------------------------------------------------------------------------------

Question 5:
Given the same input as above, place parentheses around the vowels.
For example:
["d(o)g", "c(a)t", "m(ou)s(e)", "sky", "(e)l(e)v(e)n"]
Notice how consecutive vowels are grouped. That is, "m(ou)s(e)" is correct; "m(o)(u)s(e)" is
incorrect.

-------------------------------------------------------------------------------------------------------------------------------------
Question 2 // Given an array of words, pick out only those words that have two or
// more vowels in them. For the purposes of this question, a vowel is one
// of the letters a, e, i, o, u.
// For example, given
// ["dog", "cat", "mouse", "sky", "eleven"]
// return
// ["mouse", "eleven"] let words=["dog", "cat", "mouse", "sky", "eleven"]
let temp=[]
for(let i=0;i<words.length;i++){
    let count=0
    for(let j=0;j<words[i].length;j++){
        if(words[i][j]=="a" || words[i][j]=="e"|| words[i][j]=="i"||words[i][j]=="o"||words[i][j]=="u"){
            count++;

        }

    }

    if(count>=2)

        temp.push(words[i])

} console.log(temp)

*/
