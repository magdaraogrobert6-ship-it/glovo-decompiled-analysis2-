package o;

/* JADX INFO: loaded from: classes4.dex */
final class parsePayloadFieldsFromBundleparseBigTextStyle extends migrateTriggersReeligibilityToJsonlambda1<parsePayloadFieldsFromBundleparseNotificationMetadata> {
    final /* synthetic */ parseLonglambda0 read;
    final /* synthetic */ com.sentiance.sdk.util.c write;

    public parsePayloadFieldsFromBundleparseBigTextStyle(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        this.write = cVar;
        this.read = parselonglambda0;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final parsePayloadFieldsFromBundleparseNotificationMetadata RemoteActionCompatParcelizer() {
        parsePayloadFieldsFromBundleparseNotificationMetadata parsepayloadfieldsfrombundleparsenotificationmetadata = new parsePayloadFieldsFromBundleparseNotificationMetadata(this.write, this.read);
        parsepayloadfieldsfrombundleparsenotificationmetadata.MediaBrowserCompatMediaItem();
        return parsepayloadfieldsfrombundleparsenotificationmetadata;
    }
}
