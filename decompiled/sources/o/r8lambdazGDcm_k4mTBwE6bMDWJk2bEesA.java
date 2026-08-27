package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private String IconCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private String serializer;
    private String write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String read() {
        return this.serializer;
    }

    public final String serializer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer);
    }

    static {
        new IconCompatParcelizer(null);
    }

    public r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = str4;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("user_token");
        string.getClass();
        this.serializer = string;
        String string2 = jSONObject.getString("user_token_expiry_date");
        string2.getClass();
        this.IconCompatParcelizer = string2;
        String string3 = jSONObject.getString("refresh_token");
        string3.getClass();
        this.RemoteActionCompatParcelizer = string3;
        String string4 = jSONObject.getString("refresh_token_expiry_date");
        string4.getClass();
        this.write = string4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = (r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.write}, getCieXyz.write())).booleanValue();
    }

    public r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA() {
        this("", "", "", "");
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_token", this.serializer);
        jSONObject.put("user_token_expiry_date", this.IconCompatParcelizer);
        jSONObject.put("refresh_token", this.RemoteActionCompatParcelizer);
        jSONObject.put("refresh_token_expiry_date", this.write);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
