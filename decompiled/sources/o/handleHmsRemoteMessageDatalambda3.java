package o;

/* JADX INFO: loaded from: classes3.dex */
final class handleHmsRemoteMessageDatalambda3 extends getLatitudeannotations<wipeDatalambda0> {
    final /* synthetic */ handleHmsRemoteMessageDatalambda1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleHmsRemoteMessageDatalambda3(handleHmsRemoteMessageDatalambda1 handlehmsremotemessagedatalambda1, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, String str) {
        super(clearandroid_sdk_base_releaseVar, str);
        this.write = handlehmsremotemessagedatalambda1;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<wipeDatalambda0> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        this.write.serializer(getlongitudeannotations.MediaMetadataCompat(), cls);
    }
}
