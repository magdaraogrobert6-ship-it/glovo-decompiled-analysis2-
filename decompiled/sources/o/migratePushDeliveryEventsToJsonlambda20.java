package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class migratePushDeliveryEventsToJsonlambda20 {
    private Boolean read;

    public final boolean RemoteActionCompatParcelizer() {
        return this.read != null;
    }

    public static migratePushDeliveryEventsToJsonlambda20 a(Boolean bool) {
        migratePushDeliveryEventsToJsonlambda20 migratepushdeliveryeventstojsonlambda20 = new migratePushDeliveryEventsToJsonlambda20();
        migratepushdeliveryeventstojsonlambda20.read = bool;
        return migratepushdeliveryeventstojsonlambda20;
    }

    public final String toString() {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        Boolean bool = this.read;
        StringBuilder sb = new StringBuilder();
        sb.append(bool);
        return sb.toString();
    }

    public final int hashCode() {
        Boolean bool = this.read;
        if (bool == null) {
            return 2;
        }
        return bool.booleanValue() ? 1 : 0;
    }

    public final boolean read() {
        Boolean bool = this.read;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Boolean serializer() {
        if (!RemoteActionCompatParcelizer()) {
            return null;
        }
        Boolean bool = this.read;
        if (bool != null) {
            return bool;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Value not present");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || migratePushDeliveryEventsToJsonlambda20.class != obj.getClass()) {
            return false;
        }
        Boolean bool = this.read;
        Boolean bool2 = ((migratePushDeliveryEventsToJsonlambda20) obj).read;
        if (bool != null) {
            return bool.equals(bool2);
        }
        return bool2 == null;
    }
}
