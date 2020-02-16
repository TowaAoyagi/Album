package app.aoyagi.makkan.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        //intent = getter
        val imageId = intent.getIntExtra("image", 0)
        val displayTitle = intent.getStringExtra("title")

        previewImage.setImageResource(imageId)
        titleText.text = displayTitle

        backButton.setOnClickListener {
            finish()
        }
    }
}
