package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setDrawerElevation implements getInAppMessageManager {
    public static final setDrawerElevation IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        setDrawerElevation setdrawerelevation = new setDrawerElevation();
        IconCompatParcelizer = setdrawerelevation;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage.Timestamps", setdrawerelevation, 4);
        oncloseactionlambda1.read("userTap", false);
        oncloseactionlambda1.read("webViewUrlLoadStart", false);
        oncloseactionlambda1.read("webViewUrlLoadEnd", false);
        oncloseactionlambda1.read("contentRendered", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = read + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[2];
            onDismissed ondismissed = onDismissed.write;
            setgraphicmodalmaxwidthdpArr[1] = ondismissed;
            setgraphicmodalmaxwidthdpArr[0] = ondismissed;
            setgraphicmodalmaxwidthdpArr[5] = ondismissed;
            setgraphicmodalmaxwidthdpArr[3] = ondismissed;
        } else {
            onDismissed ondismissed2 = onDismissed.write;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{ondismissed2, ondismissed2, ondismissed2, ondismissed2};
        }
        int i3 = serializer + 75;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setDrawerListener setdrawerlistener = (setDrawerListener) obj;
        setdrawerlistener.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setdrawerlistener.userTap);
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setdrawerlistener.webViewUrlLoadStart);
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setdrawerlistener.webViewUrlLoadEnd);
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, setdrawerlistener.contentRendered);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = serializer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jSerializer = 0;
        long jSerializer2 = 0;
        long jSerializer3 = 0;
        long jSerializer4 = 0;
        int i4 = 0;
        boolean z = true;
        while (!(!z)) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = serializer + 31;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i7;
                Object obj = null;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i5 == 0) {
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                } else if (i5 == 1) {
                    jSerializer2 = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                } else if (i5 == 2) {
                    jSerializer3 = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i4 |= 4;
                } else {
                    if (i5 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        int i8 = serializer + 83;
                        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            int i9 = 97 / 0;
                        }
                        return null;
                    }
                    int i10 = i7 + 29;
                    serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    jSerializer4 = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i4 |= 8;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new setDrawerListener(i4, jSerializer, jSerializer2, jSerializer3, jSerializer4);
    }
}
