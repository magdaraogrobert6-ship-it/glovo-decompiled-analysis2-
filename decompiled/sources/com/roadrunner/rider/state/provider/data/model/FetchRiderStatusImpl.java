package com.roadrunner.rider.state.provider.data.model;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.HomeRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.setOnSessionTrackingFailedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRiderStatusImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final HomeRepositoryImpl RemoteActionCompatParcelizer;

    public FetchRiderStatusImpl(HomeRepositoryImpl homeRepositoryImpl) {
        this.RemoteActionCompatParcelizer = homeRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m5029invokeIoAF18A(ContinuationImpl continuationImpl) {
        FetchRiderStatusImpl$invoke$1 fetchRiderStatusImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof FetchRiderStatusImpl$invoke$1) {
            int i2 = read + 107;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fetchRiderStatusImpl$invoke$1 = (FetchRiderStatusImpl$invoke$1) continuationImpl;
            int i4 = fetchRiderStatusImpl$invoke$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fetchRiderStatusImpl$invoke$1.write = i4 - Integer.MIN_VALUE;
            } else {
                fetchRiderStatusImpl$invoke$1 = new FetchRiderStatusImpl$invoke$1(this, continuationImpl);
                int i5 = IconCompatParcelizer + 109;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            fetchRiderStatusImpl$invoke$1 = new FetchRiderStatusImpl$invoke$1(this, continuationImpl);
            int i7 = IconCompatParcelizer + 109;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object obj = fetchRiderStatusImpl$invoke$1.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = fetchRiderStatusImpl$invoke$1.write;
        if (i9 != 0) {
            int i10 = IconCompatParcelizer + 97;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0 ? i9 != 1 : i9 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        fetchRiderStatusImpl$invoke$1.write = 1;
        Object objM5028fetchHomeApiIoAF18A = m5028fetchHomeApiIoAF18A(fetchRiderStatusImpl$invoke$1);
        if (objM5028fetchHomeApiIoAF18A == obj2) {
            int i11 = read + 43;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return obj2;
            }
            throw null;
        }
        int i12 = IconCompatParcelizer + 125;
        read = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            return objM5028fetchHomeApiIoAF18A;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r4
  0x002b: PHI (r1v13 com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl$fetchHomeApi$1) = 
  (r1v12 com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl$fetchHomeApi$1)
  (r1v15 com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl$fetchHomeApi$1)
 binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: fetchHomeApi-IoAF18A, reason: not valid java name */
    public final Object m5028fetchHomeApiIoAF18A(ContinuationImpl continuationImpl) {
        FetchRiderStatusImpl$fetchHomeApi$1 fetchRiderStatusImpl$fetchHomeApi$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof FetchRiderStatusImpl$fetchHomeApi$1) {
            int i3 = IconCompatParcelizer + 95;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                fetchRiderStatusImpl$fetchHomeApi$1 = (FetchRiderStatusImpl$fetchHomeApi$1) continuationImpl;
                i = fetchRiderStatusImpl$fetchHomeApi$1.RemoteActionCompatParcelizer;
                int i4 = 17 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fetchRiderStatusImpl$fetchHomeApi$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    fetchRiderStatusImpl$fetchHomeApi$1 = new FetchRiderStatusImpl$fetchHomeApi$1(this, continuationImpl);
                }
            } else {
                fetchRiderStatusImpl$fetchHomeApi$1 = (FetchRiderStatusImpl$fetchHomeApi$1) continuationImpl;
                i = fetchRiderStatusImpl$fetchHomeApi$1.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fetchRiderStatusImpl$fetchHomeApi$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    fetchRiderStatusImpl$fetchHomeApi$1 = new FetchRiderStatusImpl$fetchHomeApi$1(this, continuationImpl);
                }
            }
        } else {
            fetchRiderStatusImpl$fetchHomeApi$1 = new FetchRiderStatusImpl$fetchHomeApi$1(this, continuationImpl);
        }
        Object obj = fetchRiderStatusImpl$fetchHomeApi$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = fetchRiderStatusImpl$fetchHomeApi$1.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i5 != 0) {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = read + 109;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String value = setOnSessionTrackingFailedListener.OTHER.getValue();
        fetchRiderStatusImpl$fetchHomeApi$1.RemoteActionCompatParcelizer = 1;
        Object objM4971fetchHomeResponseAsyncBWLJW6A = this.RemoteActionCompatParcelizer.m4971fetchHomeResponseAsyncBWLJW6A(value, null, fetchRiderStatusImpl$fetchHomeApi$1, false);
        if (objM4971fetchHomeResponseAsyncBWLJW6A != coroutineSingletons) {
            return objM4971fetchHomeResponseAsyncBWLJW6A;
        }
        int i8 = read + 15;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return coroutineSingletons;
        }
        obj2.hashCode();
        throw null;
    }
}
