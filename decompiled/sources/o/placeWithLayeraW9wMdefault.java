package o;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class placeWithLayeraW9wMdefault extends FocusTargetNodeKt {
    public final /* synthetic */ SwipeDismissBehavior IconCompatParcelizer;
    public int read = -1;
    public int serializer;

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // o.FocusTargetNodeKt
    public final void IconCompatParcelizer(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        SubcomposeLayoutStatePausedPrecomposition subcomposeLayoutStatePausedPrecomposition;
        this.read = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.IconCompatParcelizer;
        boolean z = true;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.MediaMetadataCompat;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.serializer;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.serializer;
                if (left < i2) {
                    i = this.serializer - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.serializer - width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.serializer) < Math.round(view.getWidth() * 0.5f)) {
                i = this.serializer;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.serializer;
                if (left < i2) {
                    i = this.serializer - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.serializer - width;
            }
        }
        if (swipeDismissBehavior.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(i, view.getTop())) {
            toImageConfig toimageconfig = new toImageConfig(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            view.postOnAnimation(toimageconfig);
        } else {
            if (!z || (subcomposeLayoutStatePausedPrecomposition = swipeDismissBehavior.RemoteActionCompatParcelizer) == null) {
                return;
            }
            subcomposeLayoutStatePausedPrecomposition.write(view);
        }
    }

    @Override // o.FocusTargetNodeKt
    public final int write(int i, View view) {
        return view.getTop();
    }

    @Override // o.FocusTargetNodeKt
    public final int write(View view) {
        return view.getWidth();
    }

    @Override // o.FocusTargetNodeKt
    public final void read(int i) {
        SubcomposeLayoutStatePausedPrecomposition subcomposeLayoutStatePausedPrecomposition = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        if (subcomposeLayoutStatePausedPrecomposition != null) {
            SubcomposeMeasureScope subcomposeMeasureScope = subcomposeLayoutStatePausedPrecomposition.read.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (i == 0) {
                androidx.transition.TransitionValuesMaps.MediaDescriptionCompat().write(subcomposeMeasureScope);
            } else if (i == 1 || i == 2) {
                androidx.transition.TransitionValuesMaps.MediaDescriptionCompat().RemoteActionCompatParcelizer(subcomposeMeasureScope);
            }
        }
    }

    @Override // o.FocusTargetNodeKt
    public final void read(int i, View view) {
        this.read = i;
        this.serializer = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.IconCompatParcelizer;
            swipeDismissBehavior.RatingCompat = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.RatingCompat = false;
        }
    }

    @Override // o.FocusTargetNodeKt
    public final int serializer(int i, View view) {
        int width;
        int width2;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.IconCompatParcelizer.MediaMetadataCompat;
        if (i2 == 0) {
            width = this.serializer;
            if (z) {
                width -= view.getWidth();
                width2 = this.serializer;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.serializer;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = view.getWidth() + this.serializer;
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.serializer;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    public placeWithLayeraW9wMdefault(SwipeDismissBehavior swipeDismissBehavior) {
        this.IconCompatParcelizer = swipeDismissBehavior;
    }

    @Override // o.FocusTargetNodeKt
    public final void write(int i, int i2, View view) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.IconCompatParcelizer;
        float f = width * swipeDismissBehavior.IconCompatParcelizer;
        float width2 = view.getWidth() * swipeDismissBehavior.write;
        float fAbs = Math.abs(i - this.serializer);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // o.FocusTargetNodeKt
    public final boolean IconCompatParcelizer(int i, View view) {
        int i2 = this.read;
        return (i2 == -1 || i2 == i) && this.IconCompatParcelizer.write(view);
    }
}
