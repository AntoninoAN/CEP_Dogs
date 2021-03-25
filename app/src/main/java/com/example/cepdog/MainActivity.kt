package com.example.cepdog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cepdog.view.DogAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.recycler).apply {
            adapter = DogAdapter(factoryDataEmpty())
            layoutManager = LinearLayoutManager(this@MainActivity,
            LinearLayoutManager.HORIZONTAL, false)
        }
    }

    private fun factoryData(): List<String>{
        return listOf(
        "https://images.dog.ceo/breeds/hound-blood/n02088466_7195.jpg",
        "https://images.dog.ceo/breeds/affenpinscher/n02110627_3972.jpg",
        "https://images.dog.ceo/breeds/dane-great/n02109047_19984.jpg"
        )
    }

    private fun factoryDataEmpty(): List<String>{
        return emptyList()
    }
}

//debug the data (understand the json response, endpoint structure)
//item_layout XML
//Adapter //Viewholder
//LayoutManager