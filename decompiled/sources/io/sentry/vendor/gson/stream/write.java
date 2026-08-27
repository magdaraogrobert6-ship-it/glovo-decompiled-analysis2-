package io.sentry.vendor.gson.stream;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements Closeable, Flushable {
    public static final String[] IconCompatParcelizer = new String[Fields.SpotShadowColor];
    public String MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat = 1;
    public int[] MediaMetadataCompat;
    public final boolean RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public String read;
    public final Writer serializer;
    public String write;

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
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public final void IconCompatParcelizer() {
        if (this.write != null) {
            int iWrite = write();
            if (iWrite == 5) {
                this.serializer.write(44);
            } else if (iWrite != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
                return;
            }
            read();
            this.MediaMetadataCompat[this.MediaDescriptionCompat - 1] = 4;
            RemoteActionCompatParcelizer(this.write);
            this.write = null;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.write != null) {
            if (!this.RatingCompat) {
                this.write = null;
                return;
            }
            IconCompatParcelizer();
        }
        serializer();
        this.serializer.write("null");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void RemoteActionCompatParcelizer(String str) throws IOException {
        String str2;
        Writer writer = this.serializer;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = IconCompatParcelizer[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.MediaDescriptionCompat != 0) {
            this.serializer.flush();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonWriter is closed.");
        }
    }

    public final int write() {
        int i = this.MediaDescriptionCompat;
        if (i != 0) {
            return this.MediaMetadataCompat[i - 1];
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonWriter is closed.");
        return 0;
    }

    public write(Writer writer) {
        int[] iArr = new int[32];
        this.MediaMetadataCompat = iArr;
        iArr[0] = 6;
        this.MediaBrowserCompatMediaItem = ":";
        this.RatingCompat = true;
        this.serializer = writer;
    }

    public final void read() throws IOException {
        if (this.read == null) {
            return;
        }
        Writer writer = this.serializer;
        writer.write(10);
        int i = this.MediaDescriptionCompat;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.read);
        }
    }

    public final void serializer() {
        int iWrite = write();
        if (iWrite == 1) {
            this.MediaMetadataCompat[this.MediaDescriptionCompat - 1] = 2;
            read();
            return;
        }
        Writer writer = this.serializer;
        if (iWrite == 2) {
            writer.append(',');
            read();
            return;
        }
        if (iWrite == 4) {
            writer.append((CharSequence) this.MediaBrowserCompatMediaItem);
            this.MediaMetadataCompat[this.MediaDescriptionCompat - 1] = 5;
            return;
        }
        if (iWrite != 6) {
            if (iWrite != 7) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
                return;
            } else if (!this.RemoteActionCompatParcelizer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("JSON must have only one top-level value.");
                return;
            }
        }
        this.MediaMetadataCompat[this.MediaDescriptionCompat - 1] = 7;
    }

    public final void IconCompatParcelizer(int i, int i2, char c) {
        int iWrite = write();
        if (iWrite != i2 && iWrite != i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
            return;
        }
        String str = this.write;
        if (str != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(str, "Dangling name: ");
            return;
        }
        this.MediaDescriptionCompat--;
        if (iWrite == i2) {
            read();
        }
        this.serializer.write(c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.serializer.close();
        int i = this.MediaDescriptionCompat;
        if (i <= 1 && (i != 1 || this.MediaMetadataCompat[i - 1] == 7)) {
            this.MediaDescriptionCompat = 0;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Incomplete document");
        }
    }
}
