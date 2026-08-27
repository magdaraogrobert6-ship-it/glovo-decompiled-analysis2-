package o;

import java.lang.reflect.Method;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getProfileAttributes extends LazyKt__LazyJVMKt {
    public final Method read;
    public final int write;

    public getProfileAttributes(Method method, int i) {
        this.read = method;
        this.write = i;
    }

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        resetMessageMarginslambda00 resetmessagemarginslambda00 = (resetMessageMarginslambda00) obj;
        if (resetmessagemarginslambda00 == null) {
            throw getKind.IconCompatParcelizer(this.read, this.write, "Headers parameter must not be null.", new Object[0]);
        }
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = protoFeatureMsg.MediaBrowserCompatMediaItem;
        applydisplaycutoutmarginstocontentarealambda0.getClass();
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            DelayKt.write(applydisplaycutoutmarginstocontentarealambda0, resetmessagemarginslambda00.serializer(i), resetmessagemarginslambda00.read(i));
        }
    }
}
