package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFDataQueries extends setEvaluationsfwf_client_release {
    public final byte[] IconCompatParcelizer;
    public final byte[] MediaBrowserCompatMediaItem;
    public final byte[] MediaSessionCompatQueueItem;
    public final byte[] RatingCompat;
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] serializer;
    public final byte[] write;

    public FwFDataQueries(getStructure getstructure, byte[] bArr, ChatService chatService) {
        int i;
        int i2;
        char c;
        super((Object) getstructure, true);
        int i3 = getstructure.IconCompatParcelizer;
        new getFinancial(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        new getFinancial(androidx.compose.ui.graphics.Fields.RotationX);
        int i4 = 96;
        if (i3 != 2) {
            i2 = 5;
            if (i3 == 3) {
                i = 6;
                i4 = 128;
            } else {
                if (i3 != 5) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i3, "The mode ", "is not supported by Crystals Dilithium!"));
                    throw null;
                }
                i = 8;
                i2 = 7;
            }
            c = 0;
        } else {
            i = 4;
            i2 = 4;
            c = 0;
        }
        new getFinancial(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        new getFinancial(androidx.compose.ui.graphics.Fields.RotationX);
        if (c != 0 && c != 0) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Wrong Dilithium Gamma1!");
            throw null;
        }
        this.write = accessbootstrapIfNeeded.serializer(bArr, 0, 32);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.serializer(bArr, 32, 64);
        this.RatingCompat = accessbootstrapIfNeeded.serializer(bArr, 64, androidx.compose.ui.graphics.Fields.SpotShadowColor);
        int i5 = (i2 * i4) + androidx.compose.ui.graphics.Fields.SpotShadowColor;
        this.serializer = accessbootstrapIfNeeded.serializer(bArr, androidx.compose.ui.graphics.Fields.SpotShadowColor, i5);
        int i6 = (i4 * i) + i5;
        this.IconCompatParcelizer = accessbootstrapIfNeeded.serializer(bArr, i5, i6);
        this.MediaBrowserCompatMediaItem = accessbootstrapIfNeeded.serializer(bArr, i6, (i * 416) + i6);
        if (chatService != null) {
            this.MediaSessionCompatQueueItem = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(chatService.write);
        } else {
            this.MediaSessionCompatQueueItem = null;
        }
    }

    public final byte[] IconCompatParcelizer() {
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(new byte[][]{this.write, this.RemoteActionCompatParcelizer, this.RatingCompat, this.serializer, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem});
    }

    public final ChatService write() {
        return new ChatService((getStructure) this.ResultReceiver, this.write, this.MediaSessionCompatQueueItem);
    }

    public FwFDataQueries(getStructure getstructure, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super((Object) getstructure, true);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.RatingCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr5);
        this.MediaBrowserCompatMediaItem = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr6);
        this.MediaSessionCompatQueueItem = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr7);
    }
}
