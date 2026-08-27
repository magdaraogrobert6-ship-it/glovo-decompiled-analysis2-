package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidViewHolderupdate1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    private static int serializer;
    public static final AndroidViewHolderupdate1 write;

    static {
        AndroidViewHolderupdate1 androidViewHolderupdate1 = new AndroidViewHolderupdate1();
        write = androidViewHolderupdate1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("entrance", androidViewHolderupdate1, 5);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        oncloseactionlambda1.read(RemoteMessageConst.Notification.PRIORITY, true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 33;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 55;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {AndroidViewHolderlayoutNode13.IconCompatParcelizer, getWasCloseMessageCalled.write, afterclosed, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterclosed};
        int i4 = IconCompatParcelizer + 91;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidViewHolder_androidKt androidViewHolder_androidKt = (AndroidViewHolder_androidKt) obj;
        androidViewHolder_androidKt.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidViewHolderlayoutNode13 androidViewHolderlayoutNode13 = AndroidViewHolderlayoutNode13.IconCompatParcelizer;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = androidViewHolder_androidKt.address;
        int i4 = androidViewHolder_androidKt.priority;
        String str = androidViewHolder_androidKt.style;
        int i5 = androidViewHolder_androidKt.order;
        boolean z = androidViewHolder_androidKt.highlighted;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, androidViewHolderlayoutNode13, androidViewHolderlayoutNode12);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, z);
            int i6 = IconCompatParcelizer + 7;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i5 != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.write(2, i5, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, ""}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i4 != 1) {
            defaultInAppMessageSlideupViewFactorySerializer.write(4, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        boolean z = true;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = null;
        String strMediaMetadataCompat = null;
        int i3 = 0;
        boolean zWrite = false;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        while (true) {
            if (!z) {
                createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                return new AndroidViewHolder_androidKt(i3, androidViewHolderlayoutNode12, zWrite, iIconCompatParcelizer, strMediaMetadataCompat, iIconCompatParcelizer2);
            }
            i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i != -1) {
                int i4 = IconCompatParcelizer + 95;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i5;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i != 0) {
                    int i6 = i5 + 51;
                    int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    IconCompatParcelizer = i7;
                    int i8 = i6 % 2;
                    if (i == 1) {
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i3 |= 2;
                    } else if (i != 2) {
                        int i9 = i7 + 5;
                        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        if (i != 3) {
                            int i11 = i7 + 97;
                            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i11 % 2 != 0) {
                                if (i != 2) {
                                    break;
                                }
                                iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                i3 |= 16;
                            } else {
                                if (i != 4) {
                                    break;
                                }
                                iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                                i3 |= 16;
                            }
                        } else {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i3 |= 8;
                        }
                    } else {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i3 |= 4;
                    }
                } else {
                    androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
                    i3 |= 1;
                    int i12 = IconCompatParcelizer + 119;
                    read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
            } else {
                z = false;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
        int i14 = IconCompatParcelizer + 91;
        read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
