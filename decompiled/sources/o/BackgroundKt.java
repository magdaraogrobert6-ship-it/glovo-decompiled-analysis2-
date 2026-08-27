package o;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public abstract class BackgroundKt {
    public final FrameLayout IconCompatParcelizer;
    public final applyToFlingBMRW4eQ RemoteActionCompatParcelizer;
    public boolean read = false;
    public android.util.Size serializer;

    public abstract void IconCompatParcelizer();

    public abstract DrawModifierNodeKt MediaBrowserCompatMediaItem();

    public abstract Bitmap RemoteActionCompatParcelizer();

    public abstract void serializer();

    public abstract void serializer(androidx.camera.core.SurfaceRequest surfaceRequest, PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2);

    public abstract View write();

    public BackgroundKt(FrameLayout frameLayout, applyToFlingBMRW4eQ applytoflingbmrw4eq) {
        this.IconCompatParcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = applytoflingbmrw4eq;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    public final void read() {
        boolean z;
        View viewWrite = write();
        if (viewWrite == null || !this.read) {
            return;
        }
        FrameLayout frameLayout = this.IconCompatParcelizer;
        android.util.Size size = new android.util.Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        applyToFlingBMRW4eQ applytoflingbmrw4eq = this.RemoteActionCompatParcelizer;
        applytoflingbmrw4eq.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            setInflatedId.read("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (applytoflingbmrw4eq.RemoteActionCompatParcelizer()) {
            if (viewWrite instanceof TextureView) {
                ((TextureView) viewWrite).setTransform(applytoflingbmrw4eq.write());
            } else {
                Display display = viewWrite.getDisplay();
                boolean z2 = (!applytoflingbmrw4eq.RemoteActionCompatParcelizer || display == null || display.getRotation() == applytoflingbmrw4eq.MediaMetadataCompat) ? false : true;
                boolean z3 = applytoflingbmrw4eq.RemoteActionCompatParcelizer;
                if (!z3) {
                    z = (!z3 ? applytoflingbmrw4eq.serializer : -copyWithMergingEnabledui.serializer(applytoflingbmrw4eq.MediaMetadataCompat)) != 0;
                }
                if (z2 || z) {
                    setInflatedId.serializer("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectF = applytoflingbmrw4eq.read(size, layoutDirection);
            viewWrite.setPivotX(0.0f);
            viewWrite.setPivotY(0.0f);
            viewWrite.setScaleX(rectF.width() / applytoflingbmrw4eq.IconCompatParcelizer.getWidth());
            viewWrite.setScaleY(rectF.height() / applytoflingbmrw4eq.IconCompatParcelizer.getHeight());
            viewWrite.setTranslationX(rectF.left - viewWrite.getLeft());
            viewWrite.setTranslationY(rectF.top - viewWrite.getTop());
        }
    }
}
