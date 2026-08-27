package com.roadrunner.delivery.ontheway.turnbyturn.settings.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.accessunpackByte1;
import o.accessunpackByte2;
import o.getNoActiveChildannotations;
import o.isRoot;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsOnboardingDataStore {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final performCustomExitMxy_nc0 IconCompatParcelizer;
    public final isRoot serializer = new isRoot("PREF_KEY_TBT_SETTINGS_ENABLE_TBT_DIALOG_SHOWN");
    public final isRoot read = new isRoot("PREF_KEY_TBT_SETTINGS_TOOLTIP_SHOWN");
    public final isRoot write = new isRoot("PREF_KEY_TBT_SETTINGS_SHOW_NEW_TAG");

    public SettingsOnboardingDataStore(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        this.IconCompatParcelizer = performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final Object getOpenSettingsDialogShown(ContinuationImpl continuationImpl) {
        accessunpackByte1 accessunpackbyte1;
        int i;
        Object objFirstOrNull;
        CoroutineSingletons coroutineSingletons;
        int i2;
        isRoot isroot;
        int i3 = 2 % 2;
        int i4 = MediaMetadataCompat;
        int i5 = i4 + 83;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            if (continuationImpl instanceof accessunpackByte1) {
                int i6 = i4 + 67;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                accessunpackbyte1 = (accessunpackByte1) continuationImpl;
                i = accessunpackbyte1.IconCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i8 = MediaMetadataCompat + 47;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    accessunpackbyte1.IconCompatParcelizer = i - Integer.MIN_VALUE;
                }
            }
            objFirstOrNull = accessunpackbyte1.read;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = accessunpackbyte1.IconCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                Flow flowSerializer = this.IconCompatParcelizer.serializer();
                isroot = this.serializer;
                accessunpackbyte1.RemoteActionCompatParcelizer = isroot;
                accessunpackbyte1.IconCompatParcelizer = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowSerializer, accessunpackbyte1);
                if (objFirstOrNull == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = MediaMetadataCompat + 75;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                isroot = accessunpackbyte1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            }
            getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
            Boolean bool = (Boolean) (getnoactivechildannotations != null ? getnoactivechildannotations.serializer(isroot) : null);
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
        int i12 = 2 / 0;
        if (continuationImpl instanceof accessunpackByte1) {
            int i13 = i4 + 67;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            accessunpackbyte1 = (accessunpackByte1) continuationImpl;
            i = accessunpackbyte1.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i15 = MediaMetadataCompat + 47;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                accessunpackbyte1.IconCompatParcelizer = i - Integer.MIN_VALUE;
            }
        }
        objFirstOrNull = accessunpackbyte1.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = accessunpackbyte1.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer2 = this.IconCompatParcelizer.serializer();
            isroot = this.serializer;
            accessunpackbyte1.RemoteActionCompatParcelizer = isroot;
            accessunpackbyte1.IconCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer2, accessunpackbyte1);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = MediaMetadataCompat + 75;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            isroot = accessunpackbyte1.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getNoActiveChildannotations getnoactivechildannotations2 = (getNoActiveChildannotations) objFirstOrNull;
        Boolean bool2 = (Boolean) (getnoactivechildannotations2 != null ? getnoactivechildannotations2.serializer(isroot) : null);
        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        accessunpackbyte1 = new accessunpackByte1(this, continuationImpl);
        objFirstOrNull = accessunpackbyte1.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = accessunpackbyte1.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer3 = this.IconCompatParcelizer.serializer();
            isroot = this.serializer;
            accessunpackbyte1.RemoteActionCompatParcelizer = isroot;
            accessunpackbyte1.IconCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer3, accessunpackbyte1);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i19 = MediaMetadataCompat + 75;
            RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i110 = i19 % 2;
            isroot = accessunpackbyte1.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getNoActiveChildannotations getnoactivechildannotations3 = (getNoActiveChildannotations) objFirstOrNull;
        Boolean bool3 = (Boolean) (getnoactivechildannotations3 != null ? getnoactivechildannotations3.serializer(isroot) : null);
        return Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object getTooltipShown(ContinuationImpl continuationImpl) {
        accessunpackByte2 accessunpackbyte2;
        isRoot isroot;
        int i = 2 % 2;
        if (continuationImpl instanceof accessunpackByte2) {
            int i2 = RemoteActionCompatParcelizer + 113;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessunpackbyte2 = (accessunpackByte2) continuationImpl;
            int i4 = accessunpackbyte2.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = MediaMetadataCompat + 13;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                accessunpackbyte2.read = i4 - Integer.MIN_VALUE;
            } else {
                accessunpackbyte2 = new accessunpackByte2(this, continuationImpl);
            }
        } else {
            accessunpackbyte2 = new accessunpackByte2(this, continuationImpl);
        }
        Object objFirstOrNull = accessunpackbyte2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = accessunpackbyte2.read;
        Object obj = null;
        if (i7 != 0) {
            int i8 = MediaMetadataCompat + 75;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            isroot = accessunpackbyte2.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer = this.IconCompatParcelizer.serializer();
            isRoot isroot2 = this.read;
            accessunpackbyte2.RemoteActionCompatParcelizer = isroot2;
            accessunpackbyte2.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, accessunpackbyte2);
            if (objFirstOrNull == coroutineSingletons) {
                int i9 = RemoteActionCompatParcelizer + 99;
                MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj.hashCode();
                throw null;
            }
            isroot = isroot2;
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        Boolean bool = (Boolean) (getnoactivechildannotations != null ? getnoactivechildannotations.serializer(isroot) : null);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
