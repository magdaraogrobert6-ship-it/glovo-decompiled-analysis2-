package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.quests.data.QuestResponse$Companion;
import com.roadrunner.rider.state.quests.data.QuestStatus;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getMeasurementConsentParameters;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getClickParameters {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String earning;
    public final String iconUrl;
    public final String name;
    public final getEventSuffix progress;
    public final String questDetailUrl;
    public final String questId;
    public final String questState;
    public final buildAttributionPackage rewardTag;
    public final QuestStatus status;
    public final String timeFrame;
    public static final QuestResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.quests.data.QuestResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 25;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getMeasurementConsentParameters getmeasurementconsentparameters = getMeasurementConsentParameters.read;
            int i4 = RemoteActionCompatParcelizer + 55;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return getmeasurementconsentparameters;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(19)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.quests.data.QuestResponse$Companion] */
    static {
        int i = read + 63;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
    }

    public /* synthetic */ getClickParameters(int i, String str, String str2, String str3, String str4, String str5, String str6, QuestStatus questStatus, buildAttributionPackage buildattributionpackage, String str7, getEventSuffix geteventsuffix) {
        if (79 == (i & 79)) {
            this.questId = str;
            this.questDetailUrl = str2;
            this.name = str3;
            this.iconUrl = str4;
            if ((i & 16) == 0) {
                this.timeFrame = null;
            } else {
                this.timeFrame = str5;
            }
            if ((i & 32) == 0) {
                this.questState = null;
            } else {
                this.questState = str6;
                int i2 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 3 / 2;
                } else {
                    int i4 = 2 % 2;
                }
            }
            this.status = questStatus;
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
                this.rewardTag = buildattributionpackage;
            } else {
                int i5 = RemoteActionCompatParcelizer + 53;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    this.rewardTag = null;
                    int i6 = 54 / 0;
                } else {
                    this.rewardTag = null;
                }
            }
            if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
                this.earning = null;
            } else {
                this.earning = str7;
                int i7 = 2 % 2;
            }
            if ((i & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
                this.progress = geteventsuffix;
                return;
            }
            int i8 = RemoteActionCompatParcelizer + 79;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                this.progress = null;
                return;
            } else {
                this.progress = null;
                throw null;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 79, getMeasurementConsentParameters.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("QuestResponse(questId=", this.questId, ", questDetailUrl=", this.questDetailUrl, ", name=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.name, ", iconUrl=", this.iconUrl, ", timeFrame=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.timeFrame, ", questState=", this.questState, ", status=");
        sbM.append(this.status);
        sbM.append(", rewardTag=");
        sbM.append(this.rewardTag);
        sbM.append(", earning=");
        sbM.append(this.earning);
        sbM.append(", progress=");
        sbM.append(this.progress);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.questId.hashCode() * 31, 31, this.questDetailUrl), 31, this.name), 31, this.iconUrl);
        String str = this.timeFrame;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = IconCompatParcelizer + 27;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.questState;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iHashCode5 = this.status.hashCode();
        buildAttributionPackage buildattributionpackage = this.rewardTag;
        int iHashCode6 = buildattributionpackage == null ? 0 : buildattributionpackage.hashCode();
        String str3 = this.earning;
        if (str3 == null) {
            int i6 = RemoteActionCompatParcelizer;
            int i7 = i6 + 83;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 37;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        getEventSuffix geteventsuffix = this.progress;
        if (geteventsuffix != null) {
            iHashCode4 = geteventsuffix.hashCode();
            int i11 = IconCompatParcelizer + 55;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return ((((((iHashCode5 + ((((iM + iHashCode) * 31) + iHashCode2) * 31)) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getClickParameters)) {
            return false;
        }
        getClickParameters getclickparameters = (getClickParameters) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.questId, getclickparameters.questId}, getCieXyz.write())).booleanValue()) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.questDetailUrl, getclickparameters.questDetailUrl}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, getclickparameters.name}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iconUrl, getclickparameters.iconUrl}, getCieXyz.write())).booleanValue())) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timeFrame, getclickparameters.timeFrame}, getCieXyz.write())).booleanValue()) {
                        int i4 = IconCompatParcelizer + 49;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.questState, getclickparameters.questState}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (this.status != getclickparameters.status) {
                        int i6 = IconCompatParcelizer + 35;
                        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rewardTag, getclickparameters.rewardTag}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.earning, getclickparameters.earning}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.progress, getclickparameters.progress}, getCieXyz.write())).booleanValue();
                }
            }
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
