package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetKtModalBottomSheetsettleToDismiss111 extends UrlUtils {
    public final FloatingActionButtonElevationAnimatable IconCompatParcelizer;

    @Override // io.sentry.util.UrlUtils
    public final int write(int i, int i2, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int i3) {
        int i4 = placeable.get(this.IconCompatParcelizer.read);
        if (i4 == Integer.MIN_VALUE) {
            return 0;
        }
        int i5 = i3 - i4;
        return layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl ? (i - i2) - i5 : i5;
    }

    @Override // io.sentry.util.UrlUtils
    public final Integer write(androidx.compose.ui.layout.Placeable placeable) {
        return Integer.valueOf(placeable.get(this.IconCompatParcelizer.read));
    }

    public ModalBottomSheetKtModalBottomSheetsettleToDismiss111(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable) {
        this.IconCompatParcelizer = floatingActionButtonElevationAnimatable;
    }
}
