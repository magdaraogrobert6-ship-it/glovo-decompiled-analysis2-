package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidViewHolderrunInvalidate1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final AndroidViewHolderrunInvalidate1 write;

    static {
        AndroidViewHolderrunInvalidate1 androidViewHolderrunInvalidate1 = new AndroidViewHolderrunInvalidate1();
        write = androidViewHolderrunInvalidate1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("parking", androidViewHolderrunInvalidate1, 5);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        oncloseactionlambda1.read(RemoteMessageConst.Notification.PRIORITY, true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 125;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 31;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 115;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {AndroidViewHolderlayoutNode13.IconCompatParcelizer, getWasCloseMessageCalled.write, afterclosed, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterclosed};
        int i4 = IconCompatParcelizer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidViewHolderrunUpdate1 androidViewHolderrunUpdate1 = (AndroidViewHolderrunUpdate1) obj;
        androidViewHolderrunUpdate1.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidViewHolderlayoutNode13 androidViewHolderlayoutNode13 = AndroidViewHolderlayoutNode13.IconCompatParcelizer;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = androidViewHolderrunUpdate1.address;
        int i4 = androidViewHolderrunUpdate1.priority;
        String str = androidViewHolderrunUpdate1.style;
        int i5 = androidViewHolderrunUpdate1.order;
        boolean z = androidViewHolderrunUpdate1.highlighted;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, androidViewHolderlayoutNode13, androidViewHolderlayoutNode12);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || !(!z)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, z);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i5 != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.write(2, i5, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ""}, getCieXyz.write())).booleanValue()) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i4 != 0) {
                defaultInAppMessageSlideupViewFactorySerializer.write(4, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i6 = IconCompatParcelizer + 71;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.write(4, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.write(4, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0045 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = null;
        String strMediaMetadataCompat = null;
        int i4 = 0;
        boolean zWrite = false;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        boolean z = true;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = read + 23;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i7;
                int i8 = i6 % 2;
                if (i5 != 0) {
                    int i9 = i7 + 77;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        if (i5 == 0) {
                            zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i4 |= 2;
                        } else if (i5 != 2) {
                            iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i4 |= 4;
                        } else if (i5 != 3) {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i4 |= 8;
                            int i10 = IconCompatParcelizer + 43;
                            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                        } else {
                            if (i5 == 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                return null;
                            }
                            iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                            i4 |= 16;
                        }
                    } else if (i5 == 1) {
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                    } else if (i5 != 2) {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i4 |= 4;
                    } else if (i5 != 3) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i4 |= 8;
                        int i12 = IconCompatParcelizer + 43;
                        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    } else {
                        if (i5 == 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            return null;
                        }
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i4 |= 16;
                    }
                } else {
                    androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
                    i4 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidViewHolderrunUpdate1 androidViewHolderrunUpdate1 = new AndroidViewHolderrunUpdate1(i4, androidViewHolderlayoutNode12, zWrite, iIconCompatParcelizer, strMediaMetadataCompat, iIconCompatParcelizer2);
        int i14 = read + 29;
        IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return androidViewHolderrunUpdate1;
    }
}
