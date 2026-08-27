package o;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes2.dex */
public final class placeRelative extends FocusTargetNodeKt {
    public final /* synthetic */ BottomSheetBehavior IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;

    @Override // o.FocusTargetNodeKt
    public final int serializer(int i, View view) {
        return view.getLeft();
    }

    @Override // o.FocusTargetNodeKt
    public final boolean IconCompatParcelizer(int i, View view) {
        BottomSheetBehavior bottomSheetBehavior = this.IconCompatParcelizer;
        int i2 = bottomSheetBehavior.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i2 == 1 || bottomSheetBehavior.ResultReceiver) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.IconCompatParcelizer == i) {
            java.lang.ref.WeakReference<View> weakReference = bottomSheetBehavior.MediaSessionCompatToken;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        this.RemoteActionCompatParcelizer = System.currentTimeMillis();
        Reference reference = bottomSheetBehavior.ComponentActivity;
        return reference != null && reference.get() == view;
    }

    @Override // o.FocusTargetNodeKt
    public final int RemoteActionCompatParcelizer() {
        BottomSheetBehavior bottomSheetBehavior = this.IconCompatParcelizer;
        return BottomSheetBehavior.access$1600(bottomSheetBehavior) ? bottomSheetBehavior.MediaSessionCompatResultReceiverWrapper : bottomSheetBehavior.read;
    }

    @Override // o.FocusTargetNodeKt
    public final int write(int i, View view) {
        return getActiveFocusTargetNode.RemoteActionCompatParcelizer(i, this.IconCompatParcelizer.getExpandedOffset(), RemoteActionCompatParcelizer());
    }

    @Override // o.FocusTargetNodeKt
    public final void write(int i, int i2, View view) {
        this.IconCompatParcelizer.dispatchOnSlide(i2);
    }

    public placeRelative(BottomSheetBehavior bottomSheetBehavior) {
        this.IconCompatParcelizer = bottomSheetBehavior;
    }

    @Override // o.FocusTargetNodeKt
    public final void read(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.IconCompatParcelizer;
            if (bottomSheetBehavior.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                bottomSheetBehavior.setStateInternal(1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109  */
    @Override // o.FocusTargetNodeKt
    public final void IconCompatParcelizer(View view, float f, float f2) {
        int i;
        BottomSheetBehavior bottomSheetBehavior = this.IconCompatParcelizer;
        if (f2 < 0.0f) {
            if (!bottomSheetBehavior.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                int top = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.RemoteActionCompatParcelizer;
                if (bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                    if (!bottomSheetBehavior.shouldExpandOnUpwardDrag(jCurrentTimeMillis - j, (top * 100.0f) / bottomSheetBehavior.MediaSessionCompatResultReceiverWrapper)) {
                        i = 4;
                    }
                } else if (top > bottomSheetBehavior.MediaDescriptionCompat) {
                    i = 6;
                }
            }
            i = 3;
        } else if (bottomSheetBehavior.PlaybackStateCompat && bottomSheetBehavior.shouldHide(view, f2)) {
            if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.addOnPictureInPictureModeChangedListener) {
                if (view.getTop() <= (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.MediaSessionCompatResultReceiverWrapper) / 2) {
                    if (!bottomSheetBehavior.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 && Math.abs(view.getTop() - bottomSheetBehavior.getExpandedOffset()) >= Math.abs(view.getTop() - bottomSheetBehavior.MediaDescriptionCompat)) {
                        i = 6;
                    } else {
                        i = 3;
                    }
                }
            }
            i = 5;
        } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
            if (!bottomSheetBehavior.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                int top2 = view.getTop();
                if (Math.abs(top2 - bottomSheetBehavior.MediaDescriptionCompat) < Math.abs(top2 - bottomSheetBehavior.read) && !bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                    i = 6;
                }
            }
            i = 4;
        } else {
            int top3 = view.getTop();
            if (bottomSheetBehavior.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                if (Math.abs(top3 - bottomSheetBehavior.RatingCompat) < Math.abs(top3 - bottomSheetBehavior.read)) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else {
                int i2 = bottomSheetBehavior.MediaDescriptionCompat;
                if (top3 < i2) {
                    if (top3 < Math.abs(top3 - bottomSheetBehavior.read)) {
                        i = 3;
                    } else if (bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                        i = 4;
                    } else {
                        i = 6;
                    }
                } else if (Math.abs(top3 - i2) >= Math.abs(top3 - bottomSheetBehavior.read) || bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                    i = 4;
                } else {
                    i = 6;
                }
            }
        }
        bottomSheetBehavior.startSettling(view, i, bottomSheetBehavior.shouldSkipSmoothAnimation());
    }
}
