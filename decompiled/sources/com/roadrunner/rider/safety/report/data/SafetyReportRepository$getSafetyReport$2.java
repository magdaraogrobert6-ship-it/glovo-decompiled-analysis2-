package com.roadrunner.rider.safety.report.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.sentiance.core.model.events.C$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getInstallBeginTimeServerInSeconds;
import o.r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdax7886zsaIYvPM4CylL7YklZd7ig;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class SafetyReportRepository$getSafetyReport$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SafetyReportRepository$getSafetyReport$2(Object obj, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.serializer = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i2 == 0) {
            Object objInvokeSuspend = ((SafetyReportRepository$getSafetyReport$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = IconCompatParcelizer + 17;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        if (i2 != 1) {
            return ((SafetyReportRepository$getSafetyReport$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend2 = ((SafetyReportRepository$getSafetyReport$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaSessionCompatQueueItem + 81;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 1;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj = this.write;
        if (i4 != 0) {
            return i4 != 1 ? new SafetyReportRepository$getSafetyReport$2((FormBody.Builder) obj, this.serializer, shortNewsContentCardView, 2) : new SafetyReportRepository$getSafetyReport$2((ConfirmationRepository) obj, this.serializer, shortNewsContentCardView, 1);
        }
        SafetyReportRepository$getSafetyReport$2 safetyReportRepository$getSafetyReport$2 = new SafetyReportRepository$getSafetyReport$2((C$b) obj, this.serializer, shortNewsContentCardView, 0);
        int i5 = MediaSessionCompatQueueItem + 125;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return safetyReportRepository$getSafetyReport$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 63;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        long j = this.serializer;
        Object obj2 = this.write;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.read;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getInstallBeginTimeServerInSeconds getinstallbegintimeserverinseconds = (getInstallBeginTimeServerInSeconds) ((C$b) obj2).serializer;
            this.read = 1;
            Object objSerializer = getinstallbegintimeserverinseconds.serializer(j, this);
            if (objSerializer != coroutineSingletons) {
                return objSerializer;
            }
            int i6 = MediaSessionCompatQueueItem + 105;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.read;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c r8lambdao8cxgyaejdvf6qoo3mkjzsui8c = ((ConfirmationRepository) obj2).RemoteActionCompatParcelizer;
                this.read = 1;
                Object objWrite = r8lambdao8cxgyaejdvf6qoo3mkjzsui8c.write(j, this);
                return objWrite == coroutineSingletons2 ? coroutineSingletons2 : objWrite;
            }
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = IconCompatParcelizer + 79;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i9 = 26 / 0;
            return obj;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.read;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdax7886zsaIYvPM4CylL7YklZd7ig r8lambdax7886zsaiyvpm4cyll7yklzd7ig = (r8lambdax7886zsaIYvPM4CylL7YklZd7ig) ((FormBody.Builder) obj2).serializer;
            this.read = 1;
            obj = r8lambdax7886zsaiyvpm4cyll7yklzd7ig.serializer(j, this);
            if (obj == coroutineSingletons3) {
                int i11 = IconCompatParcelizer + 75;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    throw null;
                }
                obj = coroutineSingletons3;
            }
        } else if (i10 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i12 = IconCompatParcelizer + 13;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj = null;
        }
        int i14 = IconCompatParcelizer + 45;
        MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return obj;
    }
}
