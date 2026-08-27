package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidPopup_androidKtPopup71 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final AndroidPopup_androidKtPopup71 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        AndroidPopup_androidKtPopup71 androidPopup_androidKtPopup71 = new AndroidPopup_androidKtPopup71();
        RemoteActionCompatParcelizer = androidPopup_androidKtPopup71;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.StateV3.ExternalComponents.CustomerChat.ChatDelivery", androidPopup_androidKtPopup71, 10);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.CHANNEL_ID_KEY, false);
        oncloseactionlambda1.read("confirmation_number", false);
        oncloseactionlambda1.read("delivery_action", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("phone_number", true);
        oncloseactionlambda1.read("address", true);
        oncloseactionlambda1.read("vendor_order_number", true);
        oncloseactionlambda1.read("total_amount", true);
        oncloseactionlambda1.read("comments", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 119;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 5;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81 = (AndroidPopup_androidKtPopup81) obj;
        androidPopup_androidKtPopup81.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidPopup_androidKtPopup81.RemoteActionCompatParcelizer(androidPopup_androidKtPopup81, defaultInAppMessageSlideupViewFactorySerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 115;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {onDismissed.write, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
        int i4 = read + 65;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        char c;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = 0;
        long jSerializer = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        boolean z = true;
        String strMediaMetadataCompat5 = null;
        while (z) {
            int i5 = IconCompatParcelizer + 45;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i6 = 60 / 0;
                switch (i) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        c = 2;
                        jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i4 |= 1;
                        break;
                    case 1:
                        i2 = 1;
                        c = 2;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i4 |= 2;
                        break;
                    case 2:
                        c = 2;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                        i4 |= 32;
                        break;
                    case 6:
                        str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                        i4 |= 64;
                        break;
                    case 7:
                        num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, afterClosed.IconCompatParcelizer, num);
                        i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        break;
                    case 8:
                        strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                        int i7 = IconCompatParcelizer + 37;
                        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        break;
                    case 9:
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                switch (i) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        c = 2;
                        jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i4 |= 1;
                        break;
                    case 1:
                        c = 2;
                        i2 = 1;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i4 |= 2;
                        break;
                    case 2:
                        c = 2;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                        i4 |= 32;
                        break;
                    case 6:
                        str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                        i4 |= 64;
                        break;
                    case 7:
                        num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, afterClosed.IconCompatParcelizer, num);
                        i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        break;
                    case 8:
                        strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                        int i9 = IconCompatParcelizer + 37;
                        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        break;
                    case 9:
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidPopup_androidKtPopup81(i4, jSerializer, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, str2, str3, num, strMediaMetadataCompat5, str);
    }
}
