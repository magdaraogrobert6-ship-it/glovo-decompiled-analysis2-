package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AnnotatedString implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final AnnotatedString serializer;
    private static int write = 1;

    static {
        AnnotatedString annotatedString = new AnnotatedString();
        serializer = annotatedString;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.customerchat.selfservice.data.bridge.HostMessage.HostLoadingPerformanceMeasurement.Breakdown", annotatedString, 4);
        oncloseactionlambda1.read("hostNativeDurationMs", false);
        oncloseactionlambda1.read("hostExternalRequestDurationMs", false);
        oncloseactionlambda1.read("bridgeHandshakeDurationMs", false);
        oncloseactionlambda1.read("webViewLoadDurationMs", false);
        descriptor = oncloseactionlambda1;
        int i = write + 73;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {afterclosed, afterclosed, afterclosed, afterclosed};
        int i4 = read + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        toLayoutBreakStrategyxImikfE tolayoutbreakstrategyximikfe = (toLayoutBreakStrategyxImikfE) obj;
        tolayoutbreakstrategyximikfe.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, tolayoutbreakstrategyximikfe.hostNativeDuration, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(1, tolayoutbreakstrategyximikfe.hostExternalRequestDuration, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, tolayoutbreakstrategyximikfe.bridgeHandshakeDuration, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, tolayoutbreakstrategyximikfe.webViewLoadDuration, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:41:0x0060 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int iIconCompatParcelizer;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 45;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i5 = 0;
        int iIconCompatParcelizer2 = 0;
        int iIconCompatParcelizer3 = 0;
        int iIconCompatParcelizer4 = 0;
        int i6 = 0;
        boolean z = true;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 != -1) {
                int i8 = read + 51;
                int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i9;
                Object obj = null;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i7 == 0) {
                    iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    int i10 = read + 97;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else if (i7 != 1) {
                    int i12 = i9 + 51;
                    int i13 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i13;
                    if (i12 % 2 == 0) {
                        if (i7 == 2) {
                            iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i5 |= 4;
                        } else {
                            if (i7 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                return null;
                            }
                            i = i13 + 103;
                            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                i5 |= 92;
                            } else {
                                iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                i5 |= 8;
                            }
                            i6 = iIconCompatParcelizer;
                        }
                    } else if (i7 == 2) {
                        iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                    } else {
                        if (i7 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                            return null;
                        }
                        i = i13 + 103;
                        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                            i5 |= 92;
                        } else {
                            iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        }
                        i6 = iIconCompatParcelizer;
                    }
                } else {
                    iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new toLayoutBreakStrategyxImikfE(i5, iIconCompatParcelizer2, iIconCompatParcelizer3, iIconCompatParcelizer4, i6);
    }
}
