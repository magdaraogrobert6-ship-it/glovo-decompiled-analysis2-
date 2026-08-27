package o;

import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.Target;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class fromParentPosition8S9VItk {
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[Target.serializer.values().length];
        read = iArr;
        try {
            iArr[Target.serializer.DOCUMENTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[Target.serializer.QUERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[Target.serializer.PIPELINE_QUERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[MaybeDocument.read.values().length];
        serializer = iArr2;
        try {
            iArr2[MaybeDocument.read.DOCUMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            serializer[MaybeDocument.read.NO_DOCUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            serializer[MaybeDocument.read.UNKNOWN_DOCUMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
