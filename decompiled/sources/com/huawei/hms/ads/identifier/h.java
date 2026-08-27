package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.Constants;
import com.logistics.rider.glovo.R;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    private static final byte[] a = new byte[0];
    private static final byte[] b = new byte[0];
    private static SoftReference<byte[]> c;

    public static class a {
        private static final Long a = 120000L;
        private static final byte[] h = new byte[0];
        private static volatile a i;
        private SharedPreferences b;
        private SharedPreferences c;
        private SharedPreferences d;
        private final byte[] e = new byte[0];
        private final byte[] f = new byte[0];
        private final byte[] g = new byte[0];
        private Context j;

        public String a() {
            String strA;
            synchronized (this.f) {
                SharedPreferences sharedPreferences = this.d;
                if (sharedPreferences == null) {
                    strA = "";
                } else {
                    String string = sharedPreferences.getString("read_first_chapter", "");
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    strA = h.a(string, h.a(this.j));
                }
                return strA;
            }
        }

        public void b() {
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong("read_first_chapter_time", System.currentTimeMillis()).apply();
                }
            }
        }

        public boolean c() {
            boolean z;
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null) {
                    long j = sharedPreferences.getLong("read_first_chapter_time", -1L);
                    if (j >= 0) {
                        z = j + a.longValue() > System.currentTimeMillis();
                    }
                }
            }
            return z;
        }

        public void d() {
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("exemption_count_record", 0).apply();
                }
            }
        }

        public void e() {
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null) {
                    this.b.edit().putInt("exemption_count_record", sharedPreferences.getInt("exemption_count_record", 0) + 1).apply();
                }
            }
        }

        public boolean f() {
            boolean z;
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                z = false;
                if (sharedPreferences != null && sharedPreferences.getInt("exemption_count_record", 0) < this.b.getInt("exemption_count", 3)) {
                    z = true;
                }
            }
            return z;
        }

        public String g() {
            synchronized (this.e) {
                SharedPreferences sharedPreferences = this.c;
                if (sharedPreferences == null) {
                    return null;
                }
                return sharedPreferences.getString("get_a_book", null);
            }
        }

        public String h() {
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences == null) {
                    return null;
                }
                String string = sharedPreferences.getString("catch_a_cat", null);
                if (string == null) {
                    string = g.a(h.a());
                    c(string);
                }
                return string;
            }
        }

        public String i() {
            String string;
            synchronized (this.g) {
                string = this.b.getString("read_second_chapter", "");
            }
            return string;
        }

        private a(Context context) {
            this.b = null;
            this.c = null;
            this.d = null;
            try {
                this.j = context.getApplicationContext();
                Context contextA = j.a(context);
                this.b = contextA.getSharedPreferences("identifier_sp_story_book_file", 4);
                this.c = contextA.getSharedPreferences("identifier_hiad_sp_bed_rock_file", 4);
                this.d = contextA.getSharedPreferences("identifier_hiad_sp_red_stone_file", 4);
            } catch (Throwable th) {
                Log.w("Aes128", "get SharedPreference error: ".concat(th.getClass().getSimpleName()));
            }
        }

        public void d(String str) {
            synchronized (this.g) {
                this.b.edit().putString("read_second_chapter", str).apply();
            }
        }

        public void b(String str) {
            synchronized (this.e) {
                SharedPreferences sharedPreferences = this.c;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("get_a_book", str).commit();
                }
            }
        }

        public static a a(Context context) {
            a aVar;
            if (i != null) {
                return i;
            }
            synchronized (h) {
                if (i == null) {
                    i = new a(context);
                }
                aVar = i;
            }
            return aVar;
        }

        public void a(int i2) {
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("exemption_count", i2).apply();
                }
            }
        }

        public void a(String str) {
            synchronized (this.f) {
                if (this.d != null) {
                    this.d.edit().putString("read_first_chapter", h.b(str, h.a(this.j))).apply();
                }
            }
        }

        public void c(String str) {
            synchronized (this.g) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("catch_a_cat", str).commit();
                }
            }
        }
    }

    private static boolean d() {
        return true;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr.length != 0) {
            if (bArr2 != null && bArr2.length >= 16) {
                if (!d()) {
                    return new byte[0];
                }
                if (bArr3 != null && bArr3.length >= 12) {
                    try {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(1, secretKeySpec, c(bArr3));
                        return cipher.doFinal(bArr);
                    } catch (GeneralSecurityException e) {
                        Log.e("Aes128", "GCM encrypt data error" + e.getMessage());
                        return new byte[0];
                    }
                }
                return new byte[0];
            }
            return new byte[0];
        }
        return new byte[0];
    }

    private static byte[] e(Context context) {
        return a(context, f(context));
    }

    private static String f(Context context) {
        final a aVarA = a.a(context);
        String strI = aVarA.i();
        if (!TextUtils.isEmpty(strI)) {
            return strI;
        }
        final String strB = b(64);
        j.a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.h.1
            @Override // java.lang.Runnable
            public void run() {
                aVarA.d(strB);
            }
        });
        return strB;
    }

    private static String d(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16 && d()) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                String strC = c(str);
                String strD = d(str);
                if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strD)) {
                    return "";
                }
                cipher.init(2, secretKeySpec, c(a(strC)));
                return new String(cipher.doFinal(a(strD)), Constants.ENCODING);
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                Log.e("Aes128", "GCM decrypt data exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static byte[] b(String str) throws NumberFormatException, UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = upperCase.getBytes(Constants.ENCODING);
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Byte.decode("0x".concat(new String(new byte[]{bytes[i2 + 1]}, Constants.ENCODING))).byteValue() ^ ((byte) (Byte.decode("0x".concat(new String(new byte[]{bytes[i2]}, Constants.ENCODING))).byteValue() << 4)));
        }
        return bArr;
    }

    private static String c(String str, byte[] bArr) {
        byte[] bArrA;
        byte[] bArrA2;
        return (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16 || !d() || (bArrA2 = a(str, bArr, (bArrA = a(12)))) == null || bArrA2.length == 0) ? "" : r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(g.a(bArrA), g.a(bArrA2));
    }

    private static String c(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 24) ? "" : str.substring(0, 24);
    }

    private static SecureRandom c() {
        SecureRandom instanceStrong;
        try {
            instanceStrong = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            Log.w("Aes128", "getInstanceStrong, exception: ".concat(e.getClass().getSimpleName()));
            instanceStrong = null;
        }
        return instanceStrong == null ? new SecureRandom() : instanceStrong;
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return new GCMParameterSpec(Fields.SpotShadowColor, bArr);
    }

    private static byte[] c(Context context) {
        a.a(context).b("");
        return a(b(context));
    }

    public static String a(String str, String str2) {
        String strA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (a) {
            try {
                strA = a(str, b(str2));
            } catch (Throwable th) {
                Log.w("Aes128", "decrypt oaid ex: ".concat(th.getClass().getSimpleName()));
                return null;
            }
        }
        return strA;
    }

    public static String a(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || str.length() < 32 || bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return d() ? d(str, bArr) : "";
        } catch (Throwable th) {
            Log.w("Aes128", "fail to decrypt: ".concat(th.getClass().getSimpleName()));
            return "";
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr != null && bArr.length >= 12;
    }

    private static String b(Context context) {
        String strA;
        if (context == null) {
            return "";
        }
        synchronized (b) {
            a aVarA = a.a(context);
            String strG = aVarA.g();
            if (strG != null) {
                strA = a(strG, d(context));
                if (TextUtils.isEmpty(strA)) {
                }
            }
            strA = a(context, aVarA);
        }
        return strA;
    }

    public static byte[] a() {
        return a(16);
    }

    public static String b(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return d() ? c(str, bArr) : "";
        } catch (Exception e) {
            Log.w("Aes128", "fail to cipher: ".concat(e.getClass().getSimpleName()));
            return "";
        }
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        c().nextBytes(bArr);
        return bArr;
    }

    private static boolean b(byte[] bArr) {
        return bArr != null && bArr.length >= 16;
    }

    public static byte[] a(Context context) {
        byte[] bArr;
        byte[] bArrC;
        synchronized (b) {
            SoftReference<byte[]> softReference = c;
            bArr = softReference != null ? softReference.get() : null;
            if (bArr == null) {
                try {
                    try {
                        bArrC = b(b(context));
                    } catch (Throwable th) {
                        Log.w("Aes128", "getWorkKeyBytes ".concat(th.getClass().getSimpleName()));
                        bArrC = c(context);
                    }
                } catch (UnsupportedEncodingException unused) {
                    Log.w("Aes128", "getWorkKeyBytes UnsupportedEncodingException");
                    bArrC = c(context);
                }
                bArr = bArrC;
                c = new SoftReference<>(bArr);
            }
        }
        return bArr;
    }

    public static byte[] b() {
        return a(16);
    }

    private static byte[] a(Context context, String str) {
        return a(str, context.getString(R.string.identifier_hiad_str_2), context.getString(R.string.identifier_hiad_str_3));
    }

    private static String b(int i) {
        try {
            SecureRandom secureRandomC = c();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(Integer.toHexString(secureRandomC.nextInt(16)));
            }
            return sb.toString();
        } catch (Throwable th) {
            Log.w("Aes128", "generate aes key1 err:".concat(th.getClass().getSimpleName()));
            return "";
        }
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[0];
        try {
            return b(str);
        } catch (Throwable th) {
            Log.e("Aes128", "hex string 2 byte: ".concat(th.getClass().getSimpleName()));
            return bArr;
        }
    }

    private static byte[] a(String str, String str2, String str3) {
        byte[] bArrA = a(str);
        byte[] bArrA2 = a(str2);
        return a(a(bArrA, bArrA2), a(str3));
    }

    private static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str) || !b(bArr) || !a(bArr2) || !d()) {
            return new byte[0];
        }
        try {
            return a(str.getBytes(Constants.ENCODING), bArr, bArr2);
        } catch (UnsupportedEncodingException e) {
            Log.e("Aes128", "GCM encrypt data error" + e.getMessage());
            return new byte[0];
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= bArr2.length) {
            bArr2 = bArr;
            bArr = bArr2;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length];
        int i = 0;
        while (i < length2) {
            bArr3[i] = (byte) (bArr2[i] ^ bArr[i]);
            i++;
        }
        while (i < bArr.length) {
            bArr3[i] = bArr[i];
            i++;
        }
        return bArr3;
    }

    private static String a(Context context, a aVar) {
        String strA = g.a(b());
        aVar.b(b(strA, d(context)));
        return strA;
    }

    public static byte[] a(char[] cArr, byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(cArr, bArr, 10000, Fields.RotationX)).getEncoded();
    }

    private static String d(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 24) ? "" : str.substring(24);
    }

    private static byte[] d(Context context) {
        String str;
        if (context == null) {
            return new byte[0];
        }
        a aVarA = a.a(context);
        try {
            return a(g.a(e(context)).toCharArray(), a(aVarA.h()));
        } catch (NoSuchAlgorithmException unused) {
            str = "get userRootKey NoSuchAlgorithmException";
            Log.w("Aes128", str);
            return null;
        } catch (InvalidKeySpecException unused2) {
            str = "get userRootKey InvalidKeySpecException";
            Log.w("Aes128", str);
            return null;
        }
    }
}
