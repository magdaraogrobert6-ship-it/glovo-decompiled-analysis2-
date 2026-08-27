package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getMinMax implements Runnable {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ NoWindowInsetsAnimation RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ String write;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.read;
        this.RemoteActionCompatParcelizer.read(this.serializer, obj, this.write, this.IconCompatParcelizer);
    }

    public getMinMax(NoWindowInsetsAnimation noWindowInsetsAnimation, String str, String str2, Object obj, long j) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = obj;
        this.serializer = j;
        this.RemoteActionCompatParcelizer = noWindowInsetsAnimation;
    }
}
