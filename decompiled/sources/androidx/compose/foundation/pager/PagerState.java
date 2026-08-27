package androidx.compose.foundation.pager;

import androidx.camera.view.PendingValue;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.navigation.NavArgsLazy;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.internal.http2.e$h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManager;
import o.CommonDecorationBox;
import o.ComposePausableCompositionExceptionoperationsSequence1;
import o.ExtendedFabSmallTokens;
import o.LinearProgressIndicatorTokens;
import o.MultiSubscriptionSnapshotFlowManager;
import o.PlatformSelectionBehaviorsImpl;
import o.PointerInteropFilterDispatchToViewState;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ProvidableCompositionLocal;
import o.RadioButtonTokens;
import o.RecomposerExternalSyntheticLambda4;
import o.RecomposerrunRecomposeAndApplyChanges2;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.TextLayoutResultProxy;
import o.TrackpadScrollingLogic;
import o.TriStateCheckbox;
import o.animateToWithDecay;
import o.applyMeasureResultfoundation;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.getAdjustedCoordinatesk4lQ0M;
import o.getBrush;
import o.getCieXyz;
import o.getContentCaptureSessionui;
import o.getPersonFullName;
import o.getPlatformAndroidManager;
import o.inspectableProperties;
import o.invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1;
import o.isAppSetIdReadingEnabled;
import o.onContentCardDismissed;
import o.onHideTranslationui;
import o.onShowTranslationui;
import o.populate;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setNativeShader;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class PagerState implements getAdjustedCoordinatesk4lQ0M {
    public int ComponentActivity;
    public final AwaitFirstLayoutModifier IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public final PopulateViewStructure_androidKtpopulate7 MediaDescriptionCompat;
    public Density MediaMetadataCompat;
    public final CommonDecorationBox MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatToken;
    public final MutableInteractionSourceImpl ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public final invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1 RatingCompat;
    public final PopulateViewStructure_androidKtpopulate7 ResultReceiver;
    public final PopulateViewStructure_androidKtpopulate7 _init_lambda1;
    public final DefaultScrollableState _init_lambda2;
    public final getPlatformAndroidManager _init_lambda3;
    public long r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final PopulateViewStructure_androidKtpopulate7 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final LazyLayoutPinnedItemList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final RadioButtonTokens r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final ProvidableCompositionLocal r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final e$h r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public float r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final getPlatformAndroidManager r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public float read;
    public PagerMeasureResult serializer;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ float RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ TrackpadScrollingLogic serializer;
        public /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, float f, TrackpadScrollingLogic trackpadScrollingLogic, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = f;
            this.serializer = trackpadScrollingLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass3 anonymousClass3 = PagerState.this.new AnonymousClass3(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer, shortNewsContentCardView);
            anonymousClass3.write = obj;
            return anonymousClass3;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((PlatformSelectionBehaviorsImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i != 0) {
                if (i == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.write;
            PagerState pagerState = PagerState.this;
            TextLayoutResultProxy textLayoutResultProxy = new TextLayoutResultProxy(platformSelectionBehaviorsImpl, pagerState);
            this.read = 1;
            float f = PagerStateKt.serializer;
            int i2 = this.IconCompatParcelizer;
            ((onHideTranslationui) pagerState.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0).serializer(pagerState.serializer(new Integer(i2).intValue()));
            boolean z = i2 > pagerState.PlaybackStateCompatCustomAction;
            int i3 = ((MeasuredPage) ((ComposePausableCompositionExceptionoperationsSequence1) onContentCardDismissed.MediaDescriptionCompat(pagerState.MediaSessionCompatQueueItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4))).RemoteActionCompatParcelizer;
            int i4 = pagerState.PlaybackStateCompatCustomAction;
            e$h e_h = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            int i5 = (i3 - i4) + 1;
            if (((z && i2 > ((MeasuredPage) ((ComposePausableCompositionExceptionoperationsSequence1) onContentCardDismissed.MediaDescriptionCompat(pagerState.MediaSessionCompatQueueItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4))).RemoteActionCompatParcelizer) || (!z && i2 < pagerState.PlaybackStateCompatCustomAction)) && Math.abs(i2 - pagerState.PlaybackStateCompatCustomAction) >= 3) {
                int i6 = pagerState.PlaybackStateCompatCustomAction;
                if (z) {
                    int i7 = i2 - i5;
                    if (i7 >= i6) {
                        i6 = i7;
                    }
                } else {
                    int i8 = i5 + i2;
                    if (i8 <= i6) {
                        i6 = i8;
                    }
                }
                float fMediaBrowserCompatMediaItem = pagerState.MediaBrowserCompatMediaItem();
                pagerState.RemoteActionCompatParcelizer(fMediaBrowserCompatMediaItem == 0.0f ? 0.0f : 0.0f / fMediaBrowserCompatMediaItem, i6, true);
            }
            Object objSerializer = SuspendAnimationKt.serializer(0.0f, this.RemoteActionCompatParcelizer + ((int) (RangesKt.IconCompatParcelizer(((long) MathKt.write(((pagerState.MediaBrowserCompatMediaItem() * (i2 - e_h.RemoteActionCompatParcelizer())) - (e_h.IconCompatParcelizer() * pagerState.MediaBrowserCompatMediaItem())) + 0.0f)) + r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.read(pagerState), pagerState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, pagerState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) - r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.read(pagerState))), this.serializer, new GapComposerKt$$ExternalSyntheticLambda0(new cancelPendingWebViewPauselambda0(0), 6, textLayoutResultProxy), this, 4);
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            return objSerializer == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
    }

    public abstract int read();

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final Object scroll(applyMeasureResultfoundation applymeasureresultfoundation, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        return scroll$suspendImpl(this, applymeasureresultfoundation, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, continuationImpl);
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean IconCompatParcelizer() {
        return this._init_lambda2.IconCompatParcelizer();
    }

    public final long MediaDescriptionCompat() {
        return ((Offset) this._init_lambda1.getValue()).m487unboximpl();
    }

    public final int MediaMetadataCompat() {
        return ((PagerMeasureResult) ((onShowTranslationui) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getValue()).PlaybackStateCompatCustomAction;
    }

    public final PagerMeasureResult MediaSessionCompatQueueItem() {
        return (PagerMeasureResult) ((onShowTranslationui) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getValue();
    }

    public final void RemoteActionCompatParcelizer(float f, int i, boolean z) {
        e$h e_h = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (e_h.RemoteActionCompatParcelizer() != i || e_h.IconCompatParcelizer() != f) {
            this.RatingCompat.write();
        }
        ((onHideTranslationui) ((getPlatformAndroidManager) e_h.read)).serializer(i);
        ((ExtendedFabSmallTokens) e_h.IconCompatParcelizer).IconCompatParcelizer(i);
        ((getContentCaptureSessionui) ((populate) e_h.RemoteActionCompatParcelizer)).IconCompatParcelizer(f);
        e_h.serializer = null;
        if (!z) {
            this.ResultReceiver.setValue(createFromParcel.INSTANCE);
            return;
        }
        Remeasurement remeasurement = (Remeasurement) ((onShowTranslationui) this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw).getValue();
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean RemoteActionCompatParcelizer() {
        return ((Boolean) this.MediaBrowserCompatMediaItem.getValue()).booleanValue();
    }

    public final Object awaitScrollDependencies(ContinuationImpl continuationImpl) {
        Object objWaitForFirstLayout;
        return (((onShowTranslationui) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getValue() == PagerStateKt.IconCompatParcelizer && (objWaitForFirstLayout = this.IconCompatParcelizer.waitForFirstLayout(continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objWaitForFirstLayout : createFromParcel.INSTANCE;
    }

    public final boolean serializer() {
        return ((Boolean) ((onShowTranslationui) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).getValue()).booleanValue();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final float write(float f) {
        return this._init_lambda2.write(f);
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean write() {
        return ((Boolean) this.MediaDescriptionCompat.getValue()).booleanValue();
    }

    public final int MediaBrowserCompatMediaItem() {
        return ((PagerMeasureResult) ((onShowTranslationui) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getValue()).ComponentActivity + MediaMetadataCompat();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0256 A[LOOP:1: B:99:0x0254->B:100:0x0256, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x030f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0335  */
    /* JADX WARN: Code duplicated, block: B:145:0x0387 A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:137:0x0365, B:140:0x036e, B:143:0x037b, B:145:0x0387, B:153:0x03bd, B:151:0x03b7, B:148:0x039f), top: B:166:0x0365 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x039e  */
    /* JADX WARN: Code duplicated, block: B:148:0x039f A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:137:0x0365, B:140:0x036e, B:143:0x037b, B:145:0x0387, B:153:0x03bd, B:151:0x03b7, B:148:0x039f), top: B:166:0x0365 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b7 A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:137:0x0365, B:140:0x036e, B:143:0x037b, B:145:0x0387, B:153:0x03bd, B:151:0x03b7, B:148:0x039f), top: B:166:0x0365 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:157:0x03de  */
    /* JADX WARN: Code duplicated, block: B:160:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0221  */
    /* JADX WARN: Code duplicated, block: B:95:0x0226  */
    /* JADX WARN: Code duplicated, block: B:98:0x024c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void applyMeasureResult$foundation(PagerMeasureResult pagerMeasureResult, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        Object obj;
        int i4;
        boolean z6;
        inspectableProperties inspectableproperties;
        List list;
        int size;
        int i5;
        boolean z7;
        int i6;
        float f;
        long jM96getViewportSizeYbymL2g;
        long jRemoteActionCompatParcelizer;
        long j;
        List list2 = pagerMeasureResult.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i7 = pagerMeasureResult.ParcelableVolumeInfo;
        MeasuredPage measuredPage = pagerMeasureResult.MediaSessionCompatResultReceiverWrapper;
        MeasuredPage measuredPage2 = pagerMeasureResult.MediaDescriptionCompat;
        float f2 = pagerMeasureResult.MediaMetadataCompat;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write = list2.size();
        int i8 = pagerMeasureResult.PlaybackStateCompatCustomAction;
        this.ComponentActivity = pagerMeasureResult.ComponentActivity + i8;
        if (!z && this.MediaSessionCompatResultReceiverWrapper) {
            this.serializer = pagerMeasureResult;
            return;
        }
        if (z) {
            this.MediaSessionCompatResultReceiverWrapper = true;
        }
        invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1 invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1 = this.RatingCompat;
        boolean z8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        e$h e_h = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (z2) {
            ((getContentCaptureSessionui) ((populate) e_h.RemoteActionCompatParcelizer)).IconCompatParcelizer(f2);
        } else {
            e_h.getClass();
            e_h.serializer = measuredPage2 != null ? measuredPage2.read : null;
            if (e_h.MediaSessionCompatQueueItem || !list2.isEmpty()) {
                e_h.MediaSessionCompatQueueItem = true;
                int i9 = measuredPage2 != null ? measuredPage2.RemoteActionCompatParcelizer : 0;
                ((onHideTranslationui) ((getPlatformAndroidManager) e_h.read)).serializer(i9);
                ((ExtendedFabSmallTokens) e_h.IconCompatParcelizer).IconCompatParcelizer(i9);
                ((getContentCaptureSessionui) ((populate) e_h.RemoteActionCompatParcelizer)).IconCompatParcelizer(f2);
            }
            if (z8) {
                NavArgsLazy navArgsLazy = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.IconCompatParcelizer;
                animateToWithDecay animatetowithdecay = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.PlaybackStateCompatCustomAction;
                navArgsLazy.read = pagerMeasureResult;
                navArgsLazy.RatingCompat = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.ParcelableVolumeInfo;
                PendingValue pendingValue = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.RemoteActionCompatParcelizer;
                int i10 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.PlaybackStateCompat;
                if (i10 != -1 && i10 != navArgsLazy.PlaybackStateCompatCustomAction()) {
                    invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaSessionCompatResultReceiverWrapper = true;
                    if (navArgsLazy.IconCompatParcelizer()) {
                        int i11 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat;
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat = i11;
                        int iPlaybackStateCompatCustomAction = navArgsLazy.MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.isEmpty() ? -1 : navArgsLazy.PlaybackStateCompatCustomAction() - 1;
                        if (iPlaybackStateCompatCustomAction != -1) {
                            int i12 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat;
                            if (i12 <= iPlaybackStateCompatCustomAction) {
                                iPlaybackStateCompatCustomAction = i12;
                            }
                            invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat = iPlaybackStateCompatCustomAction;
                        }
                        if (invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaBrowserCompatMediaItem <= 0.0f) {
                            invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.serializer(navArgsLazy.MediaDescriptionCompat(), invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.serializer - 1);
                        } else {
                            invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.serializer(0, navArgsLazy.read());
                        }
                    }
                }
                invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.serializer = navArgsLazy.PlaybackStateCompatCustomAction();
                if (navArgsLazy.IconCompatParcelizer()) {
                    int size2 = navArgsLazy.MediaBrowserCompatMediaItem().MediaBrowserCompatMediaItem.size();
                    int size3 = navArgsLazy.MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.size();
                    int size4 = navArgsLazy.MediaBrowserCompatMediaItem().RatingCompat.size();
                    int i13 = 0;
                    while (i13 < size4 + size3 + size2) {
                        int size5 = navArgsLazy.MediaBrowserCompatMediaItem().MediaBrowserCompatMediaItem.size();
                        int size6 = navArgsLazy.MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.size();
                        if (i13 < size5) {
                            i2 = ((MeasuredPage) navArgsLazy.MediaBrowserCompatMediaItem().MediaBrowserCompatMediaItem.get(i13)).RemoteActionCompatParcelizer;
                            i = size2;
                        } else {
                            i = size2;
                            if (i13 >= size5 && i13 < size5 + size6) {
                                i2 = ((MeasuredPage) navArgsLazy.MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.get(i13 - size5)).RemoteActionCompatParcelizer;
                            } else {
                                i2 = i13 >= size5 + size6 ? ((MeasuredPage) navArgsLazy.MediaBrowserCompatMediaItem().RatingCompat.get((i13 - size5) - size6)).RemoteActionCompatParcelizer : -1;
                            }
                        }
                        int size7 = navArgsLazy.MediaBrowserCompatMediaItem().MediaBrowserCompatMediaItem.size();
                        int size8 = navArgsLazy.MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.size();
                        if (i13 < size7) {
                            obj = ((MeasuredPage) navArgsLazy.MediaBrowserCompatMediaItem().MediaBrowserCompatMediaItem.get(i13)).read;
                            i3 = size3;
                        } else {
                            i3 = size3;
                            if (i13 >= size7 && i13 < size7 + size8) {
                                obj = ((MeasuredPage) navArgsLazy.MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.get(i13 - size7)).read;
                            } else if (i13 >= size7 + size8) {
                                obj = ((MeasuredPage) navArgsLazy.MediaBrowserCompatMediaItem().RatingCompat.get((i13 - size7) - size8)).read;
                            } else {
                                obj = inspectableProperties.serializer;
                            }
                        }
                        int i14 = navArgsLazy.MediaBrowserCompatMediaItem().PlaybackStateCompatCustomAction;
                        if (i2 != -1) {
                            if (animatetowithdecay.RemoteActionCompatParcelizer(i2)) {
                                Object objSerializer = animatetowithdecay.serializer(i2);
                                objSerializer.getClass();
                                int i15 = ((inspectableProperties) objSerializer).RemoteActionCompatParcelizer;
                                Object objSerializer2 = animatetowithdecay.serializer(i2);
                                objSerializer2.getClass();
                                i4 = size4;
                                Object obj2 = ((inspectableProperties) objSerializer2).IconCompatParcelizer;
                                if (i15 == i14) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, obj}, getCieXyz.write())).booleanValue()) {
                                    }
                                    inspectableproperties = (inspectableProperties) animatetowithdecay.serializer(i2);
                                    if (inspectableproperties != null) {
                                        inspectableproperties.RemoteActionCompatParcelizer = i14;
                                        inspectableproperties.IconCompatParcelizer = obj;
                                    } else {
                                        inspectableproperties = new inspectableProperties();
                                        inspectableproperties.IconCompatParcelizer = obj;
                                        inspectableproperties.RemoteActionCompatParcelizer = i14;
                                    }
                                    animatetowithdecay.IconCompatParcelizer(i2, inspectableproperties);
                                    invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat = Math.min(invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat, i2);
                                    invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat = Math.max(invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat, i2);
                                    list = (List) invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.RatingCompat.MediaBrowserCompatMediaItem(i2);
                                    if (list != null) {
                                        size = list.size();
                                        for (i5 = 0; i5 < size; i5++) {
                                            ((LinearProgressIndicatorTokens) list.get(i5)).read();
                                        }
                                    }
                                }
                                z6 = true;
                                invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaSessionCompatResultReceiverWrapper = true;
                                inspectableproperties = (inspectableProperties) animatetowithdecay.serializer(i2);
                                if (inspectableproperties != null) {
                                    inspectableproperties.RemoteActionCompatParcelizer = i14;
                                    inspectableproperties.IconCompatParcelizer = obj;
                                } else {
                                    inspectableproperties = new inspectableProperties();
                                    inspectableproperties.IconCompatParcelizer = obj;
                                    inspectableproperties.RemoteActionCompatParcelizer = i14;
                                }
                                animatetowithdecay.IconCompatParcelizer(i2, inspectableproperties);
                                invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat = Math.min(invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat, i2);
                                invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat = Math.max(invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat, i2);
                                list = (List) invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.RatingCompat.MediaBrowserCompatMediaItem(i2);
                                if (list != null) {
                                    size = list.size();
                                    while (i5 < size) {
                                        ((LinearProgressIndicatorTokens) list.get(i5)).read();
                                    }
                                }
                            } else {
                                i4 = size4;
                            }
                            z6 = true;
                            inspectableproperties = (inspectableProperties) animatetowithdecay.serializer(i2);
                            if (inspectableproperties != null) {
                                inspectableproperties.RemoteActionCompatParcelizer = i14;
                                inspectableproperties.IconCompatParcelizer = obj;
                            } else {
                                inspectableproperties = new inspectableProperties();
                                inspectableproperties.IconCompatParcelizer = obj;
                                inspectableproperties.RemoteActionCompatParcelizer = i14;
                            }
                            animatetowithdecay.IconCompatParcelizer(i2, inspectableproperties);
                            invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat = Math.min(invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat, i2);
                            invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat = Math.max(invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat, i2);
                            list = (List) invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.RatingCompat.MediaBrowserCompatMediaItem(i2);
                            if (list != null) {
                                size = list.size();
                                while (i5 < size) {
                                    ((LinearProgressIndicatorTokens) list.get(i5)).read();
                                }
                            }
                        } else {
                            i4 = size4;
                            z6 = true;
                        }
                        i13++;
                        size2 = i;
                        size3 = i3;
                        size4 = i4;
                    }
                    z3 = true;
                    if (invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaSessionCompatResultReceiverWrapper) {
                        boolean z9 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaBrowserCompatMediaItem <= 0.0f;
                        if (navArgsLazy.IconCompatParcelizer()) {
                            MultiSubscriptionSnapshotFlowManager.write(navArgsLazy.MediaBrowserCompatMediaItem());
                            z5 = false;
                            invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.write(navArgsLazy, navArgsLazy.read(), navArgsLazy.MediaDescriptionCompat(), navArgsLazy.MediaBrowserCompatMediaItem().MediaSessionCompatQueueItem != null ? ((PagerState) pendingValue.serializer).ComponentActivity : 0, navArgsLazy.MediaSessionCompatQueueItem(), navArgsLazy.MediaMetadataCompat(), 0.0f, z9);
                        } else {
                            z5 = false;
                        }
                        invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaSessionCompatResultReceiverWrapper = z5;
                        z4 = z5;
                    } else {
                        i8 = i8;
                        z3 = true;
                        z8 = z8;
                        invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1;
                        z4 = false;
                    }
                } else {
                    i8 = i8;
                    z3 = true;
                    z4 = false;
                    z8 = z8;
                    invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1;
                    invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.write();
                }
                invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.PlaybackStateCompat = navArgsLazy.PlaybackStateCompatCustomAction();
                i6 = z4;
                z7 = z3;
            }
            ((onShowTranslationui) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).setValue(pagerMeasureResult);
            ((onShowTranslationui) this.MediaDescriptionCompat).setValue(Boolean.valueOf(pagerMeasureResult.RemoteActionCompatParcelizer));
            if ((measuredPage != null || measuredPage.RemoteActionCompatParcelizer == 0) && i7 == 0) {
            }
            ((onShowTranslationui) this.MediaBrowserCompatMediaItem).setValue(Boolean.valueOf(z7));
            if (measuredPage != null) {
                this.PlaybackStateCompatCustomAction = measuredPage.RemoteActionCompatParcelizer;
            }
            this.PlaybackStateCompat = i7;
            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[i6], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
            if (z8) {
                try {
                    if (pagerMeasureResult.write < read() && Math.abs(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) > 0.5f) {
                        f = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                        if (MediaSessionCompatQueueItem().MediaSessionCompatToken == SelectionHandleIcon.Vertical) {
                            if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (MediaDescriptionCompat() & 4294967295L)))) {
                                if (isNotGestureAction$foundation()) {
                                }
                            }
                        } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (MediaDescriptionCompat() >> 32)))) {
                            if (isNotGestureAction$foundation()) {
                            }
                        }
                        invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.RemoteActionCompatParcelizer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, pagerMeasureResult);
                    }
                } catch (Throwable th) {
                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    throw th;
                }
            }
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = PagerStateKt.serializer(pagerMeasureResult, read());
            read();
            if (pagerMeasureResult.MediaSessionCompatToken == SelectionHandleIcon.Horizontal) {
                jM96getViewportSizeYbymL2g = pagerMeasureResult.m96getViewportSizeYbymL2g() >> 32;
            } else {
                jM96getViewportSizeYbymL2g = pagerMeasureResult.m96getViewportSizeYbymL2g() & 4294967295L;
            }
            int i16 = (int) jM96getViewportSizeYbymL2g;
            jRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(pagerMeasureResult.ResultReceiver.serializer(i16, i8, -pagerMeasureResult.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, pagerMeasureResult.serializer), i6, i16);
            j = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (jRemoteActionCompatParcelizer > j) {
                jRemoteActionCompatParcelizer = j;
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = jRemoteActionCompatParcelizer;
        }
        i8 = i8;
        z7 = 1;
        i6 = 0;
        z8 = z8;
        invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1;
        ((onShowTranslationui) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).setValue(pagerMeasureResult);
        ((onShowTranslationui) this.MediaDescriptionCompat).setValue(Boolean.valueOf(pagerMeasureResult.RemoteActionCompatParcelizer));
        z7 = measuredPage != null ? i6 : i6;
        ((onShowTranslationui) this.MediaBrowserCompatMediaItem).setValue(Boolean.valueOf(z7));
        if (measuredPage != null) {
            this.PlaybackStateCompatCustomAction = measuredPage.RemoteActionCompatParcelizer;
        }
        this.PlaybackStateCompat = i7;
        getBrush getbrush3 = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[i6], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem2 = getbrush3 != null ? getbrush3.MediaSessionCompatQueueItem() : null;
        getBrush getbrush4 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush3}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
        if (z8) {
            if (pagerMeasureResult.write < read()) {
                f = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                if (MediaSessionCompatQueueItem().MediaSessionCompatToken == SelectionHandleIcon.Vertical) {
                    if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (MediaDescriptionCompat() & 4294967295L)))) {
                        if (isNotGestureAction$foundation()) {
                        }
                    }
                } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (MediaDescriptionCompat() >> 32)))) {
                    if (isNotGestureAction$foundation()) {
                    }
                }
                invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.RemoteActionCompatParcelizer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, pagerMeasureResult);
            }
        }
        setNativeShader.read(getbrush3, getbrush4, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem2);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = PagerStateKt.serializer(pagerMeasureResult, read());
        read();
        if (pagerMeasureResult.MediaSessionCompatToken == SelectionHandleIcon.Horizontal) {
            jM96getViewportSizeYbymL2g = pagerMeasureResult.m96getViewportSizeYbymL2g() >> 32;
        } else {
            jM96getViewportSizeYbymL2g = pagerMeasureResult.m96getViewportSizeYbymL2g() & 4294967295L;
        }
        int i17 = (int) jM96getViewportSizeYbymL2g;
        jRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(pagerMeasureResult.ResultReceiver.serializer(i17, i8, -pagerMeasureResult.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, pagerMeasureResult.serializer), i6, i17);
        j = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (jRemoteActionCompatParcelizer > j) {
            jRemoteActionCompatParcelizer = j;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = jRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r9.scroll(r7, r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r6, o.applyMeasureResultfoundation r7, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof o.PausedCompositionImpl
            if (r0 == 0) goto L13
            r0 = r9
            o.PausedCompositionImpl r0 = (o.PausedCompositionImpl) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.IconCompatParcelizer = r1
            goto L18
        L13:
            o.PausedCompositionImpl r0 = new o.PausedCompositionImpl
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            androidx.compose.foundation.pager.PagerState r6 = r0.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L7b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            return r5
        L33:
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r0.write
            r8 = r6
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8 = (o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) r8
            o.applyMeasureResultfoundation r7 = r0.serializer
            androidx.compose.foundation.pager.PagerState r6 = r0.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L55
        L40:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r0.read = r6
            r0.serializer = r7
            r9 = r8
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = (kotlin.coroutines.jvm.internal.SuspendLambda) r9
            r0.write = r9
            r0.IconCompatParcelizer = r4
            java.lang.Object r9 = r6.awaitScrollDependencies(r0)
            if (r9 != r1) goto L55
            goto L7a
        L55:
            androidx.compose.foundation.gestures.DefaultScrollableState r9 = r6._init_lambda2
            boolean r9 = r9.IconCompatParcelizer()
            if (r9 != 0) goto L6a
            com.sentiance.okhttp3.internal.http2.e$h r9 = r6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
            int r9 = r9.RemoteActionCompatParcelizer()
            o.getPlatformAndroidManager r2 = r6._init_lambda3
            o.onHideTranslationui r2 = (o.onHideTranslationui) r2
            r2.serializer(r9)
        L6a:
            androidx.compose.foundation.gestures.DefaultScrollableState r9 = r6._init_lambda2
            r0.read = r6
            r0.serializer = r5
            r0.write = r5
            r0.IconCompatParcelizer = r3
            java.lang.Object r7 = r9.scroll(r7, r8, r0)
            if (r7 != r1) goto L7b
        L7a:
            return r1
        L7b:
            o.getPlatformAndroidManager r6 = r6.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0
            o.onHideTranslationui r6 = (o.onHideTranslationui) r6
            r7 = -1
            r6.serializer(r7)
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, o.applyMeasureResultfoundation, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object animateScrollToPage(int i, width widthVar, ContinuationImpl continuationImpl) {
        RecomposerExternalSyntheticLambda4 recomposerExternalSyntheticLambda4;
        width widthVar2;
        int i2 = i;
        if (continuationImpl instanceof RecomposerExternalSyntheticLambda4) {
            recomposerExternalSyntheticLambda4 = (RecomposerExternalSyntheticLambda4) continuationImpl;
            int i3 = recomposerExternalSyntheticLambda4.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                recomposerExternalSyntheticLambda4.serializer = i3 - Integer.MIN_VALUE;
            } else {
                recomposerExternalSyntheticLambda4 = new RecomposerExternalSyntheticLambda4(this, continuationImpl);
            }
        } else {
            recomposerExternalSyntheticLambda4 = new RecomposerExternalSyntheticLambda4(this, continuationImpl);
        }
        RecomposerExternalSyntheticLambda4 recomposerExternalSyntheticLambda5 = recomposerExternalSyntheticLambda4;
        Object obj = recomposerExternalSyntheticLambda5.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = recomposerExternalSyntheticLambda5.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            e$h e_h = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            if ((i2 != e_h.RemoteActionCompatParcelizer() || e_h.IconCompatParcelizer() != 0.0f) && read() != 0) {
                recomposerExternalSyntheticLambda5.IconCompatParcelizer = widthVar;
                recomposerExternalSyntheticLambda5.RemoteActionCompatParcelizer = i2;
                recomposerExternalSyntheticLambda5.serializer = 1;
                if (awaitScrollDependencies(recomposerExternalSyntheticLambda5) != obj2) {
                    widthVar2 = widthVar;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = recomposerExternalSyntheticLambda5.RemoteActionCompatParcelizer;
        width widthVar3 = recomposerExternalSyntheticLambda5.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        widthVar2 = widthVar3;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 anonymousClass3 = new AnonymousClass3(serializer(i2), 0.0f * MediaBrowserCompatMediaItem(), widthVar2, null);
        recomposerExternalSyntheticLambda5.IconCompatParcelizer = null;
        recomposerExternalSyntheticLambda5.serializer = 2;
        return scroll(applyMeasureResultfoundation.Default, anonymousClass3, recomposerExternalSyntheticLambda5) == obj2 ? obj2 : createfromparcel;
    }

    public final int serializer(int i) {
        if (read() > 0) {
            return RangesKt.RemoteActionCompatParcelizer(i, 0, read() - 1);
        }
        return 0;
    }

    public final boolean isNotGestureAction$foundation() {
        return ((int) Float.intBitsToFloat((int) (MediaDescriptionCompat() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (MediaDescriptionCompat() & 4294967295L))) == 0;
    }

    public PagerState(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            TriStateCheckbox.read("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this._init_lambda1 = CompositionKt.RemoteActionCompatParcelizer(Offset.m466boximpl(Offset.Companion.m493getZeroF1C5BW0()));
        e$h e_h = new e$h();
        e_h.write = this;
        e_h.read = CompositionKt.read(i);
        e_h.RemoteActionCompatParcelizer = getPersonFullName.RemoteActionCompatParcelizer(f);
        e_h.IconCompatParcelizer = new ExtendedFabSmallTokens(i);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = e_h;
        this.PlaybackStateCompatCustomAction = i;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Long.MAX_VALUE;
        final int i2 = 0;
        this._init_lambda2 = new DefaultScrollableState(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.PausableMonotonicFrameClock
            public final /* synthetic */ androidx.compose.foundation.pager.PagerState read;

            {
                this.read = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r6v3 */
            /* JADX WARN: Type inference failed for: r6v4 */
            /* JADX WARN: Type inference failed for: r6v6 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult;
                int i3 = i2;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                androidx.compose.foundation.pager.PagerState pagerState = this.read;
                androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult2 = null;
                if (i3 != 0) {
                    ShapeTokens shapeTokens = (ShapeTokens) obj;
                    getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                    getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                    try {
                        shapeTokens.read(pagerState.PlaybackStateCompatCustomAction);
                        return createfromparcel;
                    } finally {
                        setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    }
                }
                ?? ValueOf = (Float) obj;
                float fFloatValue = ValueOf.floatValue();
                long j = r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.read(pagerState);
                float f2 = pagerState.read + fFloatValue;
                long j2 = MathKt.read(f2);
                pagerState.read = f2 - j2;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j3 = j2 + j;
                    long jIconCompatParcelizer = RangesKt.IconCompatParcelizer(j3, pagerState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, pagerState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    ?? r6 = j3 != jIconCompatParcelizer;
                    long j4 = jIconCompatParcelizer - j;
                    float f3 = j4;
                    pagerState.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = f3;
                    if (Math.abs(j4) != 0) {
                        ((onShowTranslationui) pagerState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).setValue(Boolean.valueOf(f3 > 0.0f));
                        ((onShowTranslationui) pagerState.MediaSessionCompatToken).setValue(Boolean.valueOf(f3 < 0.0f));
                    }
                    int i4 = (int) j4;
                    int i5 = -i4;
                    androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = ((androidx.compose.foundation.pager.PagerMeasureResult) ((onShowTranslationui) pagerState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getValue()).copyWithScrollDeltaWithoutRemeasure(i5);
                    if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure == null || (pagerMeasureResult = pagerState.serializer) == null) {
                        pagerMeasureResult2 = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure;
                    } else {
                        androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i5);
                        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                            pagerState.serializer = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
                            pagerMeasureResult2 = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure;
                        }
                    }
                    if (pagerMeasureResult2 != null) {
                        pagerState.applyMeasureResult$foundation(pagerMeasureResult2, pagerState.MediaSessionCompatResultReceiverWrapper, true);
                        pagerState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setValue(createfromparcel);
                    } else {
                        e$h e_h2 = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                        androidx.compose.foundation.pager.PagerState pagerState2 = (androidx.compose.foundation.pager.PagerState) e_h2.write;
                        ((getContentCaptureSessionui) ((populate) e_h2.RemoteActionCompatParcelizer)).IconCompatParcelizer(e_h2.IconCompatParcelizer() + (pagerState2.MediaBrowserCompatMediaItem() != 0 ? i4 / pagerState2.MediaBrowserCompatMediaItem() : 0.0f));
                        androidx.compose.ui.layout.Remeasurement remeasurement = (androidx.compose.ui.layout.Remeasurement) ((onShowTranslationui) pagerState.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw).getValue();
                        if (remeasurement != null) {
                            remeasurement.forceRemeasure();
                        }
                    }
                    if (r6 != false) {
                        ValueOf = Long.valueOf(j4);
                    }
                    fFloatValue = ValueOf.floatValue();
                }
                return Float.valueOf(fFloatValue);
            }
        });
        final int i3 = 1;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = CompositionKt.serializer(PagerStateKt.IconCompatParcelizer, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
        this.MediaMetadataCompat = PagerStateKt.RemoteActionCompatParcelizer;
        this.ParcelableVolumeInfo = new MutableInteractionSourceImpl();
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = CompositionKt.read(-1);
        this._init_lambda3 = CompositionKt.read(i);
        AndroidContentCaptureManager androidContentCaptureManager = AndroidContentCaptureManager.write;
        CompositionKt.serializer(androidContentCaptureManager, new RecomposerrunRecomposeAndApplyChanges2(this, i2));
        CompositionKt.serializer(androidContentCaptureManager, new RecomposerrunRecomposeAndApplyChanges2(this, 3));
        RadioButtonTokens radioButtonTokens = new RadioButtonTokens(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.PausableMonotonicFrameClock
            public final /* synthetic */ androidx.compose.foundation.pager.PagerState read;

            {
                this.read = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r6v3 */
            /* JADX WARN: Type inference failed for: r6v4 */
            /* JADX WARN: Type inference failed for: r6v6 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult;
                int i4 = i3;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                androidx.compose.foundation.pager.PagerState pagerState = this.read;
                androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult2 = null;
                if (i4 != 0) {
                    ShapeTokens shapeTokens = (ShapeTokens) obj;
                    getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                    getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                    try {
                        shapeTokens.read(pagerState.PlaybackStateCompatCustomAction);
                        return createfromparcel;
                    } finally {
                        setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    }
                }
                ?? ValueOf = (Float) obj;
                float fFloatValue = ValueOf.floatValue();
                long j = r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.read(pagerState);
                float f2 = pagerState.read + fFloatValue;
                long j2 = MathKt.read(f2);
                pagerState.read = f2 - j2;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j3 = j2 + j;
                    long jIconCompatParcelizer = RangesKt.IconCompatParcelizer(j3, pagerState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, pagerState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    ?? r6 = j3 != jIconCompatParcelizer;
                    long j4 = jIconCompatParcelizer - j;
                    float f3 = j4;
                    pagerState.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = f3;
                    if (Math.abs(j4) != 0) {
                        ((onShowTranslationui) pagerState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).setValue(Boolean.valueOf(f3 > 0.0f));
                        ((onShowTranslationui) pagerState.MediaSessionCompatToken).setValue(Boolean.valueOf(f3 < 0.0f));
                    }
                    int i5 = (int) j4;
                    int i6 = -i5;
                    androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = ((androidx.compose.foundation.pager.PagerMeasureResult) ((onShowTranslationui) pagerState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getValue()).copyWithScrollDeltaWithoutRemeasure(i6);
                    if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure == null || (pagerMeasureResult = pagerState.serializer) == null) {
                        pagerMeasureResult2 = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure;
                    } else {
                        androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i6);
                        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                            pagerState.serializer = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
                            pagerMeasureResult2 = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure;
                        }
                    }
                    if (pagerMeasureResult2 != null) {
                        pagerState.applyMeasureResult$foundation(pagerMeasureResult2, pagerState.MediaSessionCompatResultReceiverWrapper, true);
                        pagerState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setValue(createfromparcel);
                    } else {
                        e$h e_h2 = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                        androidx.compose.foundation.pager.PagerState pagerState2 = (androidx.compose.foundation.pager.PagerState) e_h2.write;
                        ((getContentCaptureSessionui) ((populate) e_h2.RemoteActionCompatParcelizer)).IconCompatParcelizer(e_h2.IconCompatParcelizer() + (pagerState2.MediaBrowserCompatMediaItem() != 0 ? i5 / pagerState2.MediaBrowserCompatMediaItem() : 0.0f));
                        androidx.compose.ui.layout.Remeasurement remeasurement = (androidx.compose.ui.layout.Remeasurement) ((onShowTranslationui) pagerState.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw).getValue();
                        if (remeasurement != null) {
                            remeasurement.forceRemeasure();
                        }
                    }
                    if (r6 != false) {
                        ValueOf = Long.valueOf(j4);
                    }
                    fFloatValue = ValueOf.floatValue();
                }
                return Float.valueOf(fFloatValue);
            }
        });
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = radioButtonTokens;
        this.RatingCompat = new invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1(new PendingValue(19, this), radioButtonTokens, new RecomposerrunRecomposeAndApplyChanges2(this, 4));
        this.MediaSessionCompatQueueItem = new CommonDecorationBox(0);
        this.IconCompatParcelizer = new AwaitFirstLayoutModifier();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = CompositionKt.RemoteActionCompatParcelizer(null);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new ProvidableCompositionLocal(this, 0);
        ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new LazyLayoutPinnedItemList();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = PointerInteropFilterDispatchToViewState.IconCompatParcelizer();
        this.ResultReceiver = PointerInteropFilterDispatchToViewState.IconCompatParcelizer();
        Boolean bool = Boolean.FALSE;
        this.MediaDescriptionCompat = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatMediaItem = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaSessionCompatToken = CompositionKt.RemoteActionCompatParcelizer(bool);
    }
}
