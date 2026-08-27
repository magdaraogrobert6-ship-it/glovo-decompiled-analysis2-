package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.PlatformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2;
import o.accessclassifyTextM8tDOmk;
import o.createFromParcel;
import o.jumpByLinesOffset;

/* JADX INFO: loaded from: classes.dex */
public final class PressGestureScopeImpl implements Density {
    public boolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final MutexImpl serializer = new MutexImpl(false);
    public final /* synthetic */ Density write;

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer = true;
        MutexImpl mutexImpl = this.serializer;
        if (mutexImpl.read()) {
            mutexImpl.write(null);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer = true;
        MutexImpl mutexImpl = this.serializer;
        if (mutexImpl.read()) {
            mutexImpl.write(null);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.write.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.write.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
    public final int mo41roundToPxR2X_6o(long j) {
        return this.write.mo41roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
    public final int mo42roundToPx0680j_4(float f) {
        return this.write.mo42roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
    public final float mo43toDpGaN1DYA(long j) {
        return this.write.mo43toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
    public final float mo44toDpu2uoSUM(float f) {
        return this.write.mo44toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
    public final long mo46toDpSizekrfVVM(long j) {
        return this.write.mo46toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
    public final float mo47toPxR2X_6o(long j) {
        return this.write.mo47toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
    public final float mo48toPx0680j_4(float f) {
        return this.write.mo48toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        return this.write.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
    public final long mo49toSizeXkaWNTQ(long j) {
        return this.write.mo49toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
    public final long mo50toSp0xMU5do(float f) {
        return this.write.mo50toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public final long mo51toSpkPz2Gy4(float f) {
        return this.write.mo51toSpkPz2Gy4(f);
    }

    public PressGestureScopeImpl(Density density) {
        this.write = density;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object awaitRelease(ContinuationImpl continuationImpl) {
        PlatformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2 platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2;
        if (continuationImpl instanceof PlatformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2) {
            platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2 = (PlatformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2) continuationImpl;
            int i = platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2 = new PlatformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2(this, continuationImpl);
            }
        } else {
            platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2 = new PlatformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2(this, continuationImpl);
        }
        Object objTryAwaitRelease = platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2.serializer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objTryAwaitRelease);
            platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2.RemoteActionCompatParcelizer = 1;
            objTryAwaitRelease = tryAwaitRelease(platformSelectionBehaviorsImplsuggestSelectionForLongPressOrDoubleClick2);
            if (objTryAwaitRelease == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objTryAwaitRelease);
        }
        if (((Boolean) objTryAwaitRelease).booleanValue()) {
            return createFromParcel.INSTANCE;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object reset(ContinuationImpl continuationImpl) {
        jumpByLinesOffset jumpbylinesoffset;
        if (continuationImpl instanceof jumpByLinesOffset) {
            jumpbylinesoffset = (jumpByLinesOffset) continuationImpl;
            int i = jumpbylinesoffset.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                jumpbylinesoffset.serializer = i - Integer.MIN_VALUE;
            } else {
                jumpbylinesoffset = new jumpByLinesOffset(this, continuationImpl);
            }
        } else {
            jumpbylinesoffset = new jumpByLinesOffset(this, continuationImpl);
        }
        Object obj = jumpbylinesoffset.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = jumpbylinesoffset.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            jumpbylinesoffset.serializer = 1;
            if (this.serializer.lock(jumpbylinesoffset) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = false;
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object tryAwaitRelease(ContinuationImpl continuationImpl) {
        accessclassifyTextM8tDOmk accessclassifytextm8tdomk;
        if (continuationImpl instanceof accessclassifyTextM8tDOmk) {
            accessclassifytextm8tdomk = (accessclassifyTextM8tDOmk) continuationImpl;
            int i = accessclassifytextm8tdomk.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessclassifytextm8tdomk.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                accessclassifytextm8tdomk = new accessclassifyTextM8tDOmk(this, continuationImpl);
            }
        } else {
            accessclassifytextm8tdomk = new accessclassifyTextM8tDOmk(this, continuationImpl);
        }
        Object obj = accessclassifytextm8tdomk.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessclassifytextm8tdomk.RemoteActionCompatParcelizer;
        MutexImpl mutexImpl = this.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!this.RemoteActionCompatParcelizer && !this.IconCompatParcelizer) {
                accessclassifytextm8tdomk.RemoteActionCompatParcelizer = 1;
                if (mutexImpl.lock(accessclassifytextm8tdomk) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(this.RemoteActionCompatParcelizer);
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        mutexImpl.write(null);
        return Boolean.valueOf(this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
    public final float mo45toDpu2uoSUM(int i) {
        return this.write.mo45toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public final long mo52toSpkPz2Gy4(int i) {
        return this.write.mo52toSpkPz2Gy4(i);
    }
}
