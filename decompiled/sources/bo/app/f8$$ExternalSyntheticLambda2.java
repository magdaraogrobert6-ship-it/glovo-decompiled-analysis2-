package bo.app;

import android.graphics.BitmapFactory;
import com.braze.BrazeUser;
import com.braze.enums.Month;
import com.braze.support.BrazeImageUtils;
import java.io.IOException;
import o.InAppMessageSlideupView;
import o.createFromParcel;
import o.createHorizontalAnimation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f8$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ f8$$ExternalSyntheticLambda2(int i, Month month, int i2) {
        this.$r8$classId = 1;
        this.f$1 = i;
        this.f$0 = month;
        this.f$2 = i2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        int i3 = this.f$1;
        Object obj = this.f$0;
        if (i == 0) {
            return f8.a((f8) obj, i3, i2);
        }
        if (i == 1) {
            return BrazeUser.setDateOfBirth$lambda$0(i3, (Month) obj, i2);
        }
        if (i == 2) {
            return BrazeImageUtils.calculateInSampleSize$lambda$1((BitmapFactory.Options) obj, i3, i2);
        }
        createHorizontalAnimation createhorizontalanimation = (createHorizontalAnimation) obj;
        try {
            createhorizontalanimation.writer.read(i3, i2, true);
        } catch (IOException e) {
            InAppMessageSlideupView inAppMessageSlideupView = InAppMessageSlideupView.PROTOCOL_ERROR;
            createhorizontalanimation.RemoteActionCompatParcelizer(inAppMessageSlideupView, inAppMessageSlideupView, e);
        }
        return createFromParcel.INSTANCE;
    }

    public /* synthetic */ f8$$ExternalSyntheticLambda2(int i, int i2, int i3, Object obj) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
