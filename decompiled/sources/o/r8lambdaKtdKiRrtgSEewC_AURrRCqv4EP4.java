package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4 write;

    static {
        r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4 r8lambdaktdkirrtgseewc_aurrrcqv4ep4 = new r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4();
        write = r8lambdaktdkirrtgseewc_aurrrcqv4ep4;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.settings.data.model.PromotionComponent", r8lambdaktdkirrtgseewc_aurrrcqv4ep4, 5);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("label", false);
        oncloseactionlambda1.read("time_range", false);
        oncloseactionlambda1.read("value", false);
        oncloseactionlambda1.read("icon", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 125;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = serializer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[5];
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[4] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[2] = getWasCloseMessageCalled.write;
            setgraphicmodalmaxwidthdpArr[5] = beforeinappmessageviewclosed;
        } else {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed2, beforeinappmessageviewclosed2, beforeinappmessageviewclosed2, getWasCloseMessageCalled.write, beforeinappmessageviewclosed2};
        }
        int i3 = serializer + 31;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w = (r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w) obj;
        r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.type);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.label);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.timeRange);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.value);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.iconUrl);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0049 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i3 = read + 13;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        boolean z = true;
        int i5 = 0;
        boolean zWrite = false;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 == -1) {
                z = false;
            } else if (i6 != 0) {
                int i7 = read + 7;
                int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i8;
                int i9 = i7 % 2;
                if (i6 != 1) {
                    int i10 = i8 + 21;
                    int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i11;
                    if (i10 % 2 != 0) {
                        if (i6 == 4) {
                            strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i5 |= 4;
                        } else if (i6 != 3) {
                            zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        } else {
                            if (i6 == 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            i = i11 + 17;
                            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                i5 |= 46;
                            } else {
                                strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                i5 |= 16;
                            }
                        }
                    } else if (i6 == 2) {
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                    } else if (i6 != 3) {
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i5 |= 8;
                    } else {
                        if (i6 == 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                            return null;
                        }
                        i = i11 + 17;
                        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                            i5 |= 46;
                        } else {
                            strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                            i5 |= 16;
                        }
                    }
                } else {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                }
            } else {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i5 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w(i5, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, zWrite);
    }
}
