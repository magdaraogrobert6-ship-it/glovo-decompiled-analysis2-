package kotlinx.serialization.json.internal;

import androidx.room.RoomDatabase$createConnectionManager$3;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonElementMarker {
    public boolean read;
    public final r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0 serializer;

    public JsonElementMarker(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.serializer = new r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0(r8lambda92m0p9sit5uf70mvjf4rwmruda, new RoomDatabase$createConnectionManager$3(2, this, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 4));
    }
}
