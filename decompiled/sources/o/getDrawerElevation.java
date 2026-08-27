package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getDrawerElevation implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final getDrawerElevation RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        getDrawerElevation getdrawerelevation = new getDrawerElevation();
        RemoteActionCompatParcelizer = getdrawerelevation;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage.Breakdown", getdrawerelevation, 4);
        oncloseactionlambda1.read("hostNativeDurationMs", false);
        oncloseactionlambda1.read("hostExternalRequestDurationMs", false);
        oncloseactionlambda1.read("bridgeHandshakeDurationMs", false);
        oncloseactionlambda1.read("webViewLoadDurationMs", false);
        descriptor = oncloseactionlambda1;
        int i = write + 19;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 89;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 3;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {afterclosed, afterclosed, afterclosed, afterclosed};
        int i4 = read + 29;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isPackable ispackable = (isPackable) obj;
        ispackable.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, ispackable.hostNativeDurationMs, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(1, ispackable.hostExternalRequestDurationMs, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, ispackable.bridgeHandshakeDurationMs, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, ispackable.webViewLoadDurationMs, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0014 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i5 = 0;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        int iIconCompatParcelizer3 = 0;
        int iIconCompatParcelizer4 = 0;
        boolean z = true;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 != -1) {
                int i7 = serializer;
                int i8 = i7 + 9;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 67 / 0;
                    if (i6 != 0) {
                        i2 = i7 + 87;
                        i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        read = i3;
                        if (i2 % 2 == 0) {
                            if (i6 != 0) {
                                iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                                i5 |= 2;
                            } else if (i6 != 2) {
                                iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                                i5 |= 4;
                            } else {
                                if (i6 == 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                    return null;
                                }
                                int i10 = i3 + 63;
                                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                                iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                i5 |= 8;
                            }
                        } else if (i6 != 1) {
                            iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i5 |= 2;
                        } else if (i6 != 2) {
                            iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i5 |= 4;
                        } else {
                            if (i6 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            int i12 = i3 + 63;
                            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        }
                    } else {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i5 |= 1;
                        i = serializer + 63;
                        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            int i14 = 5 / 5;
                        }
                    }
                } else if (i6 != 0) {
                    i2 = i7 + 87;
                    i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i3;
                    if (i2 % 2 == 0) {
                        if (i6 != 0) {
                            iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i5 |= 2;
                        } else if (i6 != 2) {
                            iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i5 |= 4;
                        } else {
                            if (i6 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            int i15 = i3 + 63;
                            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        }
                    } else if (i6 != 1) {
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                    } else if (i6 != 2) {
                        iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                    } else {
                        if (i6 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                            return null;
                        }
                        int i17 = i3 + 63;
                        serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i5 |= 8;
                    }
                } else {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    i = serializer + 63;
                    read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i19 = 5 / 5;
                    }
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new isPackable(i5, iIconCompatParcelizer, iIconCompatParcelizer2, iIconCompatParcelizer3, iIconCompatParcelizer4);
    }
}
