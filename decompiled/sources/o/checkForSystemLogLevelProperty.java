package o;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class checkForSystemLogLevelProperty implements View.OnTouchListener {
    public int MediaSessionCompatQueueItem;
    public android.view.ViewConfiguration RatingCompat;
    public StringsKt__StringsKt$$ExternalSyntheticLambda1 write;
    public final Handler IconCompatParcelizer = new Handler();
    public final long RemoteActionCompatParcelizer = android.view.ViewConfiguration.getDoubleTapTimeout();
    public final long MediaDescriptionCompat = android.view.ViewConfiguration.getTapTimeout();
    public final long MediaBrowserCompatMediaItem = android.view.ViewConfiguration.getLongPressTimeout();
    public final _set_logLevel_lambda0 serializer = new _set_logLevel_lambda0();
    public final _set_logLevel_lambda0 read = new _set_logLevel_lambda0();

    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return false;
        }
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        viewConfiguration.getClass();
        this.RatingCompat = viewConfiguration;
        int action = motionEvent.getAction();
        Handler handler = this.IconCompatParcelizer;
        _set_logLevel_lambda0 _set_loglevel_lambda0 = this.serializer;
        if (action == 0) {
            handler.removeCallbacksAndMessages(null);
            if (motionEvent.getPointerCount() == 1) {
                _set_loglevel_lambda0.getClass();
                _set_loglevel_lambda0.write = motionEvent.getEventTime();
                _set_loglevel_lambda0.RemoteActionCompatParcelizer = motionEvent.getX();
                _set_loglevel_lambda0.IconCompatParcelizer = motionEvent.getY();
                return true;
            }
            _set_loglevel_lambda0.write = 0L;
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (motionEvent.getEventTime() - motionEvent.getDownTime() < this.MediaDescriptionCompat) {
                    float fAbs = Math.abs(motionEvent.getX() - _set_loglevel_lambda0.RemoteActionCompatParcelizer);
                    android.view.ViewConfiguration viewConfiguration2 = this.RatingCompat;
                    if (viewConfiguration2 == null) {
                        removeNodeAtDepth.serializer("viewConfig");
                        throw null;
                    }
                    if (fAbs > viewConfiguration2.getScaledTouchSlop()) {
                        float fAbs2 = Math.abs(motionEvent.getY() - _set_loglevel_lambda0.IconCompatParcelizer);
                        android.view.ViewConfiguration viewConfiguration3 = this.RatingCompat;
                        if (viewConfiguration3 == null) {
                            removeNodeAtDepth.serializer("viewConfig");
                            throw null;
                        }
                        if (fAbs2 > viewConfiguration3.getScaledTouchSlop()) {
                            _set_loglevel_lambda0.write = 0L;
                            return true;
                        }
                    }
                }
            }
        } else if (_set_loglevel_lambda0.write > 0) {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() < this.MediaBrowserCompatMediaItem) {
                _set_logLevel_lambda0 _set_loglevel_lambda1 = this.read;
                long j = _set_loglevel_lambda1.write;
                long j2 = this.RemoteActionCompatParcelizer;
                if (j > 0 && motionEvent.getEventTime() - _set_loglevel_lambda1.write < j2) {
                    float fAbs3 = Math.abs(motionEvent.getX() - _set_loglevel_lambda1.RemoteActionCompatParcelizer);
                    android.view.ViewConfiguration viewConfiguration4 = this.RatingCompat;
                    if (viewConfiguration4 == null) {
                        removeNodeAtDepth.serializer("viewConfig");
                        throw null;
                    }
                    if (fAbs3 < viewConfiguration4.getScaledDoubleTapSlop()) {
                        float fAbs4 = Math.abs(motionEvent.getY() - _set_loglevel_lambda1.IconCompatParcelizer);
                        android.view.ViewConfiguration viewConfiguration5 = this.RatingCompat;
                        if (viewConfiguration5 == null) {
                            removeNodeAtDepth.serializer("viewConfig");
                            throw null;
                        }
                        if (fAbs4 < viewConfiguration5.getScaledDoubleTapSlop()) {
                            this.MediaSessionCompatQueueItem++;
                        } else {
                            this.MediaSessionCompatQueueItem = 1;
                        }
                    } else {
                        this.MediaSessionCompatQueueItem = 1;
                    }
                } else {
                    this.MediaSessionCompatQueueItem = 1;
                }
                _set_loglevel_lambda1.write = motionEvent.getEventTime();
                _set_loglevel_lambda1.RemoteActionCompatParcelizer = motionEvent.getX();
                _set_loglevel_lambda1.IconCompatParcelizer = motionEvent.getY();
                handler.postDelayed(new brazelogdefault(this, this.MediaSessionCompatQueueItem, 0), j2);
            }
        }
        return true;
    }
}
