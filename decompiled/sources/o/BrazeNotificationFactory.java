package o;

import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
final class BrazeNotificationFactory extends migrateTriggersReeligibilityToJsonlambda1<addNotificationAction> {
    final /* synthetic */ r8lambdaJAzuAI86BqHAUWuq3a942DKIySE IconCompatParcelizer;
    final /* synthetic */ long write;

    public BrazeNotificationFactory(r8lambdaJAzuAI86BqHAUWuq3a942DKIySE r8lambdajazuai86bqhauwuq3a942dkiyse, long j) {
        this.IconCompatParcelizer = r8lambdajazuai86bqhauwuq3a942dkiyse;
        this.write = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final addNotificationAction RemoteActionCompatParcelizer() {
        r8lambdaJAzuAI86BqHAUWuq3a942DKIySE r8lambdajazuai86bqhauwuq3a942dkiyse = this.IconCompatParcelizer;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = r8lambdajazuai86bqhauwuq3a942dkiyse.MediaDescriptionCompat.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(this.write), true);
        if (!optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            return new addNotificationAction(0L, null);
        }
        return new addNotificationAction(optionalRemoteActionCompatParcelizer.write().serializer(), getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), r8lambdajazuai86bqhauwuq3a942dkiyse.RatingCompat));
    }
}
