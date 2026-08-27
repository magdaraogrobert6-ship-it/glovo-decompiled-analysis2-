package com.roadrunner.delivery.pickupdropoff.tasks.model;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.heightMask;
import o.onCloseActionlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CashPaymentTaskUiItem$Reasons$$serializer implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    private static int serializer;
    public static final CashPaymentTaskUiItem$Reasons$$serializer write;

    static {
        CashPaymentTaskUiItem$Reasons$$serializer cashPaymentTaskUiItem$Reasons$$serializer = new CashPaymentTaskUiItem$Reasons$$serializer();
        write = cashPaymentTaskUiItem$Reasons$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.Reasons", cashPaymentTaskUiItem$Reasons$$serializer, 4);
        oncloseactionlambda1.read(PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("items", false);
        oncloseactionlambda1.read("editedReasonPrefix", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 93;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 7;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 63;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, heightMask.IconCompatParcelizer, beforeinappmessageviewclosed};
        int i4 = read + 51;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CashPaymentTaskUiItem.Reasons reasons = (CashPaymentTaskUiItem.Reasons) obj;
        reasons.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, reasons.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, reasons.description);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, heightMask.IconCompatParcelizer, reasons.items);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, reasons.editedReasonPrefix);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 33;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 29;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = null;
        String strMediaMetadataCompat3 = null;
        int i5 = 0;
        boolean z = true;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 != -1) {
                int i7 = read;
                int i8 = i7 + 35;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        int i9 = i7 + 9;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        if (i6 == 2) {
                            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, heightMask.IconCompatParcelizer, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                            i5 |= 4;
                            i = read + 121;
                            IconCompatParcelizer = i % Fields.SpotShadowColor;
                        } else {
                            if (i6 != 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        }
                    } else {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                        i = IconCompatParcelizer + 75;
                        read = i % Fields.SpotShadowColor;
                    }
                    int i11 = i % 2;
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new CashPaymentTaskUiItem.Reasons(i5, strMediaMetadataCompat, strMediaMetadataCompat2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, strMediaMetadataCompat3);
    }
}
