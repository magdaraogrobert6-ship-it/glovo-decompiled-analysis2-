package io.sentry.android.replay;

import kotlin.jvm.internal.Lambda;
import o.getInAppMessageEventMap;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatToken extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final MediaSessionCompatToken RemoteActionCompatParcelizer;
    public static final MediaSessionCompatToken read;
    public static final MediaSessionCompatToken write;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaSessionCompatToken(int i, int i2) {
        super(i);
        this.serializer = i2;
    }

    static {
        int i = 0;
        write = new MediaSessionCompatToken(i, 1);
        read = new MediaSessionCompatToken(i, i);
        RemoteActionCompatParcelizer = new MediaSessionCompatToken(i, 2);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? ComponentActivity.write() : new getInAppMessageEventMap("_[a-z]");
        }
        return new io.sentry.util.ParcelableVolumeInfo();
    }
}
