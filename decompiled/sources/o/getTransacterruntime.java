package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getTransacterruntime implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final getTransacterruntime serializer;
    private static int write;

    static {
        getTransacterruntime gettransacterruntime = new getTransacterruntime();
        serializer = gettransacterruntime;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.login.data.forgotpassword.entity.GenerateMagicLinkRequest", gettransacterruntime, 5);
        oncloseactionlambda1.read("email", false);
        oncloseactionlambda1.read("grant_type", false);
        oncloseactionlambda1.read("screen", false);
        oncloseactionlambda1.read("country_code", false);
        oncloseactionlambda1.read("preferred_language", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 79;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[4];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[2] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[2] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[2] = beforeinappmessageviewclosed2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TransacterBase transacterBase = (TransacterBase) obj;
        transacterBase.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, transacterBase.email);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, transacterBase.grantType);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, transacterBase.screen);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, transacterBase.countryCode);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, transacterBase.preferredLanguage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 65;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0050 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = write + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        boolean z = true;
        int i6 = 0;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 != -1) {
                int i8 = write + 29;
                int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i9;
                int i10 = i8 % 2;
                if (i7 == 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                } else if (i7 != 1) {
                    int i11 = i9 + 63;
                    int i12 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i12;
                    if (i11 % 2 != 0) {
                        if (i7 != 5) {
                            int i13 = i12 + 69;
                            i = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            RemoteActionCompatParcelizer = i;
                            int i14 = i13 % 2;
                            if (i7 != 3) {
                                strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                i6 |= 8;
                                int i15 = write + 71;
                                RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                            } else {
                                if (i7 == 4) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                    return null;
                                }
                                i2 = i + 89;
                                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i2 % 2 != 0) {
                                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                                    i6 |= 4;
                                } else {
                                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                    i6 |= 16;
                                }
                            }
                        } else {
                            strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i6 |= 4;
                        }
                    } else if (i7 != 2) {
                        int i17 = i12 + 69;
                        i = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        RemoteActionCompatParcelizer = i;
                        int i18 = i17 % 2;
                        if (i7 != 3) {
                            strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i6 |= 8;
                            int i19 = write + 71;
                            RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i110 = i19 % 2;
                        } else {
                            if (i7 == 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                return null;
                            }
                            i2 = i + 89;
                            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                                i6 |= 4;
                            } else {
                                strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                i6 |= 16;
                            }
                        }
                    } else {
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i6 |= 4;
                    }
                } else {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i6 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new TransacterBase(i6, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, strMediaMetadataCompat5);
    }
}
