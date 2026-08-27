package o;

/* JADX INFO: loaded from: classes3.dex */
final class handleNotificationActionClickedlambda0 extends getLatitudeannotations<invokeSuspendlambda0> {
    final /* synthetic */ addNotificationActionslambda1 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleNotificationActionClickedlambda0(addNotificationActionslambda1 addnotificationactionslambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "LocationAccuracyMonitor");
        this.serializer = addnotificationactionslambda1;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<invokeSuspendlambda0> getlongitudeannotations) {
        invokeSuspendlambda0 invokesuspendlambda0 = getlongitudeannotations.read();
        Byte b = invokesuspendlambda0.RemoteActionCompatParcelizer;
        Boolean bool = invokesuspendlambda0.read;
        byte bByteValue = b.byteValue();
        addNotificationActionslambda1 addnotificationactionslambda1 = this.serializer;
        if (bByteValue == 9) {
            addnotificationactionslambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(bool);
        } else if (invokesuspendlambda0.RemoteActionCompatParcelizer.byteValue() == 12) {
            addnotificationactionslambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read(bool);
        }
        addNotificationActionslambda1.serializer(addnotificationactionslambda1);
    }
}
