package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzmb;

/* JADX INFO: loaded from: classes2.dex */
public final class setLastKnownParentNodeui implements getDispatcher {
    public final getOnPreKeyEvent RemoteActionCompatParcelizer;
    public final onInterceptKeyBeforeSoftKeyboard read;

    @Override // o.getDispatcher
    public final void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        getConnection.write(obj, obj2);
    }

    @Override // o.getDispatcher
    public final void read(Object obj, byte[] bArr, int i, int i2, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) obj;
        if (softwareKeyboardInterceptionModifierKt.read == NestedScrollNode.RemoteActionCompatParcelizer) {
            softwareKeyboardInterceptionModifierKt.read = NestedScrollNode.read();
        }
        throw c8$$ExternalSyntheticOutline0.m(obj);
    }

    public setLastKnownParentNodeui(onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard, getOnPreKeyEvent getonprekeyevent) {
        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard2 = SoftKeyboardInterceptionElement.write;
        this.read = oninterceptkeybeforesoftkeyboard;
        this.RemoteActionCompatParcelizer = getonprekeyevent;
    }

    @Override // o.getDispatcher
    public final void IconCompatParcelizer(Object obj) {
        this.read.getClass();
        NestedScrollNode nestedScrollNode = ((SoftwareKeyboardInterceptionModifierKt) obj).read;
        if (nestedScrollNode.MediaSessionCompatQueueItem) {
            nestedScrollNode.MediaSessionCompatQueueItem = false;
        }
        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard = SoftKeyboardInterceptionElement.write;
        throw c8$$ExternalSyntheticOutline0.m(obj);
    }

    @Override // o.getDispatcher
    public final SoftwareKeyboardInterceptionModifierKt RemoteActionCompatParcelizer() {
        getOnPreKeyEvent getonprekeyevent = this.RemoteActionCompatParcelizer;
        if (getonprekeyevent instanceof SoftwareKeyboardInterceptionModifierKt) {
            return (SoftwareKeyboardInterceptionModifierKt) ((SoftwareKeyboardInterceptionModifierKt) getonprekeyevent).RemoteActionCompatParcelizer(4);
        }
        zzmb zzmbVar = (zzmb) ((SoftwareKeyboardInterceptionModifierKt) getonprekeyevent).RemoteActionCompatParcelizer(5);
        boolean zStartActivityForResult = zzmbVar.IconCompatParcelizer.startActivityForResult();
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = zzmbVar.IconCompatParcelizer;
        if (!zStartActivityForResult) {
            return softwareKeyboardInterceptionModifierKt;
        }
        softwareKeyboardInterceptionModifierKt.setPictureInPictureParams();
        return zzmbVar.IconCompatParcelizer;
    }

    @Override // o.getDispatcher
    public final boolean read(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt, SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt2) {
        return softwareKeyboardInterceptionModifierKt.read.equals(softwareKeyboardInterceptionModifierKt2.read);
    }

    @Override // o.getDispatcher
    public final int serializer(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt) {
        return softwareKeyboardInterceptionModifierKt.read.hashCode();
    }

    @Override // o.getDispatcher
    public final int serializer(getOnPreKeyEvent getonprekeyevent) {
        NestedScrollNode nestedScrollNode = ((SoftwareKeyboardInterceptionModifierKt) getonprekeyevent).read;
        int i = nestedScrollNode.write;
        if (i != -1) {
            return i;
        }
        int iRemoteActionCompatParcelizer = 0;
        for (int i2 = 0; i2 < nestedScrollNode.read; i2++) {
            int i3 = nestedScrollNode.IconCompatParcelizer[i2];
            onPreviewKeyEvent onpreviewkeyevent = (onPreviewKeyEvent) nestedScrollNode.serializer[i2];
            int iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(8);
            int iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(16);
            int iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i3 >>> 3);
            int iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(24);
            int iRemoteActionCompatParcelizer2 = onpreviewkeyevent.RemoteActionCompatParcelizer();
            iRemoteActionCompatParcelizer += iIconCompatParcelizer + iIconCompatParcelizer + iIconCompatParcelizer3 + iIconCompatParcelizer2 + IconCompatParcelizer.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer2, iIconCompatParcelizer4);
        }
        nestedScrollNode.write = iRemoteActionCompatParcelizer;
        return iRemoteActionCompatParcelizer;
    }

    @Override // o.getDispatcher
    public final void serializer(Object obj, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq) {
        throw c8$$ExternalSyntheticOutline0.m(obj);
    }

    @Override // o.getDispatcher
    public final boolean serializer(Object obj) {
        throw c8$$ExternalSyntheticOutline0.m(obj);
    }
}
