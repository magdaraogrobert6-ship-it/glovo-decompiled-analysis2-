package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.sqlite.SQLite;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.location.nlp.scan.FB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.accessgetNumPad2cp;
import o.getQueryParameterslambda2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements accessgetNumPad2cp, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions IconCompatParcelizer;
    public static final Scope RemoteActionCompatParcelizer;
    public static final FB read;
    public static final Scope serializer;
    public static final Scope write;
    public final boolean MediaBrowserCompatMediaItem;
    public final ArrayList MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final boolean ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final ArrayList PlaybackStateCompatCustomAction;
    public final Account RatingCompat;

    public static HashMap read(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.serializer), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.MediaDescriptionCompat;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).read);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode();
        Account account = this.RatingCompat;
        int iHashCode2 = account == null ? 0 : account.hashCode();
        String str = this.MediaSessionCompatToken;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        boolean z = this.ParcelableVolumeInfo;
        boolean z2 = this.MediaBrowserCompatMediaItem;
        boolean z3 = this.MediaSessionCompatQueueItem;
        String str2 = this.PlaybackStateCompat;
        return ((((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.MediaMetadataCompat);
        Object[] objArr = {parcel, 2, new ArrayList(this.MediaDescriptionCompat)};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.RatingCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.MediaBrowserCompatMediaItem ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.MediaSessionCompatQueueItem ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(this.ParcelableVolumeInfo ? 1 : 0);
        SQLite.serializer(parcel, 7, this.MediaSessionCompatToken);
        SQLite.serializer(parcel, 8, this.MediaSessionCompatResultReceiverWrapper);
        Object[] objArr2 = {parcel, 9, this.PlaybackStateCompatCustomAction};
        int iSerializer2 = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr2, getQueryParameterslambda2.serializer(), 36608644, iSerializer2);
        SQLite.serializer(parcel, 10, this.PlaybackStateCompat);
        SQLite.serializer(i2, parcel);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.MediaMetadataCompat = i;
        this.MediaDescriptionCompat = arrayList;
        this.RatingCompat = account;
        this.MediaBrowserCompatMediaItem = z;
        this.MediaSessionCompatQueueItem = z2;
        this.ParcelableVolumeInfo = z3;
        this.MediaSessionCompatToken = str;
        this.MediaSessionCompatResultReceiverWrapper = str2;
        this.PlaybackStateCompatCustomAction = new ArrayList(map.values());
        this.PlaybackStateCompat = str3;
    }

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        RemoteActionCompatParcelizer = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        serializer = scope3;
        Scope scope4 = new Scope(1, "https://www.googleapis.com/auth/games");
        write = scope4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(scope4) && hashSet.contains(scope3)) {
            hashSet.remove(scope3);
        }
        IconCompatParcelizer = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(scope4) && hashSet2.contains(scope3)) {
            hashSet2.remove(scope3);
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new zzd(18);
        read = new FB(10);
    }

    public final boolean equals(Object obj) {
        String str = this.MediaSessionCompatToken;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.MediaDescriptionCompat;
            String str2 = googleSignInOptions.MediaSessionCompatToken;
            if (this.PlaybackStateCompatCustomAction.isEmpty() && googleSignInOptions.PlaybackStateCompatCustomAction.isEmpty()) {
                ArrayList arrayList2 = this.MediaDescriptionCompat;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account = this.RatingCompat;
                    Account account2 = googleSignInOptions.RatingCompat;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.ParcelableVolumeInfo == googleSignInOptions.ParcelableVolumeInfo && this.MediaBrowserCompatMediaItem == googleSignInOptions.MediaBrowserCompatMediaItem && this.MediaSessionCompatQueueItem == googleSignInOptions.MediaSessionCompatQueueItem && TextUtils.equals(this.PlaybackStateCompat, googleSignInOptions.PlaybackStateCompat);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public static GoogleSignInOptions serializer(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }
}
