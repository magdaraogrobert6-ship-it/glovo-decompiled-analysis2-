package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk {
    public final ArrayList RemoteActionCompatParcelizer;

    public final void read(ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk) {
        this.RemoteActionCompatParcelizer.add(imageCaptureRotationOptionQuirk);
    }

    public static void serializer(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    serializer(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public IncorrectJpegMetadataQuirk(ImageCaptureRotationOptionQuirk... imageCaptureRotationOptionQuirkArr) {
        ArrayList arrayList = new ArrayList();
        this.RemoteActionCompatParcelizer = arrayList;
        Collections.addAll(arrayList, imageCaptureRotationOptionQuirkArr);
    }

    public final List read(List list) {
        AeFpsRangeQuirk aeFpsRangeQuirk;
        AeFpsRangeQuirk aeFpsRangeQuirk2;
        AeFpsRangeQuirk aeFpsRangeQuirk3;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList<int[]> arrayList2 = new ArrayList();
        serializer(arrayList2, size2, new int[size2], 0);
        ImageCaptureRotationOptionQuirk[] imageCaptureRotationOptionQuirkArr = new ImageCaptureRotationOptionQuirk[list.size()];
        for (int[] iArr : arrayList2) {
            boolean z = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) arrayList.get(i);
                    ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk2 = (ImageCaptureRotationOptionQuirk) list.get(iArr[i]);
                    imageCaptureRotationOptionQuirk.getClass();
                    imageCaptureRotationOptionQuirk2.getClass();
                    z &= imageCaptureRotationOptionQuirk2.read.getId() <= imageCaptureRotationOptionQuirk.read.getId() && imageCaptureRotationOptionQuirk2.MediaSessionCompatQueueItem == imageCaptureRotationOptionQuirk.MediaSessionCompatQueueItem && ((aeFpsRangeQuirk = imageCaptureRotationOptionQuirk.MediaDescriptionCompat) == (aeFpsRangeQuirk2 = AeFpsRangeQuirk.DEFAULT) || (aeFpsRangeQuirk3 = imageCaptureRotationOptionQuirk2.MediaDescriptionCompat) == aeFpsRangeQuirk2 || aeFpsRangeQuirk3 == aeFpsRangeQuirk);
                    if (!z) {
                        break;
                    }
                    imageCaptureRotationOptionQuirkArr[iArr[i]] = (ImageCaptureRotationOptionQuirk) arrayList.get(i);
                }
            }
            if (z) {
                return Arrays.asList(imageCaptureRotationOptionQuirkArr);
            }
        }
        return null;
    }

    public IncorrectJpegMetadataQuirk() {
        this.RemoteActionCompatParcelizer = new ArrayList();
    }
}
