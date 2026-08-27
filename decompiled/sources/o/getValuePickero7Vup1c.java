package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsKeyStoreException;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getValuePickero7Vup1c {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public Certificate[] MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public com.huawei.wisesecurity.ucs_credential.n0 RatingCompat;
    public int serializer;
    public String write;
    public final JSONObject RemoteActionCompatParcelizer = new JSONObject();
    public final JSONObject read = new JSONObject();
    public final int PlaybackStateCompatCustomAction = 5;

    public final String serializer() throws UcsException {
        byte[] bArrSign;
        JSONObject jSONObject = this.RemoteActionCompatParcelizer;
        JSONObject jSONObject2 = this.read;
        try {
            jSONObject2.put("alg", this.PlaybackStateCompatCustomAction);
            jSONObject2.put("pbk", this.PlaybackStateCompat);
            jSONObject.put("alg", this.ParcelableVolumeInfo);
            jSONObject.put("cty", this.MediaSessionCompatToken);
            int iMin = Math.min(this.MediaSessionCompatResultReceiverWrapper.length, 3);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < iMin; i++) {
                jSONArray.put(accessgetButtoncp.write(2, this.MediaSessionCompatResultReceiverWrapper[i].getEncoded()));
            }
            jSONObject.put("x5c", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("len", 32);
            String string = jSONObject3.toString();
            Charset charset = StandardCharsets.UTF_8;
            jSONObject.put("kid", accessgetButtoncp.write(10, string.getBytes(charset)));
            try {
                jSONObject2.put("kekAlg", this.serializer);
                jSONObject2.put("packageName", this.write);
                jSONObject2.put("appId", this.IconCompatParcelizer);
                jSONObject2.put("akskVersion", this.MediaMetadataCompat);
                jSONObject2.put("appPkgName", this.MediaSessionCompatQueueItem);
                jSONObject2.put("appCertFP", this.MediaBrowserCompatMediaItem);
                String strM = af$$ExternalSyntheticOutline0.m(accessgetButtoncp.write(10, jSONObject.toString().getBytes(charset)), ".", accessgetButtoncp.write(10, jSONObject2.toString().getBytes(charset)));
                if (this.RatingCompat != null) {
                    String str = this.MediaDescriptionCompat;
                    synchronized (com.huawei.wisesecurity.ucs_credential.n0.IconCompatParcelizer) {
                        try {
                            AccessibilityAction accessibilityAction = new AccessibilityAction((getCanScrollVertically) com.huawei.wisesecurity.ucs_credential.n0.write.IconCompatParcelizer, 0);
                            accessibilityAction.serializer = visitScrollCaptureCandidatesdefault.ECDSA;
                            accessibilityAction.RemoteActionCompatParcelizer(str);
                            bArrSign = ((getMergeDescendants) accessibilityAction.RemoteActionCompatParcelizer()).getSignHandler().from(strM).sign();
                        } catch (KfsException e) {
                            getSteps.serializer("KeyStoreManager", "doSign failed, " + e.getMessage(), new Object[0]);
                            throw new UcsKeyStoreException("doSign failed , exception " + e.getMessage());
                        }
                    }
                    return af$$ExternalSyntheticOutline0.m(strM, ".", accessgetButtoncp.write(10, bArrSign));
                }
                MapboxMap$$ExternalSyntheticLambda0.m(1022L, "UcsKeyStore must no null");
                return null;
            } catch (JSONException e2) {
                getSteps.serializer("JwsKeystoreCredentialReqGenerator", "generate payload exception: {0}", e2.getMessage());
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("build payload json error: ");
                sbIconCompatParcelizer.append(e2.getMessage());
                throw new UcsException(1002L, sbIconCompatParcelizer.toString());
            }
        } catch (CertificateEncodingException | JSONException e3) {
            getSteps.serializer("JwsKeystoreECCredentialReqGenerator", MediaSessionCompatQueueItem.read(e3, accessgetSwitchcp.IconCompatParcelizer("put json error: ")), new Object[0]);
            throw new UcsException(1002L, MediaSessionCompatQueueItem.read(e3, accessgetSwitchcp.IconCompatParcelizer("put json error: ")));
        }
    }
}
