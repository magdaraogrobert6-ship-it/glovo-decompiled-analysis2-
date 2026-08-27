package com.sentiance.sdk.usercontext;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.feature.FeatureType;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.sentiance.sdk.usercontext.UserContextProvider;
import com.sentiance.sdk.usercontext.api.RequestUserContextError;
import com.sentiance.sdk.usercontext.api.RequestUserContextFailureReason;
import com.sentiance.sdk.usercontext.api.UserContext;
import com.sentiance.sdk.usercontext.api.UserContextUpdateCriteria;
import com.sentiance.sdk.usercontext.api.UserContextUpdateListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeNotificationUtilsExternalSyntheticLambda14;
import o.ItemTouchHelperAdapter;
import o.accessgetDataStoremigrateGeofencesListToJson;
import o.accessgetDataStoremigrateIndividualReeligibilityMapToJson;
import o.getAnalyticsEnabledEnterannotations;
import o.getApiKey;
import o.getCieXyz;
import o.getConversationPersonMap;
import o.migrateFeatureFlagImpressionMapToJson;
import o.migrateFeatureFlagStorageToJson;
import o.onContentCardDismissed;
import o.parseLonglambda0;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog;
import o.r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg;
import o.readBoolean;
import o.readandroid_sdk_base_release;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "UserContextProvider")
public final class UserContextProvider implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private static final byte[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int write = 0;
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final getConversationPersonMap MediaBrowserCompatMediaItem;
    private final ArrayList MediaDescriptionCompat;
    private r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ MediaMetadataCompat;
    private final parseLonglambda0 MediaSessionCompatQueueItem;
    private final EnumMap<UserContextUpdateCriteria, Set<migrateFeatureFlagImpressionMapToJson>> RatingCompat;
    private final readandroid_sdk_base_release read;
    private final getApiKey serializer;

    public enum ChangeType {
        PROVISIONAL,
        NON_PROVISIONAL,
        NO_CHANGE
    }

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static void RemoteActionCompatParcelizer(UserContextProvider userContextProvider) {
        r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer;
        synchronized (userContextProvider.MediaMetadataCompat) {
            r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq = userContextProvider.MediaMetadataCompat;
            r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq2 = getApiKey.write;
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdarsg9irie_nt_zbfpq8jag00_omq, r8lambdarsg9irie_nt_zbfpq8jag00_omq2}, getCieXyz.write())).booleanValue();
            getConversationPersonMap getconversationpersonmap = userContextProvider.MediaBrowserCompatMediaItem;
            if (zBooleanValue) {
                if (getconversationpersonmap.read(FeatureType.USER_CONTEXT)) {
                    r8lambdarsg9irie_nt_zbfpq8jag00_omq2 = userContextProvider.serializer.read();
                } else {
                    r8lambdarsg9irie_nt_zbfpq8jag00_omq2.getClass();
                }
            } else if (getconversationpersonmap.read(FeatureType.USER_CONTEXT)) {
                r8lambdarsg9irie_nt_zbfpq8jag00_omq2 = userContextProvider.serializer.read(userContextProvider.MediaMetadataCompat);
            } else {
                r8lambdarsg9irie_nt_zbfpq8jag00_omq2.getClass();
            }
            userContextProvider.MediaMetadataCompat = r8lambdarsg9irie_nt_zbfpq8jag00_omq2;
            r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer = r8lambdarsg9irie_nt_zbfpq8jag00_omq2.serializer();
        }
        synchronized (userContextProvider.MediaDescriptionCompat) {
            try {
                if (r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer == null) {
                    userContextProvider.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Copy of the user context info was null", new Object[0]);
                    Iterator it = userContextProvider.MediaDescriptionCompat.iterator();
                    while (it.hasNext()) {
                        ((migrateFeatureFlagStorageToJson) it.next()).write().serializer(new RequestUserContextError(RequestUserContextFailureReason.UNEXPECTED_ERROR));
                    }
                } else {
                    for (migrateFeatureFlagStorageToJson migratefeatureflagstoragetojson : userContextProvider.MediaDescriptionCompat) {
                        migratefeatureflagstoragetojson.write().write(migratefeatureflagstoragetojson.serializer() ? r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer.IconCompatParcelizer() : r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer.RemoteActionCompatParcelizer());
                    }
                }
                userContextProvider.MediaDescriptionCompat.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void RemoteActionCompatParcelizer(UserContextProvider userContextProvider, final List list) {
        r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq;
        ChangeType changeType;
        final r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer;
        Set<migrateFeatureFlagImpressionMapToJson> setR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        synchronized (userContextProvider.MediaMetadataCompat) {
            r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq2 = userContextProvider.MediaMetadataCompat;
            if (userContextProvider.MediaBrowserCompatMediaItem.read(FeatureType.USER_CONTEXT)) {
                r8lambdarsg9irie_nt_zbfpq8jag00_omq = userContextProvider.serializer.read();
            } else {
                r8lambdarsg9irie_nt_zbfpq8jag00_omq = getApiKey.write;
                r8lambdarsg9irie_nt_zbfpq8jag00_omq.getClass();
            }
            userContextProvider.MediaMetadataCompat = r8lambdarsg9irie_nt_zbfpq8jag00_omq;
            changeType = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdarsg9irie_nt_zbfpq8jag00_omq2.RemoteActionCompatParcelizer(), r8lambdarsg9irie_nt_zbfpq8jag00_omq.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue() ? !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdarsg9irie_nt_zbfpq8jag00_omq2.IconCompatParcelizer(), r8lambdarsg9irie_nt_zbfpq8jag00_omq.IconCompatParcelizer()}, getCieXyz.write())).booleanValue() ? ChangeType.PROVISIONAL : ChangeType.NO_CHANGE : ChangeType.NON_PROVISIONAL;
            r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer = userContextProvider.MediaMetadataCompat.serializer();
        }
        if (changeType == ChangeType.NO_CHANGE) {
            userContextProvider.MediaSessionCompatQueueItem.IconCompatParcelizer("User context did not change, aborting.", new Object[0]);
            return;
        }
        if (r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer == null) {
            userContextProvider.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Copy of the user context info is null", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserContextUpdateCriteria userContextUpdateCriteria = (UserContextUpdateCriteria) it.next();
            synchronized (userContextProvider.RatingCompat) {
                ChangeType changeType2 = ChangeType.PROVISIONAL;
                EnumMap<UserContextUpdateCriteria, Set<migrateFeatureFlagImpressionMapToJson>> enumMap = userContextProvider.RatingCompat;
                if (changeType == changeType2) {
                    Set<migrateFeatureFlagImpressionMapToJson> set = enumMap.get(userContextUpdateCriteria);
                    if (set != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : set) {
                            if (((migrateFeatureFlagImpressionMapToJson) obj).write()) {
                                arrayList2.add(obj);
                            }
                        }
                        setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
                    } else {
                        setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                    }
                    if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                        setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = itemTouchHelperAdapter;
                    }
                } else {
                    setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = enumMap.get(userContextUpdateCriteria);
                    if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                        setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = itemTouchHelperAdapter;
                    }
                }
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, (Collection) arrayList);
        }
        for (final migrateFeatureFlagImpressionMapToJson migratefeatureflagimpressionmaptojson : onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList)) {
            readBoolean.serializer(new Runnable() { // from class: o.migrateFeatureFlagStorageToJsonlambda30
                @Override // java.lang.Runnable
                public final void run() {
                    int i = UserContextProvider.write;
                    migrateFeatureFlagImpressionMapToJson migratefeatureflagimpressionmaptojson2 = migratefeatureflagimpressionmaptojson;
                    migratefeatureflagimpressionmaptojson2.getClass();
                    migratefeatureflagimpressionmaptojson2.serializer(list, r8lambdarsg9irie_nt_zbfpq8jag00_omqSerializer);
                }
            });
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return this.serializer.serializer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this.MediaMetadataCompat) {
            r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq = getApiKey.write;
            r8lambdarsg9irie_nt_zbfpq8jag00_omq.getClass();
            this.MediaMetadataCompat = r8lambdarsg9irie_nt_zbfpq8jag00_omq;
        }
        synchronized (this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat.clear();
        }
        synchronized (this.RatingCompat) {
            this.RatingCompat.clear();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq = getApiKey.write;
        r8lambdarsg9irie_nt_zbfpq8jag00_omq.getClass();
        this.MediaMetadataCompat = r8lambdarsg9irie_nt_zbfpq8jag00_omq;
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.read;
        accessgetDataStoremigrateGeofencesListToJson accessgetdatastoremigrategeofenceslisttojson = new accessgetDataStoremigrateGeofencesListToJson(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.IconCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, accessgetdatastoremigrategeofenceslisttojson);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg.class, new accessgetDataStoremigrateIndividualReeligibilityMapToJson(this, readandroid_sdk_base_releaseVar));
    }

    static {
        new read(null);
        RemoteActionCompatParcelizer = new byte[]{1};
    }

    public UserContextProvider(readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getApiKey getapikey, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, parseLonglambda0 parselonglambda0, getConversationPersonMap getconversationpersonmap) {
        readandroid_sdk_base_releaseVar.getClass();
        getapikey.getClass();
        getanalyticsenabledenterannotations.getClass();
        parselonglambda0.getClass();
        getconversationpersonmap.getClass();
        this.read = readandroid_sdk_base_releaseVar;
        this.serializer = getapikey;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaSessionCompatQueueItem = parselonglambda0;
        this.MediaBrowserCompatMediaItem = getconversationpersonmap;
        this.MediaDescriptionCompat = new ArrayList();
        this.RatingCompat = new EnumMap<>(UserContextUpdateCriteria.class);
        r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq = getApiKey.write;
        r8lambdarsg9irie_nt_zbfpq8jag00_omq.getClass();
        this.MediaMetadataCompat = r8lambdarsg9irie_nt_zbfpq8jag00_omq;
    }

    public final void write(BrazeNotificationUtilsExternalSyntheticLambda14<UserContext, RequestUserContextError> brazeNotificationUtilsExternalSyntheticLambda14, boolean z) {
        brazeNotificationUtilsExternalSyntheticLambda14.getClass();
        if (!this.MediaBrowserCompatMediaItem.read(FeatureType.USER_CONTEXT)) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new RequestUserContextError(RequestUserContextFailureReason.FEATURE_NOT_ENABLED));
            return;
        }
        synchronized (this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat.add(new migrateFeatureFlagStorageToJson(brazeNotificationUtilsExternalSyntheticLambda14, z));
        }
        this.read.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(8, this));
    }

    public final void IconCompatParcelizer(boolean z, List<? extends UserContextUpdateCriteria> list, final UserContextUpdateListener userContextUpdateListener) {
        list.getClass();
        userContextUpdateListener.getClass();
        synchronized (this.RatingCompat) {
            for (UserContextUpdateCriteria userContextUpdateCriteria : UserContextUpdateCriteria.values()) {
                Set<migrateFeatureFlagImpressionMapToJson> linkedHashSet = this.RatingCompat.get(userContextUpdateCriteria);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                onContentCardDismissed.serializer((Iterable) linkedHashSet, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.usercontext.UserContextProvider$addUserContextUpdateListener$1$1$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        migrateFeatureFlagImpressionMapToJson migratefeatureflagimpressionmaptojson = (migrateFeatureFlagImpressionMapToJson) obj;
                        migratefeatureflagimpressionmaptojson.getClass();
                        return Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{migratefeatureflagimpressionmaptojson.IconCompatParcelizer(), userContextUpdateListener}, getCieXyz.write())).booleanValue());
                    }

                    {
                        super(1);
                    }
                }, false);
                if (list.contains(userContextUpdateCriteria)) {
                    linkedHashSet.add(new migrateFeatureFlagImpressionMapToJson(z, userContextUpdateListener));
                }
                this.RatingCompat.put(userContextUpdateCriteria, linkedHashSet);
            }
        }
    }

    public final void read(final UserContextUpdateListener userContextUpdateListener) {
        userContextUpdateListener.getClass();
        synchronized (this.RatingCompat) {
            Iterator it = this.RatingCompat.entrySet().iterator();
            while (it.hasNext()) {
                Set set = (Set) ((Map.Entry) it.next()).getValue();
                set.getClass();
                onContentCardDismissed.serializer((Iterable) set, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.usercontext.UserContextProvider$removeUserContextUpdateListener$1$1$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        migrateFeatureFlagImpressionMapToJson migratefeatureflagimpressionmaptojson = (migrateFeatureFlagImpressionMapToJson) obj;
                        migratefeatureflagimpressionmaptojson.getClass();
                        return Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{migratefeatureflagimpressionmaptojson.IconCompatParcelizer(), userContextUpdateListener}, getCieXyz.write())).booleanValue());
                    }

                    {
                        super(1);
                    }
                }, false);
            }
        }
    }
}
