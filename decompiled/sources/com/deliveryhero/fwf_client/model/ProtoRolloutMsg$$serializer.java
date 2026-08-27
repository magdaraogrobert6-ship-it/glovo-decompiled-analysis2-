package com.deliveryhero.fwf_client.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.afterClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoRolloutMsg$$serializer implements getInAppMessageManager {
    public static final ProtoRolloutMsg$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoRolloutMsg$$serializer() {
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
        ProtoRolloutMsg$$serializer protoRolloutMsg$$serializer = new ProtoRolloutMsg$$serializer();
        INSTANCE = protoRolloutMsg$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoRolloutMsg", protoRolloutMsg$$serializer, 4);
        oncloseactionlambda1.read("variation", false);
        oncloseactionlambda1.read("variationName", false);
        oncloseactionlambda1.read("weight", true);
        oncloseactionlambda1.read("isParticipating", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        ProtoValue$$serializer protoValue$$serializer = ProtoValue$$serializer.INSTANCE;
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(protoValue$$serializer), LazyKt__LazyJVMKt.read(protoValue$$serializer), afterClosed.IconCompatParcelizer, getWasCloseMessageCalled.write};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoRolloutMsg deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        int iIconCompatParcelizer = 0;
        boolean zWrite = false;
        ProtoValue protoValue = null;
        ProtoValue protoValue2 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                protoValue = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, ProtoValue$$serializer.INSTANCE, protoValue);
                i |= 1;
            } else if (i2 == 1) {
                protoValue2 = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 1, ProtoValue$$serializer.INSTANCE, protoValue2);
                i |= 2;
            } else if (i2 == 2) {
                iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 2);
                i |= 4;
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                zWrite = createinappmessageviewlambda1Serializer.write(descriptor2, 3);
                i |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new ProtoRolloutMsg(i, protoValue, protoValue2, iIconCompatParcelizer, zWrite, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoRolloutMsg protoRolloutMsg) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoRolloutMsg.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoRolloutMsg.write$Self$fwf_client_release(protoRolloutMsg, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }
}
