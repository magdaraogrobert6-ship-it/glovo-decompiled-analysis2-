package o;

/* JADX INFO: loaded from: classes3.dex */
final class registerGeofencesWithGeofencingClientlambda30 implements registerGeofencesWithGeofencingClientlambda32 {
    public final /* synthetic */ int IconCompatParcelizer;
    final /* synthetic */ Object read;

    public registerGeofencesWithGeofencingClientlambda30(registerGeofencesWithGeofencingClientlambda31 registergeofenceswithgeofencingclientlambda31, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        this.IconCompatParcelizer = 0;
        this.read = registergeofenceswithgeofencingclientlambda31;
    }

    @Override // o.registerGeofencesWithGeofencingClientlambda32
    public final void serializer(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            ((registerGeofencesWithGeofencingClientlambda31) obj).IconCompatParcelizer(false);
        } else if (i != 1) {
            ((registerGeofencesWithGeofencingClient) obj).serializer.IconCompatParcelizer("Linking successful after config update.", new Object[0]);
        } else {
            ((registerGeofencesWithGeofencingClientlambda31) obj).IconCompatParcelizer(true);
        }
    }

    public /* synthetic */ registerGeofencesWithGeofencingClientlambda30(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // o.registerGeofencesWithGeofencingClientlambda32
    public final void serializer(int i, String str) {
        int i2 = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i2 == 0) {
            ((registerGeofencesWithGeofencingClientlambda31) obj).write(i, str);
        } else if (i2 == 1) {
            ((registerGeofencesWithGeofencingClientlambda31) obj).write(i, str);
        } else {
            ((registerGeofencesWithGeofencingClient) obj).serializer.IconCompatParcelizer("Linking failed after config update", new Object[0]);
        }
    }
}
