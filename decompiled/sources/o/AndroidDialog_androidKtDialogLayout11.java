package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidDialog_androidKtDialogLayout11 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final AndroidDialog_androidKtDialogLayout11 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        AndroidDialog_androidKtDialogLayout11 androidDialog_androidKtDialogLayout11 = new AndroidDialog_androidKtDialogLayout11();
        RemoteActionCompatParcelizer = androidDialog_androidKtDialogLayout11;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.StateV3.AcceptData.Pin", androidDialog_androidKtDialogLayout11, 12);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("address_id", true);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        oncloseactionlambda1.read(com.adjust.sdk.Constants.SMALL, true);
        oncloseactionlambda1.read("isVendor", true);
        oncloseactionlambda1.read("isCustomer", true);
        oncloseactionlambda1.read("isNewVendor", true);
        oncloseactionlambda1.read("isNewCustomer", true);
        oncloseactionlambda1.read("isPickedUp", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 59;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 49;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed);
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, setOnRequesterReady.IconCompatParcelizer, setgraphicmodalmaxwidthdp, getwasclosemessagecalled, afterClosed.IconCompatParcelizer, beforeinappmessageviewclosed, getwasclosemessagecalled, getwasclosemessagecalled, getwasclosemessagecalled, getwasclosemessagecalled, getwasclosemessagecalled, getwasclosemessagecalled};
        int i4 = write + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i3 = 0;
        boolean zWrite = false;
        int iIconCompatParcelizer = 0;
        boolean zWrite2 = false;
        boolean zWrite3 = false;
        boolean zWrite4 = false;
        boolean zWrite5 = false;
        boolean zWrite6 = false;
        boolean zWrite7 = false;
        boolean z = true;
        String strMediaMetadataCompat = null;
        BringIntoViewNoderequester1 bringIntoViewNoderequester1 = null;
        String str = null;
        String strMediaMetadataCompat2 = null;
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i4) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i = i3 | 1;
                    break;
                case 1:
                    bringIntoViewNoderequester1 = (BringIntoViewNoderequester1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setOnRequesterReady.IconCompatParcelizer, bringIntoViewNoderequester1);
                    i = i3 | 2;
                    break;
                case 2:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i = i3 | 4;
                    break;
                case 3:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i3 |= 8;
                    continue;
                case 4:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i3 |= 16;
                    continue;
                case 5:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i3 |= 32;
                    int i5 = serializer + 37;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    continue;
                case 6:
                    zWrite2 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i3 |= 64;
                    continue;
                case 7:
                    zWrite3 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i3 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    continue;
                case 8:
                    zWrite4 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i3 |= androidx.compose.ui.graphics.Fields.RotationX;
                    continue;
                case 9:
                    zWrite5 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9);
                    i3 |= androidx.compose.ui.graphics.Fields.RotationY;
                    continue;
                case 10:
                    zWrite6 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10);
                    i3 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    continue;
                case 11:
                    zWrite7 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11);
                    i3 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    continue;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                    return null;
            }
            i3 = i;
            int i7 = write + 23;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidDialog_androidKtDialogLayout111(i3, strMediaMetadataCompat, bringIntoViewNoderequester1, str, zWrite, iIconCompatParcelizer, strMediaMetadataCompat2, zWrite2, zWrite3, zWrite4, zWrite5, zWrite6, zWrite7);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout111 = (AndroidDialog_androidKtDialogLayout111) obj;
        androidDialog_androidKtDialogLayout111.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = androidDialog_androidKtDialogLayout111.type;
        boolean z = androidDialog_androidKtDialogLayout111.isPickedUp;
        boolean z2 = androidDialog_androidKtDialogLayout111.isNewCustomer;
        boolean z3 = androidDialog_androidKtDialogLayout111.isNewVendor;
        boolean z4 = androidDialog_androidKtDialogLayout111.isCustomer;
        boolean z5 = androidDialog_androidKtDialogLayout111.isVendor;
        boolean z6 = androidDialog_androidKtDialogLayout111.small;
        String str2 = androidDialog_androidKtDialogLayout111.style;
        int i2 = androidDialog_androidKtDialogLayout111.order;
        boolean z7 = androidDialog_androidKtDialogLayout111.highlighted;
        String str3 = androidDialog_androidKtDialogLayout111.addressId;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setOnRequesterReady.IconCompatParcelizer, androidDialog_androidKtDialogLayout111.address);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z7) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, z7);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i2 != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.write(4, i2, r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i3 = write + 49;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, ""}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, str2);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z6) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, z6);
            int i5 = serializer + 77;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z5 != str.equals("vendor")) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, z5);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z4 != str.equals("customer")) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, z4);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z3 != str.equals("new_vendor")) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, z3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z2 != str.equals("new_customer")) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, z2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z != str.equals("picked_up")) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, z);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
