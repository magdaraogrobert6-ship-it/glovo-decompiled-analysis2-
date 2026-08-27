package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y1 implements getInAppMessageManager {
    public static final y1 IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        y1 y1Var = new y1();
        IconCompatParcelizer = y1Var;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.order.history.data.database.converter.ConvertedDelivery", y1Var, 10);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("confirmationNumber", false);
        oncloseactionlambda1.read("vendorOrderNumber", false);
        oncloseactionlambda1.read("vendor", false);
        oncloseactionlambda1.read("customer", false);
        oncloseactionlambda1.read("payment", false);
        oncloseactionlambda1.read("cashCollection", true);
        oncloseactionlambda1.read("items", false);
        oncloseactionlambda1.read("distance", false);
        oncloseactionlambda1.read("completedAt", true);
        descriptor = oncloseactionlambda1;
        int i = write + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 61;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 43;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = xf.$childSerializers;
        onDismissed ondismissed = onDismissed.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {ondismissed, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer, z1.IconCompatParcelizer, yc.serializer, z2.read, LazyKt__LazyJVMKt.read(ye.IconCompatParcelizer), onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(ondismissed)};
        int i4 = serializer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0070  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        xf xfVar = (xf) obj;
        xfVar.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = xf.$childSerializers;
        long j = xfVar.id;
        Long l = xfVar.completedAt;
        yb ybVar = xfVar.cashCollection;
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, j);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, xfVar.confirmationNumber);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, xfVar.vendorOrderNumber, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, z1.IconCompatParcelizer, xfVar.vendor);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, yc.serializer, xfVar.customer);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, z2.read, xfVar.payment);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (ybVar != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), xfVar.items);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, xfVar.distance);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (l != null) {
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i2 = read + 77;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            int i4 = serializer + 49;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, onDismissed.write, l);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i6 = read + 77;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = read + 43;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, ye.IconCompatParcelizer, ybVar);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), xfVar.items);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, xfVar.distance);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (l != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i10 = read + 77;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        int i12 = serializer + 49;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, onDismissed.write, l);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i14 = read + 77;
        serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = xf.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        long j = 0;
        double d = 0.0d;
        Long l = null;
        zExternalSyntheticLambda0 zexternalsyntheticlambda0 = null;
        yf yfVar = null;
        zExternalSyntheticLambda1 zexternalsyntheticlambda1 = null;
        yb ybVar = null;
        List list = null;
        int i4 = 0;
        String strMediaMetadataCompat = null;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i5) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    long jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    int i6 = serializer + 119;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        int i7 = 4 % 5;
                    }
                    j = jSerializer;
                    continue;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    break;
                case 2:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i4 |= 4;
                    break;
                case 3:
                    zexternalsyntheticlambda0 = (zExternalSyntheticLambda0) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, z1.IconCompatParcelizer, zexternalsyntheticlambda0);
                    i4 |= 8;
                    break;
                case 4:
                    yfVar = (yf) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, yc.serializer, yfVar);
                    i4 |= 16;
                    break;
                case 5:
                    zexternalsyntheticlambda1 = (zExternalSyntheticLambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, z2.read, zexternalsyntheticlambda1);
                    i4 |= 32;
                    break;
                case 6:
                    ybVar = (yb) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, ye.IconCompatParcelizer, ybVar);
                    i4 |= 64;
                    break;
                case 7:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                case 8:
                    double dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                    d = dRemoteActionCompatParcelizer;
                    break;
                case 9:
                    l = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, onDismissed.write, l);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new xf(i4, j, strMediaMetadataCompat, iIconCompatParcelizer, zexternalsyntheticlambda0, yfVar, zexternalsyntheticlambda1, ybVar, list, d, l);
    }
}
