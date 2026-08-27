package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class OffsetMappingCompanion {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final boolean IconCompatParcelizer;
    public final String RatingCompat;
    public final NullableInputConnectionWrapperApi34 RemoteActionCompatParcelizer;
    public final boolean read;
    public final Map serializer;
    public final showSoftInput write;

    public OffsetMappingCompanion(String str, showSoftInput showsoftinput, boolean z, Map map, NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi34, boolean z2) {
        this.RatingCompat = str;
        this.write = showsoftinput;
        this.IconCompatParcelizer = z;
        this.serializer = map;
        this.RemoteActionCompatParcelizer = nullableInputConnectionWrapperApi34;
        this.read = z2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.RatingCompat.hashCode();
        showSoftInput showsoftinput = this.write;
        if (showsoftinput == null) {
            int i2 = MediaSessionCompatQueueItem + 113;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = showsoftinput.hashCode();
        }
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(d$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.IconCompatParcelizer), this.serializer, 31);
        NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi34 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = Boolean.hashCode(this.read) + ((iRemoteActionCompatParcelizer + (nullableInputConnectionWrapperApi34 != null ? nullableInputConnectionWrapperApi34.hashCode() : 0)) * 31);
        int i3 = MediaSessionCompatQueueItem + 23;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode3;
    }

    public static OffsetMappingCompanion read(OffsetMappingCompanion offsetMappingCompanion, String str, showSoftInput showsoftinput, boolean z, Map map, NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi34, boolean z2, int i) {
        showSoftInput showsoftinput2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = offsetMappingCompanion.RatingCompat;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            int i3 = MediaBrowserCompatMediaItem + 33;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                showsoftinput2 = offsetMappingCompanion.write;
                int i4 = 49 / 0;
            } else {
                showsoftinput2 = offsetMappingCompanion.write;
            }
            showsoftinput = showsoftinput2;
        }
        showSoftInput showsoftinput3 = showsoftinput;
        if ((i & 4) != 0) {
            int i5 = MediaSessionCompatQueueItem + 59;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                z = offsetMappingCompanion.IconCompatParcelizer;
                int i6 = 79 / 0;
            } else {
                z = offsetMappingCompanion.IconCompatParcelizer;
            }
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            map = offsetMappingCompanion.serializer;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            nullableInputConnectionWrapperApi34 = offsetMappingCompanion.RemoteActionCompatParcelizer;
        }
        NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi35 = nullableInputConnectionWrapperApi34;
        if ((i & 32) != 0) {
            z2 = offsetMappingCompanion.read;
            int i7 = MediaBrowserCompatMediaItem + 91;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        offsetMappingCompanion.getClass();
        str2.getClass();
        OffsetMappingCompanion offsetMappingCompanion2 = new OffsetMappingCompanion(str2, showsoftinput3, z3, map2, nullableInputConnectionWrapperApi35, z2);
        int i9 = MediaSessionCompatQueueItem + 9;
        MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return offsetMappingCompanion2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetMappingCompanion)) {
            return false;
        }
        OffsetMappingCompanion offsetMappingCompanion = (OffsetMappingCompanion) obj;
        if (this.RatingCompat.equals(offsetMappingCompanion.RatingCompat)) {
            if (this.write != offsetMappingCompanion.write || this.IconCompatParcelizer != offsetMappingCompanion.IconCompatParcelizer || !this.serializer.equals(offsetMappingCompanion.serializer)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, offsetMappingCompanion.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.read == offsetMappingCompanion.read;
        }
        int i4 = MediaSessionCompatQueueItem + 33;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        int i5 = 2 % 3;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GalleryClientData(visibleImageId=" + this.RatingCompat + ", detailsExpanded=" + this.write + ", imageExpanded=" + this.IconCompatParcelizer + ", clientImageUpdates=" + this.serializer + ", activeReport=" + this.RemoteActionCompatParcelizer + ", isReportSubmitting=" + this.read + ")";
        int i2 = MediaSessionCompatQueueItem + 17;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
