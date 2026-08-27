package com.deliveryhero.fwf_cache;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.UriKt;
import com.deliveryhero.fwf_client.model.ProtoCustomerProfileMsg;
import com.deliveryhero.fwf_client.model.ProtoFeatureMsg;
import com.deliveryhero.fwf_client.model.ProtoFeatureOrErrorMsg;
import com.deliveryhero.fwf_client.model.ProtoFeaturesMsg;
import com.deliveryhero.fwf_client.model.ProtoHoldoutMsg;
import com.deliveryhero.fwf_evaluator.model.EvalResult;
import com.deliveryhero.fwf_logger.ILogger;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_metrics.MetricUtilsKt;
import com.deliveryhero.fwf_metrics.TagResource;
import com.deliveryhero.fwf_util.FwFSerializer;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.SerializationException;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.onContentCardDismissed;
import o.onDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambdaN7z0Ea2bnxePLVipqp_gDhWww;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resetAfterInAppMessageCloselambda2;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.setGraphicModalMaxWidthDp;
import o.setShouldNextUnregisterBeSkipped;
import o.setUnregisteredInAppMessage;
import o.setWasCloseMessageCalled;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryCache {
    private final String accessToken;
    private final Map<String, EvalResult> evaluationsCache;
    private final setCustomInAppMessageAnimationFactorylambda0 evaluationsLock;
    private final Map<String, ProtoFeatureMsg> featuresCache;
    private final setCustomInAppMessageAnimationFactorylambda0 featuresLock;
    private final Map<String, ProtoHoldoutMsg> holdoutsCache;
    private final setCustomInAppMessageAnimationFactorylambda0 holdoutsLock;
    private final ILogger logger;
    private final MetricProvider metricProvider;
    private final FwFSerializer serializer;
    private final ICache storage;
    private final boolean useRuntimeFeatureKeys;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$deleteFeature$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00931(ShortNewsContentCardView<? super C00931> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.deleteFeature(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$getFeature$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00941 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00941(ShortNewsContentCardView<? super C00941> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.getFeature(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$getFeatureWithLock$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00951(ShortNewsContentCardView<? super C00951> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.getFeatureWithLock(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$getFeatures$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00961 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C00961(ShortNewsContentCardView<? super C00961> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.getFeatures(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$getFeaturesWithLock$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00971(ShortNewsContentCardView<? super C00971> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.getFeaturesWithLock(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$getHoldouts$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00981(ShortNewsContentCardView<? super C00981> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.getHoldouts(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$getHoldoutsWithLock$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00991(ShortNewsContentCardView<? super C00991> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.getHoldoutsWithLock(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$setFeatureWithLock$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01001(ShortNewsContentCardView<? super C01001> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.setFeatureWithLock(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$setFeatures$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01011(ShortNewsContentCardView<? super C01011> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.setFeatures(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_cache.MemoryCache$setHoldouts$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01021(ShortNewsContentCardView<? super C01021> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryCache.this.setHoldouts(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoFeaturesMsg decodeInitialData(final byte[] bArr) {
        final Map<String, String> mapSerializer = onMove.serializer(MetricUtilsKt.getResourceTag(TagResource.INITIAL_DATA));
        return (ProtoFeaturesMsg) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, mapSerializer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache.decodeInitialData.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final ProtoFeaturesMsg invoke() {
                String decodingError;
                Object objWrite;
                FwFSerializer fwFSerializer = MemoryCache.this.serializer;
                byte[] bArr2 = bArr;
                MemoryCache memoryCache = MemoryCache.this;
                Map<String, String> map = mapSerializer;
                try {
                    prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                    prepareinappmessagewithzippedassethtmllambda4.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoFeaturesMsg.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    objWrite = prepareinappmessagewithzippedassethtmllambda4.write(setgraphicmodalmaxwidthdpSerializer, bArr2);
                } catch (SerializationException e) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                    MetricProvider.incrementCounter$fwf_client_release$default(memoryCache.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                    m1$$ExternalSyntheticOutline0.m("Decoding initial data failed: ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                    objWrite = null;
                } catch (IllegalArgumentException e2) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                    MetricProvider.incrementCounter$fwf_client_release$default(memoryCache.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                    m1$$ExternalSyntheticOutline0.m("Decoding initial data failed: ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                    objWrite = null;
                }
                return (ProtoFeaturesMsg) objWrite;
            }
        });
    }

    private final setShouldNextUnregisterBeSkipped getFeaturesUpdateTime() {
        byte[] fromStorage = getFromStorage(UtilKt.generateFeaturesUpdatedAtKey(this.accessToken));
        Long lParcelableVolumeInfo = fromStorage != null ? setCarryoverInAppMessage.ParcelableVolumeInfo(setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage)) : null;
        if (lParcelableVolumeInfo == null) {
            return null;
        }
        long jLongValue = lParcelableVolumeInfo.longValue();
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
        instantOfEpochMilli.getClass();
        return new setShouldNextUnregisterBeSkipped(instantOfEpochMilli);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void migrateHoldoutKeys(String str) {
        String strRemoteActionCompatParcelizer;
        FwFSerializer fwFSerializer = this.serializer;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        try {
            resetTransientState resettransientstate = fwFSerializer.json;
            resettransientstate.getClass();
            strRemoteActionCompatParcelizer = resettransientstate.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(onDismissed.write)), simpleItemTouchHelperCallback);
        } catch (SerializationException e) {
            fwFSerializer.getEncodingError(String.valueOf(e));
            strRemoteActionCompatParcelizer = null;
        } catch (IllegalArgumentException e2) {
            fwFSerializer.getEncodingError(String.valueOf(e2));
            strRemoteActionCompatParcelizer = null;
        }
        byte[] bArrRatingCompat = strRemoteActionCompatParcelizer != null ? setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer) : null;
        if (bArrRatingCompat != null) {
            this.logger.logD(UtilKt.MODULE_NAME, "Holdout keys migrated");
            ICache iCache = this.storage;
            if (iCache != null) {
                iCache.set(str, bArrRatingCompat);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInitialDataProfileAttributes(Set<String> set) {
        String encodingError;
        ICache iCache;
        String decodingError;
        Object objSerializer;
        String encodingError2;
        ICache iCache2;
        String strGenerateProfileAttributesKey = UtilKt.generateProfileAttributesKey(this.accessToken);
        byte[] fromStorage = getFromStorage(strGenerateProfileAttributesKey);
        FwFSerializer fwFSerializer = this.serializer;
        String strRemoteActionCompatParcelizer = null;
        if (fromStorage == null) {
            try {
                resetTransientState resettransientstate = fwFSerializer.json;
                resettransientstate.getClass();
                strRemoteActionCompatParcelizer = resettransientstate.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1), set);
            } catch (SerializationException e) {
                encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
                m1$$ExternalSyntheticOutline0.m("Encoding profile attributes for initial data failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
            } catch (IllegalArgumentException e2) {
                encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
                m1$$ExternalSyntheticOutline0.m("Encoding profile attributes for initial data failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
            }
            if (strRemoteActionCompatParcelizer == null || (iCache = this.storage) == null) {
                return;
            }
            iCache.set(strGenerateProfileAttributesKey, setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer));
            return;
        }
        String strRemoteActionCompatParcelizer2 = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
        try {
            resetTransientState resettransientstate2 = fwFSerializer.json;
            resettransientstate2.getClass();
            objSerializer = resettransientstate2.serializer(strRemoteActionCompatParcelizer2, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1));
        } catch (SerializationException e3) {
            decodingError = fwFSerializer.getDecodingError(String.valueOf(e3));
            m1$$ExternalSyntheticOutline0.m("Decoding stored profile attributes for initial data failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
            objSerializer = null;
        } catch (IllegalArgumentException e4) {
            decodingError = fwFSerializer.getDecodingError(String.valueOf(e4));
            m1$$ExternalSyntheticOutline0.m("Decoding stored profile attributes for initial data failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
            objSerializer = null;
        }
        Set set2 = (Set) objSerializer;
        if (set2 != null) {
            LinkedHashSet linkedHashSet = RangesKt.read(set2, set);
            if (linkedHashSet.equals(set2)) {
                return;
            }
            this.logger.logD(UtilKt.MODULE_NAME, "New profile attributes found, adding to storage");
            FwFSerializer fwFSerializer2 = this.serializer;
            try {
                resetTransientState resettransientstate3 = fwFSerializer2.json;
                resettransientstate3.getClass();
                strRemoteActionCompatParcelizer = resettransientstate3.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1), linkedHashSet);
            } catch (SerializationException e5) {
                encodingError2 = fwFSerializer2.getEncodingError(String.valueOf(e5));
                m1$$ExternalSyntheticOutline0.m("Encoding profile attributes for initial data failed - ", encodingError2, this.logger, UtilKt.MODULE_NAME);
            } catch (IllegalArgumentException e6) {
                encodingError2 = fwFSerializer2.getEncodingError(String.valueOf(e6));
                m1$$ExternalSyntheticOutline0.m("Encoding profile attributes for initial data failed - ", encodingError2, this.logger, UtilKt.MODULE_NAME);
            }
            if (strRemoteActionCompatParcelizer == null || (iCache2 = this.storage) == null) {
                return;
            }
            iCache2.set(strGenerateProfileAttributesKey, setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer));
        }
    }

    public final Map<String, String> getAccountConfig$fwf_client_release() {
        final byte[] fromStorage = getFromStorage(UtilKt.generateAccountConfigKey(this.accessToken));
        if (fromStorage != null) {
            return (Map) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, onMove.serializer(MetricUtilsKt.getResourceTag(TagResource.ACCOUNT_CONFIG)), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$getAccountConfig$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Map<String, String> invoke() {
                    String decodingError;
                    Object objSerializer;
                    FwFSerializer fwFSerializer = this.this$0.serializer;
                    String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
                    MemoryCache memoryCache = this.this$0;
                    try {
                        resetTransientState resettransientstate = fwFSerializer.json;
                        resettransientstate.getClass();
                        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                        objSerializer = resettransientstate.serializer(strRemoteActionCompatParcelizer, new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed));
                    } catch (SerializationException e) {
                        decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                        m1$$ExternalSyntheticOutline0.m("Decoding account config failed - ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                        objSerializer = null;
                    } catch (IllegalArgumentException e2) {
                        decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                        m1$$ExternalSyntheticOutline0.m("Decoding account config failed - ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                        objSerializer = null;
                    }
                    return (Map) objSerializer;
                }
            });
        }
        return null;
    }

    public final Map<String, Long> getHoldoutKeys$fwf_client_release() {
        final String strGenerateHoldoutKeysConfigCacheKey = UtilKt.generateHoldoutKeysConfigCacheKey(this.accessToken);
        final byte[] fromStorage = getFromStorage(strGenerateHoldoutKeysConfigCacheKey);
        return fromStorage != null ? (Map) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, onMove.serializer(MetricUtilsKt.getResourceTag(TagResource.HOLDOUT_KEYS)), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$getHoldoutKeys$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Map<String, Long> invoke() {
                String decodingError;
                Object objSerializer;
                FwFSerializer fwFSerializer = this.this$0.serializer;
                String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
                MemoryCache memoryCache = this.this$0;
                String str = strGenerateHoldoutKeysConfigCacheKey;
                try {
                    resetTransientState resettransientstate = fwFSerializer.json;
                    resettransientstate.getClass();
                    objSerializer = resettransientstate.serializer(strRemoteActionCompatParcelizer, new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(onDismissed.write)));
                } catch (SerializationException e) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                    m1$$ExternalSyntheticOutline0.m("Decoding holdout keys failed - ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                    memoryCache.migrateHoldoutKeys(str);
                    objSerializer = null;
                } catch (IllegalArgumentException e2) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                    m1$$ExternalSyntheticOutline0.m("Decoding holdout keys failed - ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                    memoryCache.migrateHoldoutKeys(str);
                    objSerializer = null;
                }
                Map<String, Long> map = (Map) objSerializer;
                return map == null ? SimpleItemTouchHelperCallback.serializer : map;
            }
        }) : SimpleItemTouchHelperCallback.serializer;
    }

    public final Set<String> getProfileAttributes$fwf_client_release() {
        final byte[] fromStorage = getFromStorage(UtilKt.generateProfileAttributesKey(this.accessToken));
        return fromStorage != null ? (Set) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, onMove.serializer(MetricUtilsKt.getResourceTag(TagResource.PROFILE_ATTRIBUTES)), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$getProfileAttributes$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Set<String> invoke() {
                String decodingError;
                Object objSerializer;
                FwFSerializer fwFSerializer = this.this$0.serializer;
                String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
                MemoryCache memoryCache = this.this$0;
                try {
                    resetTransientState resettransientstate = fwFSerializer.json;
                    resettransientstate.getClass();
                    objSerializer = resettransientstate.serializer(strRemoteActionCompatParcelizer, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1));
                } catch (SerializationException e) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                    m1$$ExternalSyntheticOutline0.m("Decoding profile attributes failed - ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                    objSerializer = null;
                } catch (IllegalArgumentException e2) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                    m1$$ExternalSyntheticOutline0.m("Decoding profile attributes failed - ", decodingError, memoryCache.logger, UtilKt.MODULE_NAME);
                    objSerializer = null;
                }
                Set<String> set = (Set) objSerializer;
                return set == null ? ItemTouchHelperAdapter.serializer : set;
            }
        }) : ItemTouchHelperAdapter.serializer;
    }

    public final void setFeaturesUpdateTime$fwf_client_release() {
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        instant.getClass();
        byte[] bArrRatingCompat = setCarryoverInAppMessage.RatingCompat(String.valueOf(new setShouldNextUnregisterBeSkipped(instant).RemoteActionCompatParcelizer()));
        ICache iCache = this.storage;
        if (iCache != null) {
            iCache.set(UtilKt.generateFeaturesUpdatedAtKey(this.accessToken), bArrRatingCompat);
        }
    }

    public MemoryCache(ICache iCache, String str, ILogger iLogger, MetricProvider metricProvider, FwFSerializer fwFSerializer, boolean z) {
        str.getClass();
        iLogger.getClass();
        metricProvider.getClass();
        fwFSerializer.getClass();
        this.storage = iCache;
        this.accessToken = str;
        this.logger = iLogger;
        this.metricProvider = metricProvider;
        this.serializer = fwFSerializer;
        this.useRuntimeFeatureKeys = z;
        this.featuresCache = new LinkedHashMap();
        this.featuresLock = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.holdoutsCache = new LinkedHashMap();
        this.holdoutsLock = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.evaluationsCache = new LinkedHashMap();
        this.evaluationsLock = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    }

    public final void bootstrapInitialData$fwf_client_release(final byte[] bArr) {
        bArr.getClass();
        MetricProvider metricProvider = this.metricProvider;
        Map<String, String> mapSingletonMap = Collections.singletonMap("data_size", String.valueOf(bArr.length));
        mapSingletonMap.getClass();
        metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_INITIAL_DATA_DURATION, mapSingletonMap, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$bootstrapInitialData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final createFromParcel invoke() {
                ProtoFeaturesMsg protoFeaturesMsgDecodeInitialData = this.this$0.decodeInitialData(bArr);
                ArrayList arrayList = null;
                if (protoFeaturesMsgDecodeInitialData == null) {
                    return null;
                }
                MemoryCache memoryCache = this.this$0;
                Map<String, ProtoFeatureOrErrorMsg> features = protoFeaturesMsgDecodeInitialData.getFeatures();
                if (features != null) {
                    arrayList = new ArrayList();
                    Iterator<Map.Entry<String, ProtoFeatureOrErrorMsg>> it = features.entrySet().iterator();
                    while (it.hasNext()) {
                        ProtoFeatureMsg feature = it.next().getValue().getFeature();
                        if (feature != null) {
                            arrayList.add(feature);
                        }
                    }
                }
                if (arrayList != null) {
                    ILogger iLogger = memoryCache.logger;
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((ProtoFeatureMsg) it2.next()).getKey());
                    }
                    iLogger.logD(UtilKt.MODULE_NAME, "Valid features found in initial data: " + arrayList2);
                    memoryCache.setInitialDataFeatures(arrayList);
                }
                Map<String, ProtoHoldoutMsg> holdouts = protoFeaturesMsgDecodeInitialData.getHoldouts();
                if (holdouts != null) {
                    ILogger iLogger2 = memoryCache.logger;
                    ArrayList arrayList3 = new ArrayList(holdouts.size());
                    Iterator<Map.Entry<String, ProtoHoldoutMsg>> it3 = holdouts.entrySet().iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(it3.next().getKey());
                    }
                    iLogger2.logD(UtilKt.MODULE_NAME, "Holdouts found in initial data: " + arrayList3);
                    memoryCache.setInitialDataHoldouts(onContentCardDismissed.PlaybackStateCompat(holdouts.values()));
                }
                if (!protoFeaturesMsgDecodeInitialData.getProfileAttributes().isEmpty()) {
                    memoryCache.logger.logD(UtilKt.MODULE_NAME, "Profile attributes found in initial data: " + protoFeaturesMsgDecodeInitialData.getProfileAttributes());
                    memoryCache.setInitialDataProfileAttributes(protoFeaturesMsgDecodeInitialData.getProfileAttributes());
                }
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final Map<String, Object> getCustomerProfile$fwf_client_release(String str, final String str2) {
        str.getClass();
        str2.getClass();
        String strGenerateCustomerProfileKey = UtilKt.generateCustomerProfileKey(str, str2);
        final byte[] fromStorage = getFromStorage(strGenerateCustomerProfileKey);
        if (fromStorage == null) {
            return null;
        }
        final Map<String, String> mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(MetricUtilsKt.getResourceTag(TagResource.CUSTOMER_PROFILE), MetricUtilsKt.getCacheKeyTag(strGenerateCustomerProfileKey));
        return (Map) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, mapRemoteActionCompatParcelizer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$getCustomerProfile$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Map<String, Object> invoke() {
                String decodingError;
                Object objWrite;
                FwFSerializer fwFSerializer = this.this$0.serializer;
                byte[] bArr = fromStorage;
                MemoryCache memoryCache = this.this$0;
                Map<String, String> map = mapRemoteActionCompatParcelizer;
                String str3 = str2;
                try {
                    prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                    prepareinappmessagewithzippedassethtmllambda4.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoCustomerProfileMsg.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    objWrite = prepareinappmessagewithzippedassethtmllambda4.write(setgraphicmodalmaxwidthdpSerializer, bArr);
                } catch (SerializationException e) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                    MetricProvider.incrementCounter$fwf_client_release$default(memoryCache.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                    memoryCache.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding customer profile ", str3, " failed - ", decodingError));
                    objWrite = null;
                } catch (IllegalArgumentException e2) {
                    decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                    MetricProvider.incrementCounter$fwf_client_release$default(memoryCache.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                    memoryCache.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding customer profile ", str3, " failed - ", decodingError));
                    objWrite = null;
                }
                ProtoCustomerProfileMsg protoCustomerProfileMsg = (ProtoCustomerProfileMsg) objWrite;
                if (protoCustomerProfileMsg != null) {
                    return protoCustomerProfileMsg.toMap();
                }
                return null;
            }
        });
    }

    public final setShouldNextUnregisterBeSkipped getCustomerProfileUpdateTime$fwf_client_release(String str, String str2) {
        str.getClass();
        str2.getClass();
        byte[] fromStorage = getFromStorage(UtilKt.generateCustomerProfileUpdatedAtKey(str, str2));
        Long lParcelableVolumeInfo = fromStorage != null ? setCarryoverInAppMessage.ParcelableVolumeInfo(setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage)) : null;
        if (lParcelableVolumeInfo == null) {
            return null;
        }
        long jLongValue = lParcelableVolumeInfo.longValue();
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
        instantOfEpochMilli.getClass();
        return new setShouldNextUnregisterBeSkipped(instantOfEpochMilli);
    }

    public final void setCustomerProfileUpdateTime$fwf_client_release(String str, String str2) {
        str.getClass();
        str2.getClass();
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        instant.getClass();
        byte[] bArrRatingCompat = setCarryoverInAppMessage.RatingCompat(String.valueOf(new setShouldNextUnregisterBeSkipped(instant).RemoteActionCompatParcelizer()));
        ICache iCache = this.storage;
        if (iCache != null) {
            iCache.set(UtilKt.generateCustomerProfileUpdatedAtKey(str, str2), bArrRatingCompat);
        }
    }

    private final Map<String, ProtoFeatureMsg> decodeFeatures(final Map<String, byte[]> map) {
        final Map<String, String> mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("cache_keys", String.valueOf(map.keySet())), new onViewAttachedToWindowlambda0("count", String.valueOf(map.size())), MetricUtilsKt.getResourceTag(TagResource.FEATURES));
        return (Map) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, mapRemoteActionCompatParcelizer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache.decodeFeatures.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Map<String, ProtoFeatureMsg> invoke() {
                Map<String, byte[]> map2 = map;
                map2.getClass();
                r8lambdaN7z0Ea2bnxePLVipqp_gDhWww r8lambdan7z0ea2bnxeplvipqp_gdhwww = onContentCardDismissed.read((Iterable) map2.entrySet());
                final MemoryCache memoryCache = this;
                final Map<String, String> map3 = mapRemoteActionCompatParcelizer;
                return onMove.RemoteActionCompatParcelizer(resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(r8lambdan7z0ea2bnxeplvipqp_gdhwww, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_cache.MemoryCache.decodeFeatures.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final onViewAttachedToWindowlambda0 invoke(Map.Entry<String, byte[]> entry) {
                        String decodingError;
                        Object objWrite;
                        entry.getClass();
                        String key = entry.getKey();
                        byte[] value = entry.getValue();
                        FwFSerializer fwFSerializer = memoryCache.serializer;
                        MemoryCache memoryCache2 = memoryCache;
                        Map<String, String> map4 = map3;
                        try {
                            prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                            prepareinappmessagewithzippedassethtmllambda4.getClass();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoFeatureMsg.Companion.serializer();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                            objWrite = prepareinappmessagewithzippedassethtmllambda4.write(setgraphicmodalmaxwidthdpSerializer, value);
                        } catch (SerializationException e) {
                            decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                            memoryCache2.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding feature ", key, " failed - ", decodingError));
                            MetricProvider.incrementCounter$fwf_client_release$default(memoryCache2.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map4, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                            objWrite = null;
                        } catch (IllegalArgumentException e2) {
                            decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                            memoryCache2.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding feature ", key, " failed - ", decodingError));
                            MetricProvider.incrementCounter$fwf_client_release$default(memoryCache2.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map4, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                            objWrite = null;
                        }
                        ProtoFeatureMsg protoFeatureMsg = (ProtoFeatureMsg) objWrite;
                        if (protoFeatureMsg != null) {
                            return new onViewAttachedToWindowlambda0(key, protoFeatureMsg);
                        }
                        return null;
                    }
                }));
            }
        });
    }

    private final Map<String, ProtoHoldoutMsg> decodeHoldouts(final Map<String, byte[]> map) {
        final Map<String, String> mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("cache_keys", String.valueOf(map.keySet())), new onViewAttachedToWindowlambda0("count", String.valueOf(map.size())), MetricUtilsKt.getResourceTag(TagResource.HOLDOUTS));
        return (Map) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, mapRemoteActionCompatParcelizer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache.decodeHoldouts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Map<String, ProtoHoldoutMsg> invoke() {
                Map<String, byte[]> map2 = map;
                map2.getClass();
                r8lambdaN7z0Ea2bnxePLVipqp_gDhWww r8lambdan7z0ea2bnxeplvipqp_gdhwww = onContentCardDismissed.read((Iterable) map2.entrySet());
                final MemoryCache memoryCache = this;
                final Map<String, String> map3 = mapRemoteActionCompatParcelizer;
                return onMove.RemoteActionCompatParcelizer(resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(r8lambdan7z0ea2bnxeplvipqp_gdhwww, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_cache.MemoryCache.decodeHoldouts.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final onViewAttachedToWindowlambda0 invoke(Map.Entry<String, byte[]> entry) {
                        String decodingError;
                        Object objWrite;
                        entry.getClass();
                        String key = entry.getKey();
                        byte[] value = entry.getValue();
                        FwFSerializer fwFSerializer = memoryCache.serializer;
                        MemoryCache memoryCache2 = memoryCache;
                        Map<String, String> map4 = map3;
                        try {
                            prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                            prepareinappmessagewithzippedassethtmllambda4.getClass();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoHoldoutMsg.Companion.serializer();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                            objWrite = prepareinappmessagewithzippedassethtmllambda4.write(setgraphicmodalmaxwidthdpSerializer, value);
                        } catch (SerializationException e) {
                            decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                            memoryCache2.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding holdout ", key, " failed - ", decodingError));
                            MetricProvider.incrementCounter$fwf_client_release$default(memoryCache2.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map4, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                            objWrite = null;
                        } catch (IllegalArgumentException e2) {
                            decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                            memoryCache2.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding holdout ", key, " failed - ", decodingError));
                            MetricProvider.incrementCounter$fwf_client_release$default(memoryCache2.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map4, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                            objWrite = null;
                        }
                        ProtoHoldoutMsg protoHoldoutMsg = (ProtoHoldoutMsg) objWrite;
                        if (protoHoldoutMsg != null) {
                            return new onViewAttachedToWindowlambda0(key, protoHoldoutMsg);
                        }
                        return null;
                    }
                }));
            }
        });
    }

    private final byte[] getFromStorage(final String str) {
        Map<String, String> mapSerializer = onMove.serializer(MetricUtilsKt.getCacheKeyTag(str));
        byte[] bArr = (byte[]) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_CACHE_STORAGE_LATENCY, mapSerializer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$getFromStorage$data$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final byte[] invoke() {
                ICache iCache = this.this$0.storage;
                if (iCache != null) {
                    return iCache.get(str);
                }
                return null;
            }
        });
        MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, bArr != null ? MetricUtilsKt.METRIC_CACHE_STORAGE_HIT : MetricUtilsKt.METRIC_CACHE_STORAGE_MISS, 0L, mapSerializer, 2, null);
        return bArr;
    }

    private final Set<String> getRuntimeFeatureKeys() {
        String decodingError;
        Object objSerializer;
        byte[] fromStorage = getFromStorage(UtilKt.generateRuntimeFeatureKeysKey(this.accessToken));
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        if (fromStorage == null) {
            return itemTouchHelperAdapter;
        }
        FwFSerializer fwFSerializer = this.serializer;
        String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
        try {
            resetTransientState resettransientstate = fwFSerializer.json;
            resettransientstate.getClass();
            objSerializer = resettransientstate.serializer(strRemoteActionCompatParcelizer, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1));
        } catch (SerializationException e) {
            decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
            m1$$ExternalSyntheticOutline0.m("Decoding runtime keys failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
            objSerializer = null;
        } catch (IllegalArgumentException e2) {
            decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
            m1$$ExternalSyntheticOutline0.m("Decoding runtime keys failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
            objSerializer = null;
        }
        Set<String> set = (Set) objSerializer;
        return set == null ? itemTouchHelperAdapter : set;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    private final void setRuntimeFeatureKeys(Set<String> set) {
        Set set2;
        String encodingError;
        String decodingError;
        Object objSerializer;
        if (set.isEmpty()) {
            return;
        }
        String strGenerateRuntimeFeatureKeysKey = UtilKt.generateRuntimeFeatureKeysKey(this.accessToken);
        byte[] fromStorage = getFromStorage(strGenerateRuntimeFeatureKeysKey);
        String strRemoteActionCompatParcelizer = null;
        if (fromStorage != null) {
            FwFSerializer fwFSerializer = this.serializer;
            String strRemoteActionCompatParcelizer2 = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
            try {
                resetTransientState resettransientstate = fwFSerializer.json;
                resettransientstate.getClass();
                objSerializer = resettransientstate.serializer(strRemoteActionCompatParcelizer2, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1));
            } catch (SerializationException e) {
                decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                m1$$ExternalSyntheticOutline0.m("Decoding runtime keys failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
                objSerializer = null;
            } catch (IllegalArgumentException e2) {
                decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                m1$$ExternalSyntheticOutline0.m("Decoding runtime keys failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
                objSerializer = null;
            }
            set2 = (Set) objSerializer;
            if (set2 == null) {
                set2 = ItemTouchHelperAdapter.serializer;
            }
        } else {
            set2 = ItemTouchHelperAdapter.serializer;
        }
        this.logger.logD(UtilKt.MODULE_NAME, "Current runtime keys: " + set2);
        if (RangesKt.RemoteActionCompatParcelizer((Set) set, (Iterable) set2).isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = RangesKt.read(set2, set);
        FwFSerializer fwFSerializer2 = this.serializer;
        try {
            resetTransientState resettransientstate2 = fwFSerializer2.json;
            resettransientstate2.getClass();
            strRemoteActionCompatParcelizer = resettransientstate2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1), linkedHashSet);
        } catch (SerializationException e3) {
            encodingError = fwFSerializer2.getEncodingError(String.valueOf(e3));
            m1$$ExternalSyntheticOutline0.m("Encoding runtime keys failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
        } catch (IllegalArgumentException e4) {
            encodingError = fwFSerializer2.getEncodingError(String.valueOf(e4));
            m1$$ExternalSyntheticOutline0.m("Encoding runtime keys failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
        }
        if (strRemoteActionCompatParcelizer != null) {
            ICache iCache = this.storage;
            if (iCache != null) {
                iCache.set(strGenerateRuntimeFeatureKeysKey, setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer));
            }
            this.logger.logD(UtilKt.MODULE_NAME, "Added runtime keys: " + set);
        }
    }

    public final void setAccountConfig$fwf_client_release(String str, String str2, String str3) {
        String encodingError;
        String strRemoteActionCompatParcelizer;
        ICache iCache;
        str.getClass();
        str2.getClass();
        str3.getClass();
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(UtilKt.ACCOUNT_KEY, str), new onViewAttachedToWindowlambda0(UtilKt.PROJECT_KEY, str2), new onViewAttachedToWindowlambda0(UtilKt.ENVIRONMENT_KEY, str3));
        FwFSerializer fwFSerializer = this.serializer;
        try {
            resetTransientState resettransientstate = fwFSerializer.json;
            resettransientstate.getClass();
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            strRemoteActionCompatParcelizer = resettransientstate.RemoteActionCompatParcelizer(new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed), mapRemoteActionCompatParcelizer);
        } catch (SerializationException e) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
            m1$$ExternalSyntheticOutline0.m("Encoding account config failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
            strRemoteActionCompatParcelizer = null;
        } catch (IllegalArgumentException e2) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
            m1$$ExternalSyntheticOutline0.m("Encoding account config failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
            strRemoteActionCompatParcelizer = null;
        }
        if (strRemoteActionCompatParcelizer == null || (iCache = this.storage) == null) {
            return;
        }
        iCache.set(UtilKt.generateAccountConfigKey(this.accessToken), setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer));
    }

    public final void setHoldoutKeys$fwf_client_release(Map<String, Long> map) {
        String encodingError;
        String strRemoteActionCompatParcelizer;
        ICache iCache;
        map.getClass();
        Map<String, Long> holdoutKeys$fwf_client_release = getHoldoutKeys$fwf_client_release();
        LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(holdoutKeys$fwf_client_release, map);
        if (linkedHashMapRemoteActionCompatParcelizer.equals(holdoutKeys$fwf_client_release)) {
            return;
        }
        FwFSerializer fwFSerializer = this.serializer;
        try {
            resetTransientState resettransientstate = fwFSerializer.json;
            resettransientstate.getClass();
            strRemoteActionCompatParcelizer = resettransientstate.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(onDismissed.write)), linkedHashMapRemoteActionCompatParcelizer);
        } catch (SerializationException e) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
            m1$$ExternalSyntheticOutline0.m("Encoding holdout keys failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
            strRemoteActionCompatParcelizer = null;
        } catch (IllegalArgumentException e2) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
            m1$$ExternalSyntheticOutline0.m("Encoding holdout keys failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
            strRemoteActionCompatParcelizer = null;
        }
        byte[] bArrRatingCompat = strRemoteActionCompatParcelizer != null ? setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer) : null;
        if (bArrRatingCompat == null || (iCache = this.storage) == null) {
            return;
        }
        iCache.set(UtilKt.generateHoldoutKeysConfigCacheKey(this.accessToken), bArrRatingCompat);
    }

    public final void setProfileAttributes$fwf_client_release(Set<String> set) {
        String encodingError;
        String strRemoteActionCompatParcelizer;
        ICache iCache;
        set.getClass();
        Set<String> profileAttributes$fwf_client_release = getProfileAttributes$fwf_client_release();
        LinkedHashSet linkedHashSet = RangesKt.read(profileAttributes$fwf_client_release, set);
        if (linkedHashSet.size() != profileAttributes$fwf_client_release.size()) {
            FwFSerializer fwFSerializer = this.serializer;
            try {
                resetTransientState resettransientstate = fwFSerializer.json;
                resettransientstate.getClass();
                strRemoteActionCompatParcelizer = resettransientstate.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1), linkedHashSet);
            } catch (SerializationException e) {
                encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
                m1$$ExternalSyntheticOutline0.m("Encoding profile attributes failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
                strRemoteActionCompatParcelizer = null;
            } catch (IllegalArgumentException e2) {
                encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
                m1$$ExternalSyntheticOutline0.m("Encoding profile attributes failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
                strRemoteActionCompatParcelizer = null;
            }
            byte[] bArrRatingCompat = strRemoteActionCompatParcelizer != null ? setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer) : null;
            if (bArrRatingCompat == null || (iCache = this.storage) == null) {
                return;
            }
            iCache.set(UtilKt.generateProfileAttributesKey(this.accessToken), bArrRatingCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getFeatureWithLock(String str, ShortNewsContentCardView<? super ProtoFeatureMsg> shortNewsContentCardView) {
        C00951 c00951;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        if (shortNewsContentCardView instanceof C00951) {
            c00951 = (C00951) shortNewsContentCardView;
            int i = c00951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00951.label = i - Integer.MIN_VALUE;
            } else {
                c00951 = new C00951(shortNewsContentCardView);
            }
        } else {
            c00951 = new C00951(shortNewsContentCardView);
        }
        Object obj = c00951.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00951.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = this.featuresLock;
            c00951.L$0 = this;
            c00951.L$1 = str;
            c00951.L$2 = setcustominappmessageanimationfactorylambda0;
            c00951.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(c00951) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) c00951.L$2;
            String str2 = (String) c00951.L$1;
            memoryCache = (MemoryCache) c00951.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            str = str2;
        }
        try {
            return memoryCache.featuresCache.get(str);
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }

    public static /* synthetic */ Object getFeatures$default(MemoryCache memoryCache, Set set, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return memoryCache.getFeatures(set, z, shortNewsContentCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getFeaturesWithLock(Set<String> set, ShortNewsContentCardView<? super Map<String, ProtoFeatureMsg>> shortNewsContentCardView) {
        C00971 c00971;
        MemoryCache memoryCache;
        Set<String> set2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        if (shortNewsContentCardView instanceof C00971) {
            c00971 = (C00971) shortNewsContentCardView;
            int i = c00971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00971.label = i - Integer.MIN_VALUE;
            } else {
                c00971 = new C00971(shortNewsContentCardView);
            }
        } else {
            c00971 = new C00971(shortNewsContentCardView);
        }
        Object obj = c00971.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00971.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = this.featuresLock;
            c00971.L$0 = this;
            c00971.L$1 = set;
            c00971.L$2 = setcustominappmessageanimationfactorylambda1;
            c00971.label = 1;
            if (setcustominappmessageanimationfactorylambda1.lock(c00971) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
            set2 = set;
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) c00971.L$2;
            set2 = (Set) c00971.L$1;
            memoryCache = (MemoryCache) c00971.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            Map mapSerializer = memoryCache.featuresCache.isEmpty() ? SimpleItemTouchHelperCallback.serializer : onMove.serializer(memoryCache.featuresCache);
            setcustominappmessageanimationfactorylambda0.write(null);
            if (mapSerializer.isEmpty()) {
                return new LinkedHashMap();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : set2) {
                ProtoFeatureMsg protoFeatureMsg = (ProtoFeatureMsg) mapSerializer.get(UtilKt.generateFeatureCacheKey(str, memoryCache.accessToken));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = protoFeatureMsg != null ? new onViewAttachedToWindowlambda0(str, protoFeatureMsg) : null;
                if (onviewattachedtowindowlambda0 != null) {
                    arrayList.add(onviewattachedtowindowlambda0);
                }
            }
            return new LinkedHashMap(onMove.serializer(arrayList));
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getHoldoutsWithLock(Set<String> set, ShortNewsContentCardView<? super Map<String, ProtoHoldoutMsg>> shortNewsContentCardView) {
        C00991 c00991;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        if (shortNewsContentCardView instanceof C00991) {
            c00991 = (C00991) shortNewsContentCardView;
            int i = c00991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00991.label = i - Integer.MIN_VALUE;
            } else {
                c00991 = new C00991(shortNewsContentCardView);
            }
        } else {
            c00991 = new C00991(shortNewsContentCardView);
        }
        Object obj = c00991.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00991.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = this.holdoutsLock;
            c00991.L$0 = this;
            c00991.L$1 = set;
            c00991.L$2 = setcustominappmessageanimationfactorylambda0;
            c00991.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(c00991) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) c00991.L$2;
            Set<String> set2 = (Set) c00991.L$1;
            memoryCache = (MemoryCache) c00991.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            set = set2;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : set) {
                ProtoHoldoutMsg protoHoldoutMsg = memoryCache.holdoutsCache.get(UtilKt.generateHoldoutCacheKey(str, memoryCache.accessToken));
                if (protoHoldoutMsg != null) {
                    linkedHashMap.put(str, protoHoldoutMsg);
                }
            }
            setcustominappmessageanimationfactorylambda0.write(null);
            return linkedHashMap;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setFeatureWithLock(String str, ProtoFeatureMsg protoFeatureMsg, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        C01001 c01001;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        if (shortNewsContentCardView instanceof C01001) {
            c01001 = (C01001) shortNewsContentCardView;
            int i = c01001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01001.label = i - Integer.MIN_VALUE;
            } else {
                c01001 = new C01001(shortNewsContentCardView);
            }
        } else {
            c01001 = new C01001(shortNewsContentCardView);
        }
        Object obj = c01001.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01001.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = this.featuresLock;
            c01001.L$0 = this;
            c01001.L$1 = str;
            c01001.L$2 = protoFeatureMsg;
            c01001.L$3 = setcustominappmessageanimationfactorylambda0;
            c01001.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(c01001) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) c01001.L$3;
            protoFeatureMsg = (ProtoFeatureMsg) c01001.L$2;
            String str2 = (String) c01001.L$1;
            memoryCache = (MemoryCache) c01001.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            str = str2;
        }
        try {
            memoryCache.featuresCache.put(str, protoFeatureMsg);
            return createFromParcel.INSTANCE;
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object clearEvaluations$fwf_client_release(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        MemoryCache$clearEvaluations$1 memoryCache$clearEvaluations$1;
        MemoryCache memoryCache;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        if (shortNewsContentCardView instanceof MemoryCache$clearEvaluations$1) {
            memoryCache$clearEvaluations$1 = (MemoryCache$clearEvaluations$1) shortNewsContentCardView;
            int i = memoryCache$clearEvaluations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memoryCache$clearEvaluations$1.label = i - Integer.MIN_VALUE;
            } else {
                memoryCache$clearEvaluations$1 = new MemoryCache$clearEvaluations$1(this, shortNewsContentCardView);
            }
        } else {
            memoryCache$clearEvaluations$1 = new MemoryCache$clearEvaluations$1(this, shortNewsContentCardView);
        }
        Object obj = memoryCache$clearEvaluations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = memoryCache$clearEvaluations$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = this.evaluationsLock;
            memoryCache$clearEvaluations$1.L$0 = this;
            memoryCache$clearEvaluations$1.L$1 = setcustominappmessageanimationfactorylambda1;
            memoryCache$clearEvaluations$1.label = 1;
            if (setcustominappmessageanimationfactorylambda1.lock(memoryCache$clearEvaluations$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) memoryCache$clearEvaluations$1.L$1;
            memoryCache = (MemoryCache) memoryCache$clearEvaluations$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            memoryCache.evaluationsCache.clear();
            return createFromParcel.INSTANCE;
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object deleteFeature(String str, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        C00931 c00931;
        MemoryCache memoryCache;
        String str2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        if (shortNewsContentCardView instanceof C00931) {
            c00931 = (C00931) shortNewsContentCardView;
            int i = c00931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00931.label = i - Integer.MIN_VALUE;
            } else {
                c00931 = new C00931(shortNewsContentCardView);
            }
        } else {
            c00931 = new C00931(shortNewsContentCardView);
        }
        Object obj = c00931.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00931.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String strGenerateFeatureCacheKey = UtilKt.generateFeatureCacheKey(str, this.accessToken);
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = this.featuresLock;
            c00931.L$0 = this;
            c00931.L$1 = strGenerateFeatureCacheKey;
            c00931.L$2 = setcustominappmessageanimationfactorylambda1;
            c00931.label = 1;
            if (setcustominappmessageanimationfactorylambda1.lock(c00931) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
            str2 = strGenerateFeatureCacheKey;
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) c00931.L$2;
            str2 = (String) c00931.L$1;
            memoryCache = (MemoryCache) c00931.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            memoryCache.featuresCache.remove(str2);
            setcustominappmessageanimationfactorylambda0.write(null);
            ICache iCache = memoryCache.storage;
            if (iCache != null) {
                iCache.delete(str2);
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEvaluation$fwf_client_release(String str, ShortNewsContentCardView<? super EvalResult> shortNewsContentCardView) {
        MemoryCache$getEvaluation$1 memoryCache$getEvaluation$1;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        if (shortNewsContentCardView instanceof MemoryCache$getEvaluation$1) {
            memoryCache$getEvaluation$1 = (MemoryCache$getEvaluation$1) shortNewsContentCardView;
            int i = memoryCache$getEvaluation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memoryCache$getEvaluation$1.label = i - Integer.MIN_VALUE;
            } else {
                memoryCache$getEvaluation$1 = new MemoryCache$getEvaluation$1(this, shortNewsContentCardView);
            }
        } else {
            memoryCache$getEvaluation$1 = new MemoryCache$getEvaluation$1(this, shortNewsContentCardView);
        }
        Object obj = memoryCache$getEvaluation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = memoryCache$getEvaluation$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = this.evaluationsLock;
            memoryCache$getEvaluation$1.L$0 = this;
            memoryCache$getEvaluation$1.L$1 = str;
            memoryCache$getEvaluation$1.L$2 = setcustominappmessageanimationfactorylambda0;
            memoryCache$getEvaluation$1.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(memoryCache$getEvaluation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) memoryCache$getEvaluation$1.L$2;
            String str2 = (String) memoryCache$getEvaluation$1.L$1;
            memoryCache = (MemoryCache) memoryCache$getEvaluation$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            str = str2;
        }
        try {
            return memoryCache.evaluationsCache.get(str);
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEvaluations$fwf_client_release(Set<String> set, ShortNewsContentCardView<? super Map<String, EvalResult>> shortNewsContentCardView) {
        MemoryCache$getEvaluations$1 memoryCache$getEvaluations$1;
        MemoryCache memoryCache;
        Set<String> set2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        if (shortNewsContentCardView instanceof MemoryCache$getEvaluations$1) {
            memoryCache$getEvaluations$1 = (MemoryCache$getEvaluations$1) shortNewsContentCardView;
            int i = memoryCache$getEvaluations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memoryCache$getEvaluations$1.label = i - Integer.MIN_VALUE;
            } else {
                memoryCache$getEvaluations$1 = new MemoryCache$getEvaluations$1(this, shortNewsContentCardView);
            }
        } else {
            memoryCache$getEvaluations$1 = new MemoryCache$getEvaluations$1(this, shortNewsContentCardView);
        }
        Object obj = memoryCache$getEvaluations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = memoryCache$getEvaluations$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = this.evaluationsLock;
            memoryCache$getEvaluations$1.L$0 = this;
            memoryCache$getEvaluations$1.L$1 = set;
            memoryCache$getEvaluations$1.L$2 = setcustominappmessageanimationfactorylambda1;
            memoryCache$getEvaluations$1.label = 1;
            if (setcustominappmessageanimationfactorylambda1.lock(memoryCache$getEvaluations$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
            set2 = set;
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) memoryCache$getEvaluations$1.L$2;
            set2 = (Set) memoryCache$getEvaluations$1.L$1;
            memoryCache = (MemoryCache) memoryCache$getEvaluations$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            Map<String, EvalResult> map = memoryCache.evaluationsCache;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, EvalResult> entry : map.entrySet()) {
                if (set2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            setcustominappmessageanimationfactorylambda0.write(null);
            return linkedHashMap;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getFeature(final String str, ShortNewsContentCardView<? super ProtoFeatureMsg> shortNewsContentCardView) {
        C00941 c00941;
        String strGenerateFeatureCacheKey;
        Object featureWithLock;
        final MemoryCache memoryCache;
        if (shortNewsContentCardView instanceof C00941) {
            c00941 = (C00941) shortNewsContentCardView;
            int i = c00941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00941.label = i - Integer.MIN_VALUE;
            } else {
                c00941 = new C00941(shortNewsContentCardView);
            }
        } else {
            c00941 = new C00941(shortNewsContentCardView);
        }
        Object obj = c00941.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00941.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            strGenerateFeatureCacheKey = UtilKt.generateFeatureCacheKey(str, this.accessToken);
            c00941.L$0 = this;
            c00941.L$1 = str;
            c00941.L$2 = strGenerateFeatureCacheKey;
            c00941.label = 1;
            featureWithLock = getFeatureWithLock(strGenerateFeatureCacheKey, c00941);
            if (featureWithLock != coroutineSingletons) {
                memoryCache = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ProtoFeatureMsg protoFeatureMsg = (ProtoFeatureMsg) c00941.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return protoFeatureMsg;
        }
        String str2 = (String) c00941.L$2;
        String str3 = (String) c00941.L$1;
        memoryCache = (MemoryCache) c00941.L$0;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        strGenerateFeatureCacheKey = str2;
        str = str3;
        featureWithLock = obj;
        ProtoFeatureMsg protoFeatureMsg2 = (ProtoFeatureMsg) featureWithLock;
        if (protoFeatureMsg2 != null) {
            return protoFeatureMsg2;
        }
        memoryCache.logger.logD(UtilKt.MODULE_NAME, "Feature " + str + " not found in cache, going to search in storage");
        final byte[] fromStorage = memoryCache.getFromStorage(strGenerateFeatureCacheKey);
        if (fromStorage != null) {
            final Map<String, String> mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(MetricUtilsKt.getResourceTag(TagResource.FEATURE), MetricUtilsKt.getCacheKeyTag(strGenerateFeatureCacheKey));
            ProtoFeatureMsg protoFeatureMsg3 = (ProtoFeatureMsg) memoryCache.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, mapRemoteActionCompatParcelizer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$getFeature$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final ProtoFeatureMsg invoke() {
                    String decodingError;
                    Object objWrite;
                    FwFSerializer fwFSerializer = this.this$0.serializer;
                    byte[] bArr = fromStorage;
                    MemoryCache memoryCache2 = this.this$0;
                    Map<String, String> map = mapRemoteActionCompatParcelizer;
                    String str4 = str;
                    try {
                        prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                        prepareinappmessagewithzippedassethtmllambda4.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoFeatureMsg.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                        objWrite = prepareinappmessagewithzippedassethtmllambda4.write(setgraphicmodalmaxwidthdpSerializer, bArr);
                    } catch (SerializationException e) {
                        decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                        MetricProvider.incrementCounter$fwf_client_release$default(memoryCache2.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                        memoryCache2.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding feature ", str4, " failed - ", decodingError));
                        objWrite = null;
                    } catch (IllegalArgumentException e2) {
                        decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
                        MetricProvider.incrementCounter$fwf_client_release$default(memoryCache2.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                        memoryCache2.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Decoding feature ", str4, " failed - ", decodingError));
                        objWrite = null;
                    }
                    return (ProtoFeatureMsg) objWrite;
                }
            });
            if (protoFeatureMsg3 != null) {
                c00941.L$0 = protoFeatureMsg3;
                c00941.L$1 = null;
                c00941.L$2 = null;
                c00941.label = 2;
                return memoryCache.setFeatureWithLock(strGenerateFeatureCacheKey, protoFeatureMsg3, c00941) == coroutineSingletons ? coroutineSingletons : protoFeatureMsg3;
            }
        }
        if (memoryCache.useRuntimeFeatureKeys) {
            memoryCache.setRuntimeFeatureKeys(RangesKt.write((Object) str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c A[LOOP:0: B:38:0x0106->B:40:0x010c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getFeatures(Set<String> set, boolean z, ShortNewsContentCardView<? super Map<String, ProtoFeatureMsg>> shortNewsContentCardView) {
        C00961 c00961;
        MemoryCache memoryCache;
        Map map;
        MemoryCache memoryCache2;
        Map<String, ProtoFeatureMsg> map2;
        Set set2;
        boolean z2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        int iRemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap;
        if (shortNewsContentCardView instanceof C00961) {
            c00961 = (C00961) shortNewsContentCardView;
            int i = c00961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00961.label = i - Integer.MIN_VALUE;
            } else {
                c00961 = new C00961(shortNewsContentCardView);
            }
        } else {
            c00961 = new C00961(shortNewsContentCardView);
        }
        Object featuresWithLock = c00961.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00961.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(featuresWithLock);
            c00961.L$0 = this;
            c00961.L$1 = set;
            c00961.Z$0 = z;
            c00961.label = 1;
            featuresWithLock = getFeaturesWithLock(set, c00961);
            if (featuresWithLock != coroutineSingletons) {
                memoryCache = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z = c00961.Z$0;
            set = (Set) c00961.L$1;
            memoryCache = (MemoryCache) c00961.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(featuresWithLock);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = c00961.Z$0;
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) c00961.L$4;
            map2 = (Map) c00961.L$3;
            set2 = (Set) c00961.L$2;
            map = (Map) c00961.L$1;
            memoryCache2 = (MemoryCache) c00961.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(featuresWithLock);
        }
        try {
            memoryCache2.featuresCache.putAll(map2);
            setcustominappmessageanimationfactorylambda0.write(null);
            Collection<ProtoFeatureMsg> collectionValues = map2.values();
            iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(collectionValues, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (Object obj : collectionValues) {
                linkedHashMap.put(((ProtoFeatureMsg) obj).getKey(), obj);
            }
            map.putAll(linkedHashMap);
            if (memoryCache2.useRuntimeFeatureKeys && !z2) {
                memoryCache2.setRuntimeFeatureKeys(RangesKt.RemoteActionCompatParcelizer(set2, (Iterable) linkedHashMap.keySet()));
            }
            return map;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
        Map map3 = (Map) featuresWithLock;
        Set setRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer((Set) set, (Iterable) map3.keySet());
        if (!setRemoteActionCompatParcelizer.isEmpty()) {
            memoryCache.logger.logD(UtilKt.MODULE_NAME, "Features " + setRemoteActionCompatParcelizer + " not found in cache, going to search in storage");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = setRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(UtilKt.generateFeatureCacheKey((String) it.next(), memoryCache.accessToken));
            }
            Map<String, byte[]> allFromStorage = memoryCache.getAllFromStorage(linkedHashSet);
            if (allFromStorage != null) {
                Map<String, ProtoFeatureMsg> mapDecodeFeatures = memoryCache.decodeFeatures(allFromStorage);
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = memoryCache.featuresLock;
                c00961.L$0 = memoryCache;
                c00961.L$1 = map3;
                c00961.L$2 = setRemoteActionCompatParcelizer;
                c00961.L$3 = mapDecodeFeatures;
                c00961.L$4 = setcustominappmessageanimationfactorylambda1;
                c00961.Z$0 = z;
                c00961.label = 2;
                if (setcustominappmessageanimationfactorylambda1.lock(c00961) != coroutineSingletons) {
                    map = map3;
                    memoryCache2 = memoryCache;
                    map2 = mapDecodeFeatures;
                    set2 = setRemoteActionCompatParcelizer;
                    z2 = z;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                    memoryCache2.featuresCache.putAll(map2);
                    setcustominappmessageanimationfactorylambda0.write(null);
                    Collection<ProtoFeatureMsg> collectionValues2 = map2.values();
                    iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(collectionValues2, 10));
                    if (iRemoteActionCompatParcelizer < 16) {
                        iRemoteActionCompatParcelizer = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                    while (r11.hasNext()) {
                        linkedHashMap.put(((ProtoFeatureMsg) obj).getKey(), obj);
                    }
                    map.putAll(linkedHashMap);
                    if (memoryCache2.useRuntimeFeatureKeys) {
                        memoryCache2.setRuntimeFeatureKeys(RangesKt.RemoteActionCompatParcelizer(set2, (Iterable) linkedHashMap.keySet()));
                    }
                    return map;
                }
                return coroutineSingletons;
            }
        }
        return map3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getFeaturesToUpdate$fwf_client_release(Set<String> set, long j, ShortNewsContentCardView<? super Map<String, Long>> shortNewsContentCardView) {
        MemoryCache$getFeaturesToUpdate$1 memoryCache$getFeaturesToUpdate$1;
        Set<String> set2;
        int i;
        if (shortNewsContentCardView instanceof MemoryCache$getFeaturesToUpdate$1) {
            memoryCache$getFeaturesToUpdate$1 = (MemoryCache$getFeaturesToUpdate$1) shortNewsContentCardView;
            int i2 = memoryCache$getFeaturesToUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memoryCache$getFeaturesToUpdate$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memoryCache$getFeaturesToUpdate$1 = new MemoryCache$getFeaturesToUpdate$1(this, shortNewsContentCardView);
            }
        } else {
            memoryCache$getFeaturesToUpdate$1 = new MemoryCache$getFeaturesToUpdate$1(this, shortNewsContentCardView);
        }
        Object features = memoryCache$getFeaturesToUpdate$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = memoryCache$getFeaturesToUpdate$1.label;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(features);
            if (this.useRuntimeFeatureKeys) {
                set = RangesKt.read(set, getRuntimeFeatureKeys());
            }
            setShouldNextUnregisterBeSkipped featuresUpdateTime = getFeaturesUpdateTime();
            if (featuresUpdateTime == null) {
                Set<String> set3 = set;
                int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(set3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer >= 16 ? iRemoteActionCompatParcelizer : 16);
                for (Object obj2 : set3) {
                    linkedHashMap.put(obj2, null);
                }
                return linkedHashMap;
            }
            setShouldNextUnregisterBeSkipped.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            instant.getClass();
            setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped = new setShouldNextUnregisterBeSkipped(instant);
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            int i4 = featuresUpdateTime.compareTo(setshouldnextunregisterbeskipped.write(BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(UriKt.IconCompatParcelizer(j, setUnregisteredInAppMessage.SECONDS)))) < 0 ? 1 : 0;
            memoryCache$getFeaturesToUpdate$1.L$0 = set;
            memoryCache$getFeaturesToUpdate$1.I$0 = i4;
            memoryCache$getFeaturesToUpdate$1.label = 1;
            features = getFeatures(set, true, memoryCache$getFeaturesToUpdate$1);
            if (features == obj) {
                return obj;
            }
            int i5 = i4;
            set2 = set;
            i = i5;
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = memoryCache$getFeaturesToUpdate$1.I$0;
            set2 = (Set) memoryCache$getFeaturesToUpdate$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(features);
        }
        Map map = (Map) features;
        if (i != 0) {
            Set<String> set4 = set2;
            int iRemoteActionCompatParcelizer2 = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(set4, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iRemoteActionCompatParcelizer2 >= 16 ? iRemoteActionCompatParcelizer2 : 16);
            for (Object obj3 : set4) {
                ProtoFeatureMsg protoFeatureMsg = (ProtoFeatureMsg) map.get((String) obj3);
                linkedHashMap2.put(obj3, protoFeatureMsg != null ? new Long(protoFeatureMsg.getChangeVersionControl()) : null);
            }
            return linkedHashMap2;
        }
        Set setRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer((Set) set2, (Iterable) map.keySet());
        int iRemoteActionCompatParcelizer3 = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(setRemoteActionCompatParcelizer, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iRemoteActionCompatParcelizer3 >= 16 ? iRemoteActionCompatParcelizer3 : 16);
        for (Object obj4 : setRemoteActionCompatParcelizer) {
            linkedHashMap3.put(obj4, null);
        }
        return linkedHashMap3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104 A[LOOP:0: B:38:0x00fe->B:40:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getHoldouts(Set<String> set, ShortNewsContentCardView<? super Map<String, ProtoHoldoutMsg>> shortNewsContentCardView) {
        C00981 c00981;
        MemoryCache memoryCache;
        Map<String, ProtoHoldoutMsg> map;
        MemoryCache memoryCache2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        Map map2;
        int iRemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap;
        if (shortNewsContentCardView instanceof C00981) {
            c00981 = (C00981) shortNewsContentCardView;
            int i = c00981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00981.label = i - Integer.MIN_VALUE;
            } else {
                c00981 = new C00981(shortNewsContentCardView);
            }
        } else {
            c00981 = new C00981(shortNewsContentCardView);
        }
        Object holdoutsWithLock = c00981.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00981.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(holdoutsWithLock);
            c00981.L$0 = this;
            c00981.L$1 = set;
            c00981.label = 1;
            holdoutsWithLock = getHoldoutsWithLock(set, c00981);
            if (holdoutsWithLock != coroutineSingletons) {
                memoryCache = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            set = (Set) c00981.L$1;
            memoryCache = (MemoryCache) c00981.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(holdoutsWithLock);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) c00981.L$3;
            map = (Map) c00981.L$2;
            map2 = (Map) c00981.L$1;
            memoryCache2 = (MemoryCache) c00981.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(holdoutsWithLock);
        }
        try {
            memoryCache2.holdoutsCache.putAll(map);
            setcustominappmessageanimationfactorylambda0.write(null);
            Collection<ProtoHoldoutMsg> collectionValues = map.values();
            iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(collectionValues, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (Object obj : collectionValues) {
                linkedHashMap.put(((ProtoHoldoutMsg) obj).getKey(), obj);
            }
            map2.putAll(linkedHashMap);
            return map2;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
        Map map3 = (Map) holdoutsWithLock;
        Set setRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer((Set) set, (Iterable) map3.keySet());
        if (!setRemoteActionCompatParcelizer.isEmpty()) {
            memoryCache.logger.logD(UtilKt.MODULE_NAME, "Holdouts " + setRemoteActionCompatParcelizer + " not found in cache, going to search in storage");
            Set set2 = setRemoteActionCompatParcelizer;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(UtilKt.generateHoldoutCacheKey((String) it.next(), memoryCache.accessToken));
            }
            Map<String, byte[]> allFromStorage = memoryCache.getAllFromStorage(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList));
            if (allFromStorage != null) {
                Map<String, ProtoHoldoutMsg> mapDecodeHoldouts = memoryCache.decodeHoldouts(allFromStorage);
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = memoryCache.holdoutsLock;
                c00981.L$0 = memoryCache;
                c00981.L$1 = map3;
                c00981.L$2 = mapDecodeHoldouts;
                c00981.L$3 = setcustominappmessageanimationfactorylambda1;
                c00981.label = 2;
                if (setcustominappmessageanimationfactorylambda1.lock(c00981) != coroutineSingletons) {
                    map = mapDecodeHoldouts;
                    memoryCache2 = memoryCache;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                    map2 = map3;
                    memoryCache2.holdoutsCache.putAll(map);
                    setcustominappmessageanimationfactorylambda0.write(null);
                    Collection<ProtoHoldoutMsg> collectionValues2 = map.values();
                    iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(collectionValues2, 10));
                    if (iRemoteActionCompatParcelizer < 16) {
                        iRemoteActionCompatParcelizer = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                    while (r10.hasNext()) {
                        linkedHashMap.put(((ProtoHoldoutMsg) obj).getKey(), obj);
                    }
                    map2.putAll(linkedHashMap);
                    return map2;
                }
                return coroutineSingletons;
            }
        }
        return map3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setEvaluation$fwf_client_release(String str, EvalResult evalResult, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        MemoryCache$setEvaluation$1 memoryCache$setEvaluation$1;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        if (shortNewsContentCardView instanceof MemoryCache$setEvaluation$1) {
            memoryCache$setEvaluation$1 = (MemoryCache$setEvaluation$1) shortNewsContentCardView;
            int i = memoryCache$setEvaluation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memoryCache$setEvaluation$1.label = i - Integer.MIN_VALUE;
            } else {
                memoryCache$setEvaluation$1 = new MemoryCache$setEvaluation$1(this, shortNewsContentCardView);
            }
        } else {
            memoryCache$setEvaluation$1 = new MemoryCache$setEvaluation$1(this, shortNewsContentCardView);
        }
        Object obj = memoryCache$setEvaluation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = memoryCache$setEvaluation$1.label;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (evalResult.getExplanation().getKind().isErrorKind$fwf_client_release()) {
                return createfromparcel;
            }
            setcustominappmessageanimationfactorylambda0 = this.evaluationsLock;
            memoryCache$setEvaluation$1.L$0 = this;
            memoryCache$setEvaluation$1.L$1 = str;
            memoryCache$setEvaluation$1.L$2 = evalResult;
            memoryCache$setEvaluation$1.L$3 = setcustominappmessageanimationfactorylambda0;
            memoryCache$setEvaluation$1.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(memoryCache$setEvaluation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) memoryCache$setEvaluation$1.L$3;
            evalResult = (EvalResult) memoryCache$setEvaluation$1.L$2;
            String str2 = (String) memoryCache$setEvaluation$1.L$1;
            memoryCache = (MemoryCache) memoryCache$setEvaluation$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            str = str2;
        }
        try {
            memoryCache.evaluationsCache.put(str, evalResult.setFromEvalCache$fwf_client_release());
            return createfromparcel;
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setEvaluations$fwf_client_release(Map<String, EvalResult> map, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        MemoryCache$setEvaluations$1 memoryCache$setEvaluations$1;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        if (shortNewsContentCardView instanceof MemoryCache$setEvaluations$1) {
            memoryCache$setEvaluations$1 = (MemoryCache$setEvaluations$1) shortNewsContentCardView;
            int i = memoryCache$setEvaluations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memoryCache$setEvaluations$1.label = i - Integer.MIN_VALUE;
            } else {
                memoryCache$setEvaluations$1 = new MemoryCache$setEvaluations$1(this, shortNewsContentCardView);
            }
        } else {
            memoryCache$setEvaluations$1 = new MemoryCache$setEvaluations$1(this, shortNewsContentCardView);
        }
        Object obj = memoryCache$setEvaluations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = memoryCache$setEvaluations$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = this.evaluationsLock;
            memoryCache$setEvaluations$1.L$0 = this;
            memoryCache$setEvaluations$1.L$1 = map;
            memoryCache$setEvaluations$1.L$2 = setcustominappmessageanimationfactorylambda0;
            memoryCache$setEvaluations$1.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(memoryCache$setEvaluations$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) memoryCache$setEvaluations$1.L$2;
            Map<String, EvalResult> map2 = (Map) memoryCache$setEvaluations$1.L$1;
            memoryCache = (MemoryCache) memoryCache$setEvaluations$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            map = map2;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, EvalResult> entry : map.entrySet()) {
                if (!entry.getValue().getExplanation().getKind().isErrorKind$fwf_client_release()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
            for (Object obj2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(((Map.Entry) obj2).getKey(), ((EvalResult) ((Map.Entry) obj2).getValue()).setFromEvalCache$fwf_client_release());
            }
            memoryCache.evaluationsCache.putAll(linkedHashMap2);
            return createFromParcel.INSTANCE;
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInitialDataFeatures(List<ProtoFeatureMsg> list) {
        Map<String, ProtoFeatureMsg> mapDecodeFeatures;
        String encodingError;
        String encodingError2;
        List<ProtoFeatureMsg> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UtilKt.generateFeatureCacheKey(((ProtoFeatureMsg) it.next()).getKey(), this.accessToken));
        }
        Set<String> setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, byte[]> allFromStorage = getAllFromStorage(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        if (allFromStorage == null || (mapDecodeFeatures = decodeFeatures(allFromStorage)) == null) {
            mapDecodeFeatures = SimpleItemTouchHelperCallback.serializer;
        }
        this.featuresCache.putAll(mapDecodeFeatures);
        for (ProtoFeatureMsg protoFeatureMsg : list2) {
            String strGenerateFeatureCacheKey = UtilKt.generateFeatureCacheKey(protoFeatureMsg.getKey(), this.accessToken);
            ProtoFeatureMsg protoFeatureMsg2 = mapDecodeFeatures.get(strGenerateFeatureCacheKey);
            byte[] bArrSerializer = null;
            if (protoFeatureMsg2 != null) {
                int changeVersionControl = protoFeatureMsg.getChangeVersionControl();
                int changeVersionControl2 = protoFeatureMsg2.getChangeVersionControl();
                ILogger iLogger = this.logger;
                if (changeVersionControl > changeVersionControl2) {
                    iLogger.logD(UtilKt.MODULE_NAME, "Feature " + protoFeatureMsg.getKey() + " is newer than the one in cache, feature will be updated");
                    FwFSerializer fwFSerializer = this.serializer;
                    try {
                        prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                        prepareinappmessagewithzippedassethtmllambda4.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoFeatureMsg.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                        bArrSerializer = prepareinappmessagewithzippedassethtmllambda4.serializer(setgraphicmodalmaxwidthdpSerializer, protoFeatureMsg);
                    } catch (SerializationException e) {
                        encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
                        this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new feature ", protoFeatureMsg.getKey(), " for initial data failed - ", encodingError));
                    } catch (IllegalArgumentException e2) {
                        encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
                        this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new feature ", protoFeatureMsg.getKey(), " for initial data failed - ", encodingError));
                    }
                    if (bArrSerializer != null) {
                        linkedHashMap.put(strGenerateFeatureCacheKey, bArrSerializer);
                        this.featuresCache.put(strGenerateFeatureCacheKey, protoFeatureMsg);
                    }
                } else {
                    iLogger.logD(UtilKt.MODULE_NAME, "Feature " + protoFeatureMsg.getKey() + " is already up to date");
                }
            } else {
                this.logger.logD(UtilKt.MODULE_NAME, "Feature " + protoFeatureMsg.getKey() + " not found in cache, feature will be added");
                this.featuresCache.put(strGenerateFeatureCacheKey, protoFeatureMsg);
                FwFSerializer fwFSerializer2 = this.serializer;
                try {
                    prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda5 = fwFSerializer2.protoBuf;
                    prepareinappmessagewithzippedassethtmllambda5.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = ProtoFeatureMsg.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer2;
                    bArrSerializer = prepareinappmessagewithzippedassethtmllambda5.serializer(setgraphicmodalmaxwidthdpSerializer2, protoFeatureMsg);
                } catch (SerializationException e3) {
                    encodingError2 = fwFSerializer2.getEncodingError(String.valueOf(e3));
                    this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new feature ", protoFeatureMsg.getKey(), " for initial data failed - ", encodingError2));
                } catch (IllegalArgumentException e4) {
                    encodingError2 = fwFSerializer2.getEncodingError(String.valueOf(e4));
                    this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new feature ", protoFeatureMsg.getKey(), " for initial data failed - ", encodingError2));
                }
                if (bArrSerializer != null) {
                    linkedHashMap.put(strGenerateFeatureCacheKey, bArrSerializer);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.logger.logD(UtilKt.MODULE_NAME, "Adding features in storage with keys: " + linkedHashMap.keySet());
        ICache iCache = this.storage;
        if (iCache != null) {
            iCache.setAll(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInitialDataHoldouts(List<ProtoHoldoutMsg> list) {
        Map<String, ProtoHoldoutMsg> mapDecodeHoldouts;
        Map map;
        String encodingError;
        String strRemoteActionCompatParcelizer;
        ICache iCache;
        String encodingError2;
        String strRemoteActionCompatParcelizer2;
        ICache iCache2;
        String decodingError;
        Object objSerializer;
        String encodingError3;
        String encodingError4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<ProtoHoldoutMsg> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UtilKt.generateHoldoutCacheKey(((ProtoHoldoutMsg) it.next()).getKey(), this.accessToken));
        }
        Map<String, byte[]> allFromStorage = getAllFromStorage(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList));
        if (allFromStorage == null || (mapDecodeHoldouts = decodeHoldouts(allFromStorage)) == null) {
            mapDecodeHoldouts = SimpleItemTouchHelperCallback.serializer;
        }
        this.holdoutsCache.putAll(mapDecodeHoldouts);
        Iterator<T> it2 = list2.iterator();
        while (true) {
            byte[] bArrSerializer = null;
            strRemoteActionCompatParcelizer = null;
            strRemoteActionCompatParcelizer2 = null;
            byte[] bArrSerializer2 = null;
            if (!it2.hasNext()) {
                break;
            }
            ProtoHoldoutMsg protoHoldoutMsg = (ProtoHoldoutMsg) it2.next();
            String strGenerateHoldoutCacheKey = UtilKt.generateHoldoutCacheKey(protoHoldoutMsg.getKey(), this.accessToken);
            ProtoHoldoutMsg protoHoldoutMsg2 = mapDecodeHoldouts.get(strGenerateHoldoutCacheKey);
            if (protoHoldoutMsg2 != null) {
                long changeVersionControl = protoHoldoutMsg.getChangeVersionControl();
                long changeVersionControl2 = protoHoldoutMsg2.getChangeVersionControl();
                ILogger iLogger = this.logger;
                if (changeVersionControl > changeVersionControl2) {
                    iLogger.logD(UtilKt.MODULE_NAME, "Holdout " + protoHoldoutMsg.getKey() + " is newer than the one in cache, holdout will be updated");
                    FwFSerializer fwFSerializer = this.serializer;
                    try {
                        prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                        prepareinappmessagewithzippedassethtmllambda4.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoHoldoutMsg.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                        bArrSerializer2 = prepareinappmessagewithzippedassethtmllambda4.serializer(setgraphicmodalmaxwidthdpSerializer, protoHoldoutMsg);
                    } catch (SerializationException e) {
                        encodingError3 = fwFSerializer.getEncodingError(String.valueOf(e));
                        this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new holdout ", protoHoldoutMsg.getKey(), " for initial data failed - ", encodingError3));
                    } catch (IllegalArgumentException e2) {
                        encodingError3 = fwFSerializer.getEncodingError(String.valueOf(e2));
                        this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new holdout ", protoHoldoutMsg.getKey(), " for initial data failed - ", encodingError3));
                    }
                    if (bArrSerializer2 != null) {
                        linkedHashMap2.put(strGenerateHoldoutCacheKey, bArrSerializer2);
                        this.holdoutsCache.put(strGenerateHoldoutCacheKey, protoHoldoutMsg);
                        linkedHashMap.put(protoHoldoutMsg.getKey(), Long.valueOf(protoHoldoutMsg.getChangeVersionControl()));
                    }
                } else {
                    iLogger.logD(UtilKt.MODULE_NAME, "Holdout " + protoHoldoutMsg.getKey() + " is already up to date");
                }
            } else {
                this.logger.logD(UtilKt.MODULE_NAME, "Holdout " + protoHoldoutMsg.getKey() + " not found in cache, holdout will be added");
                this.holdoutsCache.put(strGenerateHoldoutCacheKey, protoHoldoutMsg);
                FwFSerializer fwFSerializer2 = this.serializer;
                try {
                    prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda5 = fwFSerializer2.protoBuf;
                    prepareinappmessagewithzippedassethtmllambda5.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = ProtoHoldoutMsg.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer2;
                    bArrSerializer = prepareinappmessagewithzippedassethtmllambda5.serializer(setgraphicmodalmaxwidthdpSerializer2, protoHoldoutMsg);
                } catch (SerializationException e3) {
                    encodingError4 = fwFSerializer2.getEncodingError(String.valueOf(e3));
                    this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new holdout ", protoHoldoutMsg.getKey(), " for initial data failed - ", encodingError4));
                } catch (IllegalArgumentException e4) {
                    encodingError4 = fwFSerializer2.getEncodingError(String.valueOf(e4));
                    this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding new holdout ", protoHoldoutMsg.getKey(), " for initial data failed - ", encodingError4));
                }
                if (bArrSerializer != null) {
                    linkedHashMap2.put(strGenerateHoldoutCacheKey, bArrSerializer);
                    linkedHashMap.put(protoHoldoutMsg.getKey(), Long.valueOf(protoHoldoutMsg.getChangeVersionControl()));
                }
            }
        }
        ICache iCache3 = this.storage;
        if (iCache3 != null) {
            iCache3.setAll(linkedHashMap2);
        }
        String strGenerateHoldoutKeysConfigCacheKey = UtilKt.generateHoldoutKeysConfigCacheKey(this.accessToken);
        byte[] fromStorage = getFromStorage(strGenerateHoldoutKeysConfigCacheKey);
        if (fromStorage != null) {
            FwFSerializer fwFSerializer3 = this.serializer;
            String strRemoteActionCompatParcelizer3 = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
            try {
                resetTransientState resettransientstate = fwFSerializer3.json;
                resettransientstate.getClass();
                objSerializer = resettransientstate.serializer(strRemoteActionCompatParcelizer3, new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(onDismissed.write)));
            } catch (SerializationException e5) {
                decodingError = fwFSerializer3.getDecodingError(String.valueOf(e5));
                m1$$ExternalSyntheticOutline0.m("Decoding stored holdout keys for initial data failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
                objSerializer = null;
            } catch (IllegalArgumentException e6) {
                decodingError = fwFSerializer3.getDecodingError(String.valueOf(e6));
                m1$$ExternalSyntheticOutline0.m("Decoding stored holdout keys for initial data failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
                objSerializer = null;
            }
            map = (Map) objSerializer;
        } else {
            map = null;
        }
        if (map != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                Long lValueOf = (Long) entry.getValue();
                Long l = (Long) linkedHashMap3.get(str);
                if (l != null) {
                    lValueOf = lValueOf == null ? l : Long.valueOf(Math.max(l.longValue(), lValueOf.longValue()));
                }
                linkedHashMap3.put(str, lValueOf);
            }
            if (linkedHashMap3.equals(map)) {
                return;
            }
            this.logger.logD(UtilKt.MODULE_NAME, "New holdout keys found, adding to storage");
            FwFSerializer fwFSerializer4 = this.serializer;
            try {
                resetTransientState resettransientstate2 = fwFSerializer4.json;
                resettransientstate2.getClass();
                strRemoteActionCompatParcelizer2 = resettransientstate2.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(onDismissed.write)), linkedHashMap3);
            } catch (SerializationException e7) {
                encodingError2 = fwFSerializer4.getEncodingError(String.valueOf(e7));
                m1$$ExternalSyntheticOutline0.m("Encoding holdout keys for initial data failed - ", encodingError2, this.logger, UtilKt.MODULE_NAME);
            } catch (IllegalArgumentException e8) {
                encodingError2 = fwFSerializer4.getEncodingError(String.valueOf(e8));
                m1$$ExternalSyntheticOutline0.m("Encoding holdout keys for initial data failed - ", encodingError2, this.logger, UtilKt.MODULE_NAME);
            }
            if (strRemoteActionCompatParcelizer2 == null || (iCache2 = this.storage) == null) {
                return;
            }
            iCache2.set(strGenerateHoldoutKeysConfigCacheKey, setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer2));
            return;
        }
        FwFSerializer fwFSerializer5 = this.serializer;
        try {
            resetTransientState resettransientstate3 = fwFSerializer5.json;
            resettransientstate3.getClass();
            strRemoteActionCompatParcelizer = resettransientstate3.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(onDismissed.write)), linkedHashMap);
        } catch (SerializationException e9) {
            encodingError = fwFSerializer5.getEncodingError(String.valueOf(e9));
            m1$$ExternalSyntheticOutline0.m("Encoding holdout keys for initial data failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
        } catch (IllegalArgumentException e10) {
            encodingError = fwFSerializer5.getEncodingError(String.valueOf(e10));
            m1$$ExternalSyntheticOutline0.m("Encoding holdout keys for initial data failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
        }
        if (strRemoteActionCompatParcelizer == null || (iCache = this.storage) == null) {
            return;
        }
        iCache.set(strGenerateHoldoutKeysConfigCacheKey, setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer));
    }

    public final void deleteRuntimeFeatureKeys$fwf_client_release(Set<String> set) {
        String strGenerateRuntimeFeatureKeysKey;
        byte[] fromStorage;
        String decodingError;
        Object objSerializer;
        String encodingError;
        ICache iCache;
        set.getClass();
        if (set.isEmpty() || (fromStorage = getFromStorage((strGenerateRuntimeFeatureKeysKey = UtilKt.generateRuntimeFeatureKeysKey(this.accessToken)))) == null) {
            return;
        }
        FwFSerializer fwFSerializer = this.serializer;
        String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(fromStorage);
        String strRemoteActionCompatParcelizer2 = null;
        try {
            resetTransientState resettransientstate = fwFSerializer.json;
            resettransientstate.getClass();
            objSerializer = resettransientstate.serializer(strRemoteActionCompatParcelizer, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1));
        } catch (SerializationException e) {
            decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
            m1$$ExternalSyntheticOutline0.m("Decoding runtime keys failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
            objSerializer = null;
        } catch (IllegalArgumentException e2) {
            decodingError = fwFSerializer.getDecodingError(String.valueOf(e2));
            m1$$ExternalSyntheticOutline0.m("Decoding runtime keys failed - ", decodingError, this.logger, UtilKt.MODULE_NAME);
            objSerializer = null;
        }
        Set set2 = (Set) objSerializer;
        if (set2 == null) {
            return;
        }
        Set setRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(set2, (Iterable) set);
        if (setRemoteActionCompatParcelizer.size() == set2.size()) {
            return;
        }
        if (setRemoteActionCompatParcelizer.isEmpty()) {
            ICache iCache2 = this.storage;
            if (iCache2 != null) {
                iCache2.delete(strGenerateRuntimeFeatureKeysKey);
                return;
            }
            return;
        }
        FwFSerializer fwFSerializer2 = this.serializer;
        try {
            resetTransientState resettransientstate2 = fwFSerializer2.json;
            resettransientstate2.getClass();
            strRemoteActionCompatParcelizer2 = resettransientstate2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1), setRemoteActionCompatParcelizer);
        } catch (SerializationException e3) {
            encodingError = fwFSerializer2.getEncodingError(String.valueOf(e3));
            m1$$ExternalSyntheticOutline0.m("Encoding runtime keys failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
        } catch (IllegalArgumentException e4) {
            encodingError = fwFSerializer2.getEncodingError(String.valueOf(e4));
            m1$$ExternalSyntheticOutline0.m("Encoding runtime keys failed - ", encodingError, this.logger, UtilKt.MODULE_NAME);
        }
        if (strRemoteActionCompatParcelizer2 == null || (iCache = this.storage) == null) {
            return;
        }
        iCache.set(strGenerateRuntimeFeatureKeysKey, setCarryoverInAppMessage.RatingCompat(strRemoteActionCompatParcelizer2));
    }

    public final void setCustomerProfile$fwf_client_release(String str, String str2, ProtoCustomerProfileMsg protoCustomerProfileMsg) {
        String encodingError;
        byte[] bArrSerializer;
        ICache iCache;
        str.getClass();
        str2.getClass();
        protoCustomerProfileMsg.getClass();
        FwFSerializer fwFSerializer = this.serializer;
        try {
            prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
            prepareinappmessagewithzippedassethtmllambda4.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoCustomerProfileMsg.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            bArrSerializer = prepareinappmessagewithzippedassethtmllambda4.serializer(setgraphicmodalmaxwidthdpSerializer, protoCustomerProfileMsg);
        } catch (SerializationException e) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
            this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding customer profile ", str2, " failed - ", encodingError));
            bArrSerializer = null;
        } catch (IllegalArgumentException e2) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
            this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Encoding customer profile ", str2, " failed - ", encodingError));
            bArrSerializer = null;
        }
        if (bArrSerializer == null || (iCache = this.storage) == null) {
            return;
        }
        iCache.set(UtilKt.generateCustomerProfileKey(str, str2), bArrSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object setFeatures(Map<String, ProtoFeatureMsg> map, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        C01011 c01011;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        String encodingError;
        ILogger iLogger;
        String key;
        StringBuilder sb;
        byte[] bArrSerializer;
        if (shortNewsContentCardView instanceof C01011) {
            c01011 = (C01011) shortNewsContentCardView;
            int i = c01011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01011.label = i - Integer.MIN_VALUE;
            } else {
                c01011 = new C01011(shortNewsContentCardView);
            }
        } else {
            c01011 = new C01011(shortNewsContentCardView);
        }
        Object obj = c01011.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01011.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = this.featuresLock;
            c01011.L$0 = this;
            c01011.L$1 = map;
            c01011.L$2 = setcustominappmessageanimationfactorylambda0;
            c01011.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(c01011) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) c01011.L$2;
            Map<String, ProtoFeatureMsg> map2 = (Map) c01011.L$1;
            memoryCache = (MemoryCache) c01011.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            map = map2;
        }
        try {
            for (Map.Entry<String, ProtoFeatureMsg> entry : map.entrySet()) {
                memoryCache.featuresCache.put(UtilKt.generateFeatureCacheKey(entry.getKey(), memoryCache.accessToken), entry.getValue());
            }
            setcustominappmessageanimationfactorylambda0.write(null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ProtoFeatureMsg> entry2 : map.entrySet()) {
                FwFSerializer fwFSerializer = memoryCache.serializer;
                ProtoFeatureMsg value = entry2.getValue();
                try {
                    prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                    prepareinappmessagewithzippedassethtmllambda4.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoFeatureMsg.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    bArrSerializer = prepareinappmessagewithzippedassethtmllambda4.serializer(setgraphicmodalmaxwidthdpSerializer, value);
                } catch (SerializationException e) {
                    encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
                    iLogger = memoryCache.logger;
                    key = entry2.getKey();
                    sb = new StringBuilder("Encoding feature ");
                    sb.append((Object) key);
                    sb.append(" failed - ");
                    sb.append(encodingError);
                    iLogger.logE(UtilKt.MODULE_NAME, sb.toString());
                    bArrSerializer = null;
                } catch (IllegalArgumentException e2) {
                    encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
                    iLogger = memoryCache.logger;
                    key = entry2.getKey();
                    sb = new StringBuilder("Encoding feature ");
                    sb.append((Object) key);
                    sb.append(" failed - ");
                    sb.append(encodingError);
                    iLogger.logE(UtilKt.MODULE_NAME, sb.toString());
                    bArrSerializer = null;
                }
                if (bArrSerializer != null) {
                    linkedHashMap.put(UtilKt.generateFeatureCacheKey(entry2.getKey(), memoryCache.accessToken), bArrSerializer);
                }
            }
            ICache iCache = memoryCache.storage;
            if (iCache != null) {
                iCache.setAll(linkedHashMap);
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object setHoldouts(Map<String, ProtoHoldoutMsg> map, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        C01021 c01021;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        MemoryCache memoryCache;
        String encodingError;
        ILogger iLogger;
        String key;
        StringBuilder sb;
        byte[] bArrSerializer;
        if (shortNewsContentCardView instanceof C01021) {
            c01021 = (C01021) shortNewsContentCardView;
            int i = c01021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01021.label = i - Integer.MIN_VALUE;
            } else {
                c01021 = new C01021(shortNewsContentCardView);
            }
        } else {
            c01021 = new C01021(shortNewsContentCardView);
        }
        Object obj = c01021.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01021.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = this.holdoutsLock;
            c01021.L$0 = this;
            c01021.L$1 = map;
            c01021.L$2 = setcustominappmessageanimationfactorylambda0;
            c01021.label = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(c01021) == coroutineSingletons) {
                return coroutineSingletons;
            }
            memoryCache = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) c01021.L$2;
            Map<String, ProtoHoldoutMsg> map2 = (Map) c01021.L$1;
            memoryCache = (MemoryCache) c01021.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            map = map2;
        }
        try {
            for (Map.Entry<String, ProtoHoldoutMsg> entry : map.entrySet()) {
                memoryCache.holdoutsCache.put(UtilKt.generateHoldoutCacheKey(entry.getKey(), memoryCache.accessToken), entry.getValue());
            }
            setcustominappmessageanimationfactorylambda0.write(null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ProtoHoldoutMsg> entry2 : map.entrySet()) {
                FwFSerializer fwFSerializer = memoryCache.serializer;
                ProtoHoldoutMsg value = entry2.getValue();
                try {
                    prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                    prepareinappmessagewithzippedassethtmllambda4.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoHoldoutMsg.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    bArrSerializer = prepareinappmessagewithzippedassethtmllambda4.serializer(setgraphicmodalmaxwidthdpSerializer, value);
                } catch (SerializationException e) {
                    encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
                    iLogger = memoryCache.logger;
                    key = entry2.getKey();
                    sb = new StringBuilder("Encoding holdout ");
                    sb.append((Object) key);
                    sb.append(" failed - ");
                    sb.append(encodingError);
                    iLogger.logE(UtilKt.MODULE_NAME, sb.toString());
                    bArrSerializer = null;
                } catch (IllegalArgumentException e2) {
                    encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
                    iLogger = memoryCache.logger;
                    key = entry2.getKey();
                    sb = new StringBuilder("Encoding holdout ");
                    sb.append((Object) key);
                    sb.append(" failed - ");
                    sb.append(encodingError);
                    iLogger.logE(UtilKt.MODULE_NAME, sb.toString());
                    bArrSerializer = null;
                }
                if (bArrSerializer != null) {
                    linkedHashMap.put(UtilKt.generateHoldoutCacheKey(entry2.getKey(), memoryCache.accessToken), bArrSerializer);
                }
            }
            ICache iCache = memoryCache.storage;
            if (iCache != null) {
                iCache.setAll(linkedHashMap);
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    private final Map<String, byte[]> getAllFromStorage(final Set<String> set) {
        Map<String, String> mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("cache_keys", String.valueOf(set)), new onViewAttachedToWindowlambda0("count", String.valueOf(set.size())));
        Map<String, byte[]> map = (Map) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_CACHE_STORAGE_LATENCY, mapRemoteActionCompatParcelizer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_cache.MemoryCache$getAllFromStorage$data$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Map<String, byte[]> invoke() {
                ICache iCache = this.this$0.storage;
                if (iCache != null) {
                    return iCache.getAll(set);
                }
                return null;
            }
        });
        MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, map != null ? MetricUtilsKt.METRIC_CACHE_STORAGE_HIT : MetricUtilsKt.METRIC_CACHE_STORAGE_MISS, 0L, mapRemoteActionCompatParcelizer, 2, null);
        return map;
    }

    public /* synthetic */ MemoryCache(ICache iCache, String str, ILogger iLogger, MetricProvider metricProvider, FwFSerializer fwFSerializer, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iCache, str, iLogger, metricProvider, fwFSerializer, (i & 32) != 0 ? false : z);
    }
}
