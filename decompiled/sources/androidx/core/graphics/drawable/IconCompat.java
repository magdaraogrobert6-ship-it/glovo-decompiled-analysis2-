package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o.dispatchInterceptedSoftKeyboardEventZmokQxo;
import o.getActiveFocusTargetNode;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode write = PorterDuff.Mode.SRC_IN;
    public Object IconCompatParcelizer;
    public ColorStateList MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public PorterDuff.Mode MediaMetadataCompat;
    public Parcelable MediaSessionCompatQueueItem;
    public int PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public byte[] serializer;

    public static IconCompat IconCompatParcelizer(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.RemoteActionCompatParcelizer = bundle.getInt("int1");
        iconCompat.read = bundle.getInt("int2");
        iconCompat.RatingCompat = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.MediaBrowserCompatMediaItem = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.MediaMetadataCompat = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.IconCompatParcelizer = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                SentryLogcatAdapter.IconCompatParcelizer("IconCompat", "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.IconCompatParcelizer = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.IconCompatParcelizer = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat RemoteActionCompatParcelizer(Icon icon) {
        icon.getClass();
        int type = icon.getType();
        if (type == 2) {
            return read(null, icon.getResPackage(), icon.getResId());
        }
        if (type == 4) {
            Uri uri = icon.getUri();
            uri.getClass();
            String string = uri.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.IconCompatParcelizer = string;
            return iconCompat;
        }
        if (type != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.IconCompatParcelizer = icon;
            return iconCompat2;
        }
        Uri uri2 = icon.getUri();
        uri2.getClass();
        String string2 = uri2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.IconCompatParcelizer = string2;
        return iconCompat3;
    }

    public IconCompat(int i) {
        this.serializer = null;
        this.MediaSessionCompatQueueItem = null;
        this.RemoteActionCompatParcelizer = 0;
        this.read = 0;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaMetadataCompat = write;
        this.MediaDescriptionCompat = null;
        this.PlaybackStateCompatCustomAction = i;
    }

    public final Uri IconCompatParcelizer() {
        int i = this.PlaybackStateCompatCustomAction;
        if (i == -1) {
            return ((Icon) this.IconCompatParcelizer).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.IconCompatParcelizer);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(this, "called getUri() on ");
        return null;
    }

    public final int read() {
        int i = this.PlaybackStateCompatCustomAction;
        if (i == -1) {
            return ((Icon) this.IconCompatParcelizer).getResId();
        }
        if (i == 2) {
            return this.RemoteActionCompatParcelizer;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(this, "called getResId() on ");
        return 0;
    }

    public final String serializer() {
        int i = this.PlaybackStateCompatCustomAction;
        if (i == -1) {
            return ((Icon) this.IconCompatParcelizer).getResPackage();
        }
        if (i == 2) {
            String str = this.RatingCompat;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.IconCompatParcelizer).split(":", -1)[0] : this.RatingCompat;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(this, "called getResPackage() on ");
        return null;
    }

    public final String toString() {
        String str;
        if (this.PlaybackStateCompatCustomAction == -1) {
            return String.valueOf(this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.PlaybackStateCompatCustomAction) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
        }
        sb.append(str);
        switch (this.PlaybackStateCompatCustomAction) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.IconCompatParcelizer).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.IconCompatParcelizer).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.RatingCompat);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(read())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.RemoteActionCompatParcelizer);
                if (this.read != 0) {
                    sb.append(" off=");
                    sb.append(this.read);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.IconCompatParcelizer);
                break;
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            sb.append(" tint=");
            sb.append(this.MediaBrowserCompatMediaItem);
        }
        if (this.MediaMetadataCompat != write) {
            sb.append(" mode=");
            sb.append(this.MediaMetadataCompat);
        }
        sb.append(")");
        return sb.toString();
    }

    public final Icon read(Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        switch (this.PlaybackStateCompatCustomAction) {
            case -1:
                return (Icon) this.IconCompatParcelizer;
            case 0:
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.IconCompatParcelizer);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(serializer(), this.RemoteActionCompatParcelizer);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.IconCompatParcelizer);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.IconCompatParcelizer);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = dispatchInterceptedSoftKeyboardEventZmokQxo.serializer(IconCompatParcelizer());
                } else {
                    if (context == null) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(IconCompatParcelizer(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriIconCompatParcelizer = IconCompatParcelizer();
                    String scheme = uriIconCompatParcelizer.getScheme();
                    if (RemoteMessageConst.Notification.CONTENT.equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriIconCompatParcelizer);
                        } catch (Exception e) {
                            SentryLogcatAdapter.write("IconCompat", "Unable to load image from URI: " + uriIconCompatParcelizer, e);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            File file = new File((String) this.IconCompatParcelizer);
                            inputStreamOpenInputStream = getActiveFocusTargetNode.write(file, new FileInputStream(file));
                        } catch (FileNotFoundException e2) {
                            SentryLogcatAdapter.write("IconCompat", "Unable to load image from path: " + uriIconCompatParcelizer, e2);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(IconCompatParcelizer(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = this.MediaBrowserCompatMediaItem;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.MediaMetadataCompat;
        if (mode != write) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static IconCompat read(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.RemoteActionCompatParcelizer = i;
        if (resources != null) {
            try {
                iconCompat.IconCompatParcelizer = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.IconCompatParcelizer = str;
        }
        iconCompat.RatingCompat = str;
        return iconCompat;
    }

    public IconCompat() {
    }
}
