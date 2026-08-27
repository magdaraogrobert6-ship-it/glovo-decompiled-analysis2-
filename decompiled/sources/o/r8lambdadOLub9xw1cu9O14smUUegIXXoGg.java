package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdadOLub9xw1cu9O14smUUegIXXoGg implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final r8lambdadOLub9xw1cu9O14smUUegIXXoGg RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        r8lambdadOLub9xw1cu9O14smUUegIXXoGg r8lambdadolub9xw1cu9o14smuuegixxogg = new r8lambdadOLub9xw1cu9O14smUUegIXXoGg();
        RemoteActionCompatParcelizer = r8lambdadolub9xw1cu9o14smuuegixxogg;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.DeliveriesList.Delivery.DeliveryListComponent.ExpandableButtonV1.FullscreenItem", r8lambdadolub9xw1cu9o14smuuegixxogg, 2);
        oncloseactionlambda1.read("order_details", false);
        oncloseactionlambda1.read("tracking_events", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 107;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 125;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU.$childSerializers;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper()};
        } else {
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU.$childSerializers;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{onviewdetachedfromwindowlambda1Arr2[0].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr2[1].MediaSessionCompatResultReceiverWrapper()};
        }
        int i3 = serializer + 77;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU r8lambdac8d6osnexuwibcq6nvlssc9dhou = (r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU) obj;
        r8lambdac8d6osnexuwibcq6nvlssc9dhou.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), r8lambdac8d6osnexuwibcq6nvlssc9dhou.fullscreenDetails);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), r8lambdac8d6osnexuwibcq6nvlssc9dhou.trackingEvents);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        boolean z;
        int i = 2 % 2;
        int i2 = write + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            z = false;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            z = true;
        }
        int i3 = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                z = false;
            } else if (i4 == 0) {
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                i3 |= 1;
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                    return null;
                }
                int i5 = write + 35;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list2);
                    i3 = 3;
                } else {
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list2);
                    i3 |= 2;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU(list, list2, i3);
    }
}
