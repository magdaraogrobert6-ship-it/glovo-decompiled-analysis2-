package com.deliveryhero.fwf_client.model;

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
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoPrerequisiteMsg$$serializer implements getInAppMessageManager {
    public static final ProtoPrerequisiteMsg$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoPrerequisiteMsg$$serializer() {
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
        ProtoPrerequisiteMsg$$serializer protoPrerequisiteMsg$$serializer = new ProtoPrerequisiteMsg$$serializer();
        INSTANCE = protoPrerequisiteMsg$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoPrerequisiteMsg", protoPrerequisiteMsg$$serializer, 3);
        oncloseactionlambda1.read("expectedVariation", false);
        oncloseactionlambda1.read("participants", true);
        oncloseactionlambda1.read("featureKey", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoPrerequisiteMsg deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoPrerequisiteMsg.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        ProtoValue protoValue = null;
        ProtoParticipants protoParticipants = null;
        String strMediaMetadataCompat = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                protoValue = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, ProtoValue$$serializer.INSTANCE, protoValue);
                i |= 1;
            } else if (i2 == 1) {
                protoParticipants = (ProtoParticipants) createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 1, setgraphicmodalmaxwidthdpArr[1], protoParticipants);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 2);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new ProtoPrerequisiteMsg(i, protoValue, protoParticipants, strMediaMetadataCompat, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoPrerequisiteMsg protoPrerequisiteMsg) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoPrerequisiteMsg.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoPrerequisiteMsg.write$Self$fwf_client_release(protoPrerequisiteMsg, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(ProtoValue$$serializer.INSTANCE), ProtoPrerequisiteMsg.$childSerializers[1], beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
    }
}
