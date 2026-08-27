package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onLastDeeplinkRead implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final onLastDeeplinkRead RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        onLastDeeplinkRead onlastdeeplinkread = new onLastDeeplinkRead();
        RemoteActionCompatParcelizer = onlastdeeplinkread;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.provider.database.entity.SubzoneEntity", onlastdeeplinkread, 6);
        oncloseactionlambda1.read("subzone_id", false);
        oncloseactionlambda1.read("subzone_name", false);
        oncloseactionlambda1.read("zone_ids", false);
        oncloseactionlambda1.read("center_geo_json", false);
        oncloseactionlambda1.read("h3_indexes", false);
        oncloseactionlambda1.read("payment", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 17;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = onIsEnabledRead.$childSerializers;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {afterClosed.IconCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), onAttributionRead.IconCompatParcelizer, onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(launchReceivedDeeplink.read)};
        int i4 = write + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onIsEnabledRead onisenabledread = (onIsEnabledRead) obj;
        onisenabledread.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = onIsEnabledRead.$childSerializers;
        int i4 = onisenabledread.id;
        OnEventTrackingFailedListener onEventTrackingFailedListener = onisenabledread.payment;
        defaultInAppMessageSlideupViewFactorySerializer.write(0, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onisenabledread.name);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), onisenabledread.zoneIds);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onAttributionRead.IconCompatParcelizer, onisenabledread.centerGeoJson);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), onisenabledread.h3Indexes);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (onEventTrackingFailedListener != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i5 = write + 49;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        int i7 = write + 73;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, launchReceivedDeeplink.read, onEventTrackingFailedListener);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i9 = write + 49;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = onIsEnabledRead.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i3 = 0;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        String strMediaMetadataCompat = null;
        List list = null;
        OnDeeplinkResolvedListener onDeeplinkResolvedListener = null;
        List list2 = null;
        OnEventTrackingFailedListener onEventTrackingFailedListener = null;
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i4) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i3 |= 1;
                    i = write + 121;
                    serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i3 |= 2;
                    continue;
                case 2:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                    i3 |= 4;
                    i = serializer + 87;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                case 3:
                    onDeeplinkResolvedListener = (OnDeeplinkResolvedListener) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onAttributionRead.IconCompatParcelizer, onDeeplinkResolvedListener);
                    i3 |= 8;
                    continue;
                case 4:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list2);
                    i3 |= 16;
                    continue;
                case 5:
                    onEventTrackingFailedListener = (OnEventTrackingFailedListener) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, launchReceivedDeeplink.read, onEventTrackingFailedListener);
                    i3 |= 32;
                    continue;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                    return null;
            }
            int i5 = i % 2;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new onIsEnabledRead(i3, iIconCompatParcelizer, strMediaMetadataCompat, list, onDeeplinkResolvedListener, list2, onEventTrackingFailedListener);
    }
}
