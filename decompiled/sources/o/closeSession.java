package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.vendor.review.data.entity.Score$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getAllFeatureFlags;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class closeSession {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String label;
    public final String question;
    public final List tags;
    public final int value;
    public static final Score$Companion Companion = new Object() { // from class: com.roadrunner.vendor.review.data.entity.Score$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 121;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getAllFeatureFlags.IconCompatParcelizer;
            }
            getAllFeatureFlags getallfeatureflags = getAllFeatureFlags.IconCompatParcelizer;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new subscribeToFeatureFlagsUpdateslambda1(9))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.vendor.review.data.entity.Score$Companion] */
    static {
        int i = write + 13;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ closeSession(int i, int i2, String str, String str2, List list) {
        if (15 == (i & 15)) {
            this.value = i2;
            this.label = str;
            this.question = str2;
            this.tags = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getAllFeatureFlags.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(d$$ExternalSyntheticOutline0.m("Score(value=", this.value, ", label=", this.label, ", question="), this.question, ", tags=", this.tags, ")");
            int i3 = IconCompatParcelizer + 87;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return str;
        }
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(d$$ExternalSyntheticOutline0.m("Score(value=", this.value, ", label=", this.label, ", question="), this.question, ", tags=", this.tags, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.tags.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.value) * 31, 31, this.label), 31, this.question);
        int i4 = serializer + 27;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 107;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof closeSession)) {
            int i6 = i4 + 3;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        closeSession closesession = (closeSession) obj;
        if (this.value != closesession.value) {
            int i8 = i2 + 15;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = i2 + 25;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }
        Object[] objArr = {this.label, closesession.label};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.question, closesession.question};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i11 = IconCompatParcelizer + 89;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        Object[] objArr3 = {this.tags, closesession.tags};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i13 = IconCompatParcelizer + 45;
        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return false;
    }
}
