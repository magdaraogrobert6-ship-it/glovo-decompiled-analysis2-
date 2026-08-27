package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidDialog_androidKtDialogdialog11111 implements getInAppMessageManager {
    public static final AndroidDialog_androidKtDialogdialog11111 IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        AndroidDialog_androidKtDialogdialog11111 androidDialog_androidKtDialogdialog11111 = new AndroidDialog_androidKtDialogdialog11111();
        IconCompatParcelizer = androidDialog_androidKtDialogdialog11111;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.StateV3.AcceptData.PaymentOption", androidDialog_androidKtDialogdialog11111, 2);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 79;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        int i3 = 16 / 0;
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidDialog_androidKtDialog21 androidDialog_androidKtDialog21 = (AndroidDialog_androidKtDialog21) obj;
        androidDialog_androidKtDialog21.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, androidDialog_androidKtDialog21.id);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, androidDialog_androidKtDialog21.title);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0054 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        boolean z = true;
        int i6 = 0;
        while (z) {
            int i7 = write + 77;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i8 = 95 / 0;
                if (i != -1) {
                    i2 = write;
                    i3 = i2 + 39;
                    read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i9 = 65 / 0;
                        if (i != 0) {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                            i6 |= 1;
                        } else {
                            if (i == 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                i4 = read + 119;
                                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    return null;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            int i10 = i2 + 73;
                            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i6 |= 2;
                        }
                    } else if (i != 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i6 |= 1;
                    } else {
                        if (i == 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            i4 = read + 119;
                            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                return null;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        int i12 = i2 + 73;
                        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                    }
                } else {
                    z = false;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i != -1) {
                    i2 = write;
                    i3 = i2 + 39;
                    read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i14 = 65 / 0;
                        if (i != 0) {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                            i6 |= 1;
                        } else {
                            if (i == 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                i4 = read + 119;
                                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    return null;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            int i15 = i2 + 73;
                            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i6 |= 2;
                        }
                    } else if (i != 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i6 |= 1;
                    } else {
                        if (i == 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            i4 = read + 119;
                            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                return null;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        int i17 = i2 + 73;
                        read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                    }
                } else {
                    z = false;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidDialog_androidKtDialog21(i6, strMediaMetadataCompat, strMediaMetadataCompat2);
    }
}
