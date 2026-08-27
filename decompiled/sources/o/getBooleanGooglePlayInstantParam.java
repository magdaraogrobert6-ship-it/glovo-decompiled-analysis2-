package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.data.model.StartingPointResponse$Companion;
import kotlinx.serialization.Serializable;
import o.getInstallBeginTimestampServerSeconds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getBooleanGooglePlayInstantParam {
    public static final StartingPointResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.StartingPointResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getInstallBeginTimestampServerSeconds getinstallbegintimestampserverseconds = getInstallBeginTimestampServerSeconds.write;
            int i4 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getinstallbegintimestampserverseconds;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String description;
    public final String geoId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.StartingPointResponse$Companion] */
    static {
        int i = serializer + 85;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 43;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 81;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ getBooleanGooglePlayInstantParam(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.description = str;
            if ((i & 2) == 0) {
                this.geoId = null;
                int i2 = RemoteActionCompatParcelizer + 69;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.geoId = str2;
            int i4 = RemoteActionCompatParcelizer + 3;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getInstallBeginTimestampServerSeconds.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StartingPointResponse(description=", this.description, ", geoId=", this.geoId, ")");
        }
        int i3 = 37 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StartingPointResponse(description=", this.description, ", geoId=", this.geoId, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.description.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.description.hashCode();
        String str = this.geoId;
        if (str == null) {
            int i3 = IconCompatParcelizer;
            int i4 = i3 + 39;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 73;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getBooleanGooglePlayInstantParam))) {
            getBooleanGooglePlayInstantParam getbooleangoogleplayinstantparam = (getBooleanGooglePlayInstantParam) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getbooleangoogleplayinstantparam.description}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.geoId, getbooleangoogleplayinstantparam.geoId}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = RemoteActionCompatParcelizer + 5;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            int i3 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
