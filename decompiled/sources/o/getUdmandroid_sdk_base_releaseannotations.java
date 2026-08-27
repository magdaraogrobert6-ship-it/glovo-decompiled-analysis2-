package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.stopworking.entity.CourierAvailabilityRequest$Companion;
import kotlinx.serialization.Serializable;
import o.getRegistrationDataProviderandroid_sdk_base_releaseannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getUdmandroid_sdk_base_releaseannotations {
    public static final CourierAvailabilityRequest$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.stopworking.entity.CourierAvailabilityRequest$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 37;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getRegistrationDataProviderandroid_sdk_base_releaseannotations.IconCompatParcelizer;
            }
            getRegistrationDataProviderandroid_sdk_base_releaseannotations getregistrationdataproviderandroid_sdk_base_releaseannotations = getRegistrationDataProviderandroid_sdk_base_releaseannotations.IconCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final boolean available;
    public final String contractType;
    public final handleInAppMessageTestPushlambda1 location;
    public final String nationalId;
    public final Double temperature;
    public final isEphemeralEventKeylambda0 vehicle;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.stopworking.entity.CourierAvailabilityRequest$Companion] */
    static {
        int i = read + 115;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getUdmandroid_sdk_base_releaseannotations(int i, boolean z, String str, Double d, isEphemeralEventKeylambda0 isephemeraleventkeylambda0, handleInAppMessageTestPushlambda1 handleinappmessagetestpushlambda1, String str2) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getRegistrationDataProviderandroid_sdk_base_releaseannotations.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.available = z;
        if ((i & 2) == 0) {
            this.nationalId = null;
        } else {
            this.nationalId = str;
            int i2 = write + 25;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.temperature = null;
            int i5 = 2 % 2;
        } else {
            this.temperature = d;
        }
        if ((i & 8) == 0) {
            this.vehicle = null;
        } else {
            this.vehicle = isephemeraleventkeylambda0;
        }
        if ((i & 16) == 0) {
            this.location = null;
            int i6 = write + 19;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.location = handleinappmessagetestpushlambda1;
        }
        if ((i & 32) == 0) {
            this.contractType = null;
        } else {
            this.contractType = str2;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode3 = Boolean.hashCode(this.available);
        String str = this.nationalId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Double d = this.temperature;
        if (d == null) {
            int i4 = write + 53;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = d.hashCode();
            int i5 = write + 91;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        isEphemeralEventKeylambda0 isephemeraleventkeylambda0 = this.vehicle;
        if (isephemeraleventkeylambda0 == null) {
            int i7 = write + 77;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = isephemeraleventkeylambda0.hashCode();
        }
        handleInAppMessageTestPushlambda1 handleinappmessagetestpushlambda1 = this.location;
        int iHashCode5 = handleinappmessagetestpushlambda1 == null ? 0 : handleinappmessagetestpushlambda1.hashCode();
        String str2 = this.contractType;
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CourierAvailabilityRequest(available=" + this.available + ", nationalId=" + this.nationalId + ", temperature=" + this.temperature + ", vehicle=" + this.vehicle + ", location=" + this.location + ", contractType=" + this.contractType + ")";
        int i2 = write + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 23;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getUdmandroid_sdk_base_releaseannotations)) {
            int i4 = IconCompatParcelizer + 81;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getUdmandroid_sdk_base_releaseannotations getudmandroid_sdk_base_releaseannotations = (getUdmandroid_sdk_base_releaseannotations) obj;
        if (this.available != getudmandroid_sdk_base_releaseannotations.available) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nationalId, getudmandroid_sdk_base_releaseannotations.nationalId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.temperature, getudmandroid_sdk_base_releaseannotations.temperature}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 15;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.vehicle, getudmandroid_sdk_base_releaseannotations.vehicle}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, getudmandroid_sdk_base_releaseannotations.location}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contractType, getudmandroid_sdk_base_releaseannotations.contractType}, getCieXyz.write())).booleanValue();
        }
        int i8 = write + 103;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
