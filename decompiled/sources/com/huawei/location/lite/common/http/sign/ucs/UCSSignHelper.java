package com.huawei.location.lite.common.http.sign.ucs;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.Transition$1;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.firebase.Timestamp;
import com.huawei.hmf.tasks.a.j;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.location.BuildConfig;
import com.huawei.location.lite.common.agc.AGCManager;
import com.huawei.location.lite.common.http.exception.AuthException;
import com.huawei.wisesecurity.ucs.common.exception.UcsCryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSignAlg;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSigner;
import com.sentiance.core.model.events.E$b;
import java.util.Arrays;
import java.util.Locale;
import o.TextActionModeCallback;
import o.WrappedCompositionsetContent1211;
import o.getOrder;
import o.isDisposed;
import o.toContentCaptureSession;

/* JADX INFO: loaded from: classes2.dex */
public final class UCSSignHelper {
    public Credential IconCompatParcelizer;
    public CredentialClient read;

    public final String serializer(Context context, E$b e$b) throws UcsCryptoException, UcsException, AuthException {
        WrappedCompositionsetContent1211.read();
        if (!IconCompatParcelizer(context)) {
            WrappedCompositionsetContent1211.read("UCSSignHelper", "Credential init fail,sign fail");
            throw new AuthException(isDisposed.write(10550));
        }
        Credential credential = this.IconCompatParcelizer;
        if (credential == null || serializer(Long.valueOf(credential.getExpireTime()))) {
            WrappedCompositionsetContent1211.read("UCSSignHelper", "credential is not ready");
            return "";
        }
        CredentialSigner credentialSignerBuild = new CredentialSigner.Builder().withCredential(this.IconCompatParcelizer).withAlg(CredentialSignAlg.HMAC_SHA256).withCredentialClient(this.read).build();
        String string = Long.toString(System.currentTimeMillis());
        Locale locale = Locale.ENGLISH;
        String str = (String) e$b.read;
        String str2 = (String) e$b.MediaDescriptionCompat;
        String str3 = (String) e$b.RemoteActionCompatParcelizer;
        String str4 = (String) e$b.IconCompatParcelizer;
        String accessKey = this.IconCompatParcelizer.getAccessKey();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append(str2);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append(str3);
        c8$$ExternalSyntheticOutline0.m(sb, ContainerUtils.FIELD_DELIMITER, str4, "&ak=", accessKey);
        String strM = ff$$ExternalSyntheticOutline0.m(sb, "&timestamp=", string);
        String[] strArr = (String[]) e$b.MediaMetadataCompat;
        if (!TextUtils.isEmpty(((String[]) Arrays.copyOf(strArr, strArr.length))[0])) {
            String[] strArr2 = (String[]) e$b.MediaMetadataCompat;
            strM = af$$ExternalSyntheticOutline0.m(strM, ContainerUtils.FIELD_DELIMITER, ((String[]) Arrays.copyOf(strArr2, strArr2.length))[0]);
        }
        "newStringToSign:".concat(strM);
        WrappedCompositionsetContent1211.read();
        String strSignBase64 = credentialSignerBuild.getSignHandler().from(strM).signBase64();
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("UCSSignHelper", "sign successful");
        String accessKey2 = this.IconCompatParcelizer.getAccessKey();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("EXT-AUTH-CLOUDSOA-HMAC-SHA256 appid=hmslocation,timestamp=", string, ",signature=", strSignBase64, ",ak=");
        sbM.append(accessKey2);
        String string2 = sbM.toString();
        String[] strArr3 = (String[]) e$b.MediaMetadataCompat;
        if (TextUtils.isEmpty(((String[]) Arrays.copyOf(strArr3, strArr3.length))[1])) {
            return string2;
        }
        String[] strArr4 = (String[]) e$b.MediaMetadataCompat;
        return af$$ExternalSyntheticOutline0.m(string2, ",signedHeaders=", ((String[]) Arrays.copyOf(strArr4, strArr4.length))[1]);
    }

    public static boolean serializer(Long l) {
        return System.currentTimeMillis() > l.longValue() || l.longValue() - System.currentTimeMillis() < 3600000;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean IconCompatParcelizer(Context context) {
        String str;
        Credential credentialGenCredentialFromString;
        Credential credentialApplyCredentialByEC;
        AGCManager aGCManager;
        Credential credential = this.IconCompatParcelizer;
        if (credential == null || serializer(Long.valueOf(credential.getExpireTime()))) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("UCSSignHelper", "init credential from sp");
            getOrder getorder = new getOrder("location_credential");
            long jWrite = getorder.write("credentialExpiredTime");
            if (jWrite <= 0 || serializer(Long.valueOf(jWrite))) {
                str = "sp credential is expired,credentialExpiredTime:" + jWrite;
            } else {
                String strRemoteActionCompatParcelizer = getorder.RemoteActionCompatParcelizer("credentialCache");
                if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                    WrappedCompositionsetContent1211.read("UCSSignHelper", "sp credential is null");
                    credentialGenCredentialFromString = null;
                } else {
                    try {
                        CredentialClient credentialClientBuild = new CredentialClient.Builder().context(context).build();
                        this.read = credentialClientBuild;
                        credentialGenCredentialFromString = credentialClientBuild.genCredentialFromString(strRemoteActionCompatParcelizer);
                    } catch (UcsException e) {
                        str = "init credential form sp failed :" + e.IconCompatParcelizer.delayRemaining;
                        WrappedCompositionsetContent1211.read("UCSSignHelper", str);
                        credentialGenCredentialFromString = null;
                    }
                }
                this.IconCompatParcelizer = credentialGenCredentialFromString;
                if (credentialGenCredentialFromString == null) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("UCSSignHelper", "init credential from network");
                    synchronized (this) {
                        try {
                            CredentialClient.Builder builderNetworkTimeOut = new CredentialClient.Builder().context(context).serCountry(TextActionModeCallback.RemoteActionCompatParcelizer()).networkRetryTime(1).networkTimeOut(10000);
                            AGCManager.read().getClass();
                            int i = 27;
                            CredentialClient credentialClientBuild2 = builderNetworkTimeOut.appId(AGCManager.serializer()).grsCapability(new Transition$1(i)).haCapability(new toContentCaptureSession(28)).networkCapability(new Timestamp.Companion(0)).logInstance(new j(i)).build();
                            this.read = credentialClientBuild2;
                            credentialApplyCredentialByEC = credentialClientBuild2.applyCredentialByEC(BuildConfig.LIBRARY_PACKAGE_NAME);
                        } catch (UcsException e2) {
                            WrappedCompositionsetContent1211.read("UCSSignHelper", "init credential form network failed :" + e2.IconCompatParcelizer.delayRemaining);
                            credentialApplyCredentialByEC = null;
                        }
                    }
                    this.IconCompatParcelizer = credentialApplyCredentialByEC;
                    if (credentialApplyCredentialByEC != null) {
                        return false;
                    }
                    aGCManager = AGCManager.read();
                    synchronized (aGCManager) {
                        aGCManager.RemoteActionCompatParcelizer = null;
                    }
                    getorder.write("credentialExpiredTime", this.IconCompatParcelizer.getExpireTime());
                    getorder.IconCompatParcelizer("credentialCache", this.IconCompatParcelizer.toString());
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("UCSSignHelper", "Credential init success, expire time is :" + this.IconCompatParcelizer.getExpireTime());
                    return true;
                }
            }
            WrappedCompositionsetContent1211.read("UCSSignHelper", str);
            credentialGenCredentialFromString = null;
            this.IconCompatParcelizer = credentialGenCredentialFromString;
            if (credentialGenCredentialFromString == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("UCSSignHelper", "init credential from network");
                synchronized (this) {
                    CredentialClient.Builder builderNetworkTimeOut2 = new CredentialClient.Builder().context(context).serCountry(TextActionModeCallback.RemoteActionCompatParcelizer()).networkRetryTime(1).networkTimeOut(10000);
                    AGCManager.read().getClass();
                    int i2 = 27;
                    CredentialClient credentialClientBuild3 = builderNetworkTimeOut2.appId(AGCManager.serializer()).grsCapability(new Transition$1(i2)).haCapability(new toContentCaptureSession(28)).networkCapability(new Timestamp.Companion(0)).logInstance(new j(i2)).build();
                    this.read = credentialClientBuild3;
                    credentialApplyCredentialByEC = credentialClientBuild3.applyCredentialByEC(BuildConfig.LIBRARY_PACKAGE_NAME);
                    this.IconCompatParcelizer = credentialApplyCredentialByEC;
                    if (credentialApplyCredentialByEC != null) {
                        return false;
                    }
                    aGCManager = AGCManager.read();
                    synchronized (aGCManager) {
                        aGCManager.RemoteActionCompatParcelizer = null;
                        getorder.write("credentialExpiredTime", this.IconCompatParcelizer.getExpireTime());
                        getorder.IconCompatParcelizer("credentialCache", this.IconCompatParcelizer.toString());
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("UCSSignHelper", "Credential init success, expire time is :" + this.IconCompatParcelizer.getExpireTime());
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
