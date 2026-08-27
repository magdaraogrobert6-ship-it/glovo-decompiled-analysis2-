package o;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
public class clean {
    private final long IconCompatParcelizer;
    private final EnumMap read = new EnumMap(ClassifiedTransportMode.class);
    private ClassifiedTransportMode serializer;
    private final long write;

    public clean(long j, long j2) {
        this.write = j;
        this.IconCompatParcelizer = j2;
    }

    public final void IconCompatParcelizer(ClassifiedTransportMode classifiedTransportMode, float f) {
        this.read.put(classifiedTransportMode, Float.valueOf(f));
    }

    public final void serializer(ClassifiedTransportMode classifiedTransportMode) {
        this.serializer = classifiedTransportMode;
    }
}
