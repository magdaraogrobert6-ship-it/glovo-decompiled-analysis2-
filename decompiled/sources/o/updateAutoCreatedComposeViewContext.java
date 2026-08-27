package o;

import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class updateAutoCreatedComposeViewContext implements forceAccessibilityForTesting {
    public final ProtobufEncoder serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ updateAutoCreatedComposeViewContext(ProtobufEncoder protobufEncoder, int i) {
        this.write = i;
        this.serializer = protobufEncoder;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.write;
        ProtobufEncoder protobufEncoder = this.serializer;
        if (i == 0) {
            return (FirebaseApp) protobufEncoder.write;
        }
        if (i != 1) {
            return new SharedPreferencesUtils((FirebaseApp) protobufEncoder.write);
        }
        accesssetInstancecp accesssetinstancecp = (accesssetInstancecp) protobufEncoder.serializer;
        setNativeShader.RemoteActionCompatParcelizer(accesssetinstancecp);
        return accesssetinstancecp;
    }
}
