package com.example.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.widget.Button
import com.example.template.databinding.ActivityPublicarBinding
import com.google.android.material.textfield.TextInputLayout

class publicar : MenuTemplate() {

    lateinit var layout:ActivityPublicarBinding
    lateinit var titulo:TextInputLayout
    lateinit var publicacion:TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityPublicarBinding.inflate(layoutInflater)

        setContentView(layout.root)

        titulo=layout.tilTitle
        publicacion=layout.tilPost

        if(savedInstanceState!=null){

            titulo.editText?.setText(savedInstanceState.getString("titulo"))
            publicacion.editText?.setText(savedInstanceState.getString("publicacion"))

        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("titulo",titulo.editText?.text.toString())
        outState.putString("publicacion",publicacion.editText?.text.toString())

    }


    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        disaMenu(menu,R.id.plus)

        return super.onPrepareOptionsMenu(menu)
    }
}