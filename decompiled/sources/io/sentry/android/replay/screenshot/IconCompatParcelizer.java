package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Paint;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final IconCompatParcelizer read;
    public static final IconCompatParcelizer serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconCompatParcelizer(int i, int i2) {
        super(i);
        this.RemoteActionCompatParcelizer = i2;
    }

    static {
        int i = 0;
        serializer = new IconCompatParcelizer(i, i);
        read = new IconCompatParcelizer(i, 1);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        if (this.RemoteActionCompatParcelizer == 0) {
            return new Paint();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }
}
