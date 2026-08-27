package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.user.properties.data.entity.UserPropertiesEntity$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class subscribeToBannersUpdateslambda30 {
    public static final UserPropertiesEntity$Companion Companion = new UserPropertiesEntity$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final Long cityId;
    public final String cityName;
    public final String contractType;

    static {
        int i = read + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    public /* synthetic */ subscribeToBannersUpdateslambda30(int i, String str, String str2, Long l) {
        if ((i & 1) == 0) {
            this.contractType = null;
            int i2 = IconCompatParcelizer + 113;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            if ((i & 2) == 0) {
                int i3 = write + 15;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                this.cityName = null;
            } else {
                this.cityName = str2;
            }
            if ((i & 4) == 0) {
                this.cityId = null;
                return;
            }
            this.cityId = l;
            int i5 = write + 15;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        this.contractType = str;
        int i7 = 2 % 2;
        if ((i & 2) == 0) {
            int i8 = write + 15;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.cityName = null;
        } else {
            this.cityName = str2;
        }
        if ((i & 4) == 0) {
            this.cityId = null;
            return;
        }
        this.cityId = l;
        int i10 = write + 15;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("UserPropertiesEntity(contractType=", this.contractType, ", cityName=", this.cityName, ", cityId=");
        sbM.append(this.cityId);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public subscribeToBannersUpdateslambda30(String str, String str2, Long l) {
        this.contractType = str;
        this.cityName = str2;
        this.cityId = l;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.contractType;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = write + 121;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.cityName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Long l = this.cityId;
        if (l != null) {
            iHashCode2 = l.hashCode();
            int i4 = IconCompatParcelizer + 105;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 4 / 3;
            }
        }
        int i6 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        int i7 = IconCompatParcelizer + 125;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i6;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof subscribeToBannersUpdateslambda30)) {
            int i2 = write + 35;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        subscribeToBannersUpdateslambda30 subscribetobannersupdateslambda30 = (subscribeToBannersUpdateslambda30) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contractType, subscribetobannersupdateslambda30.contractType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityName, subscribetobannersupdateslambda30.cityName}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 5;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityId, subscribetobannersupdateslambda30.cityId}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i6 = write + 55;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 77;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
