package o;

import com.sentiance.core.model.tile.direction.DirectionTileV1;
import com.sentiance.protobuf.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14 extends DataStoreProviderk {
    private final String IconCompatParcelizer;
    private final DirectionTileV1 read;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final ByteString IconCompatParcelizer() {
        this.write.invoke(this.IconCompatParcelizer);
        ByteString directionFeatures = this.read.getDirectionFeatures();
        directionFeatures.getClass();
        return directionFeatures;
    }

    public r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14(String str, DirectionTileV1 directionTileV1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        directionTileV1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.IconCompatParcelizer = str;
        this.read = directionTileV1;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
