package com.example.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class contactos : MenuTemplate() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

      disaMenu(menu,R.id.friends)
        return super.onPrepareOptionsMenu(menu)
    }

}