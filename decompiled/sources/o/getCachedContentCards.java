package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.vendor.review.data.entity.SubmitVendorReviewRequest$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getCachedContentCards {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String comment;
    public final int score;
    public final String scoreType;
    public final List tags;
    public static final SubmitVendorReviewRequest$Companion Companion = new SubmitVendorReviewRequest$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new subscribeToFeatureFlagsUpdateslambda1(10))};

    static {
        int i = IconCompatParcelizer + 119;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getCachedContentCards(int i, int i2, String str, String str2, List list) {
        Object obj = null;
        if (11 == (i & 11)) {
            this.scoreType = str;
            this.score = i2;
            if ((i & 4) == 0) {
                this.comment = null;
            } else {
                this.comment = str2;
                int i3 = RemoteActionCompatParcelizer + 41;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            }
            this.tags = list;
            int i5 = write + 91;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 11, getBanner.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(m1$$ExternalSyntheticOutline0.m("SubmitVendorReviewRequest(scoreType=", this.score, this.scoreType, ", score=", ", comment="), this.comment, ", tags=", this.tags, ")");
        }
        int i3 = 22 / 0;
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(m1$$ExternalSyntheticOutline0.m("SubmitVendorReviewRequest(scoreType=", this.score, this.scoreType, ", score=", ", comment="), this.comment, ", tags=", this.tags, ")");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1 r3
  0x0038: PHI (r1v12 int) = (r1v7 int), (r1v16 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r3v5 java.lang.String) = (r3v1 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v16 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 43;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.score, this.scoreType.hashCode() * 72, 52);
            str = this.comment;
            if (str == null) {
                i = 0;
            } else {
                int iHashCode = str.hashCode();
                int i4 = write + 95;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                i = iHashCode;
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.score, this.scoreType.hashCode() * 31, 31);
            str = this.comment;
            if (str == null) {
                i = 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i6 = write + 95;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i = iHashCode2;
            }
        }
        return this.tags.hashCode() + ((iM + i) * 31);
    }

    public getCachedContentCards(int i, String str, String str2, List list) {
        str.getClass();
        this.scoreType = str;
        this.score = i;
        this.comment = str2;
        this.tags = list;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getCachedContentCards) {
            getCachedContentCards getcachedcontentcards = (getCachedContentCards) obj;
            if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scoreType, getcachedcontentcards.scoreType}, getCieXyz.write())).booleanValue()) || this.score != getcachedcontentcards.score) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.comment, getcachedcontentcards.comment}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, getcachedcontentcards.tags}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 115;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i6 = write;
        int i7 = i6 + 81;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i6 + 57;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
