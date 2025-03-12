package vcmsa.projects.wordleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    private lateinit var guessOne :Array<String>
    private lateinit var guessTwo :Array<String>
    private lateinit var guessThree :Array<String>
    private lateinit var guessFour :Array<String>
    private lateinit var guessFive :Array<String>
    private lateinit var guessSix :Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        guessOne = arrayOf(findViewById(R.id.r0c0),findViewById(R.id.r0c1),findViewById(R.id.r0c2),findViewById(R.id.r0c3),findViewById(R.id.r0c4))

        guessOne.setOnClickListener{
            WhatsTheWordApi.getGuess(this) { _______ ->



            }

        }

        guessTwo = arrayOf(findViewById(R.id.r1c0),findViewById(R.id.r1c1),findViewById(R.id.r1c2),findViewById(R.id.r1c3),findViewById(R.id.r1c4))

        guessOne.setOnClickListener{
            WhatsTheWordApi.getGuess(this) { _______ ->



            }

        }

        guessThree= arrayOf(findViewById(R.id.r2c0),findViewById(R.id.r2c1),findViewById(R.id.r2c2),findViewById(R.id.r2c3),findViewById(R.id.r2c4))

        guessOne.setOnClickListener{
            WhatsTheWordApi.getGuess(this) { _______ ->



            }

        }

        guessFour = arrayOf(findViewById(R.id.r3c0),findViewById(R.id.r3c1),findViewById(R.id.r3c2),findViewById(R.id.r3c3),findViewById(R.id.r3c4))

        guessOne.setOnClickListener{
            WhatsTheWordApi.getGuess(this) { _______ ->



            }

        }

        guessFive = arrayOf(findViewById(R.id.r4c0),findViewById(R.id.r4c1),findViewById(R.id.r4c2),findViewById(R.id.r4c3),findViewById(R.id.r4c4))

        guessOne.setOnClickListener{
            WhatsTheWordApi.getGuess(this) { _______ ->



            }

        }

        guessSix = arrayOf(findViewById(R.id.r5c0),findViewById(R.id.r5c1),findViewById(R.id.r5c2),findViewById(R.id.r5c3),findViewById(R.id.r5c4))

        guessOne.setOnClickListener{
            WhatsTheWordApi.getGuess(this) { _______ ->



            }

        }







    }
}