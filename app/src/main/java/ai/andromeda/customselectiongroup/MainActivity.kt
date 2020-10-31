package ai.andromeda.customselectiongroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridLayout

class MainActivity : AppCompatActivity() {

    private lateinit var customSelectionGroup: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customSelectionGroup = findViewById(R.id.myGridLayout)
    }

    fun onCustomItemClick(v: View) {
        customSelectionGroup.selectChild(v)
    }
}