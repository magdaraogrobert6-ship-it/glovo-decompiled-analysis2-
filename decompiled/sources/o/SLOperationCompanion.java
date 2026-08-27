package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.huawei.location.nlp.scan.FB;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SLOperationCompanion {
    public static final FB read = new FB(13);

    public static ArrayList IconCompatParcelizer(placeApparentToRealOffsetaW9wMui placeapparenttorealoffsetaw9wmui, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < placeapparenttorealoffsetaw9wmui.getChildCount(); i++) {
            View childAt = placeapparenttorealoffsetaw9wmui.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
