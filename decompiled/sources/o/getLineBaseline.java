package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLineBaseline implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final getLineBaseline read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        getLineBaseline getlinebaseline = new getLineBaseline();
        read = getlinebaseline;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("HELPCENTER_ENCOUNTERED_ERROR", getlinebaseline, 4);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("messageType", false);
        oncloseactionlambda1.read("bridgeMessageId", false);
        oncloseactionlambda1.read("payload", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 91;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 73;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 91;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getLineEnd.write};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[5];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[1] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[5] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[2] = getLineEnd.write;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLineEllipsisCountui_text getlineellipsiscountui_text = (getLineEllipsisCountui_text) obj;
        getlineellipsiscountui_text.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        updateOffsetsLDcG7Xg.IconCompatParcelizer(getlineellipsiscountui_text, defaultInAppMessageSlideupViewFactorySerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getlineellipsiscountui_text.bridgeMessageId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getLineEnd.write, getlineellipsiscountui_text.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        getLineForVerticalPosition getlineforverticalposition = null;
        int i3 = 0;
        boolean z = true;
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                z = false;
            } else if (i4 == 0) {
                createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i3 |= 1;
            } else if (i4 != 1) {
                int i5 = write + 79;
                int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i6;
                if (i5 % 2 != 0) {
                    if (i4 == 2) {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i3 |= 4;
                    } else {
                        if (i4 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                            return null;
                        }
                        i = i6 + 79;
                        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            getlineforverticalposition = (getLineForVerticalPosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getLineEnd.write, getlineforverticalposition);
                            i3 |= 74;
                        } else {
                            getlineforverticalposition = (getLineForVerticalPosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getLineEnd.write, getlineforverticalposition);
                            i3 |= 8;
                        }
                        int i7 = write + 59;
                        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    }
                } else if (i4 == 2) {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i3 |= 4;
                } else {
                    if (i4 == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                        return null;
                    }
                    i = i6 + 79;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        getlineforverticalposition = (getLineForVerticalPosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getLineEnd.write, getlineforverticalposition);
                        i3 |= 74;
                    } else {
                        getlineforverticalposition = (getLineForVerticalPosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getLineEnd.write, getlineforverticalposition);
                        i3 |= 8;
                    }
                    int i9 = write + 59;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            } else {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i3 |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getLineEllipsisCountui_text(i3, strMediaMetadataCompat, strMediaMetadataCompat2, getlineforverticalposition);
    }
}
