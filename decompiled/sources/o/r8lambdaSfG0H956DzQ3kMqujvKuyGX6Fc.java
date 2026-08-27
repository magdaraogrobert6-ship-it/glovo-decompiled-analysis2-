package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc extends r8lambdaSZ2Qv5o_Tom9JUx0KS0E99hczu8 {
    private final Boolean IconCompatParcelizer;
    private final Float read;
    private final Float write;

    public final Boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Float read() {
        return this.read;
    }

    public final Float write() {
        return this.write;
    }

    public /* synthetic */ r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc(long j, long j2, Float f, Float f2, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f, f2, (i & 16) != 0 ? instance_delegatelambda0.write : list, (i & 32) != 0 ? null : bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc(long j, long j2, Float f, Float f2, List<? extends handleLogClickdefault> list, Boolean bool) {
        super(j, j2, list);
        list.getClass();
        this.write = f;
        this.read = f2;
        this.IconCompatParcelizer = bool;
    }
}
