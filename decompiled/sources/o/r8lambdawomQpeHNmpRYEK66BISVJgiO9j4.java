package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private Long RemoteActionCompatParcelizer;
    private long read;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final Long RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long read() {
        return this.read;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.read);
        Long l = this.RemoteActionCompatParcelizer;
        return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        this.read = jSONObject.getLong("init_start_time");
        this.RemoteActionCompatParcelizer = (!jSONObject.has("init_complete_time") || jSONObject.isNull("init_complete_time")) ? null : Long.valueOf(jSONObject.getLong("init_complete_time"));
    }

    public /* synthetic */ r8lambdawomQpeHNmpRYEK66BISVJgiO9j4(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r8lambdawomQpeHNmpRYEK66BISVJgiO9j4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 r8lambdawomqpehnmpryek66bisvjgio9j4 = (r8lambdawomQpeHNmpRYEK66BISVJgiO9j4) obj;
        if (this.read != r8lambdawomqpehnmpryek66bisvjgio9j4.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdawomqpehnmpryek66bisvjgio9j4.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public r8lambdawomQpeHNmpRYEK66BISVJgiO9j4(long j) {
        this.read = j;
    }

    public r8lambdawomQpeHNmpRYEK66BISVJgiO9j4() {
        this(0L, 1, null);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("init_start_time", this.read);
        jSONObject.put("init_complete_time", this.RemoteActionCompatParcelizer);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final void write(Long l) {
        this.RemoteActionCompatParcelizer = l;
    }
}
