package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getIncludeFontPadding implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final getIncludeFontPadding write;

    static {
        getIncludeFontPadding getincludefontpadding = new getIncludeFontPadding();
        write = getincludefontpadding;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.database.entity.StartingArea", getincludefontpadding, 1);
        oncloseactionlambda1.read("coordinates", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = serializer + 117;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = new setGraphicModalMaxWidthDp[0];
            setgraphicmodalmaxwidthdpArr2[0] = getTextTopJ6kI3mc.$childSerializers[0].MediaSessionCompatResultReceiverWrapper();
            setgraphicmodalmaxwidthdpArr = setgraphicmodalmaxwidthdpArr2;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{getTextTopJ6kI3mc.$childSerializers[0].MediaSessionCompatResultReceiverWrapper()};
        }
        int i3 = read + 41;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getTextTopJ6kI3mc gettexttopj6ki3mc = (getTextTopJ6kI3mc) obj;
        gettexttopj6ki3mc.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) getTextTopJ6kI3mc.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), gettexttopj6ki3mc.coordinates);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 77;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        int i = 2 % 2;
        int i2 = read + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = getTextTopJ6kI3mc.$childSerializers;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = getTextTopJ6kI3mc.$childSerializers;
        }
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        List list = null;
        while (true) {
            int i3 = 0;
            while (true) {
                if (!z) {
                    createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    return new getTextTopJ6kI3mc(i3, list);
                }
                int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i4 == -1) {
                    z = false;
                } else {
                    if (i4 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                        int i5 = read + 5;
                        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            return null;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i6 = serializer + 41;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        break;
                    }
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                    i3 = 1;
                }
            }
            list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
        }
    }
}
