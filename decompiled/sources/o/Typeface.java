package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Typeface implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final Typeface RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        Typeface typeface = new Typeface();
        RemoteActionCompatParcelizer = typeface;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.entities.softpos.SoftPosResponse", typeface, 3);
        oncloseactionlambda1.read("Status", false);
        oncloseactionlambda1.read("Transaction", true);
        oncloseactionlambda1.read("PaymentFailedResult", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 51;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = write + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(Typefacedefault.serializer);
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(setTypefaceui_text.read);
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[4];
            setgraphicmodalmaxwidthdpArr[1] = afterClosed.IconCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[0] = setgraphicmodalmaxwidthdp;
            setgraphicmodalmaxwidthdpArr[4] = setgraphicmodalmaxwidthdp2;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{afterClosed.IconCompatParcelizer, LazyKt__LazyJVMKt.read(Typefacedefault.serializer), LazyKt__LazyJVMKt.read(setTypefaceui_text.read)};
        }
        int i3 = write + 31;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidPreloadedFont androidPreloadedFont = (AndroidPreloadedFont) obj;
        androidPreloadedFont.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = androidPreloadedFont.status;
        FontFamily fontFamily = androidPreloadedFont.paymentFailedResult;
        accessgetPlatformFontLoaderp accessgetplatformfontloaderp = androidPreloadedFont.transaction;
        defaultInAppMessageSlideupViewFactorySerializer.write(0, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || accessgetplatformfontloaderp != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, Typefacedefault.serializer, accessgetplatformfontloaderp);
            int i5 = write + 11;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontFamily != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setTypefaceui_text.read, fontFamily);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x003d A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        accessgetPlatformFontLoaderp accessgetplatformfontloaderp = null;
        FontFamily fontFamily = null;
        int i6 = 0;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        while (z) {
            int i7 = write + 17;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i8 = 64 / 0;
                if (i == -1) {
                    z = false;
                } else if (i != 0) {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                    int i9 = read + 59;
                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } else if (i != 1) {
                    i2 = write + 103;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        if (i != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        fontFamily = (FontFamily) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setTypefaceui_text.read, fontFamily);
                        i6 |= 4;
                    } else {
                        if (i != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        fontFamily = (FontFamily) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setTypefaceui_text.read, fontFamily);
                        i6 |= 4;
                    }
                } else {
                    accessgetplatformfontloaderp = (accessgetPlatformFontLoaderp) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, Typefacedefault.serializer, accessgetplatformfontloaderp);
                    i6 |= 2;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i == -1) {
                    z = false;
                } else if (i != 0) {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                    int i11 = read + 59;
                    write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else if (i != 1) {
                    i2 = write + 103;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        if (i != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        fontFamily = (FontFamily) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setTypefaceui_text.read, fontFamily);
                        i6 |= 4;
                    } else {
                        if (i != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        fontFamily = (FontFamily) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setTypefaceui_text.read, fontFamily);
                        i6 |= 4;
                    }
                } else {
                    accessgetplatformfontloaderp = (accessgetPlatformFontLoaderp) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, Typefacedefault.serializer, accessgetplatformfontloaderp);
                    i6 |= 2;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidPreloadedFont(i6, iIconCompatParcelizer, accessgetplatformfontloaderp, fontFamily);
    }
}
