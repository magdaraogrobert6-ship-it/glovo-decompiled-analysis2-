package com.roadrunner.helpcenter.dispatcher_chat;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.data.error.ApiException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ErrorBodyParseException;
import com.roadrunner.common.data.api.MissingErrorResponseException;
import com.roadrunner.common.data.api.UniqueHttpException;
import com.roadrunner.common.data.api.UniqueHttpExceptionKt;
import com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.DialogFragment3;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllowEnterTransitionOverlap;
import o.getContentViewGroupParentLayout;
import o.instantiate;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.sourceInformationContextOfdefault;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class WebDispatcherChat$triggerUnreadMessageCountApi$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ WebDispatcherChat write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebDispatcherChat$triggerUnreadMessageCountApi$1(WebDispatcherChat webDispatcherChat, int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = webDispatcherChat;
        this.IconCompatParcelizer = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        WebDispatcherChat$triggerUnreadMessageCountApi$1 webDispatcherChat$triggerUnreadMessageCountApi$1 = new WebDispatcherChat$triggerUnreadMessageCountApi$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = read + 1;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return webDispatcherChat$triggerUnreadMessageCountApi$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 29;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((WebDispatcherChat$triggerUnreadMessageCountApi$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = serializer + 123;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = 2 % 2;
        WebDispatcherChat webDispatcherChat = this.write;
        BehaviorSubject behaviorSubject = webDispatcherChat.MediaSessionCompatToken;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj3 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Updating unread messages count", new Object[0]);
            String str = webDispatcherChat.IconCompatParcelizer.write().globalEntityId;
            GetUnreadMessageCountUseCase getUnreadMessageCountUseCase = webDispatcherChat.serializer;
            getAllowEnterTransitionOverlap getallowentertransitionoverlap = new getAllowEnterTransitionOverlap(str);
            this.RemoteActionCompatParcelizer = 1;
            Object objM4966invokegIAlus = getUnreadMessageCountUseCase.m4966invokegIAlus(getallowentertransitionoverlap, this);
            if (objM4966invokegIAlus == coroutineSingletons) {
                int i3 = serializer + 33;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj3.hashCode();
                throw null;
            }
            obj2 = objM4966invokegIAlus;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = read + 31;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(obj2 instanceof isItemDismissable)) {
            DialogFragment3 dialogFragment3 = (DialogFragment3) obj2;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Received unread messages count = " + dialogFragment3, new Object[0]);
            webDispatcherChat.MediaSessionCompatResultReceiverWrapper.getClass();
            webDispatcherChat.MediaSessionCompatQueueItem = System.currentTimeMillis();
            instantiate instantiateVar = dialogFragment3.chat;
            webDispatcherChat.MediaBrowserCompatMediaItem = instantiateVar.write();
            webDispatcherChat.PlaybackStateCompat = instantiateVar.RemoteActionCompatParcelizer();
            behaviorSubject.onNext(new Integer(instantiateVar.RemoteActionCompatParcelizer()));
            WebDispatcherChat.write(-1410168088, sourceInformationContextOfdefault.read(), 1410168089, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), new Object[]{webDispatcherChat}, sourceInformationContextOfdefault.read());
        }
        Throwable thSerializer = onItemDismiss.serializer(obj2);
        if (thSerializer != null) {
            int i6 = read + 39;
            int i7 = i6 % Fields.SpotShadowColor;
            serializer = i7;
            if (i6 % 2 != 0) {
                boolean z = thSerializer instanceof ErrorBodyParseException;
                obj3.hashCode();
                throw null;
            }
            int i8 = this.IconCompatParcelizer;
            if (!(!(thSerializer instanceof ErrorBodyParseException))) {
                int i9 = i7 + 73;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                UniqueHttpException uniqueHttpException = ((ErrorBodyParseException) thSerializer).read;
                WebDispatcherChat.write(webDispatcherChat, uniqueHttpException, uniqueHttpException.read, i8);
            } else if (thSerializer instanceof MissingErrorResponseException) {
                HttpException httpExceptionRemoteActionCompatParcelizer = UniqueHttpExceptionKt.RemoteActionCompatParcelizer(thSerializer);
                if (httpExceptionRemoteActionCompatParcelizer != null) {
                    WebDispatcherChat.write(webDispatcherChat, httpExceptionRemoteActionCompatParcelizer, httpExceptionRemoteActionCompatParcelizer.read, i8);
                } else {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Getting unread message count failed with non http Missing error response exception", new Object[0]);
                }
            } else if (thSerializer instanceof ApiException.General) {
                WebDispatcherChat.write(webDispatcherChat, (Exception) thSerializer, ((ApiException.General) thSerializer).read, i8);
            } else {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Getting unread message count failed.", new Object[0]);
            }
            behaviorSubject.onNext(new Integer(0));
        }
        return createFromParcel.INSTANCE;
    }
}
