package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class isTestSend {
    private final Map<String, String> RemoteActionCompatParcelizer;
    private final Byte write;

    public final Map<String, String> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Byte serializer() {
        return this.write;
    }

    public isTestSend(Map<String, String> map, Byte b) {
        this.RemoteActionCompatParcelizer = map;
        this.write = b;
    }
}
