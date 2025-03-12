package vcmsa.projects.wordleapp

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
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
    lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        for (i in 1..6){

            when(i){
                1 ->{
                    guessOne = arrayOf(findViewById(R.id.r0c0),findViewById(R.id.r0c1),findViewById(R.id.r0c2),findViewById(R.id.r0c3),findViewById(R.id.r0c4))
                    btnSubmit = findViewById(R.id.btnSubmit)


                    btnSubmit.setOnClickListener{
                        WhatsTheWordApi().getResults(this,guessOne) { result  ->



                        }

                    }
                }
                2 ->{
                    guessTwo = arrayOf(findViewById(R.id.r1c0),findViewById(R.id.r1c1),findViewById(R.id.r1c2),findViewById(R.id.r1c3),findViewById(R.id.r1c4))

                    btnSubmit.setOnClickListener{
                        WhatsTheWordApi().getResults(this, guessTwo) { result ->



                        }

                    }
                }
                3 ->{
                    guessThree= arrayOf(findViewById(R.id.r2c0),findViewById(R.id.r2c1),findViewById(R.id.r2c2),findViewById(R.id.r2c3),findViewById(R.id.r2c4))

                    btnSubmit.setOnClickListener{
                        WhatsTheWordApi().getResults(this,guessThree) {  result->



                        }

                    }
                }
                4 ->{
                    guessFour = arrayOf(findViewById(R.id.r3c0),findViewById(R.id.r3c1),findViewById(R.id.r3c2),findViewById(R.id.r3c3),findViewById(R.id.r3c4))

                    btnSubmit.setOnClickListener{
                        WhatsTheWordApi().getResults(this, guessTwo) { result ->



                        }

                    }
                }
                5 ->{
                    guessFive = arrayOf(findViewById(R.id.r4c0),findViewById(R.id.r4c1),findViewById(R.id.r4c2),findViewById(R.id.r4c3),findViewById(R.id.r4c4))

                    btnSubmit.setOnClickListener{
                        WhatsTheWordApi().getResults(this, guessTwo) { result ->



                        }

                    }
                }
                6 ->{
                    guessSix = arrayOf(findViewById(R.id.r5c0),findViewById(R.id.r5c1),findViewById(R.id.r5c2),findViewById(R.id.r5c3),findViewById(R.id.r5c4))

                    btnSubmit.setOnClickListener{
                        WhatsTheWordApi().getResults(this, guessTwo) { result ->



                        }

                    }
                }
            }

        }
















    }
}