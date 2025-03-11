package vcmsa.projects.wordleapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface ApiService {

    @POST
    fun getGuess(guess: Guess): Call<Guess>

    @GET("CheckWord")
    fun getGuessResults(): Call<Guess>
}