package o;

import android.content.res.TypedArray;
import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes4.dex */
public final class getNamedBoolean extends Emitter {
    public final /* synthetic */ int write;

    @Override // io.socket.emitter.Emitter
    public final Emitter h_() {
        return this;
    }

    @Override // io.socket.emitter.Emitter
    public Emitter RemoteActionCompatParcelizer(TypedArray typedArray) {
        if (this.write != 1) {
            return super.RemoteActionCompatParcelizer(typedArray);
        }
        getNamedInt getnamedint = (getNamedInt) this.ComponentActivity;
        super.RemoteActionCompatParcelizer(typedArray);
        if (typedArray.hasValue(2)) {
            getnamedint.serializer = (typedArray.getColor(2, getnamedint.serializer) & 16777215) | (getnamedint.serializer & (-16777216));
        }
        if (typedArray.hasValue(12)) {
            getnamedint.ParcelableVolumeInfo = typedArray.getColor(12, getnamedint.ParcelableVolumeInfo);
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNamedBoolean(int i) {
        super(2);
        this.write = i;
        if (i == 1) {
            super(2);
        } else {
            ((getNamedInt) this.ComponentActivity).write = true;
        }
    }
}
