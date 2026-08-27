package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class BillingServiceError implements Serializable {
    private final BillingServiceErrorCode code;
    private final String message;

    public BillingServiceErrorCode getCode() {
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

    public BillingServiceError(BillingServiceErrorCode billingServiceErrorCode, String str) {
        this.code = billingServiceErrorCode;
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
        BillingServiceError billingServiceError = (BillingServiceError) obj;
        return Objects.equals(this.code, billingServiceError.code) && Objects.equals(this.message, billingServiceError.message);
    }
}
