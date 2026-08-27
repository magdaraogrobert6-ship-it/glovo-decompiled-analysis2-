package bo.app;

import com.braze.models.FeatureFlag;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8 implements getInAppMessageManager {
    public static final g8 a;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public /* bridge */ /* synthetic */ setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        g8 g8Var = new g8();
        a = g8Var;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.braze.models.FeatureFlag", g8Var, 4);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read(FeatureFlag.ENABLED, false);
        oncloseactionlambda1.read("properties", false);
        oncloseactionlambda1.read(FeatureFlag.TRACKING_STRING, true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, getWasCloseMessageCalled.write, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        FeatureFlag featureFlag = (FeatureFlag) obj;
        defaultInAppMessageViewWrapperFactory.getClass();
        featureFlag.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        FeatureFlag.write$Self$android_sdk_base_release(featureFlag, defaultInAppMessageSlideupViewFactorySerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        boolean zWrite = false;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String str = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i |= 1;
            } else if (i2 == 1) {
                zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i |= 2;
            } else if (i2 == 2) {
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                i |= 4;
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                i |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new FeatureFlag(i, strMediaMetadataCompat, zWrite, strMediaMetadataCompat2, str, (onCloseClicked) null);
    }
}
