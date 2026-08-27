package com.huawei.wisesecurity.ucs.credential.entity;

import android.util.Base64;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import java.nio.charset.StandardCharsets;
import o.EmptySemanticsElement;
import o.accessgetSwitchcp;
import o.getColumnSpan;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AccessKey {
    private static final String AKSK_VERSION = "akskVersion";
    private static final String APP_CERT_FP = "appCertFP";
    private static final String APP_PKG_NAME = "appPkgName";
    private int akskVersion;

    @EmptySemanticsElement
    private String appCertFP;

    @EmptySemanticsElement
    private String appPkgName;

    public int getAkskVersion() {
        return this.akskVersion;
    }

    public String getAppCertFP() {
        return this.appCertFP;
    }

    public String getAppPkgName() {
        return this.appPkgName;
    }

    public boolean hasAkskVersion() {
        return this.akskVersion >= 1;
    }

    public static AccessKey fromString(String str) throws UcsException {
        String str2;
        try {
            AccessKey accessKey = new AccessKey();
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
            accessKey.akskVersion = jSONObject.optInt(AKSK_VERSION);
            accessKey.appPkgName = jSONObject.optString(APP_PKG_NAME);
            accessKey.appCertFP = jSONObject.optString(APP_CERT_FP);
            if (accessKey.hasAkskVersion()) {
                getColumnSpan.RemoteActionCompatParcelizer(accessKey);
            }
            return accessKey;
        } catch (KfsValidationException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("accessKey param invalid : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(1001L, sbIconCompatParcelizer.toString());
        } catch (JSONException e2) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("accessKey param is not a valid json string : ");
            sbIconCompatParcelizer2.append(e2.getMessage());
            throw new UcsException(1001L, sbIconCompatParcelizer2.toString());
        }
    }
}
