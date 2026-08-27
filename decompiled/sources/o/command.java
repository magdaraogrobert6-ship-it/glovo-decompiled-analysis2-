package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.FileNotFoundException;
import java.util.List;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class command implements toSvgdefault {
    public final PathDefaultImpls read;
    public final getBlurRadiusannotations serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x009b  */
    /* JADX WARN: Code duplicated, block: B:13:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:16:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:20:0x011a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0145  */
    /* JADX WARN: Code duplicated, block: B:24:0x014d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0150  */
    /* JADX WARN: Code duplicated, block: B:27:0x0153  */
    /* JADX WARN: Code duplicated, block: B:29:0x015b  */
    /* JADX WARN: Code duplicated, block: B:30:0x015e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0161  */
    /* JADX WARN: Code duplicated, block: B:33:0x0174  */
    /* JADX WARN: Code duplicated, block: B:37:0x017e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0184  */
    /* JADX WARN: Code duplicated, block: B:43:0x01af  */
    @Override // o.toSvgdefault
    public final Object fetch(getBuffer getbuffer) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List list;
        int size;
        accessgetLayerBlockp accessgetlayerblockp;
        copyqcb84PMdefault copyqcb84pmdefault;
        ShadowCompanion shadowCompanion;
        Bundle bundle;
        int i;
        copyqcb84PMdefault copyqcb84pmdefault2;
        ShadowCompanion shadowCompanion2;
        PathDefaultImpls pathDefaultImpls = this.read;
        Uri uri = Uri.parse(pathDefaultImpls.write);
        getBlurRadiusannotations getblurradiusannotations = this.serializer;
        ContentResolver contentResolver = getblurradiusannotations.write.getContentResolver();
        String str = pathDefaultImpls.serializer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "com.android.contacts"}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaBrowserCompatMediaItem((List) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer())), "display_photo"}, getCieXyz.write())).booleanValue()) {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to find a contact photo associated with '", uri, "'.");
                    return null;
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "media"}, getCieXyz.write())).booleanValue()) {
                    list = (List) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer());
                    size = list.size();
                    if (size >= 3) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(size - 3), "audio"}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(size - 2), "albums"}, getCieXyz.write())).booleanValue()) {
                                accessgetlayerblockp = getblurradiusannotations.MediaSessionCompatQueueItem;
                                copyqcb84pmdefault = accessgetlayerblockp.IconCompatParcelizer;
                                if (copyqcb84pmdefault instanceof ShadowCompanion) {
                                    shadowCompanion = (ShadowCompanion) copyqcb84pmdefault;
                                } else {
                                    shadowCompanion = null;
                                }
                                if (shadowCompanion != null) {
                                    i = shadowCompanion.serializer;
                                    copyqcb84pmdefault2 = accessgetlayerblockp.read;
                                    if (copyqcb84pmdefault2 instanceof ShadowCompanion) {
                                        shadowCompanion2 = (ShadowCompanion) copyqcb84pmdefault2;
                                    } else {
                                        shadowCompanion2 = null;
                                    }
                                    if (shadowCompanion2 != null) {
                                        int i2 = shadowCompanion2.serializer;
                                        bundle = new Bundle(1);
                                        bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                                    } else {
                                        bundle = null;
                                    }
                                } else {
                                    bundle = null;
                                }
                                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to find a music thumbnail associated with '", uri, "'.");
                                    return null;
                                }
                            } else {
                                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                                    return null;
                                }
                            }
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                                return null;
                            }
                        }
                    } else {
                        assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                            return null;
                        }
                    }
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                        return null;
                    }
                }
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                    return null;
                }
            }
        } else if (Build.VERSION.SDK_INT >= 29) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "media"}, getCieXyz.write())).booleanValue()) {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                    return null;
                }
            } else {
                list = (List) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer());
                size = list.size();
                if (size >= 3) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(size - 3), "audio"}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(size - 2), "albums"}, getCieXyz.write())).booleanValue()) {
                            accessgetlayerblockp = getblurradiusannotations.MediaSessionCompatQueueItem;
                            copyqcb84pmdefault = accessgetlayerblockp.IconCompatParcelizer;
                            if (copyqcb84pmdefault instanceof ShadowCompanion) {
                                shadowCompanion = (ShadowCompanion) copyqcb84pmdefault;
                            } else {
                                shadowCompanion = null;
                            }
                            if (shadowCompanion != null) {
                                i = shadowCompanion.serializer;
                                copyqcb84pmdefault2 = accessgetlayerblockp.read;
                                if (copyqcb84pmdefault2 instanceof ShadowCompanion) {
                                    shadowCompanion2 = (ShadowCompanion) copyqcb84pmdefault2;
                                } else {
                                    shadowCompanion2 = null;
                                }
                                if (shadowCompanion2 != null) {
                                    int i3 = shadowCompanion2.serializer;
                                    bundle = new Bundle(1);
                                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i3));
                                } else {
                                    bundle = null;
                                }
                            } else {
                                bundle = null;
                            }
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to find a music thumbnail associated with '", uri, "'.");
                                return null;
                            }
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                                return null;
                            }
                        }
                    } else {
                        assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                            return null;
                        }
                    }
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                        return null;
                    }
                }
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to open '", uri, "'.");
                return null;
            }
        }
        return new PixelMap(new getIntersect(new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), getblurradiusannotations.IconCompatParcelizer, new nextdefault(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), getSegmentdefault.DISK);
    }

    public command(PathDefaultImpls pathDefaultImpls, getBlurRadiusannotations getblurradiusannotations) {
        this.read = pathDefaultImpls;
        this.serializer = getblurradiusannotations;
    }
}
