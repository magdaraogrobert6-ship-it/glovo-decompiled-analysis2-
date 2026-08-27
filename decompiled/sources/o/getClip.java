package o;

import androidx.transition.Transition$1;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class getClip {
    public static int IconCompatParcelizer;
    public ArrayList MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public ArrayList serializer;
    public int write;

    public final void IconCompatParcelizer(int i, getClip getclip) {
        int i2 = getclip.RemoteActionCompatParcelizer;
        for (setAlignment setalignment : this.MediaDescriptionCompat) {
            getclip.write(setalignment);
            if (i == 0) {
                setalignment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2;
            } else {
                setalignment.onRetainCustomNonConfigurationInstance = i2;
            }
        }
        this.read = i2;
    }

    public final void read(ArrayList arrayList) {
        int size = this.MediaDescriptionCompat.size();
        if (this.read != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                getClip getclip = (getClip) arrayList.get(i);
                if (this.read == getclip.RemoteActionCompatParcelizer) {
                    IconCompatParcelizer(this.write, getclip);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.write;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "] <", sb);
        for (setAlignment setalignment : this.MediaDescriptionCompat) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(strM, " ");
            sbM.append(setalignment.accessensureViewModelStore);
            strM = sbM.toString();
        }
        return strM.concat(" >");
    }

    public final int write(DrawWithContentElement drawWithContentElement, int i) {
        int iSerializer;
        int iSerializer2;
        ArrayList arrayList = this.MediaDescriptionCompat;
        if (arrayList.size() == 0) {
            return 0;
        }
        getUseIntrinsicSize getuseintrinsicsize = ((setAlignment) arrayList.get(0)).getViewModelStore;
        drawWithContentElement.MediaMetadataCompat();
        getuseintrinsicsize.write(drawWithContentElement, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((setAlignment) arrayList.get(i2)).write(drawWithContentElement, false);
        }
        if (i == 0 && getuseintrinsicsize.MediaDescriptionCompat > 0) {
            setPublicNotificationExtras.RemoteActionCompatParcelizer(getuseintrinsicsize, drawWithContentElement, arrayList, 0);
        }
        if (i == 1 && getuseintrinsicsize.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus > 0) {
            setPublicNotificationExtras.RemoteActionCompatParcelizer(getuseintrinsicsize, drawWithContentElement, arrayList, 1);
        }
        try {
            drawWithContentElement.RemoteActionCompatParcelizer();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.serializer = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            setAlignment setalignment = (setAlignment) arrayList.get(i3);
            Transition$1 transition$1 = new Transition$1(8);
            new java.lang.ref.WeakReference(setalignment);
            DrawWithContentElement.serializer(setalignment.onBackPressedDispatcher_delegatelambda010);
            DrawWithContentElement.serializer(setalignment.onActivityResult);
            DrawWithContentElement.serializer(setalignment.invalidateMenu);
            DrawWithContentElement.serializer(setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            DrawWithContentElement.serializer(setalignment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            this.serializer.add(transition$1);
        }
        if (i == 0) {
            iSerializer = DrawWithContentElement.serializer(getuseintrinsicsize.onBackPressedDispatcher_delegatelambda010);
            iSerializer2 = DrawWithContentElement.serializer(getuseintrinsicsize.invalidateMenu);
            drawWithContentElement.MediaMetadataCompat();
        } else {
            iSerializer = DrawWithContentElement.serializer(getuseintrinsicsize.onActivityResult);
            iSerializer2 = DrawWithContentElement.serializer(getuseintrinsicsize.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            drawWithContentElement.MediaMetadataCompat();
        }
        return iSerializer2 - iSerializer;
    }

    public final boolean write(setAlignment setalignment) {
        ArrayList arrayList = this.MediaDescriptionCompat;
        if (arrayList.contains(setalignment)) {
            return false;
        }
        arrayList.add(setalignment);
        return true;
    }
}
