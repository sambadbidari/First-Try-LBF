package com.example.sambad.libraryfinder

/**
 * Created by zombie on 1/18/18.
 */
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseArray

import com.google.android.gms.vision.barcode.Barcode

import info.androidhive.barcode.BarcodeReader

class ScanActivity : AppCompatActivity(), BarcodeReader.BarcodeReaderListener {

    internal lateinit var mBarcodeReader: BarcodeReader
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)
        mBarcodeReader = supportFragmentManager.findFragmentById(R.id.barcode_scanner) as BarcodeReader
    }

    override fun onScanned(barcode: Barcode) {
        // ticket details activity by passing barcode
        val intent = Intent(this@ScanActivity, MainActivity::class.java)
        intent.putExtra("code", barcode.displayValue)
        startActivity(intent)
    }

    override fun onScannedMultiple(barcodes: List<Barcode>) {

    }

    override fun onBitmapScanned(sparseArray: SparseArray<Barcode>) {

    }

    override fun onScanError(s: String) {
        //Toast.makeText(applicationContext, "Error occurred while scanning " + s, Toast.LENGTH_SHORT).show()
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
                startActivity(Intent(this@ScanActivity, BookInventoryViewActivity::class.java))
                return true
            }
            else -> return true
        }
    }*/
}