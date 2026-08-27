package com.roadrunner.rider.safety.report.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getAdRevenuePlacement;
import o.isRoot;

/* JADX INFO: loaded from: classes3.dex */
public final class WelcomeMessageRepository {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final SafetyPreferencesDataStore RemoteActionCompatParcelizer;
    public final isRoot write;

    public WelcomeMessageRepository(SafetyPreferencesDataStore safetyPreferencesDataStore) {
        safetyPreferencesDataStore.getClass();
        this.RemoteActionCompatParcelizer = safetyPreferencesDataStore;
        this.write = new isRoot("rider_safety_welcome_display_count_pref_key");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    public final Object shouldDisplayWelcomeMessage(ContinuationImpl continuationImpl) {
        getAdRevenuePlacement getadrevenueplacement;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 9;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj = null;
        if (continuationImpl instanceof getAdRevenuePlacement) {
            int i5 = i2 + 53;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = ((getAdRevenuePlacement) continuationImpl).read;
                obj.hashCode();
                throw null;
            }
            getadrevenueplacement = (getAdRevenuePlacement) continuationImpl;
            int i7 = getadrevenueplacement.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                getadrevenueplacement.read = i7 - Integer.MIN_VALUE;
            } else {
                getadrevenueplacement = new getAdRevenuePlacement(this, continuationImpl);
            }
        } else {
            getadrevenueplacement = new getAdRevenuePlacement(this, continuationImpl);
        }
        Object obj2 = getadrevenueplacement.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getadrevenueplacement.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            getadrevenueplacement.read = 1;
            obj2 = this.RemoteActionCompatParcelizer.get(this.write, getadrevenueplacement);
            if (obj2 == coroutineSingletons) {
                int i9 = read + 97;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 72 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i11 = IconCompatParcelizer + 13;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return Boolean.valueOf(((Number) obj2).intValue() < 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r10 == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementDisplayCount(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.getAdImpressionsCount
            if (r1 == 0) goto L1f
            r1 = r10
            o.getAdImpressionsCount r1 = (o.getAdImpressionsCount) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r10 = com.roadrunner.rider.safety.report.data.WelcomeMessageRepository.IconCompatParcelizer
            int r10 = r10 + 111
            int r4 = r10 % 128
            com.roadrunner.rider.safety.report.data.WelcomeMessageRepository.read = r4
            int r10 = r10 % r0
            int r2 = r2 + r3
            r1.RemoteActionCompatParcelizer = r2
            goto L24
        L1f:
            o.getAdImpressionsCount r1 = new o.getAdImpressionsCount
            r1.<init>(r9, r10)
        L24:
            java.lang.Object r10 = r1.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.RemoteActionCompatParcelizer
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L4d
            if (r3 == r6) goto L47
            int r1 = com.roadrunner.rider.safety.report.data.WelcomeMessageRepository.IconCompatParcelizer
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.roadrunner.rider.safety.report.data.WelcomeMessageRepository.read = r2
            int r1 = r1 % r0
            if (r3 != r0) goto L41
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L8e
        L41:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r5
        L47:
            com.roadrunner.rider.safety.report.data.WelcomeMessageRepository r3 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L60
        L4d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r1.write = r9
            r1.RemoteActionCompatParcelizer = r6
            com.roadrunner.rider.safety.report.data.SafetyPreferencesDataStore r10 = r9.RemoteActionCompatParcelizer
            o.isRoot r3 = r9.write
            java.lang.Object r10 = r10.get(r3, r1)
            if (r10 != r2) goto L5f
            goto L84
        L5f:
            r3 = r9
        L60:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r1.write = r5
            r1.RemoteActionCompatParcelizer = r0
            com.roadrunner.rider.safety.report.data.SafetyPreferencesDataStore r7 = r3.RemoteActionCompatParcelizer
            o.isRoot r3 = r3.write
            o.performCustomExitMxy_nc0 r7 = r7.read
            kotlinx.coroutines.rx2.RxConvertKt$asFlow$1 r8 = new kotlinx.coroutines.rx2.RxConvertKt$asFlow$1
            int r10 = r10 + r6
            r8.<init>(r10, r3, r5)
            java.lang.Object r10 = o.pauseWebviewIfNecessarylambda10.serializer(r7, r8, r1)
            if (r10 != r2) goto L7d
            goto L7e
        L7d:
            r10 = r4
        L7e:
            if (r10 != r2) goto L81
            goto L82
        L81:
            r10 = r4
        L82:
            if (r10 != r2) goto L8e
        L84:
            int r10 = com.roadrunner.rider.safety.report.data.WelcomeMessageRepository.read
            int r10 = r10 + 71
            int r1 = r10 % 128
            com.roadrunner.rider.safety.report.data.WelcomeMessageRepository.IconCompatParcelizer = r1
            int r10 = r10 % r0
            return r2
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.safety.report.data.WelcomeMessageRepository.incrementDisplayCount(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
