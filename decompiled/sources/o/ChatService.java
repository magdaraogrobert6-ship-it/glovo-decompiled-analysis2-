package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ChatService extends setEvaluationsfwf_client_release {
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] write;

    public ChatService(getStructure getstructure, byte[] bArr) {
        super((Object) getstructure, false);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.serializer(bArr, 0, 32);
        this.write = accessbootstrapIfNeeded.serializer(bArr, 32, bArr.length);
    }

    public ChatService(getStructure getstructure, byte[] bArr, byte[] bArr2) {
        super((Object) getstructure, false);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
    }
}
