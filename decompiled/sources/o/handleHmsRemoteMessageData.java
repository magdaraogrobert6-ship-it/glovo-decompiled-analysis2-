package o;

/* JADX INFO: loaded from: classes3.dex */
final class handleHmsRemoteMessageData extends getLatitudeannotations<r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I> {
    final /* synthetic */ handleHmsRemoteMessageDatalambda1 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleHmsRemoteMessageData(handleHmsRemoteMessageDatalambda1 handlehmsremotemessagedatalambda1, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, String str) {
        super(clearandroid_sdk_base_releaseVar, str);
        this.RemoteActionCompatParcelizer = handlehmsremotemessagedatalambda1;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        this.RemoteActionCompatParcelizer.serializer(getlongitudeannotations.MediaMetadataCompat(), cls);
    }
}
