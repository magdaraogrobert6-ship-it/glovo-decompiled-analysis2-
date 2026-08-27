package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.Perseus;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getEmUIouoOA;
import o.getStyles;
import o.inCompatibilityMode;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda0dL3NwAAnESqa66IBFAXKvH5HU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatUrlProviderImpl$fetchChatUrl$urlResult$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ChatUrlProviderImpl read;
    public final /* synthetic */ String serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatUrlProviderImpl$fetchChatUrl$urlResult$1(ChatUrlProviderImpl chatUrlProviderImpl, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = chatUrlProviderImpl;
        this.serializer = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return new com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1(r4, r3, r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = new com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1(r4, r3, r7, 1);
        r7 = com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1.MediaSessionCompatQueueItem + 105;
        com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1.write = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(o.ShortNewsContentCardView r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1.MediaSessionCompatQueueItem
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1.write = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1b
            int r1 = r6.IconCompatParcelizer
            java.lang.String r3 = r6.serializer
            com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl r4 = r6.read
            r5 = 11
            int r5 = r5 / r2
            if (r1 == 0) goto L33
            goto L23
        L1b:
            int r1 = r6.IconCompatParcelizer
            java.lang.String r3 = r6.serializer
            com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl r4 = r6.read
            if (r1 == 0) goto L33
        L23:
            com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1 r1 = new com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1
            r2 = 1
            r1.<init>(r4, r3, r7, r2)
            int r7 = com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1.MediaSessionCompatQueueItem
            int r7 = r7 + 105
            int r2 = r7 % 128
            com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1.write = r2
            int r7 = r7 % r0
            return r1
        L33:
            com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1 r0 = new com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1
            r0.<init>(r4, r3, r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl$fetchChatUrl$urlResult$1.create(o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 35;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 != 0) {
            return ((ChatUrlProviderImpl$fetchChatUrl$urlResult$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((ChatUrlProviderImpl$fetchChatUrl$urlResult$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaSessionCompatQueueItem + 53;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        ChatUrlProviderImpl chatUrlProviderImpl = this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl = chatUrlProviderImpl.MediaBrowserCompatMediaItem;
            this.RemoteActionCompatParcelizer = 1;
            Object chatId = helpCenterRemoteDataSourceImpl.getChatId(this.serializer, this);
            if (chatId != coroutineSingletons) {
                return chatId;
            }
            int i4 = MediaSessionCompatQueueItem + 23;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.RemoteActionCompatParcelizer;
        if (i6 != 0) {
            int i7 = write + 95;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = MediaSessionCompatQueueItem + 85;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i10 = write + 1;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return obj;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        this.RemoteActionCompatParcelizer = 1;
        ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = (ChatDeliveryRepositoryImpl) chatUrlProviderImpl.read;
        getEmUIouoOA getemuiouooaWrite = chatDeliveryRepositoryImpl.write();
        String strSerializer = chatDeliveryRepositoryImpl.serializer();
        if (strSerializer == null) {
            throw new UserNotRegisteredException();
        }
        String str3 = "Android_" + ((Object) chatUrlProviderImpl.RemoteActionCompatParcelizer.write());
        chatUrlProviderImpl.serializer.getClass();
        if (getemuiouooaWrite == null || (str = getemuiouooaWrite.IconCompatParcelizer) == null) {
            str = "customer-rider-chat-user@mail.com";
        }
        String str4 = str;
        String strMediaBrowserCompatMediaItem = chatDeliveryRepositoryImpl.MediaBrowserCompatMediaItem();
        String str5 = chatUrlProviderImpl.MediaSessionCompatQueueItem.read();
        String strIconCompatParcelizer = chatDeliveryRepositoryImpl.IconCompatParcelizer();
        if (getemuiouooaWrite == null || (str2 = getemuiouooaWrite.RemoteActionCompatParcelizer) == null) {
            throw new UserNotRegisteredException();
        }
        chatUrlProviderImpl.write.getClass();
        String str6 = getemuiouooaWrite.RemoteActionCompatParcelizer;
        String strIconCompatParcelizer2 = chatDeliveryRepositoryImpl.IconCompatParcelizer();
        chatUrlProviderImpl.PlaybackStateCompatCustomAction.getClass();
        getStyles getstyles = new getStyles(str3, str4, strMediaBrowserCompatMediaItem, str5, strIconCompatParcelizer, str2, this.serializer, strSerializer, strIconCompatParcelizer2, strSerializer, str6, strSerializer, Perseus.serializer());
        r8lambda0dL3NwAAnESqa66IBFAXKvH5HU r8lambda0dl3nwaanesqa66ibfaxkvh5hu = chatUrlProviderImpl.MediaDescriptionCompat;
        ((inCompatibilityMode) r8lambda0dl3nwaanesqa66ibfaxkvh5hu.IconCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PerseusLogger$w$1(r8lambda0dl3nwaanesqa66ibfaxkvh5hu, getstyles, shortNewsContentCardView, 14), this);
        if (objWithContext != coroutineSingletons2) {
            return objWithContext;
        }
        int i12 = write + 41;
        MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return coroutineSingletons2;
    }
}
