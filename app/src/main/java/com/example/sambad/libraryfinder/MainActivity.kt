package com.example.sambad.libraryfinder


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

/**
 * Created by zombie on 1/18/18.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.book_name)
        findViewById<View>(R.id.btn_scan).setOnClickListener { startActivity(Intent(this@MainActivity, ScanActivity::class.java)) }
    }

    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.to_inventory_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //handle menu item selection
        when (item.itemId) {
            R.id.inventory_menu_item -> {
                startActivity(Intent(this@MainActivity, BookInventoryViewActivity::class.java))
                return true
            }
            else -> return true
        }

    }*/
}
