package o;

import com.roadrunner.instant.shifts.presentation.BookShiftConfirmationResult;

/* JADX INFO: loaded from: classes3.dex */
public final class EntityInsertionAdapter extends StaggeredGridLayoutManagerSavedState1 {
    private static int read = 0;
    private static int write = 1;
    public final BookShiftConfirmationResult IconCompatParcelizer;

    public EntityInsertionAdapter(BookShiftConfirmationResult bookShiftConfirmationResult) {
        this.IconCompatParcelizer = bookShiftConfirmationResult;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = write + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BookingFlowCompleted(result=" + this.IconCompatParcelizer + ")";
        int i2 = write + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 1;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else if (!(obj instanceof EntityInsertionAdapter) || !this.IconCompatParcelizer.equals(((EntityInsertionAdapter) obj).IconCompatParcelizer)) {
            return false;
        }
        return true;
    }
}
