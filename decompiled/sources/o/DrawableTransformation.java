package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DrawableTransformation {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IconCompatParcelizer(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void IconCompatParcelizer(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void IconCompatParcelizer(long j, Object obj) throws EOFException {
        throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + (char) 8230);
    }

    public static /* synthetic */ void write() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void serializer(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void read(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void write(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void read(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void serializer(int i, Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(int i, Object obj, Throwable th) {
        throw new ProtobufDecodingException("Error while decoding proto number " + i + ((Object) " of ") + obj, th);
    }

    public static /* synthetic */ void read(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void read(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void serializer(String str) {
        throw new SerializationException(str);
    }

    public static /* synthetic */ void read(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void serializer(int i, String str, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void IconCompatParcelizer() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void read() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void serializer(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void write(StringBuilder sb, Object obj) {
        sb.append(", but found ");
        sb.append(obj);
        throw new ProtobufDecodingException(sb.toString(), null);
    }

    public static /* synthetic */ void write(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    public static /* synthetic */ void write(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void IconCompatParcelizer(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void serializer(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void read(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void read(Throwable th) {
        throw new RuntimeException(th);
    }
}
