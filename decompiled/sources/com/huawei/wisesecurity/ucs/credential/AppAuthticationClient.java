package com.huawei.wisesecurity.ucs.credential;

import android.content.Context;
import android.text.TextUtils;
import com.braze.Constants;
import com.huawei.wisesecurity.kfs.crypto.signer.DefaultSignHandler;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsCryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSignAlg;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;
import o.BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4;
import o.LiveRegionMode;
import o.MediaSessionCompatQueueItem;
import o.accessgetButtoncp;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getColumnSpan;
import o.getSteps;
import o.getSwitcho7Vup1c;
import o.visitScrollCaptureCandidatesdefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class AppAuthticationClient {
    private CredentialSignAlg alg;
    private Context context;
    private Credential credential;
    private String extra;

    @Deprecated
    public String getAppAuthtication() throws UcsException {
        String strWrite;
        String str;
        String str2;
        String strWrite2 = "";
        try {
            BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alg", "HS256");
                strWrite = accessgetButtoncp.write(10, jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            } catch (UcsException | JSONException e) {
                getSteps.serializer("AppAuthticationJws", "generate Header exception: {0}", e.getMessage());
                strWrite = "";
            }
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = strWrite;
            if (this.credential.getAkskVersion() < 1) {
                List<String> pkgNameCertFP = UcsLib.getPkgNameCertFP(this.context);
                str2 = pkgNameCertFP.get(0);
                str = pkgNameCertFP.get(1);
            } else {
                str = "";
                str2 = str;
            }
            String str3 = this.extra;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pkgName", str2);
                jSONObject2.put("certSig", str);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject2.put(Constants.BRAZE_PUSH_EXTRAS_KEY, str3);
                }
                strWrite2 = accessgetButtoncp.write(10, jSONObject2.toString().getBytes(StandardCharsets.UTF_8));
            } catch (UcsException | JSONException e2) {
                getSteps.serializer("AppAuthticationJws", "generate PayLoad exception: {0}", e2.getMessage());
            }
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = strWrite2;
            byte[] bArrDecryptSkDk = SkDkEntity.from(this.credential.getSecretKeyBytes()).decryptSkDk(getSwitcho7Vup1c.RemoteActionCompatParcelizer(this.credential));
            visitScrollCaptureCandidatesdefault preferredAlg = visitScrollCaptureCandidatesdefault.getPreferredAlg("HMAC");
            getCanScrollVertically getcanscrollvertically = getCanScrollVertically.ANDROID_KEYSTORE;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecryptSkDk, preferredAlg.getTransformation());
            visitScrollCaptureCandidatesdefault visitscrollcapturecandidatesdefault = visitScrollCaptureCandidatesdefault.HMAC_SHA256;
            x xVar = new x(12);
            xVar.IconCompatParcelizer = visitscrollcapturecandidatesdefault;
            DefaultSignHandler defaultSignHandler = new DefaultSignHandler(getcanscrollvertically, secretKeySpec, xVar);
            defaultSignHandler.from(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer());
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = accessgetButtoncp.write(10, defaultSignHandler.sign());
            return brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write();
        } catch (UcsCryptoException e3) {
            throw new UcsException(1022L, e3.getMessage());
        } catch (UnsupportedOperationException unused) {
            MapboxMap$$ExternalSyntheticLambda0.m(2001L, "new String UnsupportedOperationException..");
            return null;
        } catch (Exception e4) {
            throw new UcsException(2001L, MediaSessionCompatQueueItem.read(e4, accessgetSwitchcp.IconCompatParcelizer("app info auth Exception : ")));
        }
    }

    private AppAuthticationClient(Context context, Credential credential, String str, CredentialSignAlg credentialSignAlg) {
        this.context = context;
        this.credential = credential;
        this.extra = str;
        this.alg = credentialSignAlg;
    }

    @Deprecated
    public static class Builder {

        @LiveRegionMode
        private CredentialSignAlg alg = CredentialSignAlg.HMAC_SHA256;

        @LiveRegionMode
        private Context context;

        @LiveRegionMode
        private Credential credential;
        private String extra;

        public Builder alg(CredentialSignAlg credentialSignAlg) {
            this.alg = credentialSignAlg;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public Builder credential(Credential credential) {
            this.credential = credential;
            return this;
        }

        public Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public AppAuthticationClient build() throws UcsException {
            try {
                getColumnSpan.RemoteActionCompatParcelizer(this);
                return new AppAuthticationClient(this.context, this.credential, this.extra, this.alg);
            } catch (KfsValidationException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("AppAuthticationClient check param error : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new UcsParamException(sbIconCompatParcelizer.toString());
            }
        }
    }
}
