package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class insetdefault implements Cloneable {
    public boolean ComponentActivity;
    public int MediaSessionCompatResultReceiverWrapper;
    public boolean PlaybackStateCompat;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public accessisWideGamut MediaSessionCompatToken = accessisWideGamut.IconCompatParcelizer;
    public RenderIntentCompanion r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = RenderIntentCompanion.NORMAL;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = -1;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
    public eotfFunclambda0 r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = DrawTransform.write;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
    public getEotfFuncui_graphics r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new getEotfFuncui_graphics();
    public DrawStyle r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new DrawStyle(0);
    public Class r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Object.class;
    public boolean ResultReceiver = true;

    public static boolean RemoteActionCompatParcelizer(int i, int i2) {
        return (i & i2) != 0;
    }

    public final insetdefault IconCompatParcelizer() {
        if (this.PlaybackStateCompat) {
            return clone().IconCompatParcelizer();
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = com.logistics.rider.glovo.R.drawable.image_placeholder;
        this.MediaSessionCompatResultReceiverWrapper = (this.MediaSessionCompatResultReceiverWrapper | androidx.compose.ui.graphics.Fields.SpotShadowColor) & (-65);
        write();
        return this;
    }

    public final insetdefault IconCompatParcelizer(accessisWideGamut accessiswidegamut) {
        if (this.PlaybackStateCompat) {
            return clone().IconCompatParcelizer(accessiswidegamut);
        }
        this.MediaSessionCompatToken = accessiswidegamut;
        this.MediaSessionCompatResultReceiverWrapper |= 4;
        write();
        return this;
    }

    public final insetdefault IconCompatParcelizer(getEotf geteotf) {
        if (this.PlaybackStateCompat) {
            return clone().IconCompatParcelizer(geteotf);
        }
        com.bumptech.glide.load.resource.bitmap.DrawableTransformation drawableTransformation = new com.bumptech.glide.load.resource.bitmap.DrawableTransformation(geteotf);
        read(Bitmap.class, geteotf);
        read(Drawable.class, drawableTransformation);
        read(BitmapDrawable.class, drawableTransformation);
        read(drawImage9jGpkUEdefault.class, new com.bumptech.glide.load.resource.gif.GifDrawableTransformation(geteotf));
        write();
        return this;
    }

    public final insetdefault MediaMetadataCompat() {
        if (this.PlaybackStateCompat) {
            return clone().MediaMetadataCompat();
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this.MediaSessionCompatResultReceiverWrapper |= 1048576;
        write();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public insetdefault clone() {
        try {
            insetdefault insetdefaultVar = (insetdefault) super.clone();
            getEotfFuncui_graphics geteotffuncui_graphics = new getEotfFuncui_graphics();
            insetdefaultVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = geteotffuncui_graphics;
            geteotffuncui_graphics.write.RemoteActionCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write);
            DrawStyle drawStyle = new DrawStyle(0);
            insetdefaultVar.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = drawStyle;
            drawStyle.putAll(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            insetdefaultVar.ComponentActivity = false;
            insetdefaultVar.PlaybackStateCompat = false;
            return insetdefaultVar;
        } catch (CloneNotSupportedException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    public final insetdefault RemoteActionCompatParcelizer(RenderIntentCompanion renderIntentCompanion) {
        if (this.PlaybackStateCompat) {
            return clone().RemoteActionCompatParcelizer(renderIntentCompanion);
        }
        UrlUtils.serializer(renderIntentCompanion, "Argument must not be null");
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = renderIntentCompanion;
        this.MediaSessionCompatResultReceiverWrapper |= 8;
        write();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof insetdefault) {
            return RemoteActionCompatParcelizer((insetdefault) obj);
        }
        return false;
    }

    public int hashCode() {
        return Fill.write(Fill.write(Fill.write(Fill.write(Fill.write(Fill.write(Fill.write(Fill.serializer(0, Fill.serializer(0, Fill.serializer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY ? 1 : 0, Fill.serializer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys ? 1 : 0, Fill.serializer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, Fill.serializer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, Fill.serializer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus ? 1 : 0, Fill.write(Fill.serializer(0, Fill.write(Fill.serializer(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, Fill.write(Fill.serializer(0, Fill.serializer(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.MediaSessionCompatToken), this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8), this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg), this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw), this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs), this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ), null);
    }

    public final insetdefault serializer() {
        if (this.PlaybackStateCompat) {
            return clone().serializer();
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        this.MediaSessionCompatResultReceiverWrapper |= androidx.compose.ui.graphics.Fields.RotationX;
        write();
        return this;
    }

    public final insetdefault serializer(int i, int i2) {
        if (this.PlaybackStateCompat) {
            return clone().serializer(i, i2);
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i2;
        this.MediaSessionCompatResultReceiverWrapper |= androidx.compose.ui.graphics.Fields.RotationY;
        write();
        return this;
    }

    public final insetdefault serializer(Class cls) {
        if (this.PlaybackStateCompat) {
            return clone().serializer(cls);
        }
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = cls;
        this.MediaSessionCompatResultReceiverWrapper |= androidx.compose.ui.graphics.Fields.TransformOrigin;
        write();
        return this;
    }

    public final insetdefault serializer(accessgetMinp accessgetminp, Object obj) {
        if (this.PlaybackStateCompat) {
            return clone().serializer(accessgetminp, obj);
        }
        UrlUtils.read(accessgetminp);
        UrlUtils.read(obj);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write.put(accessgetminp, obj);
        write();
        return this;
    }

    public insetdefault write(insetdefault insetdefaultVar) {
        if (this.PlaybackStateCompat) {
            return clone().write(insetdefaultVar);
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 1048576)) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = insetdefaultVar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 4)) {
            this.MediaSessionCompatToken = insetdefaultVar.MediaSessionCompatToken;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 8)) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = insetdefaultVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 16)) {
            this.MediaSessionCompatResultReceiverWrapper &= -33;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 32)) {
            this.MediaSessionCompatResultReceiverWrapper &= -17;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 64)) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
            this.MediaSessionCompatResultReceiverWrapper &= -129;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.SpotShadowColor)) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = insetdefaultVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            this.MediaSessionCompatResultReceiverWrapper &= -65;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.RotationX)) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = insetdefaultVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.RotationY)) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = insetdefaultVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = insetdefaultVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.RotationZ)) {
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = insetdefaultVar.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.TransformOrigin)) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = insetdefaultVar.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 8192)) {
            this.MediaSessionCompatResultReceiverWrapper &= -16385;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.Clip)) {
            this.MediaSessionCompatResultReceiverWrapper &= -8193;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, 65536)) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = insetdefaultVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.RenderEffect)) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = insetdefaultVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        }
        if (RemoteActionCompatParcelizer(insetdefaultVar.MediaSessionCompatResultReceiverWrapper, androidx.compose.ui.graphics.Fields.CameraDistance)) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.putAll(insetdefaultVar.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            this.ResultReceiver = insetdefaultVar.ResultReceiver;
        }
        if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.clear();
            int i = this.MediaSessionCompatResultReceiverWrapper;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
            this.MediaSessionCompatResultReceiverWrapper = i & (-133121);
            this.ResultReceiver = true;
        }
        this.MediaSessionCompatResultReceiverWrapper |= insetdefaultVar.MediaSessionCompatResultReceiverWrapper;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write.RemoteActionCompatParcelizer(insetdefaultVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write);
        write();
        return this;
    }

    public final insetdefault write(translatedefault translatedefaultVar) {
        if (this.PlaybackStateCompat) {
            return clone().write(translatedefaultVar);
        }
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = translatedefaultVar;
        this.MediaSessionCompatResultReceiverWrapper |= androidx.compose.ui.graphics.Fields.RotationZ;
        write();
        return this;
    }

    public final boolean RemoteActionCompatParcelizer(insetdefault insetdefaultVar) {
        insetdefaultVar.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == insetdefaultVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == insetdefaultVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == insetdefaultVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss && this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == insetdefaultVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == insetdefaultVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == insetdefaultVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && this.MediaSessionCompatToken.equals(insetdefaultVar.MediaSessionCompatToken) && this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == insetdefaultVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 && this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.equals(insetdefaultVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) && this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.equals(insetdefaultVar.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) && this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.equals(insetdefaultVar.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) && Fill.IconCompatParcelizer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, insetdefaultVar.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
    }

    public final void write() {
        if (this.ComponentActivity) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You cannot modify locked T, consider clone()");
        }
    }

    public final insetdefault read(Class cls, getEotf geteotf) {
        if (this.PlaybackStateCompat) {
            return clone().read(cls, geteotf);
        }
        UrlUtils.read(geteotf);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.put(cls, geteotf);
        int i = this.MediaSessionCompatResultReceiverWrapper;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        this.ResultReceiver = false;
        this.MediaSessionCompatResultReceiverWrapper = i | 198656;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
        write();
        return this;
    }
}
