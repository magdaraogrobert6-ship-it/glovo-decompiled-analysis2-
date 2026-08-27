package bo.app;

import com.braze.support.DateTimeUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class hb extends ff {
    @Override // bo.app.ff
    public final Double d() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hb() {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        super(new hf(uuidRandomUUID), DateTimeUtils.nowInSecondsPrecise(), null, false);
    }

    @Override // bo.app.ff
    public final String toString() {
        return "\nMutableSession(sessionId=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ", isSealed=" + this.d + ", duration=" + c() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(hf hfVar, double d, Double d2, boolean z) {
        super(hfVar, d, d2, z);
        hfVar.getClass();
    }
}
