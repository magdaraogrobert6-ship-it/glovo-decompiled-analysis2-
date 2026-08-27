package o;

import androidx.recyclerview.widget.DiffUtil$Callback;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionKtshrinkVertically2 {
    public Object IconCompatParcelizer;
    public final Serializable MediaSessionCompatQueueItem;
    public final Object RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public boolean read;
    public final int serializer;
    public int write;

    public void read(getPlus0nO6VwU getplus0no6vwu) {
        int i;
        int i2;
        ArrayList arrayList;
        int[] iArr = (int[]) this.MediaSessionCompatQueueItem;
        ArrayList arrayList2 = (ArrayList) this.RemoteActionCompatParcelizer;
        DiffUtil$Callback diffUtil$Callback = (DiffUtil$Callback) this.RatingCompat;
        accessgetPluscp accessgetpluscp = new accessgetPluscp(getplus0no6vwu);
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.write;
        int i4 = 1;
        int size = arrayList2.size() - 1;
        int i5 = this.serializer;
        int i6 = i5;
        while (size >= 0) {
            getColor0nO6VwU getcolor0no6vwu = (getColor0nO6VwU) arrayList2.get(size);
            int i7 = getcolor0no6vwu.serializer;
            int i8 = getcolor0no6vwu.write;
            int i9 = getcolor0no6vwu.read;
            while (true) {
                i = 0;
                if (i5 <= i7 + i8) {
                    break;
                }
                i5--;
                int i10 = iArr[i5];
                if ((i10 & 12) != 0) {
                    int i11 = i10 >> 4;
                    getColorDodge0nO6VwU getcolordodge0no6vwuWrite = write(arrayDeque, i11, false);
                    if (getcolordodge0no6vwuWrite != null) {
                        arrayList = arrayList2;
                        int i12 = (i6 - getcolordodge0no6vwuWrite.IconCompatParcelizer) - 1;
                        accessgetpluscp.read(i5, i12);
                        if ((i10 & 4) != 0) {
                            accessgetpluscp.IconCompatParcelizer(i12, 1, diffUtil$Callback.getChangePayload(i5, i11));
                        }
                    } else {
                        arrayList = arrayList2;
                        arrayDeque.add(new getColorDodge0nO6VwU(i5, (i6 - i5) - 1, true));
                    }
                } else {
                    arrayList = arrayList2;
                    accessgetpluscp.IconCompatParcelizer(i5, i4);
                    i6--;
                }
                arrayList2 = arrayList;
                i4 = 1;
            }
            ArrayList arrayList3 = arrayList2;
            while (i3 > i9 + i8) {
                i3--;
                int i13 = ((int[]) this.IconCompatParcelizer)[i3];
                if ((i13 & 12) != 0) {
                    int i14 = i13 >> 4;
                    getColorDodge0nO6VwU getcolordodge0no6vwuWrite2 = write(arrayDeque, i14, true);
                    if (getcolordodge0no6vwuWrite2 == null) {
                        arrayDeque.add(new getColorDodge0nO6VwU(i3, i6 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        accessgetpluscp.read((i6 - getcolordodge0no6vwuWrite2.IconCompatParcelizer) - 1, i5);
                        if ((i13 & 4) != 0) {
                            accessgetpluscp.IconCompatParcelizer(i5, 1, diffUtil$Callback.getChangePayload(i14, i3));
                        }
                    }
                } else {
                    i2 = i;
                    accessgetpluscp.write(i5, 1);
                    i6++;
                }
                i = i2;
            }
            int i15 = i9;
            int i16 = i7;
            while (i < i8) {
                if ((iArr[i16] & 15) == 2) {
                    accessgetpluscp.IconCompatParcelizer(i16, 1, diffUtil$Callback.getChangePayload(i16, i15));
                }
                i16++;
                i15++;
                i++;
            }
            size--;
            i4 = 1;
            i3 = i9;
            i5 = i7;
            arrayList2 = arrayList3;
        }
        accessgetpluscp.read();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKtshrinkVertically2(DiffUtil$Callback diffUtil$Callback, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.RemoteActionCompatParcelizer = arrayList;
        this.MediaSessionCompatQueueItem = iArr;
        this.IconCompatParcelizer = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.RatingCompat = diffUtil$Callback;
        int oldListSize = diffUtil$Callback.getOldListSize();
        this.serializer = oldListSize;
        int newListSize = diffUtil$Callback.getNewListSize();
        this.write = newListSize;
        this.read = true;
        getColor0nO6VwU getcolor0no6vwu = arrayList.isEmpty() ? null : (getColor0nO6VwU) arrayList.get(0);
        if (getcolor0no6vwu == null || getcolor0no6vwu.serializer != 0 || getcolor0no6vwu.read != 0) {
            arrayList.add(0, new getColor0nO6VwU(0, 0, 0));
        }
        arrayList.add(new getColor0nO6VwU(oldListSize, newListSize, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getColor0nO6VwU getcolor0no6vwu2 = (getColor0nO6VwU) it.next();
            for (int i3 = 0; i3 < getcolor0no6vwu2.write; i3++) {
                int i4 = getcolor0no6vwu2.serializer + i3;
                int i5 = getcolor0no6vwu2.read + i3;
                int i6 = diffUtil$Callback.areContentsTheSame(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.read) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                getColor0nO6VwU getcolor0no6vwu3 = (getColor0nO6VwU) it2.next();
                while (true) {
                    i = getcolor0no6vwu3.serializer;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                getColor0nO6VwU getcolor0no6vwu4 = (getColor0nO6VwU) arrayList.get(i9);
                                while (true) {
                                    i2 = getcolor0no6vwu4.read;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && diffUtil$Callback.areItemsTheSame(i7, i8)) {
                                            int i10 = diffUtil$Callback.areContentsTheSame(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = getcolor0no6vwu4.write + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = getcolor0no6vwu3.write + i;
            }
        }
    }

    public static getColorDodge0nO6VwU write(ArrayDeque arrayDeque, int i, boolean z) {
        getColorDodge0nO6VwU getcolordodge0no6vwu;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                getcolordodge0no6vwu = null;
                break;
            }
            getcolordodge0no6vwu = (getColorDodge0nO6VwU) it.next();
            if (getcolordodge0no6vwu.write == i && getcolordodge0no6vwu.RemoteActionCompatParcelizer == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            getColorDodge0nO6VwU getcolordodge0no6vwu2 = (getColorDodge0nO6VwU) it.next();
            if (z) {
                getcolordodge0no6vwu2.IconCompatParcelizer--;
            } else {
                getcolordodge0no6vwu2.IconCompatParcelizer++;
            }
        }
        return getcolordodge0no6vwu;
    }

    public EnterExitTransitionKtshrinkVertically2(AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11, androidx.camera.core.SurfaceRequest surfaceRequest, PreviewGreenTintQuirk previewGreenTintQuirk, boolean z, int i) {
        this.RatingCompat = animatedVisibilityKtAnimatedVisibilityImpl11;
        this.read = false;
        this.write = 0;
        this.IconCompatParcelizer = null;
        this.RemoteActionCompatParcelizer = surfaceRequest;
        this.MediaSessionCompatQueueItem = previewGreenTintQuirk;
        animatedVisibilityKtAnimatedVisibilityImpl11.PlaybackStateCompat = z;
        this.serializer = i;
    }
}
