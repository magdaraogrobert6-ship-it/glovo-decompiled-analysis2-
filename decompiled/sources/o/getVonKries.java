package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class getVonKries implements onViewAttachedToWindow {
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public final awaitScrollDependencies MediaDescriptionCompat;
    public final PopulateViewStructure_androidKtpopulate7 MediaMetadataCompat;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatQueueItem;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatResultReceiverWrapper;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatToken;
    public final PopulateViewStructure_androidKtpopulate7 ParcelableVolumeInfo;
    public final PopulateViewStructure_androidKtpopulate7 PlaybackStateCompat;
    public final PopulateViewStructure_androidKtpopulate7 PlaybackStateCompatCustomAction;
    public final PopulateViewStructure_androidKtpopulate7 RatingCompat;
    public final getPersonLastName RemoteActionCompatParcelizer;
    public final getPersonLastName read;
    public final getPersonLastName serializer;
    public final PopulateViewStructure_androidKtpopulate7 write;

    public static final boolean IconCompatParcelizer(getVonKries getvonkries, int i, long j) {
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = getvonkries.write;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = getvonkries.PlaybackStateCompatCustomAction;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = getvonkries.IconCompatParcelizer;
        getPersonLastName getpersonlastname = getvonkries.serializer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate10 = getvonkries.MediaBrowserCompatMediaItem;
        StrokeJoinCompanion strokeJoinCompanion = (StrokeJoinCompanion) ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue();
        if (strokeJoinCompanion == null) {
            return true;
        }
        onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate10;
        long jLongValue = ((Number) onshowtranslationui.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) onshowtranslationui.getValue()).longValue();
        onshowtranslationui.setValue(Long.valueOf(j));
        onShowTranslationui onshowtranslationui2 = (onShowTranslationui) populateViewStructure_androidKtpopulate9;
        if (onshowtranslationui2.getValue() != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return false;
        }
        if (onshowtranslationui2.getValue() != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return false;
        }
        float fFloatValue = ((Number) getpersonlastname.getValue()).floatValue() * ((jLongValue / 1000000) / strokeJoinCompanion.RemoteActionCompatParcelizer());
        float fFloatValue2 = ((Number) getpersonlastname.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) ((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue()).floatValue() + fFloatValue) : (((Number) ((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue2 < 0.0f) {
            getvonkries.serializer(RangesKt.write(((Number) ((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i2 = (int) (fFloatValue2 / 1.0f);
        int i3 = i2 + 1;
        if (getvonkries.RemoteActionCompatParcelizer() + i3 > i) {
            getvonkries.serializer(getvonkries.IconCompatParcelizer());
            getvonkries.IconCompatParcelizer(i);
            return false;
        }
        getvonkries.IconCompatParcelizer(getvonkries.RemoteActionCompatParcelizer() + i3);
        float f = fFloatValue2 - (i2 * 1.0f);
        getvonkries.serializer(((Number) getpersonlastname.getValue()).floatValue() < 0.0f ? 1.0f - f : f + 0.0f);
        return true;
    }

    public final float IconCompatParcelizer() {
        return ((Number) this.RemoteActionCompatParcelizer.getValue()).floatValue();
    }

    public final int RemoteActionCompatParcelizer() {
        return ((Number) this.MediaMetadataCompat.getValue()).intValue();
    }

    public final float write() {
        return ((Number) this.PlaybackStateCompat.getValue()).floatValue();
    }

    public getVonKries() {
        Boolean bool = Boolean.FALSE;
        this.RatingCompat = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaMetadataCompat = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(1);
        this.MediaSessionCompatQueueItem = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(1);
        this.MediaSessionCompatToken = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(bool);
        this.IconCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
        this.MediaSessionCompatResultReceiverWrapper = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Float.valueOf(1.0f));
        this.ParcelableVolumeInfo = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(bool);
        this.serializer = androidx.compose.runtime.CompositionKt.serializer(new AdaptationCompanionVonKries1(this, 2));
        this.write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.PlaybackStateCompatCustomAction = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(fValueOf);
        this.PlaybackStateCompat = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(fValueOf);
        this.MediaBrowserCompatMediaItem = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Long.MIN_VALUE);
        this.RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.serializer(new AdaptationCompanionVonKries1(this, 1));
        this.read = androidx.compose.runtime.CompositionKt.serializer(new AdaptationCompanionVonKries1(this, 0));
        this.MediaDescriptionCompat = new awaitScrollDependencies();
    }

    public final void IconCompatParcelizer(int i) {
        ((onShowTranslationui) this.MediaMetadataCompat).setValue(Integer.valueOf(i));
    }

    public final void serializer(float f) {
        StrokeJoinCompanion strokeJoinCompanion;
        ((onShowTranslationui) this.PlaybackStateCompatCustomAction).setValue(Float.valueOf(f));
        if (((Boolean) ((onShowTranslationui) this.ParcelableVolumeInfo).getValue()).booleanValue() && (strokeJoinCompanion = (StrokeJoinCompanion) ((onShowTranslationui) this.write).getValue()) != null) {
            f -= f % (1.0f / strokeJoinCompanion.IconCompatParcelizer);
        }
        ((onShowTranslationui) this.PlaybackStateCompat).setValue(Float.valueOf(f));
    }

    public static final void serializer(getVonKries getvonkries, boolean z) {
        ((onShowTranslationui) getvonkries.RatingCompat).setValue(Boolean.valueOf(z));
    }

    @Override // o.onViewAttachedToWindow
    public final Object getValue() {
        return Float.valueOf(write());
    }
}
