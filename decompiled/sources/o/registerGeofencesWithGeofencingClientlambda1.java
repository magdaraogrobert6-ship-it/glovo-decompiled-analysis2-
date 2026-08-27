package o;

import com.sentiance.sdk.UserLinkerAsync;

/* JADX INFO: loaded from: classes3.dex */
final class registerGeofencesWithGeofencingClientlambda1 implements Runnable {
    final /* synthetic */ r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY IconCompatParcelizer;
    final /* synthetic */ setEmaillambda0 RemoteActionCompatParcelizer;
    final /* synthetic */ UserLinkerAsync read;
    final /* synthetic */ registerGeofencesWithGeofencingClient serializer;
    final /* synthetic */ registerGeofencesWithGeofencingClientlambda32 write;

    @Override // java.lang.Runnable
    public final void run() {
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty = this.IconCompatParcelizer;
        String strReplaceAll = r8lambdazcbg_e0hjusjy78mvgh54swzqty.write().replaceAll(".*/", "");
        String strIconCompatParcelizer = r8lambdazcbg_e0hjusjy78mvgh54swzqty.IconCompatParcelizer();
        registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient = this.serializer;
        UserLinkerAsync userLinkerAsync = this.read;
        if (strIconCompatParcelizer == null && userLinkerAsync == null) {
            registerGeofencesWithGeofencingClient.write(registergeofenceswithgeofencingclient, strReplaceAll, r8lambdazcbg_e0hjusjy78mvgh54swzqty, this.write, this.RemoteActionCompatParcelizer);
        } else if (userLinkerAsync != null) {
            registergeofenceswithgeofencingclient.serializer.IconCompatParcelizer("Attempting to call backend linker", new Object[0]);
            userLinkerAsync.link(strReplaceAll, new registerGeofencesWithGeofencingClientlambda2(this, registergeofenceswithgeofencingclient.MediaMetadataCompat));
        }
    }

    public registerGeofencesWithGeofencingClientlambda1(registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, UserLinkerAsync userLinkerAsync, registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32, setEmaillambda0 setemaillambda0) {
        this.serializer = registergeofenceswithgeofencingclient;
        this.IconCompatParcelizer = r8lambdazcbg_e0hjusjy78mvgh54swzqty;
        this.read = userLinkerAsync;
        this.write = registergeofenceswithgeofencingclientlambda32;
        this.RemoteActionCompatParcelizer = setemaillambda0;
    }
}
