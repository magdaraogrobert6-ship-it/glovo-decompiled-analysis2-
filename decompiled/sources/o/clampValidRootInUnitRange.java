package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class clampValidRootInUnitRange {
    public final LinkedHashSet IconCompatParcelizer;
    public final computeHorizontalBounds read = new computeHorizontalBounds();
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 serializer;
    public final LinkedHashSet write;

    public final void serializer(computeCubicVerticalBounds computecubicverticalbounds, composeColorSpaceui_graphics composecolorspaceui_graphics) {
        computeHorizontalBounds computehorizontalbounds = this.read;
        computehorizontalbounds.getClass();
        if (computehorizontalbounds.MediaSessionCompatQueueItem != 0) {
            return;
        }
        createBitmapx__hDUui_graphics createbitmapx__hduui_graphics = computehorizontalbounds.read(-1);
        computehorizontalbounds.MediaMetadataCompat = createbitmapx__hduui_graphics;
        computehorizontalbounds.MediaSessionCompatQueueItem = -1;
        computehorizontalbounds.PlaybackStateCompatCustomAction = computecubicverticalbounds;
        if (composecolorspaceui_graphics != null) {
            if (createbitmapx__hduui_graphics != null) {
                createbitmapx__hduui_graphics.serializer(composecolorspaceui_graphics);
            }
            computehorizontalbounds.IconCompatParcelizer.IconCompatParcelizer(new cubicToMonotonicCubics(composecolorspaceui_graphics));
        }
    }

    public clampValidRootInUnitRange(OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
        this.serializer = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        new LinkedHashSet();
        this.write = new LinkedHashSet();
        this.IconCompatParcelizer = new LinkedHashSet();
    }

    public static void serializer(clampValidRootInUnitRange clampvalidrootinunitrange, createBitmapx__hDUui_graphics createbitmapx__hduui_graphics) {
        clampvalidrootinunitrange.getClass();
        createbitmapx__hduui_graphics.getClass();
        if (clampvalidrootinunitrange.write.add(createbitmapx__hduui_graphics)) {
            computeHorizontalBounds computehorizontalbounds = clampvalidrootinunitrange.read;
            computehorizontalbounds.getClass();
            if (createbitmapx__hduui_graphics.RemoteActionCompatParcelizer != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Handler '", createbitmapx__hduui_graphics, "' is already registered with a dispatcher");
                return;
            }
            computehorizontalbounds.RemoteActionCompatParcelizer.addFirst(createbitmapx__hduui_graphics);
            createbitmapx__hduui_graphics.RemoteActionCompatParcelizer = clampvalidrootinunitrange;
            computehorizontalbounds.read();
        }
    }

    public final void write(cubicArea cubicarea, int i) {
        if (i != 1 && i != 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Unsupported priority value: "));
        } else if (this.IconCompatParcelizer.add(cubicarea)) {
            this.read.IconCompatParcelizer(this, cubicarea, i);
        }
    }

    public final void write(computeCubicVerticalBounds computecubicverticalbounds) {
        if (this.IconCompatParcelizer.add(computecubicverticalbounds)) {
            this.read.IconCompatParcelizer(this, computecubicverticalbounds, -1);
        }
    }
}
