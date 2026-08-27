package o;

import android.util.ArrayMap;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class CameraRepository implements InitializationException {
    public static final CameraRepository read;
    public static final wg$$ExternalSyntheticLambda0 serializer;
    public final TreeMap RemoteActionCompatParcelizer;

    public static CameraRepository serializer(InitializationException initializationException) {
        if (CameraRepository.class.equals(initializationException.getClass())) {
            return (CameraRepository) initializationException;
        }
        TreeMap treeMap = new TreeMap(serializer);
        for (JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk : initializationException.MediaBrowserCompatMediaItem()) {
            Set<play> setIconCompatParcelizer = initializationException.IconCompatParcelizer(jpegCaptureDownsizingQuirk);
            ArrayMap arrayMap = new ArrayMap();
            for (play playVar : setIconCompatParcelizer) {
                arrayMap.put(playVar, initializationException.serializer(jpegCaptureDownsizingQuirk, playVar));
            }
            treeMap.put(jpegCaptureDownsizingQuirk, arrayMap);
        }
        return new CameraRepository(treeMap);
    }

    @Override // o.InitializationException
    public final Set IconCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        Map map = (Map) this.RemoteActionCompatParcelizer.get(jpegCaptureDownsizingQuirk);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // o.InitializationException
    public final Set MediaBrowserCompatMediaItem() {
        return Collections.unmodifiableSet(this.RemoteActionCompatParcelizer.keySet());
    }

    @Override // o.InitializationException
    public final play RemoteActionCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        Map map = (Map) this.RemoteActionCompatParcelizer.get(jpegCaptureDownsizingQuirk);
        if (map != null) {
            return (play) Collections.min(map.keySet());
        }
        Gson$$ExternalSyntheticBUOutline0.m(jpegCaptureDownsizingQuirk, "Option does not exist: ");
        return null;
    }

    @Override // o.InitializationException
    public final boolean read(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        return this.RemoteActionCompatParcelizer.containsKey(jpegCaptureDownsizingQuirk);
    }

    @Override // o.InitializationException
    public final Object serializer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, play playVar) {
        Map map = (Map) this.RemoteActionCompatParcelizer.get(jpegCaptureDownsizingQuirk);
        if (map == null) {
            Gson$$ExternalSyntheticBUOutline0.m(jpegCaptureDownsizingQuirk, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(playVar)) {
            return map.get(playVar);
        }
        getOffVariationName.read("Option does not exist: ", jpegCaptureDownsizingQuirk, " with priority=", playVar);
        return null;
    }

    @Override // o.InitializationException
    public final Object write(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        Map map = (Map) this.RemoteActionCompatParcelizer.get(jpegCaptureDownsizingQuirk);
        if (map != null) {
            return map.get((play) Collections.min(map.keySet()));
        }
        Gson$$ExternalSyntheticBUOutline0.m(jpegCaptureDownsizingQuirk, "Option does not exist: ");
        return null;
    }

    static {
        wg$$ExternalSyntheticLambda0 wg__externalsyntheticlambda0 = new wg$$ExternalSyntheticLambda0(2);
        serializer = wg__externalsyntheticlambda0;
        read = new CameraRepository(new TreeMap(wg__externalsyntheticlambda0));
    }

    public CameraRepository(TreeMap treeMap) {
        this.RemoteActionCompatParcelizer = treeMap;
    }

    @Override // o.InitializationException
    public final void IconCompatParcelizer(CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 captureRequestOptions$Builder$$ExternalSyntheticLambda0) {
        for (Map.Entry entry : this.RemoteActionCompatParcelizer.tailMap(new JpegCaptureDownsizingQuirk("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((JpegCaptureDownsizingQuirk) entry.getKey()).RemoteActionCompatParcelizer.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = (JpegCaptureDownsizingQuirk) entry.getKey();
            getOuterActionMenuPresenter getouteractionmenupresenter = (getOuterActionMenuPresenter) captureRequestOptions$Builder$$ExternalSyntheticLambda0.write;
            InitializationException initializationException = (InitializationException) captureRequestOptions$Builder$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer;
            getouteractionmenupresenter.read.IconCompatParcelizer(jpegCaptureDownsizingQuirk, initializationException.RemoteActionCompatParcelizer(jpegCaptureDownsizingQuirk), initializationException.write(jpegCaptureDownsizingQuirk));
        }
    }

    @Override // o.InitializationException
    public final Object read(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, Object obj) {
        Map map = (Map) this.RemoteActionCompatParcelizer.get(jpegCaptureDownsizingQuirk);
        return map == null ? obj : map.get((play) Collections.min(map.keySet()));
    }
}
