package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaDrmJdx1j9gjzqwvv4qL9c3NutF4 implements resumeWebviewIfNecessarylambda0 {
    public final Object read;
    public final Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaDrmJdx1j9gjzqwvv4qL9c3NutF4(Object obj, int i, Object obj2) {
        this.write = i;
        this.serializer = obj;
        this.read = obj2;
    }

    @Override // o.resumeWebviewIfNecessarylambda0
    public final Iterator iterator() {
        return this.write != 0 ? new unregisterInAppMessageManagerlambda1(this) : new r8lambdaFbd47yHMz1BPgLvbFzIjlnCHtY(this);
    }
}
