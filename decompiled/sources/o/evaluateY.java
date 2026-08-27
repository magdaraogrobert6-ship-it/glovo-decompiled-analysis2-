package o;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class evaluateY implements OnBackAnimationCallback {
    public final /* synthetic */ cubicArea write;

    public final void onBackCancelled() {
        cubicArea cubicarea = this.write;
        clampValidRootInUnitRange clampvalidrootinunitrange = cubicarea.RemoteActionCompatParcelizer;
        if (clampvalidrootinunitrange == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This input is not added to any dispatcher.");
            return;
        }
        if (!cubicarea.serializer) {
            clampvalidrootinunitrange.serializer(cubicarea, (composeColorSpaceui_graphics) null);
        }
        computeHorizontalBounds computehorizontalbounds = clampvalidrootinunitrange.read;
        computehorizontalbounds.getClass();
        if (cubicarea.equals(computehorizontalbounds.PlaybackStateCompatCustomAction) && -1 == computehorizontalbounds.MediaSessionCompatQueueItem) {
            createBitmapx__hDUui_graphics createbitmapx__hduui_graphics = computehorizontalbounds.MediaMetadataCompat;
            if (createbitmapx__hduui_graphics == null) {
                createbitmapx__hduui_graphics = computehorizontalbounds.read(-1);
            }
            computehorizontalbounds.MediaMetadataCompat = null;
            computehorizontalbounds.MediaSessionCompatQueueItem = 0;
            computehorizontalbounds.PlaybackStateCompatCustomAction = null;
            if (createbitmapx__hduui_graphics != null) {
                createbitmapx__hduui_graphics.write();
            }
            computehorizontalbounds.IconCompatParcelizer.IconCompatParcelizer(closeTo.RemoteActionCompatParcelizer);
        }
        cubicarea.serializer = false;
    }

    public final void onBackInvoked() {
        this.write.read();
    }

    public evaluateY(cubicArea cubicarea) {
        this.write = cubicarea;
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        composeColorSpaceui_graphics composecolorspaceui_graphicsCc_ = computeVerticalBoundsdefault.cc_(backEvent);
        cubicArea cubicarea = this.write;
        clampValidRootInUnitRange clampvalidrootinunitrange = cubicarea.RemoteActionCompatParcelizer;
        if (clampvalidrootinunitrange == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This input is not added to any dispatcher.");
            return;
        }
        if (cubicarea.serializer) {
            computeHorizontalBounds computehorizontalbounds = clampvalidrootinunitrange.read;
            computehorizontalbounds.getClass();
            if (cubicarea.equals(computehorizontalbounds.PlaybackStateCompatCustomAction) && -1 == computehorizontalbounds.MediaSessionCompatQueueItem) {
                createBitmapx__hDUui_graphics createbitmapx__hduui_graphics = computehorizontalbounds.MediaMetadataCompat;
                if (createbitmapx__hduui_graphics == null) {
                    createbitmapx__hduui_graphics = computehorizontalbounds.read(-1);
                }
                if (createbitmapx__hduui_graphics != null) {
                    createbitmapx__hduui_graphics.read(composecolorspaceui_graphicsCc_);
                }
                computehorizontalbounds.IconCompatParcelizer.IconCompatParcelizer(new cubicToMonotonicCubics(composecolorspaceui_graphicsCc_));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        composeColorSpaceui_graphics composecolorspaceui_graphicsCc_ = computeVerticalBoundsdefault.cc_(backEvent);
        cubicArea cubicarea = this.write;
        clampValidRootInUnitRange clampvalidrootinunitrange = cubicarea.RemoteActionCompatParcelizer;
        if (clampvalidrootinunitrange == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This input is not added to any dispatcher.");
        } else {
            if (cubicarea.serializer) {
                return;
            }
            clampvalidrootinunitrange.serializer(cubicarea, composecolorspaceui_graphicsCc_);
            cubicarea.serializer = true;
        }
    }
}
