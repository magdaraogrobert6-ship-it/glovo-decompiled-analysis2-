package com.deliveryhero.fwf_http.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.onDismissed;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class FeatureRequest$$serializer implements getInAppMessageManager {
    public static final FeatureRequest$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private FeatureRequest$$serializer() {
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
        FeatureRequest$$serializer featureRequest$$serializer = new FeatureRequest$$serializer();
        INSTANCE = featureRequest$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_http.model.FeatureRequest", featureRequest$$serializer, 2);
        oncloseactionlambda1.read("key", false);
        oncloseactionlambda1.read("version", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(onDismissed.write)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public FeatureRequest deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        createinappmessageviewlambda1Serializer.getClass();
        onCloseClicked oncloseclicked = null;
        boolean z = true;
        int i = 0;
        String strMediaMetadataCompat = null;
        Long l = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                l = (Long) createinappmessageviewlambda1Serializer.serializer(descriptor2, 1, onDismissed.write, l);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new FeatureRequest(i, strMediaMetadataCompat, l, oncloseclicked);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, FeatureRequest featureRequest) {
        defaultInAppMessageViewWrapperFactory.getClass();
        featureRequest.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        FeatureRequest.write$Self$fwf_client_release(featureRequest, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }
}
