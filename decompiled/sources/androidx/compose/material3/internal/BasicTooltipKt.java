package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d0$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.InlineChildren;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.isList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAutofillValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicTooltipKt {
    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    public static final void WrappedAnchor(final TooltipStateImpl tooltipStateImpl, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1873232064);
        final int i3 = 1;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? getpostalcode.read(tooltipStateImpl) : getpostalcode.IconCompatParcelizer(tooltipStateImpl) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(populateViewStructure_androidKtpopulate7) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        final int i4 = 0;
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.write(false) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity;
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, tooltipStateImpl, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
                public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                    public final /* synthetic */ int IconCompatParcelizer;
                    public /* synthetic */ Object RemoteActionCompatParcelizer;
                    public final /* synthetic */ TooltipStateImpl read;
                    public int serializer;
                    public final /* synthetic */ PointerInputScope write;

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C00001 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                        public final /* synthetic */ getContentViewGroupParentLayout IconCompatParcelizer;
                        public int MediaDescriptionCompat;
                        public PointerEventPass MediaSessionCompatQueueItem;
                        public long RemoteActionCompatParcelizer;
                        public /* synthetic */ Object read;
                        public final /* synthetic */ TooltipStateImpl serializer;
                        public MutableStateFlow write;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00001(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TooltipStateImpl tooltipStateImpl, ShortNewsContentCardView shortNewsContentCardView) {
                            super(2, shortNewsContentCardView);
                            this.IconCompatParcelizer = getcontentviewgroupparentlayout;
                            this.serializer = tooltipStateImpl;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                            C00001 c00001 = new C00001(this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
                            c00001.read = obj;
                            return c00001;
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            return ((C00001) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
                        
                            if (r2 == r0) goto L38;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v0 */
                        /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.flow.MutableSharedFlow] */
                        /* JADX WARN: Type inference failed for: r4v2 */
                        /* JADX WARN: Type inference failed for: r4v7 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 234
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00001.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ AnonymousClass1(PointerInputScope pointerInputScope, TooltipStateImpl tooltipStateImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
                        super(2, shortNewsContentCardView);
                        this.IconCompatParcelizer = i;
                        this.write = pointerInputScope;
                        this.read = tooltipStateImpl;
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i = this.IconCompatParcelizer;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
                        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
                        return i != 0 ? ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = this.IconCompatParcelizer;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        TooltipStateImpl tooltipStateImpl = this.read;
                        PointerInputScope pointerInputScope = this.write;
                        if (i != 0) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.serializer;
                            if (i2 == 0) {
                                ExtrasKt.RemoteActionCompatParcelizer(obj);
                                BasicTooltipKt$handleGestures$2$1$1 basicTooltipKt$handleGestures$2$1$1 = new BasicTooltipKt$handleGestures$2$1$1((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, tooltipStateImpl, null);
                                this.serializer = 1;
                                return pointerInputScope.awaitPointerEventScope(basicTooltipKt$handleGestures$2$1$1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                            }
                            if (i2 == 1) {
                                ExtrasKt.RemoteActionCompatParcelizer(obj);
                                return createfromparcel;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.serializer;
                        if (i3 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            C00001 c00001 = new C00001((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, tooltipStateImpl, null);
                            this.serializer = 1;
                            return ForEachGestureKt.awaitEachGesture(pointerInputScope, c00001, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                        }
                        if (i3 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                        if (this.IconCompatParcelizer != 0) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.write, this.read, shortNewsContentCardView, 1);
                            anonymousClass1.RemoteActionCompatParcelizer = obj;
                            return anonymousClass1;
                        }
                        AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.write, this.read, shortNewsContentCardView, 0);
                        anonymousClass2.RemoteActionCompatParcelizer = obj;
                        return anonymousClass2;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
                    int i5 = i4;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    TooltipStateImpl tooltipStateImpl2 = tooltipStateImpl;
                    ShortNewsContentCardView shortNewsContentCardView2 = null;
                    if (i5 != 0) {
                        Object objCoroutineScope = YieldKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, shortNewsContentCardView2, 1), shortNewsContentCardView);
                        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createfromparcel;
                    }
                    Object objCoroutineScope2 = YieldKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, shortNewsContentCardView2, 0), shortNewsContentCardView);
                    return objCoroutineScope2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope2 : createfromparcel;
                }
            }), tooltipStateImpl, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
                public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                    public final /* synthetic */ int IconCompatParcelizer;
                    public /* synthetic */ Object RemoteActionCompatParcelizer;
                    public final /* synthetic */ TooltipStateImpl read;
                    public int serializer;
                    public final /* synthetic */ PointerInputScope write;

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C00001 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                        public final /* synthetic */ getContentViewGroupParentLayout IconCompatParcelizer;
                        public int MediaDescriptionCompat;
                        public PointerEventPass MediaSessionCompatQueueItem;
                        public long RemoteActionCompatParcelizer;
                        public /* synthetic */ Object read;
                        public final /* synthetic */ TooltipStateImpl serializer;
                        public MutableStateFlow write;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00001(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TooltipStateImpl tooltipStateImpl, ShortNewsContentCardView shortNewsContentCardView) {
                            super(2, shortNewsContentCardView);
                            this.IconCompatParcelizer = getcontentviewgroupparentlayout;
                            this.serializer = tooltipStateImpl;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                            C00001 c00001 = new C00001(this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
                            c00001.read = obj;
                            return c00001;
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            return ((C00001) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
                        
                            if (r2 == r0) goto L38;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v0 */
                        /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.flow.MutableSharedFlow] */
                        /* JADX WARN: Type inference failed for: r4v2 */
                        /* JADX WARN: Type inference failed for: r4v7 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 234
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00001.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ AnonymousClass1(PointerInputScope pointerInputScope, TooltipStateImpl tooltipStateImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
                        super(2, shortNewsContentCardView);
                        this.IconCompatParcelizer = i;
                        this.write = pointerInputScope;
                        this.read = tooltipStateImpl;
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i = this.IconCompatParcelizer;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
                        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
                        return i != 0 ? ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = this.IconCompatParcelizer;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        TooltipStateImpl tooltipStateImpl = this.read;
                        PointerInputScope pointerInputScope = this.write;
                        if (i != 0) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.serializer;
                            if (i2 == 0) {
                                ExtrasKt.RemoteActionCompatParcelizer(obj);
                                BasicTooltipKt$handleGestures$2$1$1 basicTooltipKt$handleGestures$2$1$1 = new BasicTooltipKt$handleGestures$2$1$1((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, tooltipStateImpl, null);
                                this.serializer = 1;
                                return pointerInputScope.awaitPointerEventScope(basicTooltipKt$handleGestures$2$1$1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                            }
                            if (i2 == 1) {
                                ExtrasKt.RemoteActionCompatParcelizer(obj);
                                return createfromparcel;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.serializer;
                        if (i3 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            C00001 c00001 = new C00001((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, tooltipStateImpl, null);
                            this.serializer = 1;
                            return ForEachGestureKt.awaitEachGesture(pointerInputScope, c00001, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                        }
                        if (i3 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                        if (this.IconCompatParcelizer != 0) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.write, this.read, shortNewsContentCardView, 1);
                            anonymousClass1.RemoteActionCompatParcelizer = obj;
                            return anonymousClass1;
                        }
                        AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.write, this.read, shortNewsContentCardView, 0);
                        anonymousClass2.RemoteActionCompatParcelizer = obj;
                        return anonymousClass2;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
                    int i5 = i3;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    TooltipStateImpl tooltipStateImpl2 = tooltipStateImpl;
                    ShortNewsContentCardView shortNewsContentCardView2 = null;
                    if (i5 != 0) {
                        Object objCoroutineScope = YieldKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, shortNewsContentCardView2, 1), shortNewsContentCardView);
                        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createfromparcel;
                    }
                    Object objCoroutineScope2 = YieldKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, shortNewsContentCardView2, 0), shortNewsContentCardView);
                    return objCoroutineScope2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope2 : createfromparcel;
                }
            }).then(new setAutofillValue(new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(StringResources_androidKt.stringResource(R.string.tooltip_label, getpostalcode, 0), getcontentviewgroupparentlayout, tooltipStateImpl, 14))), new Navigator$$ExternalSyntheticLambda1(getcontentviewgroupparentlayout, 6, tooltipStateImpl)), new isList(tooltipStateImpl, populateViewStructure_androidKtpopulate7));
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierOnPreviewKeyEvent);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            if (getpostalcode.ComponentActivity) {
                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                }
            }
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i2 >> 15) & 14));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(tooltipStateImpl, populateViewStructure_androidKtpopulate7, modifier, dragAndDropTargetModifierNode, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    public static final void BasicTooltipBox(PopupPositionProvider popupPositionProvider, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, TooltipStateImpl tooltipStateImpl, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1221877520);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i & Fields.RotationY) == 0) {
                zIconCompatParcelizer = getpostalcode.read(tooltipStateImpl);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(tooltipStateImpl);
            }
            i2 |= zIconCompatParcelizer ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer((Object) null) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= getpostalcode.write(false) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.write(true) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.write(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (getpostalcode.write(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity2);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion2.getSetModifier());
                if (tooltipStateImpl.read()) {
                    getpostalcode.serializer(-1891243071);
                    z2 = true;
                    write(popupPositionProvider, tooltipStateImpl, getcontentviewgroupparentlayout, false, populateViewStructure_androidKtpopulate7, dragAndDropTargetModifierNode, getpostalcode, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                    z = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z = false;
                    z2 = true;
                    getpostalcode.serializer(-1890863476);
                    getpostalcode.IconCompatParcelizer(false);
                }
                WrappedAnchor(tooltipStateImpl, populateViewStructure_androidKtpopulate7, modifier, dragAndDropTargetModifierNode2, getpostalcode, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
                getpostalcode.IconCompatParcelizer(z2);
                boolean z3 = ((i3 & 896) == 256 || ((i3 & Fields.RotationY) != 0 && getpostalcode.IconCompatParcelizer(tooltipStateImpl))) ? z2 : z;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new InlineChildren(22, tooltipStateImpl);
                    getpostalcode.write(objComponentActivity3);
                }
                getPhoneNumberNational.serializer(tooltipStateImpl, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(i, 3, modifier, popupPositionProvider, dragAndDropTargetModifierNode, tooltipStateImpl, dragAndDropTargetModifierNode2);
        }
    }

    public static final void write(PopupPositionProvider popupPositionProvider, TooltipStateImpl tooltipStateImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout, boolean z, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1413720282);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zIconCompatParcelizer = getpostalcode.read(tooltipStateImpl);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(tooltipStateImpl);
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer((Object) null) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(populateViewStructure_androidKtpopulate7) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 1048576 : Fields.BlendMode;
        }
        if (getpostalcode.write(i2 & 1, (599187 & i2) != 599186)) {
            final String strStringResource = StringResources_androidKt.stringResource(R.string.tooltip_description, getpostalcode, 0);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 112) == 32 || ((i2 & 64) != 0 && getpostalcode.IconCompatParcelizer(tooltipStateImpl));
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z4 = (i2 & 458752) == 131072;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z3 | z2 | zIconCompatParcelizer2 | z4) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new n$$ExternalSyntheticLambda3(tooltipStateImpl, getcontentviewgroupparentlayout, populateViewStructure_androidKtpopulate7, 6);
                getpostalcode.write(objComponentActivity);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, new PopupProperties(z, false, false, false, 14, (DefaultConstructorMarker) null), ExtrasKt.write(-1287705660, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$2
                /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
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
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier.Companion companion = Modifier.Companion;
                        String str = strStringResource;
                        boolean z5 = getpostalcode2.read(str);
                        Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                        if (z5 || objComponentActivity2 == getCreditCardExpirationMonth.write) {
                            objComponentActivity2 = new d0$$ExternalSyntheticLambda4(str, 1);
                            getpostalcode2.write(objComponentActivity2);
                        }
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, 1, null);
                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierSemantics$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode2.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode2.ComponentActivity) {
                            getpostalcode2.serializer(constructor);
                        } else {
                            getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion2.getSetModifier());
                        dragAndDropTargetModifierNode.invoke(getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, (i2 & 14) | 3072, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(popupPositionProvider, tooltipStateImpl, getcontentviewgroupparentlayout, z, populateViewStructure_androidKtpopulate7, dragAndDropTargetModifierNode, i);
        }
    }
}
