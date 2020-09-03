package com.laioffer.tinnews2.network;

import android.content.Context;

import com.ashokvarma.gander.GanderInterceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Define a Retrofit client to call backend service
 */
public class RetrofitClient {
    private static final String API_KEY = "2656679c5ff546f7a753548f0564acbf";
    private static final String BASE_URL = "https://newsapi.org/v2/";

    public static Retrofit newInstance(Context context) {

        // Authentication with OkHttp interceptors
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .addInterceptor(new HeaderInterceptor())
                .addInterceptor(new GanderInterceptor(context).showNotification(true))
                .build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    private static class HeaderInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request original = chain.request();
            Request request = original
                    .newBuilder()
                    .header("X-Api-Key", API_KEY)
                    .build();
            return chain.proceed(request);
        }
    }
}
