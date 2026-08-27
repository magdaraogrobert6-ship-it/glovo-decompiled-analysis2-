package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class decodeColor0d7_KjU extends decodeSpanStyle {
    @Override // o.decodeSpanStyle
    public final List IconCompatParcelizer(long j, Object obj) {
        decodeString decodestring = (decodeString) setDirty.RatingCompat.RatingCompat(j, obj);
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return decodestring;
        }
        int size = decodestring.size();
        decodeString decodestring2 = decodestring.read(size == 0 ? 10 : size * 2);
        setDirty.write(j, obj, decodestring2);
        return decodestring2;
    }

    @Override // o.decodeSpanStyle
    public final void RemoteActionCompatParcelizer(long j, Object obj) {
        transformMatrixToWindowEL8BTi8 transformmatrixtowindowel8bti8 = (transformMatrixToWindowEL8BTi8) ((decodeString) setDirty.RatingCompat.RatingCompat(j, obj));
        if (transformmatrixtowindowel8bti8.RemoteActionCompatParcelizer) {
            transformmatrixtowindowel8bti8.RemoteActionCompatParcelizer = false;
        }
    }

    @Override // o.decodeSpanStyle
    public final void RemoteActionCompatParcelizer(long j, Object obj, Object obj2) {
        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
        decodeString decodestring = (decodeString) graphicsLayerOwnerLayerrecordLambda1.RatingCompat(j, obj);
        decodeString decodestring2 = (decodeString) graphicsLayerOwnerLayerrecordLambda1.RatingCompat(j, obj2);
        int size = decodestring.size();
        int size2 = decodestring2.size();
        if (size > 0 && size2 > 0) {
            if (!((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
                decodestring = decodestring.read(size2 + size);
            }
            decodestring.addAll(decodestring2);
        }
        if (size > 0) {
            decodestring2 = decodestring;
        }
        setDirty.write(j, obj, decodestring2);
    }
}
