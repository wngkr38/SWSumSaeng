package com.example.myapplication;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Firebase 초기화
        FirebaseApp.initializeApp(this);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        // 카카오 SDK 초기화
        KakaoSdk.init(this, "5cfae1ed54ef36d387012e1b8cded946");
    }
}
