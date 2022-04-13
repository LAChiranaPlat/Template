package com.example.template

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class MenuTemplate : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflador=menuInflater

        inflador.inflate(R.menu.mainmenu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){

            R.id.plus-> launchActivity(publicar::class.java)

            R.id.post-> launchActivity(post::class.java)

            R.id.friends-> launchActivity(contactos::class.java)

            R.id.setting-> launchActivity(setting::class.java)

            R.id.out-> launchActivity(MainActivity::class.java)

            else->  super.onOptionsItemSelected(item)
        }

    }

    fun launchActivity(clase:Class<*>): Boolean{
        startActivity(Intent(this,clase))
        return true
    }

    fun disaMenu(menu:Menu?,idItem:Int){

        val item=menu?.findItem(idItem)!!

        item.setVisible(false)
        item.isEnabled=false

    }

}