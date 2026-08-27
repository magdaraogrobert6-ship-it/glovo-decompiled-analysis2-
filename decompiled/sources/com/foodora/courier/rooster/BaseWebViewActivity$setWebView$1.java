package com.foodora.courier.rooster;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseWebViewActivity$setWebView$1 extends WebChromeClient {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ BaseWebViewActivity serializer;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        int i2 = 2 % 2;
        int i3 = read + 75;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        webView.getClass();
        this.serializer.RemoteActionCompatParcelizer(i);
        int i5 = read + 95;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = read + 55;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (permissionRequest != null) {
            int i5 = i3 + 101;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            permissionRequest.grant(permissionRequest.getResources());
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        int i = 2 % 2;
        int i2 = read + 57;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            valueCallback.getClass();
            str.getClass();
            str2.getClass();
            IconCompatParcelizer(valueCallback, null);
            return;
        }
        valueCallback.getClass();
        str.getClass();
        str2.getClass();
        IconCompatParcelizer(valueCallback, null);
        obj.hashCode();
        throw null;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            valueCallback.getClass();
            IconCompatParcelizer(valueCallback, null);
            int i3 = 51 / 0;
        } else {
            valueCallback.getClass();
            IconCompatParcelizer(valueCallback, null);
        }
        int i4 = read + 71;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            valueCallback.getClass();
            str.getClass();
            IconCompatParcelizer(valueCallback, str);
            obj.hashCode();
            throw null;
        }
        valueCallback.getClass();
        str.getClass();
        IconCompatParcelizer(valueCallback, str);
        int i3 = RemoteActionCompatParcelizer + 69;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void IconCompatParcelizer(ValueCallback valueCallback, String str) {
        int i = 2 % 2;
        BaseWebViewActivity baseWebViewActivity = this.serializer;
        baseWebViewActivity.write((ValueCallback<Uri>) valueCallback);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (str != null) {
            int i2 = read + 81;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                intent.setType(str);
                throw null;
            }
            intent.setType(str);
            int i3 = read + 15;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            intent.setType("*/*");
        }
        baseWebViewActivity.startActivityForResult(Intent.createChooser(intent, "File Browser"), baseWebViewActivity.RemoteActionCompatParcelizer());
        int i5 = read + 11;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intentCreateIntent;
        int i = 2 % 2;
        BaseWebViewActivity baseWebViewActivity = this.serializer;
        ValueCallback<Uri[]> valueCallbackMediaBrowserCompatMediaItem = baseWebViewActivity.MediaBrowserCompatMediaItem();
        if (valueCallbackMediaBrowserCompatMediaItem != null) {
            int i2 = RemoteActionCompatParcelizer + 83;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                valueCallbackMediaBrowserCompatMediaItem.onReceiveValue(null);
                throw null;
            }
            valueCallbackMediaBrowserCompatMediaItem.onReceiveValue(null);
        }
        baseWebViewActivity.IconCompatParcelizer(null);
        baseWebViewActivity.IconCompatParcelizer(valueCallback);
        if (fileChooserParams != null) {
            int i3 = RemoteActionCompatParcelizer + 29;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            try {
                intentCreateIntent = fileChooserParams.createIntent();
            } catch (ActivityNotFoundException unused) {
                baseWebViewActivity.IconCompatParcelizer(null);
                Toast.makeText(baseWebViewActivity.getApplicationContext(), "Cannot Open File Chooser", 1).show();
                return false;
            } catch (IllegalArgumentException unused2) {
                return false;
            }
        } else {
            int i5 = RemoteActionCompatParcelizer + 119;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            intentCreateIntent = null;
        }
        if (intentCreateIntent == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        baseWebViewActivity.startActivityForResult(intentCreateIntent, baseWebViewActivity.MediaSessionCompatQueueItem());
        int i7 = RemoteActionCompatParcelizer + 85;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
