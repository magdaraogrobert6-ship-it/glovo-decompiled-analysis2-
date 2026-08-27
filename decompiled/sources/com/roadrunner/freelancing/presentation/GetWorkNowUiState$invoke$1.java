package com.roadrunner.freelancing.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Person;
import o.RemoteActionCompat;
import o.ShortNewsContentCardView;
import o.computeHorizontalScrollOffset;
import o.constructCompatStyleForBundle;
import o.createFromParcel;
import o.extractStyleFromNotification;
import o.getGpsAdid;
import o.getNotificationChannelsCompat;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.sc;

/* JADX INFO: loaded from: classes3.dex */
public final class GetWorkNowUiState$invoke$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public /* synthetic */ sc IconCompatParcelizer;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public /* synthetic */ Person serializer;
    public final /* synthetic */ computeHorizontalScrollOffset write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWorkNowUiState$invoke$1(computeHorizontalScrollOffset computehorizontalscrolloffset, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.write = computehorizontalscrolloffset;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        GetWorkNowUiState$invoke$1 getWorkNowUiState$invoke$1 = new GetWorkNowUiState$invoke$1(this.write, (ShortNewsContentCardView) obj4);
        getWorkNowUiState$invoke$1.IconCompatParcelizer = (sc) obj;
        getWorkNowUiState$invoke$1.serializer = (Person) obj2;
        getWorkNowUiState$invoke$1.RemoteActionCompatParcelizer = zBooleanValue;
        Object objInvokeSuspend = getWorkNowUiState$invoke$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaMetadataCompat + 109;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getGpsAdid getgpsadid;
        int i = 2 % 2;
        sc scVar = this.IconCompatParcelizer;
        Person person = this.serializer;
        boolean z = this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!z) {
            int i2 = read + 45;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 3;
            }
        } else if (scVar != sc.START_NOW) {
            int i4 = MediaMetadataCompat + 51;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
        } else if (!(person instanceof getNotificationChannelsCompat)) {
            if (!(person instanceof RemoteActionCompat)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            RemoteActionCompat remoteActionCompat = (RemoteActionCompat) person;
            if (remoteActionCompat.read && (getgpsadid = remoteActionCompat.RemoteActionCompatParcelizer) != null) {
                return new constructCompatStyleForBundle(getgpsadid.read, getgpsadid.MediaDescriptionCompat, getgpsadid.MediaMetadataCompat.IconCompatParcelizer, this.write.MediaDescriptionCompat.IconCompatParcelizer(R.string.freelancing_work_now_button), getgpsadid.IconCompatParcelizer);
            }
        }
        return extractStyleFromNotification.read;
    }
}
