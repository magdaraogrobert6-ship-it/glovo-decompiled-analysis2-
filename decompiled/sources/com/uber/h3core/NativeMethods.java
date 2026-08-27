package com.uber.h3core;

import com.uber.h3core.util.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class NativeMethods {
    public native void cellsToLinkedMultiPolygon(long[] jArr, ArrayList<List<List<LatLng>>> arrayList);

    public native void uncompactCells(long[] jArr, int i, long[] jArr2);

    public native long uncompactCellsSize(long[] jArr, int i);
}
