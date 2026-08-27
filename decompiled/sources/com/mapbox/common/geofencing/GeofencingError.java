package com.mapbox.common.geofencing;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class GeofencingError implements Serializable {
    private final String message;
    private final GeofencingErrorType type;

    public final String getMessage() {
        return this.message;
    }

    public final GeofencingErrorType getType() {
        return this.type;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private String message;
        private GeofencingErrorType type;

        public final String getMessage() {
            return this.message;
        }

        public final GeofencingErrorType getType() {
            return this.type;
        }

        public Builder(GeofencingErrorType geofencingErrorType, String str) {
            geofencingErrorType.getClass();
            str.getClass();
            this.type = geofencingErrorType;
            this.message = str;
        }

        /* JADX INFO: renamed from: setMessage, reason: collision with other method in class */
        public final /* synthetic */ void m4548setMessage(String str) {
            str.getClass();
            this.message = str;
        }

        /* JADX INFO: renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m4549setType(GeofencingErrorType geofencingErrorType) {
            geofencingErrorType.getClass();
            this.type = geofencingErrorType;
        }

        public final GeofencingError build() {
            GeofencingErrorType geofencingErrorType = this.type;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (geofencingErrorType == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of GeofencingError through GeofencingError.Builder because type was null.");
                return null;
            }
            if (this.message == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of GeofencingError through GeofencingError.Builder because message was null.");
                return null;
            }
            geofencingErrorType.getClass();
            String str = this.message;
            str.getClass();
            return new GeofencingError(geofencingErrorType, str, defaultConstructorMarker);
        }

        public final Builder setMessage(String str) {
            str.getClass();
            this.message = str;
            return this;
        }

        public final Builder setType(GeofencingErrorType geofencingErrorType) {
            geofencingErrorType.getClass();
            this.type = geofencingErrorType;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public final Builder toBuilder() {
        return new Builder(this.type, this.message).setType(this.type).setMessage(this.message);
    }

    private GeofencingError(GeofencingErrorType geofencingErrorType, String str) {
        this.type = geofencingErrorType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeofencingError)) {
            return false;
        }
        GeofencingError geofencingError = (GeofencingError) obj;
        if (this.type != geofencingError.type) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, geofencingError.message}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeofencingError(type=");
        sb.append(this.type);
        sb.append(", message=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.message, ')');
    }

    public /* synthetic */ GeofencingError(GeofencingErrorType geofencingErrorType, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(geofencingErrorType, str);
    }
}
