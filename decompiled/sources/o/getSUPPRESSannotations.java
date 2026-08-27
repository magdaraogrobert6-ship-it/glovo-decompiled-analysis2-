package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public class getSUPPRESSannotations extends MaterialButton {
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public long r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public View.OnClickListener r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;

    public final long getThrottleTimeInMillis() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = onClickListener;
    }

    public final void setThrottleTimeInMillis(long j) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSUPPRESSannotations(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 1000L;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        super.setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(0, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetDependenciesSetp.ThrottledButton);
        typedArrayObtainStyledAttributes.getClass();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes.getInteger(0, 1000);
        typedArrayObtainStyledAttributes.recycle();
    }
}
