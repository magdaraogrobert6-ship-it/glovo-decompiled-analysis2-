package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.calendar.data.BonusLevel;
import com.roadrunner.opportunities.calendar.data.BonusMultiplierItemResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.u2;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class u1 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final BonusMultiplierItemResponse$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.calendar.data.BonusMultiplierItemResponse$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 3;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            u2 u2Var = u2.IconCompatParcelizer;
            int i4 = read + 125;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return u2Var;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final BonusLevel bonusLevel;
    public final List bonusTypes;
    public final String endTime;
    public final String multiplier;
    public final String startTime;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.calendar.data.BonusMultiplierItemResponse$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(10)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(11))};
        int i = write + 107;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ u1(int i, String str, String str2, String str3, List list, BonusLevel bonusLevel) {
        if (23 == (i & 23)) {
            this.startTime = str;
            this.endTime = str2;
            this.multiplier = str3;
            if ((i & 8) == 0) {
                this.bonusTypes = null;
                int i2 = RemoteActionCompatParcelizer + 95;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.bonusTypes = list;
            }
            this.bonusLevel = bonusLevel;
            int i5 = RemoteActionCompatParcelizer + 13;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 23, u2.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BonusMultiplierItemResponse(startTime=", this.startTime, ", endTime=", this.endTime, ", multiplier=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.multiplier, ", bonusTypes=", this.bonusTypes, ", bonusLevel=");
        sbM.append(this.bonusLevel);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.startTime.hashCode() * 31, 31, this.endTime), 31, this.multiplier);
        List list = this.bonusTypes;
        if (list == null) {
            int i4 = RemoteActionCompatParcelizer + 7;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
            int i6 = read + 37;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int iHashCode2 = this.bonusLevel.hashCode() + ((iM + iHashCode) * 31);
        int i8 = read + 55;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        Object[] objArr = {this.startTime, u1Var.startTime};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.endTime, u1Var.endTime};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                int i2 = RemoteActionCompatParcelizer + 29;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            Object[] objArr3 = {this.multiplier, u1Var.multiplier};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr4 = {this.bonusTypes, u1Var.bonusTypes};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                if (this.bonusLevel == u1Var.bonusLevel) {
                    return true;
                }
                int i3 = read + 81;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = RemoteActionCompatParcelizer + 45;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 81;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
