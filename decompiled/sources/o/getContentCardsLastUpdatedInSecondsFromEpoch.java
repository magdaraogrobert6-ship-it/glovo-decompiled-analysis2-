package o;

import com.roadrunner.vendor.review.data.entity.VendorReviewConfigResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getContentCardsLastUpdatedInSecondsFromEpoch {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final VendorReviewConfigResponse$Companion Companion = new VendorReviewConfigResponse$Companion();
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final List scores;
    public final List tags;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new subscribeToFeatureFlagsUpdateslambda1(11)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new subscribeToFeatureFlagsUpdateslambda1(12))};
        int i = serializer + 57;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }

    public /* synthetic */ getContentCardsLastUpdatedInSecondsFromEpoch(List list, List list2, int i) {
        if (3 == (i & 3)) {
            this.scores = list;
            this.tags = list2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getContentCardCount.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.tags.hashCode() + (this.scores.hashCode() * 31);
        int i4 = IconCompatParcelizer + 87;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReviewConfigResponse(scores=" + this.scores + ", tags=" + this.tags + ")";
        int i2 = read + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 1;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getContentCardsLastUpdatedInSecondsFromEpoch)) {
            return false;
        }
        getContentCardsLastUpdatedInSecondsFromEpoch getcontentcardslastupdatedinsecondsfromepoch = (getContentCardsLastUpdatedInSecondsFromEpoch) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scores, getcontentcardslastupdatedinsecondsfromepoch.scores}, getCieXyz.write())).booleanValue())) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, getcontentcardslastupdatedinsecondsfromepoch.tags}, getCieXyz.write())).booleanValue();
        }
        int i7 = read + 95;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
