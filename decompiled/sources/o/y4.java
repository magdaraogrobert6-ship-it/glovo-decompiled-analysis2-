package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y4 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final y4 serializer;
    private static int write = 1;

    static {
        y4 y4Var = new y4();
        serializer = y4Var;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.order.history.data.database.entity.Delivery", y4Var, 10);
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
        int i = write + 27;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = y2.$childSerializers;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {onDismissed.write, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer, z1.IconCompatParcelizer, yc.serializer, z2.read, LazyKt__LazyJVMKt.read(ye.IconCompatParcelizer), onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper())};
        int i4 = read + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        y2 y2Var = (y2) obj;
        y2Var.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = y2.$childSerializers;
        long j = y2Var.id;
        DateTime dateTime = y2Var.completedAt;
        yb ybVar = y2Var.cashCollection;
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, j);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, y2Var.confirmationNumber);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, y2Var.vendorOrderNumber, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, z1.IconCompatParcelizer, y2Var.vendor);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, yc.serializer, y2Var.customer);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, z2.read, y2Var.payment);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || ybVar != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, ye.IconCompatParcelizer, ybVar);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), y2Var.items);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, y2Var.distance);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (dateTime != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = read + 43;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), dateTime);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = y2.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jSerializer = 0;
        double d = 0.0d;
        DateTime dateTime = null;
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
            int i5 = read + 105;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i7) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    continue;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    continue;
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
                    int i8 = read + 103;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
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
                    dateTime = (DateTime) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), dateTime);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new y2(i4, jSerializer, strMediaMetadataCompat, iIconCompatParcelizer, zexternalsyntheticlambda0, yfVar, zexternalsyntheticlambda1, ybVar, list, d, dateTime);
    }
}
