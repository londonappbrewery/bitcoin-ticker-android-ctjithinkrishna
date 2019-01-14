package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinPrice {

    private String mPrice;


    public static BitcoinPrice fromJson(JSONObject jsonObject) {
        try{
            BitcoinPrice bitcoinPrice = new BitcoinPrice();
            bitcoinPrice.mPrice = jsonObject.getString("ask");
            return bitcoinPrice;
        }
        catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }
}