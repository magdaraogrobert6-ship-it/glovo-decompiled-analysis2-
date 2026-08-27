package o;

/* JADX INFO: loaded from: classes4.dex */
final class addNotificationActionlambda3 extends migrateTriggersReeligibilityToJsonlambda1<Boolean> {
    final /* synthetic */ addNotificationActionslambda1 RemoteActionCompatParcelizer;
    final /* synthetic */ long read;

    public addNotificationActionlambda3(addNotificationActionslambda1 addnotificationactionslambda1, long j) {
        this.RemoteActionCompatParcelizer = addnotificationactionslambda1;
        this.read = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final Boolean RemoteActionCompatParcelizer() {
        return Boolean.valueOf(this.RemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read((Byte) (byte) 9, this.read));
    }
}
