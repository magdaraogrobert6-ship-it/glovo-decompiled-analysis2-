package com.mapbox.common.http_backend;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.ReadStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseData implements Serializable {
    private final int code;
    private final ReadStream dataStream;
    private final HashMap<String, String> headers;

    public int getCode() {
        return this.code;
    }

    public ReadStream getDataStream() {
        return this.dataStream;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        HashMap<String, String> map = this.headers;
        int i = this.code;
        return Objects.hash(map, Integer.valueOf(i), this.dataStream);
    }

    public ResponseData(HashMap<String, String> map, int i, ReadStream readStream) {
        this.headers = map;
        this.code = i;
        this.dataStream = readStream;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[headers: ");
        sb.append(RecordUtils.fieldToString(this.headers));
        sb.append(", code: ");
        IconCompatParcelizer.write(this.code, ", dataStream: ", sb);
        sb.append(RecordUtils.fieldToString(this.dataStream));
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
        ResponseData responseData = (ResponseData) obj;
        return Objects.equals(this.headers, responseData.headers) && this.code == responseData.code && Objects.equals(this.dataStream, responseData.dataStream);
    }
}
