package kotlinTips

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromString
enum class KEY {
    KEY_LOCAL_USER,
    KEY_REMOTE_USER
}

fun main() {

    val localUser = LocalUser("Pravin", 3)
    val remoteUser = RemoteUser("Akash", 3980423)

    SessionManager.saveUser(KEY.KEY_LOCAL_USER, localUser)
    SessionManager.saveUser(KEY.KEY_REMOTE_USER, remoteUser)

    val lUser = SessionManager.getUser<LocalUser>(KEY.KEY_LOCAL_USER)
    println("Local User-> ${lUser}")

    val rUser = SessionManager.getUser<RemoteUser>(KEY.KEY_REMOTE_USER)
    println("Local User-> ${rUser}")


    val session = SessionManager.getWholeSession()

    println(session)

}

object SessionManager {
    val session: MutableMap<KEY, String> = mutableMapOf()

    inline fun <reified T> saveUser(key: KEY, user: T) = session.put(key, Json.encodeToString(user))
    inline fun <reified T> getUser(key: KEY): T? = session.get(key)?.let {
                                                        Json.decodeFromString<T>(it)
                                                    } ?: run {
                                                        null
                                                    }
    private inline fun <reified T> saveEncryptedUser(key: KEY, user: T) = session.put(key, Json.encodeToString(user))

    fun getWholeSession() = session
}

@Serializable
data class LocalUser(val name: String, val seatNumber: Int)

@Serializable
data class RemoteUser(val name: String, val sessionNumber: Int)