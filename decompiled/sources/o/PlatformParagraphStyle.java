package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class PlatformParagraphStyle implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final PlatformParagraphStyle RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        PlatformParagraphStyle platformParagraphStyle = new PlatformParagraphStyle();
        RemoteActionCompatParcelizer = platformParagraphStyle;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.database.entity.Menu", platformParagraphStyle, 5);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("price", false);
        oncloseactionlambda1.read("quantity", false);
        oncloseactionlambda1.read("available", false);
        descriptor = oncloseactionlambda1;
        int i = write + 31;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 91;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{onDismissed.write, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onClickedlambda0.serializer, getWasCloseMessageCalled.write};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[5];
        setgraphicmodalmaxwidthdpArr[1] = onDismissed.write;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[1] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[5] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[4] = onClickedlambda0.serializer;
        setgraphicmodalmaxwidthdpArr[2] = getWasCloseMessageCalled.write;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAboveBaselineJ6kI3mc getabovebaselinej6ki3mc = (getAboveBaselineJ6kI3mc) obj;
        getabovebaselinej6ki3mc.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getabovebaselinej6ki3mc.id);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getabovebaselinej6ki3mc.name);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getabovebaselinej6ki3mc.price);
        defaultInAppMessageSlideupViewFactorySerializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getabovebaselinej6ki3mc.quantity);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getabovebaselinej6ki3mc.available);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        String strMediaMetadataCompat;
        String strMediaMetadataCompat2;
        float f;
        boolean zWrite;
        long jSerializer;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = read + 19;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            f = 2.0f;
            zWrite = false;
            jSerializer = 1;
            z = false;
            i = 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            f = 0.0f;
            zWrite = false;
            jSerializer = 0;
            i = 0;
            z = true;
        }
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                z = false;
            } else if (i4 == 0) {
                jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i |= 1;
            } else if (i4 == 1) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i |= 2;
            } else if (i4 != 2) {
                int i5 = read + 29;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    if (i4 == 3) {
                        f = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i |= 8;
                    } else {
                        if (i4 == 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                            return null;
                        }
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i |= 16;
                    }
                } else if (i4 == 3) {
                    f = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i |= 8;
                } else {
                    if (i4 == 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                        return null;
                    }
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i |= 16;
                }
            } else {
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getAboveBaselineJ6kI3mc(i, jSerializer, strMediaMetadataCompat, strMediaMetadataCompat2, f, zWrite);
    }
}
