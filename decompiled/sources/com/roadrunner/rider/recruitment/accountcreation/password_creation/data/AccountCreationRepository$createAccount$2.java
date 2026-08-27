package com.roadrunner.rider.recruitment.accountcreation.password_creation.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.network.NetworkBody;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ActivityHandler19;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onResumeI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountCreationRepository$createAccount$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ String MediaMetadataCompat;
    public final /* synthetic */ NetworkBody MediaSessionCompatQueueItem;
    public int RatingCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCreationRepository$createAccount$2(NetworkBody networkBody, String str, String str2, String str3, String str4, String str5, String str6, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = networkBody;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.serializer = str3;
        this.write = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.MediaMetadataCompat = str6;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((AccountCreationRepository$createAccount$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((AccountCreationRepository$createAccount$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        AccountCreationRepository$createAccount$2 accountCreationRepository$createAccount$2 = new AccountCreationRepository$createAccount$2(this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.read, this.serializer, this.write, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return accountCreationRepository$createAccount$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.RatingCompat;
        if (i2 != 0) {
            int i3 = MediaDescriptionCompat + 41;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        onResumeI onresumei = (onResumeI) this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
        ActivityHandler19 activityHandler19 = new ActivityHandler19(this.IconCompatParcelizer, this.read, this.serializer, this.write, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat);
        this.RatingCompat = 1;
        Object objIconCompatParcelizer = onresumei.IconCompatParcelizer(activityHandler19, this);
        if (objIconCompatParcelizer == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i4 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objIconCompatParcelizer;
    }
}
