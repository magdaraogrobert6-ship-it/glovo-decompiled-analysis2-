package com.deliveryhero.fwf_evaluator.model;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Explanation {
    private final String error;
    private final Set<String> evalAttrs;
    private final Set<String> evalFlags;
    private final Map<String, Boolean> evalHoldouts;
    private boolean fromEvalCache;
    private final Kind kind;
    private final int ruleIndex;
    private final Map<String, Object> userContext;

    public final Kind component1() {
        return this.kind;
    }

    public final int component2() {
        return this.ruleIndex;
    }

    public final Set<String> component3() {
        return this.evalAttrs;
    }

    public final Set<String> component4() {
        return this.evalFlags;
    }

    public final Map<String, Boolean> component5() {
        return this.evalHoldouts;
    }

    public final String component6() {
        return this.error;
    }

    public final Map<String, Object> component7() {
        return this.userContext;
    }

    public final boolean component8() {
        return this.fromEvalCache;
    }

    public final String getError() {
        return this.error;
    }

    public final Set<String> getEvalAttrs() {
        return this.evalAttrs;
    }

    public final Set<String> getEvalFlags() {
        return this.evalFlags;
    }

    public final Map<String, Boolean> getEvalHoldouts() {
        return this.evalHoldouts;
    }

    public final boolean getFromEvalCache() {
        return this.fromEvalCache;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final int getRuleIndex() {
        return this.ruleIndex;
    }

    public final Map<String, Object> getUserContext() {
        return this.userContext;
    }

    public final void setFromEvalCache(boolean z) {
        this.fromEvalCache = z;
    }

    public enum Kind {
        DEFAULT_RULE,
        RULE,
        OFF_VARIATION,
        PREREQUISITE_FAILED,
        ID_VALIDATION_FAILED,
        TARGET,
        SEGMENT,
        HOLDOUT,
        FALLBACK,
        UNDEFINED,
        ERROR;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        public static final Companion Companion = new Companion(null);

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Kind fromString$fwf_client_release(String str) {
                if (str == null) {
                    return null;
                }
                for (Kind kind : Kind.getEntries()) {
                    String strName = kind.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = strName.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = str.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (lowerCase.equals(lowerCase2)) {
                        return kind;
                    }
                }
                return null;
            }
        }

        public final boolean isErrorKind$fwf_client_release() {
            return this == FALLBACK || this == UNDEFINED || this == ERROR;
        }
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.ruleIndex, this.kind.hashCode() * 31, 31);
        Set<String> set = this.evalAttrs;
        int iHashCode = set == null ? 0 : set.hashCode();
        Set<String> set2 = this.evalFlags;
        int iHashCode2 = set2 == null ? 0 : set2.hashCode();
        Map<String, Boolean> map = this.evalHoldouts;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        String str = this.error;
        return Boolean.hashCode(this.fromEvalCache) + IconCompatParcelizer.RemoteActionCompatParcelizer((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31, this.userContext, 31);
    }

    public String toString() {
        return "Explanation(kind=" + this.kind + ", ruleIndex=" + this.ruleIndex + ", evalAttrs=" + this.evalAttrs + ", evalFlags=" + this.evalFlags + ", evalHoldouts=" + this.evalHoldouts + ", error=" + this.error + ", userContext=" + this.userContext + ", fromEvalCache=" + this.fromEvalCache + ")";
    }

    public final Explanation copy(Kind kind, int i, Set<String> set, Set<String> set2, Map<String, Boolean> map, String str, Map<String, ? extends Object> map2, boolean z) {
        kind.getClass();
        map2.getClass();
        return new Explanation(kind, i, set, set2, map, str, map2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Explanation)) {
            return false;
        }
        Explanation explanation = (Explanation) obj;
        if (this.kind != explanation.kind || this.ruleIndex != explanation.ruleIndex) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.evalAttrs, explanation.evalAttrs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.evalFlags, explanation.evalFlags}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.evalHoldouts, explanation.evalHoldouts}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, explanation.error}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userContext, explanation.userContext}, getCieXyz.write())).booleanValue() && this.fromEvalCache == explanation.fromEvalCache;
    }

    public /* synthetic */ Explanation(Kind kind, int i, Set set, Set set2, Map map, String str, Map map2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kind, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : set, (i2 & 8) != 0 ? null : set2, (i2 & 16) != 0 ? null : map, (i2 & 32) != 0 ? null : str, map2, (i2 & Fields.SpotShadowColor) != 0 ? false : z);
    }

    public Explanation(Kind kind, int i, Set<String> set, Set<String> set2, Map<String, Boolean> map, String str, Map<String, ? extends Object> map2, boolean z) {
        kind.getClass();
        map2.getClass();
        this.kind = kind;
        this.ruleIndex = i;
        this.evalAttrs = set;
        this.evalFlags = set2;
        this.evalHoldouts = map;
        this.error = str;
        this.userContext = map2;
        this.fromEvalCache = z;
    }
}
