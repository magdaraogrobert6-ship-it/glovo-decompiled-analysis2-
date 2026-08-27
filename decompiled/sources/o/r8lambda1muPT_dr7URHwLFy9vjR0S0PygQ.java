package o;

/* JADX INFO: loaded from: classes5.dex */
final class r8lambda1muPT_dr7URHwLFy9vjR0S0PygQ extends getLatitudeannotations<invokeSuspendlambda1> {
    final /* synthetic */ BrazeNotificationUtils read;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<invokeSuspendlambda1> getlongitudeannotations) {
        BrazeNotificationUtils brazeNotificationUtils = this.read;
        BrazeNotificationUtils.write(brazeNotificationUtils);
        brazeNotificationUtils.IconCompatParcelizer.read(getlongitudeannotations.MediaMetadataCompat(), "KEY_LAST_EVENT_INGESTION_TIME");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda1muPT_dr7URHwLFy9vjR0S0PygQ(BrazeNotificationUtils brazeNotificationUtils, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "DataSyncPayloadCreator");
        readandroid_sdk_base_releaseVar.getClass();
        this.read = brazeNotificationUtils;
    }
}
