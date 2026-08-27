package o;

import java.util.List;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setSdkFlavor {
    public static final setSdkMetadata Companion = new setSdkMetadata();
    public static final setGraphicModalMaxWidthDp[] d = {null, new setWasCloseMessageCalled(setPushHtmlRenderingEnabled.RemoteActionCompatParcelizer, 0), null};
    public final setSdkAuthEnabledandroid_sdk_base_release a;
    public final List b;
    public final setIsAutomaticLocationCollectionEnabled c;

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSdkFlavor)) {
            return false;
        }
        setSdkFlavor setsdkflavor = (setSdkFlavor) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, setsdkflavor.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, setsdkflavor.b}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolygonLocation(outer=");
        sb.append(this.a);
        sb.append(", holes=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.b, ')');
    }

    public setSdkFlavor(int i, setSdkAuthEnabledandroid_sdk_base_release setsdkauthenabledandroid_sdk_base_release, List list, setIsAutomaticLocationCollectionEnabled setisautomaticlocationcollectionenabled) {
        if (7 == (i & 7)) {
            this.a = setsdkauthenabledandroid_sdk_base_release;
            this.b = list;
            this.c = setisautomaticlocationcollectionenabled;
            setIsAutomaticLocationCollectionEnabled.Companion.getClass();
            this.c = setIsInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer(setsdkauthenabledandroid_sdk_base_release);
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, setServerTarget.write);
        throw null;
    }

    public setSdkFlavor(setSdkAuthEnabledandroid_sdk_base_release setsdkauthenabledandroid_sdk_base_release) {
        this.a = setsdkauthenabledandroid_sdk_base_release;
        this.b = instance_delegatelambda0.write;
        setIsAutomaticLocationCollectionEnabled.Companion.getClass();
        this.c = setIsInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer(setsdkauthenabledandroid_sdk_base_release);
    }
}
