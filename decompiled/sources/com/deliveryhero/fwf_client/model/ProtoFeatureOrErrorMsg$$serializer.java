package com.deliveryhero.fwf_client.model;

import com.deliveryhero.fwf_cache.UtilKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.constant.FWFConstants;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoFeatureOrErrorMsg$$serializer implements getInAppMessageManager {
    public static final ProtoFeatureOrErrorMsg$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoFeatureOrErrorMsg$$serializer() {
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
        ProtoFeatureOrErrorMsg$$serializer protoFeatureOrErrorMsg$$serializer = new ProtoFeatureOrErrorMsg$$serializer();
        INSTANCE = protoFeatureOrErrorMsg$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoFeatureOrErrorMsg", protoFeatureOrErrorMsg$$serializer, 2);
        oncloseactionlambda1.read(UtilKt.FEATURE_CACHE_KEY_PREFIX, true);
        oncloseactionlambda1.read(FWFConstants.EXPLANATION_TYPE_ERROR, true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(ProtoFeatureMsg$$serializer.INSTANCE), LazyKt__LazyJVMKt.read(ProtoErrorMsg$$serializer.INSTANCE)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoFeatureOrErrorMsg deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        ProtoFeatureMsg protoFeatureMsg = null;
        ProtoErrorMsg protoErrorMsg = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                protoFeatureMsg = (ProtoFeatureMsg) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, ProtoFeatureMsg$$serializer.INSTANCE, protoFeatureMsg);
                i |= 1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                protoErrorMsg = (ProtoErrorMsg) createinappmessageviewlambda1Serializer.serializer(descriptor2, 1, ProtoErrorMsg$$serializer.INSTANCE, protoErrorMsg);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new ProtoFeatureOrErrorMsg(i, protoFeatureMsg, protoErrorMsg, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoFeatureOrErrorMsg protoFeatureOrErrorMsg) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoFeatureOrErrorMsg.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoFeatureOrErrorMsg.write$Self$fwf_client_release(protoFeatureOrErrorMsg, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }
}
