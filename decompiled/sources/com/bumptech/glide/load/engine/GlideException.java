package com.bumptech.glide.load.engine;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.DrawableTransformation;
import o.eotfFunclambda0;
import o.generateEotflambda1;
import o.r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] RemoteActionCompatParcelizer = new StackTraceElement[0];
    public r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I IconCompatParcelizer;
    public eotfFunclambda0 MediaMetadataCompat;
    public final String read;
    public final List serializer;
    public Class write;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public GlideException(String str, List list) {
        this.read = str;
        setStackTrace(RemoteActionCompatParcelizer);
        this.serializer = list;
    }

    public final void serializer(Appendable appendable) {
        IconCompatParcelizer(this, appendable);
        try {
            write(this.serializer, new generateEotflambda1(appendable));
        } catch (IOException e) {
            DrawableTransformation.read((Throwable) e);
        }
    }

    public static void IconCompatParcelizer(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            DrawableTransformation.read(th);
        }
    }

    public static void write(Throwable th, ArrayList arrayList) {
        if (th instanceof GlideException) {
            Iterator it = ((GlideException) th).serializer.iterator();
            while (it.hasNext()) {
                write((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.read);
        sb.append(this.write != null ? ", " + this.write : "");
        sb.append(this.IconCompatParcelizer != null ? ", " + this.IconCompatParcelizer : "");
        sb.append(this.MediaMetadataCompat != null ? ", " + this.MediaMetadataCompat : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        write(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public static void write(List list, generateEotflambda1 generateeotflambda1) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            generateeotflambda1.append("Cause (");
            int i2 = i + 1;
            generateeotflambda1.append(String.valueOf(i2));
            generateeotflambda1.append(" of ");
            generateeotflambda1.append(String.valueOf(size));
            generateeotflambda1.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).serializer(generateeotflambda1);
            } else {
                IconCompatParcelizer(th, generateeotflambda1);
            }
            i = i2;
        }
    }

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        serializer(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        serializer(printWriter);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        serializer(System.err);
    }
}
