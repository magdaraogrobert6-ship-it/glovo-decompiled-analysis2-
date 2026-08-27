package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final BrazeCompanionExternalSyntheticLambda4 serializer;

    public final int hashCode() {
        return (this.serializer.hashCode() ^ 16777619) * (-2128831035);
    }

    public r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ(r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk) {
        this.serializer = r8lambdamlvle2kr5fvc3vtodzmadfjxk.write;
    }

    public final String toString() {
        return "QuantizedLocationEvent{location=" + this.serializer + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ)) {
            return false;
        }
        Object obj2 = ((r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ) obj).serializer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.serializer;
        return brazeCompanionExternalSyntheticLambda4 == obj2 || brazeCompanionExternalSyntheticLambda4.equals(obj2);
    }
}
