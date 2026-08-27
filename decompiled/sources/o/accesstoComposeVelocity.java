package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accesstoComposeVelocity implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final accesstoComposeVelocity read;
    private static int serializer = 1;
    private static int write;

    static {
        accesstoComposeVelocity accesstocomposevelocity = new accesstoComposeVelocity();
        read = accesstocomposevelocity;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("vendor", accesstocomposevelocity, 6);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        oncloseactionlambda1.read("actionable_detail", true);
        oncloseactionlambda1.read(RemoteMessageConst.Notification.PRIORITY, true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 79;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(AndroidViewHolderlayoutNode1coreModifier2.serializer);
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {AndroidViewHolderlayoutNode13.IconCompatParcelizer, getWasCloseMessageCalled.write, afterclosed, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, setgraphicmodalmaxwidthdp, afterclosed};
        int i4 = serializer + 103;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        boolean z = true;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = null;
        String strMediaMetadataCompat = null;
        AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1 = null;
        int i3 = 0;
        boolean zWrite = false;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        while (true) {
            if (!z) {
                createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                return new accessgetNoOpScrollConnectionp(i3, androidViewHolderlayoutNode12, zWrite, iIconCompatParcelizer, strMediaMetadataCompat, androidViewHolderlayoutNode1coreModifier1, iIconCompatParcelizer2);
            }
            int i4 = IconCompatParcelizer + 81;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                switch (i) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
                        i3 |= 1;
                        break;
                    case 1:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        androidViewHolderlayoutNode1coreModifier1 = (AndroidViewHolderlayoutNode1coreModifier1) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, AndroidViewHolderlayoutNode1coreModifier2.serializer, androidViewHolderlayoutNode1coreModifier1);
                        i3 |= 16;
                        break;
                    case 5:
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                        i3 |= 32;
                        break;
                    default:
                        break;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i5 = 53 / 0;
                switch (i) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
                        i3 |= 1;
                        break;
                    case 1:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        androidViewHolderlayoutNode1coreModifier1 = (AndroidViewHolderlayoutNode1coreModifier1) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, AndroidViewHolderlayoutNode1coreModifier2.serializer, androidViewHolderlayoutNode1coreModifier1);
                        i3 |= 16;
                        break;
                    case 5:
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                        i3 |= 32;
                        break;
                    default:
                        break;
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
        int i6 = IconCompatParcelizer + 71;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetNoOpScrollConnectionp accessgetnoopscrollconnectionp = (accessgetNoOpScrollConnectionp) obj;
        accessgetnoopscrollconnectionp.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidViewHolderlayoutNode13 androidViewHolderlayoutNode13 = AndroidViewHolderlayoutNode13.IconCompatParcelizer;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = accessgetnoopscrollconnectionp.address;
        int i4 = accessgetnoopscrollconnectionp.priority;
        AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1 = accessgetnoopscrollconnectionp.actionableDetails;
        String str = accessgetnoopscrollconnectionp.style;
        int i5 = accessgetnoopscrollconnectionp.order;
        boolean z = accessgetnoopscrollconnectionp.highlighted;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, androidViewHolderlayoutNode13, androidViewHolderlayoutNode12);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, z);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i5 != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.write(2, i5, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, ""}, iWrite3)).booleanValue()) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || androidViewHolderlayoutNode1coreModifier1 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, AndroidViewHolderlayoutNode1coreModifier2.serializer, androidViewHolderlayoutNode1coreModifier1);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i4 != 2) {
                defaultInAppMessageSlideupViewFactorySerializer.write(5, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i6 = serializer + 29;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 3 % 4;
        }
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, AndroidViewHolderlayoutNode1coreModifier2.serializer, androidViewHolderlayoutNode1coreModifier1);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, AndroidViewHolderlayoutNode1coreModifier2.serializer, androidViewHolderlayoutNode1coreModifier1);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.write(5, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.write(5, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
