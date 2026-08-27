package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class substringFDrldGo implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    public static final substringFDrldGo write;

    static {
        substringFDrldGo substringfdrldgo = new substringFDrldGo();
        write = substringfdrldgo;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.accept.data.models.AutoAcceptEarningsResponse.RootComponent", substringfdrldgo, 2);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("components", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 117;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 15;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = read + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = copyHL5avdYdefault.$childSerializers;
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = new setGraphicModalMaxWidthDp[2];
            setgraphicmodalmaxwidthdpArr2[1] = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr2[1] = onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper();
            setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr2;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, copyHL5avdYdefault.$childSerializers[1].MediaSessionCompatResultReceiverWrapper()};
        }
        int i3 = read + 103;
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
        int i2 = IconCompatParcelizer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copyHL5avdYdefault copyhl5avdydefault = (copyHL5avdYdefault) obj;
        copyhl5avdydefault.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = copyHL5avdYdefault.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, copyhl5avdydefault.type);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), copyhl5avdydefault.components);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 27;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = copyHL5avdYdefault.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        String strMediaMetadataCompat = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 != -1) {
                int i4 = read;
                int i5 = i4 + 17;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (i3 == 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                } else {
                    if (i3 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                        return null;
                    }
                    int i6 = i4 + 67;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                        i2 = 3;
                    } else {
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                        i2 |= 2;
                    }
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new copyHL5avdYdefault(list, i2, strMediaMetadataCompat);
    }
}
