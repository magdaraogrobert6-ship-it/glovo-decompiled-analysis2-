package com.deliveryhero.fwf_tracking.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.fwf_evaluator.model.EvalResult;
import com.deliveryhero.fwf_evaluator.model.Explanation;
import com.deliveryhero.fwf_evaluator.model.User;
import com.deliveryhero.fwf_http.PlatformKt;
import com.deliveryhero.fwf_util.FwFConversionKt;
import com.deliveryhero.fwf_util.FwFSerializer;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setShouldNextUnregisterBeSkipped;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFEventValue {
    private boolean abtestParticipated;
    private PerseusBrand brand;
    private final long changeVersionControl;
    private String clientId;
    private PerseusConsent consent;
    private String country;
    private final List<String> evaluatedPrerequisites;
    private Explanation.Kind evaluationKind;
    private final String evaluationTimestamp;
    private final String eventAction;
    private final Integer experimentActivityId;
    private Map<String, String> explanationMetadata;
    private String featureAccount;
    private String featureEnvironment;
    private final String featureKey;
    private final String featureKind;
    private String featureProject;
    private String globalEntityId;
    private final String hitMatchId;
    private List<HoldoutEvaluation> holdoutEvaluations;
    private final Object holdoutVariation;
    private final Object holdoutVariationName;
    private FwFEvaluationOutcome outcome;
    private final String perseusDataSource;
    private String randomizationUnit;
    private Float randomizationUnitBucket;
    private String rechargeTo;
    private Integer ruleId;
    private final String sdkVersion;
    private String service;
    private String sessionId;
    private Map<String, ? extends Object> userContext;
    private String userId;
    private Object variation;
    private Object variationName;

    public enum FwFEvaluationOutcome {
        HOLDOUT_PARTICIPATED,
        EXPERIMENT_PARTICIPATED,
        INDIVIDUAL_TARGET,
        GROUP_TARGET,
        FAILED_PREREQUISITE,
        FLAG_STATE_OFF,
        MISSING_RANDOMIZATION_IDENTIFIER,
        VARIANT_NON_PARTICIPANT,
        FEATURE_ROLLOUT,
        RULE_VARIANT,
        FALLBACK,
        UNDEFINED;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    @Serializable
    public static final class HoldoutEvaluation {
        public static final Companion Companion = new Companion(null);
        private final boolean holdoutEvaluation;
        private final String holdoutKey;
        private final String holdoutVariation;
        private final String holdoutVariationName;

        public static final /* synthetic */ void write$Self$fwf_client_release(HoldoutEvaluation holdoutEvaluation, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, holdoutEvaluation.holdoutEvaluation);
            defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, holdoutEvaluation.holdoutKey);
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeinappmessageviewclosed, holdoutEvaluation.holdoutVariation);
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeinappmessageviewclosed, holdoutEvaluation.holdoutVariationName);
        }

        public final boolean component1() {
            return this.holdoutEvaluation;
        }

        public final String component2() {
            return this.holdoutKey;
        }

        public final String component3() {
            return this.holdoutVariation;
        }

        public final String component4() {
            return this.holdoutVariationName;
        }

        public final boolean getHoldoutEvaluation() {
            return this.holdoutEvaluation;
        }

        public final String getHoldoutKey() {
            return this.holdoutKey;
        }

        public final String getHoldoutVariation() {
            return this.holdoutVariation;
        }

        public final String getHoldoutVariationName() {
            return this.holdoutVariationName;
        }

        public int hashCode() {
            int iM = af$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.holdoutEvaluation) * 31, 31, this.holdoutKey);
            String str = this.holdoutVariation;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.holdoutVariationName;
            return ((iM + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            boolean z = this.holdoutEvaluation;
            String str = this.holdoutKey;
            String str2 = this.holdoutVariation;
            String str3 = this.holdoutVariationName;
            StringBuilder sb = new StringBuilder("HoldoutEvaluation(holdoutEvaluation=");
            sb.append(z);
            sb.append(", holdoutKey=");
            sb.append(str);
            sb.append(", holdoutVariation=");
            return ff$$ExternalSyntheticOutline0.m(sb, str2, ", holdoutVariationName=", str3, ")");
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final setGraphicModalMaxWidthDp serializer() {
                return FwFEventValue$HoldoutEvaluation$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static /* synthetic */ HoldoutEvaluation copy$default(HoldoutEvaluation holdoutEvaluation, boolean z, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = holdoutEvaluation.holdoutEvaluation;
            }
            if ((i & 2) != 0) {
                str = holdoutEvaluation.holdoutKey;
            }
            if ((i & 4) != 0) {
                str2 = holdoutEvaluation.holdoutVariation;
            }
            if ((i & 8) != 0) {
                str3 = holdoutEvaluation.holdoutVariationName;
            }
            return holdoutEvaluation.copy(z, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HoldoutEvaluation)) {
                return false;
            }
            HoldoutEvaluation holdoutEvaluation = (HoldoutEvaluation) obj;
            if (this.holdoutEvaluation != holdoutEvaluation.holdoutEvaluation) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutKey, holdoutEvaluation.holdoutKey}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariation, holdoutEvaluation.holdoutVariation}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariationName, holdoutEvaluation.holdoutVariationName}, getCieXyz.write())).booleanValue();
        }

        public final HoldoutEvaluation copy(boolean z, String str, String str2, String str3) {
            str.getClass();
            return new HoldoutEvaluation(z, str, str2, str3);
        }

        @onItemDismisslambda0
        public /* synthetic */ HoldoutEvaluation(int i, boolean z, String str, String str2, String str3, onCloseClicked oncloseclicked) {
            if (15 == (i & 15)) {
                this.holdoutEvaluation = z;
                this.holdoutKey = str;
                this.holdoutVariation = str2;
                this.holdoutVariationName = str3;
                return;
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, FwFEventValue$HoldoutEvaluation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public HoldoutEvaluation(boolean z, String str, String str2, String str3) {
            str.getClass();
            this.holdoutEvaluation = z;
            this.holdoutKey = str;
            this.holdoutVariation = str2;
            this.holdoutVariationName = str3;
        }
    }

    public final String component1() {
        return this.featureKey;
    }

    public final Integer component2() {
        return this.experimentActivityId;
    }

    public final long component3() {
        return this.changeVersionControl;
    }

    public final String component4() {
        return this.featureKind;
    }

    public final Object component5() {
        return this.holdoutVariation;
    }

    public final Object component6() {
        return this.holdoutVariationName;
    }

    public final List<String> component7() {
        return this.evaluatedPrerequisites;
    }

    public final boolean getAbtestParticipated() {
        return this.abtestParticipated;
    }

    public final PerseusBrand getBrand() {
        return this.brand;
    }

    public final long getChangeVersionControl() {
        return this.changeVersionControl;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final PerseusConsent getConsent() {
        return this.consent;
    }

    public final String getCountry() {
        return this.country;
    }

    public final List<String> getEvaluatedPrerequisites() {
        return this.evaluatedPrerequisites;
    }

    public final Explanation.Kind getEvaluationKind() {
        return this.evaluationKind;
    }

    public final String getEvaluationTimestamp() {
        return this.evaluationTimestamp;
    }

    public final String getEventAction() {
        return this.eventAction;
    }

    public final Integer getExperimentActivityId() {
        return this.experimentActivityId;
    }

    public final Map<String, String> getExplanationMetadata() {
        return this.explanationMetadata;
    }

    public final String getFeatureAccount() {
        return this.featureAccount;
    }

    public final String getFeatureEnvironment() {
        return this.featureEnvironment;
    }

    public final String getFeatureKey() {
        return this.featureKey;
    }

    public final String getFeatureKind() {
        return this.featureKind;
    }

    public final String getFeatureProject() {
        return this.featureProject;
    }

    public final String getGlobalEntityId() {
        return this.globalEntityId;
    }

    public final String getHitMatchId() {
        return this.hitMatchId;
    }

    public final List<HoldoutEvaluation> getHoldoutEvaluations() {
        return this.holdoutEvaluations;
    }

    public final Object getHoldoutVariation() {
        return this.holdoutVariation;
    }

    public final Object getHoldoutVariationName() {
        return this.holdoutVariationName;
    }

    public final FwFEvaluationOutcome getOutcome() {
        return this.outcome;
    }

    public final String getPerseusDataSource() {
        return this.perseusDataSource;
    }

    public final String getRandomizationUnit() {
        return this.randomizationUnit;
    }

    public final Float getRandomizationUnitBucket() {
        return this.randomizationUnitBucket;
    }

    public final String getRechargeTo() {
        return this.rechargeTo;
    }

    public final Integer getRuleId() {
        return this.ruleId;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Map<String, Object> getUserContext() {
        return this.userContext;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Object getVariation() {
        return this.variation;
    }

    public final Object getVariationName() {
        return this.variationName;
    }

    public final void setAbtestParticipated(boolean z) {
        this.abtestParticipated = z;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setExplanationMetadata(Map<String, String> map) {
        this.explanationMetadata = map;
    }

    public final void setHoldoutEvaluations(List<HoldoutEvaluation> list) {
        this.holdoutEvaluations = list;
    }

    public final void setRandomizationUnit(String str) {
        this.randomizationUnit = str;
    }

    public final void setRandomizationUnitBucket(Float f) {
        this.randomizationUnitBucket = f;
    }

    public final void setRechargeTo(String str) {
        this.rechargeTo = str;
    }

    public final void setRuleId(Integer num) {
        this.ruleId = num;
    }

    public final void setUserContext(Map<String, ? extends Object> map) {
        this.userContext = map;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setVariation(Object obj) {
        this.variation = obj;
    }

    public final void setVariationName(Object obj) {
        this.variationName = obj;
    }

    public int hashCode() {
        int iHashCode = this.featureKey.hashCode();
        Integer num = this.experimentActivityId;
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.changeVersionControl), 31, this.featureKind);
        Object obj = this.holdoutVariation;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.holdoutVariationName;
        int iHashCode3 = obj2 == null ? 0 : obj2.hashCode();
        List<String> list = this.evaluatedPrerequisites;
        return ((((iM + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "FwFEventValue(featureKey=" + this.featureKey + ", experimentActivityId=" + this.experimentActivityId + ", changeVersionControl=" + this.changeVersionControl + ", featureKind=" + this.featureKind + ", holdoutVariation=" + this.holdoutVariation + ", holdoutVariationName=" + this.holdoutVariationName + ", evaluatedPrerequisites=" + this.evaluatedPrerequisites + ")";
    }

    public FwFEventValue(String str, Integer num, long j, String str2, Object obj, Object obj2, List<String> list) {
        str.getClass();
        str2.getClass();
        this.featureKey = str;
        this.experimentActivityId = num;
        this.changeVersionControl = j;
        this.featureKind = str2;
        this.holdoutVariation = obj;
        this.holdoutVariationName = obj2;
        this.evaluatedPrerequisites = list;
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        instant.getClass();
        this.evaluationTimestamp = new setShouldNextUnregisterBeSkipped(instant).toString();
        this.sdkVersion = "FwFMultiplatformSDK:" + PlatformKt.getPlatform().getDeviceOS() + ":7.0.1";
        this.eventAction = FwFEventValueKt.FWF_EVENT;
        this.service = "";
        this.brand = PerseusBrand.TESTBRAND;
        this.globalEntityId = "";
        this.sessionId = "";
        this.hitMatchId = PerseusHelperKt.generateRandomTimeNumericAlphanumeric();
        this.perseusDataSource = PerseusHelperKt.getPerseusDataSource();
        this.featureAccount = "";
        this.featureProject = "";
        this.featureEnvironment = "";
        this.clientId = "";
        this.userId = "";
        this.outcome = FwFEvaluationOutcome.UNDEFINED;
        this.evaluationKind = Explanation.Kind.UNDEFINED;
        this.country = "";
        this.consent = PerseusConsent.UNDEFINED;
        this.rechargeTo = "";
    }

    public final FwFEventValue copy(String str, Integer num, long j, String str2, Object obj, Object obj2, List<String> list) {
        str.getClass();
        str2.getClass();
        return new FwFEventValue(str, num, j, str2, obj, obj2, list);
    }

    public final void setBrand(PerseusBrand perseusBrand) {
        perseusBrand.getClass();
        this.brand = perseusBrand;
    }

    public final void setConfigurationValues(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.featureAccount = str;
        this.featureProject = str2;
        this.featureEnvironment = str3;
    }

    public final void setConsent(PerseusConsent perseusConsent) {
        perseusConsent.getClass();
        this.consent = perseusConsent;
    }

    public final void setEvaluationKind(Explanation.Kind kind) {
        kind.getClass();
        this.evaluationKind = kind;
    }

    public final void setEvaluationValues(EvalResult evalResult, FwFEvaluationOutcome fwFEvaluationOutcome, Float f) {
        evalResult.getClass();
        fwFEvaluationOutcome.getClass();
        this.ruleId = Integer.valueOf(evalResult.getExplanation().getRuleIndex());
        this.abtestParticipated = evalResult.getAbTest();
        if (evalResult.getExplanation().getKind() == Explanation.Kind.FALLBACK) {
            fwFEvaluationOutcome = FwFEvaluationOutcome.FALLBACK;
        }
        this.outcome = fwFEvaluationOutcome;
        this.evaluationKind = evalResult.getExplanation().getKind();
        this.randomizationUnitBucket = f;
        Map<String, Boolean> evalHoldouts = evalResult.getExplanation().getEvalHoldouts();
        ArrayList arrayList = null;
        if (evalHoldouts != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, Boolean> entry : evalHoldouts.entrySet()) {
                Object obj = this.holdoutVariation;
                HoldoutEvaluation holdoutEvaluation = obj != null ? new HoldoutEvaluation(entry.getValue().booleanValue(), entry.getKey(), FwFConversionKt.asVariation(obj).toString(), EvalResult.Companion.getVariationName$fwf_client_release(obj, this.holdoutVariationName).toString()) : null;
                if (holdoutEvaluation != null) {
                    arrayList2.add(holdoutEvaluation);
                }
            }
            arrayList = arrayList2;
        }
        this.holdoutEvaluations = arrayList;
        this.variation = evalResult.getVariation();
        this.variationName = evalResult.getVariationName();
    }

    public final void setFeatureAccount(String str) {
        str.getClass();
        this.featureAccount = str;
    }

    public final void setFeatureEnvironment(String str) {
        str.getClass();
        this.featureEnvironment = str;
    }

    public final void setFeatureProject(String str) {
        str.getClass();
        this.featureProject = str;
    }

    public final void setGlobalEntityId(String str) {
        str.getClass();
        this.globalEntityId = str;
    }

    public final void setOutcome(FwFEvaluationOutcome fwFEvaluationOutcome) {
        fwFEvaluationOutcome.getClass();
        this.outcome = fwFEvaluationOutcome;
    }

    public final void setService(String str) {
        str.getClass();
        this.service = str;
    }

    public final void setSessionId(String str) {
        str.getClass();
        this.sessionId = str;
    }

    public final void setUserValues(User user, boolean z) {
        user.getClass();
        this.clientId = user.getUnAuthUserId();
        this.userId = user.getAuthUserId();
        String sessionId = user.getSessionId();
        if (sessionId == null) {
            sessionId = PerseusHelperKt.generateRandomTimeNumericAlphanumeric();
        }
        this.sessionId = sessionId;
        this.userContext = user.getAttributes();
        this.globalEntityId = user.getGlobalEntityId$fwf_client_release();
        this.country = user.getCountry$fwf_client_release();
        this.randomizationUnit = z ? user.getAuthUserId() : user.getUnAuthUserId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FwFEventValue)) {
            return false;
        }
        FwFEventValue fwFEventValue = (FwFEventValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureKey, fwFEventValue.featureKey}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.experimentActivityId, fwFEventValue.experimentActivityId}, getCieXyz.write())).booleanValue() || this.changeVersionControl != fwFEventValue.changeVersionControl) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureKind, fwFEventValue.featureKind}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariation, fwFEventValue.holdoutVariation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariationName, fwFEventValue.holdoutVariationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.evaluatedPrerequisites, fwFEventValue.evaluatedPrerequisites}, getCieXyz.write())).booleanValue();
    }

    public final Map<String, String> toMap(FwFSerializer fwFSerializer) {
        String strRemoteActionCompatParcelizer;
        fwFSerializer.getClass();
        Object obj = this.holdoutEvaluations;
        if (obj == null) {
            obj = instance_delegatelambda0.write;
        }
        try {
            resetTransientState resettransientstate = fwFSerializer.json;
            resettransientstate.getClass();
            strRemoteActionCompatParcelizer = resettransientstate.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(HoldoutEvaluation.Companion.serializer(), 0), obj);
        } catch (SerializationException e) {
            fwFSerializer.getEncodingError(String.valueOf(e));
            strRemoteActionCompatParcelizer = null;
        } catch (IllegalArgumentException e2) {
            fwFSerializer.getEncodingError(String.valueOf(e2));
            strRemoteActionCompatParcelizer = null;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("featureKey", this.featureKey);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("experimentActivityId", String.valueOf(this.experimentActivityId));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("changeVersionControl", String.valueOf(this.changeVersionControl));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0("featureKind", this.featureKind);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda4 = new onViewAttachedToWindowlambda0("evaluationTimestamp", this.evaluationTimestamp);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda5 = new onViewAttachedToWindowlambda0("fwfSdkVersion", this.sdkVersion);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda6 = new onViewAttachedToWindowlambda0("eventAction", this.eventAction);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda7 = new onViewAttachedToWindowlambda0("service", this.service);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda8 = new onViewAttachedToWindowlambda0("hitMatchId", this.hitMatchId);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda9 = new onViewAttachedToWindowlambda0("perseusDataSource", this.perseusDataSource);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda10 = new onViewAttachedToWindowlambda0("featureAccount", this.featureAccount);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda11 = new onViewAttachedToWindowlambda0("featureProject", this.featureProject);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda12 = new onViewAttachedToWindowlambda0("featureEnvironment", this.featureEnvironment);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda13 = new onViewAttachedToWindowlambda0("randomizationUnit", String.valueOf(this.randomizationUnit));
        Map<String, ? extends Object> map = this.userContext;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda14 = new onViewAttachedToWindowlambda0("userContext", String.valueOf(map != null ? FwFConversionKt.toJsonElement((Map<?, ?>) map) : null));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda15 = new onViewAttachedToWindowlambda0("ruleId", String.valueOf(this.ruleId));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda16 = new onViewAttachedToWindowlambda0("variation", String.valueOf(this.variation));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda17 = new onViewAttachedToWindowlambda0("variationName", String.valueOf(this.variationName));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda18 = new onViewAttachedToWindowlambda0("abtestParticipated", String.valueOf(this.abtestParticipated));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda19 = new onViewAttachedToWindowlambda0("fwfEvaluationOutcome", String.valueOf(this.outcome));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda20 = new onViewAttachedToWindowlambda0("evaluationKind", String.valueOf(this.evaluationKind));
        Map<String, String> map2 = this.explanationMetadata;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda21 = new onViewAttachedToWindowlambda0("explanationMetadata", String.valueOf(map2 != null ? FwFConversionKt.toJsonElement((Map<?, ?>) map2) : null));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda22 = new onViewAttachedToWindowlambda0("randomizationUnitBucket", String.valueOf(this.randomizationUnitBucket));
        if (strRemoteActionCompatParcelizer == null) {
            strRemoteActionCompatParcelizer = "";
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda23 = new onViewAttachedToWindowlambda0("holdoutEvaluations", strRemoteActionCompatParcelizer);
        List<String> list = this.evaluatedPrerequisites;
        return onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, onviewattachedtowindowlambda3, onviewattachedtowindowlambda4, onviewattachedtowindowlambda5, onviewattachedtowindowlambda6, onviewattachedtowindowlambda7, onviewattachedtowindowlambda8, onviewattachedtowindowlambda9, onviewattachedtowindowlambda10, onviewattachedtowindowlambda11, onviewattachedtowindowlambda12, onviewattachedtowindowlambda13, onviewattachedtowindowlambda14, onviewattachedtowindowlambda15, onviewattachedtowindowlambda16, onviewattachedtowindowlambda17, onviewattachedtowindowlambda18, onviewattachedtowindowlambda19, onviewattachedtowindowlambda20, onviewattachedtowindowlambda21, onviewattachedtowindowlambda22, onviewattachedtowindowlambda23, new onViewAttachedToWindowlambda0("evaluatedPrerequisites", String.valueOf(list != null ? FwFConversionKt.toJsonElement((Collection<?>) list) : null)));
    }

    public static /* synthetic */ void setEvaluationValues$default(FwFEventValue fwFEventValue, EvalResult evalResult, FwFEvaluationOutcome fwFEvaluationOutcome, Float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = null;
        }
        fwFEventValue.setEvaluationValues(evalResult, fwFEvaluationOutcome, f);
    }

    public final FwFEvaluationOutcome getRuleOutcome(boolean z, boolean z2, boolean z3) {
        if (!z) {
            return FwFEvaluationOutcome.RULE_VARIANT;
        }
        if (!z2) {
            return FwFEvaluationOutcome.FEATURE_ROLLOUT;
        }
        if (z3) {
            return FwFEvaluationOutcome.EXPERIMENT_PARTICIPATED;
        }
        return FwFEvaluationOutcome.VARIANT_NON_PARTICIPANT;
    }
}
