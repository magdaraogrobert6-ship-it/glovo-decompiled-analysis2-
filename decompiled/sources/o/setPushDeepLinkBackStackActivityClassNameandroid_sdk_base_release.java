package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release implements getInAppMessageManager {
    public static final /* synthetic */ onCloseActionlambda1 serializer;
    public static final setPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return serializer;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        setPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release setpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release = new setPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release();
        write = setpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.OsmTag", setpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release, 2);
        oncloseactionlambda1.read("key", false);
        oncloseactionlambda1.read("value", false);
        serializer = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = serializer;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
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
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setPushDeepLinkBackStackActivityClass(i, strMediaMetadataCompat, strMediaMetadataCompat2);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setPushDeepLinkBackStackActivityClass setpushdeeplinkbackstackactivityclass = (setPushDeepLinkBackStackActivityClass) obj;
        setpushdeeplinkbackstackactivityclass.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = serializer;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, setpushdeeplinkbackstackactivityclass.a);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, setpushdeeplinkbackstackactivityclass.b);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
