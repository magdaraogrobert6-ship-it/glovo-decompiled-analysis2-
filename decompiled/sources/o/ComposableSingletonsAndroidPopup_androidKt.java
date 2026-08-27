package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.TrackingEvent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.model.Analytics$Companion;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.ComposableSingletonsAndroidPopup_androidKtlambda11318261961;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ComposableSingletonsAndroidPopup_androidKt {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final Analytics$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.model.Analytics$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ComposableSingletonsAndroidPopup_androidKtlambda11318261961 composableSingletonsAndroidPopup_androidKtlambda11318261961 = ComposableSingletonsAndroidPopup_androidKtlambda11318261961.write;
            int i4 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return composableSingletonsAndroidPopup_androidKtlambda11318261961;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String deliveryState;
    public final List parameters;
    public final Map trackingParams;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.model.Analytics$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new TrackingEvent$$ExternalSyntheticLambda0(5)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new TrackingEvent$$ExternalSyntheticLambda0(6))};
        int i = RemoteActionCompatParcelizer + 119;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    public /* synthetic */ ComposableSingletonsAndroidPopup_androidKt(int i, String str, List list, Map map) {
        if (3 == (i & 3)) {
            this.deliveryState = str;
            this.parameters = list;
            if ((i & 4) == 0) {
                this.trackingParams = null;
                int i2 = IconCompatParcelizer + 85;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.trackingParams = map;
            int i3 = IconCompatParcelizer + 3;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 95 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ComposableSingletonsAndroidPopup_androidKtlambda11318261961.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Analytics(deliveryState=", this.deliveryState, ", parameters=", this.parameters, ", trackingParams="), this.trackingParams, ")");
            int i3 = IconCompatParcelizer + 107;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strRemoteActionCompatParcelizer;
        }
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Analytics(deliveryState=", this.deliveryState, ", parameters=", this.parameters, ", trackingParams="), this.trackingParams, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.parameters, this.deliveryState.hashCode() * 31, 31);
        Map map = this.trackingParams;
        if (map == null) {
            int i4 = IconCompatParcelizer + 23;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = map.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof ComposableSingletonsAndroidPopup_androidKt)) {
                return false;
            }
            ComposableSingletonsAndroidPopup_androidKt composableSingletonsAndroidPopup_androidKt = (ComposableSingletonsAndroidPopup_androidKt) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryState, composableSingletonsAndroidPopup_androidKt.deliveryState}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.parameters, composableSingletonsAndroidPopup_androidKt.parameters}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingParams, composableSingletonsAndroidPopup_androidKt.trackingParams}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 39;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                boolean z = true ^ (i3 % 2 == 0);
                int i4 = i2 + 15;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return z;
                }
                throw null;
            }
            int i5 = serializer + 75;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = serializer + 107;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
