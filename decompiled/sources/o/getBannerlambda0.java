package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getBannerlambda0 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final getBannerlambda0 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        getBannerlambda0 getbannerlambda0 = new getBannerlambda0();
        RemoteActionCompatParcelizer = getbannerlambda0;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.startworking.data.startworking.oneclick.Option", getbannerlambda0, 4);
        oncloseactionlambda1.read("label", false);
        oncloseactionlambda1.read("value", false);
        oncloseactionlambda1.read("preferred", true);
        oncloseactionlambda1.read("bag", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 97;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = write + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 17;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {enableMockNetworkRequestsAndDropEventsMode.read, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(getWasCloseMessageCalled.write), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) enableSdk.$childSerializers[3].MediaSessionCompatResultReceiverWrapper())};
        int i4 = serializer + 105;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enableSdk enablesdk = (enableSdk) obj;
        enablesdk.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = enableSdk.$childSerializers;
        enableMockNetworkRequestsAndDropEventsMode enablemocknetworkrequestsanddropeventsmode = enableMockNetworkRequestsAndDropEventsMode.read;
        enableDelayedInitialization enabledelayedinitialization = enablesdk.label;
        List list = enablesdk.bag;
        Boolean bool = enablesdk.preferred;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, enablemocknetworkrequestsanddropeventsmode, enabledelayedinitialization);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, enablesdk.value);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || bool != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getWasCloseMessageCalled.write, bool);
            int i4 = serializer + 1;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = enableSdk.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        enableDelayedInitialization enabledelayedinitialization = null;
        String strMediaMetadataCompat = null;
        Boolean bool = null;
        List list = null;
        boolean z = true;
        int i2 = 0;
        while (!(!z)) {
            int i3 = write + 9;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = write;
                int i7 = i6 + 87;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i5 == 0) {
                    enabledelayedinitialization = (enableDelayedInitialization) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, enableMockNetworkRequestsAndDropEventsMode.read, enabledelayedinitialization);
                    i2 |= 1;
                    int i8 = write + 111;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else if (i5 != 1) {
                    int i10 = i6 + 33;
                    serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (i5 == 2) {
                        bool = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getWasCloseMessageCalled.write, bool);
                        i2 |= 4;
                    } else {
                        if (i5 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            return null;
                        }
                        list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                        i2 |= 8;
                        int i12 = serializer + 25;
                        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i12 % 2 != 0) {
                            int i13 = 5 % 2;
                        }
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        enableSdk enablesdk = new enableSdk(i2, enabledelayedinitialization, strMediaMetadataCompat, bool, list);
        int i14 = write + 11;
        serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return enablesdk;
    }
}
