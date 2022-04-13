package com.example.chakra

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.chakra.databinding.ActivityReceiptEmptyBinding

class ReceiptEmptyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReceiptEmptyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReceiptEmptyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spannable = SpannableString("9 Juni 2021 5:08 PM")
        spannable.setSpan(
            ForegroundColorSpan(Color.LTGRAY),
            0,4,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
}