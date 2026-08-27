package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifieds_7Xco {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final ProtobufEncoder RemoteActionCompatParcelizer;

    public getUnspecifieds_7Xco(ProtobufEncoder protobufEncoder) {
        this.RemoteActionCompatParcelizer = protobufEncoder;
    }

    public final valueOfE8nx0Ws write(ContextScope contextScope) {
        int i = 2 % 2;
        ProtobufEncoder protobufEncoder = this.RemoteActionCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
        objWrite.getClass();
        getQueryContext getquerycontext = new getQueryContext();
        SendTestPushUseCase sendTestPushUseCase = (SendTestPushUseCase) ((LayoutCompat) protobufEncoder.serializer).write();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.RemoteActionCompatParcelizer).write();
        objWrite2.getClass();
        valueOfE8nx0Ws valueofe8nx0ws = new valueOfE8nx0Ws((transferSessionPackageI) objWrite, getquerycontext, contextScope, sendTestPushUseCase, (accessgetParagraphcp) objWrite2);
        int i2 = write + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return valueofe8nx0ws;
    }
}
