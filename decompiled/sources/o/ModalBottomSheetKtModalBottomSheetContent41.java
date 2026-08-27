package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetKtModalBottomSheetContent41 extends UrlUtils {
    public final androidx.compose.ui.Alignment.Horizontal RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // io.sentry.util.UrlUtils
    public final int write(int i, int i2, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int i3) {
        return this.RemoteActionCompatParcelizer.align(i2, i, layoutDirection);
    }

    public ModalBottomSheetKtModalBottomSheetContent41(androidx.compose.ui.Alignment.Horizontal horizontal) {
        this.RemoteActionCompatParcelizer = horizontal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetKtModalBottomSheetContent41)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((ModalBottomSheetKtModalBottomSheetContent41) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.RemoteActionCompatParcelizer + ')';
    }
}
