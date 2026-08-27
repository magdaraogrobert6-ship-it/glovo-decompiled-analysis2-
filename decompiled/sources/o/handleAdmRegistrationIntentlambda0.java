package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class handleAdmRegistrationIntentlambda0 implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private long RemoteActionCompatParcelizer;
    private String read;
    private long write;

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long serializer() {
        return this.write;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CrashHianalyticsData.TIME, this.RemoteActionCompatParcelizer);
        jSONObject.put("waiting_receiver", this.read);
        jSONObject.put("wait_duration", this.write);
        return jSONObject.toString();
    }

    public handleAdmRegistrationIntentlambda0(long j, String str, long j2) {
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
        this.write = j2;
    }

    public final int hashCode() {
        long j = this.RemoteActionCompatParcelizer;
        return Objects.hash(Long.valueOf(j), this.read, Long.valueOf(this.write));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        handleAdmRegistrationIntentlambda0 handleadmregistrationintentlambda0 = (handleAdmRegistrationIntentlambda0) obj;
        return this.RemoteActionCompatParcelizer == handleadmregistrationintentlambda0.RemoteActionCompatParcelizer && this.write == handleadmregistrationintentlambda0.write && Objects.equals(this.read, handleadmregistrationintentlambda0.read);
    }

    public handleAdmRegistrationIntentlambda0() {
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.RemoteActionCompatParcelizer = jSONObject.getLong(CrashHianalyticsData.TIME);
        this.read = jSONObject.getString("waiting_receiver");
        this.write = jSONObject.getLong("wait_duration");
    }
}
