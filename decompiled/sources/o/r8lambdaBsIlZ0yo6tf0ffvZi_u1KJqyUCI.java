package o;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaBsIlZ0yo6tf0ffvZi_u1KJqyUCI extends migrateTriggersReeligibilityToJsonlambda4<r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4> {
    final /* synthetic */ r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 RemoteActionCompatParcelizer;
    final /* synthetic */ long serializer;

    public r8lambdaBsIlZ0yo6tf0ffvZi_u1KJqyUCI(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, long j) {
        this.RemoteActionCompatParcelizer = r8lambda1mlf560mcjaa_exgr2d0icegcf0;
        this.serializer = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer() {
        r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0 = this.RemoteActionCompatParcelizer;
        return r8lambda1mlf560mcjaa_exgr2d0icegcf0.IconCompatParcelizer.write(this.serializer, r8lambda1mlf560mcjaa_exgr2d0icegcf0.MediaMetadataCompat, true);
    }
}
