package edu.ib.rdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rclNames=findViewById<RecyclerView>(R.id.rclNames)
        val nameList=getListOfNames()

        val namesAdapter=NameAdapter(nameList)
        rclNames.adapter=namesAdapter
        rclNames.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)


    }

    private fun getListOfNames() : MutableList<String>{
        val nameList= mutableListOf<String>()
        nameList.add("Jan")
        nameList.add("Ola")
        nameList.add("Adam")
        nameList.add("Ewa")
        nameList.add("Jakub")
        nameList.add("Tomasz")
        nameList.add("Kasia")
        nameList.add("Basia")
        nameList.add("Henryk")
        nameList.add("Grzegorz")
        nameList.add("Kasia")
        nameList.add("Basia")
        nameList.add("Henryk")
        nameList.add("Grzegorz")
        nameList.add("Kasia")
        nameList.add("Basia")
        nameList.add("Henryk")
        nameList.add("Grzegorz")

        return nameList
    }
}