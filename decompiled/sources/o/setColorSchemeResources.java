package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setColorSchemeResources implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final setColorSchemeResources serializer;
    private static int write;

    static {
        setColorSchemeResources setcolorschemeresources = new setColorSchemeResources();
        serializer = setcolorschemeresources;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.liveness.recording.domain.detectMovement.HeadMovementThresholds", setcolorschemeresources, 4);
        oncloseactionlambda1.read("left", false);
        oncloseactionlambda1.read("left_facing", false);
        oncloseactionlambda1.read("right", false);
        oncloseactionlambda1.read("right_facing", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 5;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 3;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onClickedlambda0 onclickedlambda0 = onClickedlambda0.serializer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {onclickedlambda0, onclickedlambda0, onclickedlambda0, onclickedlambda0};
        int i4 = RemoteActionCompatParcelizer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        finishSpinner finishspinner = (finishSpinner) obj;
        finishspinner.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, finishspinner.left);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, finishspinner.leftFacing);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, finishspinner.right);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, finishspinner.rightFacing);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x003b A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i5 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = true;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 == -1) {
                z = false;
            } else if (i6 != 0) {
                int i7 = RemoteActionCompatParcelizer;
                int i8 = i7 + 45;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    if (i6 == 1) {
                        f2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                    } else if (i6 != 2) {
                        i = i7 + 119;
                        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            if (i6 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            f4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        } else {
                            if (i6 != 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            f4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        }
                    } else {
                        f3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                    }
                } else if (i6 == 1) {
                    f2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                } else if (i6 != 2) {
                    i = i7 + 119;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        if (i6 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                            return null;
                        }
                        f4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i5 |= 8;
                    } else {
                        if (i6 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                            return null;
                        }
                        f4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i5 |= 8;
                    }
                } else {
                    f3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i5 |= 4;
                }
            } else {
                f = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i5 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new finishSpinner(f, f2, f3, f4, i5);
    }
}
