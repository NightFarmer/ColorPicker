package com.nightfarmer.colorpicker

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        color_picker.onChoose = {
            v_preview.setBackgroundColor(it)
            v_preview.text = "#" + Integer.toHexString(it)
        }
        color_picker.setColor(Color.RED)

        v_color1.setBackgroundColor(Color.parseColor("#FFEA7B7B"))
        v_color1.setText("#FFEA7B7B")
        v_color1.setOnClickListener {
            color_picker.setColor(Color.parseColor("#FFEA7B7B"))
        }
        v_color2.setBackgroundColor(Color.parseColor("#FFFF8A3A"))
        v_color2.setText("#FFFF8A3A")
        v_color2.setOnClickListener {
            color_picker.setColor(Color.parseColor("#FFFF8A3A"))
        }
        v_color3.setBackgroundColor(Color.parseColor("#FF7ABE81"))
        v_color3.setText("#FF7ABE81")
        v_color3.setOnClickListener {
            color_picker.setColor(Color.parseColor("#FF7ABE81"))
        }
    }
}
