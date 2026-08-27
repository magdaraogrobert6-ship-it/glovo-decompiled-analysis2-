package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Companion;
import java.util.UUID;
import kotlinx.serialization.Serializable;
import o.getWireType;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class RxDataStore extends getListParameter {
    public static final HostLoadingPerformanceMeasurementBridgeMessage$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 15;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                getWireType getwiretype = getWireType.RemoteActionCompatParcelizer;
                throw null;
            }
            getWireType getwiretype2 = getWireType.RemoteActionCompatParcelizer;
            int i3 = read + 99;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getwiretype2;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String id;
    public final setDrawerViewOffset payload;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Companion] */
    static {
        int i = read + 21;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    @Override // o.getListParameter
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 61;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // o.getListParameter
    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 73;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 95;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ RxDataStore(int i, String str, String str2, setDrawerViewOffset setdrawerviewoffset) {
        Object obj = null;
        if (4 != (i & 4)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 4, getWireType.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            str = "HOST_LOADING_PERFORMANCE_MEASUREMENT_" + UUID.randomUUID();
            int i2 = serializer + 19;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.id = str;
        if ((i & 2) == 0) {
            int i4 = RemoteActionCompatParcelizer + 119;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.type = "HOST_LOADING_PERFORMANCE_MEASUREMENT";
                obj.hashCode();
                throw null;
            }
            this.type = "HOST_LOADING_PERFORMANCE_MEASUREMENT";
        } else {
            this.type = str2;
            int i5 = serializer + 49;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this.payload = setdrawerviewoffset;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type) + this.payload.hashCode();
        }
        return this.payload.hashCode() << af$$ExternalSyntheticOutline0.m(this.id.hashCode() - 104, 33, this.type);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HostLoadingPerformanceMeasurementBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
        sbM.append(this.payload);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RxDataStore)) {
            return false;
        }
        RxDataStore rxDataStore = (RxDataStore) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, rxDataStore.id}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, rxDataStore.type}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, rxDataStore.payload}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 93;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 115;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public RxDataStore(setDrawerViewOffset setdrawerviewoffset) {
        this.id = "HOST_LOADING_PERFORMANCE_MEASUREMENT_" + UUID.randomUUID();
        this.type = "HOST_LOADING_PERFORMANCE_MEASUREMENT";
        this.payload = setdrawerviewoffset;
    }
}
