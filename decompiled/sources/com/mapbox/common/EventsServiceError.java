package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class EventsServiceError implements Serializable {
    private final EventsServiceErrorCode code;
    private final String message;

    public EventsServiceErrorCode getCode() {
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

    public EventsServiceError(EventsServiceErrorCode eventsServiceErrorCode, String str) {
        this.code = eventsServiceErrorCode;
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
        EventsServiceError eventsServiceError = (EventsServiceError) obj;
        return Objects.equals(this.code, eventsServiceError.code) && Objects.equals(this.message, eventsServiceError.message);
    }
}
