package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.payload.submission.PayloadSubmitter;

/* JADX INFO: loaded from: classes4.dex */
public final class setSummaryTextIfPresentAndSupportedlambda1 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ PayloadSubmitter IconCompatParcelizer;

    public setSummaryTextIfPresentAndSupportedlambda1(PayloadSubmitter payloadSubmitter) {
        this.IconCompatParcelizer = payloadSubmitter;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "ConnectivityChangeReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.IconCompatParcelizer.PlaybackStateCompat;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        PayloadSubmitter payloadSubmitter = this.IconCompatParcelizer;
        if (payloadSubmitter.RatingCompat.RatingCompat()) {
            payloadSubmitter.write.IconCompatParcelizer("Connectivity changed. Submitting eligible payloads.", new Object[0]);
            payloadSubmitter.MediaSessionCompatResultReceiverWrapper.read();
            payloadSubmitter.PlaybackStateCompat.RemoteActionCompatParcelizer(new setTitleIfPresentlambda0(this), "PayloadSubmitter");
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
