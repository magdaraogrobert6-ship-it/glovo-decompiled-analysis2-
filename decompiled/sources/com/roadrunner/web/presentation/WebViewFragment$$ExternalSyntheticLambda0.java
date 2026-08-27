package com.roadrunner.web.presentation;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.IOException;
import o.getNavigationEventDispatcher;
import o.onBackPressed;
import o.r8lambda43nB7leLWjup6aTdW2xmA7XSAs;
import o.recreateDisplayListIfNeeded;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class WebViewFragment$$ExternalSyntheticLambda0 implements r8lambda43nB7leLWjup6aTdW2xmA7XSAs, getNavigationEventDispatcher {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ WebViewFragment serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ WebViewFragment$$ExternalSyntheticLambda0(WebViewFragment webViewFragment, int i) {
        this.write = i;
        this.serializer = webViewFragment;
    }

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        Uri uri;
        int i = 2 % 2;
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.write;
        WebViewFragment webViewFragment = this.serializer;
        if (i3 != 1) {
            Uri[] uriArr = (!((Boolean) obj).booleanValue() || (uri = webViewFragment.onRetainCustomNonConfigurationInstance) == null) ? null : new Uri[]{uri};
            ValueCallback valueCallback = webViewFragment.onConfigurationChanged;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
            }
            webViewFragment.onRetainCustomNonConfigurationInstance = null;
            webViewFragment.onConfigurationChanged = null;
            return;
        }
        ActivityResult activityResult = (ActivityResult) obj;
        ValueCallback valueCallback2 = webViewFragment.onConfigurationChanged;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(activityResult.write, activityResult.RemoteActionCompatParcelizer));
            webViewFragment.onConfigurationChanged = null;
            int i4 = RemoteActionCompatParcelizer + 113;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = read + 79;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambda43nB7leLWjup6aTdW2xmA7XSAs
    public void serializer(boolean z) throws IOException {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager;
        int i = 2 % 2;
        WebViewFragment webViewFragment = this.serializer;
        if (!z) {
            ValueCallback valueCallback = webViewFragment.onConfigurationChanged;
            if (valueCallback != null) {
                int i2 = read + 81;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                valueCallback.onReceiveValue(null);
            }
            webViewFragment.onConfigurationChanged = null;
            return;
        }
        if (webViewFragment.onTrimMemory == null) {
            int i4 = read + 47;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                Timber.RemoteActionCompatParcelizer.read("Take picture is called after fragment is destroyed", new Object[1]);
                return;
            } else {
                Timber.RemoteActionCompatParcelizer.read("Take picture is called after fragment is destroyed", new Object[0]);
                return;
            }
        }
        Context context = webViewFragment.getContext();
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            int i5 = read + 9;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            resolveInfoResolveActivity = null;
        } else {
            resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.media.action.IMAGE_CAPTURE"), 65536);
        }
        if (resolveInfoResolveActivity == null) {
            Timber.RemoteActionCompatParcelizer.read("No camera app available to handle image capture", new Object[0]);
            ValueCallback valueCallback2 = webViewFragment.onConfigurationChanged;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            webViewFragment.onConfigurationChanged = null;
            return;
        }
        recreateDisplayListIfNeeded recreatedisplaylistifneeded = webViewFragment.onMenuItemSelected;
        if (recreatedisplaylistifneeded == null) {
            removeNodeAtDepth.serializer("imageFileManager");
            throw null;
        }
        if (webViewFragment.initializeViewTreeOwners == null) {
            removeNodeAtDepth.serializer("getUniqueImageFileNamePrefix");
            throw null;
        }
        File fileIconCompatParcelizer = recreatedisplaylistifneeded.IconCompatParcelizer("JPEG_" + System.currentTimeMillis() + BundleUtil.UNDERLINE_TAG);
        recreateDisplayListIfNeeded recreatedisplaylistifneeded2 = webViewFragment.onMenuItemSelected;
        if (recreatedisplaylistifneeded2 == null) {
            removeNodeAtDepth.serializer("imageFileManager");
            throw null;
        }
        Uri uri = recreatedisplaylistifneeded2.read(fileIconCompatParcelizer);
        webViewFragment.onRetainCustomNonConfigurationInstance = uri;
        onBackPressed onbackpressed = webViewFragment.onTrimMemory;
        if (onbackpressed != null) {
            onbackpressed.write(uri);
        }
        int i7 = RemoteActionCompatParcelizer + 119;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
