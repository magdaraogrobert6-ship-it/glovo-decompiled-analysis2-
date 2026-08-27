package o;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaOOlih4mJrp7NXsKFQkjEW4_nQ_o extends migrateTriggersReeligibilityToJsonlambda1<Boolean> {
    private final component4android_sdk_base_release IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;

    public r8lambdaOOlih4mJrp7NXsKFQkjEW4_nQ_o(getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, long j) {
        this.read = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = component4android_sdk_base_releaseVar;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final Boolean RemoteActionCompatParcelizer() {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        reenqueueInAppMessage reenqueueinappmessage;
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = this.read.IconCompatParcelizer(reenqueueInAppMessage.class, Long.valueOf(this.RemoteActionCompatParcelizer)).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer == null || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer)) == null || (reenqueueinappmessage = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(reenqueueinappmessage.write.byteValue() == 1);
    }
}
