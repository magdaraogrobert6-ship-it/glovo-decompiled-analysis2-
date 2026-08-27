package com.airbnb.lottie.parser.moshi;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.util.Arrays;
import o.DoubleFunction;
import o.colorResource;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] IconCompatParcelizer = new String[Fields.SpotShadowColor];
    public int RemoteActionCompatParcelizer;
    public int[] read;
    public int[] serializer;
    public String[] write;

    public abstract void IconCompatParcelizer();

    public abstract boolean MediaBrowserCompatMediaItem();

    public abstract String MediaDescriptionCompat();

    public abstract double MediaMetadataCompat();

    public abstract boolean MediaSessionCompatQueueItem();

    public abstract void MediaSessionCompatResultReceiverWrapper();

    public abstract void MediaSessionCompatToken();

    public abstract DoubleFunction PlaybackStateCompatCustomAction();

    public abstract int RatingCompat();

    public abstract void RemoteActionCompatParcelizer();

    public abstract int read(colorResource colorresource);

    public abstract void read();

    public abstract void write();

    static {
        for (int i = 0; i <= 31; i++) {
            IconCompatParcelizer[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = IconCompatParcelizer;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public final void RemoteActionCompatParcelizer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        int[] iArr = this.read;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(serializer()));
            }
            this.read = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.write;
            this.write = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.serializer;
            this.serializer = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.read;
        int i3 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i3 + 1;
        iArr3[i3] = i;
    }

    public final String serializer() {
        int i = this.RemoteActionCompatParcelizer;
        int[] iArr = this.read;
        String[] strArr = this.write;
        int[] iArr2 = this.serializer;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final void read(String str) throws JsonEncodingException {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, " at path ");
        sbM.append(serializer());
        throw new JsonEncodingException(sbM.toString());
    }
}
