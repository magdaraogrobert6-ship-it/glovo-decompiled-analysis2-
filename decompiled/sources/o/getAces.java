package o;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class getAces extends ExtendedSrgblambda0 {
    public final getMirror3opZhB0 _init_lambda1;
    public DeltaDecoder _init_lambda2;
    public final android.graphics.Rect _init_lambda3;
    public final RectF _init_lambda4;
    public getD60 accessensureViewModelStore;
    public final android.graphics.Rect createFullyDrawnExecutor;
    public final copyzey9I6wdefault ensureViewModelStore;
    public final getPositions r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    /* JADX WARN: Code duplicated, block: B:115:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:65:0x015d A[Catch: IOException -> 0x0214, TRY_LEAVE, TryCatch #6 {IOException -> 0x0214, blocks: (B:63:0x0157, B:65:0x015d, B:84:0x0204, B:86:0x020a, B:87:0x020b, B:88:0x020c, B:89:0x0213, B:66:0x0170, B:68:0x017d, B:69:0x01ae), top: B:117:0x0157, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:66:0x0170, B:68:0x017d, B:69:0x01ae), top: B:110:0x0170, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:88:0x020c A[Catch: IOException -> 0x0214, TryCatch #6 {IOException -> 0x0214, blocks: (B:63:0x0157, B:65:0x015d, B:84:0x0204, B:86:0x020a, B:87:0x020b, B:88:0x020c, B:89:0x0213, B:66:0x0170, B:68:0x017d, B:69:0x01ae), top: B:117:0x0157, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x015d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x01bd, please report this as an issue */
    public final Bitmap MediaDescriptionCompat() throws Throwable {
        Bitmap bitmapWrite;
        Object objRemoteActionCompatParcelizer;
        Bitmap bitmapDecodeStream;
        String str = this.PlaybackStateCompat.MediaSessionCompatToken;
        accessgetMirrorcp accessgetmirrorcp = this.ParcelableVolumeInfo;
        getComponentCount getcomponentcount = accessgetmirrorcp.ParcelableVolumeInfo;
        if (getcomponentcount != null) {
            Context contextSerializer = accessgetmirrorcp.serializer();
            Context context = getcomponentcount.serializer;
            if (contextSerializer != null) {
                if (context instanceof Application) {
                    contextSerializer = contextSerializer.getApplicationContext();
                }
                if (contextSerializer != context) {
                    accessgetmirrorcp.ParcelableVolumeInfo = null;
                }
            } else if (context != null) {
                accessgetmirrorcp.ParcelableVolumeInfo = null;
            }
        }
        if (accessgetmirrorcp.ParcelableVolumeInfo == null) {
            accessgetmirrorcp.ParcelableVolumeInfo = new getComponentCount(accessgetmirrorcp.getCallback(), accessgetmirrorcp.MediaDescriptionCompat.IconCompatParcelizer());
        }
        getComponentCount getcomponentcount2 = accessgetmirrorcp.ParcelableVolumeInfo;
        if (getcomponentcount2 != null) {
            String str2 = getcomponentcount2.write;
            getMirror3opZhB0 getmirror3opzhb0 = (getMirror3opZhB0) getcomponentcount2.read.get(str);
            if (getmirror3opzhb0 == null) {
                bitmapWrite = null;
            } else {
                int i = getmirror3opzhb0.write;
                int i2 = getmirror3opzhb0.MediaSessionCompatQueueItem;
                bitmapWrite = getmirror3opzhb0.serializer;
                if (bitmapWrite == null) {
                    Context context2 = getcomponentcount2.serializer;
                    if (context2 == null) {
                        bitmapWrite = null;
                    } else {
                        String str3 = getmirror3opzhb0.RemoteActionCompatParcelizer;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        try {
                            if (((Boolean) String.class.getMethod("startsWith", String.class).invoke(str3, "data:")).booleanValue()) {
                                try {
                                    if (((Integer) String.class.getMethod("indexOf", String.class).invoke(str3, "base64,")).intValue() > 0) {
                                        try {
                                            try {
                                                byte[] bArrDecode = Base64.decode((String) String.class.getMethod("substring", Integer.TYPE).invoke(str3, Integer.valueOf(((Integer) String.class.getMethod("indexOf", Integer.TYPE).invoke(str3, 44)).intValue() + 1)), 0);
                                                try {
                                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                                    if (bitmapDecodeByteArray == null) {
                                                        getD50Xyzui_graphics.IconCompatParcelizer("Decoded image `" + str + "` is null.");
                                                        bitmapWrite = null;
                                                    } else {
                                                        bitmapWrite = newD50Xyzui_graphics.write(bitmapDecodeByteArray, i2, i);
                                                        synchronized (getComponentCount.IconCompatParcelizer) {
                                                            ((getMirror3opZhB0) getcomponentcount2.read.get(str)).serializer = bitmapWrite;
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e) {
                                                    getD50Xyzui_graphics.IconCompatParcelizer("Unable to decode image `" + str + "`.", e);
                                                }
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        try {
                                            if (!TextUtils.isEmpty(str2)) {
                                                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                            }
                                            try {
                                                Object[] objArr = {context2.getAssets(), str2 + str3};
                                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                                                if (objRemoteActionCompatParcelizer == null) {
                                                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getCapsMode("", 0, 0) + 26244), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, android.view.KeyEvent.getDeadChar(0, 0) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                                                }
                                                try {
                                                    bitmapDecodeStream = BitmapFactory.decodeStream((InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr), null, options);
                                                    if (bitmapDecodeStream == null) {
                                                        getD50Xyzui_graphics.IconCompatParcelizer("Decoded image `" + str + "` is null.");
                                                    } else {
                                                        bitmapWrite = newD50Xyzui_graphics.write(bitmapDecodeStream, i2, i);
                                                        synchronized (getComponentCount.IconCompatParcelizer) {
                                                            ((getMirror3opZhB0) getcomponentcount2.read.get(str)).serializer = bitmapWrite;
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    getD50Xyzui_graphics.IconCompatParcelizer("Unable to decode image `" + str + "`.", e2);
                                                }
                                            } catch (Throwable th3) {
                                                Throwable cause3 = th3.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th3;
                                            }
                                        } catch (IOException e3) {
                                            getD50Xyzui_graphics.IconCompatParcelizer("Unable to open asset.", e3);
                                        }
                                        bitmapWrite = null;
                                    }
                                } catch (IllegalArgumentException e4) {
                                    getD50Xyzui_graphics.IconCompatParcelizer("data URL did not have correct base64 format.", e4);
                                }
                            } else {
                                if (!TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                Object[] objArr2 = {context2.getAssets(), str2 + str3};
                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                                if (objRemoteActionCompatParcelizer == null) {
                                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getCapsMode("", 0, 0) + 26244), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, android.view.KeyEvent.getDeadChar(0, 0) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                                }
                                bitmapDecodeStream = BitmapFactory.decodeStream((InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2), null, options);
                                if (bitmapDecodeStream == null) {
                                    getD50Xyzui_graphics.IconCompatParcelizer("Decoded image `" + str + "` is null.");
                                } else {
                                    bitmapWrite = newD50Xyzui_graphics.write(bitmapDecodeStream, i2, i);
                                    synchronized (getComponentCount.IconCompatParcelizer) {
                                        ((getMirror3opZhB0) getcomponentcount2.read.get(str)).serializer = bitmapWrite;
                                    }
                                }
                                bitmapWrite = null;
                            }
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    }
                }
            }
        } else {
            bitmapWrite = null;
        }
        if (bitmapWrite != null) {
            return bitmapWrite;
        }
        getMirror3opZhB0 getmirror3opzhb1 = this._init_lambda1;
        if (getmirror3opzhb1 != null) {
            return getmirror3opzhb1.serializer;
        }
        return null;
    }

    @Override // o.ExtendedSrgblambda0, o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        Bitmap bitmapMediaDescriptionCompat;
        super.read(rectF, matrix, z);
        getMirror3opZhB0 getmirror3opzhb0 = this._init_lambda1;
        if (getmirror3opzhb0 != null) {
            int i = getmirror3opzhb0.write;
            int i2 = getmirror3opzhb0.MediaSessionCompatQueueItem;
            float fIconCompatParcelizer = newD50Xyzui_graphics.IconCompatParcelizer();
            if (this.ParcelableVolumeInfo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 || (bitmapMediaDescriptionCompat = MediaDescriptionCompat()) == null) {
                rectF.set(0.0f, 0.0f, i2 * fIconCompatParcelizer, i * fIconCompatParcelizer);
            } else {
                rectF.set(0.0f, 0.0f, bitmapMediaDescriptionCompat.getWidth() * fIconCompatParcelizer, bitmapMediaDescriptionCompat.getHeight() * fIconCompatParcelizer);
            }
            this.write.mapRect(rectF);
        }
    }

    @Override // o.ExtendedSrgblambda0
    public final void read(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) throws Throwable {
        getMirror3opZhB0 getmirror3opzhb0;
        Bitmap bitmapMediaDescriptionCompat = MediaDescriptionCompat();
        if (bitmapMediaDescriptionCompat == null || bitmapMediaDescriptionCompat.isRecycled() || (getmirror3opzhb0 = this._init_lambda1) == null) {
            return;
        }
        float fIconCompatParcelizer = newD50Xyzui_graphics.IconCompatParcelizer();
        copyzey9I6wdefault copyzey9i6wdefault = this.ensureViewModelStore;
        copyzey9i6wdefault.setAlpha(i);
        getPositions getpositions = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (getpositions != null) {
            geta = getpositions.write(matrix, i);
        }
        int width = bitmapMediaDescriptionCompat.getWidth();
        int height = bitmapMediaDescriptionCompat.getHeight();
        android.graphics.Rect rect = this.createFullyDrawnExecutor;
        rect.set(0, 0, width, height);
        boolean z = this.ParcelableVolumeInfo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        android.graphics.Rect rect2 = this._init_lambda3;
        if (z) {
            rect2.set(0, 0, (int) (getmirror3opzhb0.MediaSessionCompatQueueItem * fIconCompatParcelizer), (int) (getmirror3opzhb0.write * fIconCompatParcelizer));
        } else {
            rect2.set(0, 0, (int) (bitmapMediaDescriptionCompat.getWidth() * fIconCompatParcelizer), (int) (bitmapMediaDescriptionCompat.getHeight() * fIconCompatParcelizer));
        }
        boolean z2 = geta != null;
        if (z2) {
            if (this.accessensureViewModelStore == null) {
                this.accessensureViewModelStore = new getD60();
            }
            if (this._init_lambda2 == null) {
                this._init_lambda2 = new DeltaDecoder((byte) 0, 4);
            }
            DeltaDecoder deltaDecoder = this._init_lambda2;
            deltaDecoder.write = 255;
            deltaDecoder.serializer = null;
            geta.getClass();
            getA geta2 = new getA(geta);
            deltaDecoder.serializer = geta2;
            geta2.serializer(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this._init_lambda4;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.accessensureViewModelStore.read(canvas, rectF, this._init_lambda2);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapMediaDescriptionCompat, rect, rect2, copyzey9i6wdefault);
        if (z2) {
            this.accessensureViewModelStore.IconCompatParcelizer();
            if (this.accessensureViewModelStore.MediaDescriptionCompat == getD75.RENDER_NODE) {
                return;
            }
        }
        canvas.restore();
    }

    public getAces(accessgetMirrorcp accessgetmirrorcp, getAdobeRgb getadobergb) {
        super(accessgetmirrorcp, getadobergb);
        this.ensureViewModelStore = new copyzey9I6wdefault(3, 0);
        this.createFullyDrawnExecutor = new android.graphics.Rect();
        this._init_lambda3 = new android.graphics.Rect();
        this._init_lambda4 = new RectF();
        String str = getadobergb.MediaSessionCompatToken;
        StrokeJoinCompanion strokeJoinCompanion = accessgetmirrorcp.MediaDescriptionCompat;
        this._init_lambda1 = strokeJoinCompanion == null ? null : (getMirror3opZhB0) ((HashMap) strokeJoinCompanion.IconCompatParcelizer()).get(str);
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = this.PlaybackStateCompat.RemoteActionCompatParcelizer;
        if (dropShadowEffect != null) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new getPositions(this, this, dropShadowEffect);
        }
    }
}
