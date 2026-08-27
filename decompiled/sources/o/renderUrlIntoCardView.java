package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.authentication.UserCreationType;

/* JADX INFO: loaded from: classes3.dex */
public final class renderUrlIntoCardView implements registerGeofencesWithGeofencingClientlambda31 {
    final /* synthetic */ UserCreationType read;
    final /* synthetic */ Sentiance serializer;

    private static void read() {
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = (r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class);
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs.write().RemoteActionCompatParcelizer();
        if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer == null || r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaMetadataCompat()) {
            return;
        }
        r8lambdaw447glwjfoun4bg91upxnadqezs.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.write(), r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.IconCompatParcelizer(), r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(), true)));
    }

    public renderUrlIntoCardView(Sentiance sentiance, UserCreationType userCreationType) {
        this.serializer = sentiance;
        this.read = userCreationType;
    }

    @Override // o.registerGeofencesWithGeofencingClientlambda31
    public final void write(int i, String str) {
        if (this.read == UserCreationType.LEGACY_INIT) {
            read();
        }
        Sentiance sentiance = this.serializer;
        sentiance.logErr(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("error authenticating: ", str), new Object[0]);
        sentiance.updateInitStateAndNotify(i, str);
    }

    @Override // o.registerGeofencesWithGeofencingClientlambda31
    public final void IconCompatParcelizer(boolean z) {
        read();
        Sentiance sentiance = this.serializer;
        sentiance.log("auth successful", new Object[0]);
        sentiance.authenticatedInit(z);
    }
}
