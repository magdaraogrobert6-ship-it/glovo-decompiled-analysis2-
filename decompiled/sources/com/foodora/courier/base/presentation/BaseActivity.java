package com.foodora.courier.base.presentation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.roadrunner.deeplink.DeepLinkActivity;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import o.getWindowInfoannotations;
import o.lambdaisEnabled11;
import o.onItemDismisslambda0;
import o.setFocusable;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public abstract class BaseActivity extends AppCompatActivity implements lambdaisEnabled11 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;

    @Override // o.lambdaisEnabled11
    public void write(String str, PushAnalyticsData pushAnalyticsData) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            IconCompatParcelizer(str, pushAnalyticsData);
            int i3 = 72 / 0;
        } else {
            str.getClass();
            IconCompatParcelizer(str, pushAnalyticsData);
        }
        int i4 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getWindowInfoannotations getwindowinfoannotations = FirebasePerformance.RemoteActionCompatParcelizer;
            Trace traceIconCompatParcelizer = Trace.IconCompatParcelizer("base_activity_onCreate");
            traceIconCompatParcelizer.start();
            super.onCreate(bundle);
            traceIconCompatParcelizer.stop();
            return;
        }
        getWindowInfoannotations getwindowinfoannotations2 = FirebasePerformance.RemoteActionCompatParcelizer;
        Trace traceIconCompatParcelizer2 = Trace.IconCompatParcelizer("base_activity_onCreate");
        traceIconCompatParcelizer2.start();
        super.onCreate(bundle);
        traceIconCompatParcelizer2.stop();
        int i3 = 83 / 0;
    }

    public void serializer() {
        DialogFragment dialogFragment;
        int i = 2 % 2;
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("com.roadrunner.push.presentation.MessageDialogFragment");
        if (!(fragmentFindFragmentByTag instanceof DialogFragment)) {
            dialogFragment = null;
        } else {
            int i2 = MediaDescriptionCompat + 59;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            dialogFragment = (DialogFragment) fragmentFindFragmentByTag;
        }
        if (dialogFragment != null) {
            int i4 = MediaDescriptionCompat + 85;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                dialogFragment.RemoteActionCompatParcelizer();
                int i5 = 25 / 0;
            } else {
                dialogFragment.RemoteActionCompatParcelizer();
            }
            int i6 = MediaBrowserCompatMediaItem + 45;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    public void write(MessageDialogData messageDialogData) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        messageDialogData.getClass();
        if (messageDialogData.RemoteActionCompatParcelizer()) {
            int i4 = MediaDescriptionCompat + 53;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            serializer();
            setFocusable.read(messageDialogData).RemoteActionCompatParcelizer(getSupportFragmentManager(), "com.roadrunner.push.presentation.MessageDialogFragment");
        }
        int i6 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    private final void IconCompatParcelizer(String str, PushAnalyticsData pushAnalyticsData) {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) DeepLinkActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(str));
        intent.putExtra("analytics_data", pushAnalyticsData);
        startActivity(intent);
        int i2 = MediaDescriptionCompat + 19;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.lambdaisEnabled11
    public void read(MessageDialogData messageDialogData) {
        int i = 2 % 2;
        messageDialogData.getClass();
        boolean z = messageDialogData.read();
        if (!z) {
            if (z) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                int i2 = MediaBrowserCompatMediaItem + 113;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            return;
        }
        int i4 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int iMediaMetadataCompat = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
        int iMediaMetadataCompat2 = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
        RemoteActionCompatParcelizer((String) MessageDialogData.RemoteActionCompatParcelizer(970192040, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat2, -970192040, new Object[]{messageDialogData}), messageDialogData.IconCompatParcelizer());
        int i6 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void RemoteActionCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        intent.putExtra("syncState", true);
        if (str != null) {
            intent.putExtra("pushCategory", str);
        }
        if (str2 != null) {
            intent.putExtra("pushSourceTrigger", str2);
            int i2 = MediaDescriptionCompat + 21;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 3 % 5;
            }
        }
        if (!startActivityIfNeeded(intent, 0)) {
            int i4 = MediaDescriptionCompat + 11;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                onNewIntent(intent);
            } else {
                onNewIntent(intent);
                int i5 = 46 / 0;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
