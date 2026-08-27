package o;

import android.content.Context;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public class getSubtitleGravity extends createOrGetDataStorelambda00 {
    private final stringAndKey read;

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("OnDemandRequestsPollingTask");
        publishexceptionlambda0.write(0);
        publishexceptionlambda0.read(21600000L);
        publishexceptionlambda0.RemoteActionCompatParcelizer(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    public getSubtitleGravity(stringAndKey stringandkey) {
        this.read = stringandkey;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        this.read.write(new d0$$ExternalSyntheticLambda0(9, this));
        return true;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        this.read.IconCompatParcelizer();
        return false;
    }
}
