package o;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambda_ahuNAEFIlpJTVkMM4BK9m592bs extends migrateTriggersReeligibilityToJsonlambda4<r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs> {
    final /* synthetic */ r8lambdaI90we4_tg_9aaM1nBxPMKmLPck RemoteActionCompatParcelizer;
    final /* synthetic */ long serializer;

    public r8lambda_ahuNAEFIlpJTVkMM4BK9m592bs(r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck, long j) {
        this.RemoteActionCompatParcelizer = r8lambdai90we4_tg_9aam1nbxpmkmlpck;
        this.serializer = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda4
    public final r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs IconCompatParcelizer() {
        return r8lambdaI90we4_tg_9aaM1nBxPMKmLPck.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.serializer);
    }
}
