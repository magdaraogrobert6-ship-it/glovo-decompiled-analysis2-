package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class EmojiInputFilterInitCallbackImpl implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    public static final EmojiInputFilterInitCallbackImpl serializer;
    private static int write;

    static {
        EmojiInputFilterInitCallbackImpl emojiInputFilterInitCallbackImpl = new EmojiInputFilterInitCallbackImpl();
        serializer = emojiInputFilterInitCallbackImpl;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.data.bridge.SupportedBridgeMessage", emojiInputFilterInitCallbackImpl, 3);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("payload", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 113;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 1;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = read + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[1] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[5] = Utf8SafeUnpairedSurrogateException.IconCompatParcelizer;
        } else {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed2, beforeinappmessageviewclosed2, Utf8SafeUnpairedSurrogateException.IconCompatParcelizer};
        }
        int i3 = IconCompatParcelizer + 89;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        reportImageLoadingTimeTrace reportimageloadingtimetrace = (reportImageLoadingTimeTrace) obj;
        reportimageloadingtimetrace.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, reportimageloadingtimetrace.id);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, reportimageloadingtimetrace.type);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, Utf8SafeUnpairedSurrogateException.IconCompatParcelizer, reportimageloadingtimetrace.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        int i;
        String strMediaMetadataCompat;
        String strMediaMetadataCompat2;
        FlexBuffersFlexBufferException flexBuffersFlexBufferException;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            flexBuffersFlexBufferException = null;
            z = true;
            i = 1;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            i = 0;
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            flexBuffersFlexBufferException = null;
            z = true;
        }
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = read + 105;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i7;
                int i8 = i6 % 2;
                if (i5 != 0) {
                    int i9 = i7 + 67;
                    int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i10;
                    if (i9 % 2 != 0) {
                        if (i5 != 1) {
                            int i11 = i10 + 123;
                            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            if (i5 == 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                i2 = read + 85;
                                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i2 % 2 != 0) {
                                    return null;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            flexBuffersFlexBufferException = (FlexBuffersFlexBufferException) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, Utf8SafeUnpairedSurrogateException.IconCompatParcelizer, flexBuffersFlexBufferException);
                            i |= 4;
                        } else {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i |= 2;
                        }
                    } else if (i5 != 1) {
                        int i13 = i10 + 123;
                        IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        if (i5 == 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            i2 = read + 85;
                            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                return null;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        flexBuffersFlexBufferException = (FlexBuffersFlexBufferException) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, Utf8SafeUnpairedSurrogateException.IconCompatParcelizer, flexBuffersFlexBufferException);
                        i |= 4;
                    } else {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i |= 2;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new reportImageLoadingTimeTrace(i, strMediaMetadataCompat, strMediaMetadataCompat2, flexBuffersFlexBufferException);
    }
}
