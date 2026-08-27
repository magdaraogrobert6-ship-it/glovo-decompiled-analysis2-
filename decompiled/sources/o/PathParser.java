package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class PathParser implements getInAppMessageManager {
    public static final PathParser RemoteActionCompatParcelizer;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, toPathdefault.IconCompatParcelizer};
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
        PathParser pathParser = new PathParser();
        RemoteActionCompatParcelizer = pathParser;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("HELPCENTER_ENCOUNTERED_ERROR", pathParser, 4);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("messageType", false);
        oncloseactionlambda1.read("bridgeMessageID", false);
        oncloseactionlambda1.read("payload", false);
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
        pathStringToNodes pathstringtonodes = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 0);
                i |= 1;
            } else if (i2 == 1) {
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                i |= 2;
            } else if (i2 == 2) {
                strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 2);
                i |= 4;
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                pathstringtonodes = (pathStringToNodes) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 3, toPathdefault.IconCompatParcelizer, pathstringtonodes);
                i |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new pathNodesFromArgs(i, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, pathstringtonodes);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        pathNodesFromArgs pathnodesfromargs = (pathNodesFromArgs) obj;
        pathnodesfromargs.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        getY2.read(pathnodesfromargs, defaultInAppMessageSlideupViewFactorySerializer, oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 2, pathnodesfromargs.bridgeMessageID);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 3, toPathdefault.IconCompatParcelizer, pathnodesfromargs.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
