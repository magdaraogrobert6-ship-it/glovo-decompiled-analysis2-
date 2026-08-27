package bo.app;

import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f23o = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final String p = BrazeLogger.getBrazeLogTag((Class<?>) r5.class);
    public static final n5 q = new n5();
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final m5 n = new m5(this);
    public final int e = 1;
    public final int g = 1;
    public final long f = 52428800;

    public final void a(p5 p5Var, boolean z) {
        int i;
        synchronized (this) {
            l7 l7Var = p5Var.a;
            if (l7Var.d != p5Var) {
                throw new IllegalStateException();
            }
            if (z && !l7Var.c) {
                for (int i2 = 0; i2 < this.g; i2++) {
                    if (!p5Var.b[i2]) {
                        p5Var.d.a(p5Var, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!l7Var.a(i2).exists()) {
                        p5Var.d.a(p5Var, false);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.g; i3++) {
                File fileA = l7Var.a(i3);
                if (z) {
                    if (fileA.exists()) {
                        File file = new File(l7Var.f, l7Var.a + "." + i3);
                        fileA.renameTo(file);
                        long j = l7Var.b[i3];
                        long length = file.length();
                        l7Var.b[i3] = length;
                        this.h = (this.h - j) + length;
                    }
                } else if (fileA.exists() && !fileA.delete()) {
                    throw new IOException();
                }
            }
            this.k++;
            l7Var.d = null;
            if (l7Var.c || z) {
                l7Var.c = true;
                BufferedWriter bufferedWriter = this.i;
                StringBuilder sb = new StringBuilder("CLEAN ");
                sb.append(l7Var.a);
                StringBuilder sb2 = new StringBuilder();
                for (long j2 : l7Var.b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z) {
                    this.l++;
                }
            } else {
                this.j.remove(l7Var.a);
                this.i.write("REMOVE " + l7Var.a + '\n');
            }
            this.i.flush();
            if (this.h > this.f || ((i = this.k) >= 2000 && i >= this.j.size())) {
                this.m.submit(this.n);
            }
        }
    }

    public final q5 b(String str) {
        InputStream inputStream;
        synchronized (this) {
            if (this.i == null) {
                throw new IllegalStateException("cache is closed");
            }
            if (!f23o.matcher(str).matches()) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            l7 l7Var = (l7) this.j.get(str);
            if (l7Var == null) {
                return null;
            }
            if (!l7Var.c) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.g];
            for (int i = 0; i < this.g; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(new File(l7Var.f, l7Var.a + "." + i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        Charset charset = mh.a;
                        try {
                            inputStream.close();
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
            }
            this.k++;
            this.i.append((CharSequence) ("READ " + str + '\n'));
            int i3 = this.k;
            if (i3 >= 2000 && i3 >= this.j.size()) {
                this.m.submit(this.n);
            }
            return new q5(inputStreamArr);
        }
    }

    public final void d() {
        synchronized (this) {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), mh.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (l7 l7Var : this.j.values()) {
                    if (l7Var.d != null) {
                        bufferedWriter2.write("DIRTY " + l7Var.a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(l7Var.a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j : l7Var.b) {
                            sb2.append(' ');
                            sb2.append(j);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.b.exists()) {
                    File file = this.b;
                    File file2 = this.d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.c.renameTo(this.b)) {
                    throw new IOException();
                }
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), mh.a));
            } catch (Throwable th) {
                try {
                    bufferedWriter2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public r5(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
    }

    public final void c() {
        uf ufVar = new uf(new FileInputStream(this.b), mh.a);
        try {
            String strA = ufVar.a();
            String strA2 = ufVar.a();
            String strA3 = ufVar.a();
            String strA4 = ufVar.a();
            String strA5 = ufVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.e).equals(strA3) || !Integer.toString(this.g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    c(ufVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (ufVar.e == -1) {
                        d();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), mh.a));
                    }
                    try {
                        ufVar.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                ufVar.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i, iIndexOf2);
            }
            l7 l7Var = (l7) this.j.get(strSubstring);
            if (l7Var == null) {
                l7Var = new l7(strSubstring, this.g, this.a);
                this.j.put(strSubstring, l7Var);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                l7Var.c = true;
                l7Var.d = null;
                if (strArrSplit.length == l7Var.e) {
                    for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                        try {
                            l7Var.b[i2] = Long.parseLong(strArrSplit[i2]);
                        } catch (NumberFormatException unused) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write(Arrays.toString(strArrSplit), "unexpected journal line: ");
                            return;
                        }
                    }
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                l7Var.d = new p5(this, l7Var);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
    }

    public final void b() throws IOException {
        File file = this.c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            l7 l7Var = (l7) it.next();
            int i = 0;
            if (l7Var.d == null) {
                while (i < this.g) {
                    this.h += l7Var.b[i];
                    i++;
                }
            } else {
                l7Var.d = null;
                while (i < this.g) {
                    File file2 = new File(l7Var.f, l7Var.a + "." + i);
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    File fileA = l7Var.a(i);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void d(String str) {
        synchronized (this) {
            if (this.i != null) {
                if (f23o.matcher(str).matches()) {
                    l7 l7Var = (l7) this.j.get(str);
                    if (l7Var != null && l7Var.d == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = new File(l7Var.f, l7Var.a + "." + i);
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = l7Var.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.j.remove(str);
                        int i2 = this.k;
                        if (i2 >= 2000 && i2 >= this.j.size()) {
                            this.m.submit(this.n);
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final p5 a(String str) {
        synchronized (this) {
            if (this.i != null) {
                if (f23o.matcher(str).matches()) {
                    l7 l7Var = (l7) this.j.get(str);
                    if (l7Var == null) {
                        l7Var = new l7(str, this.g, this.a);
                        this.j.put(str, l7Var);
                    } else if (l7Var.d != null) {
                        return null;
                    }
                    p5 p5Var = new p5(this, l7Var);
                    l7Var.d = p5Var;
                    this.i.write("DIRTY " + str + '\n');
                    this.i.flush();
                    return p5Var;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void a() {
        synchronized (this) {
            if (this.i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.j.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                p5 p5Var = ((l7) obj).d;
                if (p5Var != null) {
                    p5Var.d.a(p5Var, false);
                }
            }
            while (this.h > this.f) {
                d((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
            }
            this.i.close();
            this.i = null;
        }
    }
}
