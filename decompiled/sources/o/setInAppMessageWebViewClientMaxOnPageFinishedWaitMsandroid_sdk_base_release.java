package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release implements getInAppMessageManager {
    public static final /* synthetic */ onCloseActionlambda1 RemoteActionCompatParcelizer;
    public static final setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release setinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release = new setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release();
        write = setinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.BoundingBox", setinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release, 8);
        oncloseactionlambda1.read("minLat", false);
        oncloseactionlambda1.read("minLon", false);
        oncloseactionlambda1.read("maxLat", false);
        oncloseactionlambda1.read("maxLon", false);
        oncloseactionlambda1.read("west", true);
        oncloseactionlambda1.read("south", true);
        oncloseactionlambda1.read("east", true);
        oncloseactionlambda1.read("north", true);
        RemoteActionCompatParcelizer = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        double d;
        setIsAutomaticLocationCollectionEnabled setisautomaticlocationcollectionenabled = (setIsAutomaticLocationCollectionEnabled) obj;
        setisautomaticlocationcollectionenabled.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = RemoteActionCompatParcelizer;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        double d2 = setisautomaticlocationcollectionenabled.a;
        double d3 = setisautomaticlocationcollectionenabled.h;
        double d4 = setisautomaticlocationcollectionenabled.g;
        double d5 = setisautomaticlocationcollectionenabled.f;
        double d6 = setisautomaticlocationcollectionenabled.e;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, d2);
        double d7 = setisautomaticlocationcollectionenabled.b;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 1, d7);
        double d8 = setisautomaticlocationcollectionenabled.c;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, d8);
        double d9 = setisautomaticlocationcollectionenabled.d;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 3, d9);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || Double.compare(d6, d7) != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 4, d6);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || Double.compare(d5, d2) != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 5, d5);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || Double.compare(d4, d9) != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 6, d4);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            d = d3;
            if (Double.compare(d, d8) != 0) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
        }
        d = d3;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 7, d);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = RemoteActionCompatParcelizer;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        int i = 0;
        double dRemoteActionCompatParcelizer = 0.0d;
        double dRemoteActionCompatParcelizer2 = 0.0d;
        double dRemoteActionCompatParcelizer3 = 0.0d;
        double dRemoteActionCompatParcelizer4 = 0.0d;
        double dRemoteActionCompatParcelizer5 = 0.0d;
        double dRemoteActionCompatParcelizer6 = 0.0d;
        double dRemoteActionCompatParcelizer7 = 0.0d;
        double dRemoteActionCompatParcelizer8 = 0.0d;
        boolean z = true;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 0);
                    i |= 1;
                    break;
                case 1:
                    dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 1);
                    i |= 2;
                    break;
                case 2:
                    dRemoteActionCompatParcelizer3 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 2);
                    i |= 4;
                    break;
                case 3:
                    dRemoteActionCompatParcelizer4 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 3);
                    i |= 8;
                    break;
                case 4:
                    dRemoteActionCompatParcelizer5 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 4);
                    i |= 16;
                    break;
                case 5:
                    dRemoteActionCompatParcelizer6 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 5);
                    i |= 32;
                    break;
                case 6:
                    dRemoteActionCompatParcelizer7 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 6);
                    i |= 64;
                    break;
                case 7:
                    dRemoteActionCompatParcelizer8 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 7);
                    i |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setIsAutomaticLocationCollectionEnabled(i, dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, dRemoteActionCompatParcelizer3, dRemoteActionCompatParcelizer4, dRemoteActionCompatParcelizer5, dRemoteActionCompatParcelizer6, dRemoteActionCompatParcelizer7, dRemoteActionCompatParcelizer8);
    }
}
