package com.deliveryhero.fwf_customer_profile;

import coil3.ExtrasKt;
import coil3.UriKt;
import com.deliveryhero.fwf_cache.MemoryCache;
import com.deliveryhero.fwf_client.Timer;
import com.deliveryhero.fwf_client.TimerKt;
import com.deliveryhero.fwf_client.model.ProtoCustomerProfileMsg;
import com.deliveryhero.fwf_client.model.SyncResult;
import com.deliveryhero.fwf_evaluator.model.User;
import com.deliveryhero.fwf_http.IHTTPClient;
import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import com.deliveryhero.fwf_logger.ILogger;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_metrics.MetricUtilsKt;
import com.deliveryhero.fwf_metrics.TagResource;
import com.deliveryhero.fwf_util.FwFSerializer;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.time.Clock;
import java.time.Instant;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ShortNewsContentCardView;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setGraphicModalMaxWidthDp;
import o.setShouldNextUnregisterBeSkipped;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerProfileClient {
    private final MemoryCache cache;
    private final CustomerProfileConfig config;
    private Timer customerProfileTimer;
    private final IHTTPClient httpClient;
    private final ILogger logger;
    private final MetricProvider metricProvider;
    private final FwFSerializer serializer;
    private final User user;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_customer_profile.CustomerProfileClient$loadUserProfile$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerProfileClient.this.loadUserProfile(this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_customer_profile.CustomerProfileClient$syncUserProfile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01091(ShortNewsContentCardView<? super C01091> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerProfileClient.this.syncUserProfile(this);
        }
    }

    public final CustomerProfileConfig getConfig() {
        return this.config;
    }

    public final Timer getCustomerProfileTimer$fwf_client_release() {
        return this.customerProfileTimer;
    }

    public final void setCustomerProfileTimer$fwf_client_release(Timer timer) {
        this.customerProfileTimer = timer;
    }

    private final SyncResult decodeProfileAndCache(final byte[] bArr, final String str) {
        final Map<String, String> mapSerializer = onMove.serializer(MetricUtilsKt.getResourceTag(TagResource.SERVER_RESPONSE_CUSTOMER_PROFILE_SYNC));
        SyncResult syncResult = (SyncResult) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_DECODING_DURATION, mapSerializer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_customer_profile.CustomerProfileClient$decodeProfileAndCache$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final SyncResult invoke() {
                FwFSerializer fwFSerializer = this.this$0.serializer;
                byte[] bArr2 = bArr;
                CustomerProfileClient customerProfileClient = this.this$0;
                Map<String, String> map = mapSerializer;
                try {
                    prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                    prepareinappmessagewithzippedassethtmllambda4.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoCustomerProfileMsg.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    ProtoCustomerProfileMsg protoCustomerProfileMsg = (ProtoCustomerProfileMsg) prepareinappmessagewithzippedassethtmllambda4.write(setgraphicmodalmaxwidthdpSerializer, bArr2);
                    if (protoCustomerProfileMsg == null) {
                        return null;
                    }
                    CustomerProfileClient customerProfileClient2 = this.this$0;
                    String str2 = str;
                    customerProfileClient2.cache.setCustomerProfileUpdateTime$fwf_client_release(customerProfileClient2.getConfig().getGlobalEntityId(), str2);
                    customerProfileClient2.cache.setCustomerProfile$fwf_client_release(customerProfileClient2.getConfig().getGlobalEntityId(), str2, protoCustomerProfileMsg);
                    customerProfileClient2.user.setAttributes(protoCustomerProfileMsg.toMap());
                    return SyncResult.Companion.successResult();
                } catch (SerializationException e) {
                    String decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                    MetricProvider.incrementCounter$fwf_client_release$default(customerProfileClient.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError)), 2, null);
                    return SyncResult.Companion.errorResult("Error decoding profile: " + decodingError);
                } catch (IllegalArgumentException e2) {
                    String decodingError2 = fwFSerializer.getDecodingError(String.valueOf(e2));
                    MetricProvider.incrementCounter$fwf_client_release$default(customerProfileClient.metricProvider, MetricUtilsKt.METRIC_DECODING_ERROR, 0L, onMove.serializer(map, MetricUtilsKt.getErrorTag(decodingError2)), 2, null);
                    return SyncResult.Companion.errorResult("Error decoding profile: " + decodingError2);
                }
            }
        });
        return syncResult == null ? SyncResult.Companion.errorResult("Error decoding profile") : syncResult;
    }

    private final String getCustomerId() {
        String authUserId = this.user.getAuthUserId();
        if (authUserId != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) authUserId)) {
            return authUserId;
        }
        this.logger.logE(CustomerProfileClientKt.MODULE_NAME, "Customer id (authUserId) is missing or invalid");
        return null;
    }

    private final Map<String, Object> getProfileFromCache(String str) {
        return this.cache.getCustomerProfile$fwf_client_release(this.config.getGlobalEntityId(), str);
    }

    private final boolean isProfileOutdated(String str) {
        setShouldNextUnregisterBeSkipped customerProfileUpdateTime$fwf_client_release = this.cache.getCustomerProfileUpdateTime$fwf_client_release(this.config.getGlobalEntityId(), str);
        if (customerProfileUpdateTime$fwf_client_release == null) {
            return true;
        }
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        instant.getClass();
        setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped = new setShouldNextUnregisterBeSkipped(instant);
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        return customerProfileUpdateTime$fwf_client_release.compareTo(setshouldnextunregisterbeskipped.write(BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(UriKt.IconCompatParcelizer(this.config.getProfileExpirationTime(), setUnregisteredInAppMessage.SECONDS)))) < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startUserProfileTimer(long j) {
        Timer timer = new Timer(TimerKt.RESOURCE_PROFILE, this.logger, j, new CustomerProfileClient$startUserProfileTimer$userProfileTimer$1(this));
        this.customerProfileTimer = timer;
        timer.startTimer();
    }

    public final void removeCustomerProfileAttributes$fwf_client_release() {
        Iterator<T> it = this.cache.getProfileAttributes$fwf_client_release().iterator();
        while (it.hasNext()) {
            this.user.removeAttribute((String) it.next());
        }
    }

    public CustomerProfileClient(CustomerProfileConfig customerProfileConfig, IHTTPClient iHTTPClient, MemoryCache memoryCache, ILogger iLogger, User user, MetricProvider metricProvider, FwFSerializer fwFSerializer) {
        customerProfileConfig.getClass();
        iHTTPClient.getClass();
        memoryCache.getClass();
        iLogger.getClass();
        user.getClass();
        metricProvider.getClass();
        fwFSerializer.getClass();
        this.config = customerProfileConfig;
        this.httpClient = iHTTPClient;
        this.cache = memoryCache;
        this.logger = iLogger;
        this.user = user;
        this.metricProvider = metricProvider;
        this.serializer = fwFSerializer;
    }

    public final void cancelTimer$fwf_client_release() {
        Timer timer = this.customerProfileTimer;
        if (timer != null) {
            timer.cancelTimer();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object syncUserProfile(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        C01091 c01091;
        CustomerProfileClient customerProfileClient;
        String str;
        if (shortNewsContentCardView instanceof C01091) {
            c01091 = (C01091) shortNewsContentCardView;
            int i = c01091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01091.label = i - Integer.MIN_VALUE;
            } else {
                c01091 = new C01091(shortNewsContentCardView);
            }
        } else {
            c01091 = new C01091(shortNewsContentCardView);
        }
        C01091 c01092 = c01091;
        Object objMeasureExecutionTimeSuspend$fwf_client_release$default = c01092.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01092.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release$default);
            if (this.config.isValid$fwf_client_release()) {
                this.logger.logD(CustomerProfileClientKt.MODULE_NAME, "User profile sync started");
                MetricProvider metricProvider = this.metricProvider;
                CustomerProfileClient$syncUserProfile$profileUpdated$1 customerProfileClient$syncUserProfile$profileUpdated$1 = new CustomerProfileClient$syncUserProfile$profileUpdated$1(this, null);
                c01092.L$0 = this;
                c01092.label = 1;
                objMeasureExecutionTimeSuspend$fwf_client_release$default = MetricProvider.measureExecutionTimeSuspend$fwf_client_release$default(metricProvider, MetricUtilsKt.METRIC_CUSTOMER_PROFILE_SYNC_DURATION, null, customerProfileClient$syncUserProfile$profileUpdated$1, c01092, 2, null);
                if (objMeasureExecutionTimeSuspend$fwf_client_release$default == coroutineSingletons) {
                    return coroutineSingletons;
                }
                customerProfileClient = this;
            } else {
                MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, MetricUtilsKt.METRIC_CUSTOMER_PROFILE_SYNC_ERROR, 0L, onMove.serializer(MetricUtilsKt.getErrorTag("Invalid configuration")), 2, null);
                this.logger.logE(CustomerProfileClientKt.MODULE_NAME, "The configuration for fetching user profile is missing or invalid");
                return SyncResult.Companion.errorResult("Invalid configuration");
            }
        } else if (i2 == 1) {
            customerProfileClient = (CustomerProfileClient) c01092.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release$default);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SyncResult syncResult = (SyncResult) objMeasureExecutionTimeSuspend$fwf_client_release$default;
        if (syncResult.getSuccess()) {
            str = MetricUtilsKt.METRIC_CUSTOMER_PROFILE_SYNC_SUCCESS;
        } else {
            str = MetricUtilsKt.METRIC_CUSTOMER_PROFILE_SYNC_ERROR;
        }
        MetricProvider.incrementCounter$fwf_client_release$default(customerProfileClient.metricProvider, str, 0L, onMove.serializer(MetricUtilsKt.getErrorTag(syncResult.getError())), 2, null);
        return syncResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadUserProfile(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        String str;
        CustomerProfileClient customerProfileClient;
        byte[] bArr;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String customerId = getCustomerId();
            if (customerId == null) {
                return SyncResult.Companion.errorResult("Unknown error");
            }
            Set<String> profileAttributes$fwf_client_release = this.cache.getProfileAttributes$fwf_client_release();
            if (profileAttributes$fwf_client_release.isEmpty()) {
                this.logger.logD(CustomerProfileClientKt.MODULE_NAME, "No profile attributes to fetch were found");
                return SyncResult.Companion.successResult();
            }
            boolean zIsProfileOutdated = isProfileOutdated(customerId);
            ILogger iLogger = this.logger;
            if (!zIsProfileOutdated) {
                iLogger.logD(CustomerProfileClientKt.MODULE_NAME, "Customer profile is up to date, getting from cache.");
                Map<String, ? extends Object> profileFromCache = getProfileFromCache(customerId);
                if (profileFromCache == null) {
                    return SyncResult.Companion.errorResult("Customer profile wasn't found in cache");
                }
                this.user.setAttributes(profileFromCache);
                return SyncResult.Companion.successResult();
            }
            iLogger.logD(CustomerProfileClientKt.MODULE_NAME, "Customer profile is outdated, requesting profile");
            IHTTPClient iHTTPClient = this.httpClient;
            CustomerProfileConfig customerProfileConfig = this.config;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = customerId;
            anonymousClass1.label = 1;
            Object customerProfile = iHTTPClient.getCustomerProfile(customerId, profileAttributes$fwf_client_release, customerProfileConfig, anonymousClass1);
            if (customerProfile == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = customerId;
            obj = customerProfile;
            customerProfileClient = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) anonymousClass1.L$1;
            customerProfileClient = (CustomerProfileClient) anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        FwFHTTPResponse fwFHTTPResponse = (FwFHTTPResponse) obj;
        if (fwFHTTPResponse.isSuccess$fwf_client_release() && (bArr = (byte[]) fwFHTTPResponse.getBody()) != null) {
            return customerProfileClient.decodeProfileAndCache(bArr, str);
        }
        return SyncResult.Companion.errorResult("Status code: " + fwFHTTPResponse.getStatusCode() + " - " + fwFHTTPResponse.getMessage());
    }
}
