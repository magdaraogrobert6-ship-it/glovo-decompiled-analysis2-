package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    private r8lambdasGoPum83zClBOAx_s3voYxQS3k IconCompatParcelizer;
    private r8lambdaninGD_558WEHro03VDYWZMuRZKQ RemoteActionCompatParcelizer;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final r8lambdasGoPum83zClBOAx_s3voYxQS3k RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final r8lambdaninGD_558WEHro03VDYWZMuRZKQ read() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    public final String toString() {
        return "Rule(actionHolder=" + this.RemoteActionCompatParcelizer + ", range=" + this.IconCompatParcelizer + ')';
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU r8lambdajk0nsmilrf0udmer4qeoujidfquSerializer = r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdasGoPum83zClBOAx_s3voYxQS3k.class, jSONObject.getJSONObject("range").toString());
        r8lambdajk0nsmilrf0udmer4qeoujidfquSerializer.getClass();
        this.IconCompatParcelizer = (r8lambdasGoPum83zClBOAx_s3voYxQS3k) r8lambdajk0nsmilrf0udmer4qeoujidfquSerializer;
        r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU r8lambdajk0nsmilrf0udmer4qeoujidfquSerializer2 = r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdaninGD_558WEHro03VDYWZMuRZKQ.class, jSONObject.getJSONObject("action").toString());
        r8lambdajk0nsmilrf0udmer4qeoujidfquSerializer2.getClass();
        this.RemoteActionCompatParcelizer = (r8lambdaninGD_558WEHro03VDYWZMuRZKQ) r8lambdajk0nsmilrf0udmer4qeoujidfquSerializer2;
    }

    public /* synthetic */ r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg(r8lambdaninGD_558WEHro03VDYWZMuRZKQ r8lambdaningd_558wehro03vdywzmurzkq, r8lambdasGoPum83zClBOAx_s3voYxQS3k r8lambdasgopum83zclboax_s3voyxqs3k, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new r8lambdaninGD_558WEHro03VDYWZMuRZKQ(null, 1, null) : r8lambdaningd_558wehro03vdywzmurzkq, (i & 2) != 0 ? new r8lambdasGoPum83zClBOAx_s3voYxQS3k(null, null, false, false, 15, null) : r8lambdasgopum83zclboax_s3voyxqs3k);
    }

    public r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg(r8lambdaninGD_558WEHro03VDYWZMuRZKQ r8lambdaningd_558wehro03vdywzmurzkq, r8lambdasGoPum83zClBOAx_s3voYxQS3k r8lambdasgopum83zclboax_s3voyxqs3k) {
        r8lambdaningd_558wehro03vdywzmurzkq.getClass();
        r8lambdasgopum83zclboax_s3voyxqs3k.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaningd_558wehro03vdywzmurzkq;
        this.IconCompatParcelizer = r8lambdasgopum83zclboax_s3voyxqs3k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("range", new JSONObject(this.IconCompatParcelizer.write()));
        jSONObject.put("action", new JSONObject(this.RemoteActionCompatParcelizer.write()));
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
