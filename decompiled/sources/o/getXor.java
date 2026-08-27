package o;

import android.app.Notification;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes.dex */
public abstract class getXor {
    public static void IconCompatParcelizer(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void RemoteActionCompatParcelizer(Resources.Theme theme) {
        theme.rebase();
    }

    public static void read(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void serializer(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static String write(Context context) {
        return context.getOpPackageName();
    }

    public static final ImageDecoder.Source serializer(getReverseDifferenceb3I0S0c getreversedifferenceb3i0s0c, getBlurRadiusannotations getblurradiusannotations) {
        RecyclableBufferedInputStream recyclableBufferedInputStreamRemoteActionCompatParcelizer;
        if (getreversedifferenceb3i0s0c.read() == HttpUrlFetcher.serializer && (recyclableBufferedInputStreamRemoteActionCompatParcelizer = getreversedifferenceb3i0s0c.RemoteActionCompatParcelizer()) != null) {
            return ImageDecoder.createSource(recyclableBufferedInputStreamRemoteActionCompatParcelizer.serializer());
        }
        getIntersectb3I0S0c getintersectb3i0s0cWrite = getreversedifferenceb3i0s0c.write();
        if (getintersectb3i0s0cWrite instanceof accessgetEmptyPathp) {
            return ImageDecoder.createSource(getblurradiusannotations.write.getAssets(), ((accessgetEmptyPathp) getintersectb3i0s0cWrite).serializer);
        }
        if ((getintersectb3i0s0cWrite instanceof nextdefault) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((nextdefault) getintersectb3i0s0cWrite).IconCompatParcelizer;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new HostnameCache$$ExternalSyntheticLambda1(1, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (getintersectb3i0s0cWrite instanceof PathOperationKt) {
            PathOperationKt pathOperationKt = (PathOperationKt) getintersectb3i0s0cWrite;
            if (pathOperationKt.write.equals(getblurradiusannotations.write.getPackageName())) {
                return ImageDecoder.createSource(getblurradiusannotations.write.getResources(), pathOperationKt.IconCompatParcelizer);
            }
        }
        if (getintersectb3i0s0cWrite instanceof PathMeasureDefaultImpls) {
            return ImageDecoder.createSource(((PathMeasureDefaultImpls) getintersectb3i0s0cWrite).IconCompatParcelizer);
        }
        return null;
    }
}
