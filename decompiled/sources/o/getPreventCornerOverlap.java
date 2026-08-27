package o;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class getPreventCornerOverlap extends fromId {
    public final valueOf MediaSessionCompatToken;
    public final valueOf r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int PlaybackStateCompatCustomAction = -1;
    public int ComponentActivity = -1;

    @Override // o.fromId
    public final getContentPaddingLeft IconCompatParcelizer(getNavigationIcon getnavigationicon) {
        Map map = Collections.EMPTY_MAP;
        getContentPaddingLeft getcontentpaddingleftIconCompatParcelizer = super.IconCompatParcelizer(getnavigationicon);
        this.PlaybackStateCompatCustomAction = setCardBackgroundColor.read();
        this.ComponentActivity = setCardBackgroundColor.read();
        return getcontentpaddingleftIconCompatParcelizer;
    }

    public final void read(long j, Surface surface, SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        setCardBackgroundColor.serializer(this.MediaMetadataCompat, true);
        setCardBackgroundColor.serializer(this.RatingCompat);
        HashMap map = this.MediaDescriptionCompat;
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("The surface is not registered.", map.containsKey(surface));
        getRadius getradiusIconCompatParcelizer = (getRadius) map.get(surface);
        Objects.requireNonNull(getradiusIconCompatParcelizer);
        if (getradiusIconCompatParcelizer == setCardBackgroundColor.serializer) {
            getradiusIconCompatParcelizer = IconCompatParcelizer(surface);
            if (getradiusIconCompatParcelizer == null) {
                return;
            } else {
                map.put(surface, getradiusIconCompatParcelizer);
            }
        }
        if (surface != this.write) {
            write(getradiusIconCompatParcelizer.serializer);
            this.write = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(androidx.compose.ui.graphics.Fields.Clip);
        getRadius getradius = getradiusIconCompatParcelizer;
        RemoteActionCompatParcelizer(getradius, surfaceViewNotCroppedByParentQuirk, surfaceTexture, this.MediaSessionCompatToken, this.PlaybackStateCompatCustomAction, true);
        RemoteActionCompatParcelizer(getradius, surfaceViewNotCroppedByParentQuirk, surfaceTexture2, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.ComponentActivity, false);
        EGLDisplay eGLDisplay = this.MediaSessionCompatQueueItem;
        EGLSurface eGLSurface = getradiusIconCompatParcelizer.serializer;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        if (EGL14.eglSwapBuffers(this.MediaSessionCompatQueueItem, eGLSurface)) {
            return;
        }
        setInflatedId.read("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        RemoteActionCompatParcelizer(surface, false);
    }

    public getPreventCornerOverlap(valueOf valueof, valueOf valueof2) {
        this.MediaSessionCompatToken = valueof;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = valueof2;
    }

    public final void RemoteActionCompatParcelizer(getRadius getradius, SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk, SurfaceTexture surfaceTexture, valueOf valueof, int i, boolean z) {
        float[] fArr;
        IconCompatParcelizer(i);
        int i2 = getradius.IconCompatParcelizer;
        int i3 = getradius.RemoteActionCompatParcelizer;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr2 = new float[16];
        surfaceTexture.getTransformMatrix(fArr2);
        float[] fArr3 = new float[16];
        if (z) {
            fArr = surfaceViewNotCroppedByParentQuirk.IconCompatParcelizer;
        } else {
            fArr = surfaceViewNotCroppedByParentQuirk.MediaSessionCompatQueueItem;
        }
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        setPaddingRelative setpaddingrelative = this.RemoteActionCompatParcelizer;
        setpaddingrelative.getClass();
        if (setpaddingrelative instanceof setRadius) {
            GLES20.glUniformMatrix4fv(((setRadius) setpaddingrelative).RatingCompat, 1, false, fArr3, 0);
            setCardBackgroundColor.serializer("glUniformMatrix4fv");
        }
        FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1 = (FocusOwnerImplmoveFocusfocusSearchSuccess1) valueof.IconCompatParcelizer;
        Object obj = focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer;
        Float f = (Float) focusOwnerImplmoveFocusfocusSearchSuccess1.RemoteActionCompatParcelizer;
        android.util.Size size = new android.util.Size((int) (((Float) focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer).floatValue() * i2), (int) (f.floatValue() * i3));
        android.util.Size size2 = new android.util.Size(i2, i3);
        float[] fArr4 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr5, 0);
        float[] fArr6 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr6, 0);
        android.opengl.Matrix.scaleM(fArr4, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess2 = (FocusOwnerImplmoveFocusfocusSearchSuccess1) valueof.RemoteActionCompatParcelizer;
        Float f2 = (Float) obj;
        if (f2.floatValue() != 0.0f || f.floatValue() != 0.0f) {
            android.opengl.Matrix.translateM(fArr5, 0, ((Float) focusOwnerImplmoveFocusfocusSearchSuccess2.IconCompatParcelizer).floatValue() / f2.floatValue(), ((Float) focusOwnerImplmoveFocusfocusSearchSuccess2.RemoteActionCompatParcelizer).floatValue() / f.floatValue(), 0.0f);
        }
        android.opengl.Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
        GLES20.glUniformMatrix4fv(setpaddingrelative.write, 1, false, fArr6, 0);
        setCardBackgroundColor.serializer("glUniformMatrix4fv");
        GLES20.glUniform1f(setpaddingrelative.read, 1.0f);
        setCardBackgroundColor.serializer("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        setCardBackgroundColor.serializer("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
