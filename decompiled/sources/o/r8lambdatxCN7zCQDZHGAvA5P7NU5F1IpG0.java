package o;

import com.sentiance.core.model.tile.speed.SpeedTileV1;
import com.sentiance.sdk.InjectUsing;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "ProtoSpeedTileParser")
public final class r8lambdatxCN7zCQDZHGAvA5P7NU5F1IpG0 extends r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI<SpeedTileV1> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdatxCN7zCQDZHGAvA5P7NU5F1IpG0(parseLonglambda0 parselonglambda0, getEventName geteventname) {
        super(parselonglambda0, geteventname);
        parselonglambda0.getClass();
        geteventname.getClass();
    }

    @Override // o.r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI
    public final SpeedTileV1 serializer(InputStream inputStream) throws IOException {
        SpeedTileV1 from = SpeedTileV1.parseFrom(inputStream);
        from.getClass();
        return from;
    }
}
