package o;

import android.location.Location;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class _set_isDismissed_lambda0 {
    private static boolean write(Location location, Location location2) {
        return ((double) (location.distanceTo(location2) / ((float) (Math.abs(location.getTime() - location2.getTime()) / 1000)))) <= 83.33d;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    public static List read(ArrayList arrayList) {
        Integer numValueOf;
        isValidCardlambda0 isvalidcardlambda0;
        int i;
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it = arrayList.iterator();
                i = 0;
                while (it.hasNext()) {
                    Location location = (Location) it.next();
                    if (location != arrayList.get(i2) && write(location, (Location) arrayList.get(i2)) && (i = i + 1) < 0) {
                        androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                        throw null;
                    }
                }
            }
            iArr[i2] = i;
        }
        HashMap map = new HashMap();
        if (size == 0) {
            numValueOf = null;
        } else {
            int i3 = iArr[0];
            int i4 = size - 1;
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    int i6 = iArr[i5];
                    if (i3 < i6) {
                        i3 = i6;
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5++;
                }
            }
            numValueOf = Integer.valueOf(i3);
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                if (iArr[i9] == iIntValue) {
                    i7++;
                    map.put(Integer.valueOf(i8), Integer.valueOf(i7));
                } else {
                    i8 = i9 + 1;
                    i7 = 0;
                }
            }
            Collection collectionValues = map.values();
            collectionValues.getClass();
            Integer num = (Integer) onContentCardDismissed.MediaSessionCompatQueueItem(collectionValues);
            if (num != null) {
                int iIntValue2 = num.intValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((Number) entry.getValue()).intValue() == iIntValue2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Integer num2 = (Integer) onContentCardDismissed.serializer((Iterable) linkedHashMap.keySet());
                if (num2 != null) {
                    int iIntValue3 = num2.intValue();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList.subList(iIntValue3, iIntValue2 + iIntValue3));
                    isvalidcardlambda0 = new isValidCardlambda0(iIntValue3, arrayList2);
                } else {
                    isvalidcardlambda0 = null;
                }
            } else {
                isvalidcardlambda0 = null;
            }
        } else {
            isvalidcardlambda0 = null;
        }
        if (isvalidcardlambda0 == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList3 = new ArrayList(isvalidcardlambda0.write());
        int size2 = ((ArrayList) isvalidcardlambda0.write()).size() + isvalidcardlambda0.IconCompatParcelizer();
        int size3 = arrayList.size();
        while (true) {
            if (size2 >= size3) {
                break;
            }
            Location location2 = (Location) arrayList.get(size2);
            Location location3 = (Location) onContentCardDismissed.MediaDescriptionCompat((List) arrayList3);
            location3.getClass();
            if (write(location3, location2)) {
                Location location4 = size2 > 0 ? (Location) arrayList.get(size2 - 1) : null;
                boolean z = location3.distanceTo(location2) < ((float) (location4 != null ? (int) location4.distanceTo(location2) : Integer.MAX_VALUE));
                if (location4 == null || location4 == location3 || !write(location4, location2) || z) {
                    arrayList3.add(location2);
                }
            }
            size2++;
        }
        isValidCardlambda0 isvalidcardlambda1 = new isValidCardlambda0(isvalidcardlambda0.IconCompatParcelizer(), arrayList3);
        ArrayList arrayList4 = new ArrayList(isvalidcardlambda1.write());
        int iIconCompatParcelizer = isvalidcardlambda1.IconCompatParcelizer() - 1;
        while (-1 < iIconCompatParcelizer) {
            Location location5 = (Location) arrayList.get(iIconCompatParcelizer);
            Location location6 = (Location) onContentCardDismissed.read((List) arrayList4);
            location6.getClass();
            if (write(location6, location5)) {
                Location location7 = iIconCompatParcelizer < arrayList.size() - 1 ? (Location) arrayList.get(iIconCompatParcelizer + 1) : null;
                boolean z2 = location6.distanceTo(location5) < ((float) (location7 != null ? (int) location7.distanceTo(location5) : Integer.MAX_VALUE));
                if (location7 == null || location7 == location6 || !write(location7, location5) || z2) {
                    arrayList4.add(0, location5);
                }
            }
            iIconCompatParcelizer--;
        }
        return arrayList4;
    }
}
