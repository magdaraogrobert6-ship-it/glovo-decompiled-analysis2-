package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class EmojiCompatInitializer1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final EmojiCompatInitializer1 read;
    private static int serializer = 1;
    private static int write;

    static {
        EmojiCompatInitializer1 emojiCompatInitializer1 = new EmojiCompatInitializer1();
        read = emojiCompatInitializer1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.data.bridge.ReasonBridgeMessage", emojiCompatInitializer1, 3);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("payload", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 17;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = RemoteActionCompatParcelizer + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, setScrimColor.write};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[5];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[1] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[1] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[2] = setScrimColor.write;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EmojiCompatInitializer emojiCompatInitializer = (EmojiCompatInitializer) obj;
        emojiCompatInitializer.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, emojiCompatInitializer.id);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, emojiCompatInitializer.type);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setScrimColor.write, emojiCompatInitializer.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:36:0x004e A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        EmojiCompatInitCallback emojiCompatInitCallback = null;
        boolean z = true;
        while (z) {
            int i3 = RemoteActionCompatParcelizer + 21;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 != -1) {
                int i5 = RemoteActionCompatParcelizer + 39;
                int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i6;
                int i7 = i5 % 2;
                if (i4 != 0) {
                    int i8 = i6 + 121;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        if (i4 == 1) {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i2 |= 2;
                        } else {
                            if (i4 == 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                                return null;
                            }
                            emojiCompatInitCallback = (EmojiCompatInitCallback) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setScrimColor.write, emojiCompatInitCallback);
                            i2 |= 4;
                        }
                    } else if (i4 == 1) {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i2 |= 2;
                    } else {
                        if (i4 == 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                            return null;
                        }
                        emojiCompatInitCallback = (EmojiCompatInitCallback) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setScrimColor.write, emojiCompatInitCallback);
                        i2 |= 4;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                    int i9 = RemoteActionCompatParcelizer + 107;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        EmojiCompatInitializer emojiCompatInitializer = new EmojiCompatInitializer(i2, strMediaMetadataCompat, strMediaMetadataCompat2, emojiCompatInitCallback);
        int i11 = serializer + 63;
        RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return emojiCompatInitializer;
        }
        throw null;
    }
}
