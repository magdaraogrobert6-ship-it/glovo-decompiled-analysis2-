package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class PersistentStorageError implements Serializable {
    private final PersistentStorageErrorCode code;
    private final String message;

    public PersistentStorageErrorCode getCode() {
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

    public PersistentStorageError(PersistentStorageErrorCode persistentStorageErrorCode, String str) {
        this.code = persistentStorageErrorCode;
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
        PersistentStorageError persistentStorageError = (PersistentStorageError) obj;
        return Objects.equals(this.code, persistentStorageError.code) && Objects.equals(this.message, persistentStorageError.message);
    }
}
