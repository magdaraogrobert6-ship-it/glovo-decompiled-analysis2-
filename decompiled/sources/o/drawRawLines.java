package o;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class drawRawLines extends Writer {
    public final StringBuilder RemoteActionCompatParcelizer = new StringBuilder(androidx.compose.ui.graphics.Fields.SpotShadowColor);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RemoteActionCompatParcelizer();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        StringBuilder sb = this.RemoteActionCompatParcelizer;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                RemoteActionCompatParcelizer();
            } else {
                this.RemoteActionCompatParcelizer.append(c);
            }
        }
    }
}
