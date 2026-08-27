package o;

import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoErrorMsgserializer extends LazyKt__LazyJVMKt {
    public final boolean IconCompatParcelizer;

    public ProtoErrorMsgserializer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        if (obj == null) {
            return;
        }
        protoFeatureMsg.serializer(obj.toString(), null, this.IconCompatParcelizer);
    }
}
