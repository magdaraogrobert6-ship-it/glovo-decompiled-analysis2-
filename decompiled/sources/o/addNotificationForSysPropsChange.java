package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class addNotificationForSysPropsChange extends getIsShowingLayoutBounds {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final String write;

    @Override // o.getIsShowingLayoutBounds
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getIsShowingLayoutBounds
    public final long RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.getIsShowingLayoutBounds
    public final String read() {
        return this.write;
    }

    @Override // o.getIsShowingLayoutBounds
    public final String serializer() {
        return this.read;
    }

    @Override // o.getIsShowingLayoutBounds
    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        int iHashCode4 = this.read.hashCode();
        long j = this.serializer;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public addNotificationForSysPropsChange(String str, String str2, String str3, String str4, long j) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.serializer = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getIsShowingLayoutBounds)) {
            return false;
        }
        addNotificationForSysPropsChange addnotificationforsyspropschange = (addNotificationForSysPropsChange) ((getIsShowingLayoutBounds) obj);
        return this.write.equals(addnotificationforsyspropschange.write) && this.RemoteActionCompatParcelizer.equals(addnotificationforsyspropschange.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(addnotificationforsyspropschange.IconCompatParcelizer) && this.read.equals(addnotificationforsyspropschange.read) && this.serializer == addnotificationforsyspropschange.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.write);
        sb.append(", variantId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", parameterKey=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", parameterValue=");
        sb.append(this.read);
        sb.append(", templateVersion=");
        return c8$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }
}
