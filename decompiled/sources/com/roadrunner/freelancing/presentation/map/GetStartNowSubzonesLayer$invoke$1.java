package com.roadrunner.freelancing.presentation.map;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.f9;
import o.getNotificationChannels;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.se;
import o.t2ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class GetStartNowSubzonesLayer$invoke$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public int IconCompatParcelizer;
    public /* synthetic */ getNotificationChannels RemoteActionCompatParcelizer;
    public /* synthetic */ Integer read;
    public /* synthetic */ se serializer;
    public final /* synthetic */ WorkerWrapper.Builder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStartNowSubzonesLayer$invoke$1(WorkerWrapper.Builder builder, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.write = builder;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        int i = 2 % 2;
        GetStartNowSubzonesLayer$invoke$1 getStartNowSubzonesLayer$invoke$1 = new GetStartNowSubzonesLayer$invoke$1(this.write, (ShortNewsContentCardView) obj4);
        getStartNowSubzonesLayer$invoke$1.serializer = (se) obj;
        getStartNowSubzonesLayer$invoke$1.RemoteActionCompatParcelizer = (getNotificationChannels) obj2;
        getStartNowSubzonesLayer$invoke$1.read = (Integer) obj3;
        Object objInvokeSuspend = getStartNowSubzonesLayer$invoke$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaMetadataCompat + 3;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 13;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        se seVar = this.serializer;
        getNotificationChannels getnotificationchannels = this.RemoteActionCompatParcelizer;
        Integer num = this.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.IconCompatParcelizer;
        if (i3 != 0) {
            int i4 = MediaDescriptionCompat + 91;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Collection collectionValues = seVar.RemoteActionCompatParcelizer.values();
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                list = instance_delegatelambda0.write;
                if (!zHasNext) {
                    break;
                }
                List list2 = ((t2ExternalSyntheticLambda1) it.next()).RatingCompat;
                if (list2 != null) {
                    list = list2;
                }
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) list, (Collection) arrayList);
            }
            if (arrayList.isEmpty()) {
                return new f9(list);
            }
            this.serializer = null;
            this.RemoteActionCompatParcelizer = null;
            this.read = null;
            this.IconCompatParcelizer = 1;
            obj = WorkerWrapper.Builder.access$produceMapLayer(this.write, arrayList, getnotificationchannels, num, this);
            if (obj == coroutineSingletons2) {
                int i5 = MediaDescriptionCompat + 21;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineSingletons2;
            }
        }
        return (f9) obj;
    }
}
