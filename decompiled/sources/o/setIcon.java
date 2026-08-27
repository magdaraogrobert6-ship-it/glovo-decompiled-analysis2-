package o;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.viewsintegration.EmojiTextWatcher$InitCallbackImpl;
import com.huawei.hmf.tasks.a.i$d;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class setIcon {
    public static final int[] write = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public Object RemoteActionCompatParcelizer;
    public final View read;

    public setIcon(EditText editText) {
        this.read = editText;
        this.RemoteActionCompatParcelizer = new androidx.camera.view.PendingValue(editText);
    }

    public static boolean write(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void RemoteActionCompatParcelizer(boolean z) {
        isUnspecifiedk4lQ0Mannotations isunspecifiedk4lq0mannotations = (isUnspecifiedk4lQ0Mannotations) ((i$d) ((androidx.camera.view.PendingValue) this.RemoteActionCompatParcelizer).serializer).read;
        if (isunspecifiedk4lq0mannotations.read != z) {
            if (isunspecifiedk4lq0mannotations.RemoteActionCompatParcelizer != null) {
                MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
                EmojiTextWatcher$InitCallbackImpl emojiTextWatcher$InitCallbackImpl = isunspecifiedk4lq0mannotations.RemoteActionCompatParcelizer;
                mutableRectKtRemoteActionCompatParcelizer.getClass();
                coil3.util.UtilsKt.IconCompatParcelizer(emojiTextWatcher$InitCallbackImpl, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = mutableRectKtRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    mutableRectKtRemoteActionCompatParcelizer.read.remove(emojiTextWatcher$InitCallbackImpl);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            isunspecifiedk4lq0mannotations.read = z;
            if (z) {
                isUnspecifiedk4lQ0Mannotations.RemoteActionCompatParcelizer(isunspecifiedk4lq0mannotations.write, MutableRectKt.RemoteActionCompatParcelizer().IconCompatParcelizer());
            }
        }
    }

    public isFinitek4lQ0M write(InputConnection inputConnection, EditorInfo editorInfo) {
        androidx.camera.view.PendingValue pendingValue = (androidx.camera.view.PendingValue) this.RemoteActionCompatParcelizer;
        if (inputConnection == null) {
            pendingValue.getClass();
            inputConnection = null;
        } else {
            i$d i_d = (i$d) pendingValue.serializer;
            i_d.getClass();
            if (!(inputConnection instanceof isFinitek4lQ0M)) {
                inputConnection = new isFinitek4lQ0M(editorInfo, inputConnection, (EditText) i_d.serializer);
            }
        }
        return (isFinitek4lQ0M) inputConnection;
    }

    public void RemoteActionCompatParcelizer(AttributeSet attributeSet, int i) {
        int i2 = this.IconCompatParcelizer;
        View view = this.read;
        if (i2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = ((EditText) view).getContext().obtainStyledAttributes(attributeSet, onUserLeaveHint.AppCompatTextView, i, 0);
            try {
                boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                typedArrayObtainStyledAttributes.recycle();
                RemoteActionCompatParcelizer(z);
                return;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        AbsSeekBar absSeekBar = (AbsSeekBar) view;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(absSeekBar.getContext(), attributeSet, write, i);
        Drawable drawableWrite = emojiProcessorRemoteActionCompatParcelizer.write(0);
        if (drawableWrite != null) {
            if (drawableWrite instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableWrite;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(animationDrawable.getFrame(i3), true);
                    drawableRemoteActionCompatParcelizer.setLevel(10000);
                    animationDrawable2.addFrame(drawableRemoteActionCompatParcelizer, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                drawableWrite = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableWrite);
        }
        Drawable drawableWrite2 = emojiProcessorRemoteActionCompatParcelizer.write(1);
        if (drawableWrite2 != null) {
            absSeekBar.setProgressDrawable(RemoteActionCompatParcelizer(drawableWrite2, false));
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public KeyListener serializer(KeyListener keyListener) {
        boolean z = keyListener instanceof NumberKeyListener;
        if (z) {
            return keyListener;
        }
        ((i$d) ((androidx.camera.view.PendingValue) this.RemoteActionCompatParcelizer).serializer).getClass();
        if (keyListener instanceof getUnspecifiedF1C5BW0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return z ? keyListener : new getUnspecifiedF1C5BW0(keyListener);
    }

    public Drawable RemoteActionCompatParcelizer(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.RemoteActionCompatParcelizer) == null) {
                this.RemoteActionCompatParcelizer = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = RemoteActionCompatParcelizer(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public setIcon(AbsSeekBar absSeekBar) {
        this.read = absSeekBar;
    }
}
