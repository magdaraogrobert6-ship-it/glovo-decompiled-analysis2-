package o;

import java.lang.reflect.Method;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoErrorMsg extends LazyKt__LazyJVMKt {
    public final Method read;
    public final int serializer;

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        if (obj != null) {
            protoFeatureMsg.MediaSessionCompatToken = obj.toString();
        } else {
            throw getKind.IconCompatParcelizer(this.read, this.serializer, "@Url parameter is null.", new Object[0]);
        }
    }

    public ProtoErrorMsg(Method method, int i) {
        this.read = method;
        this.serializer = i;
    }
}
