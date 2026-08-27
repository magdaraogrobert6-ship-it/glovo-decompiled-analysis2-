package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.io.ByteArrayOutputStream;
import java.io.File;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class onExitLayoutOrScroll {
    private static int serializer = 1;
    private static int write;
    public final transferSessionPackageI RemoteActionCompatParcelizer;

    public onExitLayoutOrScroll(transferSessionPackageI transfersessionpackagei) {
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public final Object IconCompatParcelizer(String str) {
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite;
        int i = 2 % 2;
        str.getClass();
        File file = new File(str);
        long jWrite = ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).IconCompatParcelizer.write("identity_verification_max_selfie_size");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i2 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i3 = options.outHeight;
            int i4 = options.outWidth;
            while ((i3 / i2) * (i4 / i2) * 4 > 1048576 * jWrite) {
                int i5 = serializer;
                int i6 = i5 + 3;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i2 = i6 % 2 != 0 ? i2 + 87 : i2 + 1;
                int i7 = i5 + 47;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 2;
                }
            }
            options.inSampleSize = i2;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            bitmapDecodeFile.getClass();
            String name = file.getName();
            name.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmapDecodeFile.recycle();
            byteArray.getClass();
            r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = RequestBody.Companion;
            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
            try {
                inAppMessageHtmlBaseViewWrite = androidx.sqlite.SQLite.write("image/*");
            } catch (IllegalArgumentException unused) {
                inAppMessageHtmlBaseViewWrite = null;
            }
            return RoundRectgG7oq9Y.RemoteActionCompatParcelizer("image", name, r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.RemoteActionCompatParcelizer(r8lambdaz90zxc5cr3ctjy9kwemhzodg3le, byteArray, inAppMessageHtmlBaseViewWrite, 0, 6));
        } catch (Throwable th) {
            return new isItemDismissable(th);
        }
    }
}
