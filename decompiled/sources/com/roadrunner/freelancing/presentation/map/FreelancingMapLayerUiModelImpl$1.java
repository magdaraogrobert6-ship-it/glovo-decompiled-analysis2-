package com.roadrunner.freelancing.presentation.map;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.f9;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getRootStableInsets;
import o.hf;
import o.instance_delegatelambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setSystemUiVisibility;
import o.setTypeBoundingRectsMap;

/* JADX INFO: loaded from: classes3.dex */
public final class FreelancingMapLayerUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ setSystemUiVisibility IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FreelancingMapLayerUiModelImpl$1(setSystemUiVisibility setsystemuivisibility, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = setsystemuivisibility;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r0 = new com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1(r2, r6, r1);
        r6 = com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.serializer + 27;
        com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.read = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r0 = new com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1(r2, r6, 1);
        r6 = com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.read + 17;
        com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.serializer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r5, o.ShortNewsContentCardView r6) {
        /*
            r4 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.serializer
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.read = r1
            int r0 = r0 % r5
            r1 = 0
            if (r0 == 0) goto L19
            int r0 = r4.RemoteActionCompatParcelizer
            o.setSystemUiVisibility r2 = r4.IconCompatParcelizer
            r3 = 23
            int r3 = r3 / r1
            if (r0 == 0) goto L2f
            goto L1f
        L19:
            int r0 = r4.RemoteActionCompatParcelizer
            o.setSystemUiVisibility r2 = r4.IconCompatParcelizer
            if (r0 == 0) goto L2f
        L1f:
            com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1 r0 = new com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1
            r1 = 1
            r0.<init>(r2, r6, r1)
            int r6 = com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.read
            int r6 = r6 + 17
            int r1 = r6 % 128
            com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.serializer = r1
            int r6 = r6 % r5
            return r0
        L2f:
            com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1 r0 = new com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1
            r0.<init>(r2, r6, r1)
            int r6 = com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.serializer
            int r6 = r6 + 27
            int r1 = r6 % 128
            com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.read = r1
            int r6 = r6 % r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 53;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((FreelancingMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((FreelancingMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 35;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 93;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        setSystemUiVisibility setsystemuivisibility = this.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i5 = 1;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.write;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedFlowImpl sharedFlowImpl = ((hf) setsystemuivisibility.MediaMetadataCompat).MediaDescriptionCompat;
                setTypeBoundingRectsMap settypeboundingrectsmap = new setTypeBoundingRectsMap(setsystemuivisibility, i5);
                this.write = 1;
                sharedFlowImpl.getClass();
                if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, settypeboundingrectsmap, this) == coroutineSingletons) {
                    int i7 = serializer + 21;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.write;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getRootStableInsets getrootstableinsets = setsystemuivisibility.read;
            Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getrootstableinsets.serializer.read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue() ? new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new f9(instance_delegatelambda0.write)) : FlowKt.RemoteActionCompatParcelizer(getrootstableinsets.PlaybackStateCompatCustomAction.write, new SharedSessionRepositoryImpl.AnonymousClass1.C00161(shortNewsContentCardView, getrootstableinsets, 3));
            setTypeBoundingRectsMap settypeboundingrectsmap2 = new setTypeBoundingRectsMap(setsystemuivisibility, 0);
            this.write = 1;
            if (flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2.collect(settypeboundingrectsmap2, this) == coroutineSingletons2) {
                int i10 = read;
                int i11 = i10 + 31;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                int i13 = i10 + 107;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    int i14 = 2 / 2;
                }
                return coroutineSingletons2;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i15 = serializer + 23;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
