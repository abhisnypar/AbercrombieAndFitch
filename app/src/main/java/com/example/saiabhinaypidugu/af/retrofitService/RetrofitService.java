package com.example.saiabhinaypidugu.af.retrofitService;

import com.example.saiabhinaypidugu.af.BuildConfig;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by saiabhinaypidugu on 1/24/18.
 */

public class RetrofitService {

    public static Retrofit getRetrofitInstance() {
         /*
        retrofit REST call with url and interceptor.
         */
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getOkHttpClient().build())
                .build();
    }

    public RetrofitServiceApi getRetrofitApiService() {

        return getRetrofitInstance().create(RetrofitServiceApi.class);
    }

    public static OkHttpClient.Builder getOkHttpClient() {
        final OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                return chain.proceed(request);
            }
        });
        return okHttpClientBuilder;
    }

   public interface RetrofitServiceApi {

        @POST("codetest/codeTest_exploreData.json/")
        Call<JsonResponse> getProductCardDetails();
    }
}
