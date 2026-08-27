package com.roadrunner.delivery.accept.autoaccept.preferences.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ AutoAcceptPreferencesDataStoreImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2(AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = autoAcceptPreferencesDataStoreImpl;
        this.read = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.write == 0) {
            AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2 autoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2 = new AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView, 0);
            autoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.IconCompatParcelizer = obj;
            return autoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2;
        }
        AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2 autoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$3 = new AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView, 1);
        autoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$3.IconCompatParcelizer = obj;
        int i3 = MediaMetadataCompat + 93;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return autoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        ((com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        ((com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2) create(r5, r6)).invokeSuspend(r2);
        r5 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.serializer + 125;
        com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.MediaMetadataCompat = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.serializer
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.backwardFocusSearch r5 = (o.backwardFocusSearch) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 75
            int r3 = r3 / 0
            if (r1 == 0) goto L40
            goto L27
        L1d:
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.backwardFocusSearch r5 = (o.backwardFocusSearch) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            if (r1 == 0) goto L40
        L27:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2 r5 = (com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2) r5
            r5.invokeSuspend(r2)
            int r5 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.serializer
            int r5 = r5 + 125
            int r6 = r5 % 128
            com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.MediaMetadataCompat = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L3f
            r5 = 36
            int r5 = r5 / 0
        L3f:
            return r2
        L40:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2 r5 = (com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2) r5
            r5.invokeSuspend(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = this.read;
        AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl = this.RemoteActionCompatParcelizer;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.IconCompatParcelizer;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            backwardfocussearch.write(autoAcceptPreferencesDataStoreImpl.write, Boolean.valueOf(z));
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        backwardfocussearch.write(autoAcceptPreferencesDataStoreImpl.serializer, Boolean.valueOf(z));
        int i5 = serializer + 35;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
