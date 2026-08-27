package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getW700 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final getW700 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        getW700 getw700 = new getW700();
        RemoteActionCompatParcelizer = getw700;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("component_tag", getw700, 3);
        oncloseactionlambda1.read("text", false);
        oncloseactionlambda1.read("icon", false);
        oncloseactionlambda1.read("style", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 13;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 15;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, shouldApplySecureFlag.RemoteActionCompatParcelizer, getExcludeFromSystemGesture.RemoteActionCompatParcelizer};
        int i4 = write + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getW600 getw600 = (getW600) obj;
        getw600.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getw600.text);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, shouldApplySecureFlag.RemoteActionCompatParcelizer, getw600.iconToken);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getExcludeFromSystemGesture.RemoteActionCompatParcelizer, getw600.style);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = write + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = write + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 4 / 4;
        }
        String strMediaMetadataCompat = null;
        TagIconTokenV1 tagIconTokenV1 = null;
        TagColorToken tagColorToken = null;
        int i6 = 0;
        boolean z = true;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 == -1) {
                z = false;
            } else if (i7 != 0) {
                int i8 = serializer + 29;
                int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i9;
                if (i8 % 2 != 0) {
                    if (i7 != 1) {
                        int i10 = i9 + 39;
                        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        if (i7 == 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                            return null;
                        }
                        tagColorToken = (TagColorToken) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getExcludeFromSystemGesture.RemoteActionCompatParcelizer, tagColorToken);
                        i6 |= 4;
                    } else {
                        tagIconTokenV1 = (TagIconTokenV1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV1);
                        i6 |= 2;
                        int i12 = write + 47;
                        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                } else if (i7 != 1) {
                    int i14 = i9 + 39;
                    serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (i7 == 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                        return null;
                    }
                    tagColorToken = (TagColorToken) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getExcludeFromSystemGesture.RemoteActionCompatParcelizer, tagColorToken);
                    i6 |= 4;
                } else {
                    tagIconTokenV1 = (TagIconTokenV1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV1);
                    i6 |= 2;
                    int i16 = write + 47;
                    serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                }
            } else {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i6 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getW600(i6, strMediaMetadataCompat, tagIconTokenV1, tagColorToken);
    }
}
