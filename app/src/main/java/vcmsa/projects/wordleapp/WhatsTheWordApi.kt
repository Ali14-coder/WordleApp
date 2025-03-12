package vcmsa.projects.wordleapp

import android.content.Context
import android.widget.Toast
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class WhatsTheWordApi {


    ///add getResults

    ///add getActualWord



    fun getGuess(context: Context, callback: (Guess) -> Unit){

        val retrofit : Retrofit = Retrofit.Builder().baseUrl("https://whatstheword-endzgscpazgjb5c7.southafricanorth-01.azurewebsites.net/swagger/index.html").addConverterFactory(
            GsonConverterFactory.create()).build()


        val service: ApiService = retrofit.create<ApiService>(ApiService::class.java)

        val call: Call<Guess> = service.getGuess()


        call.enqueue(object : Callback<Guess>{
            override fun onResponse(response: Response<Guess>?, retrofit: Retrofit?) {

                if (response!!.isSuccessful){
                    val guess: Guess = response.body() as Guess

                    callback(guess)
                }
            }

            override fun onFailure(t: Throwable?) {
                Toast.makeText(context, "Request Fail", Toast.LENGTH_SHORT).show()
            }
        })
    }
}