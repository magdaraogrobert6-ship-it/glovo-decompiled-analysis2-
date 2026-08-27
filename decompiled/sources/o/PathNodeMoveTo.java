package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class PathNodeMoveTo implements getInAppMessageManager {
    public static final PathNodeMoveTo IconCompatParcelizer;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        PathNodeMoveTo pathNodeMoveTo = new PathNodeMoveTo();
        IconCompatParcelizer = pathNodeMoveTo;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage.ChatPayload", pathNodeMoveTo, 1);
        oncloseactionlambda1.read("chatId", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        String strMediaMetadataCompat = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 0);
                i = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new PathNodeLineTo(i, strMediaMetadataCompat);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        PathNodeLineTo pathNodeLineTo = (PathNodeLineTo) obj;
        pathNodeLineTo.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, pathNodeLineTo.chatId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
