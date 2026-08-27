package com.squareup.moshi;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import o.RegistryNoImageHeaderParserException;
import o.getLocalBitmaplambda0;
import o.getLocalBitmaplambda2;
import o.getLocalBitmaplambda6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonWriter implements Closeable, Flushable {
    public boolean MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction = 0;
    public int[] MediaSessionCompatToken = new int[32];
    public String[] MediaMetadataCompat = new String[32];
    public int[] RatingCompat = new int[32];
    public int IconCompatParcelizer = -1;

    public abstract JsonWriter IconCompatParcelizer();

    public abstract JsonWriter IconCompatParcelizer(String str);

    public abstract JsonWriter IconCompatParcelizer(boolean z);

    public abstract JsonWriter MediaDescriptionCompat();

    public abstract JsonWriter RemoteActionCompatParcelizer();

    public abstract JsonWriter RemoteActionCompatParcelizer(double d);

    public abstract JsonWriter RemoteActionCompatParcelizer(Float f);

    public abstract JsonWriter read(String str);

    public abstract JsonWriter serializer();

    public abstract JsonWriter serializer(long j);

    public abstract JsonWriter write();

    public static getLocalBitmaplambda0 serializer(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        return new getLocalBitmaplambda0(registryNoImageHeaderParserException);
    }

    public final String MediaBrowserCompatMediaItem() {
        return getLocalBitmaplambda2.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatToken, this.MediaMetadataCompat, this.RatingCompat);
    }

    public final void MediaSessionCompatQueueItem() {
        int i = this.PlaybackStateCompatCustomAction;
        int[] iArr = this.MediaSessionCompatToken;
        if (i != iArr.length) {
            return;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + MediaBrowserCompatMediaItem() + ": circular reference?", 0);
        }
        this.MediaSessionCompatToken = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.MediaMetadataCompat;
        this.MediaMetadataCompat = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.RatingCompat;
        this.RatingCompat = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof getLocalBitmaplambda6) {
            getLocalBitmaplambda6 getlocalbitmaplambda6 = (getLocalBitmaplambda6) this;
            Object[] objArr = getlocalbitmaplambda6.read;
            getlocalbitmaplambda6.read = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public final void read(int i) {
        int[] iArr = this.MediaSessionCompatToken;
        int i2 = this.PlaybackStateCompatCustomAction;
        this.PlaybackStateCompatCustomAction = i2 + 1;
        iArr[i2] = i;
    }

    public final void serializer(int i) {
        this.MediaSessionCompatToken[this.PlaybackStateCompatCustomAction - 1] = i;
    }

    public final int MediaSessionCompatResultReceiverWrapper() {
        int i = this.PlaybackStateCompatCustomAction;
        if (i != 0) {
            return this.MediaSessionCompatToken[i - 1];
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonWriter is closed.");
        return 0;
    }

    public void write(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.MediaDescriptionCompat = str;
    }

    public final void PlaybackStateCompat() {
        int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        if (iMediaSessionCompatResultReceiverWrapper == 5 || iMediaSessionCompatResultReceiverWrapper == 3) {
            this.MediaBrowserCompatMediaItem = true;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting problem.");
        }
    }
}
