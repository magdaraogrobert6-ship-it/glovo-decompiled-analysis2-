package com.google.api;

import androidx.compose.ui.graphics.Fields;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.BackwardsCompatNodeinitializeModifier3;
import o.ChainedPlatformTextInputInterceptortextInputSession2scope1startInputMethod3;
import o.ComposeUiNodeCompanionApplyOnDeactivatedNodeAssertion1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DelegatableNode;
import o.ModifierLocal;
import o.ModifierLocalManager;
import o.accessaddAlignmentLine;
import o.accessgetDetachedModifierLocalReadScopep;
import o.accessgetSentp;
import o.addAlignmentLine;
import o.component23;
import o.currentValueOf;
import o.decodeString;
import o.dumpRenderNodeData;
import o.encodenzbMABs;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalHapticFeedback;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getRequiredui;
import o.getSetLayoutDirection;
import o.getVirtualConstructor;
import o.interceptOutOfBoundsChildEvents;
import o.provide;
import o.setElement;
import o.setModifier;
import o.setUsedByModifierMeasurementui;
import o.setUsedDuringParentMeasurementui;
import o.transformMatrixToWindowEL8BTi8;
import o.updatedProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class Service extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private int bitField0_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Http http_;
    private Logging logging_;
    private Monitoring monitoring_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private Usage usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private decodeString apis_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString types_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString enums_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString endpoints_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString logs_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString metrics_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString monitoredResources_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
        this.bitField0_ &= -129;
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Api> getApisList() {
        return this.apis_;
    }

    public List<? extends ChainedPlatformTextInputInterceptortextInputSession2scope1startInputMethod3> getApisOrBuilderList() {
        return this.apis_;
    }

    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public List<? extends addAlignmentLine> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public List<? extends getLocalHapticFeedback> getEnumsOrBuilderList() {
        return this.enums_;
    }

    public String getId() {
        return this.id_;
    }

    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public List<? extends setUsedDuringParentMeasurementui> getLogsOrBuilderList() {
        return this.logs_;
    }

    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public List<? extends interceptOutOfBoundsChildEvents> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public List<? extends BackwardsCompatNodeinitializeModifier3> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    public String getName() {
        return this.name_;
    }

    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    public String getTitle() {
        return this.title_;
    }

    public List<Type> getTypesList() {
        return this.types_;
    }

    public List<? extends encodenzbMABs> getTypesOrBuilderList() {
        return this.types_;
    }

    public boolean hasAuthentication() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBackend() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBilling() {
        return (this.bitField0_ & Fields.RotationY) != 0;
    }

    public boolean hasConfigVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasContext() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasControl() {
        return (this.bitField0_ & Fields.RotationX) != 0;
    }

    public boolean hasDocumentation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHttp() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLogging() {
        return (this.bitField0_ & Fields.RotationZ) != 0;
    }

    public boolean hasMonitoring() {
        return (this.bitField0_ & Fields.CameraDistance) != 0;
    }

    public boolean hasQuota() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSourceInfo() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasSystemParameters() {
        return (this.bitField0_ & Fields.TransformOrigin) != 0;
    }

    public boolean hasUsage() {
        return (this.bitField0_ & Fields.SpotShadowColor) != 0;
    }

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        GeneratedMessageLite.registerDefaultInstance(Service.class, service);
    }

    public static getVirtualConstructor newBuilder() {
        return (getVirtualConstructor) DEFAULT_INSTANCE.createBuilder();
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getSetLayoutDirection.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new getVirtualConstructor(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0001\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006ဉ\u0001\bဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005\fဉ\u0006\u000fဉ\u0007\u0012\u001b\u0014ဉ\u0000\u0015ဉ\b\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001aဉ\t\u001bဉ\n\u001cဉ\u000b\u001dဉ\f!Ȉ%ဉ\r", new Object[]{"bitField0_", "name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (Service.class) {
                    compositionLocalsKtLocalLayoutDirection1 = PARSER;
                    if (compositionLocalsKtLocalLayoutDirection1 == null) {
                        compositionLocalsKtLocalLayoutDirection1 = new CompositionLocalsKtLocalLayoutDirection1(DEFAULT_INSTANCE);
                        PARSER = compositionLocalsKtLocalLayoutDirection1;
                    }
                    break;
                }
                return compositionLocalsKtLocalLayoutDirection1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public Api getApis(int i) {
        return (Api) this.apis_.get(i);
    }

    public int getApisCount() {
        return this.apis_.size();
    }

    public ChainedPlatformTextInputInterceptortextInputSession2scope1startInputMethod3 getApisOrBuilder(int i) {
        return (ChainedPlatformTextInputInterceptortextInputSession2scope1startInputMethod3) this.apis_.get(i);
    }

    public Endpoint getEndpoints(int i) {
        return (Endpoint) this.endpoints_.get(i);
    }

    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    public addAlignmentLine getEndpointsOrBuilder(int i) {
        return (addAlignmentLine) this.endpoints_.get(i);
    }

    public Enum getEnums(int i) {
        return (Enum) this.enums_.get(i);
    }

    public int getEnumsCount() {
        return this.enums_.size();
    }

    public getLocalHapticFeedback getEnumsOrBuilder(int i) {
        return (getLocalHapticFeedback) this.enums_.get(i);
    }

    public getClipMetadata getIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.id_);
    }

    public LogDescriptor getLogs(int i) {
        return (LogDescriptor) this.logs_.get(i);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public setUsedDuringParentMeasurementui getLogsOrBuilder(int i) {
        return (setUsedDuringParentMeasurementui) this.logs_.get(i);
    }

    public MetricDescriptor getMetrics(int i) {
        return (MetricDescriptor) this.metrics_.get(i);
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public interceptOutOfBoundsChildEvents getMetricsOrBuilder(int i) {
        return (interceptOutOfBoundsChildEvents) this.metrics_.get(i);
    }

    public MonitoredResourceDescriptor getMonitoredResources(int i) {
        return (MonitoredResourceDescriptor) this.monitoredResources_.get(i);
    }

    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    public BackwardsCompatNodeinitializeModifier3 getMonitoredResourcesOrBuilder(int i) {
        return (BackwardsCompatNodeinitializeModifier3) this.monitoredResources_.get(i);
    }

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
    }

    public getClipMetadata getProducerProjectIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.producerProjectId_);
    }

    public getClipMetadata getTitleBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.title_);
    }

    public Type getTypes(int i) {
        return (Type) this.types_.get(i);
    }

    public int getTypesCount() {
        return this.types_.size();
    }

    public encodenzbMABs getTypesOrBuilder(int i) {
        return (encodenzbMABs) this.types_.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllApis(Iterable<? extends Api> iterable) {
        ensureApisIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.apis_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        ensureEndpointsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.endpoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends Enum> iterable) {
        ensureEnumsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.enums_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        ensureLogsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        ensureMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        ensureMonitoredResourcesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.monitoredResources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends Type> iterable) {
        ensureTypesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.types_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(Enum r2) {
        r2.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(type);
    }

    private void ensureApisIsMutable() {
        decodeString decodestring = this.apis_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.apis_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureEndpointsIsMutable() {
        decodeString decodestring = this.endpoints_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.endpoints_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureEnumsIsMutable() {
        decodeString decodestring = this.enums_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.enums_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureLogsIsMutable() {
        decodeString decodestring = this.logs_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.logs_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureMetricsIsMutable() {
        decodeString decodestring = this.metrics_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.metrics_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureMonitoredResourcesIsMutable() {
        decodeString decodestring = this.monitoredResources_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.monitoredResources_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureTypesIsMutable() {
        decodeString decodestring = this.types_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.types_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthentication(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 == null || authentication2 == Authentication.getDefaultInstance()) {
            this.authentication_ = authentication;
        } else {
            setElement setelementNewBuilder = Authentication.newBuilder(this.authentication_);
            setelementNewBuilder.read(authentication);
            this.authentication_ = (Authentication) setelementNewBuilder.read();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackend(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 == null || backend2 == Backend.getDefaultInstance()) {
            this.backend_ = backend;
        } else {
            ModifierLocal modifierLocalNewBuilder = Backend.newBuilder(this.backend_);
            modifierLocalNewBuilder.read(backend);
            this.backend_ = (Backend) modifierLocalNewBuilder.read();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBilling(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 == null || billing2 == Billing.getDefaultInstance()) {
            this.billing_ = billing;
        } else {
            ModifierLocalManager modifierLocalManagerNewBuilder = Billing.newBuilder(this.billing_);
            modifierLocalManagerNewBuilder.read(billing);
            this.billing_ = (Billing) modifierLocalManagerNewBuilder.read();
        }
        this.bitField0_ |= Fields.RotationY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 == null || uInt32Value2 == UInt32Value.getDefaultInstance()) {
            this.configVersion_ = uInt32Value;
        } else {
            accessgetSentp accessgetsentpNewBuilder = UInt32Value.newBuilder(this.configVersion_);
            accessgetsentpNewBuilder.read(uInt32Value);
            this.configVersion_ = (UInt32Value) accessgetsentpNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 == null || context2 == Context.getDefaultInstance()) {
            this.context_ = context;
        } else {
            updatedProvider updatedproviderNewBuilder = Context.newBuilder(this.context_);
            updatedproviderNewBuilder.read(context);
            this.context_ = (Context) updatedproviderNewBuilder.read();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControl(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 == null || control2 == Control.getDefaultInstance()) {
            this.control_ = control;
        } else {
            provide provideVarNewBuilder = Control.newBuilder(this.control_);
            provideVarNewBuilder.read(control);
            this.control_ = (Control) provideVarNewBuilder.read();
        }
        this.bitField0_ |= Fields.RotationX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentation(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 == null || documentation2 == Documentation.getDefaultInstance()) {
            this.documentation_ = documentation;
        } else {
            accessaddAlignmentLine accessaddalignmentlineNewBuilder = Documentation.newBuilder(this.documentation_);
            accessaddalignmentlineNewBuilder.read(documentation);
            this.documentation_ = (Documentation) accessaddalignmentlineNewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHttp(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 == null || http2 == Http.getDefaultInstance()) {
            this.http_ = http;
        } else {
            getRequiredui getrequireduiNewBuilder = Http.newBuilder(this.http_);
            getrequireduiNewBuilder.read(http);
            this.http_ = (Http) getrequireduiNewBuilder.read();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogging(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 == null || logging2 == Logging.getDefaultInstance()) {
            this.logging_ = logging;
        } else {
            setUsedByModifierMeasurementui setusedbymodifiermeasurementuiNewBuilder = Logging.newBuilder(this.logging_);
            setusedbymodifiermeasurementuiNewBuilder.read(logging);
            this.logging_ = (Logging) setusedbymodifiermeasurementuiNewBuilder.read();
        }
        this.bitField0_ |= Fields.RotationZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 == null || monitoring2 == Monitoring.getDefaultInstance()) {
            this.monitoring_ = monitoring;
        } else {
            accessgetDetachedModifierLocalReadScopep accessgetdetachedmodifierlocalreadscopepNewBuilder = Monitoring.newBuilder(this.monitoring_);
            accessgetdetachedmodifierlocalreadscopepNewBuilder.read(monitoring);
            this.monitoring_ = (Monitoring) accessgetdetachedmodifierlocalreadscopepNewBuilder.read();
        }
        this.bitField0_ |= Fields.CameraDistance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuota(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 == null || quota2 == Quota.getDefaultInstance()) {
            this.quota_ = quota;
        } else {
            setModifier setmodifierNewBuilder = Quota.newBuilder(this.quota_);
            setmodifierNewBuilder.read(quota);
            this.quota_ = (Quota) setmodifierNewBuilder.read();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 == null || sourceInfo2 == SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = sourceInfo;
        } else {
            ComposeUiNodeCompanionApplyOnDeactivatedNodeAssertion1 composeUiNodeCompanionApplyOnDeactivatedNodeAssertion1NewBuilder = SourceInfo.newBuilder(this.sourceInfo_);
            composeUiNodeCompanionApplyOnDeactivatedNodeAssertion1NewBuilder.read(sourceInfo);
            this.sourceInfo_ = (SourceInfo) composeUiNodeCompanionApplyOnDeactivatedNodeAssertion1NewBuilder.read();
        }
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 == null || systemParameters2 == SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = systemParameters;
        } else {
            currentValueOf currentvalueofNewBuilder = SystemParameters.newBuilder(this.systemParameters_);
            currentvalueofNewBuilder.read(systemParameters);
            this.systemParameters_ = (SystemParameters) currentvalueofNewBuilder.read();
        }
        this.bitField0_ |= Fields.TransformOrigin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUsage(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 == null || usage2 == Usage.getDefaultInstance()) {
            this.usage_ = usage;
        } else {
            DelegatableNode delegatableNodeNewBuilder = Usage.newBuilder(this.usage_);
            delegatableNodeNewBuilder.read(usage);
            this.usage_ = (Usage) delegatableNodeNewBuilder.read();
        }
        this.bitField0_ |= Fields.SpotShadowColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeApis(int i) {
        ensureApisIsMutable();
        this.apis_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEndpoints(int i) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnums(int i) {
        ensureEnumsIsMutable();
        this.enums_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i) {
        ensureLogsIsMutable();
        this.logs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMonitoredResources(int i) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTypes(int i) {
        ensureTypesIsMutable();
        this.types_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApis(int i, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.set(i, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
        this.bitField0_ |= Fields.RotationY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(Context context) {
        context.getClass();
        this.context_ = context;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControl(Control control) {
        control.getClass();
        this.control_ = control;
        this.bitField0_ |= Fields.RotationX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoints(int i, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.set(i, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnums(int i, Enum r3) {
        r3.getClass();
        ensureEnumsIsMutable();
        this.enums_.set(i, r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.id_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
        this.bitField0_ |= Fields.RotationZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
        this.bitField0_ |= Fields.CameraDistance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.name_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectId(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.producerProjectId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
        this.bitField0_ |= Fields.TransformOrigin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.title_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypes(int i, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.set(i, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
        this.bitField0_ |= Fields.SpotShadowColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = GeneratedMessageLite.emptyProtobufList();
    }

    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    public Backend getBackend() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    public Billing getBilling() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    public Control getControl() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    public Http getHttp() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    public Logging getLogging() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    public Quota getQuota() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    public Usage getUsage() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    private Service() {
    }

    public static getVirtualConstructor newBuilder(Service service) {
        return (getVirtualConstructor) DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static Service parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static Service parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(int i, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(i, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(int i, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(i, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(int i, Enum r3) {
        r3.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(i, r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(int i, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(i, type);
    }

    public static Service parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Service parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Service parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
