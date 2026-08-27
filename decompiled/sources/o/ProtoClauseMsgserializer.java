package o;

import java.lang.reflect.Array;
import java.util.Iterator;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoClauseMsgserializer extends LazyKt__LazyJVMKt {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ LazyKt__LazyJVMKt write;

    public /* synthetic */ ProtoClauseMsgserializer(LazyKt__LazyJVMKt lazyKt__LazyJVMKt, int i) {
        this.IconCompatParcelizer = i;
        this.write = lazyKt__LazyJVMKt;
    }

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        int i = this.IconCompatParcelizer;
        LazyKt__LazyJVMKt lazyKt__LazyJVMKt = this.write;
        if (i == 0) {
            Iterable iterable = (Iterable) obj;
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                lazyKt__LazyJVMKt.read(protoFeatureMsg, it.next());
            }
            return;
        }
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            lazyKt__LazyJVMKt.read(protoFeatureMsg, Array.get(obj, i2));
        }
    }
}
