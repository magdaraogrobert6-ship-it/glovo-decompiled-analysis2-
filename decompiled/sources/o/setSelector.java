package o;

import android.hardware.camera2.CameraManager;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class setSelector implements DeferrableSurfaceSurfaceUnavailableException {
    public List IconCompatParcelizer;
    public final Executor MediaMetadataCompat;
    public final CopyOnWriteArrayList MediaSessionCompatQueueItem;
    public setListSelectionHidden RatingCompat;
    public Throwable RemoteActionCompatParcelizer;
    public final Object read;
    public boolean serializer;
    public final androidx.camera.camera2.internal.compat.CameraManagerCompat write;

    public final void serializer(ArrayList arrayList, androidx.camera.core.CameraUnavailableException cameraUnavailableException) {
        boolean z;
        List listUnmodifiableList;
        Throwable th;
        synchronized (this.read) {
            try {
                if (cameraUnavailableException != null) {
                    z = this.RemoteActionCompatParcelizer == null || !this.IconCompatParcelizer.isEmpty();
                    this.RemoteActionCompatParcelizer = cameraUnavailableException;
                    this.IconCompatParcelizer = Collections.EMPTY_LIST;
                } else {
                    arrayList.getClass();
                    z = (this.RemoteActionCompatParcelizer == null && this.IconCompatParcelizer.equals(arrayList)) ? false : true;
                    this.RemoteActionCompatParcelizer = null;
                    this.IconCompatParcelizer = arrayList;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.IconCompatParcelizer);
                th = this.RemoteActionCompatParcelizer;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            this.MediaSessionCompatQueueItem.size();
            for (ImageCaptureWithFlashUnderexposureQuirk imageCaptureWithFlashUnderexposureQuirk : this.MediaSessionCompatQueueItem) {
                imageCaptureWithFlashUnderexposureQuirk.write.execute(new WorkerKt$$ExternalSyntheticLambda2(th, imageCaptureWithFlashUnderexposureQuirk, listUnmodifiableList, 5));
            }
        }
    }

    public setSelector(List list, androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, Executor executor) {
        list.getClass();
        executor.getClass();
        this.read = new Object();
        this.MediaSessionCompatQueueItem = new CopyOnWriteArrayList();
        this.RemoteActionCompatParcelizer = null;
        this.serializer = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            arrayList.add(new getNavButtonView((ArrayList) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer), null));
        }
        this.IconCompatParcelizer = arrayList;
        this.write = cameraManagerCompat;
        this.MediaMetadataCompat = executor;
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public final void serializer(Executor executor, CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        List listUnmodifiableList;
        Throwable th;
        executor.getClass();
        cameraValidatorCameraIdListIncorrectException.getClass();
        this.MediaSessionCompatQueueItem.add(new ImageCaptureWithFlashUnderexposureQuirk(executor, cameraValidatorCameraIdListIncorrectException));
        synchronized (this.read) {
            if (!this.serializer && !this.MediaSessionCompatQueueItem.isEmpty()) {
                int i = 1;
                this.serializer = true;
                if (this.RatingCompat != null) {
                    SentryLogcatAdapter.IconCompatParcelizer("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
                    IconCompatParcelizer();
                }
                setListSelectionHidden setlistselectionhidden = new setListSelectionHidden(this);
                this.RatingCompat = setlistselectionhidden;
                androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat = this.write;
                ((CameraManager) cameraManagerCompat.serializer.MediaSessionCompatQueueItem).registerAvailabilityCallback(this.MediaMetadataCompat, setlistselectionhidden);
                coil3.util.UtilsKt.RemoteActionCompatParcelizer(new EncodeException(RemoteActionCompatParcelizer(), i));
            }
            listUnmodifiableList = Collections.unmodifiableList(this.IconCompatParcelizer);
            th = this.RemoteActionCompatParcelizer;
        }
        executor.execute(new WorkerKt$$ExternalSyntheticLambda2(th, new ImageCaptureWithFlashUnderexposureQuirk(executor, cameraValidatorCameraIdListIncorrectException), listUnmodifiableList, 5));
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public final void write(CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        ImageCaptureWithFlashUnderexposureQuirk imageCaptureWithFlashUnderexposureQuirk;
        cameraValidatorCameraIdListIncorrectException.getClass();
        Iterator it = this.MediaSessionCompatQueueItem.iterator();
        do {
            if (!it.hasNext()) {
                imageCaptureWithFlashUnderexposureQuirk = null;
                break;
            }
            imageCaptureWithFlashUnderexposureQuirk = (ImageCaptureWithFlashUnderexposureQuirk) it.next();
        } while (!imageCaptureWithFlashUnderexposureQuirk.IconCompatParcelizer.equals(cameraValidatorCameraIdListIncorrectException));
        if (imageCaptureWithFlashUnderexposureQuirk != null) {
            this.MediaSessionCompatQueueItem.remove(imageCaptureWithFlashUnderexposureQuirk);
        }
        synchronized (this.read) {
            if (this.serializer && this.MediaSessionCompatQueueItem.isEmpty()) {
                this.serializer = false;
                IconCompatParcelizer();
            }
        }
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public final DrawModifierNodeKt RemoteActionCompatParcelizer() {
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.MediaMetadataCompat.execute(new CameraX$$ExternalSyntheticLambda2(this, 9, ondrawwithcontent));
            ondrawwithcontent.RemoteActionCompatParcelizer = "FetchData for CameraAvailability";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        return ondrawbehind;
    }

    public final void IconCompatParcelizer() {
        setListSelectionHidden setlistselectionhidden = this.RatingCompat;
        if (setlistselectionhidden != null) {
            try {
                ((CameraManager) this.write.serializer.MediaSessionCompatQueueItem).unregisterAvailabilityCallback(setlistselectionhidden);
            } catch (Exception e) {
                SentryLogcatAdapter.write("Camera2PresenceSrc", "Failed to unregister system availability callback.", e);
            } finally {
                this.RatingCompat = null;
            }
        }
    }
}
