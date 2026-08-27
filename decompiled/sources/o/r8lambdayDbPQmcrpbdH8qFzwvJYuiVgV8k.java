package o;

import android.text.TextUtils;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k implements getDistanceimpl, r8lambdakdT06ZZBT3HezLLCifuU7PvlmY {
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(String str) {
        this.serializer = 3;
        this.RemoteActionCompatParcelizer = str.concat(BundleUtil.UNDERLINE_TAG);
    }

    @Override // o.getDistanceimpl
    public Object write() {
        return this;
    }

    @Override // o.r8lambdakdT06ZZBT3HezLLCifuU7PvlmY
    public String apiName() {
        return this.RemoteActionCompatParcelizer.toLowerCase(java.util.Locale.ROOT);
    }

    @Override // o.getDistanceimpl
    public boolean RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2, unaryMinusF1C5BW0 unaryminusf1c5bw0) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.RemoteActionCompatParcelizer)) {
            return true;
        }
        unaryminusf1c5bw0.RemoteActionCompatParcelizer = (unaryminusf1c5bw0.RemoteActionCompatParcelizer & 3) | 4;
        return false;
    }

    public String IconCompatParcelizer() {
        int i = this.serializer;
        if (i != 14) {
            return i != 15 ? this.RemoteActionCompatParcelizer : this.RemoteActionCompatParcelizer;
        }
        return this.RemoteActionCompatParcelizer;
    }

    public String RemoteActionCompatParcelizer(Object obj) {
        String string = obj.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return this.RemoteActionCompatParcelizer + obj;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid key: ", string));
        return null;
    }

    public setCustomEndpoint RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer != null ? 1 : 0;
        if (i == 1) {
            return new setCustomEndpoint(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public /* synthetic */ r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(String str, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    public /* synthetic */ r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(int i) {
        this.serializer = i;
    }

    public removeFromCustomAttributeArraylambda1 serializer() {
        if (this.RemoteActionCompatParcelizer != null) {
            return new removeFromCustomAttributeArraylambda1(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'ssid' is missing");
        return null;
    }
}
