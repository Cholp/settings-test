package de.gillich.test

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : Activity() {

    private val store by lazy { Store(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        saveButton.setOnClickListener { save() }

        username.setText(store.username ?: "username")
        password.setText(store.password ?: "password")

    }

    private fun save() {
        store.username = username.text.toString()
        store.password = password.text.toString()
        finish()
    }

}