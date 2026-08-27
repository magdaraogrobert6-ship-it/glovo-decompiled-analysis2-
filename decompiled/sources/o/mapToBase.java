package o;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mapToBase {
    public static final List serializer = Arrays.asList(1, 5, 3);
    public final ArrayList IconCompatParcelizer;
    public final Preview3AThreadCrashQuirk MediaBrowserCompatMediaItem;
    public final nativeGetYUVImageVUOff MediaDescriptionCompat;
    public final List MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final awaitNavigationRoutes RemoteActionCompatParcelizer;
    public final List read;
    public final InputConfiguration write;

    public final List RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        for (Preview3AThreadCrashQuirk preview3AThreadCrashQuirk : this.IconCompatParcelizer) {
            arrayList.add(preview3AThreadCrashQuirk.serializer);
            Iterator it = preview3AThreadCrashQuirk.read.iterator();
            while (it.hasNext()) {
                arrayList.add((PreviewExternalSyntheticLambda0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public mapToBase(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, nativeGetYUVImageVUOff nativegetyuvimagevuoff, awaitNavigationRoutes awaitnavigationroutes, InputConfiguration inputConfiguration, int i, Preview3AThreadCrashQuirk preview3AThreadCrashQuirk) {
        this.IconCompatParcelizer = arrayList;
        this.read = Collections.unmodifiableList(arrayList2);
        this.MediaMetadataCompat = Collections.unmodifiableList(arrayList3);
        this.MediaSessionCompatQueueItem = Collections.unmodifiableList(arrayList4);
        this.RemoteActionCompatParcelizer = awaitnavigationroutes;
        this.MediaDescriptionCompat = nativegetyuvimagevuoff;
        this.write = inputConfiguration;
        this.RatingCompat = i;
        this.MediaBrowserCompatMediaItem = preview3AThreadCrashQuirk;
    }

    public static mapToBase IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        ArrayList arrayList5 = new ArrayList();
        CameraControlInternalCameraControlException cameraControlInternalCameraControlExceptionWrite = CameraControlInternalCameraControlException.write();
        ArrayList arrayList6 = new ArrayList(hashSet);
        CameraRepository cameraRepositorySerializer = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        OnePixelShiftQuirk onePixelShiftQuirk = OnePixelShiftQuirk.read;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = cameraControlInternalCameraControlExceptionWrite.IconCompatParcelizer;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new mapToBase(arrayList, arrayList2, arrayList3, arrayList4, new nativeGetYUVImageVUOff(arrayList6, cameraRepositorySerializer, -1, false, arrayList7, false, new OnePixelShiftQuirk(arrayMap), null), null, null, 0, null);
    }
}
