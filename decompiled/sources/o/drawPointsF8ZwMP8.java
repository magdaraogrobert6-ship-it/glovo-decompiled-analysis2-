package o;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class drawPointsF8ZwMP8 implements drawImage9jGpkUE {
    public static final Set serializer = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", com.adjust.sdk.Constants.SCHEME)));
    public final drawImage9jGpkUE read;

    @Override // o.drawImage9jGpkUE
    public final boolean write(Object obj) {
        return serializer.contains(((Uri) obj).getScheme());
    }

    public drawPointsF8ZwMP8(drawImage9jGpkUE drawimage9jgpkue) {
        this.read = drawimage9jgpkue;
    }

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        return this.read.RemoteActionCompatParcelizer(new modulate5vOe2sY(((Uri) obj).toString(), obtainStrokePaint.IconCompatParcelizer), i, i2, geteotffuncui_graphics);
    }
}
