package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.getStatusBarBackgroundDrawable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setDrawerViewOffset {
    public static final HostLoadingPerformanceMeasurementBridgeMessage$Payload$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Payload$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 85;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                getStatusBarBackgroundDrawable getstatusbarbackgrounddrawable = getStatusBarBackgroundDrawable.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getStatusBarBackgroundDrawable getstatusbarbackgrounddrawable2 = getStatusBarBackgroundDrawable.serializer;
            int i3 = write + 95;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getstatusbarbackgrounddrawable2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final isPackable breakdown;
    public final int e2eTotalDurationMs;
    public final boolean isPreRendered;
    public final setDrawerListener timestamps;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Payload$Companion] */
    static {
        int i = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setDrawerViewOffset(int i, int i2, boolean z, isPackable ispackable, setDrawerListener setdrawerlistener) {
        if (15 == (i & 15)) {
            this.e2eTotalDurationMs = i2;
            this.isPreRendered = z;
            this.breakdown = ispackable;
            this.timestamps = setdrawerlistener;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getStatusBarBackgroundDrawable.serializer.getDescriptor());
        throw null;
    }

    public setDrawerViewOffset(int i, isPackable ispackable, setDrawerListener setdrawerlistener) {
        this.e2eTotalDurationMs = i;
        this.isPreRendered = false;
        this.breakdown = ispackable;
        this.timestamps = setdrawerlistener;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.e2eTotalDurationMs) * 31, 31, this.isPreRendered);
        int iHashCode = this.timestamps.hashCode() + ((this.breakdown.hashCode() + iM) * 31);
        int i4 = write + 113;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof setDrawerViewOffset) {
                setDrawerViewOffset setdrawerviewoffset = (setDrawerViewOffset) obj;
                if (this.e2eTotalDurationMs != setdrawerviewoffset.e2eTotalDurationMs) {
                    return false;
                }
                if (this.isPreRendered == setdrawerviewoffset.isPreRendered) {
                    Object[] objArr = {this.breakdown, setdrawerviewoffset.breakdown};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr2 = {this.timestamps, setdrawerviewoffset.timestamps};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = serializer + 15;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = write + 79;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = write + 49;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write;
        int i9 = i8 + 91;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        int i11 = i8 + 51;
        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Payload(e2eTotalDurationMs=" + this.e2eTotalDurationMs + ", isPreRendered=" + this.isPreRendered + ", breakdown=" + this.breakdown + ", timestamps=" + this.timestamps + ")";
        int i2 = write + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
