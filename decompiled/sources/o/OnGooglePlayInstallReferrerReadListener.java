package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.database.entity.ShiftEntity$Companion;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OnGooglePlayInstallReferrerReadListener {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final ShiftEntity$Companion Companion = new ShiftEntity$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String area;
    public final String bonusMultiplier;
    public final List bonusTypes;
    public final Boolean calendarEnabled;
    public final Calendar endedAt;
    public final boolean hasShiftMode;
    public final Long id;
    public final Calendar startedAt;
    public final Long startingAreaId;
    public final String zoneGeoJson;
    public final Long zoneId;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new waExternalSyntheticLambda3(29)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new performPushDeliveryFlushlambda1(1)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new performPushDeliveryFlushlambda1(2)), null, null, null};
        int i = serializer + 93;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ OnGooglePlayInstallReferrerReadListener(int i, Long l, Long l2, Long l3, String str, Calendar calendar, Calendar calendar2, String str2, List list, Boolean bool, boolean z, String str3) {
        if ((i & 1) == 0) {
            this.zoneId = null;
        } else {
            this.zoneId = l;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            this.startingAreaId = null;
        } else {
            this.startingAreaId = l2;
        }
        if ((i & 4) == 0) {
            int i3 = RemoteActionCompatParcelizer + 91;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.id = null;
            int i5 = 2 % 2;
        } else {
            this.id = l3;
        }
        if ((i & 8) == 0) {
            this.area = null;
        } else {
            this.area = str;
        }
        if ((i & 16) == 0) {
            this.startedAt = null;
            int i6 = 2 % 2;
        } else {
            this.startedAt = calendar;
        }
        if ((i & 32) == 0) {
            this.endedAt = null;
            int i7 = read + 69;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.endedAt = calendar2;
        }
        if ((i & 64) == 0) {
            this.bonusMultiplier = null;
        } else {
            this.bonusMultiplier = str2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.bonusTypes = null;
        } else {
            this.bonusTypes = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.calendarEnabled = null;
        } else {
            this.calendarEnabled = bool;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            int i9 = RemoteActionCompatParcelizer + 25;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            this.hasShiftMode = false;
        } else {
            this.hasShiftMode = z;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            this.zoneGeoJson = null;
        } else {
            this.zoneGeoJson = str3;
        }
    }

    public OnGooglePlayInstallReferrerReadListener(Long l, Long l2, Long l3, String str, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, String str2, List list, Boolean bool, boolean z, String str3) {
        this.zoneId = l;
        this.startingAreaId = l2;
        this.id = l3;
        this.area = str;
        this.startedAt = gregorianCalendar;
        this.endedAt = gregorianCalendar2;
        this.bonusMultiplier = str2;
        this.bonusTypes = list;
        this.calendarEnabled = bool;
        this.hasShiftMode = z;
        this.zoneGeoJson = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ShiftEntity(zoneId=");
        sb.append(this.zoneId);
        sb.append(", startingAreaId=");
        sb.append(this.startingAreaId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", area=");
        sb.append(this.area);
        sb.append(", startedAt=");
        sb.append(this.startedAt);
        sb.append(", endedAt=");
        sb.append(this.endedAt);
        sb.append(", bonusMultiplier=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.bonusMultiplier, ", bonusTypes=", this.bonusTypes, ", calendarEnabled=");
        sb.append(this.calendarEnabled);
        sb.append(", hasShiftMode=");
        sb.append(this.hasShiftMode);
        sb.append(", zoneGeoJson=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.zoneGeoJson, ")");
        int i2 = RemoteActionCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        Long l = this.zoneId;
        int iHashCode7 = 0;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Long l2 = this.startingAreaId;
        if (l2 == null) {
            int i2 = RemoteActionCompatParcelizer + 45;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l2.hashCode();
        }
        Long l3 = this.id;
        if (l3 == null) {
            int i4 = read + 39;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l3.hashCode();
        }
        String str = this.area;
        if (str == null) {
            int i6 = RemoteActionCompatParcelizer + 97;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
        }
        Calendar calendar = this.startedAt;
        if (calendar == null) {
            int i8 = RemoteActionCompatParcelizer + 85;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = calendar.hashCode();
        }
        Calendar calendar2 = this.endedAt;
        if (calendar2 == null) {
            int i10 = read + 47;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode5 = i10 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode5 = calendar2.hashCode();
        }
        String str2 = this.bonusMultiplier;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        List list = this.bonusTypes;
        if (list == null) {
            int i11 = RemoteActionCompatParcelizer + 95;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = list.hashCode();
        }
        Boolean bool = this.calendarEnabled;
        int iM = d$$ExternalSyntheticOutline0.m(((((((((((((((((iHashCode8 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode9) * 31) + iHashCode6) * 31) + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.hasShiftMode);
        String str3 = this.zoneGeoJson;
        if (str3 == null) {
            int i13 = RemoteActionCompatParcelizer + 89;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            iHashCode7 = str3.hashCode();
            int i15 = RemoteActionCompatParcelizer + 111;
            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        return iM + iHashCode7;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof OnGooglePlayInstallReferrerReadListener)) {
                return false;
            }
            OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener = (OnGooglePlayInstallReferrerReadListener) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneId, onGooglePlayInstallReferrerReadListener.zoneId}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startingAreaId, onGooglePlayInstallReferrerReadListener.startingAreaId}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, onGooglePlayInstallReferrerReadListener.id}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.area, onGooglePlayInstallReferrerReadListener.area}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startedAt, onGooglePlayInstallReferrerReadListener.startedAt}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endedAt, onGooglePlayInstallReferrerReadListener.endedAt}, getCieXyz.write())).booleanValue()) {
                            int i2 = read + 45;
                            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusMultiplier, onGooglePlayInstallReferrerReadListener.bonusMultiplier}, getCieXyz.write())).booleanValue()) {
                            int i4 = read + 41;
                            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusTypes, onGooglePlayInstallReferrerReadListener.bonusTypes}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calendarEnabled, onGooglePlayInstallReferrerReadListener.calendarEnabled}, getCieXyz.write())).booleanValue()) {
                            int i6 = read + 117;
                            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            return i6 % 2 == 0;
                        }
                        if (this.hasShiftMode != onGooglePlayInstallReferrerReadListener.hasShiftMode) {
                            int i7 = RemoteActionCompatParcelizer + 43;
                            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneGeoJson, onGooglePlayInstallReferrerReadListener.zoneGeoJson}, getCieXyz.write())).booleanValue();
                    }
                    int i9 = RemoteActionCompatParcelizer + 57;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return false;
                }
                int i11 = read + 13;
                RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return false;
            }
            int i13 = read + 13;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return false;
        }
        int i15 = RemoteActionCompatParcelizer + 71;
        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return true;
    }
}
