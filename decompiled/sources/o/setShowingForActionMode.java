package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class setShowingForActionMode implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final View MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;
    public final int[] MediaSessionCompatToken = new int[2];
    public getWindowSystemUiVisibility ParcelableVolumeInfo;
    public boolean RatingCompat;
    public getWindowSystemUiVisibility RemoteActionCompatParcelizer;

    public abstract invalidateOptionsMenu IconCompatParcelizer();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.RatingCompat = false;
        this.IconCompatParcelizer = -1;
        getWindowSystemUiVisibility getwindowsystemuivisibility = this.RemoteActionCompatParcelizer;
        if (getwindowsystemuivisibility != null) {
            this.MediaMetadataCompat.removeCallbacks(getwindowsystemuivisibility);
        }
    }

    public abstract boolean write();

    public final void RemoteActionCompatParcelizer() {
        getWindowSystemUiVisibility getwindowsystemuivisibility = this.ParcelableVolumeInfo;
        View view = this.MediaMetadataCompat;
        if (getwindowsystemuivisibility != null) {
            view.removeCallbacks(getwindowsystemuivisibility);
        }
        getWindowSystemUiVisibility getwindowsystemuivisibility2 = this.RemoteActionCompatParcelizer;
        if (getwindowsystemuivisibility2 != null) {
            view.removeCallbacks(getwindowsystemuivisibility2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        setHasNonEmbeddedTabs sethasnonembeddedtabsA_;
        boolean z2 = this.RatingCompat;
        View view2 = this.MediaMetadataCompat;
        if (z2) {
            invalidateOptionsMenu invalidateoptionsmenuIconCompatParcelizer = IconCompatParcelizer();
            if (invalidateoptionsmenuIconCompatParcelizer != null && invalidateoptionsmenuIconCompatParcelizer.serializer() && (sethasnonembeddedtabsA_ = invalidateoptionsmenuIconCompatParcelizer.a_()) != null && sethasnonembeddedtabsA_.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.MediaSessionCompatToken;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                sethasnonembeddedtabsA_.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zOnForwardedEvent = sethasnonembeddedtabsA_.onForwardedEvent(motionEventObtainNoHistory, this.IconCompatParcelizer);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zOnForwardedEvent && z3) {
                    z = true;
                } else if (read()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (read()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.IconCompatParcelizer = motionEvent.getPointerId(0);
                    if (this.RemoteActionCompatParcelizer == null) {
                        this.RemoteActionCompatParcelizer = new getWindowSystemUiVisibility(this, 1);
                    }
                    view2.postDelayed(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem);
                    if (this.ParcelableVolumeInfo == null) {
                        this.ParcelableVolumeInfo = new getWindowSystemUiVisibility(this, 0);
                    }
                    view2.postDelayed(this.ParcelableVolumeInfo, this.MediaDescriptionCompat);
                } else if (actionMasked2 == 1) {
                    RemoteActionCompatParcelizer();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.IconCompatParcelizer);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.MediaSessionCompatQueueItem;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            RemoteActionCompatParcelizer();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (write()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    RemoteActionCompatParcelizer();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.RatingCompat = z;
        return z || z2;
    }

    public setShowingForActionMode(View view) {
        this.MediaMetadataCompat = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.MediaSessionCompatQueueItem = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.MediaBrowserCompatMediaItem = tapTimeout;
        this.MediaDescriptionCompat = (android.view.ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public boolean read() {
        invalidateOptionsMenu invalidateoptionsmenuIconCompatParcelizer = IconCompatParcelizer();
        if (invalidateoptionsmenuIconCompatParcelizer == null || !invalidateoptionsmenuIconCompatParcelizer.serializer()) {
            return true;
        }
        invalidateoptionsmenuIconCompatParcelizer.RemoteActionCompatParcelizer();
        return true;
    }
}
