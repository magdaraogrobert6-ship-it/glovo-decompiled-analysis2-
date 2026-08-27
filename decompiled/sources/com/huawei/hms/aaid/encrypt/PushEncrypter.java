package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.l;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.ComposeScrollCaptureCallbackonScrollCaptureImageRequest1;
import o.accessmaxIntrinsicWidthjd;

/* JADX INFO: loaded from: classes2.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strB = l.b(context);
        if (TextUtils.isEmpty(str)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(strB)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 1 key is null");
            return "";
        }
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(strB);
        if (bArrRemoteActionCompatParcelizer.length >= 16) {
            return ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.write(str, bArrRemoteActionCompatParcelizer);
        }
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String encrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strB = l.b(context);
        if (TextUtils.isEmpty(str)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(strB)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 1 key is null");
            return "";
        }
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(strB);
        if (bArrRemoteActionCompatParcelizer.length >= 16) {
            return ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.IconCompatParcelizer(str, bArrRemoteActionCompatParcelizer);
        }
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String encrypterOld(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.IconCompatParcelizer(str, l.a(context));
    }
}
