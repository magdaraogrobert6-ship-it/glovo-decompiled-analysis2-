package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class getPrimariesui_graphics extends RgbExternalSyntheticLambda6 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getPrimariesui_graphics(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.RgbExternalSyntheticLambda6
    public final void IconCompatParcelizer(Object obj) throws IOException {
        if (this.RemoteActionCompatParcelizer != 0) {
            ((AssetFileDescriptor) obj).close();
        } else {
            ((ParcelFileDescriptor) obj).close();
        }
    }

    @Override // o.RgbExternalSyntheticLambda6
    public final Object write(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int i = this.RemoteActionCompatParcelizer;
        boolean z = this.serializer;
        ContentResolver contentResolver2 = this.IconCompatParcelizer;
        if (i != 0) {
            AssetFileDescriptor assetFileDescriptorWrite = (z && computeVerticalBoundsdefault.IconCompatParcelizer(uri) && computeVerticalBoundsdefault.write()) ? computeVerticalBoundsdefault.write(uri, contentResolver2) : contentResolver2.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorWrite != null) {
                return assetFileDescriptorWrite;
            }
            throw new FileNotFoundException(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "FileDescriptor is null for: "));
        }
        AssetFileDescriptor assetFileDescriptorWrite2 = (z && computeVerticalBoundsdefault.IconCompatParcelizer(uri) && computeVerticalBoundsdefault.write()) ? computeVerticalBoundsdefault.write(uri, contentResolver2) : contentResolver2.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorWrite2 != null) {
            return assetFileDescriptorWrite2.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "FileDescriptor is null for: "));
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return this.RemoteActionCompatParcelizer != 0 ? AssetFileDescriptor.class : ParcelFileDescriptor.class;
    }
}
