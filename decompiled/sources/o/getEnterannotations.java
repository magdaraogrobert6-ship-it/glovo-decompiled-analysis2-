package o;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class getEnterannotations {
    public final Context IconCompatParcelizer;
    public android.view.VelocityTracker MediaDescriptionCompat;
    public final getExit MediaSessionCompatQueueItem;
    public float RemoteActionCompatParcelizer;
    public int serializer = -1;
    public int MediaMetadataCompat = -1;
    public int read = -1;
    public final int[] write = {Integer.MAX_VALUE, 0};

    public getEnterannotations(Context context, getExit getexit) {
        this.IconCompatParcelizer = context;
        this.MediaSessionCompatQueueItem = getexit;
    }

    public final void serializer(MotionEvent motionEvent, int i) {
        boolean z;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i2 = this.MediaMetadataCompat;
        int[] iArr = this.write;
        if (i2 == source && this.read == deviceId && this.serializer == i) {
            z = false;
        } else {
            Context context = this.IconCompatParcelizer;
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            iArr[0] = resetAfterInAppMessageClose.RemoteActionCompatParcelizer(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
            iArr[1] = resetAfterInAppMessageClose.serializer(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
            this.MediaMetadataCompat = source;
            this.read = deviceId;
            this.serializer = i;
            z = true;
        }
        int i3 = iArr[0];
        android.view.VelocityTracker velocityTracker = this.MediaDescriptionCompat;
        if (i3 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.MediaDescriptionCompat = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.MediaDescriptionCompat = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker2 = this.MediaDescriptionCompat;
        setFocusPropertiesScope.serializer(velocityTracker2, motionEvent);
        setFocusPropertiesScope.write(velocityTracker2);
        float fSerializer = setFocusPropertiesScope.serializer(velocityTracker2, i);
        getExit getexit = this.MediaSessionCompatQueueItem;
        float f = getexit.read() * fSerializer;
        float fSignum = Math.signum(f);
        if (z || (fSignum != Math.signum(this.RemoteActionCompatParcelizer) && fSignum != 0.0f)) {
            getexit.serializer();
        }
        if (Math.abs(f) < iArr[0]) {
            return;
        }
        int i4 = iArr[1];
        float fMax = Math.max(-i4, Math.min(f, i4));
        this.RemoteActionCompatParcelizer = getexit.startDifferentialMotionFling(fMax) ? fMax : 0.0f;
    }
}
