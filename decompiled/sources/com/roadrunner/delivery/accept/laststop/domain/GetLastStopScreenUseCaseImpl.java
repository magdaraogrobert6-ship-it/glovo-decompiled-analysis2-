package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.laststop.data.LastStopRepositoryImpl;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$extractValue$1;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.LifecycleDestroyedException;
import o.PausingDispatcherKtwhenStateAtLeast2;
import o.ProcessLifecycleOwnerattach1onActivityPreCreated1;
import o.getOffsetForHorizontal;
import o.getTopPaddingui_textannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.upFrom;

/* JADX INFO: loaded from: classes3.dex */
public final class GetLastStopScreenUseCaseImpl {
    private static int read = 0;
    private static int write = 1;
    public final LastStopRepositoryImpl IconCompatParcelizer;
    public final NestComponentRepositoryImpl RemoteActionCompatParcelizer;

    public GetLastStopScreenUseCaseImpl(LastStopRepositoryImpl lastStopRepositoryImpl, getOffsetForHorizontal getoffsetforhorizontal, NestComponentRepositoryImpl nestComponentRepositoryImpl) {
        this.IconCompatParcelizer = lastStopRepositoryImpl;
        this.RemoteActionCompatParcelizer = nestComponentRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    public final Object getLastStopScreenUrl(ContinuationImpl continuationImpl) {
        getTopPaddingui_textannotations gettoppaddingui_textannotations;
        String strWrite;
        LifecycleDestroyedException lifecycleDestroyedExceptionSerializer;
        ProcessLifecycleOwnerattach1onActivityPreCreated1 processLifecycleOwnerattach1onActivityPreCreated1Write;
        int i = 2;
        int i2 = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof getTopPaddingui_textannotations) {
            int i3 = read + 115;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = ((getTopPaddingui_textannotations) continuationImpl).read;
                throw null;
            }
            gettoppaddingui_textannotations = (getTopPaddingui_textannotations) continuationImpl;
            int i5 = gettoppaddingui_textannotations.read;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = write + 95;
                read = i6 % Fields.SpotShadowColor;
                gettoppaddingui_textannotations.read = i6 % 2 != 0 ? i5 - Integer.MIN_VALUE : i5 - Integer.MIN_VALUE;
            } else {
                gettoppaddingui_textannotations = new getTopPaddingui_textannotations(this, continuationImpl);
            }
        } else {
            gettoppaddingui_textannotations = new getTopPaddingui_textannotations(this, continuationImpl);
        }
        Object objFirst = gettoppaddingui_textannotations.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = gettoppaddingui_textannotations.read;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            ObserveDivider$invoke$$inlined$extractValue$1 observeDivider$invoke$$inlined$extractValue$1 = new ObserveDivider$invoke$$inlined$extractValue$1(new SettingsViewModel$special$$inlined$map$1(this.RemoteActionCompatParcelizer.IconCompatParcelizer, 4, "last_stop"), i);
            gettoppaddingui_textannotations.read = 1;
            objFirst = FlowKt.first(observeDivider$invoke$$inlined$extractValue$1, gettoppaddingui_textannotations);
            if (objFirst == coroutineSingletons) {
                int i8 = read + 15;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 37 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = read + 47;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
                int i11 = 80 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            }
        }
        upFrom upfrom = (upFrom) objFirst;
        if (upfrom == null || (processLifecycleOwnerattach1onActivityPreCreated1Write = upfrom.write()) == null) {
            strWrite = null;
        } else {
            int i12 = write + 77;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            strWrite = processLifecycleOwnerattach1onActivityPreCreated1Write.write();
        }
        if (strWrite != null) {
            int i14 = write + 103;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strWrite)) {
                int i16 = read + 57;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                strWrite = null;
            }
        } else {
            int i18 = read + 57;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            strWrite = null;
        }
        if (strWrite != null) {
            return strWrite;
        }
        if (upfrom != null) {
            int i20 = write + 17;
            read = i20 % Fields.SpotShadowColor;
            if (i20 % 2 != 0) {
                upfrom.serializer();
                obj.hashCode();
                throw null;
            }
            PausingDispatcherKtwhenStateAtLeast2 pausingDispatcherKtwhenStateAtLeast2Serializer = upfrom.serializer();
            if (pausingDispatcherKtwhenStateAtLeast2Serializer != null && (lifecycleDestroyedExceptionSerializer = pausingDispatcherKtwhenStateAtLeast2Serializer.serializer()) != null) {
                String strSerializer = lifecycleDestroyedExceptionSerializer.serializer();
                int i21 = write + 125;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                return strSerializer;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: all -> 0x00b4, PHI: r10
  0x00ab: PHI (r10v14 o.get_nativeCanvasui_textannotations) = (r10v13 o.get_nativeCanvasui_textannotations), (r10v16 o.get_nativeCanvasui_textannotations) binds: [B:44:0x00a9, B:41:0x00a4] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00b4, blocks: (B:39:0x009e, B:46:0x00af, B:45:0x00ab, B:43:0x00a7), top: B:56:0x009c }] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4905invokeIoAF18A(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.laststop.domain.GetLastStopScreenUseCaseImpl.m4905invokeIoAF18A(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
