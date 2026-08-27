package o;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaFvXm7SghxZVnjM1gtsrin9D1WFY extends migrateTriggersReeligibilityToJsonlambda1<r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM> {
    final /* synthetic */ long IconCompatParcelizer;
    final /* synthetic */ BrazeFirebaseMessagingServiceCompanion serializer;

    public r8lambdaFvXm7SghxZVnjM1gtsrin9D1WFY(BrazeFirebaseMessagingServiceCompanion brazeFirebaseMessagingServiceCompanion, long j) {
        this.serializer = brazeFirebaseMessagingServiceCompanion;
        this.IconCompatParcelizer = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM RemoteActionCompatParcelizer() {
        long j = this.IconCompatParcelizer;
        BrazeFirebaseMessagingServiceCompanion brazeFirebaseMessagingServiceCompanion = this.serializer;
        r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k = BrazeFirebaseMessagingServiceCompanion.read(brazeFirebaseMessagingServiceCompanion, j);
        return new r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM(r8lambdanclnumohj3w_eprkcj4qjg7b2k, brazeFirebaseMessagingServiceCompanion.RemoteActionCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2k));
    }
}
