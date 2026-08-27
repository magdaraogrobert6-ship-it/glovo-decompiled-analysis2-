package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setChildrenSuccessfulruntime implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final setChildrenSuccessfulruntime RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        setChildrenSuccessfulruntime setchildrensuccessfulruntime = new setChildrenSuccessfulruntime();
        RemoteActionCompatParcelizer = setchildrensuccessfulruntime;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.login.data.forgotpassword.entity.ForgotPasswordTimerEntity", setchildrensuccessfulruntime, 1);
        oncloseactionlambda1.read("timerEndTimeInMillis", false);
        descriptor = oncloseactionlambda1;
        int i = write + 67;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{onDismissed.write};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[0];
        setgraphicmodalmaxwidthdpArr[0] = onDismissed.write;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer;
        long j;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 41;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            setSuccessfulruntime setsuccessfulruntime = (setSuccessfulruntime) obj;
            setsuccessfulruntime.getClass();
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            j = setsuccessfulruntime.timerEndTimeInMillis;
            i = 1;
        } else {
            setSuccessfulruntime setsuccessfulruntime2 = (setSuccessfulruntime) obj;
            setsuccessfulruntime2.getClass();
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            j = setsuccessfulruntime2.timerEndTimeInMillis;
            i = 0;
        }
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, j);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = IconCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jSerializer = 0;
        boolean z = true;
        int i4 = 0;
        while (z) {
            int i5 = IconCompatParcelizer + 93;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj = null;
            if (i5 % 2 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                obj.hashCode();
                throw null;
            }
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 == -1) {
                z = false;
            } else {
                if (i6 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
                }
                jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i4 = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new setSuccessfulruntime(i4, jSerializer);
    }
}
