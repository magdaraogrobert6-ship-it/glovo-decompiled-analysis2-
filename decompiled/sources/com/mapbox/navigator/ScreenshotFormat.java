package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class ScreenshotFormat implements Serializable {
    private final String base64;
    private final DataRef jpeg;

    public String getBase64() {
        return this.base64;
    }

    public DataRef getJpeg() {
        return this.jpeg;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.jpeg, this.base64);
    }

    public ScreenshotFormat(DataRef dataRef, String str) {
        this.jpeg = dataRef;
        this.base64 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[jpeg: ");
        sb.append(RecordUtils.fieldToString(this.jpeg));
        sb.append(", base64: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.base64, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScreenshotFormat screenshotFormat = (ScreenshotFormat) obj;
        return Objects.equals(this.jpeg, screenshotFormat.jpeg) && Objects.equals(this.base64, screenshotFormat.base64);
    }
}
