package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Data$Companion;
import kotlinx.serialization.Serializable;
import o.findGroupsThatMatchPredicate;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PreviewUtils_androidKt {
    public static final SoftPosDeeplinkResponse$Data$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Data$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                findGroupsThatMatchPredicate findgroupsthatmatchpredicate = findGroupsThatMatchPredicate.write;
                throw null;
            }
            findGroupsThatMatchPredicate findgroupsthatmatchpredicate2 = findGroupsThatMatchPredicate.write;
            int i3 = serializer + 123;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 76 / 0;
            }
            return findgroupsthatmatchpredicate2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String deeplink;
    public final findGroupsThatMatchPredicatedefault testingData;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Data$Companion] */
    static {
        int i = write + 51;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ PreviewUtils_androidKt(int i, String str, findGroupsThatMatchPredicatedefault findgroupsthatmatchpredicatedefault) {
        if (1 == (i & 1)) {
            this.deeplink = str;
            if ((i & 2) == 0) {
                this.testingData = null;
                int i2 = read + 71;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.testingData = findgroupsthatmatchpredicatedefault;
            int i4 = read + 31;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, findGroupsThatMatchPredicate.write.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r1 r3
  0x0028: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v2 o.findGroupsThatMatchPredicatedefault) = (r3v0 o.findGroupsThatMatchPredicatedefault), (r3v3 o.findGroupsThatMatchPredicatedefault) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        findGroupsThatMatchPredicatedefault findgroupsthatmatchpredicatedefault;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.deeplink.hashCode();
            findgroupsthatmatchpredicatedefault = this.testingData;
            int i3 = 85 / 0;
            if (findgroupsthatmatchpredicatedefault != null) {
                iHashCode2 = findgroupsthatmatchpredicatedefault.hashCode();
            }
        } else {
            iHashCode = this.deeplink.hashCode();
            findgroupsthatmatchpredicatedefault = this.testingData;
            if (findgroupsthatmatchpredicatedefault != null) {
                iHashCode2 = findgroupsthatmatchpredicatedefault.hashCode();
            }
        }
        int i4 = (iHashCode * 31) + iHashCode2;
        int i5 = IconCompatParcelizer + 69;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Data(deeplink=" + this.deeplink + ", testingData=" + this.testingData + ")";
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreviewUtils_androidKt) {
            PreviewUtils_androidKt previewUtils_androidKt = (PreviewUtils_androidKt) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deeplink, previewUtils_androidKt.deeplink}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.testingData, previewUtils_androidKt.testingData}, getCieXyz.write())).booleanValue();
            }
            int i2 = read + 89;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 15 / 0;
            }
            return false;
        }
        int i4 = read + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
