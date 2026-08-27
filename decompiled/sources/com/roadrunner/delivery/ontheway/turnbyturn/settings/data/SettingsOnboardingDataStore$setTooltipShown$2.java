package com.roadrunner.delivery.ontheway.turnbyturn.settings.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsOnboardingDataStore$setTooltipShown$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SettingsOnboardingDataStore read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingsOnboardingDataStore$setTooltipShown$2(SettingsOnboardingDataStore settingsOnboardingDataStore, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = settingsOnboardingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = 1;
        int i4 = serializer + 1;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = this.IconCompatParcelizer;
        SettingsOnboardingDataStore settingsOnboardingDataStore = this.read;
        if (i6 == 0) {
            SettingsOnboardingDataStore$setTooltipShown$2 settingsOnboardingDataStore$setTooltipShown$2 = new SettingsOnboardingDataStore$setTooltipShown$2(settingsOnboardingDataStore, shortNewsContentCardView, 0);
            settingsOnboardingDataStore$setTooltipShown$2.write = obj;
            return settingsOnboardingDataStore$setTooltipShown$2;
        }
        if (i6 != 1) {
            SettingsOnboardingDataStore$setTooltipShown$2 settingsOnboardingDataStore$setTooltipShown$3 = new SettingsOnboardingDataStore$setTooltipShown$2(settingsOnboardingDataStore, shortNewsContentCardView, i);
            settingsOnboardingDataStore$setTooltipShown$3.write = obj;
            return settingsOnboardingDataStore$setTooltipShown$3;
        }
        SettingsOnboardingDataStore$setTooltipShown$2 settingsOnboardingDataStore$setTooltipShown$4 = new SettingsOnboardingDataStore$setTooltipShown$2(settingsOnboardingDataStore, shortNewsContentCardView, i3);
        settingsOnboardingDataStore$setTooltipShown$4.write = obj;
        int i7 = RemoteActionCompatParcelizer + 31;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return settingsOnboardingDataStore$setTooltipShown$4;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            if (i3 != 1) {
                ((SettingsOnboardingDataStore$setTooltipShown$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            }
            ((SettingsOnboardingDataStore$setTooltipShown$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        ((SettingsOnboardingDataStore$setTooltipShown$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = serializer + 121;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r8);
        r5.write(r4.write, java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r8);
        r5.write(r4.serializer, java.lang.Boolean.TRUE);
        r8 = com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2.RemoteActionCompatParcelizer + 111;
        com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2.serializer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if ((r8 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r8 = 79 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2.serializer
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L22
            int r1 = r7.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore r4 = r7.read
            java.lang.Object r5 = r7.write
            o.backwardFocusSearch r5 = (o.backwardFocusSearch) r5
            r6 = 14
            int r6 = r6 / 0
            if (r1 == 0) goto L59
            if (r1 == r2) goto L3d
            goto L30
        L22:
            int r1 = r7.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore r4 = r7.read
            java.lang.Object r5 = r7.write
            o.backwardFocusSearch r5 = (o.backwardFocusSearch) r5
            if (r1 == 0) goto L59
            if (r1 == r2) goto L3d
        L30:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.isRoot r8 = r4.write
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.write(r8, r0)
            return r3
        L3d:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.isRoot r8 = r4.serializer
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.write(r8, r1)
            int r8 = com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2.RemoteActionCompatParcelizer
            int r8 = r8 + 111
            int r1 = r8 % 128
            com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2.serializer = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L58
            r8 = 79
            int r8 = r8 / 0
        L58:
            return r3
        L59:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.isRoot r8 = r4.read
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.write(r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
