package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgb;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import o.Nexus4AndroidLTargetAspectRatioQuirk;
import o.accessgetGreencp;
import o.getLogoDescription;
import o.getTitleMarginBottom;
import o.nativeWriteJpegToSurface;
import o.setInflatedId;
import o.setLineHeight;
import o.setSelector;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraFactory {
    public final Camera2CameraCoordinator IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final nativeWriteJpegToSurface MediaDescriptionCompat;
    public final setSelector MediaMetadataCompat;
    public final getTitleMarginBottom MediaSessionCompatQueueItem;
    public final Nexus4AndroidLTargetAspectRatioQuirk MediaSessionCompatToken;
    public final DisplayInfoManager PlaybackStateCompatCustomAction;
    public final Context RatingCompat;
    public final CameraManagerCompat read;
    public final getLogoDescription serializer;
    public final HashMap RemoteActionCompatParcelizer = new HashMap();
    public final Object PlaybackStateCompat = new Object();
    public ArrayList write = new ArrayList();

    public final LinkedHashSet IconCompatParcelizer() {
        LinkedHashSet linkedHashSet;
        synchronized (this.PlaybackStateCompat) {
            linkedHashSet = new LinkedHashSet(this.write);
        }
        return linkedHashSet;
    }

    public final void IconCompatParcelizer(List list) throws InitializationException {
        try {
            ArrayList arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(zzgb.RemoteActionCompatParcelizer(this, this.serializer, new ArrayList(list)));
            synchronized (this.PlaybackStateCompat) {
                if (this.write.equals(arrayListRemoteActionCompatParcelizer)) {
                    return;
                }
                Objects.toString(this.write);
                arrayListRemoteActionCompatParcelizer.toString();
                setInflatedId.IconCompatParcelizer(3, "Camera2CameraFactory");
                this.write = arrayListRemoteActionCompatParcelizer;
            }
        } catch (InitializationException e) {
            SentryLogcatAdapter.read("Camera2CameraFactory", "Unable to get backward compatible camera ids", e);
            throw e;
        }
    }

    public final ArrayList RemoteActionCompatParcelizer(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList2.add(str);
            } else if (CameraIdUtil.read(this.read, str)) {
                arrayList2.add(str);
            } else {
                setInflatedId.IconCompatParcelizer(3, "Camera2CameraFactory");
            }
        }
        return arrayList2;
    }

    public final Camera2CameraImpl read(String str) throws CameraUnavailableException {
        synchronized (this.PlaybackStateCompat) {
            if (!this.write.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        Context context = this.RatingCompat;
        CameraManagerCompat cameraManagerCompat = this.read;
        setLineHeight setlineheightWrite = write(str);
        Camera2CameraCoordinator camera2CameraCoordinator = this.IconCompatParcelizer;
        nativeWriteJpegToSurface nativewritejpegtosurface = this.MediaDescriptionCompat;
        Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = this.MediaSessionCompatToken;
        return new Camera2CameraImpl(context, cameraManagerCompat, str, setlineheightWrite, camera2CameraCoordinator, nativewritejpegtosurface, nexus4AndroidLTargetAspectRatioQuirk.IconCompatParcelizer, nexus4AndroidLTargetAspectRatioQuirk.RemoteActionCompatParcelizer, this.PlaybackStateCompatCustomAction, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem);
    }

    public final setLineHeight write(String str) throws CameraUnavailableException {
        HashMap map = this.RemoteActionCompatParcelizer;
        try {
            setLineHeight setlineheight = (setLineHeight) map.get(str);
            if (setlineheight != null) {
                return setlineheight;
            }
            setLineHeight setlineheight2 = new setLineHeight(this.read, str);
            map.put(str, setlineheight2);
            return setlineheight2;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public Camera2CameraFactory(Context context, Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk, getLogoDescription getlogodescription, long j, getTitleMarginBottom gettitlemarginbottom, accessgetGreencp accessgetgreencp) throws InitializationException {
        this.RatingCompat = context;
        this.MediaSessionCompatToken = nexus4AndroidLTargetAspectRatioQuirk;
        CameraManagerCompat cameraManagerCompatRemoteActionCompatParcelizer = CameraManagerCompat.RemoteActionCompatParcelizer(context);
        this.read = cameraManagerCompatRemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = DisplayInfoManager.IconCompatParcelizer(context);
        Camera2CameraCoordinator camera2CameraCoordinator = new Camera2CameraCoordinator(cameraManagerCompatRemoteActionCompatParcelizer);
        this.IconCompatParcelizer = camera2CameraCoordinator;
        nativeWriteJpegToSurface nativewritejpegtosurface = new nativeWriteJpegToSurface(camera2CameraCoordinator);
        this.MediaDescriptionCompat = nativewritejpegtosurface;
        synchronized (camera2CameraCoordinator.MediaMetadataCompat) {
            camera2CameraCoordinator.MediaBrowserCompatMediaItem.add(nativewritejpegtosurface);
        }
        this.MediaBrowserCompatMediaItem = j;
        this.MediaSessionCompatQueueItem = gettitlemarginbottom;
        this.serializer = getlogodescription;
        try {
            List listAsList = Arrays.asList(cameraManagerCompatRemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            this.MediaMetadataCompat = new setSelector(listAsList, cameraManagerCompatRemoteActionCompatParcelizer, nexus4AndroidLTargetAspectRatioQuirk.IconCompatParcelizer);
            IconCompatParcelizer(listAsList);
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(new CameraUnavailableException(e));
        }
    }
}
