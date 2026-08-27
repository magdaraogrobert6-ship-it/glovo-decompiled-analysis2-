package com.deliveryhero.perseus.data.remote.api.model;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class HitsResponse {

    @SerializedName("errors")
    private List<Object> errors;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private String status;

    @SerializedName("timestamp")
    private String timestamp;

    public final List<Object> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final void setErrors(List<Object> list) {
        this.errors = list;
    }

    public HitsResponse(String str, String str2, String str3, List<Object> list) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.status = str;
        this.timestamp = str2;
        this.message = str3;
        this.errors = list;
    }

    public final void setMessage(String str) {
        str.getClass();
        this.message = str;
    }

    public final void setStatus(String str) {
        str.getClass();
        this.status = str;
    }

    public final void setTimestamp(String str) {
        str.getClass();
        this.timestamp = str;
    }

    public /* synthetic */ HitsResponse(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : list);
    }
}
