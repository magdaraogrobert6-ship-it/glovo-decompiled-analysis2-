package o;

import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MatrixKt implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String serializer;

    public /* synthetic */ MatrixKt(String str, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = str;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = write + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        String str = this.serializer;
        if (i4 != 0) {
            TextView textView = (TextView) obj;
            textView.getClass();
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new BulletSpan(16, i5), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            return createfromparcel;
        }
        tintxETnrds tintxetnrds = (tintxETnrds) obj;
        tintxetnrds.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
        try {
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(1, str);
            uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(2, i5);
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
            uncheckedColordefaultRemoteActionCompatParcelizer.close();
            int i6 = write + 65;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        } catch (Throwable th) {
            uncheckedColordefaultRemoteActionCompatParcelizer.close();
            throw th;
        }
    }
}
