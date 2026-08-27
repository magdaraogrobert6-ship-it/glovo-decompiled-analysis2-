package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class resizeGraphicFrameIfAppropriate {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public Object write;

    public resizeGraphicFrameIfAppropriate(scale0AR0LA0default scale0ar0la0default) {
        this.RemoteActionCompatParcelizer = 3;
        this.write = getCapKaPHkGw.write(150, new coil3.memory.MemoryCacheService(this));
        this.read = scale0ar0la0default;
    }

    public accessgetLookaheadAndAncestorMeasureSetp RemoteActionCompatParcelizer() {
        setDelegateui setdelegateui = (setDelegateui) this.write;
        if (setdelegateui != null) {
            throw setdelegateui.RemoteActionCompatParcelizer();
        }
        accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer = accessgetLookaheadAndAncestorMeasureSetp.RemoteActionCompatParcelizer(this.serializer, (Object[]) this.read, this);
        setDelegateui setdelegateui2 = (setDelegateui) this.write;
        if (setdelegateui2 == null) {
            return accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer;
        }
        throw setdelegateui2.RemoteActionCompatParcelizer();
    }

    public void serializer() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist;
        ImageView imageView = (ImageView) this.read;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            getNestedScrollAxes.RemoteActionCompatParcelizer(drawable);
        }
        if (drawable == null || (setsupportcompounddrawablestintlist = (setSupportCompoundDrawablesTintList) this.write) == null) {
            return;
        }
        ensureSubDecor.IconCompatParcelizer(drawable, setsupportcompounddrawablestintlist, imageView.getDrawableState());
    }

    public void serializer(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.read;
        Context context = imageView.getContext();
        int[] iArr = onUserLeaveHint.AppCompatImageView;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        FocusPropertiesNode.IconCompatParcelizer(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = coil3.util.IntPair.write(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                getNestedScrollAxes.RemoteActionCompatParcelizer(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(emojiProcessorRemoteActionCompatParcelizer.serializer(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(getNestedScrollAxes.IconCompatParcelizer(typedArray.getInt(3, -1), null));
            }
        } finally {
            emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }

    public void read() {
        int i = this.serializer * 2;
        this.read = Arrays.copyOf((Object[]) this.read, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        onContentCardClicked.read((int[]) this.write, 0, iArr, 0, 14);
        this.write = iArr;
    }

    public void read(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.serializer) * 2;
            Object[] objArr = (Object[]) this.read;
            if (size > objArr.length) {
                this.read = Arrays.copyOf(objArr, JsonUtilsc.write(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            read(entry.getKey(), entry.getValue());
        }
    }

    public String write() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.serializer;
        for (int i2 = 0; i2 < i + 1; i2++) {
            Object obj = ((Object[]) this.read)[i2];
            if (obj instanceof r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) {
                r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
                Object[] objArr = {r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer};
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
                int[] iArr = (int[]) this.write;
                if (zBooleanValue) {
                    if (iArr[i2] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.write)[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i3));
                    }
                }
            } else if (obj != handleLocalImagelambda1.serializer) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public String toString() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i != 5 ? super.toString() : write();
        }
        StringBuilder sb = new StringBuilder();
        if (((r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc) this.read) == r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.serializer);
        sb.append(' ');
        sb.append((String) this.write);
        return sb.toString();
    }

    public void read(Object obj, Object obj2) {
        int i = (this.serializer + 1) * 2;
        Object[] objArr = (Object[]) this.read;
        if (i > objArr.length) {
            this.read = Arrays.copyOf(objArr, JsonUtilsc.write(objArr.length, i));
        }
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj2, "null key in entry: null="));
            return;
        }
        if (obj2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(obj, "null value in entry: ", "=null"));
            return;
        }
        Object[] objArr2 = (Object[]) this.read;
        int i2 = this.serializer;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.serializer = i2 + 1;
    }

    public resizeGraphicFrameIfAppropriate(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc, int i, String str) {
        this.RemoteActionCompatParcelizer = 0;
        r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
        this.read = r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
        this.serializer = i;
        this.write = str;
    }

    public resizeGraphicFrameIfAppropriate(ImageView imageView) {
        this.RemoteActionCompatParcelizer = 1;
        this.serializer = 0;
        this.read = imageView;
    }

    public resizeGraphicFrameIfAppropriate(int i) {
        this.RemoteActionCompatParcelizer = 4;
        this.read = new Object[i * 2];
        this.serializer = 0;
    }

    public /* synthetic */ resizeGraphicFrameIfAppropriate(byte b, int i) {
        this.RemoteActionCompatParcelizer = i;
    }
}
