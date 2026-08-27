package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private String serializer;
    private String write;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final String read() {
        return this.write;
    }

    public final boolean serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.IconCompatParcelizer), 31, this.serializer);
        String str = this.write;
        return iM + (str != null ? str.hashCode() : 0);
    }

    static {
        new read(null);
    }

    public r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.serializer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("install_id");
        string.getClass();
        this.serializer = string;
        this.write = (!jSONObject.has("person_id") || jSONObject.isNull("person_id")) ? null : jSONObject.getString("person_id");
        this.RemoteActionCompatParcelizer = jSONObject.getBoolean("third_party_linked");
        this.IconCompatParcelizer = jSONObject.getBoolean("is_complete");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = (r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M) obj;
        if (this.RemoteActionCompatParcelizer != r8lambdar7ywl9ynsudagvjliqatfcbze4m.RemoteActionCompatParcelizer || this.IconCompatParcelizer != r8lambdar7ywl9ynsudagvjliqatfcbze4m.IconCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdar7ywl9ynsudagvjliqatfcbze4m.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdar7ywl9ynsudagvjliqatfcbze4m.write}, getCieXyz.write())).booleanValue();
    }

    public r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M() {
        this("", null, false, false);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("install_id", this.serializer);
        jSONObject.put("person_id", this.write);
        jSONObject.put("third_party_linked", this.RemoteActionCompatParcelizer);
        jSONObject.put("is_complete", this.IconCompatParcelizer);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
