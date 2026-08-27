package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getPixelsFromDensityAndDp implements Iterator {
    public getLocalBitmaplambda8 IconCompatParcelizer = null;
    public final /* synthetic */ getLocalBitmaplambda7 RemoteActionCompatParcelizer;
    public int read;
    public getLocalBitmaplambda8 serializer;
    public final /* synthetic */ int write;

    public final Object IconCompatParcelizer() {
        return read();
    }

    public getPixelsFromDensityAndDp(getLocalBitmaplambda7 getlocalbitmaplambda7, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = getlocalbitmaplambda7;
        this.serializer = getlocalbitmaplambda7.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        this.read = getlocalbitmaplambda7.MediaDescriptionCompat;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer != this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public final getLocalBitmaplambda8 read() {
        getLocalBitmaplambda8 getlocalbitmaplambda8 = this.serializer;
        getLocalBitmaplambda7 getlocalbitmaplambda7 = this.RemoteActionCompatParcelizer;
        if (getlocalbitmaplambda8 == getlocalbitmaplambda7.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        if (getlocalbitmaplambda7.MediaDescriptionCompat != this.read) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        this.serializer = getlocalbitmaplambda8.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = getlocalbitmaplambda8;
        return getlocalbitmaplambda8;
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.write != 0 ? IconCompatParcelizer() : read().IconCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final void remove() {
        getLocalBitmaplambda8 getlocalbitmaplambda8 = this.IconCompatParcelizer;
        if (getlocalbitmaplambda8 == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        getLocalBitmaplambda7 getlocalbitmaplambda7 = this.RemoteActionCompatParcelizer;
        getlocalbitmaplambda7.RemoteActionCompatParcelizer(getlocalbitmaplambda8, true);
        this.IconCompatParcelizer = null;
        this.read = getlocalbitmaplambda7.MediaDescriptionCompat;
    }
}
