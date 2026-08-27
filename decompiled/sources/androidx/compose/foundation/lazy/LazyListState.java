package androidx.compose.foundation.lazy;

import androidx.camera.view.PendingValue;
import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPassesKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import coil3.util.ContextsKt;
import com.huawei.location.logic.E5;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import o.AnchoredDraggableKtanchoredDraggable11;
import o.AnchoredDraggableKtrestartable212;
import o.AndroidContentCaptureManager;
import o.BasicTooltipKt;
import o.BasicTooltipKthandleGestures11;
import o.CommonDecorationBox;
import o.ExtendedFabSmallTokens;
import o.InlineChildren;
import o.LinearProgressIndicatorTokens;
import o.PointerInteropFilterDispatchToViewState;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ProvidableCompositionLocal;
import o.RadioButtonTokens;
import o.ShortNewsContentCardView;
import o.SweepGradientShader9KIMszo;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.TriStateCheckbox;
import o.UpdatableAnimationState;
import o.accessgetGreencp;
import o.getAdjustedCoordinatesk4lQ0M;
import o.getBrush;
import o.getContentViewGroupParentLayout;
import o.getPlatformAndroidManager;
import o.getPositionInRoot;
import o.getViewportSizeYbymL2g;
import o.isAppSetIdReadingEnabled;
import o.onContentCardDismissed;
import o.onHideTranslationui;
import o.onShowTranslationui;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.requiredSizeInqDBjuR0default;
import o.requiredWidth3ABfNKs;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class LazyListState implements getAdjustedCoordinatesk4lQ0M {
    public static final CardView$1 read = getPositionInRoot.serializer(new ScrollState$$ExternalSyntheticLambda3(1), new getViewportSizeYbymL2g(20));
    public Remeasurement ComponentActivity;
    public final AwaitFirstLayoutModifier IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public final PopulateViewStructure_androidKtpopulate7 MediaDescriptionCompat;
    public final MutableInteractionSourceImpl MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatResultReceiverWrapper;
    public final LazyLayoutItemAnimator MediaSessionCompatToken;
    public final PopulateViewStructure_androidKtpopulate7 ParcelableVolumeInfo;
    public final LazyLayoutPinnedItemList PlaybackStateCompat;
    public final PopulateViewStructure_androidKtpopulate7 PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public final CommonDecorationBox RemoteActionCompatParcelizer;
    public final RadioButtonTokens ResultReceiver;
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final PendingValue r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final AnchoredDraggableKtanchoredDraggable11 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final DefaultScrollableState r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final E5 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public float r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final ProvidableCompositionLocal r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public LazyListMeasureResult serializer;
    public final accessgetGreencp write;

    public LazyListState(int i, int i2) {
        AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = new AnchoredDraggableKtanchoredDraggable11();
        anchoredDraggableKtanchoredDraggable11.IconCompatParcelizer = -1;
        anchoredDraggableKtanchoredDraggable11.serializer = -1;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = anchoredDraggableKtanchoredDraggable11;
        E5 e5 = new E5();
        e5.IconCompatParcelizer = CompositionKt.read(i);
        e5.write = CompositionKt.read(i2);
        e5.serializer = new ExtendedFabSmallTokens(i);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = e5;
        this.ParcelableVolumeInfo = CompositionKt.serializer(BasicTooltipKthandleGestures11.IconCompatParcelizer, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
        this.MediaMetadataCompat = new MutableInteractionSourceImpl();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new DefaultScrollableState(new InlineChildren(8, this));
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ProvidableCompositionLocal(this, 1);
        this.IconCompatParcelizer = new AwaitFirstLayoutModifier();
        this.MediaSessionCompatToken = new LazyLayoutItemAnimator();
        this.RemoteActionCompatParcelizer = new CommonDecorationBox(0);
        this.ResultReceiver = new RadioButtonTokens(new SweepGradientShader9KIMszo(this, i));
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new PendingValue(18, this);
        this.PlaybackStateCompat = new LazyLayoutPinnedItemList();
        this.PlaybackStateCompatCustomAction = PointerInteropFilterDispatchToViewState.IconCompatParcelizer();
        Boolean bool = Boolean.FALSE;
        this.MediaBrowserCompatMediaItem = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaDescriptionCompat = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaSessionCompatResultReceiverWrapper = PointerInteropFilterDispatchToViewState.IconCompatParcelizer();
        accessgetGreencp accessgetgreencp = new accessgetGreencp(9);
        Float fValueOf = Float.valueOf(0.0f);
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = requiredWidth3ABfNKs.read;
        accessgetgreencp.write = new UpdatableAnimationState(requiredsizeinqdbjur0default, fValueOf, (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.write = accessgetgreencp;
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean IconCompatParcelizer() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean RemoteActionCompatParcelizer() {
        return ((Boolean) this.MediaDescriptionCompat.getValue()).booleanValue();
    }

    public final BasicTooltipKt serializer() {
        return (BasicTooltipKt) ((onShowTranslationui) this.ParcelableVolumeInfo).getValue();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final float write(float f) {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write(f);
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean write() {
        return ((Boolean) this.MediaBrowserCompatMediaItem.getValue()).booleanValue();
    }

    public final void read(LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2) {
        List list = lazyListMeasureResult.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i = lazyListMeasureResult.PlaybackStateCompatCustomAction;
        int i2 = lazyListMeasureResult.MediaBrowserCompatMediaItem;
        LazyListMeasuredItem lazyListMeasuredItem = lazyListMeasureResult.MediaMetadataCompat;
        this.ResultReceiver.write = list.size();
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = requiredWidth3ABfNKs.read;
        accessgetGreencp accessgetgreencp = this.write;
        E5 e5 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!z && this.RatingCompat) {
            this.serializer = lazyListMeasureResult;
            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
            try {
                if (((Number) ((onShowTranslationui) ((UpdatableAnimationState) accessgetgreencp.write).write).getValue()).floatValue() != 0.0f && lazyListMeasuredItem != null && lazyListMeasuredItem.MediaMetadataCompat == e5.MediaSessionCompatQueueItem() && i2 == e5.MediaDescriptionCompat()) {
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) accessgetgreencp.IconCompatParcelizer;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    accessgetgreencp.write = new UpdatableAnimationState(requiredsizeinqdbjur0default, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            }
        }
        if (z) {
            this.RatingCompat = true;
        }
        ((onShowTranslationui) this.MediaDescriptionCompat).setValue(Boolean.valueOf(((lazyListMeasuredItem == null || lazyListMeasuredItem.MediaMetadataCompat == 0) && i2 == 0) ? false : true));
        ((onShowTranslationui) this.MediaBrowserCompatMediaItem).setValue(Boolean.valueOf(lazyListMeasureResult.serializer));
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 -= lazyListMeasureResult.read;
        ((onShowTranslationui) this.ParcelableVolumeInfo).setValue(lazyListMeasureResult);
        if (z2) {
            e5.getClass();
            if (i2 < 0.0f) {
                TriStateCheckbox.RemoteActionCompatParcelizer("scrollOffset should be non-negative");
            }
            ((onHideTranslationui) ((getPlatformAndroidManager) e5.write)).serializer(i2);
        } else {
            LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) onContentCardDismissed.MediaMetadataCompat(list);
            LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) onContentCardDismissed.MediaBrowserCompatMediaItem(list);
            AndroidTrace_androidKt.traceValue("firstVisibleItem:index", lazyListMeasuredItem2 != null ? lazyListMeasuredItem2.MediaMetadataCompat : -1L);
            AndroidTrace_androidKt.traceValue("lastVisibleItem:index", lazyListMeasuredItem3 != null ? lazyListMeasuredItem3.MediaMetadataCompat : -1L);
            e5.getClass();
            e5.RemoteActionCompatParcelizer = lazyListMeasuredItem != null ? lazyListMeasuredItem.MediaDescriptionCompat : null;
            if (e5.read || i > 0) {
                e5.read = true;
                if (i2 < 0.0f) {
                    TriStateCheckbox.RemoteActionCompatParcelizer("scrollOffset should be non-negative");
                }
                e5.read(lazyListMeasuredItem != null ? lazyListMeasuredItem.MediaMetadataCompat : 0, i2);
            }
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                int i3 = anchoredDraggableKtanchoredDraggable11.IconCompatParcelizer;
                boolean z3 = anchoredDraggableKtanchoredDraggable11.read;
                if (i3 != -1 && !list.isEmpty() && i3 != AnchoredDraggableKtanchoredDraggable11.IconCompatParcelizer(lazyListMeasureResult, z3)) {
                    anchoredDraggableKtanchoredDraggable11.IconCompatParcelizer = -1;
                    LinearProgressIndicatorTokens linearProgressIndicatorTokens = anchoredDraggableKtanchoredDraggable11.write;
                    if (linearProgressIndicatorTokens != null) {
                        linearProgressIndicatorTokens.read();
                    }
                    anchoredDraggableKtanchoredDraggable11.write = null;
                }
                int i4 = anchoredDraggableKtanchoredDraggable11.serializer;
                if (i4 != -1 && anchoredDraggableKtanchoredDraggable11.RemoteActionCompatParcelizer != 0.0f && i4 != i && !list.isEmpty()) {
                    int iIconCompatParcelizer = AnchoredDraggableKtanchoredDraggable11.IconCompatParcelizer(lazyListMeasureResult, anchoredDraggableKtanchoredDraggable11.RemoteActionCompatParcelizer < 0.0f);
                    if (iIconCompatParcelizer >= 0 && iIconCompatParcelizer < i) {
                        anchoredDraggableKtanchoredDraggable11.IconCompatParcelizer = iIconCompatParcelizer;
                        anchoredDraggableKtanchoredDraggable11.write = PendingValue.write(iIconCompatParcelizer, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    }
                }
                anchoredDraggableKtanchoredDraggable11.serializer = i;
            }
        }
        if (z) {
            float f = lazyListMeasureResult.MediaSessionCompatResultReceiverWrapper;
            Density density = lazyListMeasureResult.RatingCompat;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = lazyListMeasureResult.IconCompatParcelizer;
            accessgetgreencp.getClass();
            if (f <= density.mo48toPx0680j_4(LazyLayoutScrollDeltaBetweenPassesKt.RemoteActionCompatParcelizer)) {
                return;
            }
            getBrush getbrush3 = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem2 = getbrush3 != null ? getbrush3.MediaSessionCompatQueueItem() : null;
            getBrush getbrush4 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush3}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
            try {
                float fFloatValue = ((Number) ((onShowTranslationui) ((UpdatableAnimationState) accessgetgreencp.write).write).getValue()).floatValue();
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) accessgetgreencp.IconCompatParcelizer;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                }
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) accessgetgreencp.write;
                if (updatableAnimationState.read) {
                    accessgetgreencp.write = ContextsKt.read(updatableAnimationState, fFloatValue - f, 0.0f, 30);
                } else {
                    accessgetgreencp.write = new UpdatableAnimationState(requiredsizeinqdbjur0default, Float.valueOf(-f), null, 60);
                }
                accessgetgreencp.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BlockRunner$cancel$1(accessgetgreencp, shortNewsContentCardView, 8), 3);
            } finally {
                setNativeShader.read(getbrush3, getbrush4, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem2);
            }
        }
    }

    public final void IconCompatParcelizer(float f, BasicTooltipKt basicTooltipKt) {
        LinearProgressIndicatorTokens linearProgressIndicatorTokens;
        LinearProgressIndicatorTokens linearProgressIndicatorTokens2;
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) basicTooltipKt;
            boolean zIsEmpty = lazyListMeasureResult.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.isEmpty();
            AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iIconCompatParcelizer = AnchoredDraggableKtanchoredDraggable11.IconCompatParcelizer(basicTooltipKt, z);
                if (iIconCompatParcelizer >= 0 && iIconCompatParcelizer < lazyListMeasureResult.PlaybackStateCompatCustomAction) {
                    if (iIconCompatParcelizer != anchoredDraggableKtanchoredDraggable11.IconCompatParcelizer) {
                        if (anchoredDraggableKtanchoredDraggable11.read != z) {
                            anchoredDraggableKtanchoredDraggable11.IconCompatParcelizer = -1;
                            LinearProgressIndicatorTokens linearProgressIndicatorTokens3 = anchoredDraggableKtanchoredDraggable11.write;
                            if (linearProgressIndicatorTokens3 != null) {
                                linearProgressIndicatorTokens3.read();
                            }
                            anchoredDraggableKtanchoredDraggable11.write = null;
                        }
                        anchoredDraggableKtanchoredDraggable11.read = z;
                        anchoredDraggableKtanchoredDraggable11.IconCompatParcelizer = iIconCompatParcelizer;
                        anchoredDraggableKtanchoredDraggable11.write = PendingValue.write(iIconCompatParcelizer, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    }
                    List list = lazyListMeasureResult.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (z) {
                        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) ((AnchoredDraggableKtrestartable212) onContentCardDismissed.MediaDescriptionCompat(list));
                        if (((lazyListMeasuredItem.PlaybackStateCompat + lazyListMeasuredItem.ComponentActivity) + lazyListMeasureResult.MediaDescriptionCompat) - lazyListMeasureResult.PlaybackStateCompat < (-f) && (linearProgressIndicatorTokens2 = anchoredDraggableKtanchoredDraggable11.write) != null) {
                            linearProgressIndicatorTokens2.RemoteActionCompatParcelizer();
                        }
                    } else if (lazyListMeasureResult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys - ((LazyListMeasuredItem) ((AnchoredDraggableKtrestartable212) onContentCardDismissed.read(list))).PlaybackStateCompat < f && (linearProgressIndicatorTokens = anchoredDraggableKtanchoredDraggable11.write) != null) {
                        linearProgressIndicatorTokens.RemoteActionCompatParcelizer();
                    }
                }
            }
            anchoredDraggableKtanchoredDraggable11.RemoteActionCompatParcelizer = f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.scroll(r7, r8, r0) == r1) goto L23;
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
    @Override // o.getAdjustedCoordinatesk4lQ0M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scroll(o.applyMeasureResultfoundation r7, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o.BasicTooltipKthandleGestures211
            if (r0 == 0) goto L13
            r0 = r9
            o.BasicTooltipKthandleGestures211 r0 = (o.BasicTooltipKthandleGestures211) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.write = r1
            goto L18
        L13:
            o.BasicTooltipKthandleGestures211 r0 = new o.BasicTooltipKthandleGestures211
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.write
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L6c
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r5
        L31:
            kotlin.coroutines.jvm.internal.SuspendLambda r7 = r0.IconCompatParcelizer
            r8 = r7
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8 = (o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) r8
            o.applyMeasureResultfoundation r7 = r0.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L5d
        L3c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            o.PopulateViewStructure_androidKtpopulate7 r9 = r6.ParcelableVolumeInfo
            o.onShowTranslationui r9 = (o.onShowTranslationui) r9
            java.lang.Object r9 = r9.getValue()
            androidx.compose.foundation.lazy.LazyListMeasureResult r2 = o.BasicTooltipKthandleGestures11.IconCompatParcelizer
            if (r9 != r2) goto L5d
            r0.serializer = r7
            r9 = r8
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = (kotlin.coroutines.jvm.internal.SuspendLambda) r9
            r0.IconCompatParcelizer = r9
            r0.write = r4
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r9 = r6.IconCompatParcelizer
            java.lang.Object r9 = r9.waitForFirstLayout(r0)
            if (r9 != r1) goto L5d
            goto L6b
        L5d:
            r0.serializer = r5
            r0.IconCompatParcelizer = r5
            r0.write = r3
            androidx.compose.foundation.gestures.DefaultScrollableState r9 = r6.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss
            java.lang.Object r7 = r9.scroll(r7, r8, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(o.applyMeasureResultfoundation, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
