package org.baattezu.notesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1,"giselle","Giselle", "Жизель (кор. 지젤, яп. ジゼル) - южнокорейско-японская певица и рэпер компании SM Entertainment. Она является участницей женской группы aespa.", "vkusno", 10000000))
        items.add(Item(2,"karina","Karina", "Карина (кор. 카리나, яп. カリナ) - южнокорейская певица, рэпер и танцор компании SM Entertainment. Она является лидером женской группы aespa.", "vkusno", 10000000))
        items.add(Item(3,"winter","Winter", "Винтер (кор. 윈터, яп. ウィンター) — южнокорейская певица и танцор компании SM Entertainment. Она является участницей женской группы aespa.", "vkusno", 10000000))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}