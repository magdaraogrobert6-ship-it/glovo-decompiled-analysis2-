package io.reactivex.exceptions;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {
    public final String IconCompatParcelizer;
    public Throwable read;
    public final List serializer;

    public static final class CompositeExceptionCausalChain extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class PrintStreamOrWriter {
        public abstract void write(String str);
    }

    public static final class WrappedPrintStream extends PrintStreamOrWriter {
        public final PrintStream write;

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        public final void write(String str) {
            this.write.println((Object) str);
        }

        public WrappedPrintStream(PrintStream printStream) {
            this.write = printStream;
        }
    }

    public static final class WrappedPrintWriter extends PrintStreamOrWriter {
        public final PrintWriter serializer;

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        public final void write(String str) {
            this.serializer.println((Object) str);
        }

        public WrappedPrintWriter(PrintWriter printWriter) {
            this.serializer = printWriter;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Throwable th;
        synchronized (this) {
            if (this.read == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
                for (Throwable runtimeException : this.serializer) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        for (Throwable th2 : arrayList) {
                            if (hashSet.contains(th2)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            compositeExceptionCausalChain2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = compositeExceptionCausalChain2.getCause();
                        if (cause3 != null && compositeExceptionCausalChain2 != cause3) {
                            do {
                                compositeExceptionCausalChain2 = cause3;
                                cause3 = compositeExceptionCausalChain2.getCause();
                                if (cause3 == null) {
                                    break;
                                }
                            } while (cause3 != compositeExceptionCausalChain2);
                        }
                    }
                }
                this.read = compositeExceptionCausalChain;
            }
            th = this.read;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.IconCompatParcelizer;
    }

    public static void RemoteActionCompatParcelizer(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            RemoteActionCompatParcelizer("", sb, th.getCause());
        }
    }

    public final void IconCompatParcelizer(PrintStreamOrWriter printStreamOrWriter) {
        StringBuilder sb = new StringBuilder(Fields.SpotShadowColor);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.serializer) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            RemoteActionCompatParcelizer("\t", sb, th);
            i++;
        }
        printStreamOrWriter.write(sb.toString());
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).serializer);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("errors is empty");
            throw null;
        }
        arrayList.addAll(linkedHashSet);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.serializer = listUnmodifiableList;
        this.IconCompatParcelizer = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        IconCompatParcelizer(new WrappedPrintStream(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        IconCompatParcelizer(new WrappedPrintWriter(printWriter));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
