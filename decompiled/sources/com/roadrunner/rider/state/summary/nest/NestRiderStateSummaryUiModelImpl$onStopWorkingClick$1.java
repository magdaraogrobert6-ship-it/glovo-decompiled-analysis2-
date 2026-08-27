package com.roadrunner.rider.state.summary.nest;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.breakrequest.domain.SendBreakRequestUseCaseImpl;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.SdkClickHandler4;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.saveInteger;
import o.setOnSessionTrackingFailedListener;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final /* synthetic */ saveInteger IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1(saveInteger saveinteger, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = saveinteger;
        this.read = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return new com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1(r4.IconCompatParcelizer, r4.read, r6, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r3 = new com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1(r4.IconCompatParcelizer, r4.read, r6, r1);
        r6 = com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1.write + 23;
        com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1.MediaMetadataCompat = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ((r6 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r5 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.RemoteActionCompatParcelizer != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.RemoteActionCompatParcelizer != 0) goto L9;
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
            int r0 = com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1.write
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1.MediaMetadataCompat = r1
            int r0 = r0 % r5
            r1 = 0
            if (r0 != 0) goto L17
            int r0 = r4.RemoteActionCompatParcelizer
            r2 = 41
            int r2 = r2 / r1
            if (r0 == 0) goto L26
            goto L1b
        L17:
            int r0 = r4.RemoteActionCompatParcelizer
            if (r0 == 0) goto L26
        L1b:
            boolean r5 = r4.read
            o.saveInteger r0 = r4.IconCompatParcelizer
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1 r1 = new com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1
            r2 = 1
            r1.<init>(r0, r5, r6, r2)
            return r1
        L26:
            boolean r0 = r4.read
            o.saveInteger r2 = r4.IconCompatParcelizer
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1 r3 = new com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1
            r3.<init>(r2, r0, r6, r1)
            int r6 = com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1.write
            int r6 = r6 + 23
            int r0 = r6 % 128
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1.MediaMetadataCompat = r0
            int r6 = r6 % r5
            if (r6 != 0) goto L3d
            r5 = 26
            int r5 = r5 / r1
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 != 0) {
            Object objInvokeSuspend = ((NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = write + 29;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaMetadataCompat + 27;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return objInvokeSuspend2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM5071invokeIoAF18A;
        Object objM5025invokegIAlus;
        int i = 2 % 2;
        int i2 = write + 59;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = this.read;
        saveInteger saveinteger = this.IconCompatParcelizer;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.serializer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                saveInteger.read(saveinteger, false);
                StopWorkingUseCaseImpl stopWorkingUseCaseImpl = saveinteger.MediaSessionCompatResultReceiverWrapper;
                this.serializer = 1;
                objM5071invokeIoAF18A = stopWorkingUseCaseImpl.m5071invokeIoAF18A(this);
                if (objM5071invokeIoAF18A == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5071invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
            }
            if (!(objM5071invokeIoAF18A instanceof isItemDismissable)) {
                if (z) {
                    FormBody.Builder builder = saveinteger.MediaSessionCompatQueueItem;
                    Map mapSingletonMap = Collections.singletonMap("screen_name", "nest");
                    mapSingletonMap.getClass();
                    builder.RemoteActionCompatParcelizer("stop_working_clicked", mapSingletonMap);
                }
                saveinteger.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(setOnSessionTrackingFailedListener.OTHER);
            }
            Throwable thSerializer = onItemDismiss.serializer(objM5071invokeIoAF18A);
            if (thSerializer == null) {
                return createfromparcel;
            }
            saveInteger.read(saveinteger, true);
            saveinteger.MediaSessionCompatToken.serializer(new SdkClickHandler4(saveinteger.MediaMetadataCompat.read(thSerializer)));
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.serializer;
        if (i6 != 0) {
            int i7 = MediaMetadataCompat + 47;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? i6 != 1 : i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5025invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            saveInteger.read(saveinteger, false);
            SendBreakRequestUseCaseImpl sendBreakRequestUseCaseImpl = saveinteger.PlaybackStateCompatCustomAction;
            this.serializer = 1;
            objM5025invokegIAlus = sendBreakRequestUseCaseImpl.m5025invokegIAlus("UNTIL_END_OF_SHIFT", this);
            if (objM5025invokegIAlus == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        }
        if (!(objM5025invokegIAlus instanceof isItemDismissable)) {
            if (z) {
                int i8 = MediaMetadataCompat + 99;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                FormBody.Builder builder2 = saveinteger.MediaSessionCompatQueueItem;
                Map mapSingletonMap2 = Collections.singletonMap("screen_name", "nest");
                mapSingletonMap2.getClass();
                builder2.RemoteActionCompatParcelizer("pause_shift_clicked", mapSingletonMap2);
            }
            saveinteger.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(setOnSessionTrackingFailedListener.OTHER);
        }
        Throwable thSerializer2 = onItemDismiss.serializer(objM5025invokegIAlus);
        if (thSerializer2 == null) {
            return createfromparcel;
        }
        saveInteger.read(saveinteger, true);
        saveinteger.MediaSessionCompatToken.serializer(new SdkClickHandler4(saveinteger.MediaMetadataCompat.read(thSerializer2)));
        return createfromparcel;
    }
}
