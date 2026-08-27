package com.deliveryhero.selfServiceChat.data;

import coil3.ExtrasKt;
import com.deliveryhero.chatsdk.util.UrlBuilder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.data.chat.GetChatIDEndpointResponse;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatIdCacheHelper;
import com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse;
import com.deliveryhero.selfServiceChat.domain.exceptions.EndpointException;
import com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.LocaleNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.OrderIDNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.UserTypeNotSetException;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.LayerSnapshotV21;
import o.LayerSnapshot_androidKt;
import o.PathNodeClose;
import o.PathNodeCurveTo;
import o.ShortNewsContentCardView;
import o.ViewLayerVerificationHelper31;
import o._get_messageWebView_lambda1;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getDefaultFillType;
import o.getDefaultTintBlendMode;
import o.getHoldoutVariationName;
import o.getX3;
import o.isMoreThanHalf;
import o.isPositiveArc;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.rebuildOutline;
import o.resolveLockHardwareCanvasMethod;
import o.setOutlineAmbientShadowColor;
import o.setOutlineSpotShadowColor;
import o.setSpotShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpcenterRemoteDataSourceImpl implements isMoreThanHalf {
    public final ChatIdCacheHelper IconCompatParcelizer;
    public final PathNodeCurveTo MediaDescriptionCompat;
    public final PathNodeClose RemoteActionCompatParcelizer;
    public final setOutlineSpotShadowColor read;
    public final setOutlineAmbientShadowColor serializer;
    public final getDefaultTintBlendMode write;

    /* JADX INFO: renamed from: com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl$getChatID$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ rebuildOutline IconCompatParcelizer;
        public String MediaDescriptionCompat;
        public final /* synthetic */ HelpcenterRemoteDataSourceImpl MediaMetadataCompat;
        public int RatingCompat;
        public final /* synthetic */ String RemoteActionCompatParcelizer;
        public final /* synthetic */ setSpotShadowColor read;
        public final /* synthetic */ String serializer;
        public final /* synthetic */ HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(rebuildOutline rebuildoutline, HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig, String str, String str2, HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl, setSpotShadowColor setspotshadowcolor, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = rebuildoutline;
            this.write = globalEntityConfig;
            this.RemoteActionCompatParcelizer = str;
            this.serializer = str2;
            this.MediaMetadataCompat = helpcenterRemoteDataSourceImpl;
            this.read = setspotshadowcolor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            return new AnonymousClass3(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.serializer, this.MediaMetadataCompat, this.read, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserTypeNotSetException, GlobalEntityNotSetException, EndpointException {
            LayerSnapshot_androidKt layerSnapshot_androidKt;
            String str;
            LayerSnapshot_androidKt layerSnapshot_androidKt2;
            resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.RatingCompat;
            String str2 = this.RemoteActionCompatParcelizer;
            HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl = this.MediaMetadataCompat;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                UrlBuilder urlBuilder = UrlBuilder.INSTANCE;
                String strBuildChatIDEndpointUrl = urlBuilder.buildChatIDEndpointUrl(urlBuilder.buildHelpCenterChatAPAIServiceUrl(this.IconCompatParcelizer, this.write.IconCompatParcelizer), str2, this.serializer);
                LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer = helpcenterRemoteDataSourceImpl.RemoteActionCompatParcelizer();
                if (layerSnapshotV21RemoteActionCompatParcelizer == null || (layerSnapshot_androidKt = layerSnapshotV21RemoteActionCompatParcelizer.write) == null || (str = layerSnapshot_androidKt.globalEntityID) == null) {
                    throw new GlobalEntityNotSetException("Chat ID");
                }
                LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer2 = helpcenterRemoteDataSourceImpl.RemoteActionCompatParcelizer();
                if (layerSnapshotV21RemoteActionCompatParcelizer2 == null || (layerSnapshot_androidKt2 = layerSnapshotV21RemoteActionCompatParcelizer2.write) == null || (resolvelockhardwarecanvasmethod = layerSnapshot_androidKt2.userType) == null) {
                    throw UserTypeNotSetException.serializer;
                }
                PathNodeClose pathNodeClose = helpcenterRemoteDataSourceImpl.RemoteActionCompatParcelizer;
                String lowerCase = resolvelockhardwarecanvasmethod.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                this.RatingCompat = 1;
                obj = pathNodeClose.serializer(strBuildChatIDEndpointUrl, str, lowerCase, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = this.MediaDescriptionCompat;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return str3;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) obj;
            Object obj2 = getholdoutvariationname.body;
            _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
            GetChatIDEndpointResponse getChatIDEndpointResponse = (GetChatIDEndpointResponse) obj2;
            String str4 = _get_messagewebview_lambda1.isSuccessful ? getChatIDEndpointResponse != null ? getChatIDEndpointResponse.chatId : null : null;
            if (str4 == null) {
                int i2 = _get_messagewebview_lambda1.code;
                String str5 = _get_messagewebview_lambda1.message;
                str5.getClass();
                throw new EndpointException("Chat ID for this order", i2, str5);
            }
            if (BuildersKt.RemoteActionCompatParcelizer(this.read)) {
                ChatIdCacheHelper chatIdCacheHelper = helpcenterRemoteDataSourceImpl.IconCompatParcelizer;
                this.MediaDescriptionCompat = str4;
                this.RatingCompat = 2;
                if (chatIdCacheHelper.put(str2, str4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return str4;
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl$getUnreadCount$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public rebuildOutline serializer;
        public int write;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            return HelpcenterRemoteDataSourceImpl.this.new AnonymousClass2(shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
        
            if (r8 == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.deliveryhero.selfServiceChat.domain.exceptions.UserTypeNotSetException, com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException, com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException, com.deliveryhero.selfServiceChat.domain.exceptions.EndpointException {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.write
                com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl r2 = com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl.this
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L14
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                goto L8d
            L14:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
                return r5
            L1a:
                o.rebuildOutline r1 = r7.serializer
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                goto L3c
            L20:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                o.LayerSnapshotV21 r8 = r2.RemoteActionCompatParcelizer()
                if (r8 == 0) goto Lba
                o.LayerSnapshot_androidKt r8 = r8.write
                if (r8 == 0) goto Lba
                o.rebuildOutline r1 = r8.dhEnvironment
                if (r1 == 0) goto Lba
                r7.serializer = r1
                r7.write = r4
                java.lang.Object r8 = r2.serializer(r7)
                if (r8 != r0) goto L3c
                goto L8c
            L3c:
                com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse$GlobalEntityConfig r8 = (com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) r8
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.deliveryhero.chatsdk.util.UrlBuilder r6 = com.deliveryhero.chatsdk.util.UrlBuilder.INSTANCE
                java.lang.String r8 = r8.IconCompatParcelizer
                java.lang.String r8 = r6.buildHelpCenterChatAPAIServiceUrl(r1, r8)
                r4.append(r8)
                java.lang.String r8 = "/chat-api/v2/unread-message-count"
                r4.append(r8)
                java.lang.String r8 = r4.toString()
                o.LayerSnapshotV21 r1 = r2.RemoteActionCompatParcelizer()
                if (r1 == 0) goto Lb2
                o.LayerSnapshot_androidKt r1 = r1.write
                if (r1 == 0) goto Lb2
                java.lang.String r1 = r1.globalEntityID
                if (r1 == 0) goto Lb2
                o.LayerSnapshotV21 r4 = r2.RemoteActionCompatParcelizer()
                if (r4 == 0) goto Laf
                o.LayerSnapshot_androidKt r4 = r4.write
                if (r4 == 0) goto Laf
                o.resolveLockHardwareCanvasMethod r4 = r4.userType
                if (r4 == 0) goto Laf
                o.PathNodeClose r2 = r2.RemoteActionCompatParcelizer
                java.lang.String r4 = r4.name()
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r4 = r4.toLowerCase(r6)
                r4.getClass()
                r7.serializer = r5
                r7.write = r3
                java.lang.Object r8 = r2.IconCompatParcelizer(r8, r1, r4, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                o.getHoldoutVariationName r8 = (o.getHoldoutVariationName) r8
                java.lang.Object r0 = r8.body
                o._get_messageWebView_lambda1 r8 = r8.rawResponse
                r1 = r0
                com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails r1 = (com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails) r1
                boolean r1 = r8.isSuccessful
                if (r1 == 0) goto L9b
                r5 = r0
            L9b:
                com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails r5 = (com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails) r5
                if (r5 == 0) goto La0
                return r5
            La0:
                int r0 = r8.code
                java.lang.String r8 = r8.message
                r8.getClass()
                com.deliveryhero.selfServiceChat.domain.exceptions.EndpointException r1 = new com.deliveryhero.selfServiceChat.domain.exceptions.EndpointException
                java.lang.String r2 = "Unread count endpoint"
                r1.<init>(r2, r0, r8)
                throw r1
            Laf:
                com.deliveryhero.selfServiceChat.domain.exceptions.UserTypeNotSetException r8 = com.deliveryhero.selfServiceChat.domain.exceptions.UserTypeNotSetException.serializer
                throw r8
            Lb2:
                com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException r8 = new com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException
                java.lang.String r0 = "Unread Count"
                r8.<init>(r0)
                throw r8
            Lba:
                com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException r8 = com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException.RemoteActionCompatParcelizer
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }
    }

    public final LayerSnapshotV21 RemoteActionCompatParcelizer() {
        return ((ViewLayerVerificationHelper31) this.serializer).write();
    }

    public HelpcenterRemoteDataSourceImpl(setOutlineSpotShadowColor setoutlinespotshadowcolor, PathNodeCurveTo pathNodeCurveTo, PathNodeClose pathNodeClose, setOutlineAmbientShadowColor setoutlineambientshadowcolor, getDefaultTintBlendMode getdefaulttintblendmode, ChatIdCacheHelper chatIdCacheHelper) {
        this.read = setoutlinespotshadowcolor;
        this.MediaDescriptionCompat = pathNodeCurveTo;
        this.RemoteActionCompatParcelizer = pathNodeClose;
        this.serializer = setoutlineambientshadowcolor;
        this.write = getdefaulttintblendmode;
        this.IconCompatParcelizer = chatIdCacheHelper;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getChatID(String str, ContinuationImpl continuationImpl) {
        isPositiveArc ispositivearc;
        LayerSnapshot_androidKt layerSnapshot_androidKt;
        rebuildOutline rebuildoutline;
        String str2;
        String language;
        String str3;
        setSpotShadowColor setspotshadowcolor;
        String str4;
        rebuildOutline rebuildoutline2;
        HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl;
        HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl2;
        String str5;
        Object objSerializer;
        String str6;
        setSpotShadowColor setspotshadowcolor2;
        Object objWithContext;
        if (continuationImpl instanceof isPositiveArc) {
            ispositivearc = (isPositiveArc) continuationImpl;
            int i = ispositivearc.RatingCompat;
            if ((i & Integer.MIN_VALUE) != 0) {
                ispositivearc.RatingCompat = i - Integer.MIN_VALUE;
            } else {
                ispositivearc = new isPositiveArc(this, continuationImpl);
            }
        } else {
            ispositivearc = new isPositiveArc(this, continuationImpl);
        }
        Object obj = ispositivearc.MediaBrowserCompatMediaItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ispositivearc.RatingCompat;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (layerSnapshotV21RemoteActionCompatParcelizer != null && (layerSnapshot_androidKt = layerSnapshotV21RemoteActionCompatParcelizer.write) != null && (rebuildoutline = layerSnapshot_androidKt.dhEnvironment) != null) {
                LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
                if (layerSnapshotV21RemoteActionCompatParcelizer2 != null && (str2 = layerSnapshotV21RemoteActionCompatParcelizer2.RatingCompat) != null) {
                    language = Locale.forLanguageTag(str2).getLanguage();
                    language.getClass();
                    if (str == null) {
                        LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
                        str3 = layerSnapshotV21RemoteActionCompatParcelizer3 != null ? layerSnapshotV21RemoteActionCompatParcelizer3.ParcelableVolumeInfo : null;
                        if (str3 == null) {
                            throw OrderIDNotSetException.read;
                        }
                    } else {
                        str3 = str;
                    }
                    LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer();
                    setspotshadowcolor = layerSnapshotV21RemoteActionCompatParcelizer4 != null ? layerSnapshotV21RemoteActionCompatParcelizer4.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null;
                    if (BuildersKt.RemoteActionCompatParcelizer(setspotshadowcolor)) {
                        ispositivearc.RemoteActionCompatParcelizer = this;
                        ispositivearc.serializer = rebuildoutline;
                        ispositivearc.IconCompatParcelizer = language;
                        ispositivearc.read = str3;
                        ispositivearc.write = setspotshadowcolor;
                        ispositivearc.RatingCompat = 1;
                        Object obj2 = this.IconCompatParcelizer.get(str3, ispositivearc);
                        if (obj2 != coroutineSingletons) {
                            helpcenterRemoteDataSourceImpl2 = this;
                            str5 = str3;
                            obj = obj2;
                        }
                    } else {
                        str4 = language;
                        rebuildoutline2 = rebuildoutline;
                        helpcenterRemoteDataSourceImpl = this;
                        ispositivearc.RemoteActionCompatParcelizer = helpcenterRemoteDataSourceImpl;
                        ispositivearc.serializer = rebuildoutline2;
                        ispositivearc.IconCompatParcelizer = str4;
                        ispositivearc.read = str3;
                        ispositivearc.write = setspotshadowcolor;
                        ispositivearc.RatingCompat = 2;
                        objSerializer = helpcenterRemoteDataSourceImpl.serializer(ispositivearc);
                        if (objSerializer != coroutineSingletons) {
                            str6 = str3;
                            setspotshadowcolor2 = setspotshadowcolor;
                            obj = objSerializer;
                            String str7 = str4;
                            HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl3 = helpcenterRemoteDataSourceImpl;
                            rebuildOutline rebuildoutline3 = rebuildoutline2;
                            HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig = (HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj;
                            setOutlineSpotShadowColor setoutlinespotshadowcolor = helpcenterRemoteDataSourceImpl3.read;
                            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(rebuildoutline3, globalEntityConfig, str6, str7, helpcenterRemoteDataSourceImpl3, setspotshadowcolor2, null);
                            ispositivearc.RemoteActionCompatParcelizer = null;
                            ispositivearc.serializer = null;
                            ispositivearc.IconCompatParcelizer = null;
                            ispositivearc.read = null;
                            ispositivearc.write = null;
                            ispositivearc.RatingCompat = 3;
                            objWithContext = BuildersKt.withContext(defaultIoScheduler, anonymousClass3, ispositivearc);
                            if (objWithContext == coroutineSingletons) {
                                return objWithContext;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                throw LocaleNotSetException.read;
            }
            throw EnvironmentNotSetException.RemoteActionCompatParcelizer;
        }
        if (i2 == 1) {
            setspotshadowcolor = ispositivearc.write;
            str5 = ispositivearc.read;
            language = ispositivearc.IconCompatParcelizer;
            rebuildoutline = ispositivearc.serializer;
            helpcenterRemoteDataSourceImpl2 = ispositivearc.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setSpotShadowColor setspotshadowcolor3 = ispositivearc.write;
            String str8 = ispositivearc.read;
            str4 = ispositivearc.IconCompatParcelizer;
            rebuildoutline2 = ispositivearc.serializer;
            helpcenterRemoteDataSourceImpl = ispositivearc.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setspotshadowcolor2 = setspotshadowcolor3;
            str6 = str8;
        }
        String str9 = str4;
        HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl4 = helpcenterRemoteDataSourceImpl;
        rebuildOutline rebuildoutline4 = rebuildoutline2;
        HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig2 = (HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj;
        setOutlineSpotShadowColor setoutlinespotshadowcolor2 = helpcenterRemoteDataSourceImpl4.read;
        DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.RemoteActionCompatParcelizer;
        AnonymousClass3 anonymousClass4 = new AnonymousClass3(rebuildoutline4, globalEntityConfig2, str6, str9, helpcenterRemoteDataSourceImpl4, setspotshadowcolor2, null);
        ispositivearc.RemoteActionCompatParcelizer = null;
        ispositivearc.serializer = null;
        ispositivearc.IconCompatParcelizer = null;
        ispositivearc.read = null;
        ispositivearc.write = null;
        ispositivearc.RatingCompat = 3;
        objWithContext = BuildersKt.withContext(defaultIoScheduler2, anonymousClass4, ispositivearc);
        if (objWithContext == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objWithContext;
        String str10 = (String) obj;
        if (str10 != null) {
            return str10;
        }
        str3 = str5;
        str4 = language;
        rebuildoutline2 = rebuildoutline;
        helpcenterRemoteDataSourceImpl = helpcenterRemoteDataSourceImpl2;
        ispositivearc.RemoteActionCompatParcelizer = helpcenterRemoteDataSourceImpl;
        ispositivearc.serializer = rebuildoutline2;
        ispositivearc.IconCompatParcelizer = str4;
        ispositivearc.read = str3;
        ispositivearc.write = setspotshadowcolor;
        ispositivearc.RatingCompat = 2;
        objSerializer = helpcenterRemoteDataSourceImpl.serializer(ispositivearc);
        if (objSerializer != coroutineSingletons) {
            str6 = str3;
            setspotshadowcolor2 = setspotshadowcolor;
            obj = objSerializer;
            String str11 = str4;
            HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl5 = helpcenterRemoteDataSourceImpl;
            rebuildOutline rebuildoutline5 = rebuildoutline2;
            HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig3 = (HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj;
            setOutlineSpotShadowColor setoutlinespotshadowcolor3 = helpcenterRemoteDataSourceImpl5.read;
            DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler3 = DefaultIoScheduler.RemoteActionCompatParcelizer;
            AnonymousClass3 anonymousClass5 = new AnonymousClass3(rebuildoutline5, globalEntityConfig3, str6, str11, helpcenterRemoteDataSourceImpl5, setspotshadowcolor2, null);
            ispositivearc.RemoteActionCompatParcelizer = null;
            ispositivearc.serializer = null;
            ispositivearc.IconCompatParcelizer = null;
            ispositivearc.read = null;
            ispositivearc.write = null;
            ispositivearc.RatingCompat = 3;
            objWithContext = BuildersKt.withContext(defaultIoScheduler3, anonymousClass5, ispositivearc);
            if (objWithContext == coroutineSingletons) {
                return objWithContext;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUnreadCount(ContinuationImpl continuationImpl) throws Throwable {
        getX3 getx3;
        if (continuationImpl instanceof getX3) {
            getx3 = (getX3) continuationImpl;
            int i = getx3.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                getx3.write = i - Integer.MIN_VALUE;
            } else {
                getx3 = new getX3(this, continuationImpl);
            }
        } else {
            getx3 = new getX3(this, continuationImpl);
        }
        Object objWithContext = getx3.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getx3.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            getx3.write = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, anonymousClass2, getx3);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        objWithContext.getClass();
        return objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0107, code lost:
    
        if (r1 == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessage(java.lang.String r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl.sendMessage(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object serializer(ContinuationImpl continuationImpl) throws GlobalEntityNotSetException, EnvironmentNotSetException {
        LayerSnapshot_androidKt layerSnapshot_androidKt;
        String str;
        LayerSnapshot_androidKt layerSnapshot_androidKt2;
        rebuildOutline rebuildoutline;
        List list;
        LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (layerSnapshotV21RemoteActionCompatParcelizer == null || (layerSnapshot_androidKt = layerSnapshotV21RemoteActionCompatParcelizer.write) == null || (str = layerSnapshot_androidKt.globalEntityID) == null) {
            throw new GlobalEntityNotSetException("HC Region Config");
        }
        LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        if (layerSnapshotV21RemoteActionCompatParcelizer2 == null || (layerSnapshot_androidKt2 = layerSnapshotV21RemoteActionCompatParcelizer2.write) == null || (rebuildoutline = layerSnapshot_androidKt2.dhEnvironment) == null) {
            throw EnvironmentNotSetException.RemoteActionCompatParcelizer;
        }
        LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
        Object obj = null;
        setSpotShadowColor setspotshadowcolor = layerSnapshotV21RemoteActionCompatParcelizer3 != null ? layerSnapshotV21RemoteActionCompatParcelizer3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null;
        if (BuildersKt.RemoteActionCompatParcelizer(setspotshadowcolor) && (list = ((getDefaultFillType) this.write).IconCompatParcelizer) != null) {
            for (Object obj2 : list) {
                if (((HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj2).serializer.equals(str)) {
                    obj = obj2;
                    break;
                }
            }
            HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig = (HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj;
            if (globalEntityConfig != null) {
                return globalEntityConfig;
            }
        }
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new HelpcenterRemoteDataSourceImpl$getHelpcenterRegionConfig$4(rebuildoutline, this, setspotshadowcolor, str, null), continuationImpl);
    }
}
