package o;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class EventCreationRequest {
    public BigInteger read;
    public BigInteger serializer;
    public BigInteger write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.write.hashCode();
        BigInteger bigInteger = this.read;
        return (iHashCode ^ iHashCode2) ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EventCreationRequest)) {
            return false;
        }
        EventCreationRequest eventCreationRequest = (EventCreationRequest) obj;
        BigInteger bigInteger = this.read;
        BigInteger bigInteger2 = eventCreationRequest.read;
        if (bigInteger != null) {
            if (!bigInteger.equals(bigInteger2)) {
                return false;
            }
        } else if (bigInteger2 != null) {
            return false;
        }
        return eventCreationRequest.serializer.equals(this.serializer) && eventCreationRequest.write.equals(this.write);
    }
}
