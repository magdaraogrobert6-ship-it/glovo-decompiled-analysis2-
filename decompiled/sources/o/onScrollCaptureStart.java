package o;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onScrollCaptureStart {
    public static final String IconCompatParcelizer;
    public static final String RemoteActionCompatParcelizer;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(onPrepareActionMode.IconCompatParcelizer(placeAtf8xVGno.read()));
        String str = File.separator;
        sb.append(str);
        IconCompatParcelizer = sb.toString();
        RemoteActionCompatParcelizer = onPrepareActionMode.IconCompatParcelizer(placeAtf8xVGno.read()) + str + "libVdr.so";
    }
}
