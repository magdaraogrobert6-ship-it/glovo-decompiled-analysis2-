package o;

/* JADX INFO: loaded from: classes5.dex */
final class r8lambda0EZ8NY6Y_cYbodAD6DfMCcdYVbg extends getLatitudeannotations<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> {
    final /* synthetic */ BrazeNotificationUtils IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda0EZ8NY6Y_cYbodAD6DfMCcdYVbg(BrazeNotificationUtils brazeNotificationUtils, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "DataSyncPayloadCreator");
        readandroid_sdk_base_releaseVar.getClass();
        this.IconCompatParcelizer = brazeNotificationUtils;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> getlongitudeannotations) {
        r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog = getlongitudeannotations.read();
        r8lambdaqoukgs6h1gfby4ttokxnao8yog.getClass();
        long jWrite = getlongitudeannotations.write();
        BrazeNotificationUtils brazeNotificationUtils = this.IconCompatParcelizer;
        BrazeNotificationUtils.write(brazeNotificationUtils, r8lambdaqoukgs6h1gfby4ttokxnao8yog, jWrite);
        brazeNotificationUtils.IconCompatParcelizer.read(getlongitudeannotations.MediaMetadataCompat(), "KEY_LAST_EVENT_INGESTION_TIME");
    }
}
