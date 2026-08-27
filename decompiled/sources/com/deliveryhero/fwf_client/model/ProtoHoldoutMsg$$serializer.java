package com.deliveryhero.fwf_client.model;

import com.deliveryhero.fwf_cache.UtilKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.onDismissed;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoHoldoutMsg$$serializer implements getInAppMessageManager {
    public static final ProtoHoldoutMsg$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoHoldoutMsg$$serializer() {
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
        ProtoHoldoutMsg$$serializer protoHoldoutMsg$$serializer = new ProtoHoldoutMsg$$serializer();
        INSTANCE = protoHoldoutMsg$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoHoldoutMsg", protoHoldoutMsg$$serializer, 7);
        oncloseactionlambda1.read("key", false);
        oncloseactionlambda1.read("allocation", true);
        oncloseactionlambda1.read("clauses", true);
        oncloseactionlambda1.read("endDate", false);
        oncloseactionlambda1.read(UtilKt.ACCOUNT_KEY, false);
        oncloseactionlambda1.read("evalNonAuth", true);
        oncloseactionlambda1.read("changeVersionControl", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoHoldoutMsg deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoHoldoutMsg.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i = 0;
        int iIconCompatParcelizer = 0;
        boolean zWrite = false;
        String strMediaMetadataCompat = null;
        List list = null;
        ProtoTimestamp protoTimestamp = null;
        String strMediaMetadataCompat2 = null;
        long jSerializer = 0;
        boolean z = true;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 2, setgraphicmodalmaxwidthdpArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    protoTimestamp = (ProtoTimestamp) createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 3, ProtoTimestamp$$serializer.INSTANCE, protoTimestamp);
                    i |= 8;
                    break;
                case 4:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    zWrite = createinappmessageviewlambda1Serializer.write(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(descriptor2, 6);
                    i |= 64;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new ProtoHoldoutMsg(i, strMediaMetadataCompat, iIconCompatParcelizer, list, protoTimestamp, strMediaMetadataCompat2, zWrite, jSerializer, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoHoldoutMsg protoHoldoutMsg) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoHoldoutMsg.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoHoldoutMsg.write$Self$fwf_client_release(protoHoldoutMsg, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(ProtoHoldoutMsg.$childSerializers[2]);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, afterClosed.IconCompatParcelizer, setgraphicmodalmaxwidthdp, ProtoTimestamp$$serializer.INSTANCE, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, onDismissed.write};
    }
}
