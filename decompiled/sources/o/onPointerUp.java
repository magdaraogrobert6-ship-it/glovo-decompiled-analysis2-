package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.inappnotifications.data.AnimationComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.recordAnimationInfoIfBouncedHiddenView;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "animation")
public final class onPointerUp implements setLayoutManager, setRecyclerListener {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String contentScale;
    public final List highlights;
    public final String source;
    public final Float weight;
    public static final AnimationComponent$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.AnimationComponent$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 39;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview = recordAnimationInfoIfBouncedHiddenView.serializer;
                obj.hashCode();
                throw null;
            }
            recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview2 = recordAnimationInfoIfBouncedHiddenView.serializer;
            int i3 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return recordanimationinfoifbouncedhiddenview2;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(21)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.AnimationComponent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 43;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ onPointerUp(int i, String str, List list, String str2, Float f) {
        if (3 == (i & 3)) {
            this.source = str;
            this.highlights = list;
            if ((i & 4) == 0) {
                this.contentScale = null;
                int i2 = IconCompatParcelizer + 25;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.contentScale = str2;
            }
            if ((i & 8) == 0) {
                this.weight = null;
                int i5 = write + 35;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 66 / 0;
                    return;
                }
                return;
            }
            this.weight = f;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, recordAnimationInfoIfBouncedHiddenView.serializer.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049 A[PHI: r1 r4
  0x0049: PHI (r1v13 int) = (r1v7 int), (r1v17 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r4v7 java.lang.String) = (r4v1 java.lang.String), (r4v9 java.lang.String) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1
  0x0037: PHI (r1v8 int) = (r1v7 int), (r1v17 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = c8$$ExternalSyntheticOutline0.m(this.highlights, this.source.hashCode() % 101, 65);
            str = this.contentScale;
            if (str == null) {
                int i3 = write + 55;
                int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 47;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = c8$$ExternalSyntheticOutline0.m(this.highlights, this.source.hashCode() * 31, 31);
            str = this.contentScale;
            if (str == null) {
                int i8 = write + 55;
                int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 47;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        Float f = this.weight;
        return ((iM + iHashCode) * 31) + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("AnimationComponent(source=", this.source, ", highlights=", this.highlights, ", contentScale=");
        sbSerializer.append(this.contentScale);
        sbSerializer.append(", weight=");
        sbSerializer.append(this.weight);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = write + 27;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 39;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof onPointerUp)) {
            return false;
        }
        onPointerUp onpointerup = (onPointerUp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.source, onpointerup.source}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.highlights, onpointerup.highlights}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contentScale, onpointerup.contentScale}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.weight, onpointerup.weight}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = write + 21;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        int i4 = write;
        int i5 = i4 + 125;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 13;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
