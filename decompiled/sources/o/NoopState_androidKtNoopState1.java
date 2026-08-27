package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NoopState_androidKtNoopState1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final NoopState_androidKtNoopState1 serializer;
    private static int write = 1;

    static {
        NoopState_androidKtNoopState1 noopState_androidKtNoopState1 = new NoopState_androidKtNoopState1();
        serializer = noopState_androidKtNoopState1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem", noopState_androidKtNoopState1, 14);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("successText", false);
        oncloseactionlambda1.read("successPaidWithText", false);
        oncloseactionlambda1.read("paymentType", false);
        oncloseactionlambda1.read("progressText", false);
        oncloseactionlambda1.read("isActive", false);
        oncloseactionlambda1.read("cashItem", false);
        oncloseactionlambda1.read("cardItem", false);
        oncloseactionlambda1.read("status", false);
        oncloseactionlambda1.read("isRequired", false);
        oncloseactionlambda1.read("taskId", false);
        oncloseactionlambda1.read("isOptional", false);
        oncloseactionlambda1.read("isSuccess", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 33;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 61;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getEnterjXw82LU.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, getwasclosemessagecalled, LazyKt__LazyJVMKt.read(TargetState.read), CompositionCallStack.serializer, onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), getwasclosemessagecalled, beforeinappmessageviewclosed, getwasclosemessagecalled, getwasclosemessagecalled};
        int i4 = IconCompatParcelizer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0098  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
        getenterjxw82lu.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getEnterjXw82LU.$childSerializers;
        String str = getenterjxw82lu.title;
        boolean z = getenterjxw82lu.isSuccess;
        boolean z2 = false;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getenterjxw82lu.description);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getenterjxw82lu.successText);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getenterjxw82lu.successPaidWithText);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), getenterjxw82lu.paymentType);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, getenterjxw82lu.progressText);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getenterjxw82lu.isActive);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, TargetState.read, getenterjxw82lu.cashItem);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, CompositionCallStack.serializer, getenterjxw82lu.cardItem);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper();
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus = getenterjxw82lu.status;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, setgraphicmodalmaxwidthdp, cardCashPaymentTaskUiItem$PaymentStatus);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getenterjxw82lu.isRequired);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, getenterjxw82lu.taskId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, getenterjxw82lu.isOptional);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, z);
        } else {
            if (cardCashPaymentTaskUiItem$PaymentStatus == CardCashPaymentTaskUiItem$PaymentStatus.SUCCESS) {
                int i4 = write + 89;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z2 = true;
            }
            if (z != z2) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, z);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        CashPaymentTaskUiItem cashPaymentTaskUiItem;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getEnterjXw82LU.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = IconCompatParcelizer + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 3;
        }
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus = null;
        CallGroup callGroup = null;
        boolean z2 = true;
        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = null;
        int i6 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType = null;
        String strMediaMetadataCompat5 = null;
        boolean zWrite = false;
        boolean zWrite2 = false;
        String strMediaMetadataCompat6 = null;
        boolean zWrite3 = false;
        boolean zWrite4 = false;
        while (z2) {
            int i7 = write + 5;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i9) {
                case -1:
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    i = i6;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = false;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    CashPaymentTaskUiItem cashPaymentTaskUiItem3 = cashPaymentTaskUiItem2;
                    z = z2;
                    i = i6 | 1;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem3;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 = i6 | 2;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i2 = i6 | 4;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 3:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 = i6 | 8;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 4:
                    cardCashPaymentTaskUiItem$PaymentType = (CardCashPaymentTaskUiItem$PaymentType) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), cardCashPaymentTaskUiItem$PaymentType);
                    i2 = i6 | 16;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 5:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i2 = i6 | 32;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 6:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i2 = i6 | 64;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 7:
                    cashPaymentTaskUiItem2 = (CashPaymentTaskUiItem) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, TargetState.read, cashPaymentTaskUiItem2);
                    i2 = i6 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = IconCompatParcelizer + 113;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 8:
                    callGroup = (CallGroup) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, CompositionCallStack.serializer, callGroup);
                    i2 = i6 | androidx.compose.ui.graphics.Fields.RotationX;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 9:
                    cardCashPaymentTaskUiItem$PaymentStatus = (CardCashPaymentTaskUiItem$PaymentStatus) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), cardCashPaymentTaskUiItem$PaymentStatus);
                    i2 = i6 | androidx.compose.ui.graphics.Fields.RotationY;
                    i = i2;
                    cashPaymentTaskUiItem = cashPaymentTaskUiItem2;
                    z = z2;
                    z2 = z;
                    cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    break;
                case 10:
                    zWrite2 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    break;
                case 11:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11);
                    i6 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    break;
                case 12:
                    zWrite3 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12);
                    i6 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                    break;
                case 13:
                    zWrite4 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13);
                    i6 |= 8192;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getEnterjXw82LU(i6, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, cardCashPaymentTaskUiItem$PaymentType, strMediaMetadataCompat5, zWrite, cashPaymentTaskUiItem2, callGroup, cardCashPaymentTaskUiItem$PaymentStatus, zWrite2, strMediaMetadataCompat6, zWrite3, zWrite4);
    }
}
