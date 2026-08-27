package o;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class UriUtils implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ createHorizontalAnimation RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ UriUtils(createHorizontalAnimation createhorizontalanimation, int i, List list, boolean z) {
        this.IconCompatParcelizer = 2;
        this.RemoteActionCompatParcelizer = createhorizontalanimation;
        this.write = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            createHorizontalAnimation createhorizontalanimation = this.RemoteActionCompatParcelizer;
            int i2 = this.write;
            createhorizontalanimation.pushObserver.getClass();
            try {
                createhorizontalanimation.writer.RemoteActionCompatParcelizer(i2, InAppMessageSlideupView.CANCEL);
                synchronized (createhorizontalanimation) {
                    createhorizontalanimation.currentPushRequests.remove(Integer.valueOf(i2));
                }
            } catch (IOException unused) {
            }
            return createFromParcel.INSTANCE;
        }
        if (i == 1) {
            createHorizontalAnimation createhorizontalanimation2 = this.RemoteActionCompatParcelizer;
            int i3 = this.write;
            createhorizontalanimation2.pushObserver.getClass();
            synchronized (createhorizontalanimation2) {
                createhorizontalanimation2.currentPushRequests.remove(Integer.valueOf(i3));
            }
            return createFromParcel.INSTANCE;
        }
        createHorizontalAnimation createhorizontalanimation3 = this.RemoteActionCompatParcelizer;
        int i4 = this.write;
        createhorizontalanimation3.pushObserver.getClass();
        try {
            createhorizontalanimation3.writer.RemoteActionCompatParcelizer(i4, InAppMessageSlideupView.CANCEL);
            synchronized (createhorizontalanimation3) {
                createhorizontalanimation3.currentPushRequests.remove(Integer.valueOf(i4));
            }
        } catch (IOException unused2) {
        }
        return createFromParcel.INSTANCE;
    }

    public /* synthetic */ UriUtils(createHorizontalAnimation createhorizontalanimation, int i, Object obj, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = createhorizontalanimation;
        this.write = i;
    }
}
