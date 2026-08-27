package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class createPlatformTextStyle implements getInAppMessageManager {
    public static final createPlatformTextStyle IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        createPlatformTextStyle createplatformtextstyle = new createPlatformTextStyle();
        IconCompatParcelizer = createplatformtextstyle;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.customerchat.selfservice.data.bridge.HostMessage.HostLoadingPerformanceMeasurement.Payload", createplatformtextstyle, 4);
        oncloseactionlambda1.read("e2eTotalDurationMs", false);
        oncloseactionlambda1.read("isPreRendered", false);
        oncloseactionlambda1.read("breakdown", false);
        oncloseactionlambda1.read("timestamps", false);
        descriptor = oncloseactionlambda1;
        int i = write + 93;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 39;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 103;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{afterClosed.IconCompatParcelizer, getWasCloseMessageCalled.write, AnnotatedString.serializer, accessgetSavercp.read};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[2];
        setgraphicmodalmaxwidthdpArr[1] = afterClosed.IconCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[1] = getWasCloseMessageCalled.write;
        setgraphicmodalmaxwidthdpArr[2] = AnnotatedString.serializer;
        setgraphicmodalmaxwidthdpArr[3] = accessgetSavercp.read;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidTextStyle_androidKt androidTextStyle_androidKt = (AndroidTextStyle_androidKt) obj;
        androidTextStyle_androidKt.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, androidTextStyle_androidKt.totalDuration, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, androidTextStyle_androidKt.isPreRendered);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AnnotatedString.serializer, androidTextStyle_androidKt.breakdown);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, accessgetSavercp.read, androidTextStyle_androidKt.timestamps);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 7;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        toLayoutBreakStrategyxImikfE tolayoutbreakstrategyximikfe = null;
        toLayoutTextGranularityduNsdkg tolayouttextgranularitydunsdkg = null;
        int i4 = 0;
        int iIconCompatParcelizer = 0;
        boolean zWrite = false;
        boolean z = true;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = serializer + 27;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i7;
                int i8 = i6 % 2;
                if (i5 == 0) {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                } else if (i5 == 1) {
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                } else if (i5 != 2) {
                    int i9 = i7 + 125;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (i5 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        int i11 = serializer + 119;
                        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            return null;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    tolayouttextgranularitydunsdkg = (toLayoutTextGranularityduNsdkg) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, accessgetSavercp.read, tolayouttextgranularitydunsdkg);
                    i4 |= 8;
                } else {
                    tolayoutbreakstrategyximikfe = (toLayoutBreakStrategyxImikfE) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AnnotatedString.serializer, tolayoutbreakstrategyximikfe);
                    i4 |= 4;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidTextStyle_androidKt androidTextStyle_androidKt = new AndroidTextStyle_androidKt(i4, iIconCompatParcelizer, zWrite, tolayoutbreakstrategyximikfe, tolayouttextgranularitydunsdkg);
        int i12 = serializer + 7;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            int i13 = 6 / 0;
        }
        return androidTextStyle_androidKt;
    }
}
