package o;

import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class RootMeasurePolicymeasure1 extends FocusTargetNodeinvalidateFocus1 {
    public final /* synthetic */ RootMeasurePolicy PlaybackStateCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicymeasure1(RootMeasurePolicy rootMeasurePolicy, RootMeasurePolicy rootMeasurePolicy2) {
        super(rootMeasurePolicy2);
        this.PlaybackStateCompat = rootMeasurePolicy;
    }

    @Override // o.FocusTargetNodeinvalidateFocus1
    public final void IconCompatParcelizer(ArrayList arrayList) {
        RulerScope rulerScope;
        arrayList.add(0);
        android.graphics.Rect rect = RootMeasurePolicy.MediaDescriptionCompat;
        RootMeasurePolicy rootMeasurePolicy = this.PlaybackStateCompat;
        if (!rootMeasurePolicy.RemoteActionCompatParcelizer() || (rulerScope = rootMeasurePolicy.RatingCompat) == null || !rulerScope.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 || rootMeasurePolicy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // o.FocusTargetNodeinvalidateFocus1
    public final void read(int i, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(RootMeasurePolicy.MediaDescriptionCompat);
            return;
        }
        RootMeasurePolicy rootMeasurePolicy = this.PlaybackStateCompat;
        CharSequence closeIconContentDescription = rootMeasurePolicy.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = rootMeasurePolicy.getText();
            accessibilityNodeInfo.setContentDescription(rootMeasurePolicy.getContext().getString(com.logistics.rider.glovo.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(rootMeasurePolicy.getCloseIconTouchBoundsInt());
        focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.serializer);
        accessibilityNodeInfo.setEnabled(rootMeasurePolicy.isEnabled());
    }
}
