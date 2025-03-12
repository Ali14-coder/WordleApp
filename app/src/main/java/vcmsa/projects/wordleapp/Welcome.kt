package vcmsa.projects.wordleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Button click to start the game
        var btnPlay : Button =findViewById(R.id.btnPlay)
        var actualWord : Char
        var wordApi = WhatsTheWordApi()

        btnPlay.setOnClickListener()
        {
            //a word is generated when the 'play' button is clicked

            //Connects to api and calls the getActualWord method to generate a start word.
         //   actualWord = wordApi.getActualWord()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }

    }
}