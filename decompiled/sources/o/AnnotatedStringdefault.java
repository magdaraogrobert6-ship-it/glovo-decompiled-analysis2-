package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.constructAnnotationsFromSpansAndParagraphs;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AnnotatedStringdefault {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final decapitalizelambda0 appliedFilters;
    public final List apps;
    public final filterRanges config;
    public final String generatedAt;
    public final int manifestSchemaVersion;
    public static final ManifestResponse$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 43;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            constructAnnotationsFromSpansAndParagraphs constructannotationsfromspansandparagraphs = constructAnnotationsFromSpansAndParagraphs.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 89;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return constructannotationsfromspansandparagraphs;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(27)), null, null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Companion] */
    static {
        int i = write + 27;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        List list = this.apps;
        int i5 = i3 + 51;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final filterRanges read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 41;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        filterRanges filterranges = this.config;
        int i4 = i2 + 103;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return filterranges;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.manifestSchemaVersion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AnnotatedStringdefault(int i, List list, filterRanges filterranges, String str, int i2, decapitalizelambda0 decapitalizelambda0Var) {
        if (15 == (i & 15)) {
            this.apps = list;
            this.config = filterranges;
            this.generatedAt = str;
            this.manifestSchemaVersion = i2;
            if ((i & 16) == 0) {
                this.appliedFilters = null;
                int i3 = IconCompatParcelizer + 9;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 91 / 0;
                    return;
                }
                return;
            }
            this.appliedFilters = decapitalizelambda0Var;
            int i5 = IconCompatParcelizer + 7;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, constructAnnotationsFromSpansAndParagraphs.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.apps.hashCode();
        int iM = af$$ExternalSyntheticOutline0.m(this.manifestSchemaVersion, af$$ExternalSyntheticOutline0.m((this.config.hashCode() + (iHashCode * 31)) * 31, 31, this.generatedAt), 31);
        decapitalizelambda0 decapitalizelambda0Var = this.appliedFilters;
        if (decapitalizelambda0Var == null) {
            int i3 = serializer;
            int i4 = i3 + 5;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 31;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode2 = decapitalizelambda0Var.hashCode();
            int i8 = serializer + 1;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = iHashCode2;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ManifestResponse(apps=" + this.apps + ", config=" + this.config + ", generatedAt=" + this.generatedAt + ", manifestSchemaVersion=" + this.manifestSchemaVersion + ", appliedFilters=" + this.appliedFilters + ")";
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedStringdefault)) {
            return false;
        }
        AnnotatedStringdefault annotatedStringdefault = (AnnotatedStringdefault) obj;
        Object[] objArr = {this.apps, annotatedStringdefault.apps};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.config, annotatedStringdefault.config};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.generatedAt, annotatedStringdefault.generatedAt};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() || this.manifestSchemaVersion != annotatedStringdefault.manifestSchemaVersion) {
                return false;
            }
            Object[] objArr4 = {this.appliedFilters, annotatedStringdefault.appliedFilters};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = IconCompatParcelizer + 79;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = IconCompatParcelizer + 55;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
