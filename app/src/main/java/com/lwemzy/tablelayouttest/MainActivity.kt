package com.lwemzy.tablelayouttest

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.lwemzy.tablelayouttest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val version = findViewById<EditText>(R.id.version)
        val codename = findViewById<EditText>(R.id.codename)
        val btnAdd = findViewById<Button>(R.id.btn_add)
        val table = findViewById<TableLayout>(R.id.table)
        btnAdd.setOnClickListener{_->
            val tableRow = TableRow(applicationContext)

            val layoutParams = TableRow.LayoutParams()
            tableRow.layoutParams = layoutParams
            val textViewVersion = TextView(applicationContext)
            textViewVersion.text = version.text

            tableRow.addView(textViewVersion,0)


            val textViewCodeName = TextView(applicationContext)
            textViewCodeName.text = codename.text
            tableRow.addView(textViewCodeName,1)
            tableRow.setBackgroundResource(R.color.pink_bg)


            val divider = View(this)
            divider.layoutParams = TableRow.LayoutParams(3, 15)
            divider.setBackgroundResource(R.color.white)
            table.addView(divider)
            table.addView(tableRow)

        }
    }
}