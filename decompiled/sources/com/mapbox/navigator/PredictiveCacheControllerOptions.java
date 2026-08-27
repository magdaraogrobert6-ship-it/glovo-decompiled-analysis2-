package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class PredictiveCacheControllerOptions implements Serializable {
    private final int concurrency;
    private final CacheDataDomain dataDomain;
    private final String dataset;
    private final long maxAverageDownloadBytesPerSecond;
    private final String version;

    public int getConcurrency() {
        return this.concurrency;
    }

    public CacheDataDomain getDataDomain() {
        return this.dataDomain;
    }

    public String getDataset() {
        return this.dataset;
    }

    public long getMaxAverageDownloadBytesPerSecond() {
        return this.maxAverageDownloadBytesPerSecond;
    }

    public String getVersion() {
        return this.version;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.version, this.dataset, this.dataDomain, Integer.valueOf(this.concurrency), Long.valueOf(this.maxAverageDownloadBytesPerSecond));
    }

    public PredictiveCacheControllerOptions(String str, String str2, CacheDataDomain cacheDataDomain, int i, long j) {
        this.version = str;
        this.dataset = str2;
        this.dataDomain = cacheDataDomain;
        this.concurrency = i;
        this.maxAverageDownloadBytesPerSecond = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[version: ");
        IconCompatParcelizer.read(sb, this.version, ", dataset: ");
        IconCompatParcelizer.read(sb, this.dataset, ", dataDomain: ");
        sb.append(RecordUtils.fieldToString(this.dataDomain));
        sb.append(", concurrency: ");
        IconCompatParcelizer.write(this.concurrency, ", maxAverageDownloadBytesPerSecond: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.maxAverageDownloadBytesPerSecond, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PredictiveCacheControllerOptions predictiveCacheControllerOptions = (PredictiveCacheControllerOptions) obj;
        return Objects.equals(this.version, predictiveCacheControllerOptions.version) && Objects.equals(this.dataset, predictiveCacheControllerOptions.dataset) && Objects.equals(this.dataDomain, predictiveCacheControllerOptions.dataDomain) && this.concurrency == predictiveCacheControllerOptions.concurrency && this.maxAverageDownloadBytesPerSecond == predictiveCacheControllerOptions.maxAverageDownloadBytesPerSecond;
    }
}
