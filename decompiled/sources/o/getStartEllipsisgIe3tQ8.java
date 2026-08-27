package o;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getStartEllipsisgIe3tQ8 implements PinnableContainer {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ FeatureCombinationQueryImplExternalSyntheticLambda2 write;

    public /* synthetic */ getStartEllipsisgIe3tQ8(FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2, int i) {
        this.read = i;
        this.write = featureCombinationQueryImplExternalSyntheticLambda2;
    }

    @Override // o.PinnableContainer
    public final void onComplete(Task task) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2 = this.write;
        if (i4 != 0) {
            task.getClass();
            featureCombinationQueryImplExternalSyntheticLambda2.close();
            return;
        }
        task.getClass();
        featureCombinationQueryImplExternalSyntheticLambda2.close();
        int i5 = IconCompatParcelizer + 55;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
