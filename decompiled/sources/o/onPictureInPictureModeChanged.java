package o;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.camera.core.ImageCapture$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.custom.password.api.CustomPasswordLaunchData;
import com.roadrunner.custom.password.presentation.CustomPasswordActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class onPictureInPictureModeChanged extends onNewIntent {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onPictureInPictureModeChanged(int i) {
        this.serializer = i;
    }

    public /* synthetic */ onPictureInPictureModeChanged(boolean z, int i) {
        this.serializer = i;
    }

    @Override // o.onNewIntent
    public ImageCapture$1 IconCompatParcelizer(Context context, Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        Object obj2 = null;
        if (i5 == 0) {
            ((Uri) obj).getClass();
            int i6 = read + 101;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        if (i5 == 1) {
            ((onCreate) obj).getClass();
            return null;
        }
        if (i5 == 2) {
            String str = (String) obj;
            str.getClass();
            if (FocusListener.write(context, str) == 0) {
                return new ImageCapture$1(i, Boolean.TRUE);
            }
            return null;
        }
        ImageCapture$1 imageCapture$1IconCompatParcelizer = super.IconCompatParcelizer(context, obj);
        int i8 = read + 109;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return imageCapture$1IconCompatParcelizer;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[SYNTHETIC] */
    @Override // o.onNewIntent
    public final Object serializer(int i, Intent intent) {
        Uri data;
        List arrayList;
        int itemCount;
        Uri uri;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        z = false;
        boolean z = false;
        if (i3 == 0) {
            return Boolean.valueOf(i == -1);
        }
        Object obj = null;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i != -1) {
                    return null;
                }
                int i4 = read + 105;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 71 / 0;
                    if (intent == null) {
                        return null;
                    }
                } else if (intent == null) {
                    return null;
                }
                return intent.getStringExtra("result_pass");
            }
            if (intent != null) {
                int i6 = write + 29;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    throw null;
                }
                if (i == -1) {
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null) {
                        for (int i7 : intArrayExtra) {
                            int i8 = write;
                            int i9 = i8 + 37;
                            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            if (i7 == 0) {
                                int i11 = i8 + 83;
                                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                                z = true;
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }
            return Boolean.FALSE;
        }
        if (i == -1) {
            int i13 = write + 87;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            intent = null;
        }
        if (intent != null) {
            int i15 = read + 93;
            write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            data = intent.getData();
            if (data == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null) {
                    int i17 = read + 9;
                    write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        linkedHashSet.isEmpty();
                        throw null;
                    }
                    if (!linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            itemCount = clipData.getItemCount();
                            for (int i18 = 0; i18 < itemCount; i18++) {
                                uri = clipData.getItemAt(i18).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        arrayList = new ArrayList(linkedHashSet);
                    } else {
                        arrayList = instance_delegatelambda0.write;
                    }
                } else {
                    if (clipData != null) {
                        itemCount = clipData.getItemCount();
                        while (i18 < itemCount) {
                            uri = clipData.getItemAt(i18).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                data = (Uri) onContentCardDismissed.MediaMetadataCompat(arrayList);
            }
        } else {
            data = null;
        }
        int i19 = write + 9;
        read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i19 % 2 == 0) {
            return data;
        }
        obj.hashCode();
        throw null;
    }

    public static Intent read(Context context, onCreate oncreate) {
        int i = 2 % 2;
        int i2 = write + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            context.getClass();
            oncreate.getClass();
            onMenuItemSelected.IconCompatParcelizer();
            obj.hashCode();
            throw null;
        }
        context.getClass();
        oncreate.getClass();
        if (onMenuItemSelected.IconCompatParcelizer()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(onMenuItemSelected.IconCompatParcelizer(oncreate.write));
            oncreate.IconCompatParcelizer.getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(onMenuItemSelected.IconCompatParcelizer(oncreate.write));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            int i3 = read + 103;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
            }
            return intent2;
        }
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        if (resolveInfoResolveActivity == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(onMenuItemSelected.IconCompatParcelizer(oncreate.write));
        oncreate.IconCompatParcelizer.getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    @Override // o.onNewIntent
    public final Intent RemoteActionCompatParcelizer(Context context, Object obj) {
        int i = 2 % 2;
        int i2 = read + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.serializer;
        if (i3 == 0) {
            Uri uri = (Uri) obj;
            uri.getClass();
            Intent intentAddFlags = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
            intentAddFlags.getClass();
            return intentAddFlags;
        }
        if (i3 == 1) {
            Intent intent = read(context, (onCreate) obj);
            int i4 = write + 29;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return intent;
        }
        if (i3 != 2) {
            CustomPasswordLaunchData customPasswordLaunchData = (CustomPasswordLaunchData) obj;
            customPasswordLaunchData.getClass();
            Intent intentPutExtra = new Intent(context, (Class<?>) CustomPasswordActivity.class).putExtra("launch_data", customPasswordLaunchData);
            intentPutExtra.getClass();
            return intentPutExtra;
        }
        String str = (String) obj;
        str.getClass();
        Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        intentPutExtra2.getClass();
        int i6 = write + 51;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return intentPutExtra2;
    }
}
