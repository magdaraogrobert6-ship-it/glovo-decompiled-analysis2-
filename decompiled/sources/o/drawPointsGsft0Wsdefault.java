package o;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class drawPointsGsft0Wsdefault implements drawOvalnJ9OG0default {
    public static final drawPointsGsft0Wsdefault IconCompatParcelizer = new drawPointsGsft0Wsdefault(0);
    public final /* synthetic */ int read;

    public /* synthetic */ drawPointsGsft0Wsdefault(int i) {
        this.read = i;
    }

    @Override // o.drawOvalnJ9OG0default
    public final generateOetf RemoteActionCompatParcelizer(generateOetf generateoetf, getEotfFuncui_graphics geteotffuncui_graphics) {
        ImageResources_androidKt imageResources_androidKt;
        byte[] bArrArray;
        if (this.read == 0) {
            return generateoetf;
        }
        ByteBuffer byteBufferSerializer = ((com.bumptech.glide.load.resource.gif.GifFrameLoader) ((drawImage9jGpkUEdefault) generateoetf.IconCompatParcelizer()).RatingCompat.write).serializer();
        AtomicReference atomicReference = DrawScopeMarker.read;
        if (byteBufferSerializer.isReadOnly() || !byteBufferSerializer.hasArray()) {
            imageResources_androidKt = null;
        } else {
            imageResources_androidKt = new ImageResources_androidKt(byteBufferSerializer.arrayOffset(), byteBufferSerializer.limit(), 4, byteBufferSerializer.array());
        }
        if (imageResources_androidKt != null && imageResources_androidKt.RemoteActionCompatParcelizer == 0 && imageResources_androidKt.serializer == ((byte[]) imageResources_androidKt.read).length) {
            bArrArray = byteBufferSerializer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferSerializer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
            byteBufferAsReadOnlyBuffer.get(bArr);
            bArrArray = bArr;
        }
        return new drawArcyD3GUKodefault(bArrArray);
    }
}
