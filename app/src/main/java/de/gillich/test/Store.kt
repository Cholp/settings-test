package de.gillich.test

import android.content.Context
import android.content.SharedPreferences

private const val USERNAME_KEY = "username"
private const val PASSWORD_KEY = "password"
private const val URL_KEY = "url"

class Store(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("store", Context.MODE_PRIVATE)

    var username: String?
        get() = sharedPreferences.getString(USERNAME_KEY, "")
        set(value) {
            sharedPreferences.edit().putString(USERNAME_KEY, value).apply()
        }

    var password: String?
        get() = sharedPreferences.getString(PASSWORD_KEY, "")
        set(value) {
            sharedPreferences.edit().putString(PASSWORD_KEY, value).apply()
        }
}