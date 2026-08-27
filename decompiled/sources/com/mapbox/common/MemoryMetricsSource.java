package com.mapbox.common;

import android.os.Debug;
import com.mapbox.bindgen.Value;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class MemoryMetricsSource implements MetricsSource {
    public static final Companion Companion = new Companion(null);
    private static final onViewDetachedFromWindowlambda1 instance$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.MemoryMetricsSource$Companion$instance$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final MemoryMetricsSource invoke() {
            return new MemoryMetricsSource(null);
        }
    }});
    private static final String prefix = "mapbox/common/tracker/android/";

    public /* synthetic */ MemoryMetricsSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.mapbox.common.MetricsSource
    public List<Metrics> getMetrics() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        Map<String, String> memoryStats = memoryInfo.getMemoryStats();
        memoryStats.getClass();
        ArrayList arrayList = new ArrayList(memoryStats.size());
        for (Map.Entry<String, String> entry : memoryStats.entrySet()) {
            String str = prefix + entry.getKey();
            String value = entry.getValue();
            value.getClass();
            arrayList.add(new Metrics(str, toMetricValue(value)));
        }
        return arrayList;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MemoryMetricsSource getInstance() {
            return (MemoryMetricsSource) MemoryMetricsSource.instance$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    private MemoryMetricsSource() {
    }

    private final Value toMetricValue(String str) {
        try {
            return ValueUtilsKt.toValue(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            return ValueUtilsKt.toValue(str);
        }
    }
}
