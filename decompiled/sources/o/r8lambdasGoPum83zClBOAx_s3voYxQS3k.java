package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdasGoPum83zClBOAx_s3voYxQS3k implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    private boolean IconCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private boolean read;
    private String write;

    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean read() {
        return this.IconCompatParcelizer;
    }

    public final boolean serializer() {
        return this.read;
    }

    static {
        new write(null);
    }

    public /* synthetic */ r8lambdasGoPum83zClBOAx_s3voYxQS3k(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionRange(min=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", minInclusive=");
        sb.append(this.read);
        sb.append(", max=");
        sb.append(this.write);
        sb.append(", maxInclusive=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.IconCompatParcelizer, ')');
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("min");
        string.getClass();
        this.RemoteActionCompatParcelizer = string;
        String string2 = jSONObject.getString("max");
        string2.getClass();
        this.write = string2;
        this.read = jSONObject.optBoolean("min_inclusive");
        this.IconCompatParcelizer = jSONObject.optBoolean("max_inclusive");
    }

    public r8lambdasGoPum83zClBOAx_s3voYxQS3k(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = z;
        this.write = str2;
        this.IconCompatParcelizer = z2;
    }

    public r8lambdasGoPum83zClBOAx_s3voYxQS3k() {
        this(null, null, false, false, 15, null);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("min", this.RemoteActionCompatParcelizer);
        jSONObject.put("max", this.write);
        jSONObject.put("min_inclusive", this.read);
        jSONObject.put("max_inclusive", this.IconCompatParcelizer);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
