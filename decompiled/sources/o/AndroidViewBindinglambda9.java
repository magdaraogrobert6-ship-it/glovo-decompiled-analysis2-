package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidViewBindinglambda9 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final AndroidViewBindinglambda9 read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        AndroidViewBindinglambda9 androidViewBindinglambda9 = new AndroidViewBindinglambda9();
        read = androidViewBindinglambda9;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("destination_info", androidViewBindinglambda9, 4);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, true);
        oncloseactionlambda1.read("destination_name", false);
        oncloseactionlambda1.read("location", true);
        oncloseactionlambda1.read("components", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 13;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 21;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 27 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i2 + 81;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidViewBindinglambda00.$childSerializers;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(AndroidViewHolderlayoutNode13.IconCompatParcelizer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper());
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2};
        int i4 = IconCompatParcelizer + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0041  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        AndroidViewBindinglambda00 androidViewBindinglambda00 = (AndroidViewBindinglambda00) obj;
        androidViewBindinglambda00.getClass();
        String str = androidViewBindinglambda00.title;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidViewBindinglambda00.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
            int i2 = IconCompatParcelizer + 31;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, ""}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
                int i4 = IconCompatParcelizer + 31;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        }
        String str2 = androidViewBindinglambda00.destinationName;
        List list = androidViewBindinglambda00.components;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = androidViewBindinglambda00.location;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || androidViewHolderlayoutNode12 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
            int i6 = IconCompatParcelizer + 69;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0044 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidViewBindinglambda00.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = null;
        List list = null;
        int i6 = 0;
        int i7 = 1;
        while (i7 != 0) {
            int i8 = IconCompatParcelizer + 25;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i9 = 84 / i5;
                if (i != -1) {
                    i2 = IconCompatParcelizer;
                    i3 = i2 + 35;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i != 0) {
                        if (i != 1) {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i6 |= 2;
                        } else if (i != 2) {
                            androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
                            i6 |= 4;
                            int i10 = write + 47;
                            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                        } else {
                            if (i == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                return null;
                            }
                            int i12 = i2 + 23;
                            write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                            i6 |= 8;
                        }
                        i5 = 0;
                    } else {
                        i5 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i6 |= 1;
                    }
                } else {
                    i7 = i5;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i != -1) {
                    i2 = IconCompatParcelizer;
                    i3 = i2 + 35;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i != 0) {
                        if (i != 1) {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i6 |= 2;
                        } else if (i != 2) {
                            androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
                            i6 |= 4;
                            int i14 = write + 47;
                            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                        } else {
                            if (i == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                return null;
                            }
                            int i16 = i2 + 23;
                            write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                            i6 |= 8;
                        }
                        i5 = 0;
                    } else {
                        i5 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i6 |= 1;
                    }
                } else {
                    i7 = i5;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidViewBindinglambda00(i6, strMediaMetadataCompat, strMediaMetadataCompat2, androidViewHolderlayoutNode12, list);
    }
}
