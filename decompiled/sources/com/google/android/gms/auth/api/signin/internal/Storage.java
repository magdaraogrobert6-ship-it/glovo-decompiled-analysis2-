package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.huawei.location.nlp.scan.FB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o.DrawableTransformation;
import o.accessgetSystemNavigationDowncp;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Storage {
    public static Storage serializer;
    public static final ReentrantLock write = new ReentrantLock();
    public final ReentrantLock RemoteActionCompatParcelizer = new ReentrantLock();
    public final SharedPreferences read;

    public final GoogleSignInAccount RemoteActionCompatParcelizer() {
        String str;
        String str2 = read("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(str2) || (str = read(RemoteActionCompatParcelizer("googleSignInAccount", str2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.RemoteActionCompatParcelizer(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String read(String str) {
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            return this.read.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void serializer(String str, String str2) {
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            this.read.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public static Storage IconCompatParcelizer(Context context) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        ReentrantLock reentrantLock = write;
        reentrantLock.lock();
        try {
            if (serializer == null) {
                serializer = new Storage(context.getApplicationContext());
            }
            return serializer;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void RemoteActionCompatParcelizer(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(googleSignInAccount);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(googleSignInOptions);
        String str = googleSignInAccount.MediaBrowserCompatMediaItem;
        serializer("defaultGoogleSignInAccount", str);
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.serializer;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.IconCompatParcelizer;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.read;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.write;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.RatingCompat;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.PlaybackStateCompat;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.MediaMetadataCompat;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.MediaSessionCompatQueueItem;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.MediaDescriptionCompat);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.RemoteActionCompatParcelizer;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, FB.IconCompatParcelizer);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.read);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            serializer(strRemoteActionCompatParcelizer, jSONObject.toString());
            String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer("googleSignInOptions", str);
            String str9 = googleSignInOptions.MediaSessionCompatResultReceiverWrapper;
            String str10 = googleSignInOptions.MediaSessionCompatToken;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.MediaDescriptionCompat;
                Collections.sort(arrayList, GoogleSignInOptions.read);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).read);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.RatingCompat;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.MediaBrowserCompatMediaItem);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.ParcelableVolumeInfo);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.MediaSessionCompatQueueItem);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                serializer(strRemoteActionCompatParcelizer2, jSONObject2.toString());
            } catch (JSONException e) {
                DrawableTransformation.read((Throwable) e);
            }
        } catch (JSONException e2) {
            DrawableTransformation.read((Throwable) e2);
        }
    }

    public static final String RemoteActionCompatParcelizer(String str, String str2) {
        return d$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str2).length() + 20), str, ":", str2);
    }

    public Storage(Context context) {
        this.read = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
}
