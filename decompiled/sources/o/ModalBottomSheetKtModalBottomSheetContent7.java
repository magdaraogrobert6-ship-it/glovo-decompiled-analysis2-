package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetKtModalBottomSheetContent7 extends UrlUtils {
    public final androidx.compose.ui.Alignment.Vertical serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // io.sentry.util.UrlUtils
    public final int write(int i, int i2, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int i3) {
        return this.serializer.align(i2, i);
    }

    public ModalBottomSheetKtModalBottomSheetContent7(androidx.compose.ui.Alignment.Vertical vertical) {
        this.serializer = vertical;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetKtModalBottomSheetContent7)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((ModalBottomSheetKtModalBottomSheetContent7) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.serializer + ')';
    }
}
