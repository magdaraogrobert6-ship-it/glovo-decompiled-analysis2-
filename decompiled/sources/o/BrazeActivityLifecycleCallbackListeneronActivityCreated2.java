package o;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeActivityLifecycleCallbackListeneronActivityCreated2 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final BrazeCompanionExternalSyntheticLambda4 read;

    public final int hashCode() {
        return (this.read.hashCode() ^ 16777619) * (-2128831035);
    }

    public BrazeActivityLifecycleCallbackListeneronActivityCreated2(r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk) {
        this.read = r8lambdamlvle2kr5fvc3vtodzmadfjxk.write;
    }

    public final String toString() {
        return "UnconfirmedStationaryStateEvent{location=" + this.read + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BrazeActivityLifecycleCallbackListeneronActivityCreated2)) {
            return false;
        }
        Object obj2 = ((BrazeActivityLifecycleCallbackListeneronActivityCreated2) obj).read;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.read;
        return brazeCompanionExternalSyntheticLambda4 == obj2 || brazeCompanionExternalSyntheticLambda4.equals(obj2);
    }
}
