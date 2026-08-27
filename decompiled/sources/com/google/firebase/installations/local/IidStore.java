package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.sentry.android.core.SentryLogcatAdapter;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import o.isTreeConsistent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class IidStore {
    public static final String[] RemoteActionCompatParcelizer = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};
    public final String IconCompatParcelizer;
    public final SharedPreferences read;

    public final String IconCompatParcelizer() {
        synchronized (this.read) {
            String[] strArr = RemoteActionCompatParcelizer;
            int i = 0;
            while (true) {
                String string = null;
                if (i >= 4) {
                    return null;
                }
                String str = strArr[i];
                String string2 = this.read.getString("|T|" + this.IconCompatParcelizer + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str, null);
                if (string2 != null && !string2.isEmpty()) {
                    if (string2.startsWith("{")) {
                        try {
                            string = new JSONObject(string2).getString("token");
                        } catch (JSONException unused) {
                        }
                        string2 = string;
                    }
                    return string2;
                }
                i++;
            }
        }
    }

    public final String read() {
        String string;
        synchronized (this.read) {
            synchronized (this.read) {
                string = this.read.getString("|S|id", null);
            }
            if (string != null) {
                return string;
            }
            return write();
        }
    }

    public final String write() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.read) {
            String strEncodeToString = null;
            String string = this.read.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                SentryLogcatAdapter.IconCompatParcelizer("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                SentryLogcatAdapter.IconCompatParcelizer("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    public IidStore(FirebaseApp firebaseApp) {
        firebaseApp.IconCompatParcelizer();
        this.read = firebaseApp.read.getSharedPreferences("com.google.android.gms.appid", 0);
        firebaseApp.IconCompatParcelizer();
        isTreeConsistent istreeconsistent = firebaseApp.PlaybackStateCompatCustomAction;
        String str = istreeconsistent.RemoteActionCompatParcelizer;
        if (str == null) {
            firebaseApp.IconCompatParcelizer();
            str = istreeconsistent.IconCompatParcelizer;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.IconCompatParcelizer = str;
    }
}
