package o;

import com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel;
import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedUIouoOA {
    private static int serializer = 1;
    private static int write;
    public final PickupDropOffSingleDeliveryUiModel RemoteActionCompatParcelizer;

    public getUnspecifiedUIouoOA(PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl) {
        this.RemoteActionCompatParcelizer = pickupDropOffSingleDeliveryUiModelImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 109;
        o.getUnspecifiedUIouoOA.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getUnspecifiedUIouoOA.write
            int r2 = r1 + 55
            int r3 = r2 % 128
            o.getUnspecifiedUIouoOA.serializer = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel r2 = r5.RemoteActionCompatParcelizer
            r4 = 99
            int r4 = r4 / r3
            if (r2 != 0) goto L28
            goto L1b
        L17:
            com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel r2 = r5.RemoteActionCompatParcelizer
            if (r2 != 0) goto L28
        L1b:
            int r1 = r1 + 109
            int r2 = r1 % 128
            o.getUnspecifiedUIouoOA.serializer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L27
            r0 = 86
            int r0 = r0 / r3
        L27:
            return r3
        L28:
            int r0 = r2.hashCode()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getUnspecifiedUIouoOA.hashCode():int");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StackedDeliveryDetailsUiState(uiModel=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUnspecifiedUIouoOA)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((getUnspecifiedUIouoOA) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i3 = write + 119;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 == 0;
    }
}
