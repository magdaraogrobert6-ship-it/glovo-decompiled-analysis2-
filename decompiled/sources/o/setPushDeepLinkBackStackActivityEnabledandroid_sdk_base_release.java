package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release implements getInAppMessageManager {
    public static final setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release IconCompatParcelizer;
    public static final /* synthetic */ onCloseActionlambda1 write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s};
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
        setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release setpushdeeplinkbackstackactivityenabledandroid_sdk_base_release = new setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release();
        IconCompatParcelizer = setpushdeeplinkbackstackactivityenabledandroid_sdk_base_release;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.PointLocation", setpushdeeplinkbackstackactivityenabledandroid_sdk_base_release, 2);
        oncloseactionlambda1.read("lat", false);
        oncloseactionlambda1.read("lon", false);
        write = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = write;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        int i = 0;
        double dRemoteActionCompatParcelizer = 0.0d;
        double dRemoteActionCompatParcelizer2 = 0.0d;
        boolean z = true;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 1);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setLargeNotificationIconNameandroid_sdk_base_release(dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, i);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release = (setLargeNotificationIconNameandroid_sdk_base_release) obj;
        setlargenotificationiconnameandroid_sdk_base_release.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = write;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, setlargenotificationiconnameandroid_sdk_base_release.a);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 1, setlargenotificationiconnameandroid_sdk_base_release.b);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
