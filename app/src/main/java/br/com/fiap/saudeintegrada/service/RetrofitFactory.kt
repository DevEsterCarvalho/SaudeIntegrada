package br.com.fiap.saudeintegrada.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl("https://viacep.com.br/ws/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCepService(): CepService {
        return retrofitFactory.create(CepService::class.java)
    }

}
