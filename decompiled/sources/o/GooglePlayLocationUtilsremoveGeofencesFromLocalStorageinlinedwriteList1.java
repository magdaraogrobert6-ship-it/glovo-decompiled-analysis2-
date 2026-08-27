package o;

/* JADX INFO: loaded from: classes5.dex */
final class GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList1 extends getLatitudeannotations<logLocationRecordedEvent> {
    final /* synthetic */ GooglePlayLocationUtilsExternalSyntheticLambda18 IconCompatParcelizer;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<logLocationRecordedEvent> getlongitudeannotations) {
        GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18 = this.IconCompatParcelizer;
        if (googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatResultReceiverWrapper) {
            logLocationRecordedEvent loglocationrecordedevent = getlongitudeannotations.read();
            long jWrite = getlongitudeannotations.write();
            if (loglocationrecordedevent.serializer.byteValue() == 1) {
                GooglePlayLocationUtilsExternalSyntheticLambda18.RemoteActionCompatParcelizer(googlePlayLocationUtilsExternalSyntheticLambda18, jWrite, loglocationrecordedevent);
            } else if (loglocationrecordedevent.serializer.byteValue() == 2) {
                GooglePlayLocationUtilsExternalSyntheticLambda18.write(googlePlayLocationUtilsExternalSyntheticLambda18, jWrite);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList1(GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "CrashDetector");
        this.IconCompatParcelizer = googlePlayLocationUtilsExternalSyntheticLambda18;
    }
}
