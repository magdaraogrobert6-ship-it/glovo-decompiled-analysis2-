package com.roadrunner.push.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.push.presentation.BasePushMessagesViewModel;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PushMessagesInjectionActivity<VM extends BasePushMessagesViewModel> extends PushMessagesActivity<VM> implements convertStringJsonArrayToList {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public constructJsonArray MediaSessionCompatResultReceiverWrapper;

    @Override // o.convertStringJsonArrayToList
    public r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        constructJsonArray constructjsonarrayMediaDescriptionCompat = MediaDescriptionCompat();
        int i4 = MediaBrowserCompatMediaItem + 23;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return constructjsonarrayMediaDescriptionCompat;
    }

    @Override // com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            removeNodeAtDepth.write(this);
            super.onCreate(bundle);
        } else {
            removeNodeAtDepth.write(this);
            super.onCreate(bundle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final constructJsonArray MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 9;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        constructJsonArray constructjsonarray = this.MediaSessionCompatResultReceiverWrapper;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i4 = i2 + 17;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return constructjsonarray;
        }
        throw null;
    }

    @Override // com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
