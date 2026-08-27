package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PathSegment implements toSvg {
    public final /* synthetic */ int read;

    public /* synthetic */ PathSegment(int i) {
        this.read = i;
    }

    @Override // o.toSvg
    public final toSvgdefault RemoteActionCompatParcelizer(Object obj, getBlurRadiusannotations getblurradiusannotations, coil3.RealImageLoader realImageLoader) {
        int i = 0;
        int i2 = 2;
        int i3 = 1;
        switch (this.read) {
            case 0:
                return new PathSegmentType((Bitmap) obj);
            case 1:
                PathDefaultImpls pathDefaultImpls = (PathDefaultImpls) obj;
                Bitmap.Config[] configArr = accessgetBevelcp.write;
                Object[] objArr = {pathDefaultImpls.IconCompatParcelizer, "file"};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return null;
                }
                int iSerializer = accessunpack.serializer();
                int iSerializer2 = accessunpack.serializer();
                Object[] objArr2 = {onContentCardDismissed.MediaMetadataCompat((List) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), iSerializer, 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), iSerializer2)), "android_asset"};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return new getCloseSegment(pathDefaultImpls, getblurradiusannotations, i3);
                }
                return null;
            case 2:
                return new addSvg((byte[]) obj, getblurradiusannotations, i3);
            case 3:
                return new addSvg((ByteBuffer) obj, getblurradiusannotations, i2);
            case 4:
                PathDefaultImpls pathDefaultImpls2 = (PathDefaultImpls) obj;
                Object[] objArr3 = {pathDefaultImpls2.IconCompatParcelizer, RemoteMessageConst.Notification.CONTENT};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return new command(pathDefaultImpls2, getblurradiusannotations);
                }
                return null;
            case 5:
                PathDefaultImpls pathDefaultImpls3 = (PathDefaultImpls) obj;
                Object[] objArr4 = {pathDefaultImpls3.IconCompatParcelizer, RemoteMessageConst.DATA};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                    return new getCloseSegment(pathDefaultImpls3, getblurradiusannotations, i);
                }
                return null;
            case 6:
                return new addSvg((Drawable) obj, getblurradiusannotations, i);
            case 7:
                PathDefaultImpls pathDefaultImpls4 = (PathDefaultImpls) obj;
                String str = pathDefaultImpls4.IconCompatParcelizer;
                if ((str != null && !str.equals("file")) || pathDefaultImpls4.read == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = accessgetBevelcp.write;
                Object[] objArr5 = {pathDefaultImpls4.IconCompatParcelizer, "file"};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                    int iSerializer3 = accessunpack.serializer();
                    int iSerializer4 = accessunpack.serializer();
                    Object[] objArr6 = {onContentCardDismissed.MediaMetadataCompat((List) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), iSerializer3, 1023072373, -1023072371, new Object[]{pathDefaultImpls4}, accessunpack.serializer(), iSerializer4)), "android_asset"};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                        return null;
                    }
                }
                return new getCloseSegment(pathDefaultImpls4, getblurradiusannotations, i2);
            case 8:
                PathDefaultImpls pathDefaultImpls5 = (PathDefaultImpls) obj;
                Object[] objArr7 = {pathDefaultImpls5.IconCompatParcelizer, "jar:file"};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
                    return new getCloseSegment(pathDefaultImpls5, getblurradiusannotations, 3);
                }
                return null;
            default:
                PathDefaultImpls pathDefaultImpls6 = (PathDefaultImpls) obj;
                Object[] objArr8 = {pathDefaultImpls6.IconCompatParcelizer, "android.resource"};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
                    return new PathSvgKtWhenMappings(pathDefaultImpls6, getblurradiusannotations);
                }
                return null;
        }
    }
}
