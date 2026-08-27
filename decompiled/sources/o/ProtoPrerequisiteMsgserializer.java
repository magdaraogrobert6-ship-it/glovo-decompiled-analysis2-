package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProtoPrerequisiteMsgserializer {
    public final ThreadLocal RatingCompat = new ThreadLocal();

    public abstract void IconCompatParcelizer(int i, String str, String str2, Throwable th);

    public void IconCompatParcelizer(String str, Object... objArr) {
        write(4, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void RemoteActionCompatParcelizer(String str, Object... objArr) {
        write(5, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void read(String str, Object... objArr) {
        write(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public /* synthetic */ String IconCompatParcelizer() {
        ThreadLocal threadLocal = this.RatingCompat;
        String str = (String) threadLocal.get();
        if (str != null) {
            threadLocal.remove();
        }
        return str;
    }

    public final void write(int i, Throwable th, String str, Object... objArr) {
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (str != null && str.length() != 0) {
            if (objArr.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) str);
                sb.append('\n');
                StringWriter stringWriter = new StringWriter(androidx.compose.ui.graphics.Fields.RotationX);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                sb.append(string);
                str = sb.toString();
            }
        } else {
            if (th == null) {
                return;
            }
            StringWriter stringWriter2 = new StringWriter(androidx.compose.ui.graphics.Fields.RotationX);
            PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
            th.printStackTrace(printWriter2);
            printWriter2.flush();
            str = stringWriter2.toString();
            str.getClass();
        }
        IconCompatParcelizer(i, strIconCompatParcelizer, str, th);
    }

    public void RemoteActionCompatParcelizer(Throwable th, String str, Object... objArr) {
        write(6, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void read(Throwable th, String str, Object... objArr) {
        write(4, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void serializer(Throwable th, String str, Object... objArr) {
        write(5, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void read(Throwable th) {
        write(5, th, null, new Object[0]);
    }

    public void serializer(Throwable th) {
        write(4, th, null, new Object[0]);
    }

    public void write(Throwable th) {
        write(6, th, null, new Object[0]);
    }
}
