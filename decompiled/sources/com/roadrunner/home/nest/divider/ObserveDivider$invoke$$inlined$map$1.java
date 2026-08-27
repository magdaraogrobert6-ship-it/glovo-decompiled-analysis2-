package com.roadrunner.home.nest.divider;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.ObserveImageSharingUiState$invoke$$inlined$map$1;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import o.AndroidPopup_androidKtLocalIsInPopupLayout1;
import o.AndroidPopup_androidKtPopup41;
import o.AndroidViewHolderlayoutNode1coreModifier3;
import o.AndroidViewHolderlayoutNode1coreModifier4;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.AnimationSearchInfiniteTransitionSearch;
import o.AnimationSearchRememberSearch;
import o.AnimationSearch_androidKt;
import o.ApiHelperForM1;
import o.ApiHelperForM2;
import o.AsyncFontListLoaderloadWithTimeoutOrNull2;
import o.AudioAttributesImplApi21;
import o.AudioAttributesImplApi21Parcelizer;
import o.AudioAttributesImplBase;
import o.AudioAttributesImplBaseParcelizer;
import o.BaseTransacterImplnotifyQueries1;
import o.BaseTransacterImplnotifyQueries2;
import o.BaselineShift;
import o.BaselineShiftKt;
import o.BlockRunnermaybeRun1;
import o.ColorStyle;
import o.DelegatingFrameMetricsListener;
import o.InfiniteTransitionComposeAnimation;
import o.ItemTouchHelper4;
import o.LineHeightStyleModeCompanion;
import o.LinearSmoothScroller;
import o.MultiDexV4;
import o.NavControlleronBackPressedCallback1;
import o.PreviewActivityExternalSyntheticLambda4;
import o.ShortNewsContentCardView;
import o.TextAlignCompanion;
import o.TextDecorationCompanion;
import o.WebViewRenderProcessClientFrameworkAdapter;
import o.WorkDatabase_Impl;
import o.accept;
import o.accessgetInstancedelegatecp;
import o.accessgetJustifycp;
import o.accessgetLastLineBottomcp;
import o.accessgetLineThroughcp;
import o.accessgetStartEllipsiscp;
import o.accessisDestinationPreviewAllowed;
import o.accessproduceMapLayer;
import o.childSerializers;
import o.clearDexDir;
import o.convertToRelativeDirection;
import o.copygijOMQM;
import o.correctBlurRadius;
import o.createFromParcel;
import o.deactivateOutOfFrame;
import o.destroyInternalPathIterator;
import o.displayInAppMessagelambda1;
import o.fastCoerceAtMost;
import o.findCentralDirectory;
import o.fromValue;
import o.ga;
import o.gb;
import o.gc;
import o.getAbsoluteMovementFlags;
import o.getAnimationClocksui_toolingannotations;
import o.getAnimations;
import o.getAutovmbZdU8;
import o.getBalancedfcGXIks;
import o.getCentere0LSkKk;
import o.getFailureResponseData;
import o.getNewListSize;
import o.getNoney9eOQZsannotations;
import o.getRtls_7Xco;
import o.getStatejXw82LU;
import o.getSwipeEscapeVelocity;
import o.gg;
import o.install;
import o.isItemDismissable;
import o.isSpecifiedaXe7zB0;
import o.isTrimFirstLineTopimplui_text;
import o.isTrimLastLineBottomimplui_text;
import o.isVerticalSwipeInAllowedDirection;
import o.minYgX7TsA;
import o.modulateDxMtmZc;
import o.onActivityPostStarted;
import o.onActivityStarted;
import o.onItemDismiss;
import o.pauseWebviewIfNecessarylambda10;
import o.performExtractions;
import o.postFromTraversal;
import o.r8lambdaCr742IFdOJbk53dYvTy5GYs2qps;
import o.registerSourcesuspendImpl;
import o.resetTransientState;
import o.serialize;
import o.setFitInsetsSides;
import o.shaderStatelambda0;
import o.takeOrElseBvjSTJw;
import o.takeOrElseHklW4sA;
import o.trackAnimation;
import o.valueOfIgVj0fw;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveDivider$invoke$$inlined$map$1 implements Flow {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ Flow IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        public final /* synthetic */ int serializer;
        public final /* synthetic */ FlowCollector write;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.serializer = i;
            this.write = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, int i) {
            this.serializer = i;
            this.write = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027  */
        private final Object emit$com$roadrunner$location$toggle$domain$GetOfflineLocationRequestStateImpl$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            accessproduceMapLayer accessproducemaplayer;
            WorkDatabase_Impl workDatabase_Impl;
            int i = 2 % 2;
            Object obj2 = null;
            if (shortNewsContentCardView instanceof accessproduceMapLayer) {
                int i2 = RemoteActionCompatParcelizer + 103;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = ((accessproduceMapLayer) shortNewsContentCardView).write;
                    throw null;
                }
                accessproducemaplayer = (accessproduceMapLayer) shortNewsContentCardView;
                int i4 = accessproducemaplayer.write;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    accessproducemaplayer.write = i4 - Integer.MIN_VALUE;
                } else {
                    accessproducemaplayer = new accessproduceMapLayer(this, shortNewsContentCardView);
                }
            } else {
                accessproducemaplayer = new accessproduceMapLayer(this, shortNewsContentCardView);
            }
            Object obj3 = accessproducemaplayer.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = accessproducemaplayer.write;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                switch (accessisDestinationPreviewAllowed.read[((getFailureResponseData) obj).RemoteActionCompatParcelizer.ordinal()]) {
                    case 1:
                        workDatabase_Impl = WorkDatabase_Impl.REQUIRED_NOT_WORKING;
                        break;
                    case 2:
                    case 3:
                        workDatabase_Impl = WorkDatabase_Impl.REQUIRED_PREPARING_TO_WORK;
                        break;
                    case 4:
                    case 5:
                        workDatabase_Impl = WorkDatabase_Impl.REQUIRED_ON_BREAK;
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        workDatabase_Impl = WorkDatabase_Impl.NOT_REQUIRED_WORKING;
                        break;
                    case 10:
                        workDatabase_Impl = WorkDatabase_Impl.REQUIRED_SUSPENDED;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                }
                accessproducemaplayer.write = 1;
                if (this.write.emit(workDatabase_Impl, accessproducemaplayer) == coroutineSingletons) {
                    int i6 = IconCompatParcelizer + 69;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = RemoteActionCompatParcelizer + 7;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:111:0x0174  */
        /* JADX WARN: Code duplicated, block: B:12:0x0033  */
        /* JADX WARN: Code duplicated, block: B:138:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:165:0x0221  */
        /* JADX WARN: Code duplicated, block: B:192:0x0273  */
        /* JADX WARN: Code duplicated, block: B:219:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:250:0x0345  */
        /* JADX WARN: Code duplicated, block: B:277:0x0397  */
        /* JADX WARN: Code duplicated, block: B:292:0x03da  */
        /* JADX WARN: Code duplicated, block: B:314:0x042d  */
        /* JADX WARN: Code duplicated, block: B:333:0x0488  */
        /* JADX WARN: Code duplicated, block: B:351:0x04da  */
        /* JADX WARN: Code duplicated, block: B:35:0x0082  */
        /* JADX WARN: Code duplicated, block: B:377:0x0538  */
        /* JADX WARN: Code duplicated, block: B:402:0x058b  */
        /* JADX WARN: Code duplicated, block: B:427:0x05de  */
        /* JADX WARN: Code duplicated, block: B:447:0x0620  */
        /* JADX WARN: Code duplicated, block: B:469:0x066e  */
        /* JADX WARN: Code duplicated, block: B:491:0x06c4  */
        /* JADX WARN: Code duplicated, block: B:510:0x070d  */
        /* JADX WARN: Code duplicated, block: B:532:0x0769  */
        /* JADX WARN: Code duplicated, block: B:554:0x07b7  */
        /* JADX WARN: Code duplicated, block: B:571:0x07fa  */
        /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:588:0x0834  */
        /* JADX WARN: Code duplicated, block: B:625:0x08da  */
        /* JADX WARN: Code duplicated, block: B:648:0x0926  */
        /* JADX WARN: Code duplicated, block: B:661:0x0955  */
        /* JADX WARN: Code duplicated, block: B:678:0x0992  */
        /* JADX WARN: Code duplicated, block: B:84:0x0122  */
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
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            fromValue fromvalue;
            correctBlurRadius correctblurradius;
            Object obj2;
            AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3;
            Object next;
            AndroidViewHolderlayoutNode1coreModifier4 androidViewHolderlayoutNode1coreModifier4;
            getNoney9eOQZsannotations getnoney9eoqzsannotations;
            findCentralDirectory findcentraldirectory;
            BaselineShiftKt baselineShiftKt;
            ColorStyle colorStyle;
            getBalancedfcGXIks getbalancedfcgxiks;
            accessgetLastLineBottomcp accessgetlastlinebottomcp;
            Object istrimlastlinebottomimplui_text;
            accessgetJustifycp accessgetjustifycp;
            isSpecifiedaXe7zB0 isspecifiedaxe7zb0;
            Object obj3;
            TextDecorationCompanion textDecorationCompanion;
            accessgetLineThroughcp accessgetlinethroughcp;
            modulateDxMtmZc modulatedxmtmzc;
            Object obj4;
            accessgetStartEllipsiscp accessgetstartellipsiscp;
            InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation;
            getStatejXw82LU getstatejxw82lu;
            r8lambdaCr742IFdOJbk53dYvTy5GYs2qps r8lambdacr742ifdojbk53dyvty5gys2qps;
            minYgX7TsA minygx7tsa;
            destroyInternalPathIterator destroyinternalpathiterator;
            registerSourcesuspendImpl registersourcesuspendimpl;
            Object obj5;
            getNewListSize getnewlistsize;
            Object obj6;
            postFromTraversal postfromtraversal;
            Object obj7;
            ItemTouchHelper4 itemTouchHelper4;
            Object obj8;
            convertToRelativeDirection converttorelativedirection;
            Object obj9;
            getAbsoluteMovementFlags getabsolutemovementflags;
            Object obj10;
            getSwipeEscapeVelocity getswipeescapevelocity;
            Object obj11;
            LinearSmoothScroller linearSmoothScroller;
            Object obj12;
            ApiHelperForM1 apiHelperForM1;
            ApiHelperForM2 apiHelperForM2;
            BaseTransacterImplnotifyQueries2 baseTransacterImplnotifyQueries2;
            Object obj13;
            int i = 2 % 2;
            int i2 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            FlowCollector flowCollector = this.write;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object getanimationclocksui_toolingannotations = null;
            obj14 = null;
            obj14 = null;
            switch (i2) {
                case 0:
                    if (shortNewsContentCardView instanceof fromValue) {
                        fromvalue = (fromValue) shortNewsContentCardView;
                        int i3 = fromvalue.write;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            fromvalue.write = i3 - Integer.MIN_VALUE;
                        } else {
                            fromvalue = new fromValue(this, shortNewsContentCardView);
                        }
                    } else {
                        fromvalue = new fromValue(this, shortNewsContentCardView);
                    }
                    Object obj17 = fromvalue.serializer;
                    Object obj18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = fromvalue.write;
                    if (i4 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj17);
                        boolean z = ((onActivityStarted) obj) != null;
                        fromvalue.write = 1;
                        return flowCollector.emit(Boolean.valueOf(z), fromvalue) == obj18 ? obj18 : createfromparcel;
                    }
                    if (i4 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj17);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 1:
                    if (shortNewsContentCardView instanceof correctBlurRadius) {
                        correctblurradius = (correctBlurRadius) shortNewsContentCardView;
                        int i5 = correctblurradius.write;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            correctblurradius.write = i5 - Integer.MIN_VALUE;
                        } else {
                            correctblurradius = new correctBlurRadius(this, shortNewsContentCardView);
                        }
                    } else {
                        correctblurradius = new correctBlurRadius(this, shortNewsContentCardView);
                    }
                    Object obj19 = correctblurradius.RemoteActionCompatParcelizer;
                    Object obj20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = correctblurradius.write;
                    if (i6 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj19);
                        obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                        if (!(obj2 instanceof isItemDismissable)) {
                            fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj2;
                            if (fastcoerceatmost != null && (androidViewHolderlayoutNode1coreModifier3 = fastcoerceatmost.mapComponent) != null) {
                                Iterator it = androidViewHolderlayoutNode1coreModifier3.components.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (next != null) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                    androidViewHolderlayoutNode1coreModifier4 = (AndroidViewHolderlayoutNode1coreModifier4) next;
                                    if (androidViewHolderlayoutNode1coreModifier4 != null) {
                                        obj14 = androidViewHolderlayoutNode1coreModifier4.payload;
                                    }
                                } while (!(next instanceof AndroidViewHolderlayoutNode1coreModifier4));
                                androidViewHolderlayoutNode1coreModifier4 = (AndroidViewHolderlayoutNode1coreModifier4) next;
                                if (androidViewHolderlayoutNode1coreModifier4 != null) {
                                    obj14 = androidViewHolderlayoutNode1coreModifier4.payload;
                                }
                            }
                            correctblurradius.IconCompatParcelizer = obj2;
                            correctblurradius.write = 1;
                            if (flowCollector.emit(obj14, correctblurradius) == obj20) {
                                return obj20;
                            }
                        }
                    } else {
                        if (i6 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = correctblurradius.IconCompatParcelizer;
                        ExtrasKt.RemoteActionCompatParcelizer(obj19);
                    }
                    Throwable thSerializer = onItemDismiss.serializer(obj2);
                    if (thSerializer == null) {
                        return createfromparcel;
                    }
                    Timber.RemoteActionCompatParcelizer.serializer(thSerializer, "Failed fetching route preview payload", new Object[0]);
                    return createfromparcel;
                case 2:
                    if (shortNewsContentCardView instanceof getNoney9eOQZsannotations) {
                        getnoney9eoqzsannotations = (getNoney9eOQZsannotations) shortNewsContentCardView;
                        int i7 = getnoney9eoqzsannotations.RemoteActionCompatParcelizer;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            getnoney9eoqzsannotations.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
                        } else {
                            getnoney9eoqzsannotations = new getNoney9eOQZsannotations(this, shortNewsContentCardView);
                        }
                    } else {
                        getnoney9eoqzsannotations = new getNoney9eOQZsannotations(this, shortNewsContentCardView);
                    }
                    Object obj21 = getnoney9eoqzsannotations.IconCompatParcelizer;
                    Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = getnoney9eoqzsannotations.RemoteActionCompatParcelizer;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj21);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj21);
                    AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
                    AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = audioAttributesImplBase instanceof AudioAttributesImplApi21Parcelizer ? (AudioAttributesImplApi21Parcelizer) audioAttributesImplBase : null;
                    DelegatingFrameMetricsListener delegatingFrameMetricsListener = audioAttributesImplApi21Parcelizer != null ? audioAttributesImplApi21Parcelizer.serializer : null;
                    NavControlleronBackPressedCallback1 navControlleronBackPressedCallback1 = delegatingFrameMetricsListener instanceof NavControlleronBackPressedCallback1 ? (NavControlleronBackPressedCallback1) delegatingFrameMetricsListener : null;
                    Object baselineShift = shaderStatelambda0.RemoteActionCompatParcelizer;
                    if (navControlleronBackPressedCallback1 != null && (findcentraldirectory = navControlleronBackPressedCallback1.data) != null) {
                        try {
                            String str = findcentraldirectory.title;
                            List list = findcentraldirectory.routes;
                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(deactivateOutOfFrame.read((clearDexDir) it2.next()));
                            }
                            baselineShift = new BaselineShift(str, arrayList, findcentraldirectory.pagination, false, findcentraldirectory.trackingEvents);
                        } catch (IllegalArgumentException e) {
                            Timber.RemoteActionCompatParcelizer.read("TripPlannerMapper, destinationType should be customer or vendor: " + e, new Object[0]);
                        }
                    }
                    getnoney9eoqzsannotations.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(baselineShift, getnoney9eoqzsannotations) == obj22 ? obj22 : createfromparcel;
                case 3:
                    if (shortNewsContentCardView instanceof BaselineShiftKt) {
                        baselineShiftKt = (BaselineShiftKt) shortNewsContentCardView;
                        int i9 = baselineShiftKt.RemoteActionCompatParcelizer;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            baselineShiftKt.RemoteActionCompatParcelizer = i9 - Integer.MIN_VALUE;
                        } else {
                            baselineShiftKt = new BaselineShiftKt(this, shortNewsContentCardView);
                        }
                    } else {
                        baselineShiftKt = new BaselineShiftKt(this, shortNewsContentCardView);
                    }
                    Object obj23 = baselineShiftKt.write;
                    Object obj24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = baselineShiftKt.RemoteActionCompatParcelizer;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj23);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj23);
                    if (!(obj instanceof getAutovmbZdU8)) {
                        return createfromparcel;
                    }
                    baselineShiftKt.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(obj, baselineShiftKt) == obj24 ? obj24 : createfromparcel;
                case 4:
                    if (shortNewsContentCardView instanceof ColorStyle) {
                        colorStyle = (ColorStyle) shortNewsContentCardView;
                        int i11 = colorStyle.IconCompatParcelizer;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            colorStyle.IconCompatParcelizer = i11 - Integer.MIN_VALUE;
                        } else {
                            colorStyle = new ColorStyle(this, shortNewsContentCardView);
                        }
                    } else {
                        colorStyle = new ColorStyle(this, shortNewsContentCardView);
                    }
                    Object obj25 = colorStyle.read;
                    Object obj26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = colorStyle.IconCompatParcelizer;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj25);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj25);
                    if (!(obj instanceof copygijOMQM)) {
                        return createfromparcel;
                    }
                    int i13 = RemoteActionCompatParcelizer + 89;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    colorStyle.IconCompatParcelizer = 1;
                    return flowCollector.emit(obj, colorStyle) == obj26 ? obj26 : createfromparcel;
                case 5:
                    if (shortNewsContentCardView instanceof getBalancedfcGXIks) {
                        getbalancedfcgxiks = (getBalancedfcGXIks) shortNewsContentCardView;
                        int i15 = getbalancedfcgxiks.read;
                        if ((i15 & Integer.MIN_VALUE) != 0) {
                            getbalancedfcgxiks.read = i15 - Integer.MIN_VALUE;
                        } else {
                            getbalancedfcgxiks = new getBalancedfcGXIks(this, shortNewsContentCardView);
                        }
                    } else {
                        getbalancedfcgxiks = new getBalancedfcGXIks(this, shortNewsContentCardView);
                    }
                    Object obj27 = getbalancedfcgxiks.write;
                    Object obj28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = getbalancedfcgxiks.read;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj27);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj27);
                    Object obj29 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj29 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = (AndroidPopup_androidKtPopup41) obj29;
                        obj29 = (fastCoerceAtMost) (androidPopup_androidKtPopup41 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup41 : null);
                    }
                    Object onitemdismiss = new onItemDismiss(obj29);
                    getbalancedfcgxiks.read = 1;
                    return flowCollector.emit(onitemdismiss, getbalancedfcgxiks) == obj28 ? obj28 : createfromparcel;
                case 6:
                    if (shortNewsContentCardView instanceof accessgetLastLineBottomcp) {
                        accessgetlastlinebottomcp = (accessgetLastLineBottomcp) shortNewsContentCardView;
                        int i17 = accessgetlastlinebottomcp.RemoteActionCompatParcelizer;
                        if ((i17 & Integer.MIN_VALUE) != 0) {
                            accessgetlastlinebottomcp.RemoteActionCompatParcelizer = i17 - Integer.MIN_VALUE;
                        } else {
                            accessgetlastlinebottomcp = new accessgetLastLineBottomcp(this, shortNewsContentCardView);
                        }
                    } else {
                        accessgetlastlinebottomcp = new accessgetLastLineBottomcp(this, shortNewsContentCardView);
                    }
                    Object obj30 = accessgetlastlinebottomcp.write;
                    Object obj31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = accessgetlastlinebottomcp.RemoteActionCompatParcelizer;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj30);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj30);
                    gb gbVar = (gb) obj;
                    if (gbVar instanceof ga) {
                        ga gaVar = (ga) gbVar;
                        int i19 = gaVar.serializer;
                        int i20 = gaVar.write;
                        istrimlastlinebottomimplui_text = new isTrimLastLineBottomimplui_text(String.valueOf(i19), new LineHeightStyleModeCompanion(String.valueOf(i20), i20 > i19 + 3));
                    } else {
                        istrimlastlinebottomimplui_text = isTrimFirstLineTopimplui_text.IconCompatParcelizer;
                    }
                    accessgetlastlinebottomcp.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(istrimlastlinebottomimplui_text, accessgetlastlinebottomcp) == obj31 ? obj31 : createfromparcel;
                case 7:
                    if (shortNewsContentCardView instanceof accessgetJustifycp) {
                        int i21 = RemoteActionCompatParcelizer + 49;
                        IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        accessgetjustifycp = (accessgetJustifycp) shortNewsContentCardView;
                        int i23 = accessgetjustifycp.serializer;
                        if ((i23 & Integer.MIN_VALUE) != 0) {
                            accessgetjustifycp.serializer = i23 - Integer.MIN_VALUE;
                        } else {
                            accessgetjustifycp = new accessgetJustifycp(this, shortNewsContentCardView);
                        }
                    } else {
                        accessgetjustifycp = new accessgetJustifycp(this, shortNewsContentCardView);
                    }
                    Object obj32 = accessgetjustifycp.IconCompatParcelizer;
                    Object obj33 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = accessgetjustifycp.serializer;
                    if (i24 != 0) {
                        if (i24 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj32);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj32);
                    gc gcVar = (gc) obj;
                    Object textAlignCompanion = !(gcVar instanceof gg) ? getCentere0LSkKk.write : new TextAlignCompanion(((gg) gcVar).IconCompatParcelizer);
                    accessgetjustifycp.serializer = 1;
                    return flowCollector.emit(textAlignCompanion, accessgetjustifycp) == obj33 ? obj33 : createfromparcel;
                case 8:
                    if (shortNewsContentCardView instanceof isSpecifiedaXe7zB0) {
                        isspecifiedaxe7zb0 = (isSpecifiedaXe7zB0) shortNewsContentCardView;
                        int i25 = isspecifiedaxe7zb0.RemoteActionCompatParcelizer;
                        if ((i25 & Integer.MIN_VALUE) != 0) {
                            isspecifiedaxe7zb0.RemoteActionCompatParcelizer = i25 - Integer.MIN_VALUE;
                        } else {
                            isspecifiedaxe7zb0 = new isSpecifiedaXe7zB0(this, shortNewsContentCardView);
                        }
                    } else {
                        isspecifiedaxe7zb0 = new isSpecifiedaXe7zB0(this, shortNewsContentCardView);
                    }
                    Object obj34 = isspecifiedaxe7zb0.IconCompatParcelizer;
                    Object obj35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = isspecifiedaxe7zb0.RemoteActionCompatParcelizer;
                    if (i26 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj34);
                        int i27 = takeOrElseBvjSTJw.IconCompatParcelizer[((serialize) obj).ordinal()];
                        if (i27 == 1) {
                            obj3 = valueOfIgVj0fw.OVERVIEW;
                        } else if (i27 == 2) {
                            obj3 = valueOfIgVj0fw.NAVIGATION;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        isspecifiedaxe7zb0.RemoteActionCompatParcelizer = 1;
                        return flowCollector.emit(obj3, isspecifiedaxe7zb0) == obj35 ? obj35 : createfromparcel;
                    }
                    if (i26 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj34);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 9:
                    if (shortNewsContentCardView instanceof TextDecorationCompanion) {
                        textDecorationCompanion = (TextDecorationCompanion) shortNewsContentCardView;
                        int i28 = textDecorationCompanion.write;
                        if ((i28 & Integer.MIN_VALUE) != 0) {
                            textDecorationCompanion.write = i28 - Integer.MIN_VALUE;
                        } else {
                            textDecorationCompanion = new TextDecorationCompanion(this, shortNewsContentCardView);
                        }
                    } else {
                        textDecorationCompanion = new TextDecorationCompanion(this, shortNewsContentCardView);
                    }
                    Object obj36 = textDecorationCompanion.IconCompatParcelizer;
                    Object obj37 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = textDecorationCompanion.write;
                    if (i29 != 0) {
                        if (i29 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj36);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj36);
                    Object obj38 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj38 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup42 = (AndroidPopup_androidKtPopup41) obj38;
                        obj38 = (fastCoerceAtMost) (androidPopup_androidKtPopup42 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup42 : null);
                    }
                    Object onitemdismiss2 = new onItemDismiss(obj38);
                    textDecorationCompanion.write = 1;
                    return flowCollector.emit(onitemdismiss2, textDecorationCompanion) == obj37 ? obj37 : createfromparcel;
                case 10:
                    if (shortNewsContentCardView instanceof accessgetLineThroughcp) {
                        accessgetlinethroughcp = (accessgetLineThroughcp) shortNewsContentCardView;
                        int i30 = accessgetlinethroughcp.IconCompatParcelizer;
                        if ((i30 & Integer.MIN_VALUE) != 0) {
                            accessgetlinethroughcp.IconCompatParcelizer = i30 - Integer.MIN_VALUE;
                        } else {
                            accessgetlinethroughcp = new accessgetLineThroughcp(this, shortNewsContentCardView);
                        }
                    } else {
                        accessgetlinethroughcp = new accessgetLineThroughcp(this, shortNewsContentCardView);
                    }
                    Object obj39 = accessgetlinethroughcp.write;
                    Object obj40 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = accessgetlinethroughcp.IconCompatParcelizer;
                    if (i31 != 0) {
                        if (i31 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj39);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj39);
                    Object obj41 = ((onItemDismiss) obj).IconCompatParcelizer;
                    Object obj42 = obj41 instanceof isItemDismissable ? null : obj41;
                    if (obj42 == null) {
                        return createfromparcel;
                    }
                    accessgetlinethroughcp.IconCompatParcelizer = 1;
                    return flowCollector.emit(obj42, accessgetlinethroughcp) == obj40 ? obj40 : createfromparcel;
                case 11:
                    if (shortNewsContentCardView instanceof modulateDxMtmZc) {
                        modulatedxmtmzc = (modulateDxMtmZc) shortNewsContentCardView;
                        int i32 = modulatedxmtmzc.write;
                        if ((i32 & Integer.MIN_VALUE) != 0) {
                            modulatedxmtmzc.write = i32 - Integer.MIN_VALUE;
                        } else {
                            modulatedxmtmzc = new modulateDxMtmZc(this, shortNewsContentCardView);
                        }
                    } else {
                        modulatedxmtmzc = new modulateDxMtmZc(this, shortNewsContentCardView);
                    }
                    Object obj43 = modulatedxmtmzc.IconCompatParcelizer;
                    Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = modulatedxmtmzc.write;
                    if (i33 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj43);
                        int i34 = takeOrElseHklW4sA.serializer[((childSerializers) obj).ordinal()];
                        if (i34 == 1) {
                            obj4 = getRtls_7Xco.DISABLED;
                        } else if (i34 == 2) {
                            obj4 = getRtls_7Xco.ON;
                        } else if (i34 == 3) {
                            obj4 = getRtls_7Xco.OFF;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        modulatedxmtmzc.write = 1;
                        return flowCollector.emit(obj4, modulatedxmtmzc) == obj44 ? obj44 : createfromparcel;
                    }
                    if (i33 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj43);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 12:
                    if (shortNewsContentCardView instanceof accessgetStartEllipsiscp) {
                        accessgetstartellipsiscp = (accessgetStartEllipsiscp) shortNewsContentCardView;
                        int i35 = accessgetstartellipsiscp.serializer;
                        if ((i35 & Integer.MIN_VALUE) != 0) {
                            accessgetstartellipsiscp.serializer = i35 - Integer.MIN_VALUE;
                        } else {
                            accessgetstartellipsiscp = new accessgetStartEllipsiscp(this, shortNewsContentCardView);
                        }
                    } else {
                        accessgetstartellipsiscp = new accessgetStartEllipsiscp(this, shortNewsContentCardView);
                    }
                    Object obj45 = accessgetstartellipsiscp.write;
                    Object obj46 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = accessgetstartellipsiscp.serializer;
                    if (i36 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj45);
                        Object obj47 = ((onItemDismiss) obj).IconCompatParcelizer;
                        if (obj47 instanceof isItemDismissable) {
                            obj47 = null;
                        }
                        setFitInsetsSides setfitinsetssides = (setFitInsetsSides) obj47;
                        Object obj48 = setfitinsetssides != null ? setfitinsetssides.vendor : null;
                        accessgetstartellipsiscp.serializer = 1;
                        return flowCollector.emit(obj48, accessgetstartellipsiscp) == obj46 ? obj46 : createfromparcel;
                    }
                    int i37 = RemoteActionCompatParcelizer + 21;
                    IconCompatParcelizer = i37 % Fields.SpotShadowColor;
                    if (i37 % 2 == 0 ? i36 != 1 : i36 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj45);
                    return createfromparcel;
                case 13:
                    if (shortNewsContentCardView instanceof InfiniteTransitionComposeAnimation) {
                        infiniteTransitionComposeAnimation = (InfiniteTransitionComposeAnimation) shortNewsContentCardView;
                        int i38 = infiniteTransitionComposeAnimation.IconCompatParcelizer;
                        if ((i38 & Integer.MIN_VALUE) != 0) {
                            infiniteTransitionComposeAnimation.IconCompatParcelizer = i38 - Integer.MIN_VALUE;
                        } else {
                            infiniteTransitionComposeAnimation = new InfiniteTransitionComposeAnimation(this, shortNewsContentCardView);
                        }
                    } else {
                        infiniteTransitionComposeAnimation = new InfiniteTransitionComposeAnimation(this, shortNewsContentCardView);
                    }
                    Object obj49 = infiniteTransitionComposeAnimation.read;
                    Object obj50 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i39 = infiniteTransitionComposeAnimation.IconCompatParcelizer;
                    if (i39 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj49);
                        AnimationSearchRememberSearch animationSearchRememberSearch = (AnimationSearchRememberSearch) obj;
                        if (animationSearchRememberSearch instanceof AnimationSearchInfiniteTransitionSearch) {
                            getanimationclocksui_toolingannotations = new trackAnimation(((AnimationSearchInfiniteTransitionSearch) animationSearchRememberSearch).serializer);
                        } else if (animationSearchRememberSearch instanceof AnimationSearch_androidKt) {
                            getanimationclocksui_toolingannotations = new getAnimationClocksui_toolingannotations(((AnimationSearch_androidKt) animationSearchRememberSearch).IconCompatParcelizer);
                        } else if (!(animationSearchRememberSearch instanceof getAnimations)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        if (getanimationclocksui_toolingannotations == null) {
                            return createfromparcel;
                        }
                        infiniteTransitionComposeAnimation.IconCompatParcelizer = 1;
                        return flowCollector.emit(getanimationclocksui_toolingannotations, infiniteTransitionComposeAnimation) == obj50 ? obj50 : createfromparcel;
                    }
                    if (i39 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj49);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 14:
                    if (shortNewsContentCardView instanceof getStatejXw82LU) {
                        getstatejxw82lu = (getStatejXw82LU) shortNewsContentCardView;
                        int i40 = getstatejxw82lu.serializer;
                        if ((i40 & Integer.MIN_VALUE) != 0) {
                            getstatejxw82lu.serializer = i40 - Integer.MIN_VALUE;
                        } else {
                            getstatejxw82lu = new getStatejXw82LU(this, shortNewsContentCardView);
                        }
                    } else {
                        getstatejxw82lu = new getStatejXw82LU(this, shortNewsContentCardView);
                    }
                    Object obj51 = getstatejxw82lu.RemoteActionCompatParcelizer;
                    Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i41 = getstatejxw82lu.serializer;
                    if (i41 != 0) {
                        if (i41 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj51);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj51);
                    String str2 = (String) obj;
                    if (str2 != null) {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        obj16 = (AsyncFontListLoaderloadWithTimeoutOrNull2) isverticalswipeinalloweddirection.serializer(str2, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(isverticalswipeinalloweddirection.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(AsyncFontListLoaderloadWithTimeoutOrNull2.class)));
                    }
                    getstatejxw82lu.serializer = 1;
                    return flowCollector.emit(obj16, getstatejxw82lu) == obj52 ? obj52 : createfromparcel;
                case 15:
                    if (shortNewsContentCardView instanceof r8lambdaCr742IFdOJbk53dYvTy5GYs2qps) {
                        r8lambdacr742ifdojbk53dyvty5gys2qps = (r8lambdaCr742IFdOJbk53dYvTy5GYs2qps) shortNewsContentCardView;
                        int i42 = r8lambdacr742ifdojbk53dyvty5gys2qps.RemoteActionCompatParcelizer;
                        if ((i42 & Integer.MIN_VALUE) != 0) {
                            r8lambdacr742ifdojbk53dyvty5gys2qps.RemoteActionCompatParcelizer = i42 - Integer.MIN_VALUE;
                        } else {
                            r8lambdacr742ifdojbk53dyvty5gys2qps = new r8lambdaCr742IFdOJbk53dYvTy5GYs2qps(this, shortNewsContentCardView);
                        }
                    } else {
                        r8lambdacr742ifdojbk53dyvty5gys2qps = new r8lambdaCr742IFdOJbk53dYvTy5GYs2qps(this, shortNewsContentCardView);
                    }
                    Object obj53 = r8lambdacr742ifdojbk53dyvty5gys2qps.write;
                    Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i43 = r8lambdacr742ifdojbk53dyvty5gys2qps.RemoteActionCompatParcelizer;
                    if (i43 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj53);
                        String str3 = (String) obj;
                        if (str3 != null) {
                            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                            obj15 = (PreviewActivityExternalSyntheticLambda4) isverticalswipeinalloweddirection2.serializer(str3, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(PreviewActivityExternalSyntheticLambda4.class)));
                        }
                        r8lambdacr742ifdojbk53dyvty5gys2qps.RemoteActionCompatParcelizer = 1;
                        return flowCollector.emit(obj15, r8lambdacr742ifdojbk53dyvty5gys2qps) == obj54 ? obj54 : createfromparcel;
                    }
                    int i44 = IconCompatParcelizer + 25;
                    RemoteActionCompatParcelizer = i44 % Fields.SpotShadowColor;
                    int i45 = i44 % 2;
                    if (i43 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj53);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 16:
                    if (shortNewsContentCardView instanceof minYgX7TsA) {
                        minygx7tsa = (minYgX7TsA) shortNewsContentCardView;
                        int i46 = minygx7tsa.RemoteActionCompatParcelizer;
                        if ((i46 & Integer.MIN_VALUE) != 0) {
                            minygx7tsa.RemoteActionCompatParcelizer = i46 - Integer.MIN_VALUE;
                        } else {
                            minygx7tsa = new minYgX7TsA(this, shortNewsContentCardView);
                        }
                    } else {
                        minygx7tsa = new minYgX7TsA(this, shortNewsContentCardView);
                    }
                    Object obj55 = minygx7tsa.read;
                    Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i47 = minygx7tsa.RemoteActionCompatParcelizer;
                    if (i47 != 0) {
                        if (i47 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj55);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj55);
                    if (!((Boolean) obj).booleanValue()) {
                        return createfromparcel;
                    }
                    int i48 = RemoteActionCompatParcelizer + 55;
                    IconCompatParcelizer = i48 % Fields.SpotShadowColor;
                    if (i48 % 2 != 0) {
                        minygx7tsa.RemoteActionCompatParcelizer = 1;
                        if (flowCollector.emit(obj, minygx7tsa) != obj56) {
                            return createfromparcel;
                        }
                    } else {
                        minygx7tsa.RemoteActionCompatParcelizer = 1;
                        if (flowCollector.emit(obj, minygx7tsa) != obj56) {
                            return createfromparcel;
                        }
                    }
                    return obj56;
                case 17:
                    if (shortNewsContentCardView instanceof destroyInternalPathIterator) {
                        destroyinternalpathiterator = (destroyInternalPathIterator) shortNewsContentCardView;
                        int i49 = destroyinternalpathiterator.serializer;
                        if ((i49 & Integer.MIN_VALUE) != 0) {
                            destroyinternalpathiterator.serializer = i49 - Integer.MIN_VALUE;
                        } else {
                            destroyinternalpathiterator = new destroyInternalPathIterator(this, shortNewsContentCardView);
                        }
                    } else {
                        destroyinternalpathiterator = new destroyInternalPathIterator(this, shortNewsContentCardView);
                    }
                    Object obj57 = destroyinternalpathiterator.IconCompatParcelizer;
                    Object obj58 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i50 = destroyinternalpathiterator.serializer;
                    if (i50 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj57);
                        boolean zIsEmpty = ((Set) obj).isEmpty();
                        destroyinternalpathiterator.serializer = 1;
                        return flowCollector.emit(Boolean.valueOf(zIsEmpty ^ true), destroyinternalpathiterator) == obj58 ? obj58 : createfromparcel;
                    }
                    if (i50 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj57);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 18:
                    if (shortNewsContentCardView instanceof registerSourcesuspendImpl) {
                        registersourcesuspendimpl = (registerSourcesuspendImpl) shortNewsContentCardView;
                        int i51 = registersourcesuspendimpl.write;
                        if ((i51 & Integer.MIN_VALUE) != 0) {
                            int i52 = RemoteActionCompatParcelizer + 47;
                            IconCompatParcelizer = i52 % Fields.SpotShadowColor;
                            int i53 = i52 % 2;
                            registersourcesuspendimpl.write = i51 - Integer.MIN_VALUE;
                        } else {
                            registersourcesuspendimpl = new registerSourcesuspendImpl(this, shortNewsContentCardView);
                        }
                    } else {
                        registersourcesuspendimpl = new registerSourcesuspendImpl(this, shortNewsContentCardView);
                    }
                    Object obj59 = registersourcesuspendimpl.read;
                    Object obj60 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i54 = registersourcesuspendimpl.write;
                    if (i54 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj59);
                        AudioAttributesImplBase audioAttributesImplBase2 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase2 instanceof AudioAttributesImplApi21Parcelizer) {
                            obj5 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase2).serializer;
                        } else if (audioAttributesImplBase2 instanceof AudioAttributesImplApi21) {
                            obj5 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj61 = obj5 instanceof onActivityStarted ? obj5 : null;
                        registersourcesuspendimpl.write = 1;
                        return flowCollector.emit((onActivityStarted) obj61, registersourcesuspendimpl) == obj60 ? obj60 : createfromparcel;
                    }
                    if (i54 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj59);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 19:
                    if (shortNewsContentCardView instanceof getNewListSize) {
                        int i55 = RemoteActionCompatParcelizer + 115;
                        IconCompatParcelizer = i55 % Fields.SpotShadowColor;
                        int i56 = i55 % 2;
                        getnewlistsize = (getNewListSize) shortNewsContentCardView;
                        int i57 = getnewlistsize.IconCompatParcelizer;
                        if ((i57 & Integer.MIN_VALUE) != 0) {
                            getnewlistsize.IconCompatParcelizer = i57 - Integer.MIN_VALUE;
                        } else {
                            getnewlistsize = new getNewListSize(this, shortNewsContentCardView);
                        }
                    } else {
                        getnewlistsize = new getNewListSize(this, shortNewsContentCardView);
                    }
                    Object obj62 = getnewlistsize.RemoteActionCompatParcelizer;
                    Object obj63 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i58 = getnewlistsize.IconCompatParcelizer;
                    if (i58 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj62);
                        AudioAttributesImplBase audioAttributesImplBase3 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase3 instanceof AudioAttributesImplApi21Parcelizer) {
                            int i59 = IconCompatParcelizer + 117;
                            RemoteActionCompatParcelizer = i59 % Fields.SpotShadowColor;
                            if (i59 % 2 == 0) {
                                DelegatingFrameMetricsListener delegatingFrameMetricsListener2 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase3).serializer;
                                obj14.hashCode();
                                throw null;
                            }
                            obj6 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase3).serializer;
                        } else if (audioAttributesImplBase3 instanceof AudioAttributesImplApi21) {
                            int i60 = RemoteActionCompatParcelizer + 77;
                            IconCompatParcelizer = i60 % Fields.SpotShadowColor;
                            int i61 = i60 % 2;
                            obj6 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj64 = obj6 instanceof onActivityPostStarted ? obj6 : null;
                        getnewlistsize.IconCompatParcelizer = 1;
                        return flowCollector.emit((onActivityPostStarted) obj64, getnewlistsize) == obj63 ? obj63 : createfromparcel;
                    }
                    if (i58 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj62);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 20:
                    if (shortNewsContentCardView instanceof postFromTraversal) {
                        postfromtraversal = (postFromTraversal) shortNewsContentCardView;
                        int i62 = postfromtraversal.read;
                        if ((i62 & Integer.MIN_VALUE) != 0) {
                            postfromtraversal.read = i62 - Integer.MIN_VALUE;
                        } else {
                            postfromtraversal = new postFromTraversal(this, shortNewsContentCardView);
                        }
                    } else {
                        postfromtraversal = new postFromTraversal(this, shortNewsContentCardView);
                    }
                    Object obj65 = postfromtraversal.write;
                    Object obj66 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i63 = postfromtraversal.read;
                    if (i63 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj65);
                        AudioAttributesImplBase audioAttributesImplBase4 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase4 instanceof AudioAttributesImplApi21Parcelizer) {
                            obj7 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase4).serializer;
                        } else if (audioAttributesImplBase4 instanceof AudioAttributesImplApi21) {
                            obj7 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj67 = obj7 instanceof AudioAttributesImplBaseParcelizer ? obj7 : null;
                        postfromtraversal.read = 1;
                        return flowCollector.emit((AudioAttributesImplBaseParcelizer) obj67, postfromtraversal) == obj66 ? obj66 : createfromparcel;
                    }
                    if (i63 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj65);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 21:
                    if (shortNewsContentCardView instanceof ItemTouchHelper4) {
                        itemTouchHelper4 = (ItemTouchHelper4) shortNewsContentCardView;
                        int i64 = itemTouchHelper4.RemoteActionCompatParcelizer;
                        if ((i64 & Integer.MIN_VALUE) != 0) {
                            itemTouchHelper4.RemoteActionCompatParcelizer = i64 - Integer.MIN_VALUE;
                        } else {
                            itemTouchHelper4 = new ItemTouchHelper4(this, shortNewsContentCardView);
                        }
                    } else {
                        itemTouchHelper4 = new ItemTouchHelper4(this, shortNewsContentCardView);
                    }
                    Object obj68 = itemTouchHelper4.write;
                    Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i65 = itemTouchHelper4.RemoteActionCompatParcelizer;
                    if (i65 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj68);
                        AudioAttributesImplBase audioAttributesImplBase5 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase5 instanceof AudioAttributesImplApi21Parcelizer) {
                            obj8 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase5).serializer;
                        } else if (audioAttributesImplBase5 instanceof AudioAttributesImplApi21) {
                            obj8 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj70 = obj8 instanceof BlockRunnermaybeRun1 ? obj8 : null;
                        itemTouchHelper4.RemoteActionCompatParcelizer = 1;
                        return flowCollector.emit((BlockRunnermaybeRun1) obj70, itemTouchHelper4) == obj69 ? obj69 : createfromparcel;
                    }
                    if (i65 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj68);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 22:
                    if (shortNewsContentCardView instanceof convertToRelativeDirection) {
                        converttorelativedirection = (convertToRelativeDirection) shortNewsContentCardView;
                        int i66 = converttorelativedirection.serializer;
                        if ((i66 & Integer.MIN_VALUE) != 0) {
                            converttorelativedirection.serializer = i66 - Integer.MIN_VALUE;
                        } else {
                            converttorelativedirection = new convertToRelativeDirection(this, shortNewsContentCardView);
                        }
                    } else {
                        converttorelativedirection = new convertToRelativeDirection(this, shortNewsContentCardView);
                    }
                    Object obj71 = converttorelativedirection.IconCompatParcelizer;
                    Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i67 = converttorelativedirection.serializer;
                    if (i67 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj71);
                        AudioAttributesImplBase audioAttributesImplBase6 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase6 instanceof AudioAttributesImplApi21Parcelizer) {
                            obj9 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase6).serializer;
                        } else if (audioAttributesImplBase6 instanceof AudioAttributesImplApi21) {
                            obj9 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj73 = obj9 instanceof performExtractions ? obj9 : null;
                        converttorelativedirection.serializer = 1;
                        if (flowCollector.emit((performExtractions) obj73, converttorelativedirection) != obj72) {
                            return createfromparcel;
                        }
                        int i68 = IconCompatParcelizer + 75;
                        RemoteActionCompatParcelizer = i68 % Fields.SpotShadowColor;
                        int i69 = i68 % 2;
                        return obj72;
                    }
                    if (i67 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj71);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 23:
                    if (shortNewsContentCardView instanceof getAbsoluteMovementFlags) {
                        getabsolutemovementflags = (getAbsoluteMovementFlags) shortNewsContentCardView;
                        int i70 = getabsolutemovementflags.read;
                        if ((i70 & Integer.MIN_VALUE) != 0) {
                            getabsolutemovementflags.read = i70 - Integer.MIN_VALUE;
                        } else {
                            getabsolutemovementflags = new getAbsoluteMovementFlags(this, shortNewsContentCardView);
                        }
                    } else {
                        getabsolutemovementflags = new getAbsoluteMovementFlags(this, shortNewsContentCardView);
                    }
                    Object obj74 = getabsolutemovementflags.RemoteActionCompatParcelizer;
                    Object obj75 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i71 = getabsolutemovementflags.read;
                    if (i71 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj74);
                        AudioAttributesImplBase audioAttributesImplBase7 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase7 instanceof AudioAttributesImplApi21Parcelizer) {
                            obj10 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase7).serializer;
                        } else if (audioAttributesImplBase7 instanceof AudioAttributesImplApi21) {
                            obj10 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj76 = obj10 instanceof install ? obj10 : null;
                        getabsolutemovementflags.read = 1;
                        return flowCollector.emit((install) obj76, getabsolutemovementflags) == obj75 ? obj75 : createfromparcel;
                    }
                    if (i71 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj74);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 24:
                    if (shortNewsContentCardView instanceof getSwipeEscapeVelocity) {
                        getswipeescapevelocity = (getSwipeEscapeVelocity) shortNewsContentCardView;
                        int i72 = getswipeescapevelocity.serializer;
                        if ((i72 & Integer.MIN_VALUE) != 0) {
                            getswipeescapevelocity.serializer = i72 - Integer.MIN_VALUE;
                        } else {
                            getswipeescapevelocity = new getSwipeEscapeVelocity(this, shortNewsContentCardView);
                        }
                    } else {
                        getswipeescapevelocity = new getSwipeEscapeVelocity(this, shortNewsContentCardView);
                    }
                    Object obj77 = getswipeescapevelocity.read;
                    Object obj78 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i73 = getswipeescapevelocity.serializer;
                    if (i73 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj77);
                        AudioAttributesImplBase audioAttributesImplBase8 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase8 instanceof AudioAttributesImplApi21Parcelizer) {
                            obj11 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase8).serializer;
                        } else if (audioAttributesImplBase8 instanceof AudioAttributesImplApi21) {
                            obj11 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj79 = obj11 instanceof MultiDexV4 ? obj11 : null;
                        getswipeescapevelocity.serializer = 1;
                        return flowCollector.emit((MultiDexV4) obj79, getswipeescapevelocity) == obj78 ? obj78 : createfromparcel;
                    }
                    if (i73 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj77);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 25:
                    if (shortNewsContentCardView instanceof LinearSmoothScroller) {
                        linearSmoothScroller = (LinearSmoothScroller) shortNewsContentCardView;
                        int i74 = linearSmoothScroller.serializer;
                        if ((i74 & Integer.MIN_VALUE) != 0) {
                            linearSmoothScroller.serializer = i74 - Integer.MIN_VALUE;
                        } else {
                            linearSmoothScroller = new LinearSmoothScroller(this, shortNewsContentCardView);
                        }
                    } else {
                        linearSmoothScroller = new LinearSmoothScroller(this, shortNewsContentCardView);
                    }
                    Object obj80 = linearSmoothScroller.IconCompatParcelizer;
                    Object obj81 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i75 = linearSmoothScroller.serializer;
                    if (i75 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj80);
                        AudioAttributesImplBase audioAttributesImplBase9 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase9 instanceof AudioAttributesImplApi21Parcelizer) {
                            obj12 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase9).serializer;
                        } else if (audioAttributesImplBase9 instanceof AudioAttributesImplApi21) {
                            obj12 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        Object obj82 = obj12 instanceof accept ? obj12 : null;
                        linearSmoothScroller.serializer = 1;
                        return flowCollector.emit((accept) obj82, linearSmoothScroller) == obj81 ? obj81 : createfromparcel;
                    }
                    if (i75 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj80);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 26:
                    if (shortNewsContentCardView instanceof ApiHelperForM1) {
                        apiHelperForM1 = (ApiHelperForM1) shortNewsContentCardView;
                        int i76 = apiHelperForM1.RemoteActionCompatParcelizer;
                        if ((i76 & Integer.MIN_VALUE) != 0) {
                            apiHelperForM1.RemoteActionCompatParcelizer = i76 - Integer.MIN_VALUE;
                        } else {
                            apiHelperForM1 = new ApiHelperForM1(this, shortNewsContentCardView);
                        }
                    } else {
                        apiHelperForM1 = new ApiHelperForM1(this, shortNewsContentCardView);
                    }
                    Object obj83 = apiHelperForM1.IconCompatParcelizer;
                    Object obj84 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i77 = apiHelperForM1.RemoteActionCompatParcelizer;
                    if (i77 != 0) {
                        if (i77 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj83);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj83);
                    Object obj85 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj85 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup43 = (AndroidPopup_androidKtPopup41) obj85;
                        obj85 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) (androidPopup_androidKtPopup43 instanceof AndroidView_androidKtcreateAndroidViewNodeFactory11 ? androidPopup_androidKtPopup43 : null);
                    }
                    Object onitemdismiss3 = new onItemDismiss(obj85);
                    apiHelperForM1.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(onitemdismiss3, apiHelperForM1) == obj84 ? obj84 : createfromparcel;
                case 27:
                    if (shortNewsContentCardView instanceof ApiHelperForM2) {
                        apiHelperForM2 = (ApiHelperForM2) shortNewsContentCardView;
                        int i78 = apiHelperForM2.RemoteActionCompatParcelizer;
                        if ((i78 & Integer.MIN_VALUE) != 0) {
                            apiHelperForM2.RemoteActionCompatParcelizer = i78 - Integer.MIN_VALUE;
                        } else {
                            apiHelperForM2 = new ApiHelperForM2(this, shortNewsContentCardView);
                        }
                    } else {
                        apiHelperForM2 = new ApiHelperForM2(this, shortNewsContentCardView);
                    }
                    Object obj86 = apiHelperForM2.read;
                    Object obj87 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i79 = apiHelperForM2.RemoteActionCompatParcelizer;
                    if (i79 != 0) {
                        if (i79 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj86);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj86);
                    Object obj88 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj88 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup44 = (AndroidPopup_androidKtPopup41) obj88;
                        obj88 = (AndroidPopup_androidKtLocalIsInPopupLayout1) (androidPopup_androidKtPopup44 instanceof AndroidPopup_androidKtLocalIsInPopupLayout1 ? androidPopup_androidKtPopup44 : null);
                    }
                    Object onitemdismiss4 = new onItemDismiss(obj88);
                    apiHelperForM2.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(onitemdismiss4, apiHelperForM2) == obj87 ? obj87 : createfromparcel;
                case 28:
                    return emit$com$roadrunner$location$toggle$domain$GetOfflineLocationRequestStateImpl$invoke$$inlined$map$1$2(obj, shortNewsContentCardView);
                default:
                    if (shortNewsContentCardView instanceof BaseTransacterImplnotifyQueries2) {
                        baseTransacterImplnotifyQueries2 = (BaseTransacterImplnotifyQueries2) shortNewsContentCardView;
                        int i80 = baseTransacterImplnotifyQueries2.IconCompatParcelizer;
                        if ((i80 & Integer.MIN_VALUE) != 0) {
                            baseTransacterImplnotifyQueries2.IconCompatParcelizer = i80 - Integer.MIN_VALUE;
                        } else {
                            baseTransacterImplnotifyQueries2 = new BaseTransacterImplnotifyQueries2(this, shortNewsContentCardView);
                        }
                    } else {
                        baseTransacterImplnotifyQueries2 = new BaseTransacterImplnotifyQueries2(this, shortNewsContentCardView);
                    }
                    Object obj89 = baseTransacterImplnotifyQueries2.read;
                    Object obj90 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i81 = baseTransacterImplnotifyQueries2.IconCompatParcelizer;
                    if (i81 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj89);
                        switch (BaseTransacterImplnotifyQueries1.RemoteActionCompatParcelizer[((getFailureResponseData) obj).RemoteActionCompatParcelizer.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                obj13 = WebViewRenderProcessClientFrameworkAdapter.STOP;
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                obj13 = WebViewRenderProcessClientFrameworkAdapter.RESUME;
                                break;
                            default:
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                break;
                        }
                        baseTransacterImplnotifyQueries2.IconCompatParcelizer = 1;
                        return flowCollector.emit(obj13, baseTransacterImplnotifyQueries2) == obj90 ? obj90 : createfromparcel;
                    }
                    if (i81 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj89);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    public /* synthetic */ ObserveDivider$invoke$$inlined$map$1(Flow flow, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Flow flow = this.IconCompatParcelizer;
        int i3 = 0;
        int i4 = 17;
        int i5 = 15;
        Object obj = null;
        switch (i2) {
            case 0:
                Object objCollect = ((ObserveDivider$invoke$$inlined$extractValue$1) flow).collect(new AnonymousClass2(flowCollector, i3), shortNewsContentCardView);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i6 = read + 123;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return objCollect;
            case 1:
                Object objCollect2 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i5), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 2:
                Object objCollect3 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i4), shortNewsContentCardView);
                if (objCollect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i8 = serializer + 31;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return objCollect3;
            case 3:
                Object objCollect4 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i3), shortNewsContentCardView);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : createfromparcel;
            case 4:
                Object objCollect5 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 21), shortNewsContentCardView);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : createfromparcel;
            case 5:
                Object objCollect6 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 23), shortNewsContentCardView);
                if (objCollect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i10 = read + 19;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return objCollect6;
                }
                throw null;
            case 6:
                Object objCollect7 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 12), shortNewsContentCardView);
                if (objCollect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i11 = read + 117;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return objCollect7;
                }
                obj.hashCode();
                throw null;
            case 7:
                Object objCollect8 = ((ObserveImageSharingUiState$invoke$$inlined$map$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 14), shortNewsContentCardView);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : createfromparcel;
            case 8:
                Object objCollect9 = ((ChannelFlowTransformLatest) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, i5), shortNewsContentCardView);
                if (objCollect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i12 = serializer;
                int i13 = i12 + 17;
                read = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i14 = i12 + 95;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return objCollect9;
            case 9:
                Object objCollect10 = ((FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 16), shortNewsContentCardView);
                if (objCollect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i16 = serializer + 57;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                return objCollect10;
            case 10:
                Object objCollect11 = ((SignInDataStore$get$$inlined$map$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, i4), shortNewsContentCardView);
                if (objCollect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i18 = serializer + 19;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return objCollect11;
            case 11:
                Object objCollect12 = ((ObserveDivider$invoke$$inlined$map$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 22), shortNewsContentCardView);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : createfromparcel;
            default:
                Object objCollect13 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new AnonymousClass2(flowCollector, 10), shortNewsContentCardView);
                if (objCollect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i20 = read + 15;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                return objCollect13;
        }
    }
}
