package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class clipOutRect implements resizeToBitmapDimensionslambda0 {
    private static int RatingCompat = 1;
    private static int serializer;
    public final Integer IconCompatParcelizer;
    public final FocusTargetInteropElement RemoteActionCompatParcelizer;
    public final List read;
    public final TextStyleKt write;

    public clipOutRect(List list, FocusTargetInteropElement focusTargetInteropElement, TextStyleKt textStyleKt, Integer num) {
        this.read = list;
        this.RemoteActionCompatParcelizer = focusTargetInteropElement;
        this.write = textStyleKt;
        this.IconCompatParcelizer = num;
    }

    public static clipOutRect IconCompatParcelizer(clipOutRect clipoutrect, List list, FocusTargetInteropElement focusTargetInteropElement, TextStyleKt textStyleKt, Integer num, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 21;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            list = clipoutrect.read;
        }
        if ((i & 2) != 0) {
            focusTargetInteropElement = clipoutrect.RemoteActionCompatParcelizer;
        }
        if ((i & 4) != 0) {
            textStyleKt = clipoutrect.write;
            int i5 = i4 + 93;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
        }
        if ((i & 8) != 0) {
            int i7 = i4 + 57;
            RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            num = clipoutrect.IconCompatParcelizer;
        }
        clipoutrect.getClass();
        return new clipOutRect(list, focusTargetInteropElement, textStyleKt, num);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        List list = this.read;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        FocusTargetInteropElement focusTargetInteropElement = this.RemoteActionCompatParcelizer;
        if (focusTargetInteropElement == null) {
            int i2 = RatingCompat + 7;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = focusTargetInteropElement.hashCode();
            int i4 = RatingCompat + 123;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        TextStyleKt textStyleKt = this.write;
        if (textStyleKt == null) {
            int i6 = serializer + 29;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = textStyleKt.hashCode();
            int i8 = RatingCompat + 59;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        Integer num = this.IconCompatParcelizer;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LasagnaDeclineBottomSheetViewState(acceptDetails=" + this.read + ", declineDetails=" + this.RemoteActionCompatParcelizer + ", bottomSheetState=" + this.write + ", acceptanceRate=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 43;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof clipOutRect) {
            clipOutRect clipoutrect = (clipOutRect) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, clipoutrect.read}, getCieXyz.write())).booleanValue()) {
                int i2 = RatingCompat + 1;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, clipoutrect.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, clipoutrect.write}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, clipoutrect.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
                }
                return false;
            }
            int i4 = RatingCompat + 121;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return !(i4 % 2 == 0);
        }
        int i5 = RatingCompat + 41;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
