package o;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbv;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class isTreeConsistent {
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public static isTreeConsistent read(Context context) {
        zzbv zzbvVar = new zzbv(context);
        String strWrite = zzbvVar.write("google_app_id");
        if (TextUtils.isEmpty(strWrite)) {
            return null;
        }
        return new isTreeConsistent(strWrite, zzbvVar.write("google_api_key"), zzbvVar.write("firebase_database_url"), zzbvVar.write("ga_trackingId"), zzbvVar.write("gcm_defaultSenderId"), zzbvVar.write("google_storage_bucket"), zzbvVar.write("project_id"));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.write, this.serializer, this.read, this.RemoteActionCompatParcelizer, this.RatingCompat, this.MediaDescriptionCompat});
    }

    public final String toString() {
        accessgetGreencp accessgetgreencp = new accessgetGreencp(this);
        accessgetgreencp.IconCompatParcelizer(this.IconCompatParcelizer, "applicationId");
        accessgetgreencp.IconCompatParcelizer(this.write, "apiKey");
        accessgetgreencp.IconCompatParcelizer(this.serializer, "databaseUrl");
        accessgetgreencp.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "gcmSenderId");
        accessgetgreencp.IconCompatParcelizer(this.RatingCompat, "storageBucket");
        accessgetgreencp.IconCompatParcelizer(this.MediaDescriptionCompat, "projectId");
        return accessgetgreencp.toString();
    }

    public isTreeConsistent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = accessgetTvInputHdmi3cp.IconCompatParcelizer;
        accessgetSystemNavigationDowncp.serializer("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
        this.read = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.RatingCompat = str6;
        this.MediaDescriptionCompat = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof isTreeConsistent)) {
            return false;
        }
        isTreeConsistent istreeconsistent = (isTreeConsistent) obj;
        return TuplesKt.write((Object) this.IconCompatParcelizer, (Object) istreeconsistent.IconCompatParcelizer) && TuplesKt.write((Object) this.write, (Object) istreeconsistent.write) && TuplesKt.write((Object) this.serializer, (Object) istreeconsistent.serializer) && TuplesKt.write((Object) this.read, (Object) istreeconsistent.read) && TuplesKt.write((Object) this.RemoteActionCompatParcelizer, (Object) istreeconsistent.RemoteActionCompatParcelizer) && TuplesKt.write((Object) this.RatingCompat, (Object) istreeconsistent.RatingCompat) && TuplesKt.write((Object) this.MediaDescriptionCompat, (Object) istreeconsistent.MediaDescriptionCompat);
    }
}
