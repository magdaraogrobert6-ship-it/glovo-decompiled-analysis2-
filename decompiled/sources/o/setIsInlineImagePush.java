package o;

/* JADX INFO: loaded from: classes4.dex */
final class setIsInlineImagePush extends migrateTriggersReeligibilityToJsonlambda4<Long> {
    final /* synthetic */ long RemoteActionCompatParcelizer;
    final /* synthetic */ setInlineImagePush serializer;

    public setIsInlineImagePush(setInlineImagePush setinlineimagepush, long j) {
        this.serializer = setinlineimagepush;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda4
    public final Long IconCompatParcelizer() {
        return setInlineImagePush.serializer(this.serializer, this.RemoteActionCompatParcelizer);
    }
}
