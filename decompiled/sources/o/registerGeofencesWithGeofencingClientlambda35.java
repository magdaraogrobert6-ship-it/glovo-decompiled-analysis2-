package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class registerGeofencesWithGeofencingClientlambda35 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ registerGeofencesWithGeofencingClientlambda2 read;

    public /* synthetic */ registerGeofencesWithGeofencingClientlambda35(registerGeofencesWithGeofencingClientlambda2 registergeofenceswithgeofencingclientlambda2, int i) {
        this.IconCompatParcelizer = i;
        this.read = registergeofenceswithgeofencingclientlambda2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        registerGeofencesWithGeofencingClientlambda2 registergeofenceswithgeofencingclientlambda2 = this.read;
        if (i == 0) {
            registerGeofencesWithGeofencingClientlambda1 registergeofenceswithgeofencingclientlambda1 = registergeofenceswithgeofencingclientlambda2.serializer;
            registergeofenceswithgeofencingclientlambda1.serializer.serializer.IconCompatParcelizer("Linking failure", new Object[0]);
            registergeofenceswithgeofencingclientlambda1.write.serializer(4, "Linking failed by the app");
        } else {
            registerGeofencesWithGeofencingClientlambda1 registergeofenceswithgeofencingclientlambda3 = registergeofenceswithgeofencingclientlambda2.serializer;
            registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient = registergeofenceswithgeofencingclientlambda3.serializer;
            registergeofenceswithgeofencingclient.serializer.IconCompatParcelizer("Linking success", new Object[0]);
            registerGeofencesWithGeofencingClient.a(registergeofenceswithgeofencingclient, registergeofenceswithgeofencingclientlambda3.IconCompatParcelizer, registergeofenceswithgeofencingclientlambda3.write, registergeofenceswithgeofencingclientlambda3.RemoteActionCompatParcelizer);
        }
    }
}
