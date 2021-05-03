package com.example.myapplication

//import android.R
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
/*    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

 */

    var constraintLayout: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a ConstraintLayout in which to add the ImageView
        constraintLayout = ConstraintLayout(this)

        // Instantiate an ImageView and define its properties
        val i = ImageView(this)
        i.setImageResource(R.drawable.my_image)
        i.setContentDescription(resources.getString(R.string.my_image_desc))

        // set the ImageView bounds to match the Drawable's dimensions
        i.setAdjustViewBounds(true)
        i.setLayoutParams(ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT))

        // Add the ImageView to the layout and set the layout as the content view.
        constraintLayout!!.addView(i)
        setContentView(constraintLayout)
    }
}