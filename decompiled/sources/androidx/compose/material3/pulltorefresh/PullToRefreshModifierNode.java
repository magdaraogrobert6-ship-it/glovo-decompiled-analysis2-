package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.AutofillModifierKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAutofillTypes;
import o.getBoundingBox;
import o.getContentCaptureSessionui;
import o.getOnFill;
import o.getPersonFullName;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setBoundingBox;

/* JADX INFO: loaded from: classes.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements NestedScrollConnection {
    public boolean IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public getOnFill RatingCompat;
    public boolean read;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final DelegatableNode RemoteActionCompatParcelizer = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
    public final populate MediaMetadataCompat = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
    public final populate write = getPersonFullName.RemoteActionCompatParcelizer(0.0f);

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        ((getContentCaptureSessionui) this.write).IconCompatParcelizer(f);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        delegate(this.RemoteActionCompatParcelizer);
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new PullToRefreshModifierNode$update$1(this, null, 1), 3);
        read(this.read ? RemoteActionCompatParcelizer() : 0.0f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo55onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.RatingCompat.write.IconCompatParcelizer()) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        if (!this.IconCompatParcelizer) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m1926equalsimpl0(i, NestedScrollSource.Companion.m1938getUserInputWNlRxjI())) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        long jM138consumeAvailableOffsetMKHz9U = m138consumeAvailableOffsetMKHz9U(j2);
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new PullToRefreshModifierNode$update$1(this, null, 2), 3);
        return jM138consumeAvailableOffsetMKHz9U;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo93onPreScrollOzD1aCk(long j, int i) {
        if (this.RatingCompat.write.IconCompatParcelizer()) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        if (this.IconCompatParcelizer) {
            return (!NestedScrollSource.m1926equalsimpl0(i, NestedScrollSource.Companion.m1938getUserInputWNlRxjI()) || Float.intBitsToFloat((int) (4294967295L & j)) >= 0.0f) ? Offset.Companion.m493getZeroF1C5BW0() : m138consumeAvailableOffsetMKHz9U(j);
        }
        return Offset.Companion.m493getZeroF1C5BW0();
    }

    public final void read(float f) {
        ((getContentCaptureSessionui) this.MediaMetadataCompat).IconCompatParcelizer(f);
    }

    public PullToRefreshModifierNode(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z2, getOnFill getonfill, float f) {
        this.read = z;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = z2;
        this.RatingCompat = getonfill;
        this.MediaBrowserCompatMediaItem = f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$animateToThreshold(PullToRefreshModifierNode pullToRefreshModifierNode, ContinuationImpl continuationImpl) {
        getAutofillTypes getautofilltypes;
        pullToRefreshModifierNode.getClass();
        if (continuationImpl instanceof getAutofillTypes) {
            getautofilltypes = (getAutofillTypes) continuationImpl;
            int i = getautofilltypes.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getautofilltypes.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getautofilltypes = new getAutofillTypes(pullToRefreshModifierNode, continuationImpl);
            }
        } else {
            getautofilltypes = new getAutofillTypes(pullToRefreshModifierNode, continuationImpl);
        }
        Object obj = getautofilltypes.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getautofilltypes.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getOnFill getonfill = pullToRefreshModifierNode.RatingCompat;
                getautofilltypes.IconCompatParcelizer = 1;
                Object objIconCompatParcelizer = Animatable.IconCompatParcelizer(getonfill.write, new Float(1.0f), null, getautofilltypes, 14);
                if (objIconCompatParcelizer != coroutineSingletons) {
                    objIconCompatParcelizer = createfromparcel;
                }
                if (objIconCompatParcelizer == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            if (pullToRefreshModifierNode.isAttached()) {
                pullToRefreshModifierNode.RemoteActionCompatParcelizer(pullToRefreshModifierNode.RemoteActionCompatParcelizer());
                pullToRefreshModifierNode.read(pullToRefreshModifierNode.RemoteActionCompatParcelizer());
            }
            return createfromparcel;
        } catch (Throwable th) {
            if (pullToRefreshModifierNode.isAttached()) {
                pullToRefreshModifierNode.RemoteActionCompatParcelizer(pullToRefreshModifierNode.RemoteActionCompatParcelizer());
                pullToRefreshModifierNode.read(pullToRefreshModifierNode.RemoteActionCompatParcelizer());
            }
            throw th;
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return DelegatableNodeKt.requireDensity(this).mo42roundToPx0680j_4(this.MediaBrowserCompatMediaItem);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object animateToHidden(ContinuationImpl continuationImpl) {
        AutofillModifierKt autofillModifierKt;
        if (continuationImpl instanceof AutofillModifierKt) {
            autofillModifierKt = (AutofillModifierKt) continuationImpl;
            int i = autofillModifierKt.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                autofillModifierKt.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                autofillModifierKt = new AutofillModifierKt(this, continuationImpl);
            }
        } else {
            autofillModifierKt = new AutofillModifierKt(this, continuationImpl);
        }
        Object obj = autofillModifierKt.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = autofillModifierKt.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getOnFill getonfill = this.RatingCompat;
                autofillModifierKt.IconCompatParcelizer = 1;
                Object objIconCompatParcelizer = Animatable.IconCompatParcelizer(getonfill.write, new Float(0.0f), null, autofillModifierKt, 14);
                if (objIconCompatParcelizer != coroutineSingletons) {
                    objIconCompatParcelizer = createfromparcel;
                }
                if (objIconCompatParcelizer == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            RemoteActionCompatParcelizer(0.0f);
            read(0.0f);
            return createfromparcel;
        } catch (Throwable th) {
            RemoteActionCompatParcelizer(0.0f);
            read(0.0f);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo123onPreFlingQWom1Mo(long j, ShortNewsContentCardView shortNewsContentCardView) {
        getBoundingBox getboundingbox;
        if (shortNewsContentCardView instanceof getBoundingBox) {
            getboundingbox = (getBoundingBox) shortNewsContentCardView;
            int i = getboundingbox.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getboundingbox.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getboundingbox = new getBoundingBox(this, shortNewsContentCardView);
            }
        } else {
            getboundingbox = new getBoundingBox(this, shortNewsContentCardView);
        }
        Object objOnRelease = getboundingbox.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getboundingbox.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objOnRelease);
            float fM3912getYimpl = Velocity.m3912getYimpl(j);
            getboundingbox.IconCompatParcelizer = 1;
            objOnRelease = onRelease(fM3912getYimpl, getboundingbox);
            if (objOnRelease == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objOnRelease);
        }
        return Velocity.m3902boximpl(VelocityKt.Velocity(0.0f, ((Number) objOnRelease).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onRelease(float f, ContinuationImpl continuationImpl) {
        setBoundingBox setboundingbox;
        if (continuationImpl instanceof setBoundingBox) {
            setboundingbox = (setBoundingBox) continuationImpl;
            int i = setboundingbox.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                setboundingbox.read = i - Integer.MIN_VALUE;
            } else {
                setboundingbox = new setBoundingBox(this, continuationImpl);
            }
        } else {
            setboundingbox = new setBoundingBox(this, continuationImpl);
        }
        Object obj = setboundingbox.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setboundingbox.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (this.read) {
                return new Float(0.0f);
            }
            getContentCaptureSessionui getcontentcapturesessionui = (getContentCaptureSessionui) this.write;
            if (getcontentcapturesessionui.serializer() * 0.5f > RemoteActionCompatParcelizer()) {
                this.serializer.invoke();
            }
            if (getcontentcapturesessionui.serializer() == 0.0f || f < 0.0f) {
                f = 0.0f;
            }
            setboundingbox.RemoteActionCompatParcelizer = f;
            setboundingbox.read = 1;
            if (animateToHidden(setboundingbox) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = setboundingbox.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        RemoteActionCompatParcelizer(0.0f);
        return new Float(f);
    }

    /* JADX INFO: renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    public final long m138consumeAvailableOffsetMKHz9U(long j) {
        float fSerializer;
        float fRemoteActionCompatParcelizer;
        if (this.read) {
            fSerializer = 0.0f;
        } else {
            getContentCaptureSessionui getcontentcapturesessionui = (getContentCaptureSessionui) this.write;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + getcontentcapturesessionui.serializer();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fSerializer = fIntBitsToFloat - getcontentcapturesessionui.serializer();
            RemoteActionCompatParcelizer(fIntBitsToFloat);
            if (getcontentcapturesessionui.serializer() * 0.5f <= RemoteActionCompatParcelizer()) {
                fRemoteActionCompatParcelizer = getcontentcapturesessionui.serializer() * 0.5f;
            } else {
                float fWrite = RangesKt.write(Math.abs((getcontentcapturesessionui.serializer() * 0.5f) / RemoteActionCompatParcelizer()) - 1.0f, 0.0f, 2.0f);
                fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer() + (RemoteActionCompatParcelizer() * (fWrite - (((float) Math.pow(fWrite, 2.0d)) / 4.0f)));
            }
            read(fRemoteActionCompatParcelizer);
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fSerializer)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }
}
