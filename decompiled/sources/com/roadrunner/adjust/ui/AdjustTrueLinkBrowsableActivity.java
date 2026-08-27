package com.roadrunner.adjust.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import coil3.RealImageLoader$execute$2$job$1;
import com.google.re2j.Parser;
import com.roadrunner.adjust.implementation.AdjustDynamicLinkException;
import com.ui.common.base.BaseInjectionActivity;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.mergeChildui;
import o.r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.removeNodeAtDepth;
import o.toBitmapConfig1JJdX4A;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustTrueLinkBrowsableActivity extends BaseInjectionActivity {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public mergeChildui MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ MediaSessionCompatQueueItem;

    public static final /* synthetic */ void write(AdjustTrueLinkBrowsableActivity adjustTrueLinkBrowsableActivity, Uri uri) {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        adjustTrueLinkBrowsableActivity.read(uri);
        int i4 = RatingCompat + 41;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final void read(Uri uri) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 47;
        RatingCompat = i2 % Fields.SpotShadowColor;
        ((Parser.Pair) (i2 % 2 != 0 ? RemoteActionCompatParcelizer() : RemoteActionCompatParcelizer())).serializer((Activity) this, uri, true);
    }

    public final r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ r8lambda8mkyolzlh_k8e1g4buhcvycf8wq = this.MediaSessionCompatQueueItem;
        if (r8lambda8mkyolzlh_k8e1g4buhcvycf8wq == null) {
            removeNodeAtDepth.serializer("deepLinkNavigator");
            throw null;
        }
        int i4 = i3 + 75;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda8mkyolzlh_k8e1g4buhcvycf8wq;
    }

    public final mergeChildui write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 73;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        mergeChildui mergechildui = this.MediaDescriptionCompat;
        if (mergechildui == null) {
            removeNodeAtDepth.serializer("adjustDeepLinkProcessor");
            throw null;
        }
        int i4 = i2 + 75;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return mergechildui;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer("adjust dynamic link activity is opened", new Object[0]);
        Intent intent = getIntent();
        ShortNewsContentCardView shortNewsContentCardView = null;
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new RealImageLoader$execute$2$job$1(this, data, shortNewsContentCardView, 22), 3);
            return;
        }
        forest.write(new AdjustDynamicLinkException("No URI data received in intent."));
        read(Uri.parse("roadrunner://main"));
        int i4 = RatingCompat + 99;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
