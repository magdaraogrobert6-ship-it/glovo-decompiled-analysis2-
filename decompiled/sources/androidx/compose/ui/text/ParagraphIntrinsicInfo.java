package androidx.compose.ui.text;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ParagraphIntrinsicInfo {
    public static final int $stable = 8;
    private final int endIndex;
    private final ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public final ParagraphIntrinsics component1() {
        return this.intrinsics;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final ParagraphIntrinsicInfo copy(ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        return new ParagraphIntrinsicInfo(paragraphIntrinsics, i, i2);
    }

    public int hashCode() {
        return Integer.hashCode(this.endIndex) + af$$ExternalSyntheticOutline0.m(this.startIndex, this.intrinsics.hashCode() * 31, 31);
    }

    public ParagraphIntrinsicInfo(ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        this.intrinsics = paragraphIntrinsics;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo, ParagraphIntrinsics paragraphIntrinsics, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i3 & 2) != 0) {
            i = paragraphIntrinsicInfo.startIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.intrinsics, paragraphIntrinsicInfo.intrinsics}, getCieXyz.write())).booleanValue() && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.intrinsics);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        return af$$ExternalSyntheticOutline0.m(sb, this.endIndex, ')');
    }
}
