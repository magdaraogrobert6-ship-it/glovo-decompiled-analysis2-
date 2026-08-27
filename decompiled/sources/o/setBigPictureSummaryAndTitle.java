package o;

/* JADX INFO: loaded from: classes4.dex */
final class setBigPictureSummaryAndTitle extends migrateTriggersReeligibilityToJsonlambda4<r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80> {
    final /* synthetic */ long read;
    final /* synthetic */ populateNotificationBuilderlambda1 serializer;

    public setBigPictureSummaryAndTitle(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, long j) {
        this.serializer = populatenotificationbuilderlambda1;
        this.read = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda4
    public final r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 IconCompatParcelizer() {
        return populateNotificationBuilderlambda1.read(this.serializer, this.read);
    }
}
