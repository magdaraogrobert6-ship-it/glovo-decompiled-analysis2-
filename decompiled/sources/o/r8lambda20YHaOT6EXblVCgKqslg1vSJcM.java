package o;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambda20YHaOT6EXblVCgKqslg1vSJcM extends getLatitudeannotations<BrazeBootReceiver> {
    final /* synthetic */ handleHmsRemoteMessageDatalambda1 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda20YHaOT6EXblVCgKqslg1vSJcM(handleHmsRemoteMessageDatalambda1 handlehmsremotemessagedatalambda1, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, String str) {
        super(clearandroid_sdk_base_releaseVar, str);
        this.RemoteActionCompatParcelizer = handlehmsremotemessagedatalambda1;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<BrazeBootReceiver> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        this.RemoteActionCompatParcelizer.serializer(getlongitudeannotations.MediaMetadataCompat(), cls);
    }
}
