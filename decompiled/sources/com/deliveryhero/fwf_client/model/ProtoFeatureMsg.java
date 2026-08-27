package com.deliveryhero.fwf_client.model;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_cache.MemoryCache;
import com.deliveryhero.fwf_evaluator.model.Holdout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.MediaSessionCompatQueueItem;
import o.ShortNewsContentCardView;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.onCloseClicked;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoFeatureMsg {
    private static final setGraphicModalMaxWidthDp[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final int changeVersionControl;
    private final ProtoRuleMsg defaultRule;
    private final boolean enabled;
    private final boolean evalUserId;
    private final List<String> holdoutKeys;
    private final ProtoValue holdoutVariation;
    private final ProtoValue holdoutVariationName;
    private final boolean identifiersValidationsEnabled;
    private final String key;
    private final String kind;
    private final ProtoValue offVariation;
    private final ProtoValue offVariationName;
    private final List<ProtoPrerequisiteMsg> prerequisiteFeatures;
    private final List<ProtoRuleMsg> rules;
    private final int runningExperimentId;
    private final String salt;
    private final List<ProtoTestTargetMsg> segments;
    private final List<ProtoTestTargetMsg> targets;
    private final List<String> trackingOutcomes;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.model.ProtoFeatureMsg$getAsFeature$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProtoFeatureMsg.this.getAsFeature(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.model.ProtoFeatureMsg$getHoldouts$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01081 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01081(ShortNewsContentCardView<? super C01081> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProtoFeatureMsg.this.getHoldouts(null, this);
        }
    }

    public final String component1() {
        return this.key;
    }

    public final List<ProtoTestTargetMsg> component10() {
        return this.segments;
    }

    public final List<ProtoTestTargetMsg> component11() {
        return this.targets;
    }

    public final List<ProtoPrerequisiteMsg> component12() {
        return this.prerequisiteFeatures;
    }

    public final int component13() {
        return this.changeVersionControl;
    }

    public final boolean component14() {
        return this.identifiersValidationsEnabled;
    }

    public final List<String> component15() {
        return this.holdoutKeys;
    }

    public final ProtoValue component16() {
        return this.holdoutVariation;
    }

    public final ProtoValue component17() {
        return this.holdoutVariationName;
    }

    public final int component18() {
        return this.runningExperimentId;
    }

    public final List<String> component19() {
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

    public final ProtoRuleMsg component6() {
        return this.defaultRule;
    }

    public final ProtoValue component7() {
        return this.offVariation;
    }

    public final ProtoValue component8() {
        return this.offVariationName;
    }

    public final List<ProtoRuleMsg> component9() {
        return this.rules;
    }

    public final int getChangeVersionControl() {
        return this.changeVersionControl;
    }

    public final ProtoRuleMsg getDefaultRule() {
        return this.defaultRule;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getEvalUserId() {
        return this.evalUserId;
    }

    public final List<String> getHoldoutKeys() {
        return this.holdoutKeys;
    }

    public final ProtoValue getHoldoutVariation() {
        return this.holdoutVariation;
    }

    public final ProtoValue getHoldoutVariationName() {
        return this.holdoutVariationName;
    }

    public final boolean getIdentifiersValidationsEnabled() {
        return this.identifiersValidationsEnabled;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getKind() {
        return this.kind;
    }

    public final ProtoValue getOffVariation() {
        return this.offVariation;
    }

    public final ProtoValue getOffVariationName() {
        return this.offVariationName;
    }

    public final List<ProtoPrerequisiteMsg> getPrerequisiteFeatures() {
        return this.prerequisiteFeatures;
    }

    public final List<ProtoRuleMsg> getRules() {
        return this.rules;
    }

    public final int getRunningExperimentId() {
        return this.runningExperimentId;
    }

    public final String getSalt() {
        return this.salt;
    }

    public final List<ProtoTestTargetMsg> getSegments() {
        return this.segments;
    }

    public final List<ProtoTestTargetMsg> getTargets() {
        return this.targets;
    }

    public final List<String> getTrackingOutcomes() {
        return this.trackingOutcomes;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.kind), 31, this.enabled), 31, this.evalUserId), 31, this.salt);
        int iHashCode = this.defaultRule.hashCode();
        ProtoValue protoValue = this.offVariation;
        int iHashCode2 = protoValue == null ? 0 : protoValue.hashCode();
        ProtoValue protoValue2 = this.offVariationName;
        int iHashCode3 = protoValue2 == null ? 0 : protoValue2.hashCode();
        List<ProtoRuleMsg> list = this.rules;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<ProtoTestTargetMsg> list2 = this.segments;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List<ProtoTestTargetMsg> list3 = this.targets;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        List<ProtoPrerequisiteMsg> list4 = this.prerequisiteFeatures;
        int iM2 = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.changeVersionControl, (((((((((((((iHashCode + iM) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list4 == null ? 0 : list4.hashCode())) * 31, 31), 31, this.identifiersValidationsEnabled);
        List<String> list5 = this.holdoutKeys;
        int iHashCode7 = list5 == null ? 0 : list5.hashCode();
        ProtoValue protoValue3 = this.holdoutVariation;
        int iHashCode8 = protoValue3 == null ? 0 : protoValue3.hashCode();
        ProtoValue protoValue4 = this.holdoutVariationName;
        int iM3 = af$$ExternalSyntheticOutline0.m(this.runningExperimentId, (((((iM2 + iHashCode7) * 31) + iHashCode8) * 31) + (protoValue4 == null ? 0 : protoValue4.hashCode())) * 31, 31);
        List<String> list6 = this.trackingOutcomes;
        return iM3 + (list6 != null ? list6.hashCode() : 0);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.kind;
        boolean z = this.enabled;
        boolean z2 = this.evalUserId;
        String str3 = this.salt;
        ProtoRuleMsg protoRuleMsg = this.defaultRule;
        ProtoValue protoValue = this.offVariation;
        ProtoValue protoValue2 = this.offVariationName;
        List<ProtoRuleMsg> list = this.rules;
        List<ProtoTestTargetMsg> list2 = this.segments;
        List<ProtoTestTargetMsg> list3 = this.targets;
        List<ProtoPrerequisiteMsg> list4 = this.prerequisiteFeatures;
        int i = this.changeVersionControl;
        boolean z3 = this.identifiersValidationsEnabled;
        List<String> list5 = this.holdoutKeys;
        ProtoValue protoValue3 = this.holdoutVariation;
        ProtoValue protoValue4 = this.holdoutVariationName;
        int i2 = this.runningExperimentId;
        List<String> list6 = this.trackingOutcomes;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ProtoFeatureMsg(key=", str, ", kind=", str2, ", enabled=");
        af$$ExternalSyntheticOutline0.m(sbM, z, ", evalUserId=", z2, ", salt=");
        sbM.append(str3);
        sbM.append(", defaultRule=");
        sbM.append(protoRuleMsg);
        sbM.append(", offVariation=");
        sbM.append(protoValue);
        sbM.append(", offVariationName=");
        sbM.append(protoValue2);
        sbM.append(", rules=");
        sbM.append(list);
        sbM.append(", segments=");
        sbM.append(list2);
        sbM.append(", targets=");
        sbM.append(list3);
        sbM.append(", prerequisiteFeatures=");
        sbM.append(list4);
        sbM.append(", changeVersionControl=");
        sbM.append(i);
        sbM.append(", identifiersValidationsEnabled=");
        sbM.append(z3);
        sbM.append(", holdoutKeys=");
        sbM.append(list5);
        sbM.append(", holdoutVariation=");
        sbM.append(protoValue3);
        sbM.append(", holdoutVariationName=");
        sbM.append(protoValue4);
        sbM.append(", runningExperimentId=");
        sbM.append(i2);
        sbM.append(", trackingOutcomes=");
        return MediaSessionCompatQueueItem.read(sbM, list6, ")");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoFeatureMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(ProtoRuleMsg$$serializer.INSTANCE, 0);
        ProtoTestTargetMsg$$serializer protoTestTargetMsg$$serializer = ProtoTestTargetMsg$$serializer.INSTANCE;
        setWasCloseMessageCalled setwasclosemessagecalled2 = new setWasCloseMessageCalled(protoTestTargetMsg$$serializer, 0);
        setWasCloseMessageCalled setwasclosemessagecalled3 = new setWasCloseMessageCalled(protoTestTargetMsg$$serializer, 0);
        setWasCloseMessageCalled setwasclosemessagecalled4 = new setWasCloseMessageCalled(ProtoPrerequisiteMsg$$serializer.INSTANCE, 0);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        $childSerializers = new setGraphicModalMaxWidthDp[]{null, null, null, null, null, null, null, null, setwasclosemessagecalled, setwasclosemessagecalled2, setwasclosemessagecalled3, setwasclosemessagecalled4, null, null, new setWasCloseMessageCalled(beforeinappmessageviewclosed, 0), null, null, null, new setWasCloseMessageCalled(beforeinappmessageviewclosed, 0)};
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoFeatureMsg protoFeatureMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, protoFeatureMsg.key);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, protoFeatureMsg.kind);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.enabled) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, protoFeatureMsg.enabled);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.evalUserId) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, protoFeatureMsg.evalUserId);
        }
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, protoFeatureMsg.salt);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, ProtoRuleMsg$$serializer.INSTANCE, protoFeatureMsg.defaultRule);
        ProtoValue$$serializer protoValue$$serializer = ProtoValue$$serializer.INSTANCE;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, protoValue$$serializer, protoFeatureMsg.offVariation);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.offVariationName != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, protoValue$$serializer, protoFeatureMsg.offVariationName);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.rules != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, setgraphicmodalmaxwidthdpArr[8], protoFeatureMsg.rules);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.segments != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, setgraphicmodalmaxwidthdpArr[9], protoFeatureMsg.segments);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.targets != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, setgraphicmodalmaxwidthdpArr[10], protoFeatureMsg.targets);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.prerequisiteFeatures != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, setgraphicmodalmaxwidthdpArr[11], protoFeatureMsg.prerequisiteFeatures);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.changeVersionControl != 0) {
            defaultInAppMessageSlideupViewFactory.write(12, protoFeatureMsg.changeVersionControl, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.identifiersValidationsEnabled) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, protoFeatureMsg.identifiersValidationsEnabled);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.holdoutKeys != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, setgraphicmodalmaxwidthdpArr[14], protoFeatureMsg.holdoutKeys);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.holdoutVariation != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, protoValue$$serializer, protoFeatureMsg.holdoutVariation);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.holdoutVariationName != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16, protoValue$$serializer, protoFeatureMsg.holdoutVariationName);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureMsg.runningExperimentId != 0) {
            defaultInAppMessageSlideupViewFactory.write(17, protoFeatureMsg.runningExperimentId, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 18, setgraphicmodalmaxwidthdpArr[18], protoFeatureMsg.trackingOutcomes);
    }

    public final ProtoFeatureMsg copy(String str, String str2, boolean z, boolean z2, String str3, ProtoRuleMsg protoRuleMsg, ProtoValue protoValue, ProtoValue protoValue2, List<ProtoRuleMsg> list, List<ProtoTestTargetMsg> list2, List<ProtoTestTargetMsg> list3, List<ProtoPrerequisiteMsg> list4, int i, boolean z3, List<String> list5, ProtoValue protoValue3, ProtoValue protoValue4, int i2, List<String> list6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        protoRuleMsg.getClass();
        return new ProtoFeatureMsg(str, str2, z, z2, str3, protoRuleMsg, protoValue, protoValue2, list, list2, list3, list4, i, z3, list5, protoValue3, protoValue4, i2, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoFeatureMsg)) {
            return false;
        }
        ProtoFeatureMsg protoFeatureMsg = (ProtoFeatureMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, protoFeatureMsg.key}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.kind, protoFeatureMsg.kind}, getCieXyz.write())).booleanValue() || this.enabled != protoFeatureMsg.enabled || this.evalUserId != protoFeatureMsg.evalUserId) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.salt, protoFeatureMsg.salt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.defaultRule, protoFeatureMsg.defaultRule}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.offVariation, protoFeatureMsg.offVariation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.offVariationName, protoFeatureMsg.offVariationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rules, protoFeatureMsg.rules}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.segments, protoFeatureMsg.segments}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.targets, protoFeatureMsg.targets}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.prerequisiteFeatures, protoFeatureMsg.prerequisiteFeatures}, getCieXyz.write())).booleanValue() || this.changeVersionControl != protoFeatureMsg.changeVersionControl || this.identifiersValidationsEnabled != protoFeatureMsg.identifiersValidationsEnabled) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutKeys, protoFeatureMsg.holdoutKeys}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariation, protoFeatureMsg.holdoutVariation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdoutVariationName, protoFeatureMsg.holdoutVariationName}, getCieXyz.write())).booleanValue() || this.runningExperimentId != protoFeatureMsg.runningExperimentId) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingOutcomes, protoFeatureMsg.trackingOutcomes}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x018e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01c9 -> B:54:0x01d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getAsFeature(com.deliveryhero.fwf_cache.MemoryCache r38, o.ShortNewsContentCardView<? super com.deliveryhero.fwf_evaluator.model.Feature> r39) throws java.util.concurrent.CancellationException, com.deliveryhero.fwf_client.model.ProtoDataError {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.fwf_client.model.ProtoFeatureMsg.getAsFeature(com.deliveryhero.fwf_cache.MemoryCache, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getHoldouts(MemoryCache memoryCache, ShortNewsContentCardView<? super List<Holdout>> shortNewsContentCardView) {
        C01081 c01081;
        List list;
        if (shortNewsContentCardView instanceof C01081) {
            c01081 = (C01081) shortNewsContentCardView;
            int i = c01081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01081.label = i - Integer.MIN_VALUE;
            } else {
                c01081 = new C01081(shortNewsContentCardView);
            }
        } else {
            c01081 = new C01081(shortNewsContentCardView);
        }
        Object obj = c01081.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01081.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ArrayList arrayList = new ArrayList();
            List<String> list2 = this.holdoutKeys;
            if (list2 == null || list2.isEmpty()) {
                return arrayList;
            }
            Set<String> setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this.holdoutKeys);
            c01081.L$0 = arrayList;
            c01081.label = 1;
            Object holdouts = memoryCache.getHoldouts(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, c01081);
            if (holdouts == obj2) {
                return obj2;
            }
            obj = holdouts;
            list = arrayList;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) c01081.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Iterator it = ((Map) obj).entrySet().iterator();
        while (it.hasNext()) {
            list.add(((ProtoHoldoutMsg) ((Map.Entry) it.next()).getValue()).getAsHoldout());
        }
        return list;
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoFeatureMsg(int i, String str, String str2, boolean z, boolean z2, String str3, ProtoRuleMsg protoRuleMsg, ProtoValue protoValue, ProtoValue protoValue2, List list, List list2, List list3, List list4, int i2, boolean z3, List list5, ProtoValue protoValue3, ProtoValue protoValue4, int i3, List list6, onCloseClicked oncloseclicked) {
        if (262259 == (i & 262259)) {
            this.key = str;
            this.kind = str2;
            if ((i & 4) == 0) {
                this.enabled = false;
            } else {
                this.enabled = z;
            }
            if ((i & 8) == 0) {
                this.evalUserId = false;
            } else {
                this.evalUserId = z2;
            }
            this.salt = str3;
            this.defaultRule = protoRuleMsg;
            this.offVariation = protoValue;
            if ((i & Fields.SpotShadowColor) == 0) {
                this.offVariationName = null;
            } else {
                this.offVariationName = protoValue2;
            }
            if ((i & Fields.RotationX) == 0) {
                this.rules = null;
            } else {
                this.rules = list;
            }
            if ((i & Fields.RotationY) == 0) {
                this.segments = null;
            } else {
                this.segments = list2;
            }
            if ((i & Fields.RotationZ) == 0) {
                this.targets = null;
            } else {
                this.targets = list3;
            }
            if ((i & Fields.CameraDistance) == 0) {
                this.prerequisiteFeatures = null;
            } else {
                this.prerequisiteFeatures = list4;
            }
            if ((i & Fields.TransformOrigin) == 0) {
                this.changeVersionControl = 0;
            } else {
                this.changeVersionControl = i2;
            }
            if ((i & 8192) == 0) {
                this.identifiersValidationsEnabled = false;
            } else {
                this.identifiersValidationsEnabled = z3;
            }
            if ((i & Fields.Clip) == 0) {
                this.holdoutKeys = null;
            } else {
                this.holdoutKeys = list5;
            }
            if ((32768 & i) == 0) {
                this.holdoutVariation = null;
            } else {
                this.holdoutVariation = protoValue3;
            }
            if ((65536 & i) == 0) {
                this.holdoutVariationName = null;
            } else {
                this.holdoutVariationName = protoValue4;
            }
            if ((i & Fields.RenderEffect) == 0) {
                this.runningExperimentId = 0;
            } else {
                this.runningExperimentId = i3;
            }
            this.trackingOutcomes = list6;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 262259, ProtoFeatureMsg$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public ProtoFeatureMsg(String str, String str2, boolean z, boolean z2, String str3, ProtoRuleMsg protoRuleMsg, ProtoValue protoValue, ProtoValue protoValue2, List<ProtoRuleMsg> list, List<ProtoTestTargetMsg> list2, List<ProtoTestTargetMsg> list3, List<ProtoPrerequisiteMsg> list4, int i, boolean z3, List<String> list5, ProtoValue protoValue3, ProtoValue protoValue4, int i2, List<String> list6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        protoRuleMsg.getClass();
        this.key = str;
        this.kind = str2;
        this.enabled = z;
        this.evalUserId = z2;
        this.salt = str3;
        this.defaultRule = protoRuleMsg;
        this.offVariation = protoValue;
        this.offVariationName = protoValue2;
        this.rules = list;
        this.segments = list2;
        this.targets = list3;
        this.prerequisiteFeatures = list4;
        this.changeVersionControl = i;
        this.identifiersValidationsEnabled = z3;
        this.holdoutKeys = list5;
        this.holdoutVariation = protoValue3;
        this.holdoutVariationName = protoValue4;
        this.runningExperimentId = i2;
        this.trackingOutcomes = list6;
    }

    public /* synthetic */ ProtoFeatureMsg(String str, String str2, boolean z, boolean z2, String str3, ProtoRuleMsg protoRuleMsg, ProtoValue protoValue, ProtoValue protoValue2, List list, List list2, List list3, List list4, int i, boolean z3, List list5, ProtoValue protoValue3, ProtoValue protoValue4, int i2, List list6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, str3, protoRuleMsg, protoValue, (i3 & Fields.SpotShadowColor) != 0 ? null : protoValue2, (i3 & Fields.RotationX) != 0 ? null : list, (i3 & Fields.RotationY) != 0 ? null : list2, (i3 & Fields.RotationZ) != 0 ? null : list3, (i3 & Fields.CameraDistance) != 0 ? null : list4, (i3 & Fields.TransformOrigin) != 0 ? 0 : i, (i3 & 8192) != 0 ? false : z3, (i3 & Fields.Clip) != 0 ? null : list5, (32768 & i3) != 0 ? null : protoValue3, (65536 & i3) != 0 ? null : protoValue4, (i3 & Fields.RenderEffect) != 0 ? 0 : i2, list6);
    }
}
