package com.example.myapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.flutter.embedding.android.FlutterFragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt = supportFragmentManager.beginTransaction();
        val fr = FlutterFragment.withNewEngine().initialRoute("").build<FlutterFragment>()
        bt.replace(R.id.frm, fr)
        bt.commit()
    }
}
