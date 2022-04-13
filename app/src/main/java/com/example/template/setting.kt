package com.example.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class setting : MenuTemplate() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        disaMenu(menu,R.id.setting)

        return super.onPrepareOptionsMenu(menu)
    }

}