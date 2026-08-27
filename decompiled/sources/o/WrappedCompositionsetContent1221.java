package o;

import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class WrappedCompositionsetContent1221 {
    public final String IconCompatParcelizer;
    public final int read;
    public final long serializer;
    public final StringBuilder write = new StringBuilder();
    public final boolean RemoteActionCompatParcelizer = true;

    public final void IconCompatParcelizer(StringBuilder sb) {
        String strValueOf;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.serializer)));
        sb.append(' ');
        int i = this.read;
        if (i == 3) {
            strValueOf = "D";
        } else if (i == 4) {
            strValueOf = "I";
        } else if (i != 5) {
            strValueOf = i != 6 ? String.valueOf(i) : "E";
        } else {
            strValueOf = "W";
        }
        sb.append(strValueOf);
        sb.append('/');
        sb.append(this.IconCompatParcelizer);
        sb.append(']');
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        sb.append("[m]");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        IconCompatParcelizer(sb);
        sb.append(' ');
        sb.append(this.write.toString());
        return sb.toString();
    }

    public WrappedCompositionsetContent1221(int i, String str) {
        this.serializer = 0L;
        this.read = i;
        this.IconCompatParcelizer = str;
        this.serializer = System.currentTimeMillis();
    }
}
