package com.example.saiabhinaypidugu.af.retrofitService;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by saiabhinaypidugu on 1/24/18.
 */

public class ProductAsynchronous extends AsyncTask<String, String, String> {
Context context;
    public ProductAsynchronous(Context context){
        this.context = context;
    }
    @Override
    protected String doInBackground(String... strings) {

        String json = loadJSONFromAsset(context);
        Log.d("tag", json);
        return json;
    }


    @Override
    protected void onPostExecute(String result) {
        //TODO attachArrayList
        super.onPostExecute(result);
    }

    public String loadJSONFromAsset(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        InputStream is = null;
        String json = null;
        try {
             is = context.getAssets().open("result.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
}
