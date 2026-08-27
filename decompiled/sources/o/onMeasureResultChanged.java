package o;

/* JADX INFO: loaded from: classes.dex */
public final class onMeasureResultChanged {
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final int write;

    public onMeasureResultChanged(int i, String str, String str2) {
        this.write = i;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
    }

    public /* synthetic */ onMeasureResultChanged(int i, int i2, String str) {
        this(i, (String) null, (i2 & 4) != 0 ? null : str);
    }
}
