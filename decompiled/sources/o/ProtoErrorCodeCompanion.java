package o;

import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoErrorCodeCompanion extends LazyKt__LazyJVMKt {
    public final Class read;

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = protoFeatureMsg.ParcelableVolumeInfo;
        _get_messagewebview_lambda0.getClass();
        Class cls = this.read;
        cls.getClass();
        _get_messagewebview_lambda0.write(displayInAppMessagelambda1.serializer(cls), obj);
    }

    public ProtoErrorCodeCompanion(Class cls) {
        this.read = cls;
    }
}
