package vcmsa.projects.wordleapp

import android.content.Context
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WhatsTheWordApi {

    private var url : String = "https://whatstheword-endzgscpazgjb5c7.southafricanorth-01.azurewebsites.net/swagger/index.html"

    fun getActualWord(context: Context, callback: (Guess) -> Unit){
        val retrofit : Retrofit = Retrofit.Builder().baseUrl(url).addConverterFactory(
            GsonConverterFactory.create()).build()


        val service: ApiService = retrofit.create<ApiService>(ApiService::class.java)

        val call: Call<Guess> = service.getActualWord()


        call.enqueue( object: Callback<Guess>{
            override fun onResponse(call: Call<Guess>, response: Response<Guess>)
            {

                if (response!!.isSuccessful){
                    val ActualWord: Guess = response.body() as Guess

                    callback(ActualWord)
                }
            }

            override fun onFailure(call: Call<Guess>, t: Throwable)
            {
                Toast.makeText(context, "Request Fail", Toast.LENGTH_SHORT).show()
            }
        })



    }
    fun getResults(context: Context, guessWord: Array<String> ,callback: (Guess) -> Unit){

        val retrofit : Retrofit = Retrofit.Builder().baseUrl(url).addConverterFactory(
            GsonConverterFactory.create()).build()


        val service: ApiService = retrofit.create<ApiService>(ApiService::class.java)

        val call: Call<Guess> = service.getGuessResults(guessWord)

        call.enqueue( object: Callback<Guess>{
             override fun onResponse(call: Call<Guess>, response: Response<Guess>)
            {

                if (response!!.isSuccessful){
                    val Result: Guess = response.body() as Guess

                    callback(Result)
                }
            }

             override fun onFailure(call: Call<Guess>, t: Throwable)
             {
                Toast.makeText(context, "Request Fail", Toast.LENGTH_SHORT).show()
            }
        })
    }
}