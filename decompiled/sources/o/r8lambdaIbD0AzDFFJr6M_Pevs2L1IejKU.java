package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer;

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035);
    }

    public r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU(r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk) {
        this.RemoteActionCompatParcelizer = r8lambdamlvle2kr5fvc3vtodzmadfjxk.write;
    }

    public final String toString() {
        return "LocationEvent{location=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU)) {
            return false;
        }
        Object obj2 = ((r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU) obj).RemoteActionCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.RemoteActionCompatParcelizer;
        return brazeCompanionExternalSyntheticLambda4 == obj2 || brazeCompanionExternalSyntheticLambda4.equals(obj2);
    }
}
