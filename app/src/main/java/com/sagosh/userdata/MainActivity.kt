package com.sagosh.userdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sagosh.userdata.api.ApiInterface
import com.sagosh.userdata.api.ApiUtilities
import kotlinx.coroutines.GlobalScope
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity : AppCompatActivity() {
    lateinit var adapter: adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userApi = ApiUtilities.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {
            val result = userApi.getUsers()
            if (result != null)
            // Checking the results
                Log.d("Sagosh", "onCreate: ${result.toString()}")
                adapter = adapter(this@MainActivity)
            UserLisr.adapter = adapter
            userList.layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }
}