package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.DestinationDetailsUiModelImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getScript {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final ProtobufEncoder RemoteActionCompatParcelizer;

    public getScript(ProtobufEncoder protobufEncoder) {
        this.RemoteActionCompatParcelizer = protobufEncoder;
    }

    public final DestinationDetailsUiModelImpl RemoteActionCompatParcelizer(ContextScope contextScope) {
        int i = 2 % 2;
        ProtobufEncoder protobufEncoder = this.RemoteActionCompatParcelizer;
        SignInDataStore signInDataStore = (SignInDataStore) ((SemanticsPropertiesLinkTestMarker1) protobufEncoder.write).write();
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.serializer).write();
        objWrite.getClass();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.RemoteActionCompatParcelizer).write();
        objWrite2.getClass();
        DestinationDetailsUiModelImpl destinationDetailsUiModelImpl = new DestinationDetailsUiModelImpl(signInDataStore, (isStateSaved) objWrite, (getNoneeUduSuo) objWrite2, contextScope);
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return destinationDetailsUiModelImpl;
    }
}
