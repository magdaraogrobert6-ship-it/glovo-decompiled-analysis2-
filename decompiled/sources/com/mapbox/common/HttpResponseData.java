package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class HttpResponseData implements Serializable {
    private final int code;
    private final byte[] data;
    private final HashMap<String, String> headers;

    public int getCode() {
        return this.code;
    }

    public byte[] getData() {
        return this.data;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.headers, Integer.valueOf(this.code), Integer.valueOf(Arrays.hashCode(this.data)));
    }

    public HttpResponseData(HashMap<String, String> map, int i, byte[] bArr) {
        this.headers = map;
        this.code = i;
        this.data = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[headers: ");
        sb.append(RecordUtils.fieldToString(this.headers));
        sb.append(", code: ");
        IconCompatParcelizer.write(this.code, ", data: ", sb);
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponseData httpResponseData = (HttpResponseData) obj;
        return Objects.equals(this.headers, httpResponseData.headers) && this.code == httpResponseData.code && Arrays.equals(this.data, httpResponseData.data);
    }
}
