package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class isEmojiCompatEnabled {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final List read;
    public final List serializer;
    public final int write;

    public final int hashCode() {
        List list = this.serializer;
        int iHashCode = list == null ? 0 : list.hashCode();
        List list2 = this.read;
        int iHashCode2 = list2 != null ? list2.hashCode() : 0;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.IconCompatParcelizer) * 1000003) ^ this.RemoteActionCompatParcelizer) * 1000003) ^ this.write;
    }

    public isEmojiCompatEnabled(List list, List list2, int i, int i2, int i3) {
        this.serializer = list;
        this.read = list2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.write = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isEmojiCompatEnabled)) {
            return false;
        }
        isEmojiCompatEnabled isemojicompatenabled = (isEmojiCompatEnabled) obj;
        List list = isemojicompatenabled.serializer;
        List list2 = this.serializer;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = isemojicompatenabled.read;
        List list4 = this.read;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        return this.IconCompatParcelizer == isemojicompatenabled.IconCompatParcelizer && this.RemoteActionCompatParcelizer == isemojicompatenabled.RemoteActionCompatParcelizer && this.write == isemojicompatenabled.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs{bestSizes=");
        sb.append(this.serializer);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.read);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", maxFpsForAllSizes=");
        return af$$ExternalSyntheticOutline0.m(this.write, "}", sb);
    }
}
