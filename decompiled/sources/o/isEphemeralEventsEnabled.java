package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class isEphemeralEventsEnabled {
    public final String[] read;

    public static void serializer(String str) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("name == null");
            return;
        }
        if (str.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str};
                byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(String.format(java.util.Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                return;
            }
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.length / 2;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iIconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            sb.append(read(i));
            sb.append(": ");
            sb.append(write(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Set write() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int iIconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            treeSet.add(read(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public isEphemeralEventsEnabled(u$a u_a) {
        ArrayList arrayList = u_a.IconCompatParcelizer;
        this.read = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final u$a read() {
        u$a u_a = new u$a(0);
        Collections.addAll(u_a.IconCompatParcelizer, this.read);
        return u_a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof isEphemeralEventsEnabled) && Arrays.equals(((isEphemeralEventsEnabled) obj).read, this.read);
    }

    public final String write(int i) {
        return this.read[(i * 2) + 1];
    }

    public final String RemoteActionCompatParcelizer(String str) {
        String[] strArr = this.read;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String read(int i) {
        return this.read[i * 2];
    }

    public static void serializer(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str};
                    byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(String.format(java.util.Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
                    return;
                }
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(ff$$ExternalSyntheticOutline0.m("value for name ", str2, " == null"));
    }
}
