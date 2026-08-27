package o;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes3.dex */
public final class getAllSemanticsNodesdefault implements Blur_androidKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final Trace write;

    public getAllSemanticsNodesdefault(Trace trace) {
        this.write = trace;
    }

    @Override // o.Blur_androidKt
    public final void serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write.stop();
        } else {
            this.write.stop();
            int i3 = 80 / 0;
        }
    }

    @Override // o.Blur_androidKt
    public final void RemoteActionCompatParcelizer(String str, long j) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        this.write.putMetric(str, j);
        int i4 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.Blur_androidKt
    public final void serializer(String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        this.write.putAttribute(str, str2);
        int i4 = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
