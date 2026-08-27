package androidx.work.impl.model;

import androidx.compose.ui.graphics.Fields;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import com.roadrunner.freelancing.domain.HasWorkNowOpportunityImpl$invoke$$inlined$map$1;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.opportunities.data.OpportunitiesRepository$get$$inlined$map$1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.AndroidPopup_androidKtPopup21invokeinlinedonDispose1;
import o.ComposableSingletonsAndroidPopup_androidKt;
import o.FontMuC2MFs;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.accessloadAsync;
import o.createFromParcel;
import o.getAndroidTypefaceStyleFO1MlWM;
import o.getMaxDialogHeightExcludingInsets;
import o.getPostalCodeExtended;
import o.getSettings;
import o.getTypefaceui_text;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onMove;
import o.setFitInsetsSides;
import o.timesmpE4wyQ;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpecDaoKt$dedup$$inlined$map$1 implements Flow {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int read = 1;
        private static int write;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, int i) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        private final Object emit$com$roadrunner$delivery$data$delivery$LegacyDeliveryRepository$getDeliveryStatusesFlow$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            getSettings getsettings;
            int i = 2 % 2;
            int i2 = write + 9;
            int i3 = i2 % Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            Object obj2 = null;
            if (shortNewsContentCardView instanceof getSettings) {
                int i5 = i3 + 13;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = ((getSettings) shortNewsContentCardView).RemoteActionCompatParcelizer;
                    obj2.hashCode();
                    throw null;
                }
                getsettings = (getSettings) shortNewsContentCardView;
                int i7 = getsettings.RemoteActionCompatParcelizer;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    getsettings.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
                } else {
                    getsettings = new getSettings(this, shortNewsContentCardView);
                }
            } else {
                getsettings = new getSettings(this, shortNewsContentCardView);
            }
            Object obj3 = getsettings.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = getsettings.RemoteActionCompatParcelizer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                Map map = ((timesmpE4wyQ) obj).write;
                getsettings.RemoteActionCompatParcelizer = 1;
                if (this.RemoteActionCompatParcelizer.emit(map, getsettings) == coroutineSingletons) {
                    int i9 = read + 53;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        return coroutineSingletons;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        private final Object emit$com$roadrunner$delivery$common$data$ChatAvailabilityManager$observeChatConfigAvailability$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            getAndroidTypefaceStyleFO1MlWM getandroidtypefacestylefo1mlwm;
            int i = 2 % 2;
            if (shortNewsContentCardView instanceof getAndroidTypefaceStyleFO1MlWM) {
                getandroidtypefacestylefo1mlwm = (getAndroidTypefaceStyleFO1MlWM) shortNewsContentCardView;
                int i2 = getandroidtypefacestylefo1mlwm.RemoteActionCompatParcelizer;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getandroidtypefacestylefo1mlwm.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                } else {
                    getandroidtypefacestylefo1mlwm = new getAndroidTypefaceStyleFO1MlWM(this, shortNewsContentCardView);
                }
            } else {
                getandroidtypefacestylefo1mlwm = new getAndroidTypefaceStyleFO1MlWM(this, shortNewsContentCardView);
            }
            Object obj2 = getandroidtypefacestylefo1mlwm.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = getandroidtypefacestylefo1mlwm.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                boolean zIsEmpty = ((List) obj).isEmpty();
                getandroidtypefacestylefo1mlwm.RemoteActionCompatParcelizer = 1;
                if (this.RemoteActionCompatParcelizer.emit(Boolean.valueOf(!zIsEmpty), getandroidtypefacestylefo1mlwm) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = write + 119;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i5 = write + 95;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        private final Object emit$com$roadrunner$delivery$common$data$ChatAvailabilityManager$observeIfShouldShowChatList$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            getTypefaceui_text gettypefaceui_text;
            int i = 2 % 2;
            if (shortNewsContentCardView instanceof getTypefaceui_text) {
                gettypefaceui_text = (getTypefaceui_text) shortNewsContentCardView;
                int i2 = gettypefaceui_text.read;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gettypefaceui_text.read = i2 - Integer.MIN_VALUE;
                } else {
                    gettypefaceui_text = new getTypefaceui_text(this, shortNewsContentCardView);
                }
            } else {
                gettypefaceui_text = new getTypefaceui_text(this, shortNewsContentCardView);
            }
            Object obj2 = gettypefaceui_text.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = gettypefaceui_text.read;
            if (i3 != 0) {
                int i4 = read + 111;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                boolean z = false;
                if (((List) obj).size() > 1) {
                    int i6 = write + 81;
                    int i7 = i6 % Fields.SpotShadowColor;
                    read = i7;
                    z = i6 % 2 != 0;
                    int i8 = i7 + 43;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
                gettypefaceui_text.read = 1;
                if (this.RemoteActionCompatParcelizer.emit(Boolean.valueOf(z), gettypefaceui_text) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0032  */
        private final Object emit$com$roadrunner$delivery$apis$ChatDeliveryRepositoryImpl$observeCustomerChatState$$inlined$externalComponent$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            accessloadAsync accessloadasync;
            int i = 2 % 2;
            int i2 = write + 21;
            read = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                boolean z = shortNewsContentCardView instanceof accessloadAsync;
                obj2.hashCode();
                throw null;
            }
            if (shortNewsContentCardView instanceof accessloadAsync) {
                accessloadasync = (accessloadAsync) shortNewsContentCardView;
                int i3 = accessloadasync.write;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    int i4 = read + 87;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        accessloadasync.write = i3 >> Integer.MIN_VALUE;
                    } else {
                        accessloadasync.write = i3 - Integer.MIN_VALUE;
                    }
                } else {
                    accessloadasync = new accessloadAsync(this, shortNewsContentCardView);
                }
            } else {
                accessloadasync = new accessloadAsync(this, shortNewsContentCardView);
            }
            Object obj3 = accessloadasync.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = accessloadasync.write;
            if (i5 != 0) {
                int i6 = write + 105;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                Object obj4 = ((onItemDismiss) obj).IconCompatParcelizer;
                if (obj4 instanceof isItemDismissable) {
                    obj2 = obj4;
                } else {
                    List list = (List) obj4;
                    if (list != null) {
                        Iterator it = list.iterator();
                        int i7 = read + 121;
                        write = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            int i8 = 3 % 3;
                        }
                        while (!(!it.hasNext())) {
                            int i9 = write + 23;
                            read = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                it.next();
                                throw null;
                            }
                            Object next = it.next();
                            if (next != null) {
                                int i10 = read + 15;
                                write = i10 % Fields.SpotShadowColor;
                                if (i10 % 2 != 0) {
                                    boolean z2 = next instanceof AndroidPopup_androidKtPopup21invokeinlinedonDispose1;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (next instanceof AndroidPopup_androidKtPopup21invokeinlinedonDispose1) {
                                }
                            }
                            obj2 = next;
                            break;
                        }
                        obj2 = (AndroidPopup_androidKtPopup21invokeinlinedonDispose1) obj2;
                    }
                }
                onItemDismiss onitemdismiss = new onItemDismiss(obj2);
                accessloadasync.write = 1;
                if (this.RemoteActionCompatParcelizer.emit(onitemdismiss, accessloadasync) == coroutineSingletons) {
                    int i11 = write + 117;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0031  */
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
        private final Object emit$com$roadrunner$delivery$analytics$StateV3AnalyticsProviderImpl$special$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            FontMuC2MFs fontMuC2MFs;
            Map linkedHashMap;
            ComposableSingletonsAndroidPopup_androidKt composableSingletonsAndroidPopup_androidKt;
            List list;
            int i = 2 % 2;
            int i2 = write + 45;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (shortNewsContentCardView instanceof FontMuC2MFs) {
                fontMuC2MFs = (FontMuC2MFs) shortNewsContentCardView;
                int i4 = fontMuC2MFs.read;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    int i5 = write + 125;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    fontMuC2MFs.read = i4 - Integer.MIN_VALUE;
                    int i7 = write + 61;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    fontMuC2MFs = new FontMuC2MFs(this, shortNewsContentCardView);
                }
            } else {
                fontMuC2MFs = new FontMuC2MFs(this, shortNewsContentCardView);
            }
            Object obj2 = fontMuC2MFs.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = fontMuC2MFs.read;
            Object obj3 = null;
            if (i9 != 0) {
                int i10 = write + 9;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0 ? i9 != 1 : i9 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                setFitInsetsSides setfitinsetssides = (setFitInsetsSides) obj;
                if (setfitinsetssides == null || (composableSingletonsAndroidPopup_androidKt = setfitinsetssides.analytics) == null || (list = composableSingletonsAndroidPopup_androidKt.parameters) == null) {
                    linkedHashMap = SimpleItemTouchHelperCallback.serializer;
                } else {
                    List<getMaxDialogHeightExcludingInsets> list2 = list;
                    int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list2, 10));
                    if (iRemoteActionCompatParcelizer < 16) {
                        iRemoteActionCompatParcelizer = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                    for (getMaxDialogHeightExcludingInsets getmaxdialogheightexcludinginsets : list2) {
                        linkedHashMap.put(getmaxdialogheightexcludinginsets.key, getmaxdialogheightexcludinginsets.value);
                    }
                }
                fontMuC2MFs.read = 1;
                if (this.RemoteActionCompatParcelizer.emit(linkedHashMap, fontMuC2MFs) == coroutineSingletons) {
                    int i11 = read + 21;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        return coroutineSingletons;
                    }
                    obj3.hashCode();
                    throw null;
                }
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:112:0x0228  */
        /* JADX WARN: Code duplicated, block: B:125:0x0253  */
        /* JADX WARN: Code duplicated, block: B:149:0x02ac  */
        /* JADX WARN: Code duplicated, block: B:182:0x0317  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:210:0x0383 A[PHI: r0 r3
  0x0383: PHI (r0v137 o.getMaximpl) = (r0v136 o.getMaximpl), (r0v139 o.getMaximpl) binds: [B:209:0x0381, B:206:0x0377] A[DONT_GENERATE, DONT_INLINE]
  0x0383: PHI (r3v38 int) = (r3v37 int), (r3v40 int) binds: [B:209:0x0381, B:206:0x0377] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:211:0x0387  */
        /* JADX WARN: Code duplicated, block: B:246:0x03f4  */
        /* JADX WARN: Code duplicated, block: B:273:0x045d  */
        /* JADX WARN: Code duplicated, block: B:306:0x04cb  */
        /* JADX WARN: Code duplicated, block: B:341:0x0550  */
        /* JADX WARN: Code duplicated, block: B:365:0x05b0  */
        /* JADX WARN: Code duplicated, block: B:398:0x068e  */
        /* JADX WARN: Code duplicated, block: B:43:0x009b  */
        /* JADX WARN: Code duplicated, block: B:453:0x07b3  */
        /* JADX WARN: Code duplicated, block: B:455:0x07d9  */
        /* JADX WARN: Code duplicated, block: B:456:0x07e7 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:457:0x07e9  */
        /* JADX WARN: Code duplicated, block: B:458:0x07f7  */
        /* JADX WARN: Code duplicated, block: B:470:0x0829  */
        /* JADX WARN: Code duplicated, block: B:486:0x0867  */
        /* JADX WARN: Code duplicated, block: B:487:0x0869 A[PHI: r1
  0x0869: PHI (r1v65 o.AndroidPopup_androidKtPopup41) = (r1v62 o.AndroidPopup_androidKtPopup41), (r1v66 o.AndroidPopup_androidKtPopup41) binds: [B:485:0x0865, B:482:0x085e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:499:0x0893  */
        /* JADX WARN: Code duplicated, block: B:532:0x0906  */
        /* JADX WARN: Code duplicated, block: B:556:0x095d  */
        /* JADX WARN: Code duplicated, block: B:577:0x09ab  */
        /* JADX WARN: Code duplicated, block: B:610:0x0a16  */
        /* JADX WARN: Code duplicated, block: B:634:0x0a75  */
        /* JADX WARN: Code duplicated, block: B:651:0x0abb  */
        /* JADX WARN: Code duplicated, block: B:668:0x0b01  */
        /* JADX WARN: Code duplicated, block: B:687:0x0b48  */
        /* JADX WARN: Code duplicated, block: B:68:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:719:0x0bba  */
        /* JADX WARN: Code duplicated, block: B:735:0x0c0b  */
        /* JADX WARN: Code duplicated, block: B:750:0x014f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0146  */
        /* JADX WARN: Code duplicated, block: B:95:0x0154 A[ADDED_TO_REGION] */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v26 java.lang.Object, still in use, count: 2, list:
              (r7v26 java.lang.Object) from 0x06ca: INSTANCE_OF (r7v26 java.lang.Object) A[WRAPPED] (LINE:1707) o.AndroidView_androidKtupdateViewHolderParams3
              (r7v26 java.lang.Object) from 0x06d0: PHI (r7 I:??) = (r7v23 java.lang.Object), (r7v26 java.lang.Object) binds: [B:415:0x06cf, B:784:0x06d0] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(java.lang.Object r28, o.ShortNewsContentCardView r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 3200
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }
    }

    public /* synthetic */ WorkSpecDaoKt$dedup$$inlined$map$1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.IconCompatParcelizer;
        int i3 = 25;
        int i4 = 17;
        int i5 = 6;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        int i6 = 0;
        switch (i2) {
            case 0:
                Object objCollect = ((FlowUtil$createFlow$$inlined$map$1) obj).collect(new AnonymousClass2(flowCollector, i6), shortNewsContentCardView);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i7 = write + 89;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objCollect;
            case 1:
                Flow[] flowArr = (Flow[]) obj;
                Object objCombineInternal = CombineKt.combineInternal(shortNewsContentCardView, new getPostalCodeExtended(1, flowArr), new WorkConstraintsTracker$track$$inlined$combine$1$3(3, i6, shortNewsContentCardView2), flowCollector, flowArr);
                return objCombineInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? objCombineInternal : createfromparcel;
            case 2:
                Object objCollect2 = ((StateProviderImpl$special$$inlined$map$2) obj).collect(new AnonymousClass2(flowCollector, i5), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 3:
                Object objCollect3 = ((StateProviderImpl$special$$inlined$map$2) obj).collect(new AnonymousClass2(flowCollector, 9), shortNewsContentCardView);
                if (objCollect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i9 = write + 51;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return objCollect3;
            case 4:
                Object objCollect4 = ((StateProviderImpl$special$$inlined$map$2) obj).collect(new AnonymousClass2(flowCollector, i4), shortNewsContentCardView);
                if (objCollect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i11 = write + 103;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return objCollect4;
                }
                shortNewsContentCardView2.hashCode();
                throw null;
            case 5:
                Object objCollect5 = ((StateProviderImpl$special$$inlined$map$2) obj).collect(new AnonymousClass2(flowCollector, i3), shortNewsContentCardView);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : createfromparcel;
            case 6:
                Object objCollect6 = ((HasWorkNowOpportunityImpl$invoke$$inlined$map$1) obj).collect(new AnonymousClass2(flowCollector, 29), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : createfromparcel;
            case 7:
                Object objCollect7 = ((StateProviderImpl$special$$inlined$map$2) obj).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, i5), shortNewsContentCardView);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : createfromparcel;
            case 8:
                Object objCollect8 = ((StateProviderImpl$special$$inlined$map$2) obj).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, 11), shortNewsContentCardView);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : createfromparcel;
            case 9:
                Object objCollect9 = ((HeatmapDataStore$get$$inlined$map$1) obj).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, i4), shortNewsContentCardView);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : createfromparcel;
            default:
                Object objCollect10 = ((OpportunitiesRepository$get$$inlined$map$1) obj).collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 4), shortNewsContentCardView);
                if (objCollect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i12 = read + 45;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 25 / 0;
                }
                return objCollect10;
        }
    }
}
