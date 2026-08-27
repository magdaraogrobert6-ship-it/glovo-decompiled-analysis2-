package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onCardUpdate implements Runnable {
    public final /* synthetic */ ArrayList IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ ICardListener read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ long write;

    @Override // java.lang.Runnable
    public final void run() {
        ICardListener.IconCompatParcelizer(this.read, this.serializer, this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer);
    }

    public /* synthetic */ onCardUpdate(ICardListener iCardListener, String str, long j, long j2, ArrayList arrayList) {
        this.read = iCardListener;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
        this.IconCompatParcelizer = arrayList;
    }
}
