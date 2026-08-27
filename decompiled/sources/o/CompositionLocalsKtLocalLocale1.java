package o;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositionLocalsKtLocalLocale1 implements Comparable {
    public final int IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final dataAvailable serializer;
    public final onScroll write;

    public final boolean MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer;
    }

    public final onScroll RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final dataAvailable read() {
        return this.serializer;
    }

    public final boolean serializer() {
        return this.read;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public static CompositionLocalsKtLocalHapticFeedback1 serializer(getClipToOutline getcliptooutline, getElevation getelevation) {
        CompositionLocalsKtLocalHapticFeedback1 compositionLocalsKtLocalHapticFeedback1 = (CompositionLocalsKtLocalHapticFeedback1) getcliptooutline;
        compositionLocalsKtLocalHapticFeedback1.read((GeneratedMessageLite) getelevation);
        return compositionLocalsKtLocalHapticFeedback1;
    }

    public final onDown IconCompatParcelizer() {
        return this.write.getJavaType();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.IconCompatParcelizer - ((CompositionLocalsKtLocalLocale1) obj).IconCompatParcelizer;
    }

    public CompositionLocalsKtLocalLocale1(dataAvailable dataavailable, int i, onScroll onscroll, boolean z, boolean z2) {
        this.serializer = dataavailable;
        this.IconCompatParcelizer = i;
        this.write = onscroll;
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
    }
}
