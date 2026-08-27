package o;

import coil3.ComponentRegistry$Builder;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getNexteUduSuo {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final ComponentRegistry$Builder IconCompatParcelizer;

    public getNexteUduSuo(ComponentRegistry$Builder componentRegistry$Builder) {
        this.IconCompatParcelizer = componentRegistry$Builder;
    }

    public final CustomerChatFloatingButtonUiModel RemoteActionCompatParcelizer(ContextScope contextScope) {
        int i = 2 % 2;
        ComponentRegistry$Builder componentRegistry$Builder = this.IconCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.write).write();
        objWrite.getClass();
        getNoneeUduSuo getnoneeudusuo = (getNoneeUduSuo) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.read).write();
        objWrite2.getClass();
        ImeActionCompanion imeActionCompanion = (ImeActionCompanion) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.RemoteActionCompatParcelizer).write();
        objWrite3.getClass();
        AndroidFontUtils_androidKt androidFontUtils_androidKt = (AndroidFontUtils_androidKt) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.IconCompatParcelizer).write();
        objWrite4.getClass();
        CustomerChatFloatingButtonUiModel customerChatFloatingButtonUiModel = new CustomerChatFloatingButtonUiModel(getnoneeudusuo, imeActionCompanion, contextScope, androidFontUtils_androidKt, (CustomerChatCommunicatorImpl) objWrite4, (ProtobufEncoder) ((onCapabilitiesChanged) componentRegistry$Builder.serializer).write());
        int i2 = RemoteActionCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return customerChatFloatingButtonUiModel;
    }
}
