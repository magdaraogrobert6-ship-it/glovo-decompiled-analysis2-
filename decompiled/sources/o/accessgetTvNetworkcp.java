package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetTvNetworkcp implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity IconCompatParcelizer;
    public final /* synthetic */ GoogleApiAvailability RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ onBackPressed write;

    public accessgetTvNetworkcp(GoogleApiAvailability googleApiAvailability, Activity activity, int i, onBackPressed onbackpressed) {
        this.IconCompatParcelizer = activity;
        this.read = i;
        this.write = onbackpressed;
        this.RemoteActionCompatParcelizer = googleApiAvailability;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.RemoteActionCompatParcelizer.getErrorResolutionPendingIntent(this.IconCompatParcelizer, this.read, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        IntentSender intentSender = errorResolutionPendingIntent.getIntentSender();
        intentSender.getClass();
        this.write.write(new androidx.activity.result.IntentSenderRequest(intentSender, null, 0, 0));
    }
}
