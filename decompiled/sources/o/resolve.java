package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class resolve implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final resolve read;
    private static int serializer = 1;
    private static int write;

    static {
        resolve resolveVar = new resolve();
        read = resolveVar;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.tasks.OfflineValidation", resolveVar, 8);
        oncloseactionlambda1.read("pin_secret", false);
        oncloseactionlambda1.read("pin_hash", false);
        oncloseactionlambda1.read("iterations", false);
        oncloseactionlambda1.read("output_length", false);
        oncloseactionlambda1.read("success_message", false);
        oncloseactionlambda1.read("error_message", false);
        oncloseactionlambda1.read("pin_attempts", false);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = write + 101;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 99;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = preloadlambda11.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        r8lambdapHKjrxD645VvJMKONPIiIcYf6fY r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, afterclosed, afterclosed, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, FontRetOiIgdefault.write, onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper()};
        int i4 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x007c  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        preloadlambda11 preloadlambda11Var = (preloadlambda11) obj;
        preloadlambda11Var.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = preloadlambda11.$childSerializers;
        String str = preloadlambda11Var.pinSecret;
        List list = preloadlambda11Var.trackingEvents;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, preloadlambda11Var.pinHash);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, preloadlambda11Var.iterations, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, preloadlambda11Var.outputLength, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambdapHKjrxD645VvJMKONPIiIcYf6fY r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, preloadlambda11Var.successMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, preloadlambda11Var.errorMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, FontRetOiIgdefault.write, preloadlambda11Var.pinAttempts);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
            int i4 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
                int i6 = RemoteActionCompatParcelizer + 5;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 89;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = preloadlambda11.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i6 = 1;
        boolean z = true;
        List list = null;
        FontYpTlLL0 fontYpTlLL0 = null;
        int i7 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        preloadlambda1 preloadlambda1Var = null;
        preloadlambda1 preloadlambda1Var2 = null;
        while (!(!z)) {
            int i8 = IconCompatParcelizer + 39;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i10) {
                case -1:
                    i = i6;
                    z = false;
                    i6 = i;
                    break;
                case 0:
                    i = i6;
                    list = list;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i7 |= 1;
                    list = list;
                    i6 = i;
                    break;
                case 1:
                    i = i6;
                    list = list;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
                    i7 |= 2;
                    list = list;
                    i6 = i;
                    break;
                case 2:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i2 = i7 | 4;
                    int i11 = IconCompatParcelizer + 119;
                    RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i7 = i2;
                    i = 1;
                    list = list;
                    i6 = i;
                    break;
                case 3:
                    iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 = i7 | 8;
                    i7 = i2;
                    i = 1;
                    list = list;
                    i6 = i;
                    break;
                case 4:
                    preloadlambda1Var = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var);
                    i2 = i7 | 16;
                    i7 = i2;
                    i = 1;
                    list = list;
                    i6 = i;
                    break;
                case 5:
                    preloadlambda1Var2 = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var2);
                    i2 = i7 | 32;
                    i7 = i2;
                    i = 1;
                    list = list;
                    i6 = i;
                    break;
                case 6:
                    fontYpTlLL0 = (FontYpTlLL0) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, FontRetOiIgdefault.write, fontYpTlLL0);
                    i2 = i7 | 64;
                    i7 = i2;
                    i = 1;
                    list = list;
                    i6 = i;
                    break;
                case 7:
                    List list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
                    i7 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 1;
                    list = list2;
                    list = list;
                    i6 = i;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i10);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new preloadlambda11(i7, strMediaMetadataCompat, strMediaMetadataCompat2, iIconCompatParcelizer, iIconCompatParcelizer2, preloadlambda1Var, preloadlambda1Var2, fontYpTlLL0, list);
    }
}
