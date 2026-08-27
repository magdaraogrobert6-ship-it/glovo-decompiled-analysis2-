package com.roadrunner.home.floatinglayer.config;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import o.FragmentManagerSaveBackStackState;
import o.GetTargetFragmentRequestCodeUsageViolation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onFragmentResumed;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFloatingLayerScope$invoke$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ GetTargetFragmentRequestCodeUsageViolation read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetFloatingLayerScope$invoke$1(GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = getTargetFragmentRequestCodeUsageViolation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = this.read;
        if (i3 == 0) {
            GetFloatingLayerScope$invoke$1 getFloatingLayerScope$invoke$1 = new GetFloatingLayerScope$invoke$1(getTargetFragmentRequestCodeUsageViolation, shortNewsContentCardView, 0);
            getFloatingLayerScope$invoke$1.IconCompatParcelizer = obj;
            return getFloatingLayerScope$invoke$1;
        }
        GetFloatingLayerScope$invoke$1 getFloatingLayerScope$invoke$2 = new GetFloatingLayerScope$invoke$1(getTargetFragmentRequestCodeUsageViolation, shortNewsContentCardView, 1);
        getFloatingLayerScope$invoke$2.IconCompatParcelizer = obj;
        int i4 = serializer + 15;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getFloatingLayerScope$invoke$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 == 0) {
            ((GetFloatingLayerScope$invoke$1) create((FragmentManagerSaveBackStackState) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        ((GetFloatingLayerScope$invoke$1) create((onFragmentResumed) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        int i4 = serializer + 33;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return createfromparcel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = this.read;
        Object obj2 = this.IconCompatParcelizer;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getTargetFragmentRequestCodeUsageViolation.serializer = (onFragmentResumed) obj2;
            int i4 = RemoteActionCompatParcelizer + 99;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FloatingLayerConfigurationType: " + ((FragmentManagerSaveBackStackState) obj2), new Object[0]);
        onFragmentResumed onfragmentresumed = getTargetFragmentRequestCodeUsageViolation.serializer;
        if (onfragmentresumed != null) {
            YieldKt.write(onfragmentresumed.serializer, (CancellationException) null);
            int i6 = serializer + 109;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = RemoteActionCompatParcelizer + 21;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return createfromparcel2;
        }
        throw null;
    }
}
