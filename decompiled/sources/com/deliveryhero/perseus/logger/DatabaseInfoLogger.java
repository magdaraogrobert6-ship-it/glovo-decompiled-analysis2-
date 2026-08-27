package com.deliveryhero.perseus.logger;

import androidx.datastore.core.SimpleActor$offer$2;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.deliveryhero.perseus.logging.types.BackLogInfoRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.horizontalLineToRelative;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.quadToRelative;
import o.setNativeShader;
import o.setTrimPathEnd;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class DatabaseInfoLogger {
    public final PerseusConfigLocalDataStoreImpl IconCompatParcelizer;
    public final PerseusUserLocalDataStoreImpl MediaDescriptionCompat;
    public final Extras$Key RemoteActionCompatParcelizer;
    public final PerseusLogger read;
    public MemoryCacheService serializer;
    public final AppSessionManagerImpl write;

    public static final void RemoteActionCompatParcelizer(DatabaseInfoLogger databaseInfoLogger, BackLogInfoRequest backLogInfoRequest) {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().create();
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("infoRequest", backLogInfoRequest), new onViewAttachedToWindowlambda0("enhancedBacklogMetadata", IconCompatParcelizer(databaseInfoLogger.RemoteActionCompatParcelizer.MediaMetadataCompat().write)));
        PerseusLogger perseusLogger = databaseInfoLogger.read;
        String json = gsonCreate.toJson(mapRemoteActionCompatParcelizer);
        json.getClass();
        PerseusLogger.IconCompatParcelizer(perseusLogger, json);
    }

    public DatabaseInfoLogger(AppSessionManagerImpl appSessionManagerImpl, PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl, Extras$Key extras$Key, PerseusLogger perseusLogger) {
        appSessionManagerImpl.getClass();
        perseusUserLocalDataStoreImpl.getClass();
        perseusConfigLocalDataStoreImpl.getClass();
        perseusLogger.getClass();
        this.write = appSessionManagerImpl;
        this.MediaDescriptionCompat = perseusUserLocalDataStoreImpl;
        this.IconCompatParcelizer = perseusConfigLocalDataStoreImpl;
        this.RemoteActionCompatParcelizer = extras$Key;
        this.read = perseusLogger;
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(UrlUtils.serializer()), null, null, new SimpleActor$offer$2(this, (ShortNewsContentCardView) null, 15), 3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:42:0x014b  */
    /* JADX WARN: Code duplicated, block: B:43:0x014e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0166  */
    /* JADX WARN: Code duplicated, block: B:47:0x0169  */
    /* JADX WARN: Code duplicated, block: B:50:0x0192  */
    /* JADX WARN: Code duplicated, block: B:51:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object createBacklogInfoRequest(Calendar calendar, Integer num, ContinuationImpl continuationImpl) {
        setTrimPathEnd settrimpathend;
        Integer num2;
        Calendar calendar2;
        PerseusParamsConfig perseusParamsConfig;
        Calendar calendar3;
        quadToRelative quadtorelative;
        Integer num3;
        long jLongValue;
        MemoryCacheService memoryCacheService;
        Object userSessionId;
        MemoryCacheService memoryCacheService2;
        quadToRelative quadtorelative2;
        PerseusParamsConfig perseusParamsConfig2;
        Calendar calendar4;
        long j;
        String str;
        Object clientId;
        String str2;
        MemoryCacheService memoryCacheService3;
        quadToRelative quadtorelative3;
        Integer num4;
        Calendar calendar5;
        long j2;
        String str3;
        String str4;
        String globalEntityId;
        String str5;
        int i;
        long j3;
        Calendar calendar6;
        long timeInMillis;
        if (continuationImpl instanceof setTrimPathEnd) {
            settrimpathend = (setTrimPathEnd) continuationImpl;
            int i2 = settrimpathend.RatingCompat;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settrimpathend.RatingCompat = i2 - Integer.MIN_VALUE;
            } else {
                settrimpathend = new setTrimPathEnd(this, continuationImpl);
            }
        } else {
            settrimpathend = new setTrimPathEnd(this, continuationImpl);
        }
        Object obj = settrimpathend.MediaBrowserCompatMediaItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = settrimpathend.RatingCompat;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object objClone = calendar.clone();
            objClone.getClass();
            Calendar calendar7 = (Calendar) objClone;
            DefaultPerseusConfigProvider defaultPerseusConfigProvider = updateRenderPath.MediaSessionCompatQueueItem;
            settrimpathend.read = num;
            settrimpathend.serializer = calendar7;
            settrimpathend.RatingCompat = 1;
            Object config = defaultPerseusConfigProvider.getConfig(settrimpathend);
            if (config != coroutineSingletons) {
                num2 = num;
                calendar2 = calendar7;
                obj = config;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            calendar2 = settrimpathend.serializer;
            num2 = settrimpathend.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i3 == 2) {
                quadtorelative = settrimpathend.RemoteActionCompatParcelizer;
                perseusParamsConfig = settrimpathend.write;
                calendar3 = settrimpathend.serializer;
                num3 = settrimpathend.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                jLongValue = ((Number) obj).longValue();
                memoryCacheService = this.serializer;
                if (memoryCacheService == null) {
                    return new BackLogInfoRequest("", "", 0, 0L, new Integer(0), 0L, 0, "", "", "", "", "", "", "", SimpleItemTouchHelperCallback.serializer);
                }
                settrimpathend.read = num3;
                settrimpathend.serializer = calendar3;
                settrimpathend.write = perseusParamsConfig;
                settrimpathend.RemoteActionCompatParcelizer = quadtorelative;
                settrimpathend.MediaDescriptionCompat = memoryCacheService;
                settrimpathend.IconCompatParcelizer = jLongValue;
                settrimpathend.RatingCompat = 3;
                userSessionId = this.write.getUserSessionId(settrimpathend);
                if (userSessionId != coroutineSingletons) {
                    quadToRelative quadtorelative4 = quadtorelative;
                    memoryCacheService2 = memoryCacheService;
                    obj = userSessionId;
                    Calendar calendar8 = calendar3;
                    quadtorelative2 = quadtorelative4;
                    perseusParamsConfig2 = perseusParamsConfig;
                    calendar4 = calendar8;
                    j = jLongValue;
                    str = (String) obj;
                    settrimpathend.read = num3;
                    settrimpathend.serializer = calendar4;
                    settrimpathend.write = perseusParamsConfig2;
                    settrimpathend.RemoteActionCompatParcelizer = quadtorelative2;
                    settrimpathend.MediaDescriptionCompat = memoryCacheService2;
                    settrimpathend.MediaSessionCompatQueueItem = str;
                    settrimpathend.IconCompatParcelizer = j;
                    settrimpathend.RatingCompat = 4;
                    clientId = this.MediaDescriptionCompat.getClientId(settrimpathend);
                    if (clientId != coroutineSingletons) {
                        str2 = str;
                        obj = clientId;
                        long j4 = j;
                        memoryCacheService3 = memoryCacheService2;
                        quadtorelative3 = quadtorelative2;
                        num4 = num3;
                        calendar5 = calendar4;
                        j2 = j4;
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 3) {
                j = settrimpathend.IconCompatParcelizer;
                memoryCacheService2 = settrimpathend.MediaDescriptionCompat;
                quadtorelative2 = settrimpathend.RemoteActionCompatParcelizer;
                PerseusParamsConfig perseusParamsConfig3 = settrimpathend.write;
                Calendar calendar9 = settrimpathend.serializer;
                Integer num5 = settrimpathend.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                perseusParamsConfig2 = perseusParamsConfig3;
                num3 = num5;
                calendar4 = calendar9;
                str = (String) obj;
                settrimpathend.read = num3;
                settrimpathend.serializer = calendar4;
                settrimpathend.write = perseusParamsConfig2;
                settrimpathend.RemoteActionCompatParcelizer = quadtorelative2;
                settrimpathend.MediaDescriptionCompat = memoryCacheService2;
                settrimpathend.MediaSessionCompatQueueItem = str;
                settrimpathend.IconCompatParcelizer = j;
                settrimpathend.RatingCompat = 4;
                clientId = this.MediaDescriptionCompat.getClientId(settrimpathend);
                if (clientId != coroutineSingletons) {
                    str2 = str;
                    obj = clientId;
                    long j5 = j;
                    memoryCacheService3 = memoryCacheService2;
                    quadtorelative3 = quadtorelative2;
                    num4 = num3;
                    calendar5 = calendar4;
                    j2 = j5;
                }
                return coroutineSingletons;
            }
            if (i3 == 4) {
                long j6 = settrimpathend.IconCompatParcelizer;
                String str6 = settrimpathend.MediaSessionCompatQueueItem;
                memoryCacheService3 = settrimpathend.MediaDescriptionCompat;
                quadtorelative3 = settrimpathend.RemoteActionCompatParcelizer;
                PerseusParamsConfig perseusParamsConfig4 = settrimpathend.write;
                calendar5 = settrimpathend.serializer;
                Integer num6 = settrimpathend.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                j2 = j6;
                str2 = str6;
                perseusParamsConfig2 = perseusParamsConfig4;
                num4 = num6;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        str3 = (String) obj;
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        String entity = perseusParamsConfig2.getEntity();
        int batchSize = perseusParamsConfig2.getBatchSize();
        String appVersionName = perseusParamsConfig2.getAppVersionName();
        String countryCode = perseusParamsConfig2.getCountryCode();
        globalEntityId = perseusParamsConfig2.getGlobalEntityId();
        if (globalEntityId == null) {
            str5 = "";
        } else {
            str5 = globalEntityId;
        }
        Map mapIconCompatParcelizer = IconCompatParcelizer(quadtorelative3.write);
        i = quadtorelative3.serializer;
        j3 = quadtorelative3.read;
        memoryCacheService3.getClass();
        str2.getClass();
        entity.getClass();
        appVersionName.getClass();
        countryCode.getClass();
        calendar5.getClass();
        Object objClone2 = calendar5.clone();
        objClone2.getClass();
        calendar6 = (Calendar) objClone2;
        if (i > 0) {
            timeInMillis = (calendar6.getTimeInMillis() / 1000) - (j3 / 1000);
        } else {
            timeInMillis = 0;
        }
        return new BackLogInfoRequest(setNativeShader.serializer(calendar6), entity, i, timeInMillis, num4, j2, batchSize, appVersionName, "Android", countryCode, str5, "5.8.1", str2, str4, mapIconCompatParcelizer);
        PerseusParamsConfig perseusParamsConfig5 = (PerseusParamsConfig) obj;
        quadToRelative quadtorelativeMediaMetadataCompat = this.RemoteActionCompatParcelizer.MediaMetadataCompat();
        settrimpathend.read = num2;
        settrimpathend.serializer = calendar2;
        settrimpathend.write = perseusParamsConfig5;
        settrimpathend.RemoteActionCompatParcelizer = quadtorelativeMediaMetadataCompat;
        settrimpathend.RatingCompat = 2;
        Object batchDispatchHitsDelay = this.IconCompatParcelizer.getBatchDispatchHitsDelay(settrimpathend);
        if (batchDispatchHitsDelay != coroutineSingletons) {
            perseusParamsConfig = perseusParamsConfig5;
            obj = batchDispatchHitsDelay;
            Integer num7 = num2;
            calendar3 = calendar2;
            quadtorelative = quadtorelativeMediaMetadataCompat;
            num3 = num7;
            jLongValue = ((Number) obj).longValue();
            memoryCacheService = this.serializer;
            if (memoryCacheService == null) {
                return new BackLogInfoRequest("", "", 0, 0L, new Integer(0), 0L, 0, "", "", "", "", "", "", "", SimpleItemTouchHelperCallback.serializer);
            }
            settrimpathend.read = num3;
            settrimpathend.serializer = calendar3;
            settrimpathend.write = perseusParamsConfig;
            settrimpathend.RemoteActionCompatParcelizer = quadtorelative;
            settrimpathend.MediaDescriptionCompat = memoryCacheService;
            settrimpathend.IconCompatParcelizer = jLongValue;
            settrimpathend.RatingCompat = 3;
            userSessionId = this.write.getUserSessionId(settrimpathend);
            if (userSessionId != coroutineSingletons) {
                quadToRelative quadtorelative5 = quadtorelative;
                memoryCacheService2 = memoryCacheService;
                obj = userSessionId;
                Calendar calendar10 = calendar3;
                quadtorelative2 = quadtorelative5;
                perseusParamsConfig2 = perseusParamsConfig;
                calendar4 = calendar10;
                j = jLongValue;
                str = (String) obj;
                settrimpathend.read = num3;
                settrimpathend.serializer = calendar4;
                settrimpathend.write = perseusParamsConfig2;
                settrimpathend.RemoteActionCompatParcelizer = quadtorelative2;
                settrimpathend.MediaDescriptionCompat = memoryCacheService2;
                settrimpathend.MediaSessionCompatQueueItem = str;
                settrimpathend.IconCompatParcelizer = j;
                settrimpathend.RatingCompat = 4;
                clientId = this.MediaDescriptionCompat.getClientId(settrimpathend);
                if (clientId != coroutineSingletons) {
                    str2 = str;
                    obj = clientId;
                    long j7 = j;
                    memoryCacheService3 = memoryCacheService2;
                    quadtorelative3 = quadtorelative2;
                    num4 = num3;
                    calendar5 = calendar4;
                    j2 = j7;
                    str3 = (String) obj;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    String entity2 = perseusParamsConfig2.getEntity();
                    int batchSize2 = perseusParamsConfig2.getBatchSize();
                    String appVersionName2 = perseusParamsConfig2.getAppVersionName();
                    String countryCode2 = perseusParamsConfig2.getCountryCode();
                    globalEntityId = perseusParamsConfig2.getGlobalEntityId();
                    if (globalEntityId == null) {
                        str5 = "";
                    } else {
                        str5 = globalEntityId;
                    }
                    Map mapIconCompatParcelizer2 = IconCompatParcelizer(quadtorelative3.write);
                    i = quadtorelative3.serializer;
                    j3 = quadtorelative3.read;
                    memoryCacheService3.getClass();
                    str2.getClass();
                    entity2.getClass();
                    appVersionName2.getClass();
                    countryCode2.getClass();
                    calendar5.getClass();
                    Object objClone3 = calendar5.clone();
                    objClone3.getClass();
                    calendar6 = (Calendar) objClone3;
                    if (i > 0) {
                        timeInMillis = (calendar6.getTimeInMillis() / 1000) - (j3 / 1000);
                    } else {
                        timeInMillis = 0;
                    }
                    return new BackLogInfoRequest(setNativeShader.serializer(calendar6), entity2, i, timeInMillis, num4, j2, batchSize2, appVersionName2, "Android", countryCode2, str5, "5.8.1", str2, str4, mapIconCompatParcelizer2);
                }
            }
        }
        return coroutineSingletons;
    }

    public static Map IconCompatParcelizer(List list) {
        if (list.isEmpty()) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((horizontalLineToRelative) obj).read;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((horizontalLineToRelative) it.next()).RemoteActionCompatParcelizer;
            }
            horizontalLineToRelative horizontallinetorelative = (horizontalLineToRelative) onContentCardDismissed.MediaMetadataCompat(list2);
            linkedHashMap2.put(key, onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("total_event_count", Integer.valueOf(i)), new onViewAttachedToWindowlambda0(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(horizontallinetorelative != null ? horizontallinetorelative.write : 0))));
        }
        return linkedHashMap2;
    }
}
