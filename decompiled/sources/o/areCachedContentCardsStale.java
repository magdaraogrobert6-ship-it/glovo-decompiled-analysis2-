package o;

import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class areCachedContentCardsStale {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Calendar RemoteActionCompatParcelizer;
    public final ReviewState read;
    public final long serializer;

    public areCachedContentCardsStale(long j, ReviewState reviewState, Calendar calendar) {
        reviewState.getClass();
        this.serializer = j;
        this.read = reviewState;
        this.RemoteActionCompatParcelizer = calendar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.serializer);
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode() + ((this.read.hashCode() + (iHashCode * 31)) * 31);
        int i4 = write + 49;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 107;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof areCachedContentCardsStale) {
            areCachedContentCardsStale arecachedcontentcardsstale = (areCachedContentCardsStale) obj;
            return this.serializer == arecachedcontentcardsstale.serializer && this.read == arecachedcontentcardsstale.read && this.RemoteActionCompatParcelizer.equals(arecachedcontentcardsstale.RemoteActionCompatParcelizer);
        }
        int i4 = i2 + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReviewState(deliveryId=" + this.serializer + ", state=" + this.read + ", updatedAt=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
