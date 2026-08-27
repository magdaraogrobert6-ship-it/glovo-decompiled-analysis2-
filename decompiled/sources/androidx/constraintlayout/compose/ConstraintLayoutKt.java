package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import com.google.firebase.Timestamp;
import java.util.List;
import o.accesstoSizeXkaWNTQjd;
import o.drawBehind;
import o.setAlignment;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintLayoutKt {
    public static final void buildMapping(drawBehind drawbehind, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null) {
                measurable.getParentData();
                layoutId = new Timestamp.Companion(0);
            }
            accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = drawbehind.write(layoutId.toString());
            if (accesstosizexkawntqjdWrite != null) {
                accesstosizexkawntqjdWrite.getActivityResultRegistry = measurable;
                setAlignment setalignment = accesstosizexkawntqjdWrite.ParcelableVolumeInfo;
                if (setalignment != null) {
                    setalignment._init_lambda3 = measurable;
                }
            }
            measurable.getParentData();
        }
    }
}
