package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class TransferError implements Serializable {
    private final TransferErrorCode code;
    private final String message;

    public TransferErrorCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.code, this.message);
    }

    public TransferError(TransferErrorCode transferErrorCode, String str) {
        this.code = transferErrorCode;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[code: ");
        sb.append(RecordUtils.fieldToString(this.code));
        sb.append(", message: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.message, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferError transferError = (TransferError) obj;
        return Objects.equals(this.code, transferError.code) && Objects.equals(this.message, transferError.message);
    }
}
