package o;

import com.sentiance.sdk.OnStartFinishedHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class performWork {
    private final Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> IconCompatParcelizer;
    private final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM RemoteActionCompatParcelizer;
    private final String read;
    private final OnStartFinishedHandler serializer;
    private final setBitmapUrl write;

    public final OnStartFinishedHandler IconCompatParcelizer() {
        return this.serializer;
    }

    public final setBitmapUrl serializer() {
        return this.write;
    }

    public final Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> write() {
        return this.IconCompatParcelizer;
    }

    public performWork(String str, Class cls, r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, OnStartFinishedHandler onStartFinishedHandler, setBitmapUrl setbitmapurl) {
        this.read = str;
        this.IconCompatParcelizer = cls;
        this.RemoteActionCompatParcelizer = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
        this.serializer = onStartFinishedHandler;
        this.write = setbitmapurl;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "SdkStartStopItem{name='" + this.read + "', eventClass=" + this.IconCompatParcelizer + ", eventBuilder=" + this.RemoteActionCompatParcelizer + ", onStartFinishedHandler=" + this.serializer + ", onStopFinishedHandler=" + this.write + '}';
    }
}
