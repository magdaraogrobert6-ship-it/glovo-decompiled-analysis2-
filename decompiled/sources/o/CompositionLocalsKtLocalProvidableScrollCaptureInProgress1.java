package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 extends getLocalScrollCaptureInProgress {
    public final Object RemoteActionCompatParcelizer;
    public final getElevation read;
    public final getElevation serializer;
    public final CompositionLocalsKtLocalLocale1 write;

    public final getElevation IconCompatParcelizer() {
        return this.read;
    }

    public final getElevation serializer() {
        return this.serializer;
    }

    public final Object IconCompatParcelizer(Object obj) {
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = this.write;
        if (!compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer) {
            return read(obj);
        }
        if (compositionLocalsKtLocalLocale1.write.getJavaType() != onDown.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(read(it.next()));
        }
        return arrayList;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write.IconCompatParcelizer;
    }

    public final Object RemoteActionCompatParcelizer(Object obj) {
        return this.write.write.getJavaType() == onDown.ENUM ? Integer.valueOf(((ifDebug) obj).getNumber()) : obj;
    }

    public final Object read(Object obj) {
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = this.write;
        return compositionLocalsKtLocalLocale1.write.getJavaType() == onDown.ENUM ? compositionLocalsKtLocalLocale1.serializer.IconCompatParcelizer(((Integer) obj).intValue()) : obj;
    }

    public final onScroll read() {
        return this.write.write;
    }

    public final boolean write() {
        return this.write.RemoteActionCompatParcelizer;
    }

    public CompositionLocalsKtLocalProvidableScrollCaptureInProgress1(getElevation getelevation, Object obj, getElevation getelevation2, CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1) {
        if (getelevation == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Null containingTypeDefaultInstance");
            throw null;
        }
        if (compositionLocalsKtLocalLocale1.write == onScroll.MESSAGE && getelevation2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Null messageDefaultInstance");
            throw null;
        }
        this.read = getelevation;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = getelevation2;
        this.write = compositionLocalsKtLocalLocale1;
    }
}
