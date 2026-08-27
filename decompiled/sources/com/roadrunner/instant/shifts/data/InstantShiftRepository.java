package com.roadrunner.instant.shifts.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.instance_delegatelambda0;
import o.isAdapterPositionUnknown;
import o.onItemDismiss;
import o.resetTransientState;

/* JADX INFO: loaded from: classes3.dex */
public final class InstantShiftRepository {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final resetTransientState IconCompatParcelizer;
    public final AtomicReference RemoteActionCompatParcelizer;
    public final isAdapterPositionUnknown serializer;
    public final ExecuteApiRequest write;

    public InstantShiftRepository(isAdapterPositionUnknown isadapterpositionunknown, ExecuteApiRequest executeApiRequest, resetTransientState resettransientstate) {
        isadapterpositionunknown.getClass();
        executeApiRequest.getClass();
        resettransientstate.getClass();
        this.serializer = isadapterpositionunknown;
        this.write = executeApiRequest;
        this.IconCompatParcelizer = resettransientstate;
        this.RemoteActionCompatParcelizer = new AtomicReference(instance_delegatelambda0.write);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: assignShift-gIAlu-s, reason: not valid java name */
    public final Object m4983assignShiftgIAlus(int i, ContinuationImpl continuationImpl) {
        InstantShiftRepository$assignShift$1 instantShiftRepository$assignShift$1;
        int i2 = 2 % 2;
        if (continuationImpl instanceof InstantShiftRepository$assignShift$1) {
            instantShiftRepository$assignShift$1 = (InstantShiftRepository$assignShift$1) continuationImpl;
            int i3 = instantShiftRepository$assignShift$1.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = read + 51;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                instantShiftRepository$assignShift$1.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                instantShiftRepository$assignShift$1 = new InstantShiftRepository$assignShift$1(this, continuationImpl);
            }
        } else {
            instantShiftRepository$assignShift$1 = new InstantShiftRepository$assignShift$1(this, continuationImpl);
        }
        Object obj = instantShiftRepository$assignShift$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = instantShiftRepository$assignShift$1.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            InstantShiftRepository$assignShift$2 instantShiftRepository$assignShift$2 = new InstantShiftRepository$assignShift$2(this, i, null);
            instantShiftRepository$assignShift$1.RemoteActionCompatParcelizer = 1;
            Object objM4875invokegIAlus = this.write.m4875invokegIAlus(instantShiftRepository$assignShift$2, instantShiftRepository$assignShift$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        if (i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i7 = MediaMetadataCompat + 39;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return null;
        }
        int i9 = MediaMetadataCompat + 7;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }
}
