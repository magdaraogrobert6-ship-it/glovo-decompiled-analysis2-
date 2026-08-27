package o;

import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchProvideStructure extends CompositionLocalsKtLocalHapticFeedback1 {
    public final void IconCompatParcelizer(int i) {
        RemoteActionCompatParcelizer();
        ((GaugeMetadata) this.RemoteActionCompatParcelizer).setMaxEncouragedAppJavaHeapMemoryKb(i);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        RemoteActionCompatParcelizer();
        ((GaugeMetadata) this.RemoteActionCompatParcelizer).setMaxAppJavaHeapMemoryKb(i);
    }

    public final void serializer(int i) {
        RemoteActionCompatParcelizer();
        ((GaugeMetadata) this.RemoteActionCompatParcelizer).setDeviceRamSizeKb(i);
    }

    public dispatchProvideStructure(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
