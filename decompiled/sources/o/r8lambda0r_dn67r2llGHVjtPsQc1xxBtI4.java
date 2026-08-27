package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda0r_dn67r2llGHVjtPsQc1xxBtI4 {
    public String[] IconCompatParcelizer;
    public String[] RemoteActionCompatParcelizer;
    public boolean serializer;
    public final boolean write = true;

    public final InAppMessageFullView read() {
        return new InAppMessageFullView(this.write, this.serializer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    public final void IconCompatParcelizer(_get_messageWebView_lambda2... _get_messagewebview_lambda2Arr) {
        boolean z = this.write;
        if (z) {
            ArrayList arrayList = new ArrayList(_get_messagewebview_lambda2Arr.length);
            for (_get_messageWebView_lambda2 _get_messagewebview_lambda2 : _get_messagewebview_lambda2Arr) {
                arrayList.add(_get_messagewebview_lambda2.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (z) {
                if (strArr2.length != 0) {
                    this.IconCompatParcelizer = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("At least one TLS version is required");
                    return;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("no TLS versions for cleartext connections");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("no TLS versions for cleartext connections");
    }

    public final void serializer(getAppropriateImageUrllambda0... getappropriateimageurllambda0Arr) {
        boolean z = this.write;
        if (z) {
            ArrayList arrayList = new ArrayList(getappropriateimageurllambda0Arr.length);
            for (getAppropriateImageUrllambda0 getappropriateimageurllambda0 : getappropriateimageurllambda0Arr) {
                arrayList.add(getappropriateimageurllambda0.javaName);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (z) {
                if (strArr2.length != 0) {
                    this.RemoteActionCompatParcelizer = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("At least one cipher suite is required");
                    return;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("no cipher suites for cleartext connections");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("no cipher suites for cleartext connections");
    }
}
