package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FocusGroupPropertiesNode implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    private static int serializer;
    public static final FocusGroupPropertiesNode write;

    static {
        FocusGroupPropertiesNode focusGroupPropertiesNode = new FocusGroupPropertiesNode();
        write = focusGroupPropertiesNode;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("decline", focusGroupPropertiesNode, 3);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("confirmation", false);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 87;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onGlobalFocusChanged.read, getFocusTargetOfEmbeddedViewWrapper.$childSerializers[2].MediaSessionCompatResultReceiverWrapper()};
        int i4 = IconCompatParcelizer + 39;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0077  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i;
        int i2 = 2 % 2;
        getFocusTargetOfEmbeddedViewWrapper getfocustargetofembeddedviewwrapper = (getFocusTargetOfEmbeddedViewWrapper) obj;
        getfocustargetofembeddedviewwrapper.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getFocusTargetOfEmbeddedViewWrapper.$childSerializers;
        String str = getfocustargetofembeddedviewwrapper.title;
        List list = getfocustargetofembeddedviewwrapper.events;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onGlobalFocusChanged.read, getfocustargetofembeddedviewwrapper.confirmation);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0.write}, getCieXyz.write())).booleanValue()) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            i = read + 25;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i3 = 18 / 0;
            }
        }
        int i4 = IconCompatParcelizer + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        i = read + 25;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i6 = 18 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        String strMediaMetadataCompat;
        setAttachedViewTreeObserver setattachedviewtreeobserver;
        List list;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 93;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = getFocusTargetOfEmbeddedViewWrapper.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            setattachedviewtreeobserver = null;
            list = null;
            z = false;
            i = 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = getFocusTargetOfEmbeddedViewWrapper.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            setattachedviewtreeobserver = null;
            list = null;
            z = true;
            i = 0;
        }
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                z = false;
            } else if (i4 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i |= 1;
            } else if (i4 != 1) {
                int i5 = read + 87;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i4 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                    return null;
                }
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                i |= 4;
            } else {
                setattachedviewtreeobserver = (setAttachedViewTreeObserver) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onGlobalFocusChanged.read, setattachedviewtreeobserver);
                i |= 2;
                int i7 = read + 49;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getFocusTargetOfEmbeddedViewWrapper(i, strMediaMetadataCompat, setattachedviewtreeobserver, list);
    }
}
