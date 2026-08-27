package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class requestLookaheadRemeasure extends MeasurePassDelegateplaceOuterCoordinatorBlock1 {
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final getChildrenOfVirtualChildren serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        long j = this.RemoteActionCompatParcelizer;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public requestLookaheadRemeasure(setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, String str, String str2, long j) {
        this.serializer = setuncaughtexceptionhandlerui;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeasurePassDelegateplaceOuterCoordinatorBlock1)) {
            return false;
        }
        requestLookaheadRemeasure requestlookaheadremeasure = (requestLookaheadRemeasure) ((MeasurePassDelegateplaceOuterCoordinatorBlock1) obj);
        return this.serializer.equals(requestlookaheadremeasure.serializer) && this.write.equals(requestlookaheadremeasure.write) && this.IconCompatParcelizer.equals(requestlookaheadremeasure.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == requestlookaheadremeasure.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.serializer);
        sb.append(", parameterKey=");
        sb.append(this.write);
        sb.append(", parameterValue=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", templateVersion=");
        return c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "}", sb);
    }
}
