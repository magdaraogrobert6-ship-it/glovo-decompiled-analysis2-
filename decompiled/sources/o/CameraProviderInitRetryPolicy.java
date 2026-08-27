package o;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class CameraProviderInitRetryPolicy extends CameraRepository {
    public static final play IconCompatParcelizer = play.OPTIONAL;

    public static CameraProviderInitRetryPolicy RemoteActionCompatParcelizer(InitializationException initializationException) {
        TreeMap treeMap = new TreeMap(CameraRepository.serializer);
        for (JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk : initializationException.MediaBrowserCompatMediaItem()) {
            Set<play> setIconCompatParcelizer = initializationException.IconCompatParcelizer(jpegCaptureDownsizingQuirk);
            ArrayMap arrayMap = new ArrayMap();
            for (play playVar : setIconCompatParcelizer) {
                arrayMap.put(playVar, initializationException.serializer(jpegCaptureDownsizingQuirk, playVar));
            }
            treeMap.put(jpegCaptureDownsizingQuirk, arrayMap);
        }
        return new CameraProviderInitRetryPolicy(treeMap);
    }

    public final void IconCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, play playVar, Object obj) {
        play playVar2;
        TreeMap treeMap = this.RemoteActionCompatParcelizer;
        Map map = (Map) treeMap.get(jpegCaptureDownsizingQuirk);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(jpegCaptureDownsizingQuirk, arrayMap);
            arrayMap.put(playVar, obj);
            return;
        }
        play playVar3 = (play) Collections.min(map.keySet());
        if (Objects.equals(map.get(playVar3), obj) || playVar3 != (playVar2 = play.REQUIRED) || playVar != playVar2) {
            map.put(playVar, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(jpegCaptureDownsizingQuirk.RemoteActionCompatParcelizer);
        sb.append(", existing value (");
        sb.append(playVar3);
        Object obj2 = map.get(playVar3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(playVar);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static CameraProviderInitRetryPolicy RemoteActionCompatParcelizer() {
        return new CameraProviderInitRetryPolicy(new TreeMap(CameraRepository.serializer));
    }

    public final void IconCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, Object obj) {
        IconCompatParcelizer(jpegCaptureDownsizingQuirk, IconCompatParcelizer, obj);
    }

    public CameraProviderInitRetryPolicy(TreeMap treeMap) {
        super(treeMap);
    }
}
