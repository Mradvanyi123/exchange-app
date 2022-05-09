package com.example.exchange_app.network

import okhttp3.Interceptor
import okhttp3.Response

class RequestInspector : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val request = originalRequest.newBuilder().url(originalRequest.url).build()
        println(request)
//        println(chain.proceed(request))
        return chain.proceed(request)
    }
}
//fun String.print(tag: String = "asd") = Log.d(tag, this)
