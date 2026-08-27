package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PlaceholderVerticalAlignCompanion implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    public static final PlaceholderVerticalAlignCompanion serializer;
    private static int write;

    static {
        PlaceholderVerticalAlignCompanion placeholderVerticalAlignCompanion = new PlaceholderVerticalAlignCompanion();
        serializer = placeholderVerticalAlignCompanion;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.database.entity.Coordinate", placeholderVerticalAlignCompanion, 2);
        oncloseactionlambda1.read("lat", false);
        oncloseactionlambda1.read(com.adjust.sdk.Constants.LONG, false);
        descriptor = oncloseactionlambda1;
        int i = read + 45;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 45;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s};
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getTextBottomJ6kI3mc gettextbottomj6ki3mc = (getTextBottomJ6kI3mc) obj;
        gettextbottomj6ki3mc.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, gettextbottomj6ki3mc.lat);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, gettextbottomj6ki3mc.f10long);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0014 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = 0;
        double dRemoteActionCompatParcelizer = 0.0d;
        double dRemoteActionCompatParcelizer2 = 0.0d;
        boolean z = true;
        while (z) {
            int i5 = write + 41;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i6 = 79 / 0;
                if (i != -1) {
                    int i7 = write + 109;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (i != 0) {
                        dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i4 |= 1;
                        i2 = RemoteActionCompatParcelizer + 15;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i9 = 3 / 4;
                        }
                    } else {
                        if (i == 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                    }
                } else {
                    int i10 = write + 97;
                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    z = false;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i != -1) {
                    int i12 = write + 109;
                    RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    if (i != 0) {
                        dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i4 |= 1;
                        i2 = RemoteActionCompatParcelizer + 15;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i14 = 3 / 4;
                        }
                    } else {
                        if (i == 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                    }
                } else {
                    int i15 = write + 97;
                    RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z = false;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getTextBottomJ6kI3mc(dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, i4);
    }
}
