package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wisesecurity.kfs.crypto.key.AESKeyStoreKeyManager;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.accessgetButtoncp;
import o.accessminIntrinsicHeightjd;
import o.getScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static EcKeyPair IconCompatParcelizer(Context context) {
        try {
            return b(context);
        } catch (UcsException unused) {
            EcKeyPair ecKeyPairGenerateEcKeyPair = UcsLib.generateEcKeyPair(context);
            if (ecKeyPairGenerateEcKeyPair == null) {
                MapboxMap$$ExternalSyntheticLambda0.m(1022L, "key is null");
                return null;
            }
            if (m0.serializer == null) {
                m0.serializer = new AESKeyStoreKeyManager(0);
            }
            m0 m0Var = m0.IconCompatParcelizer;
            m0Var.IconCompatParcelizer();
            int ivLen = getScrollCaptureInProgress.AES_GCM.getIvLen();
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("EncryptUtil");
            byte[] bArrRemoteActionCompatParcelizer = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(ivLen);
            m0Var.write = bArrRemoteActionCompatParcelizer;
            SpUtil.putString(context, "ucs_ec_credential_enc_sp_key", accessgetButtoncp.write(2, bArrRemoteActionCompatParcelizer) + ":" + accessgetButtoncp.write(10, m0Var.read(ecKeyPairGenerateEcKeyPair.getPublicKey())) + ":" + accessgetButtoncp.write(10, m0Var.read(ecKeyPairGenerateEcKeyPair.getPrivateKey())));
            return ecKeyPairGenerateEcKeyPair;
        }
    }

    public static EcKeyPair b(Context context) throws UcsException {
        String str;
        EcKeyPair.Builder builderNewBuilder = EcKeyPair.newBuilder();
        String string = SpUtil.getInstance(context).getString("ucs_ec_credential_enc_sp_key", "");
        if (TextUtils.isEmpty(string)) {
            str = "no cache key";
        } else {
            String[] strArrSplit = string.split(":");
            if (strArrSplit.length == 3) {
                if (m0.serializer == null) {
                    m0.serializer = new AESKeyStoreKeyManager(0);
                }
                m0 m0Var = m0.IconCompatParcelizer;
                m0Var.IconCompatParcelizer();
                m0Var.write = accessgetButtoncp.IconCompatParcelizer(2, strArrSplit[0]);
                byte[] bArrIconCompatParcelizer = m0Var.IconCompatParcelizer(accessgetButtoncp.IconCompatParcelizer(10, strArrSplit[1]));
                byte[] bArrIconCompatParcelizer2 = m0Var.IconCompatParcelizer(accessgetButtoncp.IconCompatParcelizer(10, strArrSplit[2]));
                builderNewBuilder.publicKey(bArrIconCompatParcelizer);
                builderNewBuilder.privateKey(bArrIconCompatParcelizer2);
                return builderNewBuilder.build();
            }
            str = "invalid cache key";
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1022L, str);
        return null;
    }

    public static void serializer(EcKeyPair ecKeyPair) {
        byte[] privateKey = ecKeyPair.getPrivateKey();
        if (privateKey == null) {
            return;
        }
        int length = privateKey.length;
        for (int i = 0; i < length; i++) {
            privateKey[i] = 0;
        }
    }
}
