package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setSessionStartBasedTimeoutEnabledandroid_sdk_base_release implements getInAppMessageManager {
    public static final /* synthetic */ onCloseActionlambda1 IconCompatParcelizer;
    public static final setSessionStartBasedTimeoutEnabledandroid_sdk_base_release RemoteActionCompatParcelizer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        setSessionStartBasedTimeoutEnabledandroid_sdk_base_release setsessionstartbasedtimeoutenabledandroid_sdk_base_release = new setSessionStartBasedTimeoutEnabledandroid_sdk_base_release();
        RemoteActionCompatParcelizer = setsessionstartbasedtimeoutenabledandroid_sdk_base_release;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.Venue", setsessionstartbasedtimeoutenabledandroid_sdk_base_release, 4);
        oncloseactionlambda1.read("centroid", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("osmTags", false);
        oncloseactionlambda1.read("polygon", false);
        IconCompatParcelizer = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = IconCompatParcelizer;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = setSdkFlavorandroid_sdk_base_release.e;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Object objIconCompatParcelizer = null;
        Object objIconCompatParcelizer2 = null;
        Object objSerializer = null;
        String strMediaMetadataCompat = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.IconCompatParcelizer, objIconCompatParcelizer);
                i |= 1;
            } else if (i2 == 1) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                i |= 2;
            } else if (i2 == 2) {
                objIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], objIconCompatParcelizer2);
                i |= 4;
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                objSerializer = createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 3, setServerTarget.read, objSerializer);
                i |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setSdkFlavorandroid_sdk_base_release(i, (setLargeNotificationIconNameandroid_sdk_base_release) objIconCompatParcelizer, strMediaMetadataCompat, (List) objIconCompatParcelizer2, (setSdkFlavor) objSerializer);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release = (setSdkFlavorandroid_sdk_base_release) obj;
        setsdkflavorandroid_sdk_base_release.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = IconCompatParcelizer;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = setSdkFlavorandroid_sdk_base_release.e;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.IconCompatParcelizer, setsdkflavorandroid_sdk_base_release.a);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, setsdkflavorandroid_sdk_base_release.b);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], setsdkflavorandroid_sdk_base_release.c);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 3, setServerTarget.read, setsdkflavorandroid_sdk_base_release.d);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.IconCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, setSdkFlavorandroid_sdk_base_release.e[2], LazyKt__LazyJVMKt.read(setServerTarget.read)};
    }
}
