package com.example.exchange_app.network

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

class RequestInspector : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val request = originalRequest.newBuilder().url(originalRequest.url).build()
//        request.toString().print()

        return chain.proceed(request)
    }
}
//fun String.print(tag: String = "asd") = Log.d(tag, this)
