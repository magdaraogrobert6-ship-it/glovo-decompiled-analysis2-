package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import androidx.camera.core.ImageCapture$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class setWeightSum {
    public static final Range read = new Range(120, 120);
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen serializer;
    public final getThumbTintList write;

    public final List serializer(android.util.Size size) {
        Object isitemdismissable;
        try {
            isitemdismissable = ((StreamConfigurationMap) ((ImageCapture$1) this.write.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        if (isitemdismissable instanceof isItemDismissable) {
            isitemdismissable = null;
        }
        Range[] rangeArr = (Range[]) isitemdismissable;
        return rangeArr != null ? onContentCardDismissed.PlaybackStateCompat(onContentCardClicked.RemoteActionCompatParcelizer((Object[]) rangeArr)) : instance_delegatelambda0.write;
    }

    public setWeightSum(getThumbTintList getthumbtintlist) {
        getthumbtintlist.getClass();
        this.write = getthumbtintlist;
        final int i = 0;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.setHoverListener
            public final /* synthetic */ setWeightSum read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = i;
                setWeightSum setweightsum = this.read;
                boolean z = true;
                if (i2 == 0) {
                    int[] iArr = (int[]) setweightsum.write.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                    if (iArr != null) {
                        for (int i3 : iArr) {
                            if (i3 != 9) {
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (i2 != 1) {
                    android.util.Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ImageCapture$1) setweightsum.write.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getHighSpeedVideoSizes();
                    return highSpeedVideoSizes != null ? onContentCardClicked.RemoteActionCompatParcelizer((Object[]) highSpeedVideoSizes) : instance_delegatelambda0.write;
                }
                List list = (List) setweightsum.serializer.MediaSessionCompatResultReceiverWrapper();
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.read();
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int iWrite = setController.write((android.util.Size) next);
                    do {
                        Object next2 = it.next();
                        int iWrite2 = setController.write((android.util.Size) next2);
                        if (iWrite < iWrite2) {
                            next = next2;
                            iWrite = iWrite2;
                        }
                    } while (it.hasNext());
                }
                return (android.util.Size) next;
            }
        });
        final int i2 = 1;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.setHoverListener
            public final /* synthetic */ setWeightSum read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                setWeightSum setweightsum = this.read;
                boolean z = true;
                if (i3 == 0) {
                    int[] iArr = (int[]) setweightsum.write.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                    if (iArr != null) {
                        for (int i4 : iArr) {
                            if (i4 != 9) {
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (i3 != 1) {
                    android.util.Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ImageCapture$1) setweightsum.write.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getHighSpeedVideoSizes();
                    return highSpeedVideoSizes != null ? onContentCardClicked.RemoteActionCompatParcelizer((Object[]) highSpeedVideoSizes) : instance_delegatelambda0.write;
                }
                List list = (List) setweightsum.serializer.MediaSessionCompatResultReceiverWrapper();
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.read();
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int iWrite = setController.write((android.util.Size) next);
                    do {
                        Object next2 = it.next();
                        int iWrite2 = setController.write((android.util.Size) next2);
                        if (iWrite < iWrite2) {
                            next = next2;
                            iWrite = iWrite2;
                        }
                    } while (it.hasNext());
                }
                return (android.util.Size) next;
            }
        });
        final int i3 = 2;
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.setHoverListener
            public final /* synthetic */ setWeightSum read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = i3;
                setWeightSum setweightsum = this.read;
                boolean z = true;
                if (i4 == 0) {
                    int[] iArr = (int[]) setweightsum.write.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                    if (iArr != null) {
                        for (int i5 : iArr) {
                            if (i5 != 9) {
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (i4 != 1) {
                    android.util.Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ImageCapture$1) setweightsum.write.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getHighSpeedVideoSizes();
                    return highSpeedVideoSizes != null ? onContentCardClicked.RemoteActionCompatParcelizer((Object[]) highSpeedVideoSizes) : instance_delegatelambda0.write;
                }
                List list = (List) setweightsum.serializer.MediaSessionCompatResultReceiverWrapper();
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.read();
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int iWrite = setController.write((android.util.Size) next);
                    do {
                        Object next2 = it.next();
                        int iWrite2 = setController.write((android.util.Size) next2);
                        if (iWrite < iWrite2) {
                            next = next2;
                            iWrite = iWrite2;
                        }
                    } while (it.hasNext());
                }
                return (android.util.Size) next;
            }
        });
    }

    public final Range[] serializer(List list) {
        list.getClass();
        int size = list.size();
        if (1 <= size && size < 3 && onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(list)).size() == 1) {
            List listSerializer = serializer((android.util.Size) list.get(0));
            if (listSerializer.isEmpty()) {
                listSerializer = null;
            }
            if (listSerializer != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listSerializer) {
                        Range range = (Range) obj;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{range.getLower(), range.getUpper()}, getCieXyz.write())).booleanValue()) {
                            arrayList.add(obj);
                        }
                    }
                    listSerializer = arrayList;
                }
                return (Range[]) listSerializer.toArray(new Range[0]);
            }
        }
        return null;
    }

    public static List IconCompatParcelizer(List list) {
        if (list.isEmpty()) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) onContentCardDismissed.read(list));
        Iterator it = onContentCardDismissed.serializer(list, 1).iterator();
        while (it.hasNext()) {
            arrayListIconCompatParcelizer.retainAll((List) it.next());
        }
        return arrayListIconCompatParcelizer;
    }
}
