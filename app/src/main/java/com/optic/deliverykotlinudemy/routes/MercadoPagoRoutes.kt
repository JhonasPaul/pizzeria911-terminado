package com.optic.deliverykotlinudemy.routes

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.optic.deliverykotlinudemy.models.MercadoPagoCardTokenBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface MercadoPagoRoutes {

    @GET("v1/payment_methods/installments?access_token=TEST-3925540669609241-081116-84fe48a6add1d3e06ae6c6a41afc1aa8-301066200")
    fun getInstallments(@Query("bin") bin: String, @Query("amount") amount: String): Call<JsonArray>

    @POST("v1/card_tokens?public_key=TEST-2f6b8832-d6d0-4ff4-87d5-d2fae0811200")
    fun createCardToken(@Body body: MercadoPagoCardTokenBody): Call<JsonObject>
}