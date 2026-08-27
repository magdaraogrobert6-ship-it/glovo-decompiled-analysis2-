package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.CurrentSessionData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.onActivityStopped;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FlowLiveDataConversionsasFlow11 {
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String area;
    public final String bonusMultiplier;
    public final List bonusTypes;
    public final Boolean calendarEnabled;
    public final String shiftEndedAt;
    public final String subtitle;
    public final String title;
    public final Integer zoneId;
    public final String zoneName;
    public static final CurrentSessionData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.CurrentSessionData$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 99;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return onActivityStopped.read;
            }
            onActivityStopped onactivitystopped = onActivityStopped.read;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(2)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.CurrentSessionData$Companion] */
    static {
        int i = write + 125;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ FlowLiveDataConversionsasFlow11(int i, String str, String str2, String str3, String str4, Integer num, String str5, String str6, List list, Boolean bool) {
        Object obj = null;
        if (7 != (i & 7)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, onActivityStopped.read.getDescriptor());
            throw null;
        }
        this.title = str;
        this.subtitle = str2;
        this.area = str3;
        if ((i & 8) == 0) {
            this.shiftEndedAt = null;
        } else {
            this.shiftEndedAt = str4;
            int i2 = 2 % 2;
        }
        if ((i & 16) == 0) {
            int i3 = IconCompatParcelizer + 125;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                this.zoneId = null;
                obj.hashCode();
                throw null;
            }
            this.zoneId = null;
        } else {
            this.zoneId = num;
        }
        if ((i & 32) == 0) {
            int i4 = serializer + 99;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.zoneName = null;
            int i6 = 2 % 2;
        } else {
            this.zoneName = str5;
        }
        if ((i & 64) == 0) {
            this.bonusMultiplier = null;
        } else {
            this.bonusMultiplier = str6;
            int i7 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i8 = IconCompatParcelizer + 45;
            int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i9;
            int i10 = i8 % 2;
            this.bonusTypes = null;
            int i11 = i9 + 29;
            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        } else {
            this.bonusTypes = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.calendarEnabled = null;
        } else {
            this.calendarEnabled = bool;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CurrentSessionData(title=", this.title, ", subtitle=", this.subtitle, ", area=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.area, ", shiftEndedAt=", this.shiftEndedAt, ", zoneId=");
        sbM.append(this.zoneId);
        sbM.append(", zoneName=");
        sbM.append(this.zoneName);
        sbM.append(", bonusMultiplier=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.bonusMultiplier, ", bonusTypes=", this.bonusTypes, ", calendarEnabled=");
        String strM = c8$$ExternalSyntheticOutline0.m(sbM, ")", this.calendarEnabled);
        int i4 = IconCompatParcelizer + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.area);
        String str = this.shiftEndedAt;
        if (str == null) {
            int i4 = IconCompatParcelizer + 101;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num = this.zoneId;
        if (num == null) {
            int i6 = IconCompatParcelizer;
            int i7 = i6 + 11;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 93;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        String str2 = this.zoneName;
        if (str2 == null) {
            int i11 = IconCompatParcelizer + 111;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.bonusMultiplier;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        List list = this.bonusTypes;
        if (list == null) {
            int i13 = serializer + 13;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode4 = i13 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode4 = list.hashCode();
        }
        Boolean bool = this.calendarEnabled;
        return ((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer;
            int i3 = i2 + 39;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof FlowLiveDataConversionsasFlow11)) {
            return false;
        }
        FlowLiveDataConversionsasFlow11 flowLiveDataConversionsasFlow11 = (FlowLiveDataConversionsasFlow11) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, flowLiveDataConversionsasFlow11.title}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 49;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, flowLiveDataConversionsasFlow11.subtitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.area, flowLiveDataConversionsasFlow11.area}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shiftEndedAt, flowLiveDataConversionsasFlow11.shiftEndedAt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneId, flowLiveDataConversionsasFlow11.zoneId}, getCieXyz.write())).booleanValue()) {
            int i8 = IconCompatParcelizer + 85;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneName, flowLiveDataConversionsasFlow11.zoneName}, getCieXyz.write())).booleanValue()) {
            int i10 = IconCompatParcelizer + 89;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusMultiplier, flowLiveDataConversionsasFlow11.bonusMultiplier}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusTypes, flowLiveDataConversionsasFlow11.bonusTypes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calendarEnabled, flowLiveDataConversionsasFlow11.calendarEnabled}, getCieXyz.write())).booleanValue();
    }
}
