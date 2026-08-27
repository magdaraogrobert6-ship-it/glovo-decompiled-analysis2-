package com.deliveryhero.fwf_evaluator.model;

import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.fwf_tracking.model.FwFEventValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.MediaSessionCompatQueueItem;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Feature {
    private final long changeVersionControl;
    private final Rule defaultRule;
    private final boolean enabled;
    private final boolean evalUserId;
    private final FwFEventValue eventValue;
    private final Object holdoutVariation;
    private final Object holdoutVariationName;
    private final List<Holdout> holdouts;
    private final String key;
    private final String kind;
    private final Object offVariation;
    private final Object offVariationName;
    private final List<Prerequisite> prerequisiteFeatures;
    private final List<Rule> rules;
    private final int runningExperimentId;
    private final String salt;
    private final List<TestTarget> segments;
    private final List<TestTarget> targets;
    private final List<String> trackingOutcomes;

    public final String component1() {
        return this.key;
    }

    public final Object component10() {
        return this.offVariationName;
    }

    public final List<Rule> component11() {
        return this.rules;
    }

    public final List<Prerequisite> component12() {
        return this.prerequisiteFeatures;
    }

    public final List<Holdout> component13() {
        return this.holdouts;
    }

    public final Object component14() {
        return this.holdoutVariation;
    }

    public final Object component15() {
        return this.holdoutVariationName;
    }

    public final long component16() {
        return this.changeVersionControl;
    }

    public final int component17() {
        return this.runningExperimentId;
    }

    public final List<String> component18() {
        return this.trackingOutcomes;
    }

    public final String component2() {
        return this.kind;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final boolean component4() {
        return this.evalUserId;
    }

    public final String component5() {
        return this.salt;
    }

    public final List<TestTarget> component6() {
        return this.targets;
    }

    public final List<TestTarget> component7() {
        return this.segments;
    }

    public final Rule component8() {
        return this.defaultRule;
    }

    public final Object component9() {
        return this.offVariation;
    }

    public final long getChangeVersionControl() {
        return this.changeVersionControl;
    }

    public final Rule getDefaultRule() {
        return this.defaultRule;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getEvalUserId() {
        return this.evalUserId;
    }

    public final FwFEventValue getEventValue() {
        return this.eventValue;
    }

    public final Object getHoldoutVariation() {
        return this.holdoutVariation;
    }

    public final Object getHoldoutVariationName() {
        return this.holdoutVariationName;
    }

    public final List<Holdout> getHoldouts() {
        return this.holdouts;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getKind() {
        return this.kind;
    }

    public final Object getOffVariation() {
        return this.offVariation;
    }

    public final Object getOffVariationName() {
        return this.offVariationName;
    }

    public final List<Prerequisite> getPrerequisiteFeatures() {
        return this.prerequisiteFeatures;
    }

    public final List<Rule> getRules() {
        return this.rules;
    }

    public final int getRunningExperimentId() {
        return this.runningExperimentId;
    }

    public final String getSalt() {
        return this.salt;
    }

    public final List<TestTarget> getSegments() {
        return this.segments;
    }

    public final List<TestTarget> getTargets() {
        return this.targets;
    }

    public final List<String> getTrackingOutcomes() {
        return this.trackingOutcomes;
    }

    public enum FeatureKind {
        AB_TEST("abtest"),
        ABN_TEST("abntest"),
        BOOLEAN("boolean"),
        MULTI_CONFIG("multivariate");

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        private final String kind;

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final String getKind() {
            return this.kind;
        }

        FeatureKind(String str) {
            this.kind = str;
        }
    }

    public Feature(String str, String str2, boolean z, boolean z2, String str3, List<TestTarget> list, List<TestTarget> list2, Rule rule, Object obj, Object obj2, List<Rule> list3, List<Prerequisite> list4, List<Holdout> list5, Object obj3, Object obj4, long j, int i, List<String> list6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        rule.getClass();
        obj.getClass();
        this.key = str;
        this.kind = str2;
        this.enabled = z;
        this.evalUserId = z2;
        this.salt = str3;
        this.targets = list;
        this.segments = list2;
        this.defaultRule = rule;
        this.offVariation = obj;
        this.offVariationName = obj2;
        this.rules = list3;
        this.prerequisiteFeatures = list4;
        this.holdouts = list5;
        this.holdoutVariation = obj3;
        this.holdoutVariationName = obj4;
        this.changeVersionControl = j;
        this.runningExperimentId = i;
        this.trackingOutcomes = list6;
        ArrayList arrayList = null;
        if (list4 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                Feature feature = ((Prerequisite) it.next()).getFeature();
                String str4 = feature != null ? feature.key : null;
                if (str4 != null) {
                    arrayList2.add(str4);
                }
            }
            arrayList = arrayList2;
        }
        this.eventValue = new FwFEventValue(str, Integer.valueOf(i), j, str2, obj3, obj4, arrayList);
    }

    private final Set<String> getFeatureAttributes() {
        Set<String> featureAttributes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<Holdout> list = this.holdouts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.addAll(((Holdout) it.next()).getClauseAttributes());
            }
        }
        List<Prerequisite> list2 = this.prerequisiteFeatures;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Feature feature = ((Prerequisite) it2.next()).getFeature();
                if (feature != null && (featureAttributes = feature.getFeatureAttributes()) != null) {
                    linkedHashSet.addAll(featureAttributes);
                }
            }
        }
        List<Rule> list3 = this.rules;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                linkedHashSet.addAll(((Rule) it3.next()).getClauseAttributes());
            }
        }
        return linkedHashSet;
    }

    private final Metadata getMetadata() {
        return new Metadata(this.kind, Boolean.valueOf(this.enabled), Long.valueOf(this.changeVersionControl));
    }

    private final boolean shouldEvaluatePrerequisites() {
        List<Prerequisite> list = this.prerequisiteFeatures;
        if (list == null || list.isEmpty()) {
            return false;
        }
        List<Prerequisite> list2 = this.prerequisiteFeatures;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((Prerequisite) it.next()).getFeature() == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean shouldTrackOutcome() {
        List<FwFEventValue.HoldoutEvaluation> holdoutEvaluations = this.eventValue.getHoldoutEvaluations();
        if (holdoutEvaluations != null && !holdoutEvaluations.isEmpty()) {
            return true;
        }
        List<String> list = this.trackingOutcomes;
        if (list != null) {
            return list.contains(this.eventValue.getOutcome().toString());
        }
        return false;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.kind), 31, this.enabled), 31, this.evalUserId), 31, this.salt);
        List<TestTarget> list = this.targets;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<TestTarget> list2 = this.segments;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        int iHashCode3 = this.defaultRule.hashCode();
        int iHashCode4 = this.offVariation.hashCode();
        Object obj = this.offVariationName;
        int iHashCode5 = obj == null ? 0 : obj.hashCode();
        List<Rule> list3 = this.rules;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        List<Prerequisite> list4 = this.prerequisiteFeatures;
        int iHashCode7 = list4 == null ? 0 : list4.hashCode();
        List<Holdout> list5 = this.holdouts;
        int iHashCode8 = list5 == null ? 0 : list5.hashCode();
        Object obj2 = this.holdoutVariation;
        int iHashCode9 = obj2 == null ? 0 : obj2.hashCode();
        Object obj3 = this.holdoutVariationName;
        int iM2 = af$$ExternalSyntheticOutline0.m(this.runningExperimentId, d$$ExternalSyntheticOutline0.m((((((((((((((iHashCode4 + ((iHashCode3 + ((((iM + iHashCode) * 31) + iHashCode2) * 31)) * 31)) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (obj3 == null ? 0 : obj3.hashCode())) * 31, 31, this.changeVersionControl), 31);
        List<String> list6 = this.trackingOutcomes;
        return iM2 + (list6 != null ? list6.hashCode() : 0);
    }

    public final boolean isExperiment() {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.kind, FeatureKind.AB_TEST.getKind()}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.kind, FeatureKind.ABN_TEST.getKind()}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        String str = this.key;
        String str2 = this.kind;
        boolean z = this.enabled;
        boolean z2 = this.evalUserId;
        String str3 = this.salt;
        List<TestTarget> list = this.targets;
        List<TestTarget> list2 = this.segments;
        Rule rule = this.defaultRule;
        Object obj = this.offVariation;
        Object obj2 = this.offVariationName;
        List<Rule> list3 = this.rules;
        List<Prerequisite> list4 = this.prerequisiteFeatures;
        List<Holdout> list5 = this.holdouts;
        Object obj3 = this.holdoutVariation;
        Object obj4 = this.holdoutVariationName;
        long j = this.changeVersionControl;
        int i = this.runningExperimentId;
        List<String> list6 = this.trackingOutcomes;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Feature(key=", str, ", kind=", str2, ", enabled=");
        af$$ExternalSyntheticOutline0.m(sbM, z, ", evalUserId=", z2, ", salt=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, str3, ", targets=", list, ", segments=");
        sbM.append(list2);
        sbM.append(", defaultRule=");
        sbM.append(rule);
        sbM.append(", offVariation=");
        sbM.append(obj);
        sbM.append(", offVariationName=");
        sbM.append(obj2);
        sbM.append(", rules=");
        sbM.append(list3);
        sbM.append(", prerequisiteFeatures=");
        sbM.append(list4);
        sbM.append(", holdouts=");
        sbM.append(list5);
        sbM.append(", holdoutVariation=");
        sbM.append(obj3);
        sbM.append(", holdoutVariationName=");
        sbM.append(obj4);
        sbM.append(", changeVersionControl=");
        sbM.append(j);
        sbM.append(", runningExperimentId=");
        sbM.append(i);
        sbM.append(", trackingOutcomes=");
        sbM.append(list6);
        sbM.append(")");
        return sbM.toString();
    }

    public final Feature copy(String str, String str2, boolean z, boolean z2, String str3, List<TestTarget> list, List<TestTarget> list2, Rule rule, Object obj, Object obj2, List<Rule> list3, List<Prerequisite> list4, List<Holdout> list5, Object obj3, Object obj4, long j, int i, List<String> list6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        rule.getClass();
        obj.getClass();
        return new Feature(str, str2, z, z2, str3, list, list2, rule, obj, obj2, list3, list4, list5, obj3, obj4, j, i, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, feature.key}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.kind, feature.kind}, getCieXyz.write())).booleanValue() || this.enabled != feature.enabled || this.evalUserId != feature.evalUserId) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.salt, feature.salt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.targets, feature.targets}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.segments, feature.segments}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.defaultRule, feature.defaultRule}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.offVariation, feature.offVariation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.offVariationName, feature.offVariationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rules, feature.rules}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.prerequisiteFeatures, feature.prerequisiteFeatures}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdouts, feature.holdouts}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariation, feature.holdoutVariation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariationName, feature.holdoutVariationName}, getCieXyz.write())).booleanValue() || this.changeVersionControl != feature.changeVersionControl || this.runningExperimentId != feature.runningExperimentId) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingOutcomes, feature.trackingOutcomes}, getCieXyz.write())).booleanValue();
    }

    public final EvalResult evaluateFeature(User user, Object obj) {
        List<Prerequisite> list;
        String str;
        String authUserId;
        user.getClass();
        obj.getClass();
        this.eventValue.setUserValues(user, this.evalUserId);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Holdout> list2 = this.holdouts;
        if (list2 != null) {
            for (Holdout holdout : list2) {
                if (holdout.isRunning()) {
                    if (holdout.getEvalNonAuth()) {
                        authUserId = user.getUnAuthUserId();
                    } else {
                        authUserId = user.getAuthUserId();
                    }
                    if (authUserId != null && authUserId.length() != 0 && holdout.evaluateHoldout(user.getAttributes())) {
                        linkedHashMap.put(holdout.getKey(), Boolean.valueOf(holdout.isUserHoldout(authUserId)));
                    }
                }
            }
        }
        if (linkedHashMap.values().contains(Boolean.TRUE)) {
            EvalResult holdoutResult = EvalResult.Companion.getHoldoutResult(getMetadata(), this.holdoutVariation, this.holdoutVariationName, obj, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
            FwFEventValue.setEvaluationValues$default(this.eventValue, holdoutResult, FwFEventValue.FwFEvaluationOutcome.HOLDOUT_PARTICIPATED, null, 4, null);
            return holdoutResult;
        }
        if (this.enabled) {
            if (shouldEvaluatePrerequisites() && (list = this.prerequisiteFeatures) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((Prerequisite) it.next()).evaluatePrerequisite(user, obj)) {
                        EvalResult.Companion companion = EvalResult.Companion;
                        Metadata metadata = getMetadata();
                        Object obj2 = this.offVariation;
                        Object obj3 = this.offVariationName;
                        List<Prerequisite> list3 = this.prerequisiteFeatures;
                        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            Feature feature = ((Prerequisite) it2.next()).getFeature();
                            if (feature == null || (str = feature.key) == null) {
                                str = "";
                            }
                            arrayList.add(str);
                        }
                        EvalResult prerequisiteFailedResult = companion.getPrerequisiteFailedResult(metadata, obj2, obj3, onContentCardDismissed.write(arrayList), linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
                        FwFEventValue.setEvaluationValues$default(this.eventValue, prerequisiteFailedResult, FwFEventValue.FwFEvaluationOutcome.FAILED_PREREQUISITE, null, 4, null);
                        return prerequisiteFailedResult;
                    }
                }
            }
            List<TestTarget> list4 = this.targets;
            if (list4 != null && !list4.isEmpty()) {
                for (TestTarget testTarget : this.targets) {
                    if (testTarget.evaluateTarget(user)) {
                        EvalResult targetResult = EvalResult.Companion.getTargetResult(getMetadata(), testTarget.getVariation(), testTarget.getVariationName(), obj, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
                        FwFEventValue.setEvaluationValues$default(this.eventValue, targetResult, FwFEventValue.FwFEvaluationOutcome.INDIVIDUAL_TARGET, null, 4, null);
                        return targetResult;
                    }
                }
            }
            List<TestTarget> list5 = this.segments;
            if (list5 != null && !list5.isEmpty()) {
                for (TestTarget testTarget2 : this.segments) {
                    if (testTarget2.evaluateTarget(user)) {
                        EvalResult segmentResult = EvalResult.Companion.getSegmentResult(getMetadata(), testTarget2.getVariation(), testTarget2.getVariationName(), obj, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
                        FwFEventValue.setEvaluationValues$default(this.eventValue, segmentResult, FwFEventValue.FwFEvaluationOutcome.GROUP_TARGET, null, 4, null);
                        return segmentResult;
                    }
                }
            }
            List<Rule> list6 = this.rules;
            if (list6 != null && !list6.isEmpty()) {
                int i = 0;
                for (Object obj4 : this.rules) {
                    if (i >= 0) {
                        Rule rule = (Rule) obj4;
                        if (rule.evaluateClauses(user.getAttributes())) {
                            if (!shouldAllocateUser(rule, user)) {
                                EvalResult experimentIdentifierFailedResult = EvalResult.Companion.getExperimentIdentifierFailedResult(getMetadata(), this.offVariation, this.offVariationName, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
                                FwFEventValue.setEvaluationValues$default(this.eventValue, experimentIdentifierFailedResult, FwFEventValue.FwFEvaluationOutcome.MISSING_RANDOMIZATION_IDENTIFIER, null, 4, null);
                                return experimentIdentifierFailedResult;
                            }
                            Rule.RuleAllocation ruleAllocation = rule.getRuleAllocation(this.key, this.salt, user.getIdentifier$fwf_client_release(this.evalUserId));
                            EvalResult ruleResult = EvalResult.Companion.getRuleResult(getMetadata(), ruleAllocation.getVariation(), ruleAllocation.getVariationName(), ruleAllocation.getParticipating(), i, rule.getClauseAttributes(), obj, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
                            this.eventValue.setEvaluationValues(ruleResult, this.eventValue.getRuleOutcome(rule.isRunningRollout(), isExperiment(), ruleResult.getAbTest()), ruleAllocation.getBucket());
                            return ruleResult;
                        }
                        i++;
                    } else {
                        SQLite.serializer();
                        throw null;
                    }
                }
            }
            if (!shouldAllocateUser(this.defaultRule, user)) {
                EvalResult experimentIdentifierFailedResult2 = EvalResult.Companion.getExperimentIdentifierFailedResult(getMetadata(), this.offVariation, this.offVariationName, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
                FwFEventValue.setEvaluationValues$default(this.eventValue, experimentIdentifierFailedResult2, FwFEventValue.FwFEvaluationOutcome.MISSING_RANDOMIZATION_IDENTIFIER, null, 4, null);
                return experimentIdentifierFailedResult2;
            }
            Rule.RuleAllocation ruleAllocation2 = this.defaultRule.getRuleAllocation(this.key, this.salt, user.getIdentifier$fwf_client_release(this.evalUserId));
            EvalResult defaultRuleResult = EvalResult.Companion.getDefaultRuleResult(getMetadata(), ruleAllocation2.getVariation(), ruleAllocation2.getVariationName(), ruleAllocation2.getParticipating(), obj, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
            FwFEventValue fwFEventValue = this.eventValue;
            fwFEventValue.setEvaluationValues(defaultRuleResult, fwFEventValue.getRuleOutcome(this.defaultRule.isRunningRollout(), isExperiment(), defaultRuleResult.getAbTest()), ruleAllocation2.getBucket());
            return defaultRuleResult;
        }
        EvalResult offVariationResult = EvalResult.Companion.getOffVariationResult(getMetadata(), this.offVariation, this.offVariationName, linkedHashMap, user.getEvaluatedUserAttributes$fwf_client_release(getFeatureAttributes()));
        FwFEventValue.setEvaluationValues$default(this.eventValue, offVariationResult, FwFEventValue.FwFEvaluationOutcome.FLAG_STATE_OFF, null, 4, null);
        return offVariationResult;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r7.trackEvent$fwf_client_release(r10, r8, r9, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object trackEvent$fwf_client_release(com.deliveryhero.fwf_tracking.FwFTrackingService r7, java.util.Map<java.lang.String, java.lang.String> r8, com.deliveryhero.fwf_tracking.model.PerseusBrand r9, o.ShortNewsContentCardView<? super o.createFromParcel> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.deliveryhero.fwf_evaluator.model.Feature$trackEvent$1
            if (r0 == 0) goto L13
            r0 = r10
            com.deliveryhero.fwf_evaluator.model.Feature$trackEvent$1 r0 = (com.deliveryhero.fwf_evaluator.model.Feature$trackEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            com.deliveryhero.fwf_evaluator.model.Feature$trackEvent$1 r0 = new com.deliveryhero.fwf_evaluator.model.Feature$trackEvent$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.L$3
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$2
            com.deliveryhero.fwf_tracking.model.PerseusBrand r8 = (com.deliveryhero.fwf_tracking.model.PerseusBrand) r8
            java.lang.Object r9 = r0.L$1
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.L$0
            com.deliveryhero.fwf_tracking.FwFTrackingService r2 = (com.deliveryhero.fwf_tracking.FwFTrackingService) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L85
        L3a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            r7 = 0
            return r7
        L41:
            java.lang.Object r7 = r0.L$3
            r9 = r7
            com.deliveryhero.fwf_tracking.model.PerseusBrand r9 = (com.deliveryhero.fwf_tracking.model.PerseusBrand) r9
            java.lang.Object r7 = r0.L$2
            r8 = r7
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r7 = r0.L$1
            com.deliveryhero.fwf_tracking.FwFTrackingService r7 = (com.deliveryhero.fwf_tracking.FwFTrackingService) r7
            java.lang.Object r2 = r0.L$0
            com.deliveryhero.fwf_evaluator.model.Feature r2 = (com.deliveryhero.fwf_evaluator.model.Feature) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L76
        L57:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            boolean r10 = r6.shouldTrackOutcome()
            if (r10 == 0) goto L75
            if (r7 == 0) goto L75
            com.deliveryhero.fwf_tracking.model.FwFEventValue r10 = r6.eventValue
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r10 = r7.trackEvent$fwf_client_release(r10, r8, r9, r0)
            if (r10 != r1) goto L75
            goto Lb1
        L75:
            r2 = r6
        L76:
            java.util.List<com.deliveryhero.fwf_evaluator.model.Prerequisite> r10 = r2.prerequisiteFeatures
            if (r10 == 0) goto Lb2
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r7
            r7 = r10
            r5 = r9
            r9 = r8
            r8 = r5
        L85:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lb2
            java.lang.Object r10 = r7.next()
            com.deliveryhero.fwf_evaluator.model.Prerequisite r10 = (com.deliveryhero.fwf_evaluator.model.Prerequisite) r10
            com.deliveryhero.fwf_evaluator.model.Feature r10 = r10.getFeature()
            if (r10 == 0) goto L85
            boolean r4 = r10.shouldTrackOutcome()
            if (r4 == 0) goto L85
            if (r2 == 0) goto L85
            com.deliveryhero.fwf_tracking.model.FwFEventValue r10 = r10.eventValue
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r8
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r10 = r2.trackEvent$fwf_client_release(r10, r9, r8, r0)
            if (r10 != r1) goto L85
        Lb1:
            return r1
        Lb2:
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.fwf_evaluator.model.Feature.trackEvent$fwf_client_release(com.deliveryhero.fwf_tracking.FwFTrackingService, java.util.Map, com.deliveryhero.fwf_tracking.model.PerseusBrand, o.ShortNewsContentCardView):java.lang.Object");
    }

    private final boolean shouldAllocateUser(Rule rule, User user) {
        if (!isExperiment() || !rule.isRunningRollout()) {
            return true;
        }
        if (this.evalUserId) {
            String authUserId = user.getAuthUserId();
            return (authUserId == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) authUserId)) ? false : true;
        }
        String unAuthUserId = user.getUnAuthUserId();
        return (unAuthUserId == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) unAuthUserId)) ? false : true;
    }
}
