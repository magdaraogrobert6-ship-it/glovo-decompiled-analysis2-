package o;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvInputComposite1cp implements accessgetTvInputComposite2cp {
    public static final accessgetTvInputComposite1cp read = new accessgetTvInputComposite1cp();

    @Override // o.accessgetTvInputComposite2cp
    public final long IconCompatParcelizer() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o.accessgetTvInputComposite2cp
    public final long serializer() {
        return System.currentTimeMillis();
    }
}
