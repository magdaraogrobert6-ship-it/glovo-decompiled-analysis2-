package o;

import android.animation.ObjectAnimator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScaleFactor {
    public getUnspecified_hLwfpcannotations IconCompatParcelizer;
    public copy8GGzs04default serializer;

    public final void IconCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Rect rect, float f) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        this.IconCompatParcelizer.read();
        getScaleYimpl getscaleyimpl = (getScaleYimpl) this;
        getscaleyimpl.MediaBrowserCompatMediaItem = rect.width();
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = getscaleyimpl.IconCompatParcelizer;
        float f2 = getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (getunspecified_hlwfpcannotations.write) {
            canvas.scale(-1.0f, 1.0f);
        }
        ObjectAnimator objectAnimator3 = getscaleyimpl.serializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if ((objectAnimator3 != null && objectAnimator3.isRunning() && getunspecified_hlwfpcannotations.MediaBrowserCompatMediaItem == 1) || ((objectAnimator = getscaleyimpl.serializer.MediaSessionCompatResultReceiverWrapper) != null && objectAnimator.isRunning() && getunspecified_hlwfpcannotations.RemoteActionCompatParcelizer == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        ObjectAnimator objectAnimator4 = getscaleyimpl.serializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if ((objectAnimator4 != null && objectAnimator4.isRunning()) || ((objectAnimator2 = getscaleyimpl.serializer.MediaSessionCompatResultReceiverWrapper) != null && objectAnimator2.isRunning())) {
            canvas.translate(0.0f, ((f - 1.0f) * getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem) / 2.0f);
        }
        float f3 = getscaleyimpl.MediaBrowserCompatMediaItem;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        getscaleyimpl.RemoteActionCompatParcelizer = getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem * f;
        getscaleyimpl.write = getunspecified_hlwfpcannotations.MediaDescriptionCompat * f;
    }
}
