package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.rider.safety.report.data.entity.SafetyReportResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AdjustAttribution;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setAdRevenueNetwork {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String lastUpdated;
    public final List recommendations;
    public final getAdRevenueUnit scores;
    public final String startDate;
    public static final SafetyReportResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.report.data.entity.SafetyReportResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 79;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AdjustAttribution adjustAttribution = AdjustAttribution.RemoteActionCompatParcelizer;
            int i4 = read + 117;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return adjustAttribution;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.report.data.entity.SafetyReportResponse$Companion] */
    static {
        int i = serializer + 31;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public /* synthetic */ setAdRevenueNetwork(int i, String str, String str2, getAdRevenueUnit getadrevenueunit, List list) {
        if (13 == (i & 13)) {
            this.startDate = str;
            if ((i & 2) == 0) {
                this.lastUpdated = null;
                int i2 = RemoteActionCompatParcelizer + 29;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 3;
                } else {
                    int i4 = 2 % 2;
                }
            } else {
                this.lastUpdated = str2;
                int i5 = read + 7;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            }
            this.scores = getadrevenueunit;
            this.recommendations = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, AdjustAttribution.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 95;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = this.startDate.hashCode();
        String str = this.lastUpdated;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = read + 95;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return this.recommendations.hashCode() + ((this.scores.hashCode() + (((iHashCode * 31) + i) * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SafetyReportResponse(startDate=", this.startDate, ", lastUpdated=", this.lastUpdated, ", scores=");
        sbM.append(this.scores);
        sbM.append(", recommendations=");
        sbM.append(this.recommendations);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 73;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 85;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 81;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof setAdRevenueNetwork)) {
            return false;
        }
        setAdRevenueNetwork setadrevenuenetwork = (setAdRevenueNetwork) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startDate, setadrevenuenetwork.startDate}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lastUpdated, setadrevenuenetwork.lastUpdated}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scores, setadrevenuenetwork.scores}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 111;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.recommendations, setadrevenuenetwork.recommendations}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = RemoteActionCompatParcelizer + 37;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}
