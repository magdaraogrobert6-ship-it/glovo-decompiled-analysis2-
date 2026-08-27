package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class shrinkKibmq7A extends View {
    public clickableXHw0xAIdefault IconCompatParcelizer;
    public Window read;
    public TransitionState serializer;

    public setTitleMarginBottom getScreenFlash() {
        return this.IconCompatParcelizer;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(TransitionState transitionState) {
        PrematureEndOfStreamVideoQuirk.write();
        TransitionState transitionState2 = this.serializer;
        if (transitionState2 != null && transitionState2 != transitionState) {
            setScreenFlashUiInfo(null);
        }
        this.serializer = transitionState;
        if (transitionState == null) {
            return;
        }
        PrematureEndOfStreamVideoQuirk.write();
        if (transitionState.PlaybackStateCompat.read() == 3 && this.read == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        } else {
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.read == null) {
            setInflatedId.serializer("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            setInflatedId.serializer("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.read.getAttributes();
        attributes.screenBrightness = f;
        this.read.setAttributes(attributes);
        setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
    }

    public void setScreenFlashWindow(Window window) {
        PrematureEndOfStreamVideoQuirk.write();
        setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
        if (this.read != window) {
            this.IconCompatParcelizer = window == null ? null : new clickableXHw0xAIdefault(this);
        }
        this.read = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    private void setScreenFlashUiInfo(setTitleMarginBottom settitlemarginbottom) {
        TransitionState transitionState = this.serializer;
        if (transitionState == null) {
            setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
            return;
        }
        applySemantics applysemantics = applySemantics.SCREEN_FLASH_VIEW;
        FocusableNode focusableNode = new FocusableNode(applysemantics, settitlemarginbottom);
        FocusableNode focusableNode2 = transitionState.read();
        transitionState.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.put(applysemantics, focusableNode);
        FocusableNode focusableNode3 = transitionState.read();
        if (focusableNode3 == null || focusableNode3.equals(focusableNode2)) {
            return;
        }
        transitionState.MediaSessionCompatQueueItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.read;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        setInflatedId.serializer("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    public shrinkKibmq7A(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
