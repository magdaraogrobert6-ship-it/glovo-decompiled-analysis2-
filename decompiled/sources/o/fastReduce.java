package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TypographyToken;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fastReduce implements getInAppMessageManager {
    public static final fastReduce IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        fastReduce fastreduce = new fastReduce();
        IconCompatParcelizer = fastreduce;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("component_text", fastreduce, 2);
        oncloseactionlambda1.read("style", false);
        oncloseactionlambda1.read("text", false);
        descriptor = oncloseactionlambda1;
        int i = write + 101;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{SecureFlagPolicy_androidKt.RemoteActionCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
        setgraphicmodalmaxwidthdpArr[1] = SecureFlagPolicy_androidKt.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[0] = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fastMaxOfOrDefault fastmaxofordefault = (fastMaxOfOrDefault) obj;
        fastmaxofordefault.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, SecureFlagPolicy_androidKt.RemoteActionCompatParcelizer, fastmaxofordefault.style);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, fastmaxofordefault.text);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        TypographyToken typographyToken = null;
        String strMediaMetadataCompat = null;
        int i4 = 0;
        boolean z = true;
        while (z) {
            int i5 = serializer + 1;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 == -1) {
                z = false;
            } else if (i7 != 0) {
                int i8 = serializer + 97;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                        return null;
                    }
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                } else {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                        return null;
                    }
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                }
            } else {
                typographyToken = (TypographyToken) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, SecureFlagPolicy_androidKt.RemoteActionCompatParcelizer, typographyToken);
                i4 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new fastMaxOfOrDefault(i4, typographyToken, strMediaMetadataCompat);
    }
}
