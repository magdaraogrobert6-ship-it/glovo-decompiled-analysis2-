package o;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class handlePushNotificationPayloadlambda7 implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);
    private static final int serializer = 3600000;
    private static final int write = 60000;
    private int RemoteActionCompatParcelizer;
    private int read;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int RatingCompat() {
        return (this.RemoteActionCompatParcelizer * write) + (this.read * serializer);
    }

    public final int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer) + (Integer.hashCode(this.read) * 31);
    }

    public handlePushNotificationPayloadlambda7(int i, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) {
        str.getClass();
        try {
            int i = new JSONObject(str).getInt("local_time");
            IconCompatParcelizer.getClass();
            this.read = i / serializer;
            this.RemoteActionCompatParcelizer = (i % serializer) / write;
        } catch (JSONException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof handlePushNotificationPayloadlambda7)) {
            return false;
        }
        handlePushNotificationPayloadlambda7 handlepushnotificationpayloadlambda7 = (handlePushNotificationPayloadlambda7) obj;
        return this.read == handlepushnotificationpayloadlambda7.read && this.RemoteActionCompatParcelizer == handlepushnotificationpayloadlambda7.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalTime(hour=");
        sb.append(this.read);
        sb.append(", minute=");
        return af$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ')');
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("local_time", RatingCompat());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
