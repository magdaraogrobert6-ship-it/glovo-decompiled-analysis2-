package o;

/* JADX INFO: loaded from: classes4.dex */
final class getTitleText extends migrateTriggersReeligibilityToJsonlambda1<Boolean> {
    final /* synthetic */ getUseWebView serializer;
    final /* synthetic */ long write;

    public getTitleText(getUseWebView getusewebview, long j) {
        this.serializer = getusewebview;
        this.write = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final Boolean RemoteActionCompatParcelizer() {
        return Boolean.valueOf(this.serializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(Long.valueOf(this.write)));
    }
}
