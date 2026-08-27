package o;

import com.sentiance.core.model.tile.gis.GisTileV1;
import com.sentiance.sdk.InjectUsing;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "ProtoGisTileParser")
public final class DataStoreProviderb extends r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI<GisTileV1> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreProviderb(parseLonglambda0 parselonglambda0, getEventName geteventname) {
        super(parselonglambda0, geteventname);
        parselonglambda0.getClass();
        geteventname.getClass();
    }

    @Override // o.r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI
    public final GisTileV1 serializer(InputStream inputStream) throws IOException {
        GisTileV1 from = GisTileV1.parseFrom(inputStream);
        from.getClass();
        return from;
    }
}
