package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getRulerLambda {
    public final double IconCompatParcelizer;
    public final AndroidComposeViewRootModifierNodeonKeyEvent1 RemoteActionCompatParcelizer;
    public final AndroidComposeViewRootModifierNodeonKeyEvent1 read;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return Double.hashCode(this.IconCompatParcelizer) + ((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    public getRulerLambda(AndroidComposeViewRootModifierNodeonKeyEvent1 androidComposeViewRootModifierNodeonKeyEvent1, AndroidComposeViewRootModifierNodeonKeyEvent1 androidComposeViewRootModifierNodeonKeyEvent2, double d) {
        androidComposeViewRootModifierNodeonKeyEvent1.getClass();
        androidComposeViewRootModifierNodeonKeyEvent2.getClass();
        this.read = androidComposeViewRootModifierNodeonKeyEvent1;
        this.RemoteActionCompatParcelizer = androidComposeViewRootModifierNodeonKeyEvent2;
        this.IconCompatParcelizer = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRulerLambda)) {
            return false;
        }
        getRulerLambda getrulerlambda = (getRulerLambda) obj;
        return this.read == getrulerlambda.read && this.RemoteActionCompatParcelizer == getrulerlambda.RemoteActionCompatParcelizer && Double.compare(this.IconCompatParcelizer, getrulerlambda.IconCompatParcelizer) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.read);
        sb.append(", crashlytics=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", sessionSamplingRate=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ')');
    }
}
