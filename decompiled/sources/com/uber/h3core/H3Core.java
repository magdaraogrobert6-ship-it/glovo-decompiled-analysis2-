package com.uber.h3core;

import com.uber.h3core.util.LatLng;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes4.dex */
public final class H3Core {
    public final NativeMethods h3Api;

    public static int getResolution(String str) {
        return (int) ((Long.parseUnsignedLong(str, 16) & 67553994410557440L) >> 52);
    }

    public H3Core(NativeMethods nativeMethods) {
        this.h3Api = nativeMethods;
    }

    public static H3Core newSystemInstance() {
        int i = H3CoreLoader.$r8$clinit;
        System.loadLibrary("h3-java");
        return new H3Core(new NativeMethods());
    }

    public final ArrayList cellAddressesToMultiPolygon(Collection collection) {
        long[] array = ((List) collection.stream().map(new H3Core$$ExternalSyntheticLambda2(0, this)).collect(Collectors.toList())).stream().mapToLong(new H3Core$$ExternalSyntheticLambda1(0)).toArray();
        ArrayList<List<List<LatLng>>> arrayList = new ArrayList<>();
        this.h3Api.cellsToLinkedMultiPolygon(array, arrayList);
        Iterator<List<List<LatLng>>> it = arrayList.iterator();
        while (it.hasNext()) {
            for (List<LatLng> list : it.next()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    LatLng latLng = list.get(i);
                    list.set(i, new LatLng(Math.toDegrees(latLng.lat), Math.toDegrees(latLng.lng)));
                }
                if (list.size() > 0) {
                    list.add(list.get(0));
                }
            }
        }
        return arrayList;
    }

    public final List uncompactCellAddresses(int i, List list) {
        List list2 = (List) list.stream().map(new H3Core$$ExternalSyntheticLambda2(0, this)).collect(Collectors.toList());
        if (i < 0 || i > 15) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("resolution %d is out of range (must be 0 <= res <= 15)", new Object[]{Integer.valueOf(i)});
            return null;
        }
        long[] array = list2.stream().mapToLong(new H3Core$$ExternalSyntheticLambda1(0)).toArray();
        NativeMethods nativeMethods = this.h3Api;
        long jUncompactCellsSize = nativeMethods.uncompactCellsSize(array, i);
        if (jUncompactCellsSize < 0 || jUncompactCellsSize > 2147483647L) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("size %d is out of range", new Object[]{Long.valueOf(jUncompactCellsSize)});
            return null;
        }
        int i2 = (int) jUncompactCellsSize;
        long[] jArr = new long[i2];
        nativeMethods.uncompactCells(array, i, jArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return (List) arrayList.stream().map(new H3Core$$ExternalSyntheticLambda3(0, this)).collect(Collectors.toList());
    }
}
