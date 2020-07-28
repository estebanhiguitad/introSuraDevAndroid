package co.com.ceiba.introsuradevandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layouts_topic.*

class LayoutsTopicActivity : AppCompatActivity() {

    private lateinit var onButtonConstraints: View.OnClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts_topic)
        setSupportActionBar(findViewById(R.id.toolbar))
        setEvents()
        buttonConstraints.setOnClickListener(onButtonConstraints)
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }


    private fun setEvents() {
        onButtonConstraints = View.OnClickListener {
            val layoutIntent = Intent(this, ConstraintLayoutsActivity::class.java)
            startActivity(layoutIntent)
        }
    }
}