package vcmsa.projects.wordleapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST
    fun getGuess(): Call<Guess>

    @GET("CheckWord")
    fun getGuessResults(): Call<Guess>
}