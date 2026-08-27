package com.foodora.courier.rooster;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import coil3.network.NetworkFetcher;
import com.foodora.courier.base.presentation.BaseActivity;
import com.foodora.courier.base.presentation.BaseInjectingActivity;
import com.foodora.courier.base.presentation.view.presenter.BasePresenter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.LazyKt__LazyJVMKt;
import o.onItemDismisslambda0;
import o.onTrimMemory;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public abstract class BaseWebViewActivity<Component, V extends BaseActivity, P extends BasePresenter> extends BaseInjectingActivity<Component> {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    private ValueCallback<Uri> MediaBrowserCompatMediaItem;
    private final int MediaDescriptionCompat = 1;
    private final int MediaSessionCompatQueueItem = 100;
    private ValueCallback<Uri[]> PlaybackStateCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public P RatingCompat;

    public abstract ProgressBar IconCompatParcelizer();

    public final void IconCompatParcelizer(ValueCallback<Uri[]> valueCallback) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 23;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        if (i2 % 2 != 0) {
            this.PlaybackStateCompat = valueCallback;
            int i4 = 44 / 0;
        } else {
            this.PlaybackStateCompat = valueCallback;
        }
        int i5 = i3 + 97;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ValueCallback<Uri[]> MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 81;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        ValueCallback<Uri[]> valueCallback = this.PlaybackStateCompat;
        int i5 = i3 + 69;
        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return valueCallback;
    }

    public final int MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 65;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        int i5 = this.MediaSessionCompatQueueItem;
        int i6 = i3 + 43;
        MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        int i5 = this.MediaDescriptionCompat;
        int i6 = i3 + 37;
        MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final void write(ValueCallback<Uri> valueCallback) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 13;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.MediaBrowserCompatMediaItem = valueCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.MediaBrowserCompatMediaItem = valueCallback;
        int i4 = i2 + 49;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    public final P read() {
        int i = 2 % 2;
        P p = this.RatingCompat;
        if (p == null) {
            removeNodeAtDepth.serializer("presenter");
            throw null;
        }
        int i2 = PlaybackStateCompatCustomAction + 53;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return p;
        }
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 79;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onStop();
            read().RemoteActionCompatParcelizer.read();
        } else {
            super.onStop();
            read().RemoteActionCompatParcelizer.read();
            int i3 = 29 / 0;
        }
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 95;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            int i4 = MediaSessionCompatResultReceiverWrapper + 65;
            PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((AppCompatActivity) this);
        }
        return super.onContextItemSelected(menuItem);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        ProgressBar progressBarIconCompatParcelizer;
        int i2;
        int i3 = 2 % 2;
        IconCompatParcelizer().setProgress(i);
        if (i != 100) {
            IconCompatParcelizer().setVisibility(0);
            int i4 = PlaybackStateCompatCustomAction + 99;
            MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
                return;
            }
            return;
        }
        int i6 = PlaybackStateCompatCustomAction + 111;
        MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            progressBarIconCompatParcelizer = IconCompatParcelizer();
            i2 = 103;
        } else {
            progressBarIconCompatParcelizer = IconCompatParcelizer();
            i2 = 8;
        }
        progressBarIconCompatParcelizer.setVisibility(i2);
        int i7 = MediaSessionCompatResultReceiverWrapper + 57;
        PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint
    @onItemDismisslambda0
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == this.MediaSessionCompatQueueItem) {
            int i4 = PlaybackStateCompatCustomAction + 115;
            MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ValueCallback<Uri[]> valueCallback = this.PlaybackStateCompat;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
                this.PlaybackStateCompat = null;
                return;
            }
            return;
        }
        if (i != this.MediaDescriptionCompat) {
            Toast.makeText(getApplicationContext(), "Failed to Upload", 1).show();
            int i6 = PlaybackStateCompatCustomAction + 71;
            MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        ValueCallback<Uri> valueCallback2 = this.MediaBrowserCompatMediaItem;
        if (valueCallback2 != null) {
            if (i2 == -1 && intent != null) {
                int i8 = MediaSessionCompatResultReceiverWrapper + 65;
                PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    data = intent.getData();
                    int i9 = 85 / 0;
                } else {
                    data = intent.getData();
                }
            } else {
                data = null;
            }
            valueCallback2.onReceiveValue(data);
            this.MediaBrowserCompatMediaItem = null;
        }
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        onTrimMemory supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = MediaSessionCompatResultReceiverWrapper + 115;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            supportActionBar.serializer(getResources().getDrawable(2131231808));
            int i4 = MediaSessionCompatResultReceiverWrapper + 23;
            PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        BasePresenter basePresenter = read();
        basePresenter.RemoteActionCompatParcelizer.read(basePresenter.IconCompatParcelizer.write().RemoteActionCompatParcelizer(AndroidSchedulers.RemoteActionCompatParcelizer()).subscribe(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(7, new NetworkFetcher.AnonymousClass2(basePresenter)), new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(8, new NetworkFetcher.AnonymousClass2(5, Timber.RemoteActionCompatParcelizer))));
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
