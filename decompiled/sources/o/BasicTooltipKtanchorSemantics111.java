package o;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTooltipKtanchorSemantics111 implements onRelease {
    public final AnchoredDraggableKtanchoredDraggable1 IconCompatParcelizer;
    public final androidx.compose.foundation.lazy.LazyListState RemoteActionCompatParcelizer;
    public final AnchoredDraggableKtrestartable2 read;
    public final down serializer;

    @Override // o.onRelease
    public final void RemoteActionCompatParcelizer(int i, Object obj, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-462424778);
        int i4 = 2;
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
            recordGeofenceTransitionlambda0.RemoteActionCompatParcelizer(obj, i, this.RemoteActionCompatParcelizer.PlaybackStateCompat, coil3.ExtrasKt.write(-824725566, new AndroidPathIterator_androidKtWhenMappings(this, i, i4), getpostalcode), getpostalcode, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 3072);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new WrappedAnchor(this, i, obj, i2, 0);
        }
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // o.onRelease
    public final int serializer() {
        return this.read.read().read;
    }

    @Override // o.onRelease
    public final int serializer(Object obj) {
        return this.serializer.RemoteActionCompatParcelizer(obj);
    }

    @Override // o.onRelease
    public final Object serializer(int i) {
        TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId1Write = this.read.serializer.write(i);
        return textFieldImplKtCommonDecorationBox3containerWithId1Write.write.IconCompatParcelizer().invoke(Integer.valueOf(i - textFieldImplKtCommonDecorationBox3containerWithId1Write.serializer));
    }

    @Override // o.onRelease
    public final Object write(int i) {
        down downVar = this.serializer;
        Object[] objArr = (Object[]) downVar.serializer;
        int i2 = i - downVar.read;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.read.read(i) : obj;
    }

    public BasicTooltipKtanchorSemantics111(androidx.compose.foundation.lazy.LazyListState lazyListState, AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable2, AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable1, down downVar) {
        this.RemoteActionCompatParcelizer = lazyListState;
        this.read = anchoredDraggableKtrestartable2;
        this.IconCompatParcelizer = anchoredDraggableKtanchoredDraggable1;
        this.serializer = downVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicTooltipKtanchorSemantics111)) {
            return false;
        }
        Object[] objArr = {this.read, ((BasicTooltipKtanchorSemantics111) obj).read};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
