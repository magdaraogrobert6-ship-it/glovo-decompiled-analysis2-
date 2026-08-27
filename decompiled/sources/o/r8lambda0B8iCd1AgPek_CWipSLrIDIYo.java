package o;

/* JADX INFO: loaded from: classes5.dex */
final class r8lambda0B8iCd1AgPek_CWipSLrIDIYo extends getLatitudeannotations<r8lambda9XibBb_UAwpsuoULwKlfVxtang> {
    final /* synthetic */ BrazeNotificationUtils IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda0B8iCd1AgPek_CWipSLrIDIYo(BrazeNotificationUtils brazeNotificationUtils, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "DataSyncPayloadCreator");
        readandroid_sdk_base_releaseVar.getClass();
        this.IconCompatParcelizer = brazeNotificationUtils;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambda9XibBb_UAwpsuoULwKlfVxtang> getlongitudeannotations) {
        r8lambda9XibBb_UAwpsuoULwKlfVxtang r8lambda9xibbb_uawpsuoulwklfvxtang = getlongitudeannotations.read();
        r8lambda9xibbb_uawpsuoulwklfvxtang.getClass();
        long jWrite = getlongitudeannotations.write();
        BrazeNotificationUtils brazeNotificationUtils = this.IconCompatParcelizer;
        BrazeNotificationUtils.IconCompatParcelizer(brazeNotificationUtils, r8lambda9xibbb_uawpsuoulwklfvxtang, jWrite);
        brazeNotificationUtils.IconCompatParcelizer.read(getlongitudeannotations.MediaMetadataCompat(), "KEY_LAST_EVENT_INGESTION_TIME");
    }
}
