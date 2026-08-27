package com.deliveryhero.fwf_tracking.model;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class PerseusHit$$serializer implements getInAppMessageManager {
    public static final PerseusHit$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private PerseusHit$$serializer() {
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
        PerseusHit$$serializer perseusHit$$serializer = new PerseusHit$$serializer();
        INSTANCE = perseusHit$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_tracking.model.PerseusHit", perseusHit$$serializer, 12);
        oncloseactionlambda1.read(PushNotificationParserObj.COUNTRY_KEY, true);
        oncloseactionlambda1.read("globalEntityId", false);
        oncloseactionlambda1.read("consent", true);
        oncloseactionlambda1.read("clientId", false);
        oncloseactionlambda1.read("eventVariables", false);
        oncloseactionlambda1.read("payloadTimestamp", false);
        oncloseactionlambda1.read("timestamp", false);
        oncloseactionlambda1.read("sessionId", false);
        oncloseactionlambda1.read("userId", true);
        oncloseactionlambda1.read("brand", false);
        oncloseactionlambda1.read("rechargeTo", false);
        oncloseactionlambda1.read("platform", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public PerseusHit deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = PerseusHit.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String strMediaMetadataCompat = null;
        Map map = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i |= 1;
                    break;
                case 1:
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i |= 2;
                    break;
                case 2:
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i |= 4;
                    break;
                case 3:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 4, setgraphicmodalmaxwidthdpArr[4], map);
                    i |= 16;
                    break;
                case 5:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 7);
                    i |= Fields.SpotShadowColor;
                    break;
                case 8:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i |= Fields.RotationX;
                    break;
                case 9:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 9);
                    i |= Fields.RotationY;
                    break;
                case 10:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 10, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i |= Fields.RotationZ;
                    break;
                case 11:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(descriptor2, 11);
                    i |= Fields.CameraDistance;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new PerseusHit(i, str3, str4, str5, strMediaMetadataCompat, map, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, str2, strMediaMetadataCompat5, str, strMediaMetadataCompat6, null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, PerseusHit perseusHit) {
        defaultInAppMessageViewWrapperFactory.getClass();
        perseusHit.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        PerseusHit.write$Self$fwf_client_release(perseusHit, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = PerseusHit.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, setgraphicmodalmaxwidthdpArr[4], beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed};
    }
}
