package co.com.ceiba.introsuradevandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var onButtonLayoutClick: View.OnClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setEvents()
        buttonLayouts.setOnClickListener(onButtonLayoutClick)
    }

    private fun setEvents() {
        onButtonLayoutClick = View.OnClickListener {
            val layoutIntent = Intent(this, LayoutsTopicActivity::class.java)
            startActivity(layoutIntent)
        }
    }
}