package o;

/* JADX INFO: loaded from: classes.dex */
public final class getTopLeftannotations extends AbsoluteAlignment {
    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.write.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.IconCompatParcelizer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTopLeftannotations)) {
            return false;
        }
        getTopLeftannotations gettopleftannotations = (getTopLeftannotations) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, gettopleftannotations.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, gettopleftannotations.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, gettopleftannotations.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, gettopleftannotations.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public final Object lerp(Object obj, float f) {
        Object[] objArr = {obj, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || obj == null) {
            getTopLeftannotations gettopleftannotations = androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer;
            ParseException parseException = new ParseException(0.0f);
            obj = new getTopLeftannotations(parseException, parseException, parseException, parseException);
        }
        if (!(obj instanceof getTopLeftannotations)) {
            return null;
        }
        getTopLeftannotations gettopleftannotations2 = (getTopLeftannotations) obj;
        getTopLeftannotations gettopleftannotations3 = androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer;
        return new getTopLeftannotations(new getCenterLeftannotations(this.serializer, gettopleftannotations2.serializer, f), new getCenterLeftannotations(this.write, gettopleftannotations2.write, f), new getCenterLeftannotations(this.IconCompatParcelizer, gettopleftannotations2.IconCompatParcelizer, f), new getCenterLeftannotations(this.RemoteActionCompatParcelizer, gettopleftannotations2.RemoteActionCompatParcelizer, f));
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.serializer + ", topEnd = " + this.write + ", bottomEnd = " + this.IconCompatParcelizer + ", bottomStart = " + this.RemoteActionCompatParcelizer + ')';
    }

    public getTopLeftannotations(SourceInformationKt sourceInformationKt, SourceInformationKt sourceInformationKt2, SourceInformationKt sourceInformationKt3, SourceInformationKt sourceInformationKt4) {
        super(sourceInformationKt, sourceInformationKt2, sourceInformationKt3, sourceInformationKt4);
    }
}
