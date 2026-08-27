package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeLocation extends r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 {
    private r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM write;

    public final void IconCompatParcelizer(r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM r8lambdabuq0kpt9xwggh2z3gbfct3eobm) {
        this.write = r8lambdabuq0kpt9xwggh2z3gbfct3eobm;
    }

    public final r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM RemoteActionCompatParcelizer() {
        return this.write;
    }

    public /* synthetic */ BrazeLocation(long j, long j2, r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM r8lambdabuq0kpt9xwggh2z3gbfct3eobm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : r8lambdabuq0kpt9xwggh2z3gbfct3eobm);
    }

    public BrazeLocation(long j, long j2) {
        this(j, j2, null, 4, null);
    }

    public BrazeLocation(long j, long j2, r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM r8lambdabuq0kpt9xwggh2z3gbfct3eobm) {
        super(j, j2);
        this.write = r8lambdabuq0kpt9xwggh2z3gbfct3eobm;
    }
}
