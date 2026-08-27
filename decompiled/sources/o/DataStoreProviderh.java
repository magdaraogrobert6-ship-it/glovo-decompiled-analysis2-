package o;

import com.sentiance.core.model.tile.speed.SpeedTileV1;
import com.sentiance.protobuf.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class DataStoreProviderh extends DataStoreProviderk {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    private final SpeedTileV1 read;
    private final String serializer;

    public final ByteString read() {
        this.RemoteActionCompatParcelizer.invoke(this.serializer);
        ByteString speedLimits = this.read.getSpeedLimits();
        speedLimits.getClass();
        return speedLimits;
    }

    public DataStoreProviderh(String str, SpeedTileV1 speedTileV1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        speedTileV1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.serializer = str;
        this.read = speedTileV1;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
