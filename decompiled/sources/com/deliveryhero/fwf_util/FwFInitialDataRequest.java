package com.deliveryhero.fwf_util;

import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.fwf_client.CommonDomain;
import com.deliveryhero.fwf_client.model.ProtoClauseMsg;
import com.deliveryhero.fwf_client.model.ProtoFeatureMsg;
import com.deliveryhero.fwf_client.model.ProtoFeatureOrErrorMsg;
import com.deliveryhero.fwf_client.model.ProtoFeaturesMsg;
import com.deliveryhero.fwf_client.model.ProtoRuleMsg;
import com.deliveryhero.fwf_client.model.ProtoTestTargetMsg;
import com.deliveryhero.fwf_client.model.ProtoValue;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.fwf_http.HTTPClient;
import com.deliveryhero.fwf_http.HTTPClientConfig;
import com.deliveryhero.fwf_http.HTTPRequestClient;
import com.deliveryhero.fwf_http.IFwFHTTPRequestClient;
import com.deliveryhero.fwf_http.Region;
import com.deliveryhero.fwf_logger.FwFLogLevel;
import com.deliveryhero.fwf_logger.FwFLogLevelKt;
import com.deliveryhero.fwf_logger.FwFLogger;
import com.deliveryhero.fwf_logger.IFwFLogging;
import com.deliveryhero.fwf_logger.Logger;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationException;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.getInAppMessageEventMap;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFInitialDataRequest {
    private final BundleType bundleType;
    private final getInAppMessageEventMap emailRegex;
    private final HTTPClient httpClient;
    private final Logger logger;
    private final MetricProvider metricProvider;
    private final FwFSerializer serializer;

    public enum BundleType {
        SERVER,
        CLIENT_FAIL,
        CLIENT_KEEP;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_util.FwFInitialDataRequest$getFeatures$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FwFInitialDataRequest.this.getFeatures(null, this);
        }
    }

    public static final class InvalidDataException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidDataException(String str) {
            super(str);
            str.getClass();
        }
    }

    private final boolean evaluateTargets(List<ProtoTestTargetMsg> list) {
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<String> values = ((ProtoTestTargetMsg) it.next()).getValues();
            if (values != null) {
                List<String> list2 = values;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (this.emailRegex.read(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it2.next()).toString())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean isBundleForServer() {
        return this.bundleType == BundleType.SERVER;
    }

    public FwFInitialDataRequest(Region region, String str, long j, IFwFHTTPRequestClient iFwFHTTPRequestClient, FwFLogLevel fwFLogLevel, IFwFLogging iFwFLogging, BundleType bundleType) {
        region.getClass();
        str.getClass();
        bundleType.getClass();
        this.bundleType = bundleType;
        this.emailRegex = new getInAppMessageEventMap("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
        Logger logger = new Logger(fwFLogLevel == null ? FwFLogLevelKt.getDEFAULT_LOG_LEVEL() : fwFLogLevel, iFwFLogging == null ? new FwFLogger() : iFwFLogging);
        this.logger = logger;
        MetricProvider metricProvider = CommonDomain.Companion.metricProvider(null);
        this.metricProvider = metricProvider;
        FwFSerializer fwFSerializer = new FwFSerializer();
        this.serializer = fwFSerializer;
        this.httpClient = new HTTPClient(new HTTPClientConfig(region, null, null, str, j, 6, null), logger, iFwFHTTPRequestClient == null ? new HTTPRequestClient() : iFwFHTTPRequestClient, metricProvider, fwFSerializer);
    }

    private final boolean containsEmail(ProtoFeatureMsg protoFeatureMsg) {
        if (evaluateTargets(protoFeatureMsg.getTargets()) || evaluateTargets(protoFeatureMsg.getSegments())) {
            return true;
        }
        List<ProtoRuleMsg> rules = protoFeatureMsg.getRules();
        if (rules == null) {
            return false;
        }
        Iterator<T> it = rules.iterator();
        while (it.hasNext()) {
            List<ProtoClauseMsg> clauses = ((ProtoRuleMsg) it.next()).getClauses();
            if (clauses != null) {
                Iterator<T> it2 = clauses.iterator();
                while (it2.hasNext()) {
                    List<ProtoValue> values = ((ProtoClauseMsg) it2.next()).getValues();
                    if (values != null) {
                        Iterator<T> it3 = values.iterator();
                        while (it3.hasNext()) {
                            String stringValue = ((ProtoValue) it3.next()).getStringValue();
                            if (stringValue != null && this.emailRegex.read(hideCurrentlyDisplayingInAppMessage.read((CharSequence) stringValue).toString())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object getFeatures(Set<String> set, ShortNewsContentCardView<? super byte[]> shortNewsContentCardView) throws InvalidDataException {
        AnonymousClass1 anonymousClass1;
        FwFInitialDataRequest fwFInitialDataRequest;
        Map<String, ProtoFeatureOrErrorMsg> features;
        Collection<ProtoFeatureOrErrorMsg> collectionValues;
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
        Object featuresInitialData = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(featuresInitialData);
            HTTPClient hTTPClient = this.httpClient;
            Set<String> set2 = set;
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(set2, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (Object obj : set2) {
                linkedHashMap.put(obj, null);
            }
            boolean zIsBundleForServer = isBundleForServer();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            featuresInitialData = hTTPClient.getFeaturesInitialData(linkedHashMap, zIsBundleForServer, anonymousClass1);
            if (featuresInitialData == coroutineSingletons) {
                return coroutineSingletons;
            }
            fwFInitialDataRequest = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fwFInitialDataRequest = (FwFInitialDataRequest) anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(featuresInitialData);
        }
        byte[] bArr = (byte[]) featuresInitialData;
        if (bArr != null) {
            FwFSerializer fwFSerializer = fwFInitialDataRequest.serializer;
            try {
                prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = fwFSerializer.protoBuf;
                prepareinappmessagewithzippedassethtmllambda4.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ProtoFeaturesMsg.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                ProtoFeaturesMsg protoFeaturesMsg = (ProtoFeaturesMsg) prepareinappmessagewithzippedassethtmllambda4.write(setgraphicmodalmaxwidthdpSerializer, bArr);
                if (!fwFInitialDataRequest.isBundleForServer()) {
                    fwFInitialDataRequest.logger.logD(FwFInitialDataRequestKt.MODULE_NAME, "Bundle is set to client, validating features, searching for emails");
                    ArrayList arrayList = new ArrayList();
                    if (protoFeaturesMsg != null && (features = protoFeaturesMsg.getFeatures()) != null && (collectionValues = features.values()) != null) {
                        Iterator<T> it = collectionValues.iterator();
                        while (it.hasNext()) {
                            ProtoFeatureMsg feature = ((ProtoFeatureOrErrorMsg) it.next()).getFeature();
                            if (feature != null && fwFInitialDataRequest.containsEmail(feature)) {
                                fwFInitialDataRequest.logger.logE(FwFInitialDataRequestKt.MODULE_NAME, feature.getKey() + " contains email address, initial data is invalid, please remove email address from targeting configuration before retrying");
                                arrayList.add(feature.getKey());
                            }
                        }
                    }
                    if (!arrayList.isEmpty() && fwFInitialDataRequest.bundleType != BundleType.CLIENT_KEEP) {
                        throw new InvalidDataException("The following features contain email addresses, bundle data is invalid: " + arrayList);
                    }
                }
                return bArr;
            } catch (SerializationException e) {
                String decodingError = fwFSerializer.getDecodingError(String.valueOf(e));
                fwFInitialDataRequest.logger.logE(FwFInitialDataRequestKt.MODULE_NAME, "Error decoding initial data: " + decodingError);
            } catch (IllegalArgumentException e2) {
                String decodingError2 = fwFSerializer.getDecodingError(String.valueOf(e2));
                fwFInitialDataRequest.logger.logE(FwFInitialDataRequestKt.MODULE_NAME, "Error decoding initial data: " + decodingError2);
                return null;
            }
        }
        return null;
    }

    public /* synthetic */ FwFInitialDataRequest(Region region, String str, long j, IFwFHTTPRequestClient iFwFHTTPRequestClient, FwFLogLevel fwFLogLevel, IFwFLogging iFwFLogging, BundleType bundleType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConstantKt.getDEFAULT_REGION() : region, str, (i & 4) != 0 ? 2000L : j, (i & 8) != 0 ? null : iFwFHTTPRequestClient, (i & 16) != 0 ? null : fwFLogLevel, (i & 32) != 0 ? null : iFwFLogging, (i & 64) != 0 ? BundleType.SERVER : bundleType);
    }
}
