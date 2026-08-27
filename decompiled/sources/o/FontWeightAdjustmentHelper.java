package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.destination.data.models.VehicleType;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FontWeightAdjustmentHelper implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    public static final FontWeightAdjustmentHelper serializer;
    private static int write;

    static {
        FontWeightAdjustmentHelper fontWeightAdjustmentHelper = new FontWeightAdjustmentHelper();
        serializer = fontWeightAdjustmentHelper;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("external_map", fontWeightAdjustmentHelper, 4);
        oncloseactionlambda1.read("latitude", false);
        oncloseactionlambda1.read("longitude", false);
        oncloseactionlambda1.read("caption", true);
        oncloseactionlambda1.read("vehicle_type", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 103;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 41;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getW900.$childSerializers;
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper()};
        int i4 = RemoteActionCompatParcelizer + 101;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getW900 getw900 = (getW900) obj;
        getw900.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getW900.$childSerializers;
        double d = getw900.latitude;
        String str = getw900.caption;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, d);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getw900.longitude);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), getw900.vehicleType);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        double d;
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = getW900.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            d = 1.0d;
            z = false;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = getW900.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            d = 0.0d;
            z = true;
        }
        double dRemoteActionCompatParcelizer = d;
        double dRemoteActionCompatParcelizer2 = dRemoteActionCompatParcelizer;
        String str = null;
        VehicleType vehicleType = null;
        int i3 = 0;
        while (z) {
            int i4 = RemoteActionCompatParcelizer + 53;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 == -1) {
                z = false;
            } else if (i5 != 0) {
                int i6 = RemoteActionCompatParcelizer + 19;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i5 == 1) {
                    dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i3 |= 2;
                } else if (i5 == 2) {
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i3 |= 4;
                } else {
                    if (i5 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        int i8 = read + 15;
                        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    vehicleType = (VehicleType) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), vehicleType);
                    i3 |= 8;
                }
            } else {
                dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i3 |= 1;
                int i9 = RemoteActionCompatParcelizer + 121;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 5 / 4;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getW900(i3, dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, str, vehicleType);
    }
}
