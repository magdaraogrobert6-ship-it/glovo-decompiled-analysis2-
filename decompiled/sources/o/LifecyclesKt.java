package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LifecyclesKt implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final LifecyclesKt RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        LifecyclesKt lifecyclesKt = new LifecyclesKt();
        RemoteActionCompatParcelizer = lifecyclesKt;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.password_rules.entity.RuleList", lifecyclesKt, 5);
        oncloseactionlambda1.read("uppercase", false);
        oncloseactionlambda1.read("lowercase", false);
        oncloseactionlambda1.read("digit", false);
        oncloseactionlambda1.read("special", false);
        oncloseactionlambda1.read("min_char", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 85;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 77 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = serializer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[2];
            ContextsKt contextsKt = ContextsKt.serializer;
            setgraphicmodalmaxwidthdpArr[1] = contextsKt;
            setgraphicmodalmaxwidthdpArr[1] = contextsKt;
            setgraphicmodalmaxwidthdpArr[4] = contextsKt;
            setgraphicmodalmaxwidthdpArr[4] = contextsKt;
            setgraphicmodalmaxwidthdpArr[4] = contextsKt;
        } else {
            ContextsKt contextsKt2 = ContextsKt.serializer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{contextsKt2, contextsKt2, contextsKt2, contextsKt2, contextsKt2};
        }
        int i3 = write + 33;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        IntPair intPair = (IntPair) obj;
        intPair.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        ContextsKt contextsKt = ContextsKt.serializer;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, contextsKt, intPair.upperCaseRule);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, contextsKt, intPair.lowerCaseRule);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, contextsKt, intPair.digitRule);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, contextsKt, intPair.specialRule);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, contextsKt, intPair.minCharRule);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 117;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            i = 1;
            z = false;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            z = true;
            i = 0;
        }
        int i4 = write + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = i;
        colorToRgbaArray colortorgbaarray = null;
        colorToRgbaArray colortorgbaarray2 = null;
        colorToRgbaArray colortorgbaarray3 = null;
        colorToRgbaArray colortorgbaarray4 = null;
        colorToRgbaArray colortorgbaarray5 = null;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 == -1) {
                z = false;
            } else if (i7 == 0) {
                colortorgbaarray = (colorToRgbaArray) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, ContextsKt.serializer, colortorgbaarray);
                i6 |= 1;
            } else if (i7 == 1) {
                colortorgbaarray2 = (colorToRgbaArray) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, ContextsKt.serializer, colortorgbaarray2);
                i6 |= 2;
            } else if (i7 == 2) {
                colortorgbaarray3 = (colorToRgbaArray) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, ContextsKt.serializer, colortorgbaarray3);
                i6 |= 4;
            } else if (i7 != 3) {
                int i8 = write;
                int i9 = i8 + 31;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i7 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
                }
                int i11 = i8 + 103;
                serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                colortorgbaarray5 = (colorToRgbaArray) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, ContextsKt.serializer, colortorgbaarray5);
                i6 |= 16;
            } else {
                colortorgbaarray4 = (colorToRgbaArray) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, ContextsKt.serializer, colortorgbaarray4);
                i6 |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new IntPair(i6, colortorgbaarray, colortorgbaarray2, colortorgbaarray3, colortorgbaarray4, colortorgbaarray5);
    }
}
