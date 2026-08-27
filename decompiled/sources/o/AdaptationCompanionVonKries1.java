package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class AdaptationCompanionVonKries1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ getVonKries read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdaptationCompanionVonKries1(getVonKries getvonkries, int i) {
        super(0);
        this.serializer = i;
        this.read = getvonkries;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.serializer;
        getVonKries getvonkries = this.read;
        if (i == 0) {
            return Boolean.valueOf(getvonkries.RemoteActionCompatParcelizer() == ((Number) ((onShowTranslationui) getvonkries.MediaSessionCompatQueueItem).getValue()).intValue() && getvonkries.write() == getvonkries.IconCompatParcelizer());
        }
        if (i != 1) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = getvonkries.MediaSessionCompatResultReceiverWrapper;
            return Float.valueOf((((Boolean) ((onShowTranslationui) getvonkries.MediaSessionCompatToken).getValue()).booleanValue() && getvonkries.RemoteActionCompatParcelizer() % 2 == 0) ? -((Number) ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue()).floatValue() : ((Number) ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue()).floatValue());
        }
        float f = 0.0f;
        if (((StrokeJoinCompanion) ((onShowTranslationui) getvonkries.write).getValue()) != null) {
            float fFloatValue = ((Number) ((onShowTranslationui) getvonkries.MediaSessionCompatResultReceiverWrapper).getValue()).floatValue();
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = getvonkries.IconCompatParcelizer;
            if (fFloatValue < 0.0f) {
                if (((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue() != null) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return null;
                }
            } else {
                if (((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue() != null) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return null;
                }
                f = 1.0f;
            }
        }
        return Float.valueOf(f);
    }
}
