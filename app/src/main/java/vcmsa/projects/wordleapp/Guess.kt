package vcmsa.projects.wordleapp

//import retrofit2.Call
//import retrofit2.http.GET

class Guess {


    lateinit var guess:Array<String>
    lateinit var result: Array<String>
    fun GetGuess(guess: Array<String>){
        this.guess = guess
    }

    fun GetResults(result: Array<String>){
        this.result = result
    }

}