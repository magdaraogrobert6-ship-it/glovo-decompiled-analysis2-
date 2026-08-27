package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class addProperty {
    private final ClassifiedTransportMode IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final long read;
    private final Map<ClassifiedTransportMode, Float> write;

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final ClassifiedTransportMode read() {
        return this.IconCompatParcelizer;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.read);
        return this.write.hashCode() + ((this.IconCompatParcelizer.hashCode() + iM) * 31);
    }

    public addProperty(long j, long j2, ClassifiedTransportMode classifiedTransportMode, Map<ClassifiedTransportMode, Float> map) {
        classifiedTransportMode.getClass();
        map.getClass();
        this.RemoteActionCompatParcelizer = j;
        this.read = j2;
        this.IconCompatParcelizer = classifiedTransportMode;
        this.write = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addProperty)) {
            return false;
        }
        addProperty addproperty = (addProperty) obj;
        return this.RemoteActionCompatParcelizer == addproperty.RemoteActionCompatParcelizer && this.read == addproperty.read && this.IconCompatParcelizer == addproperty.IconCompatParcelizer && this.write.equals(addproperty.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostProcessedTransportClassification(startTime=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", endTime=");
        sb.append(this.read);
        sb.append(", transportMode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", probabilities=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, (Map) this.write, ')');
    }
}
