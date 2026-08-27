package o;

import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.util.Set;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class Offset {
    public static Set<int[]> RemoteActionCompatParcelizer() {
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        return (Set) ModuleDSLKt.serializer(MaybeObserveOn.write(), 96616552, iWrite2, -96616550, iWrite, new Object[0], iWrite3);
    }
}
