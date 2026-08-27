package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonWriter;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalBitmaplambda6 extends JsonWriter {
    public Object[] read = new Object[32];
    public String write;

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter IconCompatParcelizer(String str) {
        if (str != null) {
            if (this.PlaybackStateCompatCustomAction != 0) {
                if (MediaSessionCompatResultReceiverWrapper() == 3 && this.write == null && !this.MediaBrowserCompatMediaItem) {
                    this.write = str;
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
    public final JsonWriter IconCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Object cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
            return null;
        }
        int i = this.PlaybackStateCompatCustomAction;
        int i2 = this.IconCompatParcelizer;
        if (i == i2 && this.MediaSessionCompatToken[i - 1] == 3) {
            this.IconCompatParcelizer = ~i2;
            return this;
        }
        MediaSessionCompatQueueItem();
        getLocalBitmaplambda7 getlocalbitmaplambda7 = new getLocalBitmaplambda7();
        serializer(getlocalbitmaplambda7);
        this.read[this.PlaybackStateCompatCustomAction] = getlocalbitmaplambda7;
        read(3);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Array cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
            return null;
        }
        int i = this.PlaybackStateCompatCustomAction;
        int i2 = this.IconCompatParcelizer;
        if (i == i2 && this.MediaSessionCompatToken[i - 1] == 1) {
            this.IconCompatParcelizer = ~i2;
            return this;
        }
        MediaSessionCompatQueueItem();
        ArrayList arrayList = new ArrayList();
        serializer(arrayList);
        Object[] objArr = this.read;
        int i3 = this.PlaybackStateCompatCustomAction;
        objArr[i3] = arrayList;
        this.RatingCompat[i3] = 0;
        read(1);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter RemoteActionCompatParcelizer(double d) {
        if (!this.MediaSessionCompatQueueItem && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.read("Numeric values must be finite, but was ", d);
            return null;
        }
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            IconCompatParcelizer(Double.toString(d));
            return this;
        }
        serializer(Double.valueOf(d));
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void serializer(Serializable serializable) {
        String str;
        Object objPut;
        int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        int i = this.PlaybackStateCompatCustomAction;
        if (i == 1) {
            if (iMediaSessionCompatResultReceiverWrapper != 6) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("JSON must have only one top-level value.");
                return;
            }
            int i2 = i - 1;
            this.MediaSessionCompatToken[i2] = 7;
            this.read[i2] = serializable;
            return;
        }
        if (iMediaSessionCompatResultReceiverWrapper == 3 && (str = this.write) != null) {
            if ((serializable != null || this.PlaybackStateCompat) && (objPut = ((Map) this.read[i - 1]).put(str, serializable)) != null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Map key '", this.write, "' has multiple values at path ", MediaBrowserCompatMediaItem(), ": ", objPut, " and ", serializable);
                return;
            } else {
                this.write = null;
                return;
            }
        }
        if (iMediaSessionCompatResultReceiverWrapper == 1) {
            ((List) this.read[i - 1]).add(serializable);
        } else if (iMediaSessionCompatResultReceiverWrapper == 9) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Sink from valueSink() was not closed");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
        }
    }

    public getLocalBitmaplambda6() {
        read(6);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter MediaDescriptionCompat() {
        if (this.MediaBrowserCompatMediaItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("null cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
            return null;
        }
        serializer((Serializable) null);
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.PlaybackStateCompatCustomAction;
        if (i > 1 || (i == 1 && this.MediaSessionCompatToken[i - 1] != 7)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Incomplete document");
        } else {
            this.PlaybackStateCompatCustomAction = 0;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.PlaybackStateCompatCustomAction != 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonWriter is closed.");
    }

    public final Object read() {
        int i = this.PlaybackStateCompatCustomAction;
        if (i <= 1 && (i != 1 || this.MediaSessionCompatToken[i - 1] == 7)) {
            return this.read[0];
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Incomplete document");
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter serializer() {
        if (MediaSessionCompatResultReceiverWrapper() != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
            return null;
        }
        String str = this.write;
        if (str != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(str, "Dangling name: ");
            return null;
        }
        int i = this.PlaybackStateCompatCustomAction;
        int i2 = ~this.IconCompatParcelizer;
        if (i == i2) {
            this.IconCompatParcelizer = i2;
            return this;
        }
        this.MediaBrowserCompatMediaItem = false;
        int i3 = i - 1;
        this.PlaybackStateCompatCustomAction = i3;
        this.read[i3] = null;
        this.MediaMetadataCompat[i3] = null;
        int[] iArr = this.RatingCompat;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter write() {
        if (MediaSessionCompatResultReceiverWrapper() != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
            return null;
        }
        int i = this.PlaybackStateCompatCustomAction;
        int i2 = ~this.IconCompatParcelizer;
        if (i == i2) {
            this.IconCompatParcelizer = i2;
            return this;
        }
        int i3 = i - 1;
        this.PlaybackStateCompatCustomAction = i3;
        this.read[i3] = null;
        int[] iArr = this.RatingCompat;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter IconCompatParcelizer(boolean z) {
        if (!this.MediaBrowserCompatMediaItem) {
            serializer(Boolean.valueOf(z));
            int[] iArr = this.RatingCompat;
            int i = this.PlaybackStateCompatCustomAction - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Boolean cannot be used as a map key in JSON at path ".concat(MediaBrowserCompatMediaItem()));
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter read(String str) {
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            IconCompatParcelizer(str);
            return this;
        }
        serializer(str);
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
        serializer(Long.valueOf(j));
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter RemoteActionCompatParcelizer(Float f) {
        if (f != null) {
            RemoteActionCompatParcelizer(f.doubleValue());
            return this;
        }
        if (f == null) {
            MediaDescriptionCompat();
            return this;
        }
        BigDecimal bigDecimal = new BigDecimal(f.toString());
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            IconCompatParcelizer(bigDecimal.toString());
            return this;
        }
        serializer(bigDecimal);
        int[] iArr = this.RatingCompat;
        int i = this.PlaybackStateCompatCustomAction - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
