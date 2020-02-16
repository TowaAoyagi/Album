package app.aoyagi.makkan.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = Intent(this, PreviewActivity::class.java)
        albumImage1.setOnClickListener {
            setIntent(preview, R.drawable.apple, "apple")
        }
        albumImage2.setOnClickListener {
            setIntent(preview, R.drawable.camscanner, "camscanner")
        }
        albumImage3.setOnClickListener {
            setIntent(preview, R.drawable.google, "google")
        }
        albumImage4.setOnClickListener {
            setIntent(preview, R.drawable.googlefit, "googlefit")
        }
        albumImage5.setOnClickListener {
            setIntent(preview, R.drawable.makkan, "makkan")
        }
        albumImage6.setOnClickListener {
            setIntent(preview, R.drawable.mikan, "mikan")
        }


    }

    fun setIntent(intent: Intent, resId: Int, value: String) {

        intent.putExtra("image", resId)
        intent.putExtra("title", value)
        startActivity(intent)

    }
}
