package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class OutlineUtils implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final OutlineUtils serializer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        OutlineUtils outlineUtils = new OutlineUtils();
        serializer = outlineUtils;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.contract.model.ClientConfig", outlineUtils, 5);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, false);
        oncloseactionlambda1.read("globalEntityID", false);
        oncloseactionlambda1.read("userType", false);
        oncloseactionlambda1.read("pushNotificationsTokenType", false);
        oncloseactionlambda1.read("dhEnvironment", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = LayerSnapshot_androidKt.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = null;
        getSpotShadowColor getspotshadowcolor = null;
        rebuildOutline rebuildoutline = null;
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
                resolvelockhardwarecanvasmethod = (resolveLockHardwareCanvasMethod) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], resolvelockhardwarecanvasmethod);
                i |= 4;
            } else if (i2 == 3) {
                getspotshadowcolor = (getSpotShadowColor) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 3, setgraphicmodalmaxwidthdpArr[3], getspotshadowcolor);
                i |= 8;
            } else {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                rebuildoutline = (rebuildOutline) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 4, setgraphicmodalmaxwidthdpArr[4], rebuildoutline);
                i |= 16;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new LayerSnapshot_androidKt(i, strMediaMetadataCompat, strMediaMetadataCompat2, resolvelockhardwarecanvasmethod, getspotshadowcolor, rebuildoutline);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        LayerSnapshot_androidKt layerSnapshot_androidKt = (LayerSnapshot_androidKt) obj;
        layerSnapshot_androidKt.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = LayerSnapshot_androidKt.$childSerializers;
        String str = layerSnapshot_androidKt.country;
        rebuildOutline rebuildoutline = layerSnapshot_androidKt.dhEnvironment;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, layerSnapshot_androidKt.globalEntityID);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], layerSnapshot_androidKt.userType);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 3, setgraphicmodalmaxwidthdpArr[3], layerSnapshot_androidKt.pushNotificationsTokenType);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || rebuildoutline != rebuildOutline.PRODUCTION) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 4, setgraphicmodalmaxwidthdpArr[4], rebuildoutline);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = LayerSnapshot_androidKt.$childSerializers;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpArr[2];
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpArr[3];
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = setgraphicmodalmaxwidthdpArr[4];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdp3};
    }
}
