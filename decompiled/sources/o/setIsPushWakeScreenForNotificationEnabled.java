package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setIsPushWakeScreenForNotificationEnabled implements getInAppMessageManager {
    public static final setIsPushWakeScreenForNotificationEnabled read;
    public static final /* synthetic */ onCloseActionlambda1 write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.IconCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        setIsPushWakeScreenForNotificationEnabled setispushwakescreenfornotificationenabled = new setIsPushWakeScreenForNotificationEnabled();
        read = setispushwakescreenfornotificationenabled;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.NearestPoint", setispushwakescreenfornotificationenabled, 3);
        oncloseactionlambda1.read("point", false);
        oncloseactionlambda1.read("distanceFromStationary", false);
        oncloseactionlambda1.read("isInPolygon", false);
        write = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = write;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        int i = 0;
        boolean zWrite = false;
        double dRemoteActionCompatParcelizer = 0.0d;
        boolean z = true;
        Object objIconCompatParcelizer = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.IconCompatParcelizer, objIconCompatParcelizer);
                i |= 1;
            } else if (i2 == 1) {
                dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 1);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                zWrite = createinappmessageviewlambda1Serializer.write(oncloseactionlambda1, 2);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setIsSessionStartBasedTimeoutEnabled(i, (setLargeNotificationIconNameandroid_sdk_base_release) objIconCompatParcelizer, dRemoteActionCompatParcelizer, zWrite);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setIsSessionStartBasedTimeoutEnabled setissessionstartbasedtimeoutenabled = (setIsSessionStartBasedTimeoutEnabled) obj;
        setissessionstartbasedtimeoutenabled.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = write;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.IconCompatParcelizer, setissessionstartbasedtimeoutenabled.a);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 1, setissessionstartbasedtimeoutenabled.b);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, setissessionstartbasedtimeoutenabled.c);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
