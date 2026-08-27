package o;

import com.sentiance.sdk.ondevice.api.SensorDataChunk;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class parseObjectAsInteger implements Iterator<SensorDataChunk> {
    private final parsePayloadFieldsFromBundle IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private final String write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write) > 0;
    }

    @Override // java.util.Iterator
    public final SensorDataChunk next() {
        SensorDataChunk sensorDataChunkIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write);
        this.RemoteActionCompatParcelizer += sensorDataChunkIconCompatParcelizer.getTimestamps().length;
        return sensorDataChunkIconCompatParcelizer;
    }

    public parseObjectAsInteger(String str, parsePayloadFieldsFromBundle parsepayloadfieldsfrombundle) {
        this.write = str;
        this.IconCompatParcelizer = parsepayloadfieldsfrombundle;
    }
}
