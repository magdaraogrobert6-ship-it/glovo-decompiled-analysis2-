package com.deliveryhero.fwf_evaluator.model;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_evaluator.util.ConstantsKt;
import com.deliveryhero.fwf_util.FwFConversionKt;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class EvalResult {
    public static final Companion Companion = new Companion(null);
    private final boolean abTest;
    private final Explanation explanation;
    private final Metadata metadata;
    private final Object variation;
    private final Object variationName;

    public final Object component1() {
        return this.variation;
    }

    public final Object component2() {
        return this.variationName;
    }

    public final boolean component3() {
        return this.abTest;
    }

    public final Explanation component4() {
        return this.explanation;
    }

    public final Metadata component5() {
        return this.metadata;
    }

    public final boolean getAbTest() {
        return this.abTest;
    }

    public final Explanation getExplanation() {
        return this.explanation;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final Object getVariation() {
        return this.variation;
    }

    public final Object getVariationName() {
        return this.variationName;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EvalResult getDefaultRuleResult(Metadata metadata, Object obj, Object obj2, boolean z, Object obj3, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            obj3.getClass();
            map.getClass();
            map2.getClass();
            if (obj == null) {
                return invalidVariationFallbackResult$fwf_client_release(map2, obj3);
            }
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, EvalResult.Companion.getVariationName$fwf_client_release(objAsVariation, obj2), z, new Explanation(Explanation.Kind.DEFAULT_RULE, 0, null, null, map, null, map2, false, 172, null), metadata);
        }

        public final EvalResult getExperimentIdentifierFailedResult(Metadata metadata, Object obj, Object obj2, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            obj.getClass();
            map.getClass();
            map2.getClass();
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, getVariationName$fwf_client_release(objAsVariation, obj2), false, new Explanation(Explanation.Kind.ID_VALIDATION_FAILED, 0, null, null, map, ConstantsKt.INVALID_USER_IDENTIFIER_MESSAGE, map2, false, 142, null), metadata);
        }

        public final EvalResult getFallbackResult(Map<String, ? extends Object> map, Object obj, String str) {
            map.getClass();
            obj.getClass();
            str.getClass();
            return new EvalResult(obj, obj, false, new Explanation(Explanation.Kind.FALLBACK, 0, null, null, null, str, map, false, 158, null), null, 16, null);
        }

        public final EvalResult getHoldoutResult(Metadata metadata, Object obj, Object obj2, Object obj3, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            obj3.getClass();
            map.getClass();
            map2.getClass();
            if (obj == null) {
                return invalidVariationFallbackResult$fwf_client_release(map2, obj3);
            }
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, EvalResult.Companion.getVariationName$fwf_client_release(objAsVariation, obj2), false, new Explanation(Explanation.Kind.HOLDOUT, 0, null, null, map, null, map2, false, 174, null), metadata);
        }

        public final EvalResult getOffVariationResult(Metadata metadata, Object obj, Object obj2, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            obj.getClass();
            map.getClass();
            map2.getClass();
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, getVariationName$fwf_client_release(objAsVariation, obj2), false, new Explanation(Explanation.Kind.OFF_VARIATION, 0, null, null, map, null, map2, false, 174, null), metadata);
        }

        public final EvalResult getPrerequisiteFailedResult(Metadata metadata, Object obj, Object obj2, Set<String> set, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            obj.getClass();
            set.getClass();
            map.getClass();
            map2.getClass();
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, getVariationName$fwf_client_release(objAsVariation, obj2), false, new Explanation(Explanation.Kind.PREREQUISITE_FAILED, 0, null, set, map, null, map2, false, 166, null), metadata);
        }

        public final EvalResult getRuleResult(Metadata metadata, Object obj, Object obj2, boolean z, int i, Set<String> set, Object obj3, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            set.getClass();
            obj3.getClass();
            map.getClass();
            map2.getClass();
            if (obj == null) {
                return invalidVariationFallbackResult$fwf_client_release(map2, obj3);
            }
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, EvalResult.Companion.getVariationName$fwf_client_release(objAsVariation, obj2), z, new Explanation(Explanation.Kind.RULE, i, set, null, map, null, map2, false, DateTimeConstants.HOURS_PER_WEEK, null), metadata);
        }

        public final EvalResult getSegmentResult(Metadata metadata, Object obj, Object obj2, Object obj3, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            obj3.getClass();
            map.getClass();
            map2.getClass();
            if (obj == null) {
                return invalidVariationFallbackResult$fwf_client_release(map2, obj3);
            }
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, EvalResult.Companion.getVariationName$fwf_client_release(objAsVariation, obj2), false, new Explanation(Explanation.Kind.SEGMENT, 0, RangesKt.write((Object) "targetId"), null, map, null, map2, false, 170, null), metadata);
        }

        public final EvalResult getTargetResult(Metadata metadata, Object obj, Object obj2, Object obj3, Map<String, Boolean> map, Map<String, ? extends Object> map2) {
            metadata.getClass();
            obj3.getClass();
            map.getClass();
            map2.getClass();
            if (obj == null) {
                return invalidVariationFallbackResult$fwf_client_release(map2, obj3);
            }
            Object objAsVariation = FwFConversionKt.asVariation(obj);
            return new EvalResult(objAsVariation, EvalResult.Companion.getVariationName$fwf_client_release(objAsVariation, obj2), false, new Explanation(Explanation.Kind.TARGET, 0, RangesKt.write((Object) "targetId"), null, map, null, map2, false, 170, null), metadata);
        }

        public final EvalResult invalidVariationFallbackResult$fwf_client_release(Map<String, ? extends Object> map, Object obj) {
            map.getClass();
            obj.getClass();
            return new EvalResult(obj, obj, false, new Explanation(Explanation.Kind.FALLBACK, 0, null, null, null, ConstantsKt.INVALID_VARIATION_MESSAGE, map, false, 158, null), null, 16, null);
        }

        private Companion() {
        }

        public final Object getVariationName$fwf_client_release(Object obj, Object obj2) {
            obj.getClass();
            return obj2 != null ? FwFConversionKt.asVariation(obj2) : obj;
        }
    }

    public final String getVariationForTracking$fwf_client_release() {
        Object obj = this.variation;
        String str = obj instanceof String ? (String) obj : null;
        return (str == null || !ConstantsKt.getVariationRegex().read(str)) ? this.variationName.toString() : str;
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m((this.variationName.hashCode() + (this.variation.hashCode() * 31)) * 31, 31, this.abTest);
        int iHashCode = this.explanation.hashCode();
        Metadata metadata = this.metadata;
        return ((iHashCode + iM) * 31) + (metadata == null ? 0 : metadata.hashCode());
    }

    public String toString() {
        return "EvalResult(variation=" + this.variation + ", variationName=" + this.variationName + ", abTest=" + this.abTest + ", explanation=" + this.explanation + ", metadata=" + this.metadata + ")";
    }

    public EvalResult(Object obj, Object obj2, boolean z, Explanation explanation, Metadata metadata) {
        obj.getClass();
        obj2.getClass();
        explanation.getClass();
        this.variation = obj;
        this.variationName = obj2;
        this.abTest = z;
        this.explanation = explanation;
        this.metadata = metadata;
    }

    public final EvalResult copy(Object obj, Object obj2, boolean z, Explanation explanation, Metadata metadata) {
        obj.getClass();
        obj2.getClass();
        explanation.getClass();
        return new EvalResult(obj, obj2, z, explanation, metadata);
    }

    public static /* synthetic */ EvalResult copy$default(EvalResult evalResult, Object obj, Object obj2, boolean z, Explanation explanation, Metadata metadata, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = evalResult.variation;
        }
        if ((i & 2) != 0) {
            obj2 = evalResult.variationName;
        }
        Object obj4 = obj2;
        if ((i & 4) != 0) {
            z = evalResult.abTest;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            explanation = evalResult.explanation;
        }
        Explanation explanation2 = explanation;
        if ((i & 16) != 0) {
            metadata = evalResult.metadata;
        }
        return evalResult.copy(obj, obj4, z2, explanation2, metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvalResult)) {
            return false;
        }
        EvalResult evalResult = (EvalResult) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, evalResult.variation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, evalResult.variationName}, getCieXyz.write())).booleanValue() || this.abTest != evalResult.abTest) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.explanation, evalResult.explanation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, evalResult.metadata}, getCieXyz.write())).booleanValue();
    }

    public final EvalResult setFromEvalCache$fwf_client_release() {
        Explanation explanation = this.explanation;
        Explanation explanationCopy = explanation.copy((255 & 1) != 0 ? explanation.kind : null, (255 & 2) != 0 ? explanation.ruleIndex : 0, (255 & 4) != 0 ? explanation.evalAttrs : null, (255 & 8) != 0 ? explanation.evalFlags : null, (255 & 16) != 0 ? explanation.evalHoldouts : null, (255 & 32) != 0 ? explanation.error : null, (255 & 64) != 0 ? explanation.userContext : null, (255 & Fields.SpotShadowColor) != 0 ? explanation.fromEvalCache : false);
        explanationCopy.setFromEvalCache(true);
        return copy$default(this, null, null, false, explanationCopy, null, 23, null);
    }

    public /* synthetic */ EvalResult(Object obj, Object obj2, boolean z, Explanation explanation, Metadata metadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, z, explanation, (i & 16) != 0 ? null : metadata);
    }
}
