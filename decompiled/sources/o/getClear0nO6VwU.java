package o;

import androidx.recyclerview.widget.DiffUtil$Callback;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class getClear0nO6VwU {
    public static final getColorBurn0nO6VwU write = new getColorBurn0nO6VwU(0);

    /* JADX WARN: Code duplicated, block: B:127:0x010e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    public static EnterExitTransitionKtshrinkVertically2 serializer(DiffUtil$Callback diffUtil$Callback) {
        ArrayList arrayList;
        ArrayList arrayList2;
        getDarken0nO6VwU getdarken0no6vwu;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i;
        BlendModeCompanion blendModeCompanion;
        getColor0nO6VwU getcolor0no6vwu;
        int i2;
        int i3;
        getDarken0nO6VwU getdarken0no6vwu2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int oldListSize = diffUtil$Callback.getOldListSize();
        int newListSize = diffUtil$Callback.getNewListSize();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        BlendModeCompanion blendModeCompanion2 = new BlendModeCompanion();
        int i13 = 0;
        blendModeCompanion2.serializer = 0;
        blendModeCompanion2.RemoteActionCompatParcelizer = oldListSize;
        blendModeCompanion2.IconCompatParcelizer = 0;
        blendModeCompanion2.read = newListSize;
        arrayList7.add(blendModeCompanion2);
        int i14 = oldListSize + newListSize;
        int i15 = 1;
        int i16 = (((i14 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i16];
        int i17 = i16 / 2;
        int[] iArr2 = new int[i16];
        ArrayList arrayList8 = new ArrayList();
        while (!arrayList7.isEmpty()) {
            BlendModeCompanion blendModeCompanion3 = (BlendModeCompanion) arrayList7.remove(arrayList7.size() - i15);
            if (blendModeCompanion3.RemoteActionCompatParcelizer() < i15 || blendModeCompanion3.read() < i15) {
                arrayList = arrayList6;
                arrayList7 = arrayList7;
                arrayList2 = arrayList8;
                getdarken0no6vwu = null;
            } else {
                int iRemoteActionCompatParcelizer = ((blendModeCompanion3.read() + blendModeCompanion3.RemoteActionCompatParcelizer()) + i15) / 2;
                int i18 = i15 + i17;
                iArr[i18] = blendModeCompanion3.serializer;
                iArr2[i18] = blendModeCompanion3.RemoteActionCompatParcelizer;
                int i19 = i13;
                while (true) {
                    if (i19 < iRemoteActionCompatParcelizer) {
                        int i20 = Math.abs(blendModeCompanion3.RemoteActionCompatParcelizer() - blendModeCompanion3.read()) % 2 == i15 ? i15 : i13;
                        int iRemoteActionCompatParcelizer2 = blendModeCompanion3.RemoteActionCompatParcelizer();
                        int i21 = blendModeCompanion3.read();
                        int i22 = -i19;
                        int i23 = i22;
                        while (true) {
                            if (i23 > i19) {
                                arrayList = arrayList6;
                                arrayList7 = arrayList7;
                                i2 = i13;
                                arrayList2 = arrayList8;
                                i3 = iRemoteActionCompatParcelizer;
                                getdarken0no6vwu2 = null;
                                break;
                            }
                            if (i23 != i22) {
                                if (i23 != i19) {
                                    i3 = iRemoteActionCompatParcelizer;
                                    if (iArr[i23 + 1 + i17] > iArr[(i23 - 1) + i17]) {
                                    }
                                    arrayList2 = arrayList8;
                                    i9 = ((i8 - blendModeCompanion3.serializer) + blendModeCompanion3.IconCompatParcelizer) - i23;
                                    if (i19 == 0 && i8 == i7) {
                                        i10 = i9 - 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    arrayList = arrayList6;
                                    while (i8 < blendModeCompanion3.RemoteActionCompatParcelizer && i9 < blendModeCompanion3.read && diffUtil$Callback.areItemsTheSame(i8, i9)) {
                                        i8++;
                                        i9++;
                                    }
                                    iArr[i23 + i17] = i8;
                                    if (i20 != 0) {
                                        i12 = (iRemoteActionCompatParcelizer2 - i21) - i23;
                                        i11 = i20;
                                        if (i12 < i22 + 1 && i12 <= i19 - 1 && iArr2[i12 + i17] <= i8) {
                                            getdarken0no6vwu2 = new getDarken0nO6VwU();
                                            getdarken0no6vwu2.serializer = i7;
                                            getdarken0no6vwu2.RemoteActionCompatParcelizer = i10;
                                            getdarken0no6vwu2.write = i8;
                                            getdarken0no6vwu2.read = i9;
                                            i2 = 0;
                                            getdarken0no6vwu2.IconCompatParcelizer = false;
                                            break;
                                        }
                                    } else {
                                        i11 = i20;
                                    }
                                    i23 += 2;
                                    i13 = 0;
                                    arrayList7 = arrayList7;
                                    iRemoteActionCompatParcelizer = i3;
                                    arrayList8 = arrayList2;
                                    arrayList6 = arrayList;
                                    i20 = i11;
                                } else {
                                    i3 = iRemoteActionCompatParcelizer;
                                }
                                i7 = iArr[(i23 - 1) + i17];
                                i8 = i7 + 1;
                                arrayList2 = arrayList8;
                                i9 = ((i8 - blendModeCompanion3.serializer) + blendModeCompanion3.IconCompatParcelizer) - i23;
                                if (i19 == 0) {
                                    i10 = i9;
                                } else {
                                    i10 = i9;
                                }
                                arrayList = arrayList6;
                                while (i8 < blendModeCompanion3.RemoteActionCompatParcelizer) {
                                    i8++;
                                    i9++;
                                }
                                iArr[i23 + i17] = i8;
                                if (i20 != 0) {
                                    i12 = (iRemoteActionCompatParcelizer2 - i21) - i23;
                                    i11 = i20;
                                    if (i12 < i22 + 1) {
                                        continue;
                                    }
                                } else {
                                    i11 = i20;
                                }
                                i23 += 2;
                                i13 = 0;
                                arrayList7 = arrayList7;
                                iRemoteActionCompatParcelizer = i3;
                                arrayList8 = arrayList2;
                                arrayList6 = arrayList;
                                i20 = i11;
                            } else {
                                i3 = iRemoteActionCompatParcelizer;
                            }
                            i7 = iArr[i23 + 1 + i17];
                            i8 = i7;
                            arrayList2 = arrayList8;
                            i9 = ((i8 - blendModeCompanion3.serializer) + blendModeCompanion3.IconCompatParcelizer) - i23;
                            if (i19 == 0) {
                                i10 = i9;
                            } else {
                                i10 = i9;
                            }
                            arrayList = arrayList6;
                            while (i8 < blendModeCompanion3.RemoteActionCompatParcelizer) {
                                i8++;
                                i9++;
                            }
                            iArr[i23 + i17] = i8;
                            if (i20 != 0) {
                                i12 = (iRemoteActionCompatParcelizer2 - i21) - i23;
                                i11 = i20;
                                if (i12 < i22 + 1) {
                                    continue;
                                }
                            } else {
                                i11 = i20;
                            }
                            i23 += 2;
                            i13 = 0;
                            arrayList7 = arrayList7;
                            iRemoteActionCompatParcelizer = i3;
                            arrayList8 = arrayList2;
                            arrayList6 = arrayList;
                            i20 = i11;
                        }
                        if (getdarken0no6vwu2 == null) {
                            int i24 = (blendModeCompanion3.RemoteActionCompatParcelizer() - blendModeCompanion3.read()) % 2 == 0 ? 1 : i2;
                            int iRemoteActionCompatParcelizer3 = blendModeCompanion3.RemoteActionCompatParcelizer() - blendModeCompanion3.read();
                            int i25 = i22;
                            while (true) {
                                if (i25 > i19) {
                                    getdarken0no6vwu2 = null;
                                    break;
                                }
                                if (i25 == i22 || (i25 != i19 && iArr2[i25 + 1 + i17] < iArr2[(i25 - 1) + i17])) {
                                    i4 = iArr2[i25 + 1 + i17];
                                    i5 = i4;
                                } else {
                                    i4 = iArr2[(i25 - 1) + i17];
                                    i5 = i4 - 1;
                                }
                                int i26 = blendModeCompanion3.read - ((blendModeCompanion3.RemoteActionCompatParcelizer - i5) - i25);
                                int i27 = (i19 == 0 || i5 != i4) ? i26 : i26 + 1;
                                while (i5 > blendModeCompanion3.serializer && i26 > blendModeCompanion3.IconCompatParcelizer && diffUtil$Callback.areItemsTheSame(i5 - 1, i26 - 1)) {
                                    i5--;
                                    i26--;
                                }
                                iArr2[i25 + i17] = i5;
                                if (i24 != 0 && (i6 = iRemoteActionCompatParcelizer3 - i25) >= i22 && i6 <= i19 && iArr[i6 + i17] >= i5) {
                                    getdarken0no6vwu2 = new getDarken0nO6VwU();
                                    getdarken0no6vwu2.serializer = i5;
                                    getdarken0no6vwu2.RemoteActionCompatParcelizer = i26;
                                    getdarken0no6vwu2.write = i4;
                                    getdarken0no6vwu2.read = i27;
                                    getdarken0no6vwu2.IconCompatParcelizer = true;
                                    break;
                                }
                                i25 += 2;
                            }
                            if (getdarken0no6vwu2 == null) {
                                i19++;
                                arrayList7 = arrayList7;
                                iRemoteActionCompatParcelizer = i3;
                                arrayList8 = arrayList2;
                                arrayList6 = arrayList;
                                i15 = 1;
                                i13 = 0;
                            }
                        }
                        getdarken0no6vwu = getdarken0no6vwu2;
                    } else {
                        arrayList = arrayList6;
                        arrayList7 = arrayList7;
                        arrayList2 = arrayList8;
                        getdarken0no6vwu = null;
                    }
                }
            }
            if (getdarken0no6vwu != null) {
                if (getdarken0no6vwu.serializer() > 0) {
                    int i28 = getdarken0no6vwu.read;
                    int i29 = getdarken0no6vwu.RemoteActionCompatParcelizer;
                    int i30 = i28 - i29;
                    int i31 = getdarken0no6vwu.write;
                    int i32 = getdarken0no6vwu.serializer;
                    int i33 = i31 - i32;
                    if (i30 == i33) {
                        getcolor0no6vwu = new getColor0nO6VwU(i32, i29, i33);
                    } else if (getdarken0no6vwu.IconCompatParcelizer) {
                        getcolor0no6vwu = new getColor0nO6VwU(i32, i29, getdarken0no6vwu.serializer());
                    } else {
                        getcolor0no6vwu = i30 > i33 ? new getColor0nO6VwU(i32, i29 + 1, getdarken0no6vwu.serializer()) : new getColor0nO6VwU(i32 + 1, i29, getdarken0no6vwu.serializer());
                    }
                    arrayList5 = arrayList;
                    arrayList5.add(getcolor0no6vwu);
                } else {
                    arrayList5 = arrayList;
                }
                if (arrayList2.isEmpty()) {
                    blendModeCompanion = new BlendModeCompanion();
                    arrayList4 = arrayList2;
                    i = 1;
                } else {
                    i = 1;
                    arrayList4 = arrayList2;
                    blendModeCompanion = (BlendModeCompanion) arrayList4.remove(arrayList2.size() - 1);
                }
                blendModeCompanion.serializer = blendModeCompanion3.serializer;
                blendModeCompanion.IconCompatParcelizer = blendModeCompanion3.IconCompatParcelizer;
                blendModeCompanion.RemoteActionCompatParcelizer = getdarken0no6vwu.serializer;
                blendModeCompanion.read = getdarken0no6vwu.RemoteActionCompatParcelizer;
                arrayList3 = arrayList7;
                arrayList3.add(blendModeCompanion);
                blendModeCompanion3.RemoteActionCompatParcelizer = blendModeCompanion3.RemoteActionCompatParcelizer;
                blendModeCompanion3.read = blendModeCompanion3.read;
                blendModeCompanion3.serializer = getdarken0no6vwu.write;
                blendModeCompanion3.IconCompatParcelizer = getdarken0no6vwu.read;
                arrayList3.add(blendModeCompanion3);
            } else {
                arrayList3 = arrayList7;
                arrayList4 = arrayList2;
                arrayList5 = arrayList;
                i = 1;
                arrayList4.add(blendModeCompanion3);
            }
            arrayList6 = arrayList5;
            i15 = i;
            arrayList7 = arrayList3;
            arrayList8 = arrayList4;
            i13 = 0;
        }
        ArrayList arrayList9 = arrayList6;
        Collections.sort(arrayList9, write);
        return new EnterExitTransitionKtshrinkVertically2(diffUtil$Callback, arrayList9, iArr, iArr2);
    }
}
