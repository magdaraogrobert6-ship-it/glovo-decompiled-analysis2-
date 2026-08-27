package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getW700annotations implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final getW700annotations read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        getW700annotations getw700annotations = new getW700annotations();
        read = getw700annotations;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("instructions", getw700annotations, 2);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("components", false);
        descriptor = oncloseactionlambda1;
        int i = write + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 69;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 25;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = serializer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getW600annotations.$childSerializers;
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = new setGraphicModalMaxWidthDp[3];
            setgraphicmodalmaxwidthdpArr2[0] = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr2[1] = onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper();
            setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr2;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getW600annotations.$childSerializers[1].MediaSessionCompatResultReceiverWrapper()};
        }
        int i3 = serializer + 15;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getW600annotations getw600annotations = (getW600annotations) obj;
        getw600annotations.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getW600annotations.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getw600annotations.title);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), getw600annotations.items);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 87;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getW600annotations.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        int i4 = 0;
        List list = null;
        String strMediaMetadataCompat = null;
        boolean z = true;
        while (z) {
            int i5 = IconCompatParcelizer + 87;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                obj.hashCode();
                throw null;
            }
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 == -1) {
                int i7 = IconCompatParcelizer + 69;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = false;
            } else if (i6 != 0) {
                int i9 = serializer + 121;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    if (i6 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                        return null;
                    }
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= 2;
                } else {
                    if (i6 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                        return null;
                    }
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= 2;
                }
            } else {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i4 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getW600annotations(list, i4, strMediaMetadataCompat);
    }
}
