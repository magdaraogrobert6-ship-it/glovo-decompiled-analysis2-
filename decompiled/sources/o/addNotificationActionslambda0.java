package o;

/* JADX INFO: loaded from: classes4.dex */
final class addNotificationActionslambda0 extends migrateTriggersReeligibilityToJsonlambda1<Boolean> {
    final /* synthetic */ long serializer;
    final /* synthetic */ addNotificationActionslambda1 write;

    public addNotificationActionslambda0(addNotificationActionslambda1 addnotificationactionslambda1, long j) {
        this.write = addnotificationactionslambda1;
        this.serializer = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final Boolean RemoteActionCompatParcelizer() {
        return Boolean.valueOf(this.write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read((Byte) (byte) 12, this.serializer));
    }
}
