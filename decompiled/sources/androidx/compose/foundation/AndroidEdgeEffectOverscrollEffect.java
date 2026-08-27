package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import o.AndroidContentCaptureManager;
import o.LazyColumn;
import o.LazyLayoutPinnedItemList;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SwitchKt;
import o.createFromParcel;
import o.isNotGestureActionfoundation;
import o.onShowTranslationui;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.scrollToItem;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements isNotGestureActionfoundation {
    public final boolean IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem = Offset.Companion.m492getUnspecifiedF1C5BW0();
    public long MediaDescriptionCompat;
    public final PopulateViewStructure_androidKtpopulate7 MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final SuspendingPointerInputModifierNode RatingCompat;
    public long RemoteActionCompatParcelizer;
    public final Density read;
    public final LazyLayoutPinnedItemList serializer;
    public final DelegatingNode write;

    public final void read() {
        boolean z;
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList = this.serializer;
        EdgeEffect edgeEffect = lazyLayoutPinnedItemList.MediaSessionCompatQueueItem;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = lazyLayoutPinnedItemList.read;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = lazyLayoutPinnedItemList.write;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z2 = false;
            }
        } else {
            z2 = z;
        }
        EdgeEffect edgeEffect4 = lazyLayoutPinnedItemList.RatingCompat;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: updateSize-uvyYCjk$foundation, reason: not valid java name */
    public final void m19updateSizeuvyYCjk$foundation(long j) {
        boolean zM542equalsimpl0 = Size.m542equalsimpl0(this.RemoteActionCompatParcelizer, Size.Companion.m555getZeroNHjbRc());
        boolean zM542equalsimpl1 = Size.m542equalsimpl0(j, this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = j;
        if (!zM542equalsimpl1) {
            long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) MathKt.write(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) MathKt.write(Float.intBitsToFloat((int) (j >> 32)))) << 32));
            LazyLayoutPinnedItemList lazyLayoutPinnedItemList = this.serializer;
            lazyLayoutPinnedItemList.MediaMetadataCompat = jM3839constructorimpl;
            EdgeEffect edgeEffect = lazyLayoutPinnedItemList.MediaSessionCompatQueueItem;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM3839constructorimpl >> 32), (int) (jM3839constructorimpl & 4294967295L));
            }
            EdgeEffect edgeEffect2 = lazyLayoutPinnedItemList.read;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM3839constructorimpl >> 32), (int) (jM3839constructorimpl & 4294967295L));
            }
            EdgeEffect edgeEffect3 = lazyLayoutPinnedItemList.write;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM3839constructorimpl & 4294967295L), (int) (jM3839constructorimpl >> 32));
            }
            EdgeEffect edgeEffect4 = lazyLayoutPinnedItemList.RatingCompat;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM3839constructorimpl & 4294967295L), (int) (jM3839constructorimpl >> 32));
            }
            EdgeEffect edgeEffect5 = lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM3839constructorimpl >> 32), (int) (jM3839constructorimpl & 4294967295L));
            }
            EdgeEffect edgeEffect6 = lazyLayoutPinnedItemList.IconCompatParcelizer;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM3839constructorimpl >> 32), (int) (jM3839constructorimpl & 4294967295L));
            }
            EdgeEffect edgeEffect7 = lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM3839constructorimpl & 4294967295L), (int) (jM3839constructorimpl >> 32));
            }
            EdgeEffect edgeEffect8 = lazyLayoutPinnedItemList.MediaDescriptionCompat;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM3839constructorimpl), (int) (jM3839constructorimpl >> 32));
            }
        }
        if (zM542equalsimpl0 || zM542equalsimpl1) {
            return;
        }
        read();
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, SwitchKt switchKt) {
        this.read = density;
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList = new LazyLayoutPinnedItemList(context, ColorKt.m776toArgb8_81llA(j));
        this.serializer = lazyLayoutPinnedItemList;
        this.MediaMetadataCompat = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = true;
        this.RemoteActionCompatParcelizer = Size.Companion.m555getZeroNHjbRc();
        this.MediaDescriptionCompat = PointerId.m2048constructorimpl(-1L);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new LazyLayoutPagerKt$dragDirectionDetector$1(1, this));
        this.RatingCompat = SuspendingPointerInputModifierNode;
        this.write = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(SuspendingPointerInputModifierNode, this, lazyLayoutPinnedItemList) : new GlowOverscrollNode(SuspendingPointerInputModifierNode, this, lazyLayoutPinnedItemList, switchKt);
    }

    public final void IconCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            ((onShowTranslationui) this.MediaMetadataCompat).setValue(createFromParcel.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    public final Object m13applyToFlingBMRW4eQ(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        LazyColumn lazyColumn;
        float fRemoteActionCompatParcelizer;
        float fRemoteActionCompatParcelizer2;
        long j2;
        if (continuationImpl instanceof LazyColumn) {
            lazyColumn = (LazyColumn) continuationImpl;
            int i = lazyColumn.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyColumn.write = i - Integer.MIN_VALUE;
            } else {
                lazyColumn = new LazyColumn(this, continuationImpl);
            }
        } else {
            lazyColumn = new LazyColumn(this, continuationImpl);
        }
        Object objInvoke = lazyColumn.read;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyColumn.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList = this.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            if (Size.m548isEmptyimpl(this.RemoteActionCompatParcelizer)) {
                Object objM3902boximpl = Velocity.m3902boximpl(j);
                lazyColumn.write = 1;
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(objM3902boximpl, lazyColumn) != obj) {
                    return createfromparcel;
                }
            } else {
                boolean zWrite = LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.write);
                Density density = this.read;
                if (zWrite && Velocity.m3911getXimpl(j) < 0.0f) {
                    fRemoteActionCompatParcelizer = PagerWrapperFlingBehavior.RemoteActionCompatParcelizer(lazyLayoutPinnedItemList.serializer(), Velocity.m3911getXimpl(j), Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32)), density);
                } else {
                    fRemoteActionCompatParcelizer = (!LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.RatingCompat) || Velocity.m3911getXimpl(j) <= 0.0f) ? 0.0f : -PagerWrapperFlingBehavior.RemoteActionCompatParcelizer(lazyLayoutPinnedItemList.read(), -Velocity.m3911getXimpl(j), Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32)), density);
                }
                if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.MediaSessionCompatQueueItem) && Velocity.m3912getYimpl(j) < 0.0f) {
                    fRemoteActionCompatParcelizer2 = PagerWrapperFlingBehavior.RemoteActionCompatParcelizer(lazyLayoutPinnedItemList.RemoteActionCompatParcelizer(), Velocity.m3912getYimpl(j), Float.intBitsToFloat((int) (4294967295L & this.RemoteActionCompatParcelizer)), density);
                } else {
                    fRemoteActionCompatParcelizer2 = (!LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.read) || Velocity.m3912getYimpl(j) <= 0.0f) ? 0.0f : -PagerWrapperFlingBehavior.RemoteActionCompatParcelizer(lazyLayoutPinnedItemList.write(), -Velocity.m3912getYimpl(j), Float.intBitsToFloat((int) (4294967295L & this.RemoteActionCompatParcelizer)), density);
                }
                long jVelocity = VelocityKt.Velocity(fRemoteActionCompatParcelizer, fRemoteActionCompatParcelizer2);
                if (!Velocity.m3910equalsimpl0(jVelocity, Velocity.Companion.m3922getZero9UxMQ8M())) {
                    IconCompatParcelizer();
                }
                long jM3914minusAH228Gc = Velocity.m3914minusAH228Gc(j, jVelocity);
                Object objM3902boximpl2 = Velocity.m3902boximpl(jM3914minusAH228Gc);
                lazyColumn.serializer = jM3914minusAH228Gc;
                lazyColumn.write = 2;
                objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(objM3902boximpl2, lazyColumn);
                if (objInvoke != obj) {
                    j2 = jM3914minusAH228Gc;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            return createfromparcel;
        }
        if (i2 == 2) {
            j2 = lazyColumn.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long jM3914minusAH228Gc2 = Velocity.m3914minusAH228Gc(j2, ((Velocity) objInvoke).m3920unboximpl());
        this.MediaSessionCompatQueueItem = false;
        if (Velocity.m3911getXimpl(jM3914minusAH228Gc2) > 0.0f) {
            EdgeEffect edgeEffectSerializer = lazyLayoutPinnedItemList.serializer();
            int iWrite = MathKt.write(Velocity.m3911getXimpl(jM3914minusAH228Gc2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectSerializer.isFinished()) {
                edgeEffectSerializer.onAbsorb(iWrite);
            }
        } else if (Velocity.m3911getXimpl(jM3914minusAH228Gc2) < 0.0f) {
            EdgeEffect edgeEffect = lazyLayoutPinnedItemList.read();
            int i3 = -MathKt.write(Velocity.m3911getXimpl(jM3914minusAH228Gc2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
                edgeEffect.onAbsorb(i3);
            }
        }
        if (Velocity.m3912getYimpl(jM3914minusAH228Gc2) > 0.0f) {
            EdgeEffect edgeEffectRemoteActionCompatParcelizer = lazyLayoutPinnedItemList.RemoteActionCompatParcelizer();
            int iWrite2 = MathKt.write(Velocity.m3912getYimpl(jM3914minusAH228Gc2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectRemoteActionCompatParcelizer.isFinished()) {
                edgeEffectRemoteActionCompatParcelizer.onAbsorb(iWrite2);
            }
        } else if (Velocity.m3912getYimpl(jM3914minusAH228Gc2) < 0.0f) {
            EdgeEffect edgeEffectWrite = lazyLayoutPinnedItemList.write();
            int i4 = -MathKt.write(Velocity.m3912getYimpl(jM3914minusAH228Gc2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectWrite.isFinished()) {
                edgeEffectWrite.onAbsorb(i4);
            }
        }
        read();
        return createfromparcel;
    }

    /* JADX INFO: renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    public final float m15pullBottomk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m14displacementF1C5BW0$foundation() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer & 4294967295L));
        EdgeEffect edgeEffectWrite = this.serializer.write();
        float fRemoteActionCompatParcelizer = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fRemoteActionCompatParcelizer = scrollToItem.RemoteActionCompatParcelizer(edgeEffectWrite, fRemoteActionCompatParcelizer, f);
        } else {
            edgeEffectWrite.onPull(fRemoteActionCompatParcelizer, f);
        }
        float f2 = -fRemoteActionCompatParcelizer;
        return (i2 >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffectWrite) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.RemoteActionCompatParcelizer)) * f2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    public final float m18pullTopk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m14displacementF1C5BW0$foundation() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer & 4294967295L));
        EdgeEffect edgeEffectRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = scrollToItem.RemoteActionCompatParcelizer(edgeEffectRemoteActionCompatParcelizer, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectRemoteActionCompatParcelizer.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffectRemoteActionCompatParcelizer) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    public final float m16pullLeftk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m14displacementF1C5BW0$foundation() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32));
        EdgeEffect edgeEffectSerializer = this.serializer.serializer();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = scrollToItem.RemoteActionCompatParcelizer(edgeEffectSerializer, fIntBitsToFloat2, f);
        } else {
            edgeEffectSerializer.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffectSerializer) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    public final float m17pullRightk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m14displacementF1C5BW0$foundation() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32));
        EdgeEffect edgeEffect = this.serializer.read();
        float fRemoteActionCompatParcelizer = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fRemoteActionCompatParcelizer = scrollToItem.RemoteActionCompatParcelizer(edgeEffect, fRemoteActionCompatParcelizer, fIntBitsToFloat);
        } else {
            edgeEffect.onPull(fRemoteActionCompatParcelizer, fIntBitsToFloat);
        }
        float f = -fRemoteActionCompatParcelizer;
        return (i2 >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32)) * f : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: displacement-F1C5BW0$foundation, reason: not valid java name */
    public final long m14displacementF1C5BW0$foundation() {
        long jM556getCenteruvyYCjk = this.MediaBrowserCompatMediaItem;
        if ((InlineClassHelperKt.DualUnsignedFloatMask & jM556getCenteruvyYCjk) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM556getCenteruvyYCjk = SizeKt.m556getCenteruvyYCjk(this.RemoteActionCompatParcelizer);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM556getCenteruvyYCjk >> 32)) / Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32));
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM556getCenteruvyYCjk & 4294967295L)) / Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
    }
}
