package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderVectorGroup implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final RenderVectorGroup write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed};
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
        RenderVectorGroup renderVectorGroup = new RenderVectorGroup();
        write = renderVectorGroup;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.domain.push.BodyPayload", renderVectorGroup, 6);
        oncloseactionlambda1.read("chat_type", false);
        oncloseactionlambda1.read("order_id", false);
        oncloseactionlambda1.read("chat_id", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.CHANNEL_TYPE_KEY, false);
        oncloseactionlambda1.read("message", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
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
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 0);
                    i |= 1;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                    i |= 2;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 2);
                    i |= 4;
                    break;
                case 3:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 3);
                    i |= 8;
                    break;
                case 4:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 4);
                    i |= 16;
                    break;
                case 5:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 5);
                    i |= 32;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setSizeuvyYCjkui(strMediaMetadataCompat, i, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, strMediaMetadataCompat5, strMediaMetadataCompat6);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setSizeuvyYCjkui setsizeuvyycjkui = (setSizeuvyYCjkui) obj;
        setsizeuvyycjkui.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, setsizeuvyycjkui.chatType);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, setsizeuvyycjkui.orderID);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 2, setsizeuvyycjkui.chatID);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 3, setsizeuvyycjkui.channelType);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 4, setsizeuvyycjkui.message);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 5, setsizeuvyycjkui.title);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
