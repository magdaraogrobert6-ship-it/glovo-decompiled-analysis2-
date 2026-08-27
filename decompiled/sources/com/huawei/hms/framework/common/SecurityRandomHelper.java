package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.accessminIntrinsicHeightjd;

/* JADX INFO: loaded from: classes4.dex */
public class SecurityRandomHelper {

    @SuppressLint
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public byte[] generateSecureRandom(int i) {
        return accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(i);
    }

    public String generateSecureRandomStr(int i) {
        return accessminIntrinsicHeightjd.read(i);
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                if (instance == null) {
                    ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("EncryptUtil");
                    instance = new SecurityRandomHelper();
                }
            }
        }
        return instance;
    }
}
