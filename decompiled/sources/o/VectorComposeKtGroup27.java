package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.constant.FWFConstants;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtGroup27 implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final VectorComposeKtGroup27 serializer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        VectorComposeKtGroup27 vectorComposeKtGroup27 = new VectorComposeKtGroup27();
        serializer = vectorComposeKtGroup27;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.HostMessage.HostEncounteredError.Payload", vectorComposeKtGroup27, 2);
        oncloseactionlambda1.read("duringMessageType", false);
        oncloseactionlambda1.read(FWFConstants.EXPLANATION_TYPE_ERROR, true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(VectorComposeKtGroup25.RemoteActionCompatParcelizer)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        String strMediaMetadataCompat = null;
        VectorComposeKtGroup24 vectorComposeKtGroup24 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                vectorComposeKtGroup24 = (VectorComposeKtGroup24) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 1, VectorComposeKtGroup25.RemoteActionCompatParcelizer, vectorComposeKtGroup24);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new VectorComposeKtGroup28(i, strMediaMetadataCompat, vectorComposeKtGroup24);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        VectorComposeKtGroup28 vectorComposeKtGroup28 = (VectorComposeKtGroup28) obj;
        vectorComposeKtGroup28.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        String str = vectorComposeKtGroup28.duringMessageType;
        VectorComposeKtGroup24 vectorComposeKtGroup24 = vectorComposeKtGroup28.error;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || vectorComposeKtGroup24 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 1, VectorComposeKtGroup25.RemoteActionCompatParcelizer, vectorComposeKtGroup24);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
