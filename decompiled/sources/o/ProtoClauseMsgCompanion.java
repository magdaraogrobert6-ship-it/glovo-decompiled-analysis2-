package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.LazyKt__LazyJVMKt;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoClauseMsgCompanion extends LazyKt__LazyJVMKt {
    public final int IconCompatParcelizer;
    public final FwFClientKt serializer;
    public final Method write;

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        int i = this.IconCompatParcelizer;
        Method method = this.write;
        if (obj == null) {
            throw getKind.IconCompatParcelizer(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            protoFeatureMsg.write = (RequestBody) this.serializer.IconCompatParcelizer(obj);
        } catch (IOException e) {
            throw getKind.IconCompatParcelizer(method, e, i, af$$ExternalSyntheticOutline0.m(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }

    public ProtoClauseMsgCompanion(Method method, int i, FwFClientKt fwFClientKt) {
        this.write = method;
        this.IconCompatParcelizer = i;
        this.serializer = fwFClientKt;
    }
}
