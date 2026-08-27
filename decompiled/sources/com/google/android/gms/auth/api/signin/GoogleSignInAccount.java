package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zzd(17);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final Uri MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public final String PlaybackStateCompat;
    public final HashSet PlaybackStateCompatCustomAction = new HashSet();
    public final String RatingCompat;
    public final List RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        HashSet hashSet = new HashSet(this.RemoteActionCompatParcelizer);
        hashSet.addAll(this.PlaybackStateCompatCustomAction);
        return ((iHashCode + 527) * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.serializer);
        SQLite.serializer(parcel, 3, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 4, this.read);
        SQLite.serializer(parcel, 5, this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, this.MediaMetadataCompat, i);
        SQLite.serializer(parcel, 7, this.MediaSessionCompatQueueItem);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 8);
        parcel.writeLong(this.MediaDescriptionCompat);
        SQLite.serializer(parcel, 9, this.MediaBrowserCompatMediaItem);
        Object[] objArr = {parcel, 10, this.RemoteActionCompatParcelizer};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.serializer(parcel, 11, this.RatingCompat);
        SQLite.serializer(parcel, 12, this.PlaybackStateCompat);
        SQLite.serializer(i2, parcel);
    }

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.write = str4;
        this.MediaMetadataCompat = uri;
        this.MediaSessionCompatQueueItem = str5;
        this.MediaDescriptionCompat = j;
        this.MediaBrowserCompatMediaItem = str6;
        this.RemoteActionCompatParcelizer = arrayList;
        this.RatingCompat = str7;
        this.PlaybackStateCompat = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.MediaBrowserCompatMediaItem.equals(this.MediaBrowserCompatMediaItem)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.RemoteActionCompatParcelizer);
        hashSet.addAll(googleSignInAccount.PlaybackStateCompatCustomAction);
        HashSet hashSet2 = new HashSet(this.RemoteActionCompatParcelizer);
        hashSet2.addAll(this.PlaybackStateCompatCustomAction);
        return hashSet.equals(hashSet2);
    }

    public static GoogleSignInAccount RemoteActionCompatParcelizer(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.MediaSessionCompatQueueItem = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }
}
