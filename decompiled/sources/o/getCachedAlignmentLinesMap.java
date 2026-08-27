package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class getCachedAlignmentLinesMap {
    public static final getLookaheadLayoutCoordinates read = new getLookaheadLayoutCoordinates();
    public final updatePlacedUnderMotionFrameOfReference IconCompatParcelizer;
    public final AtomicReference RemoteActionCompatParcelizer = new AtomicReference(null);

    public final boolean IconCompatParcelizer() {
        getCachedAlignmentLinesMap getcachedalignmentlinesmap = (getCachedAlignmentLinesMap) this.RemoteActionCompatParcelizer.get();
        return getcachedalignmentlinesmap != null && getcachedalignmentlinesmap.IconCompatParcelizer();
    }

    public final boolean RemoteActionCompatParcelizer() {
        getCachedAlignmentLinesMap getcachedalignmentlinesmap = (getCachedAlignmentLinesMap) this.RemoteActionCompatParcelizer.get();
        return getcachedalignmentlinesmap != null && getcachedalignmentlinesmap.RemoteActionCompatParcelizer();
    }

    public final getLookaheadLayoutCoordinates read() {
        getCachedAlignmentLinesMap getcachedalignmentlinesmap = (getCachedAlignmentLinesMap) this.RemoteActionCompatParcelizer.get();
        return getcachedalignmentlinesmap == null ? read : getcachedalignmentlinesmap.read();
    }

    public getCachedAlignmentLinesMap(updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreference) {
        this.IconCompatParcelizer = updateplacedundermotionframeofreference;
        updateplacedundermotionframeofreference.IconCompatParcelizer(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(22, this));
    }
}
