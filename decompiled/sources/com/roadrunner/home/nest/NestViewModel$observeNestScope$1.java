package com.roadrunner.home.nest;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getFailureResponseData;
import o.getRouternavigation_release;
import o.getSources;
import o.onItemDismiss;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NestViewModel$observeNestScope$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ getRouternavigation_release RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX INFO: renamed from: com.roadrunner.home.nest.NestViewModel$observeNestScope$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        private static int read = 1;
        private static int write;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int serializer;

        public /* synthetic */ AnonymousClass1(int i, Object obj) {
            this.serializer = i;
            this.RemoteActionCompatParcelizer = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0327, code lost:
        
            r3.IconCompatParcelizer(new o.getYD9Ej5fM(r1));
            r1 = r7.serializer;
            r3 = r4.qrPaymentDetails;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0333, code lost:
        
            if (r3 == null) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0335, code lost:
        
            r4 = r3.value;
            r3 = o.getWidthD9Ej5fM.IconCompatParcelizer[r3.type.ordinal()];
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0341, code lost:
        
            if (r3 == 1) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0343, code lost:
        
            r5 = com.roadrunner.home.nest.NestViewModel$observeNestScope$1.AnonymousClass1.write + 11;
            com.roadrunner.home.nest.NestViewModel$observeNestScope$1.AnonymousClass1.read = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x034c, code lost:
        
            if ((r5 % 2) != 0) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x034e, code lost:
        
            if (r3 != 4) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0351, code lost:
        
            if (r3 != 2) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0353, code lost:
        
            r3 = new o.getXD9Ej5fMannotations(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0359, code lost:
        
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x035e, code lost:
        
            r3 = new o.copytPigGR8(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0364, code lost:
        
            timber.log.Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("QrPaymentScreenViewModel: No QR code data available", new java.lang.Object[0]);
            r3 = o.copytPigGR8default.RemoteActionCompatParcelizer;
            r4 = com.roadrunner.home.nest.NestViewModel$observeNestScope$1.AnonymousClass1.read + 17;
            com.roadrunner.home.nest.NestViewModel$observeNestScope$1.AnonymousClass1.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0378, code lost:
        
            r1.IconCompatParcelizer(r3);
            r1 = r7.ParcelableVolumeInfo.read();
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0383, code lost:
        
            if ((r1 instanceof o.getYD9Ej5fM) == false) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0385, code lost:
        
            r1 = (o.getYD9Ej5fM) r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0388, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0389, code lost:
        
            if (r1 == null) goto L119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x038b, code lost:
        
            r13 = r1.IconCompatParcelizer;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x038d, code lost:
        
            if (r13 == null) goto L241;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x038f, code lost:
        
            r1 = r13.qrCode;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0391, code lost:
        
            if (r1 == null) goto L242;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0393, code lost:
        
            r3 = com.roadrunner.home.nest.NestViewModel$observeNestScope$1.AnonymousClass1.read + 85;
            com.roadrunner.home.nest.NestViewModel$observeNestScope$1.AnonymousClass1.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r3 = r3 % 2;
            r1 = r1.qrPaymentScreen;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x039e, code lost:
        
            if (r1 == null) goto L243;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x03a0, code lost:
        
            r1 = r1.trackingEvents;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x03a2, code lost:
        
            if (r1 == null) goto L244;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x03a4, code lost:
        
            r2 = r7.MediaSessionCompatQueueItem;
            r2.getClass();
            r2.read(r1, com.roadrunner.delivery.state.Trigger.SCREEN_OPENED);
         */
        /* JADX WARN: Code restructure failed: missing block: B:240:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:241:?, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:245:?, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x031d, code lost:
        
            if (r4 == null) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0323, code lost:
        
            if (r4 == null) goto L127;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [o.ShortNewsContentCardView] */
        /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r3v9, types: [kotlinx.coroutines.flow.MutableStateFlow] */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r22, o.ShortNewsContentCardView r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.NestViewModel$observeNestScope$1.AnonymousClass1.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NestViewModel$observeNestScope$1(getRouternavigation_release getrouternavigation_release, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = getrouternavigation_release;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 99;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.serializer;
        getRouternavigation_release getrouternavigation_release = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            return i4 != 1 ? new NestViewModel$observeNestScope$1(getrouternavigation_release, shortNewsContentCardView, i) : new NestViewModel$observeNestScope$1(getrouternavigation_release, shortNewsContentCardView, 1);
        }
        NestViewModel$observeNestScope$1 nestViewModel$observeNestScope$1 = new NestViewModel$observeNestScope$1(getrouternavigation_release, shortNewsContentCardView, 0);
        int i5 = IconCompatParcelizer + 93;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return nestViewModel$observeNestScope$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 25;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            return ((NestViewModel$observeNestScope$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((NestViewModel$observeNestScope$1) create((getFailureResponseData) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((NestViewModel$observeNestScope$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 33;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM4967loadIoAF18A;
        int i;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getRouternavigation_release getrouternavigation_release = this.RemoteActionCompatParcelizer;
        int i4 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i5 = 1;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.write;
            if (i6 != 0) {
                int i7 = IconCompatParcelizer + 81;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i6 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SignInDataStore signInDataStore = getrouternavigation_release.read;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) getrouternavigation_release.RatingCompat.MediaSessionCompatResultReceiverWrapper();
            signInDataStore.getClass();
            getcontentviewgroupparentlayout.getClass();
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new GetNestScope$invoke$3(signInDataStore, shortNewsContentCardView, i4), new GetNestScope$invoke$$inlined$map$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new HomeViewModel.AnonymousClass1(signInDataStore, shortNewsContentCardView, 15), ((NestComponentRepositoryImpl) signInDataStore.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer), getcontentviewgroupparentlayout, signInDataStore, i4));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(i4, getrouternavigation_release);
            this.write = 1;
            return flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i3 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.write;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowSerializer = FlowKt.serializer(getrouternavigation_release.serializer.IconCompatParcelizer());
                NestViewModel$observeNestScope$1 nestViewModel$observeNestScope$1 = new NestViewModel$observeNestScope$1(getrouternavigation_release, shortNewsContentCardView, i5);
                this.write = 1;
                if (FlowKt.collectLatest(flowSerializer, nestViewModel$observeNestScope$1, this) != coroutineSingletons2) {
                    return createfromparcel;
                }
                int i10 = read + 21;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 88 / 0;
                }
                return coroutineSingletons2;
            }
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i12 = IconCompatParcelizer + 19;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 4 / 2;
                }
                return null;
            }
            int i14 = IconCompatParcelizer + 31;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i15 = 76 / 0;
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.write;
        if (i16 != 0) {
            int i17 = IconCompatParcelizer + 47;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (i16 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4967loadIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            NestComponentRepositoryImpl nestComponentRepositoryImpl = getrouternavigation_release.MediaDescriptionCompat;
            this.write = 1;
            objM4967loadIoAF18A = nestComponentRepositoryImpl.m4967loadIoAF18A(this);
            if (objM4967loadIoAF18A == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4967loadIoAF18A);
        if (thSerializer == null) {
            return createfromparcel;
        }
        Timber.RemoteActionCompatParcelizer.write(new Throwable("Failed to load nest components from BE", thSerializer));
        String str = getrouternavigation_release.MediaSessionCompatQueueItem.read(thSerializer);
        MutableStateFlow mutableStateFlow = getrouternavigation_release.write;
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(thSerializer)) {
            int i19 = IconCompatParcelizer + 29;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            i = R.drawable.img_medium_brand_no_connection;
        } else {
            i = R.drawable.img_medium_brand_fail;
        }
        mutableStateFlow.IconCompatParcelizer(new getSources(i, str));
        return createfromparcel;
    }
}
