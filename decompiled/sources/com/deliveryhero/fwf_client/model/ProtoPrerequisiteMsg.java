package com.deliveryhero.fwf_client.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_cache.MemoryCache;
import com.deliveryhero.fwf_evaluator.model.Feature;
import com.deliveryhero.fwf_evaluator.model.Prerequisite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.ShortNewsContentCardView;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoPrerequisiteMsg {
    private final ProtoValue expectedVariation;
    private final String featureKey;
    private final ProtoParticipants participants;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {null, ProtoParticipants.Companion.serializer(), null};

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.model.ProtoPrerequisiteMsg$getAsPrerequisite$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProtoPrerequisiteMsg.this.getAsPrerequisite(null, this);
        }
    }

    public final ProtoValue component1() {
        return this.expectedVariation;
    }

    public final ProtoParticipants component2() {
        return this.participants;
    }

    public final String component3() {
        return this.featureKey;
    }

    public final ProtoValue getExpectedVariation() {
        return this.expectedVariation;
    }

    public final String getFeatureKey() {
        return this.featureKey;
    }

    public final ProtoParticipants getParticipants() {
        return this.participants;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoPrerequisiteMsg protoPrerequisiteMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, ProtoValue$$serializer.INSTANCE, protoPrerequisiteMsg.expectedVariation);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoPrerequisiteMsg.participants != ProtoParticipants.PARTICIPANTS_UNSPECIFIED) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setgraphicmodalmaxwidthdpArr[1], protoPrerequisiteMsg.participants);
        }
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, protoPrerequisiteMsg.featureKey);
    }

    public String toString() {
        ProtoValue protoValue = this.expectedVariation;
        ProtoParticipants protoParticipants = this.participants;
        String str = this.featureKey;
        StringBuilder sb = new StringBuilder("ProtoPrerequisiteMsg(expectedVariation=");
        sb.append(protoValue);
        sb.append(", participants=");
        sb.append(protoParticipants);
        sb.append(", featureKey=");
        return ff$$ExternalSyntheticOutline0.m(sb, str, ")");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoPrerequisiteMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final ProtoPrerequisiteMsg copy(ProtoValue protoValue, ProtoParticipants protoParticipants, String str) {
        protoParticipants.getClass();
        str.getClass();
        return new ProtoPrerequisiteMsg(protoValue, protoParticipants, str);
    }

    public static /* synthetic */ ProtoPrerequisiteMsg copy$default(ProtoPrerequisiteMsg protoPrerequisiteMsg, ProtoValue protoValue, ProtoParticipants protoParticipants, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            protoValue = protoPrerequisiteMsg.expectedVariation;
        }
        if ((i & 2) != 0) {
            protoParticipants = protoPrerequisiteMsg.participants;
        }
        if ((i & 4) != 0) {
            str = protoPrerequisiteMsg.featureKey;
        }
        return protoPrerequisiteMsg.copy(protoValue, protoParticipants, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoPrerequisiteMsg)) {
            return false;
        }
        ProtoPrerequisiteMsg protoPrerequisiteMsg = (ProtoPrerequisiteMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expectedVariation, protoPrerequisiteMsg.expectedVariation}, getCieXyz.write())).booleanValue() || this.participants != protoPrerequisiteMsg.participants) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureKey, protoPrerequisiteMsg.featureKey}, getCieXyz.write())).booleanValue();
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoPrerequisiteMsg(int i, ProtoValue protoValue, ProtoParticipants protoParticipants, String str, onCloseClicked oncloseclicked) {
        if (5 == (i & 5)) {
            this.expectedVariation = protoValue;
            if ((i & 2) == 0) {
                this.participants = ProtoParticipants.PARTICIPANTS_UNSPECIFIED;
            } else {
                this.participants = protoParticipants;
            }
            this.featureKey = str;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, ProtoPrerequisiteMsg$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getAsPrerequisite(MemoryCache memoryCache, ShortNewsContentCardView<? super Prerequisite> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        Object asAny;
        MemoryCache memoryCache2;
        Prerequisite.Participants participants;
        Object obj;
        Object obj2;
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
        Object asFeature = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    participants = (Prerequisite.Participants) anonymousClass1.L$3;
                    obj = anonymousClass1.L$2;
                    memoryCache2 = (MemoryCache) anonymousClass1.L$1;
                    ExtrasKt.RemoteActionCompatParcelizer(asFeature);
                } else {
                    if (i2 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    participants = (Prerequisite.Participants) anonymousClass1.L$1;
                    obj2 = anonymousClass1.L$0;
                    ExtrasKt.RemoteActionCompatParcelizer(asFeature);
                }
                return new Prerequisite(obj2, participants, (Feature) asFeature);
            }
            ExtrasKt.RemoteActionCompatParcelizer(asFeature);
            ProtoValue protoValue = this.expectedVariation;
            if (protoValue != null && (asAny = protoValue.getAsAny()) != null) {
                Prerequisite.Participants participantsFromId = Prerequisite.Participants.Companion.fromId(this.participants.getValue());
                String str = this.featureKey;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = memoryCache;
                anonymousClass1.L$2 = asAny;
                anonymousClass1.L$3 = participantsFromId;
                anonymousClass1.label = 1;
                Object feature = memoryCache.getFeature(str, anonymousClass1);
                if (feature != coroutineSingletons) {
                    memoryCache2 = memoryCache;
                    participants = participantsFromId;
                    obj = asAny;
                    asFeature = feature;
                }
                return coroutineSingletons;
            }
            return null;
            ProtoFeatureMsg protoFeatureMsg = (ProtoFeatureMsg) asFeature;
            if (protoFeatureMsg != null) {
                anonymousClass1.L$0 = obj;
                anonymousClass1.L$1 = participants;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 2;
                asFeature = protoFeatureMsg.getAsFeature(memoryCache2, anonymousClass1);
                if (asFeature != coroutineSingletons) {
                    obj2 = obj;
                    return new Prerequisite(obj2, participants, (Feature) asFeature);
                }
                return coroutineSingletons;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public int hashCode() {
        ProtoValue protoValue = this.expectedVariation;
        return this.featureKey.hashCode() + ((this.participants.hashCode() + ((protoValue == null ? 0 : protoValue.hashCode()) * 31)) * 31);
    }

    public ProtoPrerequisiteMsg(ProtoValue protoValue, ProtoParticipants protoParticipants, String str) {
        protoParticipants.getClass();
        str.getClass();
        this.expectedVariation = protoValue;
        this.participants = protoParticipants;
        this.featureKey = str;
    }

    public /* synthetic */ ProtoPrerequisiteMsg(ProtoValue protoValue, ProtoParticipants protoParticipants, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(protoValue, (i & 2) != 0 ? ProtoParticipants.PARTICIPANTS_UNSPECIFIED : protoParticipants, str);
    }
}
