package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TextAndroidCanvas implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final TextAndroidCanvas read;
    private static int serializer;
    private static int write;

    static {
        TextAndroidCanvas textAndroidCanvas = new TextAndroidCanvas();
        read = textAndroidCanvas;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("set_stop_button", textAndroidCanvas, 6);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("url", false);
        oncloseactionlambda1.read(RemoteMessageConst.DATA, false);
        oncloseactionlambda1.read("failure_message", false);
        oncloseactionlambda1.read("success_message", false);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 39;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 23;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 71;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = TextAlignmentAdapter.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper()};
        int i4 = write + 103;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0089  */
    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i;
        int i2 = 2 % 2;
        TextAlignmentAdapter textAlignmentAdapter = (TextAlignmentAdapter) obj;
        textAlignmentAdapter.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = TextAlignmentAdapter.$childSerializers;
        String str = textAlignmentAdapter.title;
        List list = textAlignmentAdapter.trackingEvents;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, textAlignmentAdapter.url);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), textAlignmentAdapter.data);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, textAlignmentAdapter.failureMessage);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, textAlignmentAdapter.successMessage);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            i = write + 81;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i3 = 72 / 0;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 107;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        i = write + 81;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i6 = 72 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = write + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = TextAlignmentAdapter.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = write + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        boolean z = true;
        int i6 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        Map map = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        List list = null;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i7) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i6 |= 2;
                    break;
                case 2:
                    map = (Map) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), map);
                    i6 |= 4;
                    break;
                case 3:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i6 |= 8;
                    break;
                case 4:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i6 |= 16;
                    break;
                case 5:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list);
                    i6 |= 32;
                    int i8 = RemoteActionCompatParcelizer + 57;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        int i9 = 3 % 5;
                    }
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    int i10 = RemoteActionCompatParcelizer + 99;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    Object obj = null;
                    if (i10 % 2 == 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new TextAlignmentAdapter(i6, strMediaMetadataCompat, strMediaMetadataCompat2, map, strMediaMetadataCompat3, strMediaMetadataCompat4, list);
    }
}
