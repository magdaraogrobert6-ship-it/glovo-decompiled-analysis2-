package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class OutlinedTextFieldLayout {
    public androidx.compose.ui.layout.Placeable IconCompatParcelizer;
    public final OutlinedTextField MediaMetadataCompat;
    public ScrollStateExternalSyntheticLambda3 RatingCompat;
    public androidx.compose.ui.layout.Measurable RemoteActionCompatParcelizer;
    public androidx.compose.ui.layout.Placeable read;
    public androidx.compose.ui.layout.Measurable serializer;
    public ScrollStateExternalSyntheticLambda3 write;

    public final int hashCode() {
        return Integer.hashCode(0) + af$$ExternalSyntheticOutline0.m(0, this.MediaMetadataCompat.hashCode() * 31, 31);
    }

    public final ScrollStateExternalSyntheticLambda3 serializer(int i, int i2, boolean z) {
        int i3 = OutlinedTextFieldMeasurePolicy.read[this.MediaMetadataCompat.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                if (z) {
                    return this.RatingCompat;
                }
                if (i + 1 >= 0 && i2 >= 0) {
                    return this.write;
                }
            } else if (z) {
                return this.RatingCompat;
            }
        }
        return null;
    }

    public final void write(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2, long j) {
        long jWrite = calculateInSampleSizelambda1.write(j, SnackbarHostKt.Horizontal);
        if (intrinsicMeasurable != null) {
            int iM3625getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(jWrite);
            int i = androidx.compose.foundation.layout.FlowLayoutKt.RemoteActionCompatParcelizer;
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(iM3625getMaxHeightimpl);
            this.RatingCompat = new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(iMinIntrinsicWidth, intrinsicMeasurable.minIntrinsicHeight(iMinIntrinsicWidth)));
            this.RemoteActionCompatParcelizer = intrinsicMeasurable instanceof androidx.compose.ui.layout.Measurable ? (androidx.compose.ui.layout.Measurable) intrinsicMeasurable : null;
            this.read = null;
        }
        if (intrinsicMeasurable2 != null) {
            int iM3625getMaxHeightimpl2 = androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(jWrite);
            int i2 = androidx.compose.foundation.layout.FlowLayoutKt.RemoteActionCompatParcelizer;
            int iMinIntrinsicWidth2 = intrinsicMeasurable2.minIntrinsicWidth(iM3625getMaxHeightimpl2);
            this.write = new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(iMinIntrinsicWidth2, intrinsicMeasurable2.minIntrinsicHeight(iMinIntrinsicWidth2)));
            this.serializer = intrinsicMeasurable2 instanceof androidx.compose.ui.layout.Measurable ? (androidx.compose.ui.layout.Measurable) intrinsicMeasurable2 : null;
            this.IconCompatParcelizer = null;
        }
    }

    public OutlinedTextFieldLayout(OutlinedTextField outlinedTextField) {
        this.MediaMetadataCompat = outlinedTextField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutlinedTextFieldLayout) && this.MediaMetadataCompat == ((OutlinedTextFieldLayout) obj).MediaMetadataCompat;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.MediaMetadataCompat + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
