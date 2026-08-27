package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private String IconCompatParcelizer;
    private String read;
    private String serializer;

    public final String IconCompatParcelizer() {
        return this.serializer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.serializer);
        jSONObject.put("version", this.IconCompatParcelizer);
        jSONObject.put("flavor", this.read);
        return jSONObject.toString();
    }

    public r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA(String str, String str2, String str3) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA)) {
            return false;
        }
        r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua = (r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA) obj;
        return this.serializer.equals(r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.serializer) && this.IconCompatParcelizer.equals(r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.IconCompatParcelizer) && this.read.equals(r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceMLModel{name='");
        sb.append(this.serializer);
        sb.append("', version='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', flavor='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, "'}");
    }

    public r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA() {
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.serializer = jSONObject.getString("name");
        this.IconCompatParcelizer = jSONObject.getString("version");
        this.read = jSONObject.getString("flavor");
    }
}
