package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$ReasonItem$$serializer;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$Reasons$$serializer;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TargetState implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final TargetState read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        TargetState targetState = new TargetState();
        read = targetState;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem", targetState, 25);
        oncloseactionlambda1.read("taskId", false);
        oncloseactionlambda1.read("isOptional", false);
        oncloseactionlambda1.read("currency", false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("actionTitle", false);
        oncloseactionlambda1.read("doneActionTitle", false);
        oncloseactionlambda1.read("cancelActionTitle", false);
        oncloseactionlambda1.read("note", false);
        oncloseactionlambda1.read("originalAmount", false);
        oncloseactionlambda1.read("reasons", false);
        oncloseactionlambda1.read("selectedAmount", false);
        oncloseactionlambda1.read("editedAmount", false);
        oncloseactionlambda1.read("selectedReason", false);
        oncloseactionlambda1.read("editedReason", false);
        oncloseactionlambda1.read("formattedOriginalAmount", false);
        oncloseactionlambda1.read("formattedSelectedAmount", false);
        oncloseactionlambda1.read("formattedEditedAmount", false);
        oncloseactionlambda1.read("validation", false);
        oncloseactionlambda1.read("uiMode", false);
        oncloseactionlambda1.read("requiredText", false);
        oncloseactionlambda1.read("editable", false);
        oncloseactionlambda1.read("editedReasonLabel", false);
        oncloseactionlambda1.read("transferChangeItem", false);
        oncloseactionlambda1.read("trackingEvent", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 21;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 25;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = CashPaymentTaskUiItem.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        CashPaymentTaskUiItem$ReasonItem$$serializer cashPaymentTaskUiItem$ReasonItem$$serializer = CashPaymentTaskUiItem$ReasonItem$$serializer.serializer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, getwasclosemessagecalled, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(r8lambdax_kosero69poudwq9u1vzzayj1s), LazyKt__LazyJVMKt.read(CashPaymentTaskUiItem$Reasons$$serializer.write), LazyKt__LazyJVMKt.read(r8lambdax_kosero69poudwq9u1vzzayj1s), LazyKt__LazyJVMKt.read(r8lambdax_kosero69poudwq9u1vzzayj1s), LazyKt__LazyJVMKt.read(cashPaymentTaskUiItem$ReasonItem$$serializer), LazyKt__LazyJVMKt.read(cashPaymentTaskUiItem$ReasonItem$$serializer), beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[19].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), getwasclosemessagecalled, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(convert.IconCompatParcelizer), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[24].MediaSessionCompatResultReceiverWrapper())};
        int i4 = IconCompatParcelizer + 73;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) obj;
        cashPaymentTaskUiItem.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = CashPaymentTaskUiItem.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, cashPaymentTaskUiItem.taskId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, cashPaymentTaskUiItem.isOptional);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, cashPaymentTaskUiItem.currency);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, cashPaymentTaskUiItem.description);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, cashPaymentTaskUiItem.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, cashPaymentTaskUiItem.actionTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, cashPaymentTaskUiItem.doneActionTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, cashPaymentTaskUiItem.cancelActionTitle);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeinappmessageviewclosed, cashPaymentTaskUiItem.note);
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, r8lambdax_kosero69poudwq9u1vzzayj1s, cashPaymentTaskUiItem.originalAmount);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, CashPaymentTaskUiItem$Reasons$$serializer.write, cashPaymentTaskUiItem.reasons);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, r8lambdax_kosero69poudwq9u1vzzayj1s, cashPaymentTaskUiItem.selectedAmount);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, r8lambdax_kosero69poudwq9u1vzzayj1s, cashPaymentTaskUiItem.editedAmount);
        CashPaymentTaskUiItem$ReasonItem$$serializer cashPaymentTaskUiItem$ReasonItem$$serializer = CashPaymentTaskUiItem$ReasonItem$$serializer.serializer;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, cashPaymentTaskUiItem$ReasonItem$$serializer, cashPaymentTaskUiItem.selectedReason);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, cashPaymentTaskUiItem$ReasonItem$$serializer, cashPaymentTaskUiItem.editedReason);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, cashPaymentTaskUiItem.formattedOriginalAmount);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16, cashPaymentTaskUiItem.formattedSelectedAmount);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 17, cashPaymentTaskUiItem.formattedEditedAmount);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 18, cashPaymentTaskUiItem.validation);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 19, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[19].MediaSessionCompatResultReceiverWrapper(), cashPaymentTaskUiItem.uiMode);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 20, beforeinappmessageviewclosed, cashPaymentTaskUiItem.requiredText);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 21, cashPaymentTaskUiItem.editable);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 22, cashPaymentTaskUiItem.editedReasonLabel);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 23, convert.IconCompatParcelizer, cashPaymentTaskUiItem.transferChangeItem);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 24, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[24].MediaSessionCompatResultReceiverWrapper(), cashPaymentTaskUiItem.trackingEvent);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 49;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        CashPaymentTaskUiItem.ReasonItem reasonItem;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = CashPaymentTaskUiItem.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        isInline isinline = null;
        Double d = null;
        CashPaymentTaskUiItem.Reasons reasons = null;
        Double d2 = null;
        boolean z = true;
        String str = null;
        int i6 = 0;
        String strMediaMetadataCompat = null;
        boolean zWrite = false;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        List list = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        String strMediaMetadataCompat7 = null;
        String str2 = null;
        String strMediaMetadataCompat8 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        String strMediaMetadataCompat9 = null;
        Double d3 = null;
        CashPaymentTaskUiItem.ReasonItem reasonItem2 = null;
        CashPaymentTaskUiItem.ReasonItem reasonItem3 = null;
        CashPaymentTaskUiItem.UiMode uiMode = null;
        String str5 = null;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            z = z;
            switch (i7) {
                case -1:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    reasonItem2 = reasonItem2;
                    z = false;
                    isinline = isinline;
                    reasonItem2 = reasonItem2;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 0:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    i6 |= 1;
                    isinline = isinline;
                    reasonItem2 = reasonItem2;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 1:
                    isinline = isinline;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    uiMode = uiMode;
                    str5 = str5;
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i6 |= 2;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 2:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i = i6 | 4;
                    i6 = i;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 3:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i = i6 | 8;
                    int i8 = write + 91;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i6 = i;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 4:
                    isinline = isinline;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    uiMode = uiMode;
                    str5 = str5;
                    i6 |= 16;
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 5:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    reasonItem2 = reasonItem2;
                    strMediaMetadataCompat7 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i6 |= 32;
                    isinline = isinline;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 6:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i2 = i6 | 64;
                    i6 = i2;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 7:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i2 = i6 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i6 = i2;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 8:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationX;
                    isinline = isinline;
                    reasonItem2 = reasonItem2;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 9:
                    d2 = (Double) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d2);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationY;
                    isinline = isinline;
                    reasonItem2 = reasonItem2;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 10:
                    reasonItem = reasonItem3;
                    reasons = (CashPaymentTaskUiItem.Reasons) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, CashPaymentTaskUiItem$Reasons$$serializer.write, reasons);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    int i10 = IconCompatParcelizer + 21;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    d3 = d3;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem;
                    reasonItem2 = reasonItem2;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 11:
                    d = (Double) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d);
                    i6 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    isinline = isinline;
                    reasonItem2 = reasonItem2;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 12:
                    reasonItem = reasonItem3;
                    d3 = (Double) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d3);
                    i6 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                    isinline = isinline;
                    reasonItem3 = reasonItem;
                    reasonItem2 = reasonItem2;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 13:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    reasonItem2 = (CashPaymentTaskUiItem.ReasonItem) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, CashPaymentTaskUiItem$ReasonItem$$serializer.serializer, reasonItem2);
                    i6 |= 8192;
                    isinline = isinline;
                    uiMode = uiMode;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 14:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    reasonItem3 = (CashPaymentTaskUiItem.ReasonItem) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, CashPaymentTaskUiItem$ReasonItem$$serializer.serializer, reasonItem3);
                    i6 |= androidx.compose.ui.graphics.Fields.Clip;
                    str5 = str5;
                    isinline = isinline;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 15:
                    isinline = isinline;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    String strMediaMetadataCompat10 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15);
                    i3 = androidx.compose.ui.graphics.Fields.CompositingStrategy;
                    str2 = strMediaMetadataCompat10;
                    str5 = str5;
                    uiMode = uiMode;
                    i6 |= i3;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 16:
                    isinline = isinline;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    i3 = 65536;
                    strMediaMetadataCompat8 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16);
                    str5 = str5;
                    uiMode = uiMode;
                    i6 |= i3;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 17:
                    isinline = isinline;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    String strMediaMetadataCompat11 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 17);
                    i3 = androidx.compose.ui.graphics.Fields.RenderEffect;
                    str3 = strMediaMetadataCompat11;
                    str5 = str5;
                    uiMode = uiMode;
                    i6 |= i3;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 18:
                    isinline = isinline;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    String strMediaMetadataCompat12 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 18);
                    i3 = androidx.compose.ui.graphics.Fields.ColorFilter;
                    str4 = strMediaMetadataCompat12;
                    str5 = str5;
                    uiMode = uiMode;
                    i6 |= i3;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 19:
                    uiMode = (CashPaymentTaskUiItem.UiMode) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 19, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[19].MediaSessionCompatResultReceiverWrapper(), uiMode);
                    i4 = androidx.compose.ui.graphics.Fields.BlendMode;
                    isinline = isinline;
                    i6 |= i4;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 20:
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 20, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i4 = 1048576;
                    isinline = isinline;
                    i6 |= i4;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 21:
                    boolean zWrite2 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 21);
                    int i12 = IconCompatParcelizer + 83;
                    write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i3 = 2097152;
                    z2 = zWrite2;
                    str5 = str5;
                    uiMode = uiMode;
                    i6 |= i3;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 22:
                    i3 = 4194304;
                    strMediaMetadataCompat9 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 22);
                    str5 = str5;
                    uiMode = uiMode;
                    i6 |= i3;
                    d3 = d3;
                    reasonItem2 = reasonItem2;
                    reasonItem3 = reasonItem3;
                    d3 = d3;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    str5 = str5;
                    isinline = isinline;
                    uiMode = uiMode;
                    reasonItem3 = reasonItem3;
                    reasonItem2 = reasonItem2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 23:
                    isinline = (isInline) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 23, convert.IconCompatParcelizer, isinline);
                    i4 = 8388608;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    i6 |= i4;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 24:
                    list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 24, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[24].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 = 16777216;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    i6 |= i4;
                    z = z;
                    strMediaMetadataCompat4 = strMediaMetadataCompat4;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
            }
        }
        isInline isinline2 = isinline;
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new CashPaymentTaskUiItem(i6, strMediaMetadataCompat, zWrite, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, strMediaMetadataCompat7, strMediaMetadataCompat5, strMediaMetadataCompat6, str, d2, reasons, d, d3, reasonItem2, reasonItem3, str2, strMediaMetadataCompat8, str3, str4, uiMode, str5, z2, strMediaMetadataCompat9, isinline2, list);
    }
}
