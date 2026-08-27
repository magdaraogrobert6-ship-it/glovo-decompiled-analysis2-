package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes5.dex */
final class GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ GooglePlayLocationUtilsExternalSyntheticLambda18 IconCompatParcelizer;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.CRASH_DETECTOR_START;
        GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18 = this.IconCompatParcelizer;
        if (controlMessage == controlMessage2 && googlePlayLocationUtilsExternalSyntheticLambda18.ParcelableVolumeInfo.read() && GooglePlayLocationUtilsExternalSyntheticLambda18.write(googlePlayLocationUtilsExternalSyntheticLambda18)) {
            GooglePlayLocationUtilsExternalSyntheticLambda18.IconCompatParcelizer(googlePlayLocationUtilsExternalSyntheticLambda18);
        } else if (controlMessage == ControlMessage.CRASH_DETECTOR_STOP) {
            googlePlayLocationUtilsExternalSyntheticLambda18.serializer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2(GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "CrashDetector");
        this.IconCompatParcelizer = googlePlayLocationUtilsExternalSyntheticLambda18;
    }
}
