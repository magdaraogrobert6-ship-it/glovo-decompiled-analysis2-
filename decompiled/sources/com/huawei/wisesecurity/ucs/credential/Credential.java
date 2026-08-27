package com.huawei.wisesecurity.ucs.credential;

import android.content.Context;
import android.util.Base64;
import com.huawei.wisesecurity.kfs.exception.CodecException;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import com.huawei.wisesecurity.ucs.credential.entity.AccessKey;
import com.huawei.wisesecurity.ucs.credential.entity.KeyEncryptKey;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import java.util.LinkedHashMap;
import o.EmptySemanticsElement;
import o.MediaSessionCompatQueueItem;
import o.accessgetDropdownListcp;
import o.accessgetSwitchcp;
import o.accessgetValuePickercp;
import o.getColumnSpan;
import o.getSteps;
import o.getSwitcho7Vup1c;
import o.isClearingSemantics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Credential {
    private static final String AK = "accessKey";
    private static final String DK = "dataKey";
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final String EXPIRE_TIME = "expireTime";
    private static final String KEK = "kek";
    private static final String SK = "secretKey";
    private static final String TAG = "Credential";

    @EmptySemanticsElement
    private String accessKey;
    private AccessKey ak;

    @EmptySemanticsElement
    private String dataKey;

    @isClearingSemantics
    private long expireTime;
    private KeyEncryptKey kek;

    @EmptySemanticsElement
    private String rawKek;

    @EmptySemanticsElement
    private String secretKey;

    private Credential() {
    }

    private byte[] base64DecodeForNative(String str) {
        try {
            return Base64.decode(str, 0);
        } catch (Exception e) {
            try {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Base64 decode fail : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new CodecException(sbIconCompatParcelizer.toString());
            } catch (CodecException unused) {
                return EMPTY_BYTES;
            }
        }
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getDataKey() {
        return this.dataKey;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getRawKek() {
        return this.rawKek;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public int getAkskVersion() {
        return this.ak.getAkskVersion();
    }

    public int getAlg() {
        return this.kek.getAlg();
    }

    public String getAppCertFP() {
        return this.ak.getAppCertFP();
    }

    public String getAppPkgName() {
        return this.ak.getAppPkgName();
    }

    public byte[] getDataKeyBytes() {
        return base64DecodeForNative(this.dataKey);
    }

    public int getKekAlg() {
        return this.kek.getKekAlg();
    }

    public byte[] getKekBytes() {
        return base64DecodeForNative(this.kek.getKey());
    }

    public String getKekString() {
        return this.kek.getKey();
    }

    public int getKekVersion() {
        return this.kek.getVersion();
    }

    public byte[] getSecretKeyBytes() {
        return base64DecodeForNative(this.secretKey);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SK, this.secretKey);
            jSONObject.put(AK, this.accessKey);
            jSONObject.put(DK, this.dataKey);
            jSONObject.put(KEK, this.rawKek);
            jSONObject.put(EXPIRE_TIME, this.expireTime);
            return jSONObject.toString();
        } catch (JSONException e) {
            getSteps.serializer(TAG, "Credential toString exception : {0}", e.getMessage());
            return "";
        }
    }

    public static Credential fromString(Context context, String str, accessgetValuePickercp accessgetvaluepickercp) throws UcsException {
        try {
            Credential credential = new Credential();
            JSONObject jSONObject = new JSONObject(str);
            credential.secretKey = jSONObject.optString(SK);
            credential.dataKey = jSONObject.optString(DK);
            credential.accessKey = jSONObject.optString(AK);
            credential.rawKek = jSONObject.optString(KEK);
            credential.expireTime = jSONObject.optLong(EXPIRE_TIME);
            credential.kek = KeyEncryptKey.fromString(context, credential.rawKek);
            credential.checkParam();
            credential.ak = AccessKey.fromString(credential.accessKey);
            String appPkgName = credential.getAppPkgName();
            LinkedHashMap linkedHashMap = accessgetvaluepickercp.read;
            linkedHashMap.put("credentialAppName", appPkgName);
            linkedHashMap.put("akSkVersion", String.valueOf(credential.getAkskVersion()));
            linkedHashMap.put("cty", getCty(credential.getKekVersion()));
            if (credential.ak.hasAkskVersion()) {
                UcsLib.checkNativeLibrary();
                StringBuilder sb = new StringBuilder();
                if (!UcsLib.checkPkgNameCertFP(context, credential.ak.getAppPkgName(), credential.ak.getAppCertFP(), sb)) {
                    String strConcat = "check AppPkgName appCertFP fail ".concat(sb.toString());
                    getSteps.serializer(TAG, strConcat, new Object[0]);
                    throw new UcsException(1023L, strConcat);
                }
            }
            getSwitcho7Vup1c.read(credential).read(credential, context);
            return credential;
        } catch (UcsException e) {
            long j = e.IconCompatParcelizer.delayRemaining;
            getSteps.serializer(TAG, "parse credentialStr get UCS exception : errorCode : {0} errorMsg : {1}", Long.valueOf(j), e.getMessage());
            throw e;
        } catch (JSONException e2) {
            getSteps.serializer(TAG, "parse credentialStr get json exception : {0}", e2.getMessage());
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("parse credentialStr get json exception : ");
            sbIconCompatParcelizer.append(e2.getMessage());
            throw new UcsException(1002L, sbIconCompatParcelizer.toString());
        } catch (Exception e3) {
            String str2 = MediaSessionCompatQueueItem.read(e3, accessgetSwitchcp.IconCompatParcelizer("parse credentialStr get exception : "));
            throw accessgetDropdownListcp.IconCompatParcelizer(TAG, str2, new Object[0], 2001L, str2);
        }
    }

    public void checkParam() throws UcsException {
        try {
            getColumnSpan.RemoteActionCompatParcelizer(this);
        } catch (KfsValidationException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("credential get param exception : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsParamException(sbIconCompatParcelizer.toString());
        }
    }

    private static String getCty(int i) {
        if (i == 0) {
            return "Kid";
        }
        if (i == 3) {
            return "AndroidKS";
        }
        if (i == 6) {
            return "AndroidKS_EC";
        }
        if (i != 7) {
            return "";
        }
        return "Huks_EC";
    }
}
