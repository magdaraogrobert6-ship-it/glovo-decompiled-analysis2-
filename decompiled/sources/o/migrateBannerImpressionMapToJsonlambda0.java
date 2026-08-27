package o;

import android.app.Notification;

/* JADX INFO: loaded from: classes3.dex */
public class migrateBannerImpressionMapToJsonlambda0 {
    private int RemoteActionCompatParcelizer = 0;
    private final r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg read;
    private Notification write;

    public migrateBannerImpressionMapToJsonlambda0(r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg) {
        this.read = r8lambda7zcvodb3ypljdzjmgkbnvobyklg;
    }

    public final Notification IconCompatParcelizer() {
        Notification notification = this.write;
        return notification != null ? notification : this.read.read();
    }

    public final int RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        return i != 0 ? i : this.read.serializer();
    }

    public final void write(Notification notification) {
        this.write = notification;
    }

    public final void write(int i) {
        this.RemoteActionCompatParcelizer = i;
    }
}
