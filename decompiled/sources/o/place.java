package o;

import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.ViewOffsetBehavior;
import io.grpc.SynchronizationContext$1;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class place extends ViewOffsetBehavior {
    public int MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public SynchronizationContext$1 MediaMetadataCompat;
    public android.view.VelocityTracker ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public OverScroller PlaybackStateCompatCustomAction;
    public int RatingCompat;

    public abstract int RemoteActionCompatParcelizer();

    public abstract int RemoteActionCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.PlaybackStateCompat < 0) {
            this.PlaybackStateCompat = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.MediaDescriptionCompat) {
            int i = this.RatingCompat;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.MediaBrowserCompatMediaItem) > this.PlaybackStateCompat) {
                    this.MediaBrowserCompatMediaItem = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.RatingCompat = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    java.lang.ref.WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).RemoteActionCompatParcelizer;
                    if (weakReference == null) {
                    }
                    this.MediaDescriptionCompat = z;
                    if (z) {
                        this.MediaBrowserCompatMediaItem = y;
                        this.RatingCompat = motionEvent.getPointerId(0);
                        if (this.ParcelableVolumeInfo == null) {
                            this.ParcelableVolumeInfo = android.view.VelocityTracker.obtain();
                        }
                        overScroller = this.PlaybackStateCompatCustomAction;
                        if (overScroller != null) {
                            this.PlaybackStateCompatCustomAction.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.ParcelableVolumeInfo;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.RatingCompat = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                java.lang.ref.WeakReference weakReference2 = ((AppBarLayout.BaseBehavior) this).RemoteActionCompatParcelizer;
                z = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.write(x2, y, view);
                this.MediaDescriptionCompat = z;
                if (z) {
                    this.MediaBrowserCompatMediaItem = y;
                    this.RatingCompat = motionEvent.getPointerId(0);
                    if (this.ParcelableVolumeInfo == null) {
                        this.ParcelableVolumeInfo = android.view.VelocityTracker.obtain();
                    }
                    overScroller = this.PlaybackStateCompatCustomAction;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.PlaybackStateCompatCustomAction.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.ParcelableVolumeInfo;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        android.view.VelocityTracker velocityTracker;
        android.view.VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            android.view.VelocityTracker velocityTracker3 = this.ParcelableVolumeInfo;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.ParcelableVolumeInfo.computeCurrentVelocity(1000);
                float yVelocity = this.ParcelableVolumeInfo.getYVelocity(this.RatingCompat);
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int i = -appBarLayout.getTotalScrollRange();
                Runnable runnable = this.MediaMetadataCompat;
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                    this.MediaMetadataCompat = null;
                }
                if (this.PlaybackStateCompatCustomAction == null) {
                    this.PlaybackStateCompatCustomAction = new OverScroller(view.getContext());
                }
                this.PlaybackStateCompatCustomAction.fling(0, serializer(), 0, Math.round(yVelocity), 0, 0, i, 0);
                if (this.PlaybackStateCompatCustomAction.computeScrollOffset()) {
                    SynchronizationContext$1 synchronizationContext$1 = new SynchronizationContext$1(14, this, coordinatorLayout, view, false);
                    this.MediaMetadataCompat = synchronizationContext$1;
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    view.postOnAnimation(synchronizationContext$1);
                } else {
                    ((AppBarLayout.BaseBehavior) this).read(coordinatorLayout, appBarLayout);
                    if (appBarLayout.MediaSessionCompatQueueItem) {
                        appBarLayout.RemoteActionCompatParcelizer(appBarLayout.serializer(AppBarLayout.BaseBehavior.IconCompatParcelizer(coordinatorLayout)));
                    }
                }
                z = true;
            }
            this.MediaDescriptionCompat = false;
            this.RatingCompat = -1;
            velocityTracker = this.ParcelableVolumeInfo;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.ParcelableVolumeInfo = null;
            }
            velocityTracker2 = this.ParcelableVolumeInfo;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.MediaDescriptionCompat) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.RatingCompat);
            if (iFindPointerIndex != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i2 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = y;
                AppBarLayout appBarLayout2 = (AppBarLayout) view;
                RemoteActionCompatParcelizer(coordinatorLayout, view, RemoteActionCompatParcelizer() - (i2 - y), appBarLayout2.getTopInset() + (-appBarLayout2.getDownNestedScrollRange()), 0);
            }
        }
        if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.RatingCompat = motionEvent.getPointerId(i3);
                this.MediaBrowserCompatMediaItem = (int) (motionEvent.getY(i3) + 0.5f);
            }
        }
        z = false;
        velocityTracker2 = this.ParcelableVolumeInfo;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.MediaDescriptionCompat || z;
        z = false;
        this.MediaDescriptionCompat = false;
        this.RatingCompat = -1;
        velocityTracker = this.ParcelableVolumeInfo;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ParcelableVolumeInfo = null;
        }
        velocityTracker2 = this.ParcelableVolumeInfo;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.MediaDescriptionCompat) {
        }
    }

    public final void RemoteActionCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, View view, int i) {
        RemoteActionCompatParcelizer(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
