package o;

import com.sentiance.sdk.eventtimeline.api.TripLocationUpdatesListener;

/* JADX INFO: loaded from: classes3.dex */
public final class parseStringAsLong {
    private final int IconCompatParcelizer;
    private final TripLocationUpdatesListener serializer;

    public final TripLocationUpdatesListener IconCompatParcelizer() {
        return this.serializer;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return this.serializer.hashCode() + (Integer.hashCode(this.IconCompatParcelizer) * 31);
    }

    public parseStringAsLong(int i, TripLocationUpdatesListener tripLocationUpdatesListener) {
        tripLocationUpdatesListener.getClass();
        this.IconCompatParcelizer = i;
        this.serializer = tripLocationUpdatesListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseStringAsLong)) {
            return false;
        }
        parseStringAsLong parsestringaslong = (parseStringAsLong) obj;
        return this.IconCompatParcelizer == parsestringaslong.IconCompatParcelizer && this.serializer.equals(parsestringaslong.serializer);
    }

    public final String toString() {
        return "TripLocationsRequest(intervalInSeconds=" + this.IconCompatParcelizer + ", callback=" + this.serializer + ')';
    }
}
