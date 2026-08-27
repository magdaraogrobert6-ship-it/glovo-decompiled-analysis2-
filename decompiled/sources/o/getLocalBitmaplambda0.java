package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonWriter;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalBitmaplambda0 extends JsonWriter {
    public static final String[] RemoteActionCompatParcelizer = new String[androidx.compose.ui.graphics.Fields.SpotShadowColor];
    public String read;
    public String serializer = ":";
    public final RegistryNoImageHeaderParserException write;

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter serializer() {
        this.MediaBrowserCompatMediaItem = false;
        IconCompatParcelizer(3, 5, '}');
        return this;
    }

    static {
        for (int i = 0; i <= 31; i++) {
            RemoteActionCompatParcelizer[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = RemoteActionCompatParcelizer;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void RemoteActionCompatParcelizer(RegistryNoImageHeaderParserException registryNoImageHeaderParserException, String str) {
        String str2;
        registryNoImageHeaderParserException.serializer(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = RemoteActionCompatParcelizer[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        registryNoImageHeaderParserException.write(i, i2, str);
                    }
                    registryNoImageHeaderParserException.read(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    registryNoImageHeaderParserException.write(i, i2, str);
                }
                registryNoImageHeaderParserException.read(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            registryNoImageHeaderParserException.write(i, length, str);
        }
        registryNoImageHeaderParserException.serializer(34);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter RemoteActionCompatParcelizer(Float f) {
        if (f == null) {
            MediaDescriptionCompat();
            return this;
        }
        String string = f.toString();
        if (!this.MediaSessionCompatQueueItem && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            Gson$$ExternalSyntheticBUOutline0.m(f, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            IconCompatParcelizer(string);
            return this;
        }
        MediaMetadataCompat();
        read();
        this.write.read(string);
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, char c) {
        int i3;
        int i4 = this.PlaybackStateCompatCustomAction;
        int i5 = this.IconCompatParcelizer;
        if (i4 == i5 && ((i3 = this.MediaSessionCompatToken[i4 - 1]) == i || i3 == i2)) {
            this.IconCompatParcelizer = ~i5;
            return;
        }
        read();
        MediaSessionCompatQueueItem();
        read(i);
        this.RatingCompat[this.PlaybackStateCompatCustomAction - 1] = 0;
        this.write.serializer(c);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter IconCompatParcelizer(String str) {
        if (str != null) {
            if (this.PlaybackStateCompatCustomAction != 0) {
                int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
                if ((iMediaSessionCompatResultReceiverWrapper == 3 || iMediaSessionCompatResultReceiverWrapper == 5) && this.read == null && !this.MediaBrowserCompatMediaItem) {
                    this.read = str;
                    this.MediaMetadataCompat[this.PlaybackStateCompatCustomAction - 1] = str;
                    return this;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonWriter is closed.");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("name == null");
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final void write(String str) {
        super.write(str);
        this.serializer = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter IconCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Object cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
            return null;
        }
        MediaMetadataCompat();
        RemoteActionCompatParcelizer(3, 5, '{');
        return this;
    }

    public final void MediaMetadataCompat() {
        if (this.read != null) {
            int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
            RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.write;
            if (iMediaSessionCompatResultReceiverWrapper == 5) {
                registryNoImageHeaderParserException.serializer(44);
            } else if (iMediaSessionCompatResultReceiverWrapper != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
                return;
            }
            RatingCompat();
            serializer(4);
            RemoteActionCompatParcelizer(registryNoImageHeaderParserException, this.read);
            this.read = null;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Array cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
            return null;
        }
        MediaMetadataCompat();
        RemoteActionCompatParcelizer(1, 2, '[');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.PlaybackStateCompatCustomAction != 0) {
            this.write.flush();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter write() {
        IconCompatParcelizer(1, 2, ']');
        return this;
    }

    public getLocalBitmaplambda0(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        if (registryNoImageHeaderParserException == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("sink == null");
            throw null;
        }
        this.write = registryNoImageHeaderParserException;
        read(6);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter MediaDescriptionCompat() {
        if (this.MediaBrowserCompatMediaItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("null cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
            return null;
        }
        if (this.read != null) {
            if (!this.PlaybackStateCompat) {
                this.read = null;
                return this;
            }
            MediaMetadataCompat();
        }
        read();
        this.write.read("null");
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void RatingCompat() {
        if (this.MediaDescriptionCompat == null) {
            return;
        }
        RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.write;
        registryNoImageHeaderParserException.serializer(10);
        int i = this.PlaybackStateCompatCustomAction;
        for (int i2 = 1; i2 < i; i2++) {
            registryNoImageHeaderParserException.read(this.MediaDescriptionCompat);
        }
    }

    public final void read() {
        int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        int i = 2;
        if (iMediaSessionCompatResultReceiverWrapper != 1) {
            RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.write;
            if (iMediaSessionCompatResultReceiverWrapper == 2) {
                registryNoImageHeaderParserException.serializer(44);
                RatingCompat();
            } else if (iMediaSessionCompatResultReceiverWrapper == 4) {
                registryNoImageHeaderParserException.read(this.serializer);
                i = 5;
            } else {
                if (iMediaSessionCompatResultReceiverWrapper == 9) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Sink from valueSink() was not closed");
                    return;
                }
                i = 7;
                if (iMediaSessionCompatResultReceiverWrapper != 6) {
                    if (iMediaSessionCompatResultReceiverWrapper != 7) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
                        return;
                    } else if (!this.MediaSessionCompatQueueItem) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("JSON must have only one top-level value.");
                        return;
                    }
                }
            }
        } else {
            RatingCompat();
        }
        serializer(i);
    }

    public final void IconCompatParcelizer(int i, int i2, char c) {
        int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        if (iMediaSessionCompatResultReceiverWrapper != i2 && iMediaSessionCompatResultReceiverWrapper != i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
            return;
        }
        String str = this.read;
        if (str != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(str, "Dangling name: ");
            return;
        }
        int i3 = this.PlaybackStateCompatCustomAction;
        int i4 = ~this.IconCompatParcelizer;
        if (i3 == i4) {
            this.IconCompatParcelizer = i4;
            return;
        }
        int i5 = i3 - 1;
        this.PlaybackStateCompatCustomAction = i5;
        this.MediaMetadataCompat[i5] = null;
        int[] iArr = this.RatingCompat;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (iMediaSessionCompatResultReceiverWrapper == i2) {
            RatingCompat();
        }
        this.write.serializer(c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.write.close();
        int i = this.PlaybackStateCompatCustomAction;
        if (i <= 1 && (i != 1 || this.MediaSessionCompatToken[i - 1] == 7)) {
            this.PlaybackStateCompatCustomAction = 0;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Incomplete document");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter IconCompatParcelizer(boolean z) {
        if (!this.MediaBrowserCompatMediaItem) {
            MediaMetadataCompat();
            read();
            this.write.read(z ? "true" : "false");
            int[] iArr = this.RatingCompat;
            int i = this.PlaybackStateCompatCustomAction - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Boolean cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter RemoteActionCompatParcelizer(double d) {
        if (!this.MediaSessionCompatQueueItem && (Double.isNaN(d) || Double.isInfinite(d))) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.read("Numeric values must be finite, but was ", d);
            return null;
        }
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            IconCompatParcelizer(Double.toString(d));
            return this;
        }
        MediaMetadataCompat();
        read();
        this.write.read(Double.toString(d));
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter serializer(long j) {
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            IconCompatParcelizer(Long.toString(j));
            return this;
        }
        MediaMetadataCompat();
        read();
        this.write.read(Long.toString(j));
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter read(String str) {
        if (str == null) {
            MediaDescriptionCompat();
            return this;
        }
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            IconCompatParcelizer(str);
            return this;
        }
        MediaMetadataCompat();
        read();
        RemoteActionCompatParcelizer(this.write, str);
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
