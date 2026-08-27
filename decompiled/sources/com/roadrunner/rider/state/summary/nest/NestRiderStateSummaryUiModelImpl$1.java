package com.roadrunner.rider.state.summary.nest;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.domain.StopWorkingImpl;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.SdkClickHandler4;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getDeeplinkClickTime;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.saveInteger;
import o.setOnSessionTrackingFailedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class NestRiderStateSummaryUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ saveInteger write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NestRiderStateSummaryUiModelImpl$1(saveInteger saveinteger, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = saveinteger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 121;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.read;
        saveInteger saveinteger = this.write;
        if (i4 != 0) {
            return i4 != 1 ? new NestRiderStateSummaryUiModelImpl$1(saveinteger, shortNewsContentCardView, i) : new NestRiderStateSummaryUiModelImpl$1(saveinteger, shortNewsContentCardView, 1);
        }
        NestRiderStateSummaryUiModelImpl$1 nestRiderStateSummaryUiModelImpl$1 = new NestRiderStateSummaryUiModelImpl$1(saveinteger, shortNewsContentCardView, 0);
        int i5 = serializer + 117;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return nestRiderStateSummaryUiModelImpl$1;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return ((com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return ((com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1.serializer
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L20
            int r1 = r5.read
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            r4 = 51
            int r4 = r4 / 0
            if (r1 == 0) goto L42
            if (r1 == r2) goto L37
            goto L2c
        L20:
            int r1 = r5.read
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            if (r1 == 0) goto L42
            if (r1 == r2) goto L37
        L2c:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1 r6 = (com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L37:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1 r6 = (com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L42:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1 r6 = (com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            int r7 = com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1.IconCompatParcelizer
            int r7 = r7 + 73
            int r1 = r7 % 128
            com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1.serializer = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L58
            return r6
        L58:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM5027invokeIoAF18A;
        Object objM4964invokeIoAF18A;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        saveInteger saveinteger = this.write;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getDeeplinkClickTime getdeeplinkclicktime = saveinteger.ParcelableVolumeInfo;
            MutableStateFlow mutableStateFlow = getdeeplinkclicktime.serializer.IconCompatParcelizer;
            RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(18, saveinteger);
            this.RemoteActionCompatParcelizer = 1;
            Object objCollect = mutableStateFlow.collect(new NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2(new GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2(new NestViewModel$updateConfiguration$1$1$1$1(anonymousClass1, 24, getdeeplinkclicktime), 17), "rider_state_summary", 0), this);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objCollect = createfromparcel;
            }
            if (objCollect != coroutineSingletons) {
                objCollect = createfromparcel;
            }
            if (objCollect != coroutineSingletons) {
                objCollect = createfromparcel;
            }
            if (objCollect != coroutineSingletons) {
                return createfromparcel;
            }
            int i4 = IconCompatParcelizer + 43;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return coroutineSingletons;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                saveInteger.read(saveinteger, false);
                EndBreakUseCaseImpl endBreakUseCaseImpl = saveinteger.MediaBrowserCompatMediaItem;
                this.RemoteActionCompatParcelizer = 1;
                objM5027invokeIoAF18A = endBreakUseCaseImpl.m5027invokeIoAF18A(this);
                if (objM5027invokeIoAF18A == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5027invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
                int i7 = serializer + 107;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            if (!(objM5027invokeIoAF18A instanceof isItemDismissable)) {
                saveinteger.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(setOnSessionTrackingFailedListener.OTHER);
            }
            Throwable thSerializer = onItemDismiss.serializer(objM5027invokeIoAF18A);
            if (thSerializer == null) {
                return createfromparcel;
            }
            saveInteger.read(saveinteger, true);
            saveinteger.MediaSessionCompatToken.serializer(new SdkClickHandler4(saveinteger.MediaMetadataCompat.read(thSerializer)));
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.RemoteActionCompatParcelizer;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StopWorkingImpl stopWorkingImpl = saveinteger.RatingCompat;
            this.RemoteActionCompatParcelizer = 1;
            objM4964invokeIoAF18A = stopWorkingImpl.m4964invokeIoAF18A(this);
            if (objM4964invokeIoAF18A == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = serializer + 15;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4964invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4964invokeIoAF18A instanceof isItemDismissable)) {
            saveinteger.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(setOnSessionTrackingFailedListener.OTHER);
        }
        Throwable thSerializer2 = onItemDismiss.serializer(objM4964invokeIoAF18A);
        if (thSerializer2 == null) {
            return createfromparcel;
        }
        saveinteger.MediaSessionCompatToken.serializer(new SdkClickHandler4(saveinteger.MediaMetadataCompat.read(thSerializer2)));
        return createfromparcel;
    }
}
