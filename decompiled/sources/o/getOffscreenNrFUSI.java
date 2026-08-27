package o;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition$1;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class getOffscreenNrFUSI extends ColorSpaceVerificationHelperExternalSyntheticLambda0 {
    public ColorSpaceVerificationHelperExternalSyntheticLambda0[] MediaMetadataCompat;
    public int serializer;
    public ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public boolean IconCompatParcelizer = true;
    public boolean read = false;
    public int write = 0;

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void IconCompatParcelizer(View view) {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).IconCompatParcelizer(view);
        }
        this._init_lambda3.remove(view);
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void RemoteActionCompatParcelizer(long j) {
        this._init_lambda4 = j;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void read(View view) {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).read(view);
        }
        this._init_lambda3.add(view);
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final ColorSpaceVerificationHelperExternalSyntheticLambda0 write(obtainAndroidColorSpace obtainandroidcolorspace) {
        super.write(obtainandroidcolorspace);
        return this;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void IconCompatParcelizer(ViewGroup viewGroup, androidx.transition.TransitionValuesMaps transitionValuesMaps, androidx.transition.TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this._init_lambda4;
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i);
            if (j > 0 && (this.IconCompatParcelizer || i == 0)) {
                long j2 = colorSpaceVerificationHelperExternalSyntheticLambda0._init_lambda4;
                if (j2 > 0) {
                    colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(j2 + j);
                } else {
                    colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(j);
                }
            }
            colorSpaceVerificationHelperExternalSyntheticLambda0.IconCompatParcelizer(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final boolean IconCompatParcelizer() {
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (!((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).IconCompatParcelizer()) {
                return false;
            }
        }
        return true;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final boolean MediaBrowserCompatMediaItem() {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            if (((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).MediaBrowserCompatMediaItem()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void MediaMetadataCompat() {
        ArrayList arrayList;
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            PlaybackStateCompatCustomAction();
            MediaDescriptionCompat();
            return;
        }
        accessgetOffscreencp accessgetoffscreencp = new accessgetOffscreencp();
        accessgetoffscreencp.serializer = this;
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) it.next()).read(accessgetoffscreencp);
        }
        this.serializer = this.RemoteActionCompatParcelizer.size();
        if (this.IconCompatParcelizer) {
            Iterator it2 = this.RemoteActionCompatParcelizer.iterator();
            while (it2.hasNext()) {
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) it2.next()).MediaMetadataCompat();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.RemoteActionCompatParcelizer.size();
            arrayList = this.RemoteActionCompatParcelizer;
            if (i >= size) {
                break;
            }
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) arrayList.get(i - 1)).read(new accessgetOffscreencp((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i), 2));
            i++;
        }
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) arrayList.get(0);
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.MediaMetadataCompat();
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void RatingCompat() {
        this.addObserverForBackInvoker = 0L;
        int i = 0;
        accessgetOffscreencp accessgetoffscreencp = new accessgetOffscreencp(this, i);
        while (i < this.RemoteActionCompatParcelizer.size()) {
            ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i);
            colorSpaceVerificationHelperExternalSyntheticLambda0.read(accessgetoffscreencp);
            colorSpaceVerificationHelperExternalSyntheticLambda0.RatingCompat();
            long j = colorSpaceVerificationHelperExternalSyntheticLambda0.addObserverForBackInvoker;
            boolean z = this.IconCompatParcelizer;
            long j2 = this.addObserverForBackInvoker;
            if (z) {
                this.addObserverForBackInvoker = Math.max(j2, j);
            } else {
                colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = j2;
                this.addObserverForBackInvoker = j2 + j;
            }
            i++;
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void RemoteActionCompatParcelizer(CompositingStrategyCompanion compositingStrategyCompanion) {
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).RemoteActionCompatParcelizer(compositingStrategyCompanion);
        }
    }

    public final void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        this.RemoteActionCompatParcelizer.add(colorSpaceVerificationHelperExternalSyntheticLambda0);
        colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = this;
        long j = this.MediaSessionCompatResultReceiverWrapper;
        if (j >= 0) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.IconCompatParcelizer(j);
        }
        if ((this.write & 1) != 0) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.IconCompatParcelizer(this.ResultReceiver);
        }
        if ((this.write & 2) != 0) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.MediaSessionCompatToken();
        }
        if ((this.write & 4) != 0) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.read(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        if ((this.write & 8) != 0) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.serializer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void serializer(CompositingStrategyCompanion compositingStrategyCompanion) {
        View view = compositingStrategyCompanion.RemoteActionCompatParcelizer;
        if (serializer(view)) {
            for (ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 : this.RemoteActionCompatParcelizer) {
                if (colorSpaceVerificationHelperExternalSyntheticLambda0.serializer(view)) {
                    colorSpaceVerificationHelperExternalSyntheticLambda0.serializer(compositingStrategyCompanion);
                    compositingStrategyCompanion.serializer.add(colorSpaceVerificationHelperExternalSyntheticLambda0);
                }
            }
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void serializer(composeColorSpace composecolorspace) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = composecolorspace;
        this.write |= 8;
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).serializer(composecolorspace);
        }
    }

    public final ColorSpaceVerificationHelperExternalSyntheticLambda0 write(int i) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer.size()) {
            return null;
        }
        return (ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void write(CompositingStrategyCompanion compositingStrategyCompanion) {
        View view = compositingStrategyCompanion.RemoteActionCompatParcelizer;
        if (serializer(view)) {
            for (ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 : this.RemoteActionCompatParcelizer) {
                if (colorSpaceVerificationHelperExternalSyntheticLambda0.serializer(view)) {
                    colorSpaceVerificationHelperExternalSyntheticLambda0.write(compositingStrategyCompanion);
                    compositingStrategyCompanion.serializer.add(colorSpaceVerificationHelperExternalSyntheticLambda0);
                }
            }
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void RemoteActionCompatParcelizer(View view) {
        super.RemoteActionCompatParcelizer(view);
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).RemoteActionCompatParcelizer(view);
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void read() {
        super.read();
        ColorSpaceVerificationHelperExternalSyntheticLambda0[] colorSpaceVerificationHelperExternalSyntheticLambda0Arr = this.MediaMetadataCompat;
        this.MediaMetadataCompat = null;
        if (colorSpaceVerificationHelperExternalSyntheticLambda0Arr == null) {
            colorSpaceVerificationHelperExternalSyntheticLambda0Arr = new ColorSpaceVerificationHelperExternalSyntheticLambda0[this.RemoteActionCompatParcelizer.size()];
        }
        ColorSpaceVerificationHelperExternalSyntheticLambda0[] colorSpaceVerificationHelperExternalSyntheticLambda0Arr2 = (ColorSpaceVerificationHelperExternalSyntheticLambda0[]) this.RemoteActionCompatParcelizer.toArray(colorSpaceVerificationHelperExternalSyntheticLambda0Arr);
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            colorSpaceVerificationHelperExternalSyntheticLambda0Arr2[i].read();
        }
        Arrays.fill(colorSpaceVerificationHelperExternalSyntheticLambda0Arr2, (Object) null);
        this.MediaMetadataCompat = colorSpaceVerificationHelperExternalSyntheticLambda0Arr2;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void read(Transition$1 transition$1) {
        super.read(transition$1);
        this.write |= 4;
        if (this.RemoteActionCompatParcelizer != null) {
            for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).read(transition$1);
            }
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void write(View view) {
        super.write(view);
        ColorSpaceVerificationHelperExternalSyntheticLambda0[] colorSpaceVerificationHelperExternalSyntheticLambda0Arr = this.MediaMetadataCompat;
        this.MediaMetadataCompat = null;
        if (colorSpaceVerificationHelperExternalSyntheticLambda0Arr == null) {
            colorSpaceVerificationHelperExternalSyntheticLambda0Arr = new ColorSpaceVerificationHelperExternalSyntheticLambda0[this.RemoteActionCompatParcelizer.size()];
        }
        ColorSpaceVerificationHelperExternalSyntheticLambda0[] colorSpaceVerificationHelperExternalSyntheticLambda0Arr2 = (ColorSpaceVerificationHelperExternalSyntheticLambda0[]) this.RemoteActionCompatParcelizer.toArray(colorSpaceVerificationHelperExternalSyntheticLambda0Arr);
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            colorSpaceVerificationHelperExternalSyntheticLambda0Arr2[i].write(view);
        }
        Arrays.fill(colorSpaceVerificationHelperExternalSyntheticLambda0Arr2, (Object) null);
        this.MediaMetadataCompat = colorSpaceVerificationHelperExternalSyntheticLambda0Arr2;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void IconCompatParcelizer(TimeInterpolator timeInterpolator) {
        this.write |= 1;
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).IconCompatParcelizer(timeInterpolator);
            }
        }
        this.ResultReceiver = timeInterpolator;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void MediaSessionCompatToken() {
        this.write |= 2;
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).MediaSessionCompatToken();
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final ColorSpaceVerificationHelperExternalSyntheticLambda0 clone() {
        getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) super.clone();
        getoffscreennrfusi.RemoteActionCompatParcelizer = new ArrayList();
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0Clone = ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).clone();
            getoffscreennrfusi.RemoteActionCompatParcelizer.add(colorSpaceVerificationHelperExternalSyntheticLambda0Clone);
            colorSpaceVerificationHelperExternalSyntheticLambda0Clone.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = getoffscreennrfusi;
        }
        return getoffscreennrfusi;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final String read(String str) {
        String string = super.read(str);
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(string, "\n");
            sbM.append(((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).read(str.concat("  ")));
            string = sbM.toString();
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void IconCompatParcelizer(long j, long j2) {
        boolean z;
        long j3 = this.addObserverForBackInvoker;
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j3 && j2 > j3) {
                return;
            }
        }
        boolean z2 = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j3 && j2 > j3)) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
            RemoteActionCompatParcelizer(this, getDstBrush.MediaDescriptionCompat, z2);
        }
        if (this.IconCompatParcelizer) {
            for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).IconCompatParcelizer(j, j2);
            }
        } else {
            int size = 1;
            while (true) {
                int size2 = this.RemoteActionCompatParcelizer.size();
                ArrayList arrayList = this.RemoteActionCompatParcelizer;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((ColorSpaceVerificationHelperExternalSyntheticLambda0) arrayList.get(size)).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i2 = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i2 < this.RemoteActionCompatParcelizer.size()) {
                        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i2);
                        long j4 = colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                        z = z2;
                        long j5 = j - j4;
                        if (j5 < 0) {
                            break;
                        }
                        colorSpaceVerificationHelperExternalSyntheticLambda0.IconCompatParcelizer(j5, j2 - j4);
                        i2++;
                        z2 = z;
                    }
                }
            } else {
                z = z2;
                while (i2 >= 0) {
                    ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda1 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i2);
                    long j6 = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                    long j7 = j - j6;
                    colorSpaceVerificationHelperExternalSyntheticLambda1.IconCompatParcelizer(j7, j2 - j6);
                    if (j7 >= 0) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null) {
                if ((j > j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
                    return;
                }
                if (j > j3) {
                    this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                }
                RemoteActionCompatParcelizer(this, getDstBrush.IconCompatParcelizer, z);
            }
        }
        z = z2;
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null) {
            if (j > j3) {
                return;
            } else {
                return;
            }
            if (j > j3) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
            }
            RemoteActionCompatParcelizer(this, getDstBrush.IconCompatParcelizer, z);
        }
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void IconCompatParcelizer(long j) {
        ArrayList arrayList;
        this.MediaSessionCompatResultReceiverWrapper = j;
        if (j < 0 || (arrayList = this.RemoteActionCompatParcelizer) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.RemoteActionCompatParcelizer.get(i)).IconCompatParcelizer(j);
        }
    }
}
