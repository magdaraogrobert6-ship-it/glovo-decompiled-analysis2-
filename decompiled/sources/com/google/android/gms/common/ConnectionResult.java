package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import kotlin.TuplesKt;
import o.accessgetGreencp;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int SUCCESS = 0;
    public final int IconCompatParcelizer;
    public final Integer MediaBrowserCompatMediaItem;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final PendingIntent serializer;
    public static final ConnectionResult write = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza(0);

    public final boolean read() {
        return this.IconCompatParcelizer == 0;
    }

    public final String toString() {
        accessgetGreencp accessgetgreencp = new accessgetGreencp(this);
        accessgetgreencp.IconCompatParcelizer(read(this.IconCompatParcelizer), HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        accessgetgreencp.IconCompatParcelizer(this.serializer, CommonCode.MapKey.HAS_RESOLUTION);
        accessgetgreencp.IconCompatParcelizer(this.read, "message");
        accessgetgreencp.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, "clientMethodKey");
        return accessgetgreencp.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.serializer, i);
        SQLite.serializer(parcel, 4, this.read);
        Integer num = this.MediaBrowserCompatMediaItem;
        if (num != null) {
            SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        SQLite.serializer(i2, parcel);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.serializer = pendingIntent;
        this.read = str;
        this.MediaBrowserCompatMediaItem = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.IconCompatParcelizer == connectionResult.IconCompatParcelizer && TuplesKt.write(this.serializer, connectionResult.serializer) && TuplesKt.write((Object) this.read, (Object) connectionResult.read) && TuplesKt.write(this.MediaBrowserCompatMediaItem, connectionResult.MediaBrowserCompatMediaItem);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        String str = this.read;
        Integer num = this.MediaBrowserCompatMediaItem;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), this.serializer, str, num});
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }

    public static String read(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i != 1500) {
            switch (i) {
                case -1:
                    return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                case 0:
                    return "SUCCESS";
                case 1:
                    return "SERVICE_MISSING";
                case 2:
                    return "SERVICE_VERSION_UPDATE_REQUIRED";
                case 3:
                    return "SERVICE_DISABLED";
                case 4:
                    return "SIGN_IN_REQUIRED";
                case 5:
                    return "INVALID_ACCOUNT";
                case 6:
                    return "RESOLUTION_REQUIRED";
                case 7:
                    return "NETWORK_ERROR";
                case 8:
                    return "INTERNAL_ERROR";
                case 9:
                    return "SERVICE_INVALID";
                case 10:
                    return "DEVELOPER_ERROR";
                case 11:
                    return "LICENSE_CHECK_FAILED";
                default:
                    switch (i) {
                        case 13:
                            return "CANCELED";
                        case 14:
                            return "TIMEOUT";
                        case 15:
                            return "INTERRUPTED";
                        case 16:
                            return "API_UNAVAILABLE";
                        case 17:
                            return "SIGN_IN_FAILED";
                        case 18:
                            return "SERVICE_UPDATING";
                        case 19:
                            return "SERVICE_MISSING_PERMISSION";
                        case 20:
                            return "RESTRICTED_PROFILE";
                        case 21:
                            return "API_VERSION_UPDATE_REQUIRED";
                        case 22:
                            return "RESOLUTION_ACTIVITY_NOT_FOUND";
                        case 23:
                            return "API_DISABLED";
                        case 24:
                            return "API_DISABLED_FOR_CONNECTION";
                        case 25:
                            return "API_INSTALL_REQUIRED";
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                            sb.append("UNKNOWN_ERROR_CODE(");
                            sb.append(i);
                            sb.append(")");
                            return sb.toString();
                    }
            }
        }
        return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    }
}
