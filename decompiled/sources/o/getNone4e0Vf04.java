package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.configuration.BleScanningConfig$Companion;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getNone4e0Vf04 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final List deliveryStatesEnabled;
    public final int rssiPercentileForCalculation;
    public final int scanningStartGeofenceMeters;
    public final Integer signalLostTimeoutSeconds;
    public static final BleScanningConfig$Companion Companion = new BleScanningConfig$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3$$ExternalSyntheticLambda0(18)), null, null, null};

    static {
        int i = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    public /* synthetic */ getNone4e0Vf04(int i, List list, Integer num, int i2, int i3) {
        int i4;
        if (13 == (i & 13)) {
            this.deliveryStatesEnabled = list;
            if ((i & 2) == 0) {
                this.signalLostTimeoutSeconds = null;
                i4 = serializer + 87;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                this.signalLostTimeoutSeconds = num;
                i4 = read + 81;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            this.rssiPercentileForCalculation = i2;
            this.scanningStartGeofenceMeters = i3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, getFontHinting4e0Vf04.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.deliveryStatesEnabled.hashCode();
            throw null;
        }
        int iHashCode2 = this.deliveryStatesEnabled.hashCode();
        Integer num = this.signalLostTimeoutSeconds;
        if (num == null) {
            int i3 = serializer + 21;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode3 = Integer.hashCode(this.scanningStartGeofenceMeters) + af$$ExternalSyntheticOutline0.m(this.rssiPercentileForCalculation, ((iHashCode2 * 31) + iHashCode) * 31, 31);
        int i5 = read + 15;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 3;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getNone4e0Vf04)) {
            return false;
        }
        getNone4e0Vf04 getnone4e0vf04 = (getNone4e0Vf04) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryStatesEnabled, getnone4e0vf04.deliveryStatesEnabled}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.signalLostTimeoutSeconds, getnone4e0vf04.signalLostTimeoutSeconds}, getCieXyz.write())).booleanValue() || this.rssiPercentileForCalculation != getnone4e0vf04.rssiPercentileForCalculation) {
                return false;
            }
            if (this.scanningStartGeofenceMeters == getnone4e0vf04.scanningStartGeofenceMeters) {
                return true;
            }
            int i4 = serializer + 49;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = serializer + 31;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BleScanningConfig(deliveryStatesEnabled=" + this.deliveryStatesEnabled + ", signalLostTimeoutSeconds=" + this.signalLostTimeoutSeconds + ", rssiPercentileForCalculation=" + this.rssiPercentileForCalculation + ", scanningStartGeofenceMeters=" + this.scanningStartGeofenceMeters + ")";
        int i2 = read + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
