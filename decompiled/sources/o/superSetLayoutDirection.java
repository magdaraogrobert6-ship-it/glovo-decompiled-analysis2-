package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class superSetLayoutDirection implements getInAppMessageManager {
    public static final superSetLayoutDirection IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        superSetLayoutDirection supersetlayoutdirection = new superSetLayoutDirection();
        IconCompatParcelizer = supersetlayoutdirection;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.pudo.Instruction.SplitOrder.ActionSheet", supersetlayoutdirection, 5);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("call_button", false);
        oncloseactionlambda1.read("copy_button", false);
        oncloseactionlambda1.read("cancel_button", false);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = write + 25;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) setParentLayoutCoordinates.$childSerializers[4].MediaSessionCompatResultReceiverWrapper());
        updatePopupProperties updatepopupproperties = updatePopupProperties.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, updatepopupproperties, updatepopupproperties, updatepopupproperties, setgraphicmodalmaxwidthdp};
        int i4 = RemoteActionCompatParcelizer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setParentLayoutCoordinates setparentlayoutcoordinates = (setParentLayoutCoordinates) obj;
        setparentlayoutcoordinates.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setParentLayoutCoordinates.$childSerializers;
        String str = setparentlayoutcoordinates.title;
        List list = setparentlayoutcoordinates.trackingEvents;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        updatePopupProperties updatepopupproperties = updatePopupProperties.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, updatepopupproperties, setparentlayoutcoordinates.callButton);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, updatepopupproperties, setparentlayoutcoordinates.copyButton);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, updatepopupproperties, setparentlayoutcoordinates.cancelButtonData);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list);
            int i4 = RemoteActionCompatParcelizer + 103;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x003a A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setParentLayoutCoordinates.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        String strMediaMetadataCompat = null;
        getCanCalculatePosition getcancalculateposition = null;
        getCanCalculatePosition getcancalculateposition2 = null;
        getCanCalculatePosition getcancalculateposition3 = null;
        List list = null;
        while (i6 != 0) {
            int i7 = RemoteActionCompatParcelizer + 5;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i8 = 66 / 0;
                if (i == -1) {
                    int i9 = read + 41;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i4 = i4;
                    i6 = i4;
                } else if (i != 0) {
                    if (i != 1) {
                        i2 = read + 111;
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 == 0 ? i == 2 : i == 5) {
                            getcancalculateposition2 = (getCanCalculatePosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, updatePopupProperties.RemoteActionCompatParcelizer, getcancalculateposition2);
                            i5 |= 4;
                        } else if (i == 3) {
                            getcancalculateposition3 = (getCanCalculatePosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, updatePopupProperties.RemoteActionCompatParcelizer, getcancalculateposition3);
                            i5 |= 8;
                        } else {
                            if (i != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                return null;
                            }
                            list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list);
                            i5 |= 16;
                        }
                    } else {
                        getcancalculateposition = (getCanCalculatePosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, updatePopupProperties.RemoteActionCompatParcelizer, getcancalculateposition);
                        i5 |= 2;
                    }
                    i4 = 0;
                } else {
                    int i11 = i4;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i11);
                    i5 |= 1;
                    i4 = i11;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i == -1) {
                    int i12 = read + 41;
                    RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i4 = i4;
                    i6 = i4;
                } else if (i != 0) {
                    if (i != 1) {
                        i2 = read + 111;
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            getcancalculateposition2 = (getCanCalculatePosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, updatePopupProperties.RemoteActionCompatParcelizer, getcancalculateposition2);
                            i5 |= 4;
                        } else {
                            getcancalculateposition2 = (getCanCalculatePosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, updatePopupProperties.RemoteActionCompatParcelizer, getcancalculateposition2);
                            i5 |= 4;
                        }
                    } else {
                        getcancalculateposition = (getCanCalculatePosition) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, updatePopupProperties.RemoteActionCompatParcelizer, getcancalculateposition);
                        i5 |= 2;
                    }
                    i4 = 0;
                } else {
                    int i14 = i4;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i14);
                    i5 |= 1;
                    i4 = i14;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new setParentLayoutCoordinates(i5, strMediaMetadataCompat, getcancalculateposition, getcancalculateposition2, getcancalculateposition3, list);
    }
}
