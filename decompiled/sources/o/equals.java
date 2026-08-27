package o;

import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class equals {
    public static final CardView$1 IconCompatParcelizer = getPositionInRoot.serializer(new ScrollState$$ExternalSyntheticLambda3(4), new UiMediaScopeViewingDistance(2));
    public final populate RemoteActionCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 read;
    public final populate write = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
    public final getPlatformAndroidManager MediaSessionCompatQueueItem = androidx.compose.runtime.CompositionKt.read(0);
    public androidx.compose.ui.geometry.Rect serializer = androidx.compose.ui.geometry.Rect.Companion.getZero();
    public long RatingCompat = androidx.compose.ui.text.TextRange.Companion.m3081getZerod9O1mEE();

    public final float serializer() {
        return ((getContentCaptureSessionui) this.RemoteActionCompatParcelizer).serializer();
    }

    public final void serializer(SelectionHandleIcon selectionHandleIcon, androidx.compose.ui.geometry.Rect rect, int i, int i2) {
        float f;
        float f2 = i2 - i;
        ((getContentCaptureSessionui) this.write).IconCompatParcelizer(f2);
        float left = rect.getLeft();
        float left2 = this.serializer.getLeft();
        populate populateVar = this.RemoteActionCompatParcelizer;
        if (left != left2 || rect.getTop() != this.serializer.getTop()) {
            boolean z = selectionHandleIcon == SelectionHandleIcon.Vertical;
            float top = z ? rect.getTop() : rect.getLeft();
            float bottom = z ? rect.getBottom() : rect.getRight();
            float fSerializer = serializer();
            float f3 = i;
            float f4 = fSerializer + f3;
            if (bottom <= f4 && (top >= fSerializer || bottom - top <= f3)) {
                f = (top >= fSerializer || bottom - top > f3) ? 0.0f : top - fSerializer;
            } else {
                f = bottom - f4;
            }
            ((getContentCaptureSessionui) populateVar).IconCompatParcelizer(serializer() + f);
            this.serializer = rect;
        }
        ((getContentCaptureSessionui) populateVar).IconCompatParcelizer(RangesKt.write(serializer(), 0.0f, f2));
        ((onHideTranslationui) this.MediaSessionCompatQueueItem).serializer(i);
    }

    public equals(SelectionHandleIcon selectionHandleIcon, float f) {
        this.RemoteActionCompatParcelizer = getPersonFullName.RemoteActionCompatParcelizer(f);
        this.read = androidx.compose.runtime.CompositionKt.serializer(selectionHandleIcon, AndroidContentCaptureManager.write);
    }
}
