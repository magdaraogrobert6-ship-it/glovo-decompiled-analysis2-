package com.roadrunner.customerchat.internal;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatTokenProvider$requestAuthTokenRefresh$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ ProtobufEncoder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatTokenProvider$requestAuthTokenRefresh$1(ProtobufEncoder protobufEncoder, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = protobufEncoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 79;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = 0;
        if (this.serializer == 0) {
            return new ChatTokenProvider$requestAuthTokenRefresh$1(this.write, shortNewsContentCardView, i4);
        }
        ChatTokenProvider$requestAuthTokenRefresh$1 chatTokenProvider$requestAuthTokenRefresh$1 = new ChatTokenProvider$requestAuthTokenRefresh$1(this.write, shortNewsContentCardView, 1);
        int i5 = RemoteActionCompatParcelizer + 97;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return chatTokenProvider$requestAuthTokenRefresh$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 != 0) {
            Object objInvokeSuspend = ((ChatTokenProvider$requestAuthTokenRefresh$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = RemoteActionCompatParcelizer + 11;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
        ((ChatTokenProvider$requestAuthTokenRefresh$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i4 = RemoteActionCompatParcelizer + 45;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        ProtobufEncoder protobufEncoder = this.write;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("ChatTokenProvider requestAuthTokenRefresh from Web Layer called", new Object[0]);
            Object objRemoteActionCompatParcelizer = ((RefreshAccessTokenUseCaseImpl) protobufEncoder.write).RemoteActionCompatParcelizer("ChatTokenProvider");
            if (objRemoteActionCompatParcelizer instanceof isItemDismissable) {
                forest.write(new CustomerChatSdkLogger$WebChatTokenError("Token refresh failed for Web Layer", onItemDismiss.serializer(objRemoteActionCompatParcelizer), 0));
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object objRemoteActionCompatParcelizer2 = ((RefreshAccessTokenUseCaseImpl) protobufEncoder.write).RemoteActionCompatParcelizer("ChatTokenProvider");
        Throwable thSerializer = onItemDismiss.serializer(objRemoteActionCompatParcelizer2);
        String strIconCompatParcelizer = null;
        if (thSerializer == null) {
            int i3 = read + 71;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                ((zzz) protobufEncoder.serializer).IconCompatParcelizer();
                strIconCompatParcelizer.hashCode();
                throw null;
            }
            strIconCompatParcelizer = ((zzz) protobufEncoder.serializer).IconCompatParcelizer();
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Token refresh failed for chat api calls, reason ", thSerializer.getMessage()), new Object[0]);
            int i4 = RemoteActionCompatParcelizer + 81;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = read + 123;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
        return strIconCompatParcelizer;
    }
}
