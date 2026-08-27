package com.huawei.wisesecurity.ucs.credential.entity;

import android.content.Context;
import android.util.Base64;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs_credential.w;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import o.EmptySemanticsElement;
import o.accessgetSwitchcp;
import o.getColumnSpan;
import o.setMergeDescendants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class KeyEncryptKey {
    private static final int KEK_ALG_GCM = 1;
    private static final String TAG = "KeyEncryptKey";

    @setMergeDescendants
    private int alg;

    @setMergeDescendants
    private int kekAlg;

    @EmptySemanticsElement
    private String key;
    private int v1;
    private int v2;
    private int version;

    private void checkC1Version(Context context) throws UcsException {
        if (this.v2 == SpUtil.getInstance(context).getInt("Local-C1-Version", -1)) {
            return;
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1020L, "kek V2 with C1 version check fail,  please reapply the credential.");
    }

    public int getAlg() {
        return this.alg;
    }

    public int getKekAlg() {
        return this.kekAlg;
    }

    public String getKey() {
        return this.key;
    }

    public int getV1() {
        return this.v1;
    }

    public int getV2() {
        return this.v2;
    }

    public int getVersion() {
        return this.version;
    }

    public static KeyEncryptKey fromString(Context context, String str) throws UcsException {
        String str2;
        try {
            KeyEncryptKey keyEncryptKey = new KeyEncryptKey();
            if (str == null) {
                str2 = "";
            } else {
                try {
                    str2 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                } catch (Exception unused) {
                    throw new UcsException(1005L, "base64 decode to string error");
                }
            }
            JSONObject jSONObject = new JSONObject(str2);
            keyEncryptKey.version = jSONObject.getInt("version");
            keyEncryptKey.alg = jSONObject.getInt("alg");
            keyEncryptKey.kekAlg = jSONObject.getInt("kekAlg");
            keyEncryptKey.key = jSONObject.getString("key");
            keyEncryptKey.v1 = jSONObject.optInt("v1");
            keyEncryptKey.v2 = jSONObject.optInt("v2");
            getColumnSpan.RemoteActionCompatParcelizer(keyEncryptKey);
            keyEncryptKey.checkVersion(context, keyEncryptKey.version);
            if (keyEncryptKey.kekAlg == 1) {
                return keyEncryptKey;
            }
            throw new UcsException(1020L, "unsupported kek alg");
        } catch (KfsValidationException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("kek param invalid : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(1001L, sbIconCompatParcelizer.toString());
        } catch (JSONException e2) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("kek param is not a valid json string : ");
            sbIconCompatParcelizer2.append(e2.getMessage());
            throw new UcsException(1001L, sbIconCompatParcelizer2.toString());
        }
    }

    private void checkSoVersion() throws UcsException {
        if (this.v1 == ((int) UcsLib.ucsGetSoVersion())) {
            return;
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1020L, "kek V1 with so version check fail,  please reapply the credential.");
    }

    private void updateRootKey(Context context) throws UcsException {
        if (UcsLib.isRootKeyUpdated()) {
            return;
        }
        w.a(context);
    }

    private void checkVersion(Context context, int i) throws UcsException {
        UcsLib.checkNativeLibrary();
        if (i == 3 || i == 6 || i == 7) {
            return;
        }
        checkSoVersion();
        checkC1Version(context);
        updateRootKey(context);
    }
}
