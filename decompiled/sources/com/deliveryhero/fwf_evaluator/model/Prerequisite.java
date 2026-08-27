package com.deliveryhero.fwf_evaluator.model;

import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Prerequisite {
    private final Object expectedVariation;
    private Feature feature;
    private final Participants participants;

    public final Object component1() {
        return this.expectedVariation;
    }

    public final Participants component2() {
        return this.participants;
    }

    public final Feature component3() {
        return this.feature;
    }

    public final Object getExpectedVariation() {
        return this.expectedVariation;
    }

    public final Feature getFeature() {
        return this.feature;
    }

    public final Participants getParticipants() {
        return this.participants;
    }

    public final void setFeature(Feature feature) {
        this.feature = feature;
    }

    public enum Participants {
        PARTICIPANTS_UNSPECIFIED(0),
        PARTICIPANTS_ALL(1),
        PARTICIPANTS_ONLY_PARTICIPANTS(2),
        PARTICIPANTS_ONLY_NON_PARTICIPANTS(3);

        private final int id;
        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        public static final Companion Companion = new Companion(null);

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final int getId() {
            return this.id;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Participants fromId(int i) {
                for (Participants participants : Participants.getEntries()) {
                    if (participants.getId() == i) {
                        return participants;
                    }
                }
                return Participants.PARTICIPANTS_UNSPECIFIED;
            }
        }

        Participants(int i) {
            this.id = i;
        }
    }

    public int hashCode() {
        int iHashCode = this.expectedVariation.hashCode();
        int iHashCode2 = this.participants.hashCode();
        Feature feature = this.feature;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (feature == null ? 0 : feature.hashCode());
    }

    public String toString() {
        return "Prerequisite(expectedVariation=" + this.expectedVariation + ", participants=" + this.participants + ", feature=" + this.feature + ")";
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Participants.values().length];
            try {
                iArr[Participants.PARTICIPANTS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Participants.PARTICIPANTS_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Participants.PARTICIPANTS_ONLY_PARTICIPANTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Participants.PARTICIPANTS_ONLY_NON_PARTICIPANTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Prerequisite(Object obj, Participants participants, Feature feature) {
        obj.getClass();
        participants.getClass();
        this.expectedVariation = obj;
        this.participants = participants;
        this.feature = feature;
    }

    public final Prerequisite copy(Object obj, Participants participants, Feature feature) {
        obj.getClass();
        participants.getClass();
        return new Prerequisite(obj, participants, feature);
    }

    public final boolean evaluatePrerequisite(User user, Object obj) {
        user.getClass();
        obj.getClass();
        Feature feature = this.feature;
        if (feature != null) {
            EvalResult evalResultEvaluateFeature = feature.evaluateFeature(user, obj);
            if (evalResultEvaluateFeature.getExplanation().getKind() == Explanation.Kind.FALLBACK) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{evalResultEvaluateFeature.getVariation(), this.expectedVariation}, getCieXyz.write())).booleanValue()) {
                if (feature.isExperiment()) {
                    int i = WhenMappings.$EnumSwitchMapping$0[this.participants.ordinal()];
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            return evalResultEvaluateFeature.getAbTest();
                        }
                        if (i == 4) {
                            return !evalResultEvaluateFeature.getAbTest();
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Prerequisite copy$default(Prerequisite prerequisite, Object obj, Participants participants, Feature feature, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = prerequisite.expectedVariation;
        }
        if ((i & 2) != 0) {
            participants = prerequisite.participants;
        }
        if ((i & 4) != 0) {
            feature = prerequisite.feature;
        }
        return prerequisite.copy(obj, participants, feature);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prerequisite)) {
            return false;
        }
        Prerequisite prerequisite = (Prerequisite) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expectedVariation, prerequisite.expectedVariation}, getCieXyz.write())).booleanValue() || this.participants != prerequisite.participants) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.feature, prerequisite.feature}, getCieXyz.write())).booleanValue();
    }
}
