package com.example.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class post : MenuTemplate() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        disaMenu(menu,R.id.post)

        return super.onPrepareOptionsMenu(menu)
    }
}