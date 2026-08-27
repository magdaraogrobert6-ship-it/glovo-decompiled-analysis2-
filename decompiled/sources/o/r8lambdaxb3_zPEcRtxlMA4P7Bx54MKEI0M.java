package o;

import com.sentiance.sdk.detectionupdates.UserActivity;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaxb3_zPEcRtxlMA4P7Bx54MKEI0M extends migrateTriggersReeligibilityToJsonlambda1<UserActivity> {
    final /* synthetic */ configureFromServerConfiglambda2 RemoteActionCompatParcelizer;
    final /* synthetic */ long serializer;

    public r8lambdaxb3_zPEcRtxlMA4P7Bx54MKEI0M(configureFromServerConfiglambda2 configurefromserverconfiglambda2, long j) {
        this.RemoteActionCompatParcelizer = configurefromserverconfiglambda2;
        this.serializer = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final UserActivity RemoteActionCompatParcelizer() {
        return configureFromServerConfiglambda2.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.serializer);
    }
}
