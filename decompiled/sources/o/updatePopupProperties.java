package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class updatePopupProperties implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final updatePopupProperties RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        updatePopupProperties updatepopupproperties = new updatePopupProperties();
        RemoteActionCompatParcelizer = updatepopupproperties;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.pudo.Instruction.SplitOrder.ButtonData", updatepopupproperties, 2);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 77;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 79;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 117;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) getCanCalculatePosition.$childSerializers[1].MediaSessionCompatResultReceiverWrapper())};
        int i4 = read + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getCanCalculatePosition getcancalculateposition = (getCanCalculatePosition) obj;
        getcancalculateposition.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getCanCalculatePosition.$childSerializers;
        String str = getcancalculateposition.title;
        List list = getcancalculateposition.trackingEvents;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (list != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = read + 41;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getCanCalculatePosition.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        String strMediaMetadataCompat = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = read + 113;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = IconCompatParcelizer + 125;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i7;
                if (i6 % 2 == 0) {
                    int i8 = 67 / 0;
                    if (i5 == 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i2 |= 1;
                    } else {
                        if (i5 == 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            return null;
                        }
                        int i9 = i7 + 47;
                        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                        i2 |= 2;
                        int i11 = IconCompatParcelizer + 35;
                        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    }
                } else if (i5 == 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                } else {
                    if (i5 == 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    int i13 = i7 + 47;
                    IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                    i2 |= 2;
                    int i15 = IconCompatParcelizer + 35;
                    read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getCanCalculatePosition(list, i2, strMediaMetadataCompat);
    }
}
