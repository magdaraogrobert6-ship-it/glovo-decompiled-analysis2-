package com.roadrunner.delivery.pickupdropoff.details.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.time.Instant;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.initlambda20;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ PickUpDropOffDetailsUiModelImpl read;
    public final /* synthetic */ Instant serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1(PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl, Instant instant, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = pickUpDropOffDetailsUiModelImpl;
        this.serializer = instant;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return new com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1(r3, r2, r7, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r0 = new com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1(r3, r2, r7, r1);
        r7 = com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1.MediaMetadataCompat + 121;
        com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1.write = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ((r7 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0 != 0) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r6, o.ShortNewsContentCardView r7) {
        /*
            r5 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1.write
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1.MediaMetadataCompat = r1
            int r0 = r0 % r6
            r1 = 0
            if (r0 != 0) goto L1b
            int r0 = r5.IconCompatParcelizer
            java.time.Instant r2 = r5.serializer
            com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl r3 = r5.read
            r4 = 60
            int r4 = r4 / r1
            if (r0 == 0) goto L2a
            goto L23
        L1b:
            int r0 = r5.IconCompatParcelizer
            java.time.Instant r2 = r5.serializer
            com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl r3 = r5.read
            if (r0 == 0) goto L2a
        L23:
            com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1 r6 = new com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1
            r0 = 1
            r6.<init>(r3, r2, r7, r0)
            return r6
        L2a:
            com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1 r0 = new com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1
            r0.<init>(r3, r2, r7, r1)
            int r7 = com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1.MediaMetadataCompat
            int r7 = r7 + 121
            int r1 = r7 % 128
            com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1.write = r1
            int r7 = r7 % r6
            if (r7 != 0) goto L3b
            return r0
        L3b:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 69;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = write + 45;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Instant instant = this.serializer;
        PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = this.read;
        Object obj2 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowRemoteActionCompatParcelizer = pickUpDropOffDetailsUiModelImpl.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(instant);
                PickUpDropOffDetailsUiModelImpl$refreshState$1 pickUpDropOffDetailsUiModelImpl$refreshState$1 = new PickUpDropOffDetailsUiModelImpl$refreshState$1(pickUpDropOffDetailsUiModelImpl, null, 2);
                this.RemoteActionCompatParcelizer = 1;
                return FlowKt.collectLatest(flowRemoteActionCompatParcelizer, pickUpDropOffDetailsUiModelImpl$refreshState$1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            int i4 = write + 119;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            initlambda20 initlambda20Var = pickUpDropOffDetailsUiModelImpl.PlaybackStateCompatCustomAction;
            instant.getClass();
            Flow flowRemoteActionCompatParcelizer2 = initlambda20Var.RemoteActionCompatParcelizer(instant);
            PickUpDropOffDetailsUiModelImpl$refreshState$1 pickUpDropOffDetailsUiModelImpl$refreshState$2 = new PickUpDropOffDetailsUiModelImpl$refreshState$1(pickUpDropOffDetailsUiModelImpl, null, 1);
            this.RemoteActionCompatParcelizer = 1;
            if (FlowKt.collectLatest(flowRemoteActionCompatParcelizer2, pickUpDropOffDetailsUiModelImpl$refreshState$2, this) != coroutineSingletons2) {
                return createfromparcel;
            }
            int i6 = MediaMetadataCompat + 43;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return coroutineSingletons2;
        }
        int i8 = write;
        int i9 = i8 + 57;
        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i11 = i8 + 9;
        MediaMetadataCompat = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        obj2.hashCode();
        throw null;
    }
}
