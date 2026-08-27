package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class computeCubicVerticalBounds {
    public clampValidRootInUnitRange RemoteActionCompatParcelizer;
    public boolean serializer;

    public void serializer(boolean z) {
    }

    public final void read() {
        clampValidRootInUnitRange clampvalidrootinunitrange = this.RemoteActionCompatParcelizer;
        if (clampvalidrootinunitrange == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This input is not added to any dispatcher.");
            return;
        }
        if (!this.serializer) {
            clampvalidrootinunitrange.serializer(this, (composeColorSpaceui_graphics) null);
        }
        computeHorizontalBounds computehorizontalbounds = clampvalidrootinunitrange.read;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = clampvalidrootinunitrange.serializer;
        computehorizontalbounds.getClass();
        if (equals(computehorizontalbounds.PlaybackStateCompatCustomAction) && -1 == computehorizontalbounds.MediaSessionCompatQueueItem) {
            createBitmapx__hDUui_graphics createbitmapx__hduui_graphics = computehorizontalbounds.MediaMetadataCompat;
            if (createbitmapx__hduui_graphics == null) {
                createbitmapx__hduui_graphics = computehorizontalbounds.read(-1);
            }
            computehorizontalbounds.MediaMetadataCompat = null;
            computehorizontalbounds.MediaSessionCompatQueueItem = 0;
            computehorizontalbounds.PlaybackStateCompatCustomAction = null;
            if (createbitmapx__hduui_graphics == null) {
                Runnable runnable = ((defaultViewModelProviderFactory_delegatelambda0) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.serializer).RemoteActionCompatParcelizer;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                createbitmapx__hduui_graphics.read();
            }
            computehorizontalbounds.IconCompatParcelizer.IconCompatParcelizer(closeTo.RemoteActionCompatParcelizer);
        }
        this.serializer = false;
    }
}
