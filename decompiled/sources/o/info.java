package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class info implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final info RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        info infoVar = new info();
        RemoteActionCompatParcelizer = infoVar;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.provider.data.model.GeoJsonResponse", infoVar, 2);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("coordinates", false);
        descriptor = oncloseactionlambda1;
        int i = write + 15;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = serializer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = debug.$childSerializers;
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = new setGraphicModalMaxWidthDp[4];
            setgraphicmodalmaxwidthdpArr2[0] = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr2[1] = onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper();
            setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr2;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, debug.$childSerializers[1].MediaSessionCompatResultReceiverWrapper()};
        }
        int i3 = serializer + 51;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        debug debugVar = (debug) obj;
        debugVar.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = debug.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, debugVar.type);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), debugVar.coordinates);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        int i;
        List list;
        String strMediaMetadataCompat;
        boolean z;
        int i2 = 2 % 2;
        int i3 = read + 109;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = debug.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            list = null;
            strMediaMetadataCompat = null;
            z = true;
            i = 1;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = debug.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            i = 0;
            list = null;
            strMediaMetadataCompat = null;
            z = true;
        }
        while (z) {
            int i4 = serializer + 1;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 == -1) {
                int i7 = read + 53;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = false;
            } else if (i6 != 0) {
                int i9 = serializer + 55;
                int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i10;
                int i11 = i9 % 2;
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
                }
                int i12 = i10 + 73;
                serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                i |= 2;
            } else {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new debug(list, i, strMediaMetadataCompat);
    }
}
