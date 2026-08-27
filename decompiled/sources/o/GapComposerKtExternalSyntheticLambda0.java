package o;

/* JADX INFO: loaded from: classes.dex */
public final class GapComposerKtExternalSyntheticLambda0 implements onRelease {
    public final androidx.compose.foundation.pager.PagerState IconCompatParcelizer;
    public final down serializer;
    public final AbstractApplier write;

    @Override // o.onRelease
    public final void RemoteActionCompatParcelizer(int i, Object obj, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1201380429);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.read(this) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            recordGeofenceTransitionlambda0.RemoteActionCompatParcelizer(obj, i, this.IconCompatParcelizer.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, coil3.ExtrasKt.write(1142237095, new AndroidPathIterator_androidKtWhenMappings(this, i, 3), getpostalcode), getpostalcode, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 3072);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new WrappedAnchor(this, i, obj, i2, 1);
        }
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    @Override // o.onRelease
    public final int serializer() {
        return this.write.read().read;
    }

    @Override // o.onRelease
    public final int serializer(Object obj) {
        return this.serializer.RemoteActionCompatParcelizer(obj);
    }

    @Override // o.onRelease
    public final Object write(int i) {
        down downVar = this.serializer;
        Object[] objArr = (Object[]) downVar.serializer;
        int i2 = i - downVar.read;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.write.read(i) : obj;
    }

    public GapComposerKtExternalSyntheticLambda0(androidx.compose.foundation.pager.PagerState pagerState, LeftCompositionCancellationException leftCompositionCancellationException, down downVar) {
        this.IconCompatParcelizer = pagerState;
        this.write = leftCompositionCancellationException;
        this.serializer = downVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GapComposerKtExternalSyntheticLambda0)) {
            return false;
        }
        Object[] objArr = {this.write, ((GapComposerKtExternalSyntheticLambda0) obj).write};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
