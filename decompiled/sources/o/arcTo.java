package o;

import android.os.Bundle;
import com.google.re2j.Machine$Queue;

/* JADX INFO: loaded from: classes.dex */
public final class arcTo {
    public final Machine$Queue RemoteActionCompatParcelizer;

    public arcTo(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(arcTo.class.getClassLoader());
        this.RemoteActionCompatParcelizer = new Machine$Queue(bundle);
    }

    public arcTo(cubicTo cubicto) {
        this.RemoteActionCompatParcelizer = new Machine$Queue(cubicto, cubicto.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer);
    }
}
