package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class addViewInLayout implements forceAccessibilityForTesting {
    public final ProtobufEncoder IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ addViewInLayout(ProtobufEncoder protobufEncoder, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = protobufEncoder;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.RemoteActionCompatParcelizer;
        ProtobufEncoder protobufEncoder = this.IconCompatParcelizer;
        if (i == 0) {
            Executor executor = (Executor) protobufEncoder.serializer;
            setNativeShader.RemoteActionCompatParcelizer(executor);
            return executor;
        }
        if (i != 1) {
            Executor executor2 = (Executor) protobufEncoder.RemoteActionCompatParcelizer;
            setNativeShader.RemoteActionCompatParcelizer(executor2);
            return executor2;
        }
        Executor executor3 = (Executor) protobufEncoder.write;
        setNativeShader.RemoteActionCompatParcelizer(executor3);
        return executor3;
    }
}
