package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class setNotificationPriorityInt implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private long RemoteActionCompatParcelizer;
    private String read;
    private long write;

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final long serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CrashHianalyticsData.TIME, this.write);
        jSONObject.put("waitingComponent", this.read);
        jSONObject.put("waitDuration", this.RemoteActionCompatParcelizer);
        return jSONObject.toString();
    }

    public setNotificationPriorityInt(long j, String str, long j2) {
        this.write = j;
        this.read = str;
        this.RemoteActionCompatParcelizer = j2;
    }

    public final int hashCode() {
        long j = this.write;
        return Objects.hash(Long.valueOf(j), this.read, Long.valueOf(this.RemoteActionCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setNotificationPriorityInt setnotificationpriorityint = (setNotificationPriorityInt) obj;
        return this.write == setnotificationpriorityint.write && this.RemoteActionCompatParcelizer == setnotificationpriorityint.RemoteActionCompatParcelizer && Objects.equals(this.read, setnotificationpriorityint.read);
    }

    public setNotificationPriorityInt() {
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.write = jSONObject.getLong(CrashHianalyticsData.TIME);
        this.read = jSONObject.getString("waitingComponent");
        this.RemoteActionCompatParcelizer = jSONObject.getLong("waitDuration");
    }
}
