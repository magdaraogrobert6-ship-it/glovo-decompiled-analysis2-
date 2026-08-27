package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SlotTreeKtextractFromIndyLambdaFieldsinlinedsortedBy1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final SlotTreeKtextractFromIndyLambdaFieldsinlinedsortedBy1 read;
    private static int serializer;
    private static int write;

    static {
        SlotTreeKtextractFromIndyLambdaFieldsinlinedsortedBy1 slotTreeKtextractFromIndyLambdaFieldsinlinedsortedBy1 = new SlotTreeKtextractFromIndyLambdaFieldsinlinedsortedBy1();
        read = slotTreeKtextractFromIndyLambdaFieldsinlinedsortedBy1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem.CodeScanScreenUiItem", slotTreeKtextractFromIndyLambdaFieldsinlinedsortedBy1, 12);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("instructionMessage", false);
        oncloseactionlambda1.read("codes", false);
        oncloseactionlambda1.read("totalBags", false);
        oncloseactionlambda1.read("alreadyScannedMessage", false);
        oncloseactionlambda1.read("wrongShelfMessage", false);
        oncloseactionlambda1.read("moveCloserMessage", false);
        oncloseactionlambda1.read("successMessage", false);
        oncloseactionlambda1.read("scannedItemsDialog", false);
        oncloseactionlambda1.read("extraCodeCloseButton", false);
        oncloseactionlambda1.read("trackingEvents", false);
        oncloseactionlambda1.read("currentState", true);
        descriptor = oncloseactionlambda1;
        int i = write + 83;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        int i3 = 48 / 0;
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = SlotTreeKtExternalSyntheticLambda0.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        union unionVar = union.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, unionVar, unionVar, unionVar, unionVar, LazyKt__LazyJVMKt.read(nextSourceLocation.IconCompatParcelizer), getExitjXw82LU.read, onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper()};
        int i4 = serializer + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x00a4  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0 = (SlotTreeKtExternalSyntheticLambda0) obj;
        slotTreeKtExternalSyntheticLambda0.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = SlotTreeKtExternalSyntheticLambda0.$childSerializers;
        String str = slotTreeKtExternalSyntheticLambda0.title;
        invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = slotTreeKtExternalSyntheticLambda0.currentState;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, slotTreeKtExternalSyntheticLambda0.instructionMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), slotTreeKtExternalSyntheticLambda0.codes);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, slotTreeKtExternalSyntheticLambda0.totalBags);
        union unionVar = union.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, unionVar, slotTreeKtExternalSyntheticLambda0.alreadyScannedMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, unionVar, slotTreeKtExternalSyntheticLambda0.wrongShelfMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, unionVar, slotTreeKtExternalSyntheticLambda0.moveCloserMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, unionVar, slotTreeKtExternalSyntheticLambda0.successMessage);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, nextSourceLocation.IconCompatParcelizer, slotTreeKtExternalSyntheticLambda0.scannedItemsDialog);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getExitjXw82LU.read, slotTreeKtExternalSyntheticLambda0.extraCodeCloseButton);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), slotTreeKtExternalSyntheticLambda0.trackingEvents);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
        } else {
            Object[] objArr = {invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0, AndroidUiMode.INSTANCE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        char c;
        String strMediaMetadataCompat;
        char c2;
        int i = 2 % 2;
        int i2 = serializer + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = SlotTreeKtExternalSyntheticLambda0.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        C0204sourceLocation c0204sourceLocation = null;
        ComposeAnimationState composeAnimationState = null;
        mapTreeWithStitching maptreewithstitching = null;
        boolean z = true;
        mapTreeWithStitching maptreewithstitching2 = null;
        int i4 = 0;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        List list = null;
        String str = null;
        mapTreeWithStitching maptreewithstitching3 = null;
        mapTreeWithStitching maptreewithstitching4 = null;
        List list2 = null;
        invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = null;
        while (z) {
            int i5 = IconCompatParcelizer + 13;
            boolean z2 = z;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i7) {
                case -1:
                    str = str;
                    c = 2;
                    z2 = false;
                    z = z2;
                    str = str;
                    break;
                case 0:
                    strMediaMetadataCompat = str;
                    list2 = list2;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0;
                    c2 = 2;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    list2 = list2;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    z = z2;
                    str = strMediaMetadataCompat;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0;
                    break;
                case 1:
                    strMediaMetadataCompat = str;
                    c2 = 2;
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    list2 = list2;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    z = z2;
                    str = strMediaMetadataCompat;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0;
                    break;
                case 2:
                    str = str;
                    c = 2;
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= 4;
                    z = z2;
                    str = str;
                    break;
                case 3:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i4 |= 8;
                    c2 = 2;
                    list2 = list2;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    z = z2;
                    str = strMediaMetadataCompat;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0;
                    break;
                case 4:
                    maptreewithstitching3 = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, union.RemoteActionCompatParcelizer, maptreewithstitching3);
                    i4 |= 16;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                case 5:
                    maptreewithstitching4 = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, union.RemoteActionCompatParcelizer, maptreewithstitching4);
                    i4 |= 32;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                case 6:
                    maptreewithstitching2 = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, union.RemoteActionCompatParcelizer, maptreewithstitching2);
                    i4 |= 64;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                case 7:
                    maptreewithstitching = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, union.RemoteActionCompatParcelizer, maptreewithstitching);
                    i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                case 8:
                    c0204sourceLocation = (C0204sourceLocation) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, nextSourceLocation.IconCompatParcelizer, c0204sourceLocation);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                case 9:
                    composeAnimationState = (ComposeAnimationState) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getExitjXw82LU.read, composeAnimationState);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                case 10:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list2);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                case 11:
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
                    i4 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    c = 2;
                    z = z2;
                    str = str;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new SlotTreeKtExternalSyntheticLambda0(i4, strMediaMetadataCompat2, strMediaMetadataCompat3, list, str, maptreewithstitching3, maptreewithstitching4, maptreewithstitching2, maptreewithstitching, c0204sourceLocation, composeAnimationState, list2, invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
    }
}
