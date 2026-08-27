package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public final r5 a;

    public n0(File file) throws IOException {
        Pattern pattern = r5.f23o;
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        r5 r5Var = new r5(file);
        if (r5Var.b.exists()) {
            try {
                r5Var.c();
                r5Var.b();
            } catch (IOException e) {
                BrazeLogger.w(r5.p, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                r5Var.a();
                mh.a(r5Var.a);
                file.mkdirs();
                r5Var = new r5(file);
                r5Var.d();
            }
        } else {
            file.mkdirs();
            r5Var = new r5(file);
            r5Var.d();
        }
        this.a = r5Var;
    }

    public final void a(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        String strValueOf = String.valueOf(str.hashCode());
        try {
            p5 p5VarA = this.a.a(strValueOf);
            OutputStream outputStreamA = p5VarA.a();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamA);
                outputStreamA.flush();
                outputStreamA.close();
                boolean z = p5VarA.c;
                r5 r5Var = p5VarA.d;
                if (!z) {
                    r5Var.a(p5VarA, true);
                } else {
                    r5Var.a(p5VarA, false);
                    p5VarA.d.d(p5VarA.a.a);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{outputStreamA, th}, i3);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, strValueOf, 19), 4, (Object) null);
        }
    }

    public final Bitmap b(String str) {
        str.getClass();
        String strValueOf = String.valueOf(str.hashCode());
        try {
            q5 q5VarB = this.a.b(strValueOf);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(q5VarB.a[0]);
                q5VarB.close();
                return bitmapDecodeStream;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{q5VarB, th}, i3);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.E, th3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, strValueOf, 16), 4, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, strValueOf, 17), 7, (Object) null);
            return null;
        }
    }

    public static final String c(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Failed to load image from disk cache: ", str, "/", str2);
    }

    public static final String d(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Error while producing output stream or compressing bitmap for key ", str, " diskKey ", str2);
    }

    public static final String b(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Failed to get bitmap from disk cache for key ", str, " diskKey ", str2);
    }

    public static final String b() {
        return "Failed to shutdown disk cache";
    }

    public static final String a(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Error while retrieving disk for key ", str, " diskKey ", str2);
    }

    public final void a() {
        try {
            this.a.a();
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(28), 4, (Object) null);
        }
    }

    public final boolean a(String str) {
        str.getClass();
        String strValueOf = String.valueOf(str.hashCode());
        try {
            q5 q5VarB = this.a.b(strValueOf);
            boolean z = q5VarB != null;
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{q5VarB, null}, sourceInformationContextOfdefault.read());
            return z;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, strValueOf, 18), 4, (Object) null);
            return false;
        }
    }
}
