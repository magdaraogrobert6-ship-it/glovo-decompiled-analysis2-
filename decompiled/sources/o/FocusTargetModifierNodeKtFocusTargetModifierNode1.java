package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.camera.video.Recorder$3;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetModifierNodeKtFocusTargetModifierNode1 {
    public boolean IconCompatParcelizer;
    public setRight MediaDescriptionCompat;
    public setRight MediaMetadataCompat;
    public final int RatingCompat;
    public final accessisProcessingCustomEnterp RemoteActionCompatParcelizer;
    public accessisProcessingCustomExitp read;
    public final ColorDrawable serializer;
    public int write;

    public final void read(float f) {
        float f2 = f * 1.0f;
        accessisProcessingCustomEnterp accessisprocessingcustomenterp = this.RemoteActionCompatParcelizer;
        if (accessisprocessingcustomenterp.read != f2) {
            accessisprocessingcustomenterp.read = f2;
            Recorder$3 recorder$3 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
            if (recorder$3 != null) {
                ((View) recorder$3.RemoteActionCompatParcelizer).setAlpha(f2);
            }
        }
    }

    public final void write(float f) {
        float f2 = f * 1.0f;
        accessisProcessingCustomEnterp accessisprocessingcustomenterp = this.RemoteActionCompatParcelizer;
        int i = this.RatingCompat;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * accessisprocessingcustomenterp.MediaMetadataCompat;
            if (accessisprocessingcustomenterp.RatingCompat != f3) {
                accessisprocessingcustomenterp.RatingCompat = f3;
                Recorder$3 recorder$3 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                if (recorder$3 != null) {
                    ((View) recorder$3.RemoteActionCompatParcelizer).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * accessisprocessingcustomenterp.IconCompatParcelizer;
            if (accessisprocessingcustomenterp.MediaBrowserCompatMediaItem != f4) {
                accessisprocessingcustomenterp.MediaBrowserCompatMediaItem = f4;
                Recorder$3 recorder$4 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                if (recorder$4 != null) {
                    ((View) recorder$4.RemoteActionCompatParcelizer).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * accessisprocessingcustomenterp.MediaMetadataCompat;
            if (accessisprocessingcustomenterp.RatingCompat != f5) {
                accessisprocessingcustomenterp.RatingCompat = f5;
                Recorder$3 recorder$5 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                if (recorder$5 != null) {
                    ((View) recorder$5.RemoteActionCompatParcelizer).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * accessisprocessingcustomenterp.IconCompatParcelizer;
        if (accessisprocessingcustomenterp.MediaBrowserCompatMediaItem != f6) {
            accessisprocessingcustomenterp.MediaBrowserCompatMediaItem = f6;
            Recorder$3 recorder$6 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
            if (recorder$6 != null) {
                ((View) recorder$6.RemoteActionCompatParcelizer).setTranslationY(f6);
            }
        }
    }

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public FocusTargetModifierNodeKtFocusTargetModifierNode1(int i, int i2) {
        accessisProcessingCustomEnterp accessisprocessingcustomenterp = new accessisProcessingCustomEnterp();
        accessisprocessingcustomenterp.MediaMetadataCompat = -1;
        accessisprocessingcustomenterp.IconCompatParcelizer = -1;
        setRight setright = setRight.IconCompatParcelizer;
        accessisprocessingcustomenterp.write = setright;
        accessisprocessingcustomenterp.MediaDescriptionCompat = false;
        accessisprocessingcustomenterp.serializer = null;
        accessisprocessingcustomenterp.RatingCompat = 0.0f;
        accessisprocessingcustomenterp.MediaBrowserCompatMediaItem = 0.0f;
        accessisprocessingcustomenterp.read = 1.0f;
        this.RemoteActionCompatParcelizer = accessisprocessingcustomenterp;
        this.MediaMetadataCompat = setright;
        this.MediaDescriptionCompat = setright;
        this.read = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unexpected side: "));
            throw null;
        }
        this.RatingCompat = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.serializer = colorDrawable;
        this.write = 0;
        this.IconCompatParcelizer = true;
        if (i2 != 0) {
            this.write = i2;
            colorDrawable.setColor(i2);
            accessisprocessingcustomenterp.serializer = colorDrawable;
            Recorder$3 recorder$3 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
            if (recorder$3 != null) {
                ((View) recorder$3.RemoteActionCompatParcelizer).setBackground(colorDrawable);
            }
        }
    }
}
