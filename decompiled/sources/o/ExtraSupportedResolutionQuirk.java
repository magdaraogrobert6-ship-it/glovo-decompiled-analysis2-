package o;

/* JADX INFO: loaded from: classes.dex */
public final class ExtraSupportedResolutionQuirk {
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;

    public ExtraSupportedResolutionQuirk(String str, int i, int i2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.serializer = -1;
    }

    public ExtraSupportedResolutionQuirk(String str, int i, int i2, int i3) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.serializer = i3;
    }
}
