package o;

import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
final class getValidNotificationChannellambda2 extends migrateTriggersReeligibilityToJsonlambda4<r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug> {
    final /* synthetic */ getValidNotificationChannellambda3 IconCompatParcelizer;
    final /* synthetic */ long write;

    public getValidNotificationChannellambda2(getValidNotificationChannellambda3 getvalidnotificationchannellambda3, long j) {
        this.IconCompatParcelizer = getvalidnotificationchannellambda3;
        this.write = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda4
    public final r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug IconCompatParcelizer() {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug;
        getValidNotificationChannellambda3 getvalidnotificationchannellambda3 = this.IconCompatParcelizer;
        Optional optional = getvalidnotificationchannellambda3.IconCompatParcelizer.read(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class, Long.valueOf(this.write));
        if (!optional.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(getvalidnotificationchannellambda3.read)) == null || (r8lambdafjifijxjxuf3vopuwrut7txivug = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.serializer) == null) {
            return null;
        }
        return r8lambdafjifijxjxuf3vopuwrut7txivug;
    }
}
