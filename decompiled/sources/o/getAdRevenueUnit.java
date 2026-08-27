package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.safety.report.data.entity.RemoteSafetyScores$Companion;
import kotlinx.serialization.Serializable;
import o.isValid;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getAdRevenueUnit {
    public static final RemoteSafetyScores$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.report.data.entity.RemoteSafetyScores$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 23;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            isValid isvalid = isValid.read;
            int i4 = serializer + 37;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return isvalid;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final setAdImpressionsCount attention;
    public final setAdImpressionsCount braking;
    public final setAdImpressionsCount overall;
    public final setAdImpressionsCount speed;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.report.data.entity.RemoteSafetyScores$Companion] */
    static {
        int i = serializer + 27;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    public /* synthetic */ getAdRevenueUnit(int i, setAdImpressionsCount setadimpressionscount, setAdImpressionsCount setadimpressionscount2, setAdImpressionsCount setadimpressionscount3, setAdImpressionsCount setadimpressionscount4) {
        if (15 == (i & 15)) {
            this.overall = setadimpressionscount;
            this.speed = setadimpressionscount2;
            this.braking = setadimpressionscount3;
            this.attention = setadimpressionscount4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, isValid.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.overall.hashCode();
        int iHashCode2 = this.speed.hashCode();
        int iHashCode3 = this.attention.hashCode() + ((this.braking.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = RemoteActionCompatParcelizer + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RemoteSafetyScores(overall=" + this.overall + ", speed=" + this.speed + ", braking=" + this.braking + ", attention=" + this.attention + ")";
        int i2 = RemoteActionCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAdRevenueUnit)) {
            return false;
        }
        getAdRevenueUnit getadrevenueunit = (getAdRevenueUnit) obj;
        Object[] objArr = {this.overall, getadrevenueunit.overall};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.speed, getadrevenueunit.speed};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                int i2 = RemoteActionCompatParcelizer + 5;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            Object[] objArr3 = {this.braking, getadrevenueunit.braking};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr4 = {this.attention, getadrevenueunit.attention};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = write + 41;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i5 = RemoteActionCompatParcelizer + 117;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
