package o;

import com.huawei.location.gwi.config.CarGwiSoFileConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class isLazyCollection extends Thread {
    public final /* synthetic */ Wrapper_androidKtsetContent1 IconCompatParcelizer;

    public isLazyCollection(Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1) {
        this.IconCompatParcelizer = wrapper_androidKtsetContent1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1 = this.IconCompatParcelizer;
        synchronized (Wrapper_androidKtsetContent1.write) {
            r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy = this.IconCompatParcelizer.RatingCompat;
            int i = wrapper_androidKtsetContent1.MediaSessionCompatQueueItem;
            String str = wrapper_androidKtsetContent1.MediaBrowserCompatMediaItem;
            int i2 = wrapper_androidKtsetContent1.read;
            int i3 = wrapper_androidKtsetContent1.IconCompatParcelizer;
            if (i > 0) {
                r8lambdacyuxafptvn7drfel1dgtevxcy.getClass();
                r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = Math.min(i, 2) * 1048576;
            } else {
                r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = 2097152;
            }
            r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = i2 > 0 ? Math.min(i2, 20) : 20;
            if (i3 > 0) {
                r8lambdacyuxafptvn7drfel1dgtevxcy.serializer = ((long) Math.min(i3, 5)) * CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL;
            } else {
                r8lambdacyuxafptvn7drfel1dgtevxcy.serializer = 432000000L;
            }
            if (str != null) {
                r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer = str;
                r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.write = true;
            } else {
                r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.write = false;
            }
        }
        while (wrapper_androidKtsetContent1.MediaDescriptionCompat) {
            try {
                Wrapper_androidKtsetContent1.serializer(this.IconCompatParcelizer, wrapper_androidKtsetContent1);
            } catch (Error | InterruptedException | Exception unused) {
            }
        }
        r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy2 = this.IconCompatParcelizer.RatingCompat;
        if (r8lambdacyuxafptvn7drfel1dgtevxcy2 != null) {
            Wrapper_androidKt wrapper_androidKt = new Wrapper_androidKt();
            wrapper_androidKt.RemoteActionCompatParcelizer = "I";
            wrapper_androidKt.read = "LogWriteManager";
            wrapper_androidKt.IconCompatParcelizer = "PrintWoker end.";
            wrapper_androidKt.write = "log";
            r8lambdacyuxafptvn7drfel1dgtevxcy2.IconCompatParcelizer(wrapper_androidKt);
            this.IconCompatParcelizer.RatingCompat.serializer();
        }
        this.IconCompatParcelizer.MediaDescriptionCompat = false;
    }
}
