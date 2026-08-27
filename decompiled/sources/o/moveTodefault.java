package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Trace;
import androidx.camera.core.ImageCapture$1;
import com.sentiance.core.model.thrift.k$c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class moveTodefault {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[PHI: r3
  0x003a: PHI (r3v9 float) = (r3v4 float), (r3v16 float) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r3
  0x0030: PHI (r3v5 float) = (r3v4 float), (r3v16 float) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final String IconCompatParcelizer(float f) {
        float fWrite;
        StringBuilder sb;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            fWrite = MathKt.write(f % 10.0f) * 10.0f;
            if (fWrite / 2.0f == 2.0f) {
                sb = new StringBuilder();
                sb.append((int) fWrite);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fWrite);
                int i3 = write + 85;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                sb = sb2;
            }
        } else {
            fWrite = MathKt.write(f * 10.0f) / 10.0f;
            if (fWrite % 1.0f == 0.0f) {
                sb = new StringBuilder();
                sb.append((int) fWrite);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fWrite);
                int i5 = write + 85;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                sb = sb3;
            }
        }
        sb.append("x");
        return sb.toString();
    }

    public static final void serializer(onRelease onrelease, Object obj, int i, Object obj2, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 107;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(onrelease) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.read(i)) {
                int i9 = write + 65;
                RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i9 % 2 == 0 ? 18126 : androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode.read(obj2)) {
                int i10 = write + 21;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i10 % 2 == 0 ? 4544 : androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i3 |= i4;
        }
        boolean z = false;
        if ((i3 & 1171) != 1170) {
            int i11 = RemoteActionCompatParcelizer + 101;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                z = true;
            }
        }
        if (getpostalcode.write(i3 & 1, z)) {
            ((AlphaKt) obj).read(obj2, coil3.ExtrasKt.write(980966366, new AndroidPrefetchScheduler(i, onrelease, obj2), getpostalcode), getpostalcode, 48);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(onrelease, obj, i, obj2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a A[LOOP:3: B:62:0x0132->B:64:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x013d A[EDGE_INSN: B:86:0x013d->B:65:0x013d BREAK  A[LOOP:3: B:62:0x0132->B:64:0x013a], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList read(minIntrinsicWidth minintrinsicwidth) {
        Set setWrite;
        float[] fArr;
        int i;
        int i2;
        float fMin;
        int length;
        int i3;
        int i4 = 2 % 2;
        minintrinsicwidth.getClass();
        k$c k_c = minintrinsicwidth.read;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
            getcurrentcontentinsetright.getClass();
            Iterator it = getcurrentcontentinsetright.MediaBrowserCompatMediaItem.serializer().iterator();
            while (it.hasNext()) {
                int i5 = RemoteActionCompatParcelizer + 19;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                FocusMeteringAction focusMeteringActionResultReceiver = ((ImageCapture1) it.next()).ResultReceiver();
                focusMeteringActionResultReceiver.getClass();
                arrayList.add(focusMeteringActionResultReceiver);
            }
            Trace.endSection();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i7 = write + 53;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                updateCursorAnchorInfo updatecursoranchorinfo = null;
                updatecursoranchorinfo = null;
                fValueOf = null;
                Float fValueOf = null;
                updatecursoranchorinfo = null;
                updatecursoranchorinfo = null;
                updatecursoranchorinfo = null;
                if (i7 % 2 == 0) {
                    ImageCapture$1 imageCapture$1Serializer = ImageCapture$1.serializer((FocusMeteringAction) it2.next());
                    imageCapture$1Serializer.getClass();
                    throw null;
                }
                ImageCapture$1 imageCapture$1Serializer2 = ImageCapture$1.serializer((FocusMeteringAction) it2.next());
                imageCapture$1Serializer2.getClass();
                Integer num = (Integer) imageCapture$1Serializer2.write(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 1) {
                    int[] iArr = (int[]) imageCapture$1Serializer2.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                    Set set = ItemTouchHelperAdapter.serializer;
                    if (iArr != null) {
                        int length2 = iArr.length;
                        if (length2 == 0) {
                            setWrite = set;
                        } else if (length2 != 1) {
                            setWrite = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(iArr.length));
                            for (int i8 : iArr) {
                                setWrite.add(Integer.valueOf(i8));
                            }
                        } else {
                            setWrite = RangesKt.write(Integer.valueOf(iArr[0]));
                        }
                    } else {
                        setWrite = null;
                    }
                    if (setWrite != null) {
                        set = setWrite;
                    }
                    boolean zContains = set.contains(12);
                    Object[] objArr = set.contains(8) && (set.contains(0) ^ true);
                    if (!zContains) {
                        int i9 = write + 19;
                        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            int i10 = 10 / 0;
                            if (objArr == false) {
                                final String str = ((setLineHeight) imageCapture$1Serializer2.MediaSessionCompatQueueItem).MediaDescriptionCompat;
                                str.getClass();
                                fArr = (float[]) imageCapture$1Serializer2.write(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                                if (fArr != null) {
                                    i = RemoteActionCompatParcelizer;
                                    i2 = i + 31;
                                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i2 % 2 != 0) {
                                        int i11 = 1 / 0;
                                        if (fArr.length == 0) {
                                            int i12 = i + 11;
                                            write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i13 = i12 % 2;
                                        } else {
                                            fMin = fArr[0];
                                            length = fArr.length - 1;
                                            if (1 <= length) {
                                                i3 = 1;
                                                while (true) {
                                                    fMin = Math.min(fMin, fArr[i3]);
                                                    if (i3 != length) {
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                            fValueOf = Float.valueOf(fMin);
                                        }
                                    } else if (fArr.length == 0) {
                                        int i14 = i + 11;
                                        write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i15 = i14 % 2;
                                    } else {
                                        fMin = fArr[0];
                                        length = fArr.length - 1;
                                        if (1 <= length) {
                                            i3 = 1;
                                            while (true) {
                                                fMin = Math.min(fMin, fArr[i3]);
                                                if (i3 != length) {
                                                    break;
                                                    break;
                                                }
                                                i3++;
                                            }
                                        }
                                        fValueOf = Float.valueOf(fMin);
                                    }
                                }
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                linkedHashSet.add(new toFlashState(1));
                                linkedHashSet.add(new getCurrentContentInsetLeft() { // from class: o.CursorAnchorInfoController
                                    private static int read = 1;
                                    private static int serializer;

                                    @Override // o.getCurrentContentInsetLeft
                                    public final ArrayList read(List list) {
                                        int i16 = 2 % 2;
                                        list.getClass();
                                        ArrayList arrayList3 = new ArrayList();
                                        int i17 = serializer + 89;
                                        read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i18 = i17 % 2;
                                        for (Object obj : list) {
                                            int i19 = read + 119;
                                            serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i20 = i19 % 2;
                                            Object[] objArr2 = {((setLineHeight) ImageCapture$1.serializer((FocusMeteringAction) obj).MediaSessionCompatQueueItem).MediaDescriptionCompat, str};
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                                                arrayList3.add(obj);
                                            }
                                        }
                                        return arrayList3;
                                    }
                                });
                                updatecursoranchorinfo = new updateCursorAnchorInfo(new getLogoDescription(linkedHashSet), fValueOf);
                            }
                        } else if (objArr == false) {
                            final String str2 = ((setLineHeight) imageCapture$1Serializer2.MediaSessionCompatQueueItem).MediaDescriptionCompat;
                            str2.getClass();
                            fArr = (float[]) imageCapture$1Serializer2.write(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                            if (fArr != null) {
                                i = RemoteActionCompatParcelizer;
                                i2 = i + 31;
                                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i2 % 2 != 0) {
                                    int i16 = 1 / 0;
                                    if (fArr.length == 0) {
                                        int i17 = i + 11;
                                        write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i18 = i17 % 2;
                                    } else {
                                        fMin = fArr[0];
                                        length = fArr.length - 1;
                                        if (1 <= length) {
                                            i3 = 1;
                                            while (true) {
                                                fMin = Math.min(fMin, fArr[i3]);
                                                if (i3 != length) {
                                                    break;
                                                    break;
                                                }
                                                i3++;
                                            }
                                        }
                                        fValueOf = Float.valueOf(fMin);
                                    }
                                } else if (fArr.length == 0) {
                                    int i19 = i + 11;
                                    write = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i110 = i19 % 2;
                                } else {
                                    fMin = fArr[0];
                                    length = fArr.length - 1;
                                    if (1 <= length) {
                                        i3 = 1;
                                        while (true) {
                                            fMin = Math.min(fMin, fArr[i3]);
                                            if (i3 != length) {
                                                break;
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                    fValueOf = Float.valueOf(fMin);
                                }
                            }
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            linkedHashSet2.add(new toFlashState(1));
                            linkedHashSet2.add(new getCurrentContentInsetLeft() { // from class: o.CursorAnchorInfoController
                                private static int read = 1;
                                private static int serializer;

                                @Override // o.getCurrentContentInsetLeft
                                public final ArrayList read(List list) {
                                    int i111 = 2 % 2;
                                    list.getClass();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i112 = serializer + 89;
                                    read = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i113 = i112 % 2;
                                    for (Object obj : list) {
                                        int i114 = read + 119;
                                        serializer = i114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i20 = i114 % 2;
                                        Object[] objArr2 = {((setLineHeight) ImageCapture$1.serializer((FocusMeteringAction) obj).MediaSessionCompatQueueItem).MediaDescriptionCompat, str2};
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                                            arrayList3.add(obj);
                                        }
                                    }
                                    return arrayList3;
                                }
                            });
                            updatecursoranchorinfo = new updateCursorAnchorInfo(new getLogoDescription(linkedHashSet2), fValueOf);
                        }
                    }
                }
                if (updatecursoranchorinfo != null) {
                    int i20 = RemoteActionCompatParcelizer + 21;
                    write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    arrayList2.add(updatecursoranchorinfo);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
