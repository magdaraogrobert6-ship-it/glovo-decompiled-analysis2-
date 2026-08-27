package o;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorResources_androidKt {
    public static final String write;
    public getTheme IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;

    static {
        String str;
        try {
            str = placeAtf8xVGno.read().getCacheDir().getCanonicalPath() + File.separator + "tileFile";
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("TileCacheManager", "failed to get tile cache file path");
            str = "";
        }
        write = str;
    }

    public ColorResources_androidKt(int i, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
    }
}
