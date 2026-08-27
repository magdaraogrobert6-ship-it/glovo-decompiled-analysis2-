package o;

import java.util.Iterator;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.sequences.DropSequence$iterator$1;

/* JADX INFO: loaded from: classes4.dex */
public final class verifyOrientationStatuslambda2 implements resumeWebviewIfNecessarylambda0 {
    public final /* synthetic */ int serializer;
    public final Object write;

    public /* synthetic */ verifyOrientationStatuslambda2(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // o.resumeWebviewIfNecessarylambda0
    public final Iterator iterator() {
        int i = this.serializer;
        Object obj = this.write;
        if (i == 0) {
            return new DropSequence$iterator$1(this);
        }
        if (i != 1) {
            return i != 2 ? new displayInAppMessage((CharSequence) obj) : LazyKt__LazyJVMKt.read((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj);
        }
        return coil3.util.ContextsKt.write((Object[]) obj);
    }
}
