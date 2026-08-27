package o;

import android.content.SharedPreferences;
import com.foodora.courier.app.application.CourierApplication;
import java.io.IOException;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class createVerticalAnimation implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write = 2;

    public /* synthetic */ createVerticalAnimation(int i, String str, r8lambdazCd1z82txJou5vkO0oL_06hVCA r8lambdazcd1z82txjou5vko0ol_06hvca) {
        this.RemoteActionCompatParcelizer = i;
        this.read = str;
        this.IconCompatParcelizer = r8lambdazcd1z82txjou5vko0ol_06hvca;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            createHorizontalAnimation createhorizontalanimation = (createHorizontalAnimation) obj2;
            InAppMessageSlideupView inAppMessageSlideupView = (InAppMessageSlideupView) obj;
            try {
                inAppMessageSlideupView.getClass();
                createhorizontalanimation.writer.RemoteActionCompatParcelizer(i2, inAppMessageSlideupView);
            } catch (IOException e) {
                InAppMessageSlideupView inAppMessageSlideupView2 = InAppMessageSlideupView.PROTOCOL_ERROR;
                createhorizontalanimation.RemoteActionCompatParcelizer(inAppMessageSlideupView2, inAppMessageSlideupView2, e);
            }
            return createFromParcel.INSTANCE;
        }
        if (i == 1) {
            return (SharedPreferences) CourierApplication.read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1227617496, new Object[]{(CourierApplication) obj2, (String) obj, Integer.valueOf(i2)}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1227617496);
        }
        String str = (String) obj2;
        r8lambdazCd1z82txJou5vkO0oL_06hVCA r8lambdazcd1z82txjou5vko0ol_06hvca = (r8lambdazCd1z82txJou5vkO0oL_06hVCA) obj;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr = new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            r8lambda92m0p9sit5uf70mvjf4rwmrudaArr[i3] = RangesKt.read(str + '.' + r8lambdazcd1z82txjou5vko0ol_06hvca.PlaybackStateCompat[i3], r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.write, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0]);
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmrudaArr;
    }

    public /* synthetic */ createVerticalAnimation(CourierApplication courierApplication, String str, int i) {
        this.read = courierApplication;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ createVerticalAnimation(createHorizontalAnimation createhorizontalanimation, int i, InAppMessageSlideupView inAppMessageSlideupView) {
        this.read = createhorizontalanimation;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = inAppMessageSlideupView;
    }
}
