package com.deliveryhero.fwf_tracking.model;

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
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class FwFEventValue$HoldoutEvaluation$$serializer implements getInAppMessageManager {
    public static final FwFEventValue$HoldoutEvaluation$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private FwFEventValue$HoldoutEvaluation$$serializer() {
    }

    @Override // o.setGraphicModalMaxWidthDp
    public r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        FwFEventValue$HoldoutEvaluation$$serializer fwFEventValue$HoldoutEvaluation$$serializer = new FwFEventValue$HoldoutEvaluation$$serializer();
        INSTANCE = fwFEventValue$HoldoutEvaluation$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_tracking.model.FwFEventValue.HoldoutEvaluation", fwFEventValue$HoldoutEvaluation$$serializer, 4);
        oncloseactionlambda1.read("holdoutEvaluation", false);
        oncloseactionlambda1.read("holdoutKey", false);
        oncloseactionlambda1.read("holdoutVariation", false);
        oncloseactionlambda1.read("holdoutVariationName", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{getWasCloseMessageCalled.write, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public FwFEventValue.HoldoutEvaluation deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        boolean zWrite = false;
        String strMediaMetadataCompat = null;
        String str = null;
        String str2 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                zWrite = createinappmessageviewlambda1Serializer.write(descriptor2, 0);
                i |= 1;
            } else if (i2 == 1) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 1);
                i |= 2;
            } else if (i2 == 2) {
                str = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                i |= 4;
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                str2 = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                i |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new FwFEventValue.HoldoutEvaluation(i, zWrite, strMediaMetadataCompat, str, str2, null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, FwFEventValue.HoldoutEvaluation holdoutEvaluation) {
        defaultInAppMessageViewWrapperFactory.getClass();
        holdoutEvaluation.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        FwFEventValue.HoldoutEvaluation.write$Self$fwf_client_release(holdoutEvaluation, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }
}
