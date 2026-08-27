package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public class onExited extends onChanged {
    public boolean MediaDescriptionCompat;
    public Object RatingCompat;
    public int RemoteActionCompatParcelizer;
    public final onEntered read;

    public onExited(onEntered onentered, startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr) {
        super(onentered.serializer, startdraganddroptransferd4ec7iArr);
        this.read = onentered;
        this.RemoteActionCompatParcelizer = onentered.RemoteActionCompatParcelizer;
    }

    @Override // o.onChanged, java.util.Iterator
    public final Object next() {
        if (this.read.RemoteActionCompatParcelizer != this.RemoteActionCompatParcelizer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        if (!this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i = this.write[this.IconCompatParcelizer];
        this.RatingCompat = startdraganddroptransferd4ec7i.read[startdraganddroptransferd4ec7i.write];
        this.MediaDescriptionCompat = true;
        return super.next();
    }

    public final void RemoteActionCompatParcelizer(int i, requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m, Object obj, int i2) {
        int i3 = i2 * 5;
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = this.write;
        if (i3 > 30) {
            startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i = startdraganddroptransferd4ec7iArr[i2];
            Object[] objArr = requestdraganddroptransferk4lq0m.read;
            startdraganddroptransferd4ec7i.write(objArr.length, 0, objArr);
            while (true) {
                startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i2 = startdraganddroptransferd4ec7iArr[i2];
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{startdraganddroptransferd4ec7i2.read[startdraganddroptransferd4ec7i2.write], obj}, getCieXyz.write())).booleanValue()) {
                    startdraganddroptransferd4ec7iArr[i2].write += 2;
                } else {
                    this.IconCompatParcelizer = i2;
                    return;
                }
            }
        } else {
            int iRemoteActionCompatParcelizer = 1 << ModuleDSLKt.RemoteActionCompatParcelizer(i, i3);
            if (requestdraganddroptransferk4lq0m.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer)) {
                startdraganddroptransferd4ec7iArr[i2].write(Integer.bitCount(requestdraganddroptransferk4lq0m.serializer) * 2, requestdraganddroptransferk4lq0m.IconCompatParcelizer(iRemoteActionCompatParcelizer), requestdraganddroptransferk4lq0m.read);
                this.IconCompatParcelizer = i2;
                return;
            }
            int i4 = requestdraganddroptransferk4lq0m.read(iRemoteActionCompatParcelizer);
            requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer = requestdraganddroptransferk4lq0m.serializer(i4);
            startdraganddroptransferd4ec7iArr[i2].write(Integer.bitCount(requestdraganddroptransferk4lq0m.serializer) * 2, i4, requestdraganddroptransferk4lq0m.read);
            RemoteActionCompatParcelizer(i, requestdraganddroptransferk4lq0mSerializer, obj, i2 + 1);
        }
    }

    @Override // o.onChanged, java.util.Iterator
    public final void remove() {
        if (!this.MediaDescriptionCompat) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        boolean z = this.serializer;
        onEntered onentered = this.read;
        if (!z) {
            pauseWebviewIfNecessarylambda10.serializer(onentered).remove(this.RatingCompat);
        } else {
            if (!z) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return;
            }
            startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i = this.write[this.IconCompatParcelizer];
            Object obj = startdraganddroptransferd4ec7i.read[startdraganddroptransferd4ec7i.write];
            pauseWebviewIfNecessarylambda10.serializer(onentered).remove(this.RatingCompat);
            RemoteActionCompatParcelizer(obj != null ? obj.hashCode() : 0, onentered.serializer, obj, 0);
        }
        this.RatingCompat = null;
        this.MediaDescriptionCompat = false;
        this.RemoteActionCompatParcelizer = onentered.RemoteActionCompatParcelizer;
    }
}
