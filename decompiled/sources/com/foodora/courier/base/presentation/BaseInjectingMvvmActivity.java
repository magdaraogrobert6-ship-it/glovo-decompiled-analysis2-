package com.foodora.courier.base.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.push.presentation.BasePushMessagesViewModel;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public abstract class BaseInjectingMvvmActivity<Component, VM extends BasePushMessagesViewModel> extends MvvmActivity<VM> {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    private Component MediaBrowserCompatMediaItem;

    public abstract Component IconCompatParcelizer();

    public abstract void IconCompatParcelizer(Component component);

    @Override // com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Component componentIconCompatParcelizer = IconCompatParcelizer();
        this.MediaBrowserCompatMediaItem = componentIconCompatParcelizer;
        componentIconCompatParcelizer.getClass();
        IconCompatParcelizer(componentIconCompatParcelizer);
        super.onCreate(bundle);
        int i4 = MediaSessionCompatQueueItem + 57;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
