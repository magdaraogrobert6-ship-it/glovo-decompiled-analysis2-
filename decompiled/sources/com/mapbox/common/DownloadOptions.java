package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class DownloadOptions implements Serializable {
    private final String localPath;
    private final int memoryThreshold;
    private HttpRequest request;
    private boolean resume;

    public String getLocalPath() {
        return this.localPath;
    }

    public int getMemoryThreshold() {
        return this.memoryThreshold;
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public boolean getResume() {
        return this.resume;
    }

    public void setRequest(HttpRequest httpRequest) {
        this.request = httpRequest;
    }

    public void setResume(boolean z) {
        this.resume = z;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.request, this.localPath, Boolean.valueOf(this.resume), Integer.valueOf(this.memoryThreshold));
    }

    public DownloadOptions(HttpRequest httpRequest, String str) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = false;
        this.memoryThreshold = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[request: ");
        sb.append(RecordUtils.fieldToString(this.request));
        sb.append(", localPath: ");
        IconCompatParcelizer.read(sb, this.localPath, ", resume: ");
        MediaSessionCompatQueueItem.write(sb, this.resume, ", memoryThreshold: ");
        return SweepGradientShader9KIMszodefault.serializer(this.memoryThreshold, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) obj;
        return Objects.equals(this.request, downloadOptions.request) && Objects.equals(this.localPath, downloadOptions.localPath) && this.resume == downloadOptions.resume && this.memoryThreshold == downloadOptions.memoryThreshold;
    }

    public DownloadOptions(HttpRequest httpRequest, String str, boolean z, int i) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = z;
        this.memoryThreshold = i;
    }
}
