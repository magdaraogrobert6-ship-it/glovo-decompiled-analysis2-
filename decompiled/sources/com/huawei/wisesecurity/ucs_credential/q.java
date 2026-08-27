package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import com.huawei.location.logic.zp;
import com.huawei.wisesecurity.kfs.crypto.key.AESKeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsKeyStoreException;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import com.huawei.wisesecurity.ucs.credential.entity.ErrorBody;
import com.huawei.wisesecurity.ucs.credential.entity.UcsKeyStoreProvider;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.List;
import o.AccessibilityAction;
import o.accessgetButtoncp;
import o.accessgetCarouselcp;
import o.accessgetDropdownListcp;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getChildrenForSearch;
import o.getIndeterminate;
import o.getMergeDescendants;
import o.getSteps;
import o.getValuePickero7Vup1c;
import o.visitScrollCaptureCandidates;
import o.visitScrollCaptureCandidatesdefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends accessgetCarouselcp {
    public final /* synthetic */ int MediaDescriptionCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(CredentialClient credentialClient, Context context, NetworkCapability networkCapability, int i) {
        super(credentialClient, context, networkCapability);
        this.MediaDescriptionCompat = i;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x02ee  */
    @Override // o.accessgetCarouselcp
    public final String b() throws UcsException {
        String str;
        String strWrite;
        byte[] bArrSign;
        int i = this.MediaDescriptionCompat;
        boolean z = false;
        if (i == 0) {
            Context context = this.RemoteActionCompatParcelizer;
            n0.serializer(UcsKeyStoreProvider.HUAWEI_KEYSTORE);
            n0 n0Var = n0.serializer;
            n0Var.read();
            Certificate[] certificateArrRemoteActionCompatParcelizer = n0Var.RemoteActionCompatParcelizer();
            if (certificateArrRemoteActionCompatParcelizer.length > 2) {
                certificateArrRemoteActionCompatParcelizer = new Certificate[]{certificateArrRemoteActionCompatParcelizer[0], certificateArrRemoteActionCompatParcelizer[1]};
            }
            getValuePickero7Vup1c getvaluepickero7vup1c = new getValuePickero7Vup1c();
            getvaluepickero7vup1c.MediaDescriptionCompat = "ucs_ec_alias_rootKey";
            if (Build.MANUFACTURER.equals(SystemUtils.PRODUCT_HONOR)) {
                try {
                    if (Class.forName(EmuiUtil.BUILDEX_VERSION).getField(EmuiUtil.EMUI_SDK_INT).getInt(null) >= 31) {
                        str = "ED256";
                    } else {
                        str = "ED256HUKS";
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                }
            } else {
                str = "ED256HUKS";
            }
            getvaluepickero7vup1c.ParcelableVolumeInfo = str;
            getvaluepickero7vup1c.RatingCompat = n0Var;
            getvaluepickero7vup1c.MediaSessionCompatResultReceiverWrapper = certificateArrRemoteActionCompatParcelizer;
            List<String> pkgNameCertFP = UcsLib.getPkgNameCertFP(context);
            getvaluepickero7vup1c.MediaSessionCompatToken = "huks";
            getvaluepickero7vup1c.serializer = 1;
            getvaluepickero7vup1c.write = this.serializer;
            getvaluepickero7vup1c.IconCompatParcelizer = this.write;
            getvaluepickero7vup1c.MediaMetadataCompat = 1;
            getvaluepickero7vup1c.MediaSessionCompatQueueItem = pkgNameCertFP.get(0);
            getvaluepickero7vup1c.MediaBrowserCompatMediaItem = pkgNameCertFP.get(1);
            EcKeyPair ecKeyPairIconCompatParcelizer = n.IconCompatParcelizer(context);
            getvaluepickero7vup1c.PlaybackStateCompat = accessgetButtoncp.write(2, ecKeyPairIconCompatParcelizer.getPublicKey());
            n.serializer(ecKeyPairIconCompatParcelizer);
            return getvaluepickero7vup1c.serializer();
        }
        if (i != 1) {
            Context context2 = this.RemoteActionCompatParcelizer;
            n0.serializer(UcsKeyStoreProvider.ANDROID_KEYSTORE);
            n0 n0Var2 = n0.serializer;
            n0Var2.read();
            Certificate[] certificateArrRemoteActionCompatParcelizer2 = n0Var2.RemoteActionCompatParcelizer();
            if (getIndeterminate.write(certificateArrRemoteActionCompatParcelizer2)) {
                SpUtil.putInt(context2, 0, "ucs_ec_keystore_sp_key_t");
                MapboxMap$$ExternalSyntheticLambda0.m(2001L, "android keystore EC no support software attestation root.");
                return null;
            }
            getValuePickero7Vup1c getvaluepickero7vup1c2 = new getValuePickero7Vup1c();
            getvaluepickero7vup1c2.MediaDescriptionCompat = "ucs_ec_alias_rootKey";
            getvaluepickero7vup1c2.ParcelableVolumeInfo = "ED256";
            getvaluepickero7vup1c2.RatingCompat = n0Var2;
            getvaluepickero7vup1c2.MediaSessionCompatResultReceiverWrapper = certificateArrRemoteActionCompatParcelizer2;
            getvaluepickero7vup1c2.MediaSessionCompatToken = "AndroidKS";
            List<String> pkgNameCertFP2 = UcsLib.getPkgNameCertFP(context2);
            getvaluepickero7vup1c2.serializer = 1;
            getvaluepickero7vup1c2.write = this.serializer;
            getvaluepickero7vup1c2.IconCompatParcelizer = this.write;
            getvaluepickero7vup1c2.MediaMetadataCompat = 1;
            getvaluepickero7vup1c2.MediaSessionCompatQueueItem = pkgNameCertFP2.get(0);
            getvaluepickero7vup1c2.MediaBrowserCompatMediaItem = pkgNameCertFP2.get(1);
            EcKeyPair ecKeyPairIconCompatParcelizer2 = n.IconCompatParcelizer(context2);
            getvaluepickero7vup1c2.PlaybackStateCompat = accessgetButtoncp.write(2, ecKeyPairIconCompatParcelizer2.getPublicKey());
            n.serializer(ecKeyPairIconCompatParcelizer2);
            return getvaluepickero7vup1c2.serializer();
        }
        Context context3 = this.RemoteActionCompatParcelizer;
        if (p0.serializer == null) {
            p0.serializer = new AESKeyStoreKeyManager(1);
        }
        try {
            if (p0.serializer.RemoteActionCompatParcelizer("ucs_alias_rootKey")) {
                getSteps.read("KeyStoreManager", "the alias exists", new Object[0]);
            } else {
                try {
                    p0.serializer.RemoteActionCompatParcelizer(new visitScrollCaptureCandidates("ucs_alias_rootKey", 3072, getChildrenForSearch.PURPOSE_ALL));
                    getSteps.read("KeyStoreManager", "generateKeyPair OK", new Object[0]);
                } catch (KfsException e) {
                    StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("generateKeyPair failed, ");
                    sbIconCompatParcelizer.append(e.getMessage());
                    getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer.toString(), new Object[0]);
                    StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("generateKeyPair failed , exception ");
                    sbIconCompatParcelizer2.append(e.getMessage());
                    throw new UcsKeyStoreException(sbIconCompatParcelizer2.toString());
                }
            }
            try {
                Certificate[] certificateArrWrite = p0.serializer.write("ucs_alias_rootKey");
                if (getIndeterminate.write(certificateArrWrite)) {
                    SpUtil.putInt(context3, 0, "ucs_keystore_sp_key_t");
                    MapboxMap$$ExternalSyntheticLambda0.m(2001L, "android keystore RSA no support software attestation root.");
                    return null;
                }
                i$d.a aVar = new i$d.a(25, z);
                aVar.read = certificateArrWrite;
                String string = aVar.toString();
                List<String> pkgNameCertFP3 = UcsLib.getPkgNameCertFP(context3);
                String str2 = this.serializer;
                String str3 = this.write;
                String str4 = pkgNameCertFP3.get(0);
                String str5 = pkgNameCertFP3.get(1);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("alg", 2);
                    jSONObject.put("kekAlg", 1);
                    jSONObject.put("packageName", str2);
                    jSONObject.put("appId", str3);
                    jSONObject.put("akskVersion", 1);
                    jSONObject.put("appPkgName", str4);
                    jSONObject.put("appCertFP", str5);
                    strWrite = accessgetButtoncp.write(10, jSONObject.toString().getBytes(StandardCharsets.UTF_8));
                } catch (UcsException | JSONException e2) {
                    getSteps.serializer("CredentialJws", "generate payload exception: {0}", e2.getMessage());
                    strWrite = "";
                }
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strWrite)) {
                    MapboxMap$$ExternalSyntheticLambda0.m(1006L, "Get signStr error");
                    return null;
                }
                String str6 = string + "." + strWrite;
                synchronized (p0.IconCompatParcelizer) {
                    try {
                        AccessibilityAction accessibilityAction = new AccessibilityAction((getCanScrollVertically) p0.serializer.IconCompatParcelizer, 1);
                        accessibilityAction.serializer = visitScrollCaptureCandidatesdefault.RSA_SHA256_PSS;
                        accessibilityAction.RemoteActionCompatParcelizer("ucs_alias_rootKey");
                        bArrSign = ((getMergeDescendants) accessibilityAction.RemoteActionCompatParcelizer()).getSignHandler().from(str6).sign();
                    } catch (KfsException e3) {
                        getSteps.serializer("KeyStoreManager", "doSign failed, " + e3.getMessage(), new Object[0]);
                        throw new UcsKeyStoreException("doSign failed , exception " + e3.getMessage());
                    }
                }
                String strWrite2 = accessgetButtoncp.write(10, bArrSign);
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strWrite) || TextUtils.isEmpty(strWrite2)) {
                    MapboxMap$$ExternalSyntheticLambda0.m(1006L, "get credential JWS is empty...");
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strWrite)) {
                    MapboxMap$$ExternalSyntheticLambda0.m(1006L, "Get signStr error");
                    return null;
                }
                sb.append(string + "." + strWrite);
                sb.append(".");
                sb.append(strWrite2);
                return sb.toString();
            } catch (KfsException e4) {
                StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("getCertificateChain failed, ");
                sbIconCompatParcelizer3.append(e4.getMessage());
                getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer3.toString(), new Object[0]);
                StringBuilder sbIconCompatParcelizer4 = accessgetSwitchcp.IconCompatParcelizer("getCertificateChain failed , exception ");
                sbIconCompatParcelizer4.append(e4.getMessage());
                throw new UcsKeyStoreException(sbIconCompatParcelizer4.toString());
            }
        } catch (KfsException e5) {
            StringBuilder sbIconCompatParcelizer5 = accessgetSwitchcp.IconCompatParcelizer("containsAlias failed, ");
            sbIconCompatParcelizer5.append(e5.getMessage());
            getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer5.toString(), new Object[0]);
            StringBuilder sbIconCompatParcelizer6 = accessgetSwitchcp.IconCompatParcelizer("containsAlias failed , exception ");
            sbIconCompatParcelizer6.append(e5.getMessage());
            throw new UcsKeyStoreException(sbIconCompatParcelizer6.toString());
        }
    }

    @Override // o.accessgetCarouselcp
    public final String RemoteActionCompatParcelizer(NetworkResponse networkResponse) throws UcsException {
        int i = this.MediaDescriptionCompat;
        Context context = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            if (networkResponse.isSuccessful()) {
                return networkResponse.getBody();
            }
            ErrorBody errorBodyFromString = ErrorBody.fromString(networkResponse.getBody());
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("tsms service error, ");
            sbIconCompatParcelizer.append(errorBodyFromString.getErrorMessage());
            sbIconCompatParcelizer.append("; error code : ");
            sbIconCompatParcelizer.append(errorBodyFromString.getErrorCode());
            String string = sbIconCompatParcelizer.toString();
            getSteps.serializer("HuksHandler", string, new Object[0]);
            if (accessgetCarouselcp.read(errorBodyFromString.getErrorCode())) {
                SpUtil.putInt(context, 0, "ucs_ec_huks_sp_key_t");
                getSteps.read("HuksHandler", "turn off huks EC CertificateChain", new Object[0]);
            }
            MapboxMap$$ExternalSyntheticLambda0.m(1024L, string);
            return null;
        }
        if (i == 1) {
            if (networkResponse.isSuccessful()) {
                return networkResponse.getBody();
            }
            ErrorBody errorBodyFromString2 = ErrorBody.fromString(networkResponse.getBody());
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("tsms service error, ");
            sbIconCompatParcelizer2.append(errorBodyFromString2.getErrorMessage());
            String string2 = sbIconCompatParcelizer2.toString();
            getSteps.serializer("KeyStoreHandler", string2, new Object[0]);
            if (accessgetCarouselcp.read(errorBodyFromString2.getErrorCode())) {
                SpUtil.putInt(context, 0, "ucs_keystore_sp_key_t");
                getSteps.read("KeyStoreHandler", "turn off android keystore CertificateChain", new Object[0]);
            }
            MapboxMap$$ExternalSyntheticLambda0.m(1024L, string2);
            return null;
        }
        if (networkResponse.isSuccessful()) {
            return networkResponse.getBody();
        }
        ErrorBody errorBodyFromString3 = ErrorBody.fromString(networkResponse.getBody());
        StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("tsms service error, ");
        sbIconCompatParcelizer3.append(errorBodyFromString3.getErrorMessage());
        sbIconCompatParcelizer3.append("; error code : ");
        sbIconCompatParcelizer3.append(errorBodyFromString3.getErrorCode());
        String string3 = sbIconCompatParcelizer3.toString();
        getSteps.serializer("UcsECKeyStoreHandler", string3, new Object[0]);
        if (accessgetCarouselcp.read(errorBodyFromString3.getErrorCode())) {
            SpUtil.putInt(context, 0, "ucs_ec_keystore_sp_key_t");
            getSteps.read("UcsECKeyStoreHandler", "turn off android keystore EC CertificateChain", new Object[0]);
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1024L, string3);
        return null;
    }

    @Override // o.accessgetCarouselcp
    public final Credential serializer(String str, String str2, String str3, String str4, zp zpVar) {
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            try {
                getSteps.read("HuksHandler", "applyCredential use HuksHandler.", new Object[0]);
                return write(str, str2, str3, str4);
            } catch (Throwable th) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("applyCredential use HuksHandler get exception: ");
                sbIconCompatParcelizer.append(th.getMessage());
                getSteps.serializer("HuksHandler", sbIconCompatParcelizer.toString(), new Object[0]);
                return zpVar.write(0, str, str2, str3, str4, zpVar);
            }
        }
        if (i != 1) {
            try {
                getSteps.read("UcsECKeyStoreHandler", "applyCredential use KeyStoreEcHandler.", new Object[0]);
                return write(str, str2, str3, str4);
            } catch (Throwable th2) {
                StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("applyCredential use KeyStoreEcHandler get exception: ");
                sbIconCompatParcelizer2.append(th2.getMessage());
                getSteps.serializer("UcsECKeyStoreHandler", sbIconCompatParcelizer2.toString(), new Object[0]);
                return zpVar.write(3, str, str2, str3, str4, zpVar);
            }
        }
        try {
            getSteps.read("KeyStoreHandler", "applyCredential use KeyStoreHandler.", new Object[0]);
            return write(str, str2, str3, str4);
        } catch (Throwable th3) {
            StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("applyCredential use KeyStoreHandler get exception: ");
            sbIconCompatParcelizer3.append(th3.getMessage());
            getSteps.serializer("KeyStoreHandler", sbIconCompatParcelizer3.toString(), new Object[0]);
            return zpVar.write(0, str, str2, str3, str4, zpVar);
        }
    }

    @Override // o.accessgetCarouselcp
    public final Credential RemoteActionCompatParcelizer(String str) throws UcsException {
        int i = this.MediaDescriptionCompat;
        CredentialClient credentialClient = this.MediaSessionCompatQueueItem;
        if (i == 0) {
            try {
                if (Integer.parseInt(new JSONObject(str).getString("expire")) == 0) {
                    return credentialClient.genCredentialFromString(str);
                }
                MapboxMap$$ExternalSyntheticLambda0.m(1017L, "unenable expire.");
                return null;
            } catch (NumberFormatException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp expire error : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new UcsException(2001L, sbIconCompatParcelizer.toString());
            } catch (JSONException e2) {
                StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp get json error : ");
                sbIconCompatParcelizer2.append(e2.getMessage());
                throw new UcsException(1002L, sbIconCompatParcelizer2.toString());
            }
        }
        if (i != 1) {
            try {
                if (Integer.parseInt(new JSONObject(str).getString("expire")) == 0) {
                    return credentialClient.genCredentialFromString(str);
                }
                MapboxMap$$ExternalSyntheticLambda0.m(1017L, "unenable expire.");
                return null;
            } catch (NumberFormatException e3) {
                StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp expire error : ");
                sbIconCompatParcelizer3.append(e3.getMessage());
                throw new UcsException(2001L, sbIconCompatParcelizer3.toString());
            } catch (JSONException e4) {
                StringBuilder sbIconCompatParcelizer4 = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp get json error : ");
                sbIconCompatParcelizer4.append(e4.getMessage());
                throw new UcsException(1002L, sbIconCompatParcelizer4.toString());
            }
        }
        try {
            if (Integer.parseInt(new JSONObject(str).getString("expire")) == 0) {
                return credentialClient.genCredentialFromString(str);
            }
            MapboxMap$$ExternalSyntheticLambda0.m(1017L, "unenable expire.");
            return null;
        } catch (NumberFormatException e5) {
            StringBuilder sbIconCompatParcelizer5 = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp expire error : ");
            sbIconCompatParcelizer5.append(e5.getMessage());
            throw new UcsException(2001L, sbIconCompatParcelizer5.toString());
        } catch (JSONException e6) {
            StringBuilder sbIconCompatParcelizer6 = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp get json error : ");
            sbIconCompatParcelizer6.append(e6.getMessage());
            throw new UcsException(1002L, sbIconCompatParcelizer6.toString());
        }
    }

    @Override // o.accessgetCarouselcp
    public final void a() throws UcsException {
        int i = this.MediaDescriptionCompat;
        Context context = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            if (SpUtil.getInstance(context).getInt("ucs_ec_huks_sp_key_t", -1) == 0) {
                throw accessgetDropdownListcp.IconCompatParcelizer("HuksHandler", "keyStoreCertificateChain is off. not support huks EC.", new Object[0], 1026L, "keyStoreCertificateChain is off. not support huks EC.");
            }
        } else if (i != 1) {
            if (SpUtil.getInstance(context).getInt("ucs_ec_keystore_sp_key_t", -1) == 0) {
                throw accessgetDropdownListcp.IconCompatParcelizer("UcsECKeyStoreHandler", "keyStoreCertificateChain is off. not support android keyStore EC.", new Object[0], 1022L, "keyStoreCertificateChain is off. not support android keyStore EC.");
            }
        } else if (SpUtil.getInstance(context).getInt("ucs_keystore_sp_key_t", -1) == 0) {
            throw accessgetDropdownListcp.IconCompatParcelizer("KeyStoreHandler", "keyStoreCertificateChain is off. not support keyStore RSA.", new Object[0], 1022L, "keyStoreCertificateChain is off. not support keyStore RSA.");
        }
    }
}
