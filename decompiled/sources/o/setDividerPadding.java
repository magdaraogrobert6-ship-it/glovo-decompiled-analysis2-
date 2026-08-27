package o;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class setDividerPadding extends CameraDevice.StateCallback {
    public final /* synthetic */ int read;
    public final Object serializer;

    public setDividerPadding(ArrayList arrayList) {
        this.read = 1;
        this.serializer = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof getGravity)) {
                ((ArrayList) this.serializer).add(stateCallback);
            }
        }
    }

    public void serializer() {
        ArrayList<getThumbScrollRange> arrayListRatingCompat;
        synchronized (((androidx.lifecycle.BlockRunner) this.serializer).serializer) {
            arrayListRatingCompat = ((androidx.lifecycle.BlockRunner) this.serializer).RatingCompat();
            ((LinkedHashSet) ((androidx.lifecycle.BlockRunner) this.serializer).RemoteActionCompatParcelizer).clear();
            ((LinkedHashSet) ((androidx.lifecycle.BlockRunner) this.serializer).RatingCompat).clear();
            ((LinkedHashSet) ((androidx.lifecycle.BlockRunner) this.serializer).write).clear();
        }
        for (getThumbScrollRange getthumbscrollrange : arrayListRatingCompat) {
            synchronized (getthumbscrollrange.MediaSessionCompatToken) {
                List list = getthumbscrollrange.MediaSessionCompatQueueItem;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((PreviewExternalSyntheticLambda0) it.next()).serializer();
                    }
                    getthumbscrollrange.MediaSessionCompatQueueItem = null;
                }
            }
            getthumbscrollrange.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        }
    }

    public void write() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((androidx.lifecycle.BlockRunner) this.serializer).serializer) {
            linkedHashSet.addAll((LinkedHashSet) ((androidx.lifecycle.BlockRunner) this.serializer).RemoteActionCompatParcelizer);
            linkedHashSet.addAll((LinkedHashSet) ((androidx.lifecycle.BlockRunner) this.serializer).RatingCompat);
        }
        ((PreviewFreezeAfterHighSpeedRecordingQuirk) ((androidx.lifecycle.BlockRunner) this.serializer).read).execute(new Preview$$ExternalSyntheticLambda0(9, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.read == 0) {
            write();
            serializer();
        } else {
            Iterator it = ((ArrayList) this.serializer).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        if (this.read == 0) {
            write();
            serializer();
        } else {
            Iterator it = ((ArrayList) this.serializer).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        if (this.read != 0) {
            Iterator it = ((ArrayList) this.serializer).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
            }
            return;
        }
        write();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((androidx.lifecycle.BlockRunner) this.serializer).serializer) {
            linkedHashSet.addAll((LinkedHashSet) ((androidx.lifecycle.BlockRunner) this.serializer).RemoteActionCompatParcelizer);
            linkedHashSet.addAll((LinkedHashSet) ((androidx.lifecycle.BlockRunner) this.serializer).RatingCompat);
        }
        ((PreviewFreezeAfterHighSpeedRecordingQuirk) ((androidx.lifecycle.BlockRunner) this.serializer).read).execute(new brazelogdefault(linkedHashSet, i, 2));
        serializer();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        if (this.read != 0) {
            Iterator it = ((ArrayList) this.serializer).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
            }
        }
    }

    public setDividerPadding(androidx.lifecycle.BlockRunner blockRunner) {
        this.read = 0;
        this.serializer = blockRunner;
    }
}
