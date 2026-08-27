package com.deliveryhero.selfServiceChat.data.repository;

import androidx.room.Room;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse;
import com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.RetryExhaustedException;
import com.mapbox.navigation.core.MapboxNavigation$parsing$1;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.RegexKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.PathData;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.getDefaultStrokeLineCap;
import o.isMoreThanHalf;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.rgbEqualOWjLjI;
import o.setOutlineSpotShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatRepositoryImpl implements rgbEqualOWjLjI, getContentViewGroupParentLayout {
    public final /* synthetic */ ContextScope serializer;
    public final isMoreThanHalf write;

    /* JADX INFO: renamed from: com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl$fetchHelpCenterRegion$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public int RemoteActionCompatParcelizer;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            return ChatRepositoryImpl.this.new AnonymousClass3(shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            return ((AnonymousClass3) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws GlobalEntityNotSetException, EnvironmentNotSetException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            isMoreThanHalf ismorethanhalf = ChatRepositoryImpl.this.write;
            this.RemoteActionCompatParcelizer = 1;
            Object objSerializer = ((HelpcenterRemoteDataSourceImpl) ismorethanhalf).serializer(this);
            return objSerializer == coroutineSingletons ? coroutineSingletons : objSerializer;
        }

        public AnonymousClass3(ShortNewsContentCardView shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
        }
    }

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        return this.serializer.serializer;
    }

    public ChatRepositoryImpl(isMoreThanHalf ismorethanhalf, setOutlineSpotShadowColor setoutlinespotshadowcolor) {
        this.write = ismorethanhalf;
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.serializer = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchHelpCenterRegion(ContinuationImpl continuationImpl) throws RetryExhaustedException {
        PathData pathData;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        if (continuationImpl instanceof PathData) {
            pathData = (PathData) continuationImpl;
            int i = pathData.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                pathData.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                pathData = new PathData(this, continuationImpl);
            }
        } else {
            pathData = new PathData(this, continuationImpl);
        }
        Object obj = pathData.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pathData.IconCompatParcelizer;
        if (i2 == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1 = new RootViewsSpy$Companion$install$1$1(4, createinappmessageeventsubscriberM3979m);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
            pathData.write = createinappmessageeventsubscriberM3979m;
            pathData.IconCompatParcelizer = 1;
            Object objSerializer = RegexKt.serializer(rootViewsSpy$Companion$install$1$1, anonymousClass3, pathData);
            if (objSerializer == coroutineSingletons) {
                return coroutineSingletons;
            }
            createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            obj = objSerializer;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber = pathData.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig = (HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj;
        if (globalEntityConfig != null) {
            return globalEntityConfig;
        }
        throw new RetryExhaustedException((Throwable) createinappmessageeventsubscriber.IconCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendMessage(String str, ShortNewsContentCardView shortNewsContentCardView) throws RetryExhaustedException {
        getDefaultStrokeLineCap getdefaultstrokelinecap;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        if (shortNewsContentCardView instanceof getDefaultStrokeLineCap) {
            getdefaultstrokelinecap = (getDefaultStrokeLineCap) shortNewsContentCardView;
            int i = getdefaultstrokelinecap.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getdefaultstrokelinecap.serializer = i - Integer.MIN_VALUE;
            } else {
                getdefaultstrokelinecap = new getDefaultStrokeLineCap(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            getdefaultstrokelinecap = new getDefaultStrokeLineCap(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object obj = getdefaultstrokelinecap.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getdefaultstrokelinecap.serializer;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        int i3 = 1;
        if (i2 == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            MapboxNavigation$parsing$1 mapboxNavigation$parsing$1 = new MapboxNavigation$parsing$1(createinappmessageeventsubscriberM3979m, i3);
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView2, 6);
            getdefaultstrokelinecap.read = createinappmessageeventsubscriberM3979m;
            getdefaultstrokelinecap.serializer = 1;
            Object objSerializer = RegexKt.serializer(mapboxNavigation$parsing$1, authRepository$logoutUser$2, getdefaultstrokelinecap);
            if (objSerializer == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objSerializer;
            createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber = getdefaultstrokelinecap.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool;
        }
        throw new RetryExhaustedException((Throwable) createinappmessageeventsubscriber.IconCompatParcelizer);
    }
}
