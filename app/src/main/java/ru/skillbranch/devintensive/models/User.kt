package ru.skillbranch.devintensive.models
import ru.skillbranch.devintensive.utils.parseFullName
import java.util.*
import kotlin.random.Random

class User(
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
) {
    constructor(id: String, firstName: String?, lastName: String?):this(id, firstName, lastName, null)

    companion object Factory {
        private var lastId: Int = 0

        fun makeUser(fullName: String?): User {
            val (firstName, lastName) = parseFullName(fullName)
            return User("${lastId++}", firstName, lastName)
        }
    }

}