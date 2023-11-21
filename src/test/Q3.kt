

fun main(){

    val firstNode = Node(
        value = 1,
        nextNodes = mutableListOf(
            Node(
                value = 2,
                nextNodes = mutableListOf(
                    Node(value = 3)
                )
            ),
            Node(
                value = 4,
                nextNodes = mutableListOf(
                    Node(value = 5),
                    Node(value = 6)
                )
            )
        )
    )

    println(addtionOfNodesValues(firstNode))

}

fun addtionOfNodesValues(node: Node): Int {
    var addtion = node.value
    for (item in node.nextNodes) {
        addtion += addtionOfNodesValues(item)
    }
    return addtion
}

data class Node(var value:Int, val nextNodes: MutableList<Node> = mutableListOf())


/*
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
3 + 4 + 5 + 6 = 21.*/
