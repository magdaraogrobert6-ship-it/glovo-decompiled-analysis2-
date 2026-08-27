package o;

/* JADX INFO: loaded from: classes4.dex */
final class setDistanceFromGeofenceRefresh extends migrateTriggersReeligibilityToJsonlambda4<Long> {
    final /* synthetic */ getCooldownEnterSeconds read;

    public setDistanceFromGeofenceRefresh(getCooldownEnterSeconds getcooldownenterseconds) {
        this.read = getcooldownenterseconds;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda4
    public final Long IconCompatParcelizer() {
        int i = getCooldownEnterSeconds.RemoteActionCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.read;
        return (Long) getcooldownenterseconds.RemoteActionCompatParcelizer(new getExitEvents(getcooldownenterseconds, 0));
    }
}
