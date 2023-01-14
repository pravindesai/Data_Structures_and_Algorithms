package kotlinTips

fun main(){

    val currentUser = getUser()

    //   is operator
    when(currentUser){
        is LoggedInUser -> {
            println("User is Logged In")
        }
        is GuestUser -> {
            println("User is Guest")
        }
    }

    //  !is operator
    if (currentUser !is GuestUser){
        println("Show Logout Button")
    }else{
        println("Show Login Button")
    }


}

fun getUser():User = LoggedInUser()


interface User{
    fun getFriendList():List<Any>
    fun getPosts():List<Any>
}

class LoggedInUser:User{
    override fun getFriendList(): List<String> {
        return emptyList<String>()
    }

    override fun getPosts(): List<String> {
        return emptyList<String>()
    }
}

class GuestUser:User{
    override fun getFriendList(): List<String> {
        return emptyList()
    }

    override fun getPosts(): List<String> {
        return emptyList()
    }
}