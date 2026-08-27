package com.deliveryhero.fwf_client.model;

import androidx.compose.ui.graphics.Fields;
import com.braze.models.FeatureFlag;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.constant.FWFConstants;
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
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoFeatureMsg$$serializer implements getInAppMessageManager {
    public static final ProtoFeatureMsg$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoFeatureMsg$$serializer() {
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
        ProtoFeatureMsg$$serializer protoFeatureMsg$$serializer = new ProtoFeatureMsg$$serializer();
        INSTANCE = protoFeatureMsg$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoFeatureMsg", protoFeatureMsg$$serializer, 19);
        oncloseactionlambda1.read("key", false);
        oncloseactionlambda1.read(FWFConstants.EXPLANATION_TYPE_KIND, false);
        oncloseactionlambda1.read(FeatureFlag.ENABLED, true);
        oncloseactionlambda1.read("evalUserId", true);
        oncloseactionlambda1.read("salt", false);
        oncloseactionlambda1.read("defaultRule", false);
        oncloseactionlambda1.read("offVariation", false);
        oncloseactionlambda1.read("offVariationName", true);
        oncloseactionlambda1.read("rules", true);
        oncloseactionlambda1.read("segments", true);
        oncloseactionlambda1.read("targets", true);
        oncloseactionlambda1.read("prerequisiteFeatures", true);
        oncloseactionlambda1.read("changeVersionControl", true);
        oncloseactionlambda1.read("identifiersValidationsEnabled", true);
        oncloseactionlambda1.read("holdoutKeys", true);
        oncloseactionlambda1.read("holdoutVariation", true);
        oncloseactionlambda1.read("holdoutVariationName", true);
        oncloseactionlambda1.read("runningExperimentId", true);
        oncloseactionlambda1.read("trackingOutcomes", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoFeatureMsg deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoFeatureMsg.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = true;
        ProtoValue protoValue = null;
        int i3 = 0;
        List list4 = null;
        ProtoValue protoValue2 = null;
        ProtoValue protoValue3 = null;
        List list5 = null;
        List list6 = null;
        ProtoRuleMsg protoRuleMsg = null;
        ProtoValue protoValue4 = null;
        String strMediaMetadataCompat = null;
        boolean zWrite = false;
        boolean zWrite2 = false;
        int iIconCompatParcelizer = 0;
        boolean zWrite3 = false;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        int iIconCompatParcelizer2 = 0;
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(descriptor2);
            switch (i4) {
                case -1:
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    z = false;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 0:
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    z = z;
                    i3 |= 1;
                    protoRuleMsg = protoRuleMsg;
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 0);
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 1:
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    i3 |= 2;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 1);
                    protoRuleMsg = protoRuleMsg;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    break;
                case 2:
                    z = z;
                    i3 |= 4;
                    zWrite2 = createinappmessageviewlambda1Serializer.write(descriptor2, 2);
                    protoRuleMsg = protoRuleMsg;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    break;
                case 3:
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    z = z;
                    zWrite = createinappmessageviewlambda1Serializer.write(descriptor2, 3);
                    i3 |= 8;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    break;
                case 4:
                    z = z;
                    i3 |= 16;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 4);
                    protoRuleMsg = protoRuleMsg;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    break;
                case 5:
                    z = z;
                    i3 |= 32;
                    protoRuleMsg = (ProtoRuleMsg) createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 5, ProtoRuleMsg$$serializer.INSTANCE, protoRuleMsg);
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 6:
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    protoValue4 = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 6, ProtoValue$$serializer.INSTANCE, protoValue4);
                    i3 |= 64;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 7:
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    protoValue = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 7, ProtoValue$$serializer.INSTANCE, protoValue);
                    i3 |= Fields.SpotShadowColor;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 8:
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    list = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 8, setgraphicmodalmaxwidthdpArr[8], list);
                    i3 |= Fields.RotationX;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 9:
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    list2 = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 9, setgraphicmodalmaxwidthdpArr[9], list2);
                    i3 |= Fields.RotationY;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 10:
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    list3 = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 10, setgraphicmodalmaxwidthdpArr[10], list3);
                    i3 |= Fields.RotationZ;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 11:
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    list6 = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 11, setgraphicmodalmaxwidthdpArr[11], list6);
                    i3 |= Fields.CameraDistance;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 12:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 12);
                    i2 = i3 | Fields.TransformOrigin;
                    i3 = i2;
                    protoRuleMsg = protoRuleMsg;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    break;
                case 13:
                    zWrite3 = createinappmessageviewlambda1Serializer.write(descriptor2, 13);
                    i2 = i3 | 8192;
                    i3 = i2;
                    protoRuleMsg = protoRuleMsg;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    break;
                case 14:
                    z = z;
                    protoRuleMsg = protoRuleMsg;
                    list5 = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 14, setgraphicmodalmaxwidthdpArr[14], list5);
                    i3 |= Fields.Clip;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 15:
                    protoValue3 = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 15, ProtoValue$$serializer.INSTANCE, protoValue3);
                    i = Fields.CompositingStrategy;
                    i3 |= i;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 16:
                    protoValue2 = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 16, ProtoValue$$serializer.INSTANCE, protoValue2);
                    i = 65536;
                    i3 |= i;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                case 17:
                    iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 17);
                    i2 = 131072 | i3;
                    i3 = i2;
                    protoRuleMsg = protoRuleMsg;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    break;
                case 18:
                    list4 = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 18, setgraphicmodalmaxwidthdpArr[18], list4);
                    i = Fields.ColorFilter;
                    i3 |= i;
                    z = z;
                    setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr;
                    protoRuleMsg = protoRuleMsg;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        List list7 = list4;
        String str = strMediaMetadataCompat3;
        ProtoValue protoValue5 = protoValue2;
        ProtoValue protoValue6 = protoValue3;
        return new ProtoFeatureMsg(i3, str, strMediaMetadataCompat2, zWrite2, zWrite, strMediaMetadataCompat, protoRuleMsg, protoValue4, protoValue, list, list2, list3, list6, iIconCompatParcelizer, zWrite3, list5, protoValue6, protoValue5, iIconCompatParcelizer2, list7, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoFeatureMsg protoFeatureMsg) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoFeatureMsg.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoFeatureMsg.write$Self$fwf_client_release(protoFeatureMsg, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoFeatureMsg.$childSerializers;
        ProtoValue$$serializer protoValue$$serializer = ProtoValue$$serializer.INSTANCE;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(protoValue$$serializer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(protoValue$$serializer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[8]);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp4 = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[9]);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp5 = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[10]);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp6 = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[11]);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp7 = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[14]);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp8 = LazyKt__LazyJVMKt.read(protoValue$$serializer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp9 = LazyKt__LazyJVMKt.read(protoValue$$serializer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp10 = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[18]);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, getwasclosemessagecalled, getwasclosemessagecalled, beforeinappmessageviewclosed, ProtoRuleMsg$$serializer.INSTANCE, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdp3, setgraphicmodalmaxwidthdp4, setgraphicmodalmaxwidthdp5, setgraphicmodalmaxwidthdp6, afterclosed, getwasclosemessagecalled, setgraphicmodalmaxwidthdp7, setgraphicmodalmaxwidthdp8, setgraphicmodalmaxwidthdp9, afterclosed, setgraphicmodalmaxwidthdp10};
    }
}
