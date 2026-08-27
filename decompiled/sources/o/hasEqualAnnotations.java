package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheStatus;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hasEqualAnnotations implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    public static final hasEqualAnnotations write;

    static {
        hasEqualAnnotations hasequalannotations = new hasEqualAnnotations();
        write = hasequalannotations;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadata", hasequalannotations, 6);
        oncloseactionlambda1.read("releaseId", false);
        oncloseactionlambda1.read("assetsCdnPrefix", false);
        oncloseactionlambda1.read("status", false);
        oncloseactionlambda1.read("routes", false);
        oncloseactionlambda1.read("routesWithSsg", true);
        oncloseactionlambda1.read("assets", false);
        descriptor = oncloseactionlambda1;
        int i = read + 71;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 67;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = hasLinkAnnotations.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper()};
        int i4 = serializer + 85;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0071  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hasLinkAnnotations haslinkannotations = (hasLinkAnnotations) obj;
        haslinkannotations.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = hasLinkAnnotations.$childSerializers;
        String str = haslinkannotations.releaseId;
        List list = haslinkannotations.routesWithSsg;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, haslinkannotations.assetsCdnPrefix);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), haslinkannotations.status);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), haslinkannotations.routes);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), haslinkannotations.assets);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = hasLinkAnnotations.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = 0;
        boolean z = true;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        ChatAssetCacheStatus chatAssetCacheStatus = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int i3 = IconCompatParcelizer + 37;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i5) {
                case -1:
                    int i6 = serializer + 85;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                    int i8 = serializer + 103;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 |= 2;
                    break;
                case 2:
                    chatAssetCacheStatus = (ChatAssetCacheStatus) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), chatAssetCacheStatus);
                    i2 |= 4;
                    break;
                case 3:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                    i2 |= 8;
                    break;
                case 4:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list2);
                    i2 |= 16;
                    break;
                case 5:
                    list3 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list3);
                    i2 |= 32;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new hasLinkAnnotations(i2, strMediaMetadataCompat, strMediaMetadataCompat2, chatAssetCacheStatus, list, list2, list3);
    }
}
