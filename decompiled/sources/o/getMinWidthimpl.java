package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$PaymentType;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getMinWidthimpl implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final getMinWidthimpl serializer;
    private static int write;

    static {
        getMinWidthimpl getminwidthimpl = new getMinWidthimpl();
        serializer = getminwidthimpl;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem", getminwidthimpl, 10);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("paymentType", false);
        oncloseactionlambda1.read("amount", false);
        oncloseactionlambda1.read("currency", false);
        oncloseactionlambda1.read("formattedAmount", false);
        oncloseactionlambda1.read("cashUiItem", true);
        oncloseactionlambda1.read("cardUiItem", true);
        oncloseactionlambda1.read("taskId", false);
        oncloseactionlambda1.read("isOptional", false);
        oncloseactionlambda1.read("isDone", true);
        descriptor = oncloseactionlambda1;
        int i = write + 125;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
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
        int i3 = i2 + 107;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getMaxHeightimpl.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(ConstraintsCompanion.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(getValueannotations.write), beforeinappmessageviewclosed, getwasclosemessagecalled, getwasclosemessagecalled};
        int i4 = read + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        getMaxHeightimpl getmaxheightimpl = (getMaxHeightimpl) obj;
        getmaxheightimpl.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getMaxHeightimpl.$childSerializers;
        String str = getmaxheightimpl.title;
        boolean z = getmaxheightimpl.isDone;
        isZeroannotations iszeroannotations = getmaxheightimpl.cardUiItem;
        restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault = getmaxheightimpl.cashUiItem;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), getmaxheightimpl.paymentType);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getmaxheightimpl.amount);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getmaxheightimpl.currency);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getmaxheightimpl.formattedAmount);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || restrictconstraintsxf2oj5qdefault != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, ConstraintsCompanion.RemoteActionCompatParcelizer, restrictconstraintsxf2oj5qdefault);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || iszeroannotations != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getValueannotations.write, iszeroannotations);
            int i2 = read + 81;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getmaxheightimpl.taskId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getmaxheightimpl.isOptional);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || !z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, z);
            int i4 = read + 57;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getMaxHeightimpl.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i6 = 1;
        boolean z = true;
        double dRemoteActionCompatParcelizer = 0.0d;
        restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault = null;
        isZeroannotations iszeroannotations = null;
        int i7 = 0;
        String strMediaMetadataCompat = null;
        TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        boolean zWrite = false;
        boolean zWrite2 = false;
        while (!(!z)) {
            int i8 = RemoteActionCompatParcelizer + 37;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i10) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i7 |= 1;
                    break;
                case 1:
                    tapToPayTaskUiItem$PaymentType = (TapToPayTaskUiItem$PaymentType) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[i6].MediaSessionCompatResultReceiverWrapper(), tapToPayTaskUiItem$PaymentType);
                    i = i7 | 2;
                    i7 = i;
                    break;
                case 2:
                    dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i7 |= 4;
                    i6 = 1;
                    break;
                case 3:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 = i7 | 8;
                    i7 = i2;
                    i6 = 1;
                    break;
                case 4:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i2 = i7 | 16;
                    int i11 = RemoteActionCompatParcelizer + 123;
                    read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i7 = i2;
                    i6 = 1;
                    break;
                case 5:
                    restrictconstraintsxf2oj5qdefault = (restrictConstraintsxF2OJ5Qdefault) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, ConstraintsCompanion.RemoteActionCompatParcelizer, restrictconstraintsxf2oj5qdefault);
                    i2 = i7 | 32;
                    i7 = i2;
                    i6 = 1;
                    break;
                case 6:
                    iszeroannotations = (isZeroannotations) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getValueannotations.write, iszeroannotations);
                    i2 = i7 | 64;
                    int i13 = RemoteActionCompatParcelizer + 89;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        int i14 = 3 % 5;
                    }
                    i7 = i2;
                    i6 = 1;
                    break;
                case 7:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i = i7 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i7 = i;
                    break;
                case 8:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i = i7 | androidx.compose.ui.graphics.Fields.RotationX;
                    i7 = i;
                    break;
                case 9:
                    zWrite2 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9);
                    i = i7 | androidx.compose.ui.graphics.Fields.RotationY;
                    int i15 = read + 119;
                    RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i7 = i;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i10);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getMaxHeightimpl(i7, strMediaMetadataCompat, tapToPayTaskUiItem$PaymentType, dRemoteActionCompatParcelizer, strMediaMetadataCompat2, strMediaMetadataCompat3, restrictconstraintsxf2oj5qdefault, iszeroannotations, strMediaMetadataCompat4, zWrite, zWrite2);
    }
}
