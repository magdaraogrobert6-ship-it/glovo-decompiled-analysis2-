package o;

import com.sentiance.core.model.tile.direction.DirectionTileV1;
import com.sentiance.sdk.InjectUsing;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "ProtoRoadDirectionTileParser")
public final class r8lambdaEOFsOgwC2Lreu4qjeRYYWDUYqVo extends r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI<DirectionTileV1> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaEOFsOgwC2Lreu4qjeRYYWDUYqVo(parseLonglambda0 parselonglambda0, getEventName geteventname) {
        super(parselonglambda0, geteventname);
        parselonglambda0.getClass();
        geteventname.getClass();
    }

    @Override // o.r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI
    public final DirectionTileV1 serializer(InputStream inputStream) throws IOException {
        DirectionTileV1 from = DirectionTileV1.parseFrom(inputStream);
        from.getClass();
        return from;
    }
}
