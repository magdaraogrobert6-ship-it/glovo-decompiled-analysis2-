package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dismissBannerlambda0 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final dismissBannerlambda0 serializer;
    private static int write = 1;

    static {
        dismissBannerlambda0 dismissbannerlambda0 = new dismissBannerlambda0();
        serializer = dismissbannerlambda0;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.startworking.data.startworking.StartWorkingRequestLocation", dismissbannerlambda0, 5);
        oncloseactionlambda1.read("lat", false);
        oncloseactionlambda1.read(com.adjust.sdk.Constants.LONG, false);
        oncloseactionlambda1.read("accuracy", false);
        oncloseactionlambda1.read("heading", false);
        oncloseactionlambda1.read("speed", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 111;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = read + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[5];
            r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[0] = r8lambdax_kosero69poudwq9u1vzzayj1s;
            setgraphicmodalmaxwidthdpArr[1] = r8lambdax_kosero69poudwq9u1vzzayj1s;
            onClickedlambda0 onclickedlambda0 = onClickedlambda0.serializer;
            setgraphicmodalmaxwidthdpArr[2] = onclickedlambda0;
            setgraphicmodalmaxwidthdpArr[4] = onclickedlambda0;
            setgraphicmodalmaxwidthdpArr[5] = onclickedlambda0;
        } else {
            r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s2 = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
            onClickedlambda0 onclickedlambda1 = onClickedlambda0.serializer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{r8lambdax_kosero69poudwq9u1vzzayj1s2, r8lambdax_kosero69poudwq9u1vzzayj1s2, onclickedlambda1, onclickedlambda1, onclickedlambda1};
        }
        int i3 = write + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        disableDelayedInitialization disabledelayedinitialization = (disableDelayedInitialization) obj;
        disabledelayedinitialization.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, disabledelayedinitialization.lat);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, disabledelayedinitialization.f8long);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, disabledelayedinitialization.accuracy);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, disabledelayedinitialization.heading);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, disabledelayedinitialization.speed);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 23;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0045 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i5 = 0;
        double dRemoteActionCompatParcelizer = 0.0d;
        double dRemoteActionCompatParcelizer2 = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        while (z) {
            int i6 = write + 89;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % i3 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 != -1) {
                int i8 = write;
                int i9 = i8 + 19;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 30 / 0;
                    if (i7 == 0) {
                        i3 = 2;
                        dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i5 |= 1;
                    } else if (i7 != 1) {
                        int i11 = i8 + 27;
                        i = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        read = i;
                        int i12 = i11 % 2;
                        if (i7 != 2) {
                            i2 = i + 73;
                            int i13 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            write = i13;
                            if (i2 % 2 == 0 ? i7 == 3 : i7 == 3) {
                                f2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                i5 |= 8;
                            } else {
                                if (i7 != 4) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                    return null;
                                }
                                int i14 = i13 + 15;
                                read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                f3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                i5 |= 16;
                            }
                            i3 = 2;
                        } else {
                            i3 = 2;
                            f = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i5 |= 4;
                        }
                    } else {
                        i3 = 2;
                        dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                    }
                } else if (i7 == 0) {
                    i3 = 2;
                    dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                } else if (i7 != 1) {
                    int i16 = i8 + 27;
                    i = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i;
                    int i17 = i16 % 2;
                    if (i7 != 2) {
                        i2 = i + 73;
                        int i18 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        write = i18;
                        if (i2 % 2 == 0) {
                            f2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        } else {
                            f2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        }
                        i3 = 2;
                    } else {
                        i3 = 2;
                        f = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                    }
                } else {
                    i3 = 2;
                    dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new disableDelayedInitialization(i5, dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, f, f2, f3);
    }
}
