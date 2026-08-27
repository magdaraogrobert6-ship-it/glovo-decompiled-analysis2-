package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onActivityPostResumed implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final onActivityPostResumed read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        onActivityPostResumed onactivitypostresumed = new onActivityPostResumed();
        read = onactivitypostresumed;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.home.nest.api.data.LastStop.Confirmation.RemoveDetails", onactivitypostresumed, 4);
        oncloseactionlambda1.read("url", false);
        oncloseactionlambda1.read(RemoteMessageConst.DATA, false);
        oncloseactionlambda1.read("message_removed", false);
        oncloseactionlambda1.read("is_enabled", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 87;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 43;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = write + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = ProcessLifecycleOwner.$childSerializers;
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = new setGraphicModalMaxWidthDp[5];
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr2[1] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr2[0] = onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper();
            setgraphicmodalmaxwidthdpArr2[2] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr2[2] = getWasCloseMessageCalled.write;
            setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr2;
        } else {
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = ProcessLifecycleOwner.$childSerializers;
            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed2, onviewdetachedfromwindowlambda1Arr2[1].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed2, getWasCloseMessageCalled.write};
        }
        int i3 = RemoteActionCompatParcelizer + 105;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) obj;
        processLifecycleOwner.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = ProcessLifecycleOwner.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, processLifecycleOwner.url);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), processLifecycleOwner.data);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, processLifecycleOwner.messageRemoved);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, processLifecycleOwner.isEnabled);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 73;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = ProcessLifecycleOwner.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        Map map = null;
        String strMediaMetadataCompat2 = null;
        boolean z = true;
        int i2 = 0;
        boolean zWrite = false;
        while (z) {
            int i3 = write + 41;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                z = false;
            } else if (i4 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i2 |= 1;
            } else if (i4 != 1) {
                int i5 = write;
                int i6 = i5 + 67;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i4 != 2) {
                    int i8 = i5 + 101;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (i4 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                        return null;
                    }
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 |= 8;
                } else {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i2 |= 4;
                }
            } else {
                map = (Map) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), map);
                i2 |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new ProcessLifecycleOwner(i2, strMediaMetadataCompat, map, strMediaMetadataCompat2, zWrite);
    }
}
