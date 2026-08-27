package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getFocusedChild implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final getFocusedChild read;
    private static int serializer;
    private static int write;

    static {
        getFocusedChild getfocusedchild = new getFocusedChild();
        read = getfocusedchild;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("decline_v2", getfocusedchild, 3);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("confirmation", false);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 71;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, FocusGroupPropertiesNodeonEnter1.write, FocusGroupPropertiesElement.$childSerializers[2].MediaSessionCompatResultReceiverWrapper()};
        int i4 = RemoteActionCompatParcelizer + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FocusGroupPropertiesElement focusGroupPropertiesElement = (FocusGroupPropertiesElement) obj;
        focusGroupPropertiesElement.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = FocusGroupPropertiesElement.$childSerializers;
        String str = focusGroupPropertiesElement.title;
        List list = focusGroupPropertiesElement.events;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, FocusGroupPropertiesNodeonEnter1.write, focusGroupPropertiesElement.confirmation);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0032 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        String strMediaMetadataCompat;
        setFocusedChild setfocusedchild;
        List list;
        boolean z;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = FocusGroupPropertiesElement.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            setfocusedchild = null;
            list = null;
            z = false;
            i = 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = FocusGroupPropertiesElement.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            setfocusedchild = null;
            list = null;
            z = true;
            i = 0;
        }
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = RemoteActionCompatParcelizer + 47;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 55 / 0;
                    if (i5 == 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i |= 1;
                    } else if (i5 != 1) {
                        setfocusedchild = (setFocusedChild) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, FocusGroupPropertiesNodeonEnter1.write, setfocusedchild);
                        i |= 2;
                    } else {
                        if (i5 == 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            return null;
                        }
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                        i |= 4;
                        i2 = RemoteActionCompatParcelizer + 105;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i8 = 4 % 2;
                        }
                    }
                } else if (i5 == 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i |= 1;
                } else if (i5 != 1) {
                    setfocusedchild = (setFocusedChild) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, FocusGroupPropertiesNodeonEnter1.write, setfocusedchild);
                    i |= 2;
                } else {
                    if (i5 == 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                    i |= 4;
                    i2 = RemoteActionCompatParcelizer + 105;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i9 = 4 % 2;
                    }
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new FocusGroupPropertiesElement(i, strMediaMetadataCompat, setfocusedchild, list);
    }
}
