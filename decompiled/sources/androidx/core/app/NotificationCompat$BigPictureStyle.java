package androidx.core.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import o.accessgetLeftcp;
import o.getEnterdhqQ8s;
import o.getLeftdhqQ8s;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$BigPictureStyle extends NotificationCompat$Style {
    public IconCompat IconCompatParcelizer;
    public boolean read;
    public IconCompat serializer;
    public boolean write;

    @Override // androidx.core.app.NotificationCompat$Style
    public final void apply(accessgetLeftcp accessgetleftcp) {
        Bitmap bitmap;
        NotificationCompatBuilder notificationCompatBuilder = (NotificationCompatBuilder) accessgetleftcp;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(notificationCompatBuilder.serializer).setBigContentTitle(this.MediaSessionCompatToken);
        IconCompat iconCompat = this.IconCompatParcelizer;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                getLeftdhqQ8s.read(bigContentTitle, iconCompat.read(accessgetleftcp instanceof NotificationCompatBuilder ? notificationCompatBuilder.write : null));
            } else {
                int type = iconCompat.PlaybackStateCompatCustomAction;
                if (type == -1) {
                    type = ((Icon) iconCompat.IconCompatParcelizer).getType();
                }
                if (type == 1) {
                    IconCompat iconCompat2 = this.IconCompatParcelizer;
                    int i = iconCompat2.PlaybackStateCompatCustomAction;
                    if (i == -1) {
                        Object obj = iconCompat2.IconCompatParcelizer;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmap = (Bitmap) iconCompat2.IconCompatParcelizer;
                    } else {
                        if (i != 5) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.IconCompatParcelizer;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f = iMin;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.read) {
            IconCompat iconCompat3 = this.serializer;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.read(accessgetleftcp instanceof NotificationCompatBuilder ? notificationCompatBuilder.write : null));
            }
        }
        if (this.MediaSessionCompatResultReceiverWrapper) {
            bigContentTitle.setSummaryText(this.PlaybackStateCompat);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            getLeftdhqQ8s.serializer(bigContentTitle, this.write);
            getLeftdhqQ8s.RemoteActionCompatParcelizer(bigContentTitle, null);
        }
    }

    public static IconCompat read(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.RemoteActionCompatParcelizer((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.IconCompatParcelizer = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void read(CharSequence charSequence) {
        this.MediaSessionCompatToken = getEnterdhqQ8s.serializer(charSequence);
    }

    public final void write(CharSequence charSequence) {
        this.PlaybackStateCompat = getEnterdhqQ8s.serializer(charSequence);
        this.MediaSessionCompatResultReceiverWrapper = true;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.serializer = read(bundle.getParcelable("android.largeIcon.big"));
            this.read = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.IconCompatParcelizer = parcelable != null ? read(parcelable) : read(bundle.getParcelable("android.pictureIcon"));
        this.write = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
