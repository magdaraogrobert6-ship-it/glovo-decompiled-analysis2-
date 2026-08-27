package androidx.compose.ui.node;

import androidx.compose.ui.text.android.LayoutIntrinsics_androidKt;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import java.io.File;
import java.util.Comparator;
import o.FillableDataCompanion;
import o.accesssetPerformMeasureConstraintsp;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.measureAndLayoutdefault;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LayoutNode$$ExternalSyntheticLambda1 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LayoutNode$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return LayoutNode.ZComparator$lambda$0((LayoutNode) obj, (LayoutNode) obj2);
            case 1:
                return removeNodeAtDepth.serializer(((FillableDataCompanion) obj).RemoteActionCompatParcelizer, ((FillableDataCompanion) obj2).RemoteActionCompatParcelizer);
            case 2:
                return LayoutIntrinsics_androidKt.IntRangeComparator$lambda$0((ensureSubscribedToInAppMessageEventslambda7) obj, (ensureSubscribedToInAppMessageEventslambda7) obj2);
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 5:
                return ((measureAndLayoutdefault) ((accesssetPerformMeasureConstraintsp) obj)).IconCompatParcelizer.compareTo(((measureAndLayoutdefault) ((accesssetPerformMeasureConstraintsp) obj2)).IconCompatParcelizer);
            case 6:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 7:
                String name = ((File) obj).getName();
                int i2 = o.ModifierNodeElement.IconCompatParcelizer;
                return name.substring(0, i2).compareTo(((File) obj2).getName().substring(0, i2));
            case 8:
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                CampaignProto$ThickContent campaignProto$ThickContent2 = (CampaignProto$ThickContent) obj2;
                if (campaignProto$ThickContent.getIsTestCampaign() && !campaignProto$ThickContent2.getIsTestCampaign()) {
                    return -1;
                }
                if (!campaignProto$ThickContent2.getIsTestCampaign() || campaignProto$ThickContent.getIsTestCampaign()) {
                    return Integer.compare(campaignProto$ThickContent.getPriority().getValue(), campaignProto$ThickContent2.getPriority().getValue());
                }
                return 1;
            default:
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj2;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 == r8lambdareqvhj3p9oule_afn8an0r0tlg1) {
                    return 0;
                }
                int iCompareTo = r8lambdareqvhj3p9oule_afn8an0r0tlg0.write().compareTo(r8lambdareqvhj3p9oule_afn8an0r0tlg1.write());
                return iCompareTo != 0 ? iCompareTo : r8lambdareqvhj3p9oule_afn8an0r0tlg0.RemoteActionCompatParcelizer().ParcelableVolumeInfo.toString().compareTo(r8lambdareqvhj3p9oule_afn8an0r0tlg1.RemoteActionCompatParcelizer().ParcelableVolumeInfo.toString());
        }
    }
}
