package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BringIntoViewElement implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final BringIntoViewElement RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        BringIntoViewElement bringIntoViewElement = new BringIntoViewElement();
        RemoteActionCompatParcelizer = bringIntoViewElement;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("accept_with_countdown", bringIntoViewElement, 5);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("style", true);
        oncloseactionlambda1.read("accept_details", false);
        oncloseactionlambda1.read("tracking_events", true);
        oncloseactionlambda1.read("countdown_details", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 115;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 85;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidView_androidKtupdateViewHolderParams5.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(BringIntoViewNode.IconCompatParcelizer)};
        int i4 = IconCompatParcelizer + 87;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidView_androidKtupdateViewHolderParams5 androidView_androidKtupdateViewHolderParams5 = (AndroidView_androidKtupdateViewHolderParams5) obj;
        androidView_androidKtupdateViewHolderParams5.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidView_androidKtupdateViewHolderParams5.$childSerializers;
        String str = androidView_androidKtupdateViewHolderParams5.title;
        getOnRequesterReady getonrequesterready = androidView_androidKtupdateViewHolderParams5.countDownDetails;
        List list = androidView_androidKtupdateViewHolderParams5.events;
        String str2 = androidView_androidKtupdateViewHolderParams5.style;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), androidView_androidKtupdateViewHolderParams5.acceptDetails);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getonrequesterready != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, BringIntoViewNode.IconCompatParcelizer, getonrequesterready);
            int i4 = IconCompatParcelizer + 57;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x003b A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidView_androidKtupdateViewHolderParams5.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i6 = 0;
        int i7 = 1;
        String strMediaMetadataCompat = null;
        String str = null;
        List list = null;
        List list2 = null;
        getOnRequesterReady getonrequesterready = null;
        int i8 = 0;
        int i9 = 1;
        while (i9 != 0) {
            int i10 = read + 97;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i11 = 1 / 0;
                if (i == -1) {
                    i9 = i6;
                } else if (i != 0) {
                    i2 = IconCompatParcelizer + 79;
                    i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i3;
                    if (i2 % 2 != 0) {
                        if (i != i7) {
                            i4 = i3 + 115;
                            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0 ? i == 2 : i == 2) {
                                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                                i8 |= 4;
                            } else if (i != 3) {
                                int i12 = i3 + 23;
                                IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                if (i != 4) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                    return null;
                                }
                                getonrequesterready = (getOnRequesterReady) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, BringIntoViewNode.IconCompatParcelizer, getonrequesterready);
                                i8 |= 16;
                            } else {
                                list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
                                i8 |= 8;
                            }
                            i6 = 0;
                            i7 = 1;
                        } else {
                            i7 = 1;
                            str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                            i8 |= 2;
                            i6 = 0;
                        }
                    } else if (i != i7) {
                        i4 = i3 + 115;
                        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                            i8 |= 4;
                        } else {
                            list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                            i8 |= 4;
                        }
                        i6 = 0;
                        i7 = 1;
                    } else {
                        i7 = 1;
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i8 |= 2;
                        i6 = 0;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i6);
                    i8 |= 1;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i == -1) {
                    i9 = i6;
                } else if (i != 0) {
                    i2 = IconCompatParcelizer + 79;
                    i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i3;
                    if (i2 % 2 != 0) {
                        if (i != i7) {
                            i4 = i3 + 115;
                            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                                i8 |= 4;
                            } else {
                                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                                i8 |= 4;
                            }
                            i6 = 0;
                            i7 = 1;
                        } else {
                            i7 = 1;
                            str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                            i8 |= 2;
                            i6 = 0;
                        }
                    } else if (i != i7) {
                        i4 = i3 + 115;
                        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                            i8 |= 4;
                        } else {
                            list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                            i8 |= 4;
                        }
                        i6 = 0;
                        i7 = 1;
                    } else {
                        i7 = 1;
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i8 |= 2;
                        i6 = 0;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i6);
                    i8 |= 1;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidView_androidKtupdateViewHolderParams5(i8, strMediaMetadataCompat, str, list, list2, getonrequesterready);
    }
}
