package com.foodora.courier.base.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseInjectingActivity<Component> extends BaseActivity {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private Component RatingCompat;

    public abstract void read(Component component);

    public abstract Component write();

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 61;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Component componentWrite = write();
        this.RatingCompat = componentWrite;
        componentWrite.getClass();
        read(componentWrite);
        super.onCreate(bundle);
        int i4 = MediaDescriptionCompat + 105;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
