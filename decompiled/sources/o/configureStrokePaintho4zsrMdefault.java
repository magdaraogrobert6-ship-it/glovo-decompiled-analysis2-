package o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class configureStrokePaintho4zsrMdefault implements getPrimaries {
    public final Resources IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final androidx.navigation.internal.NavContext read;
    public final int serializer;
    public final Resources.Theme write;

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
    }

    @Override // o.getPrimaries
    public final void read() {
    }

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) {
        Object objOpenRawResourceFd;
        try {
            androidx.navigation.internal.NavContext navContext = this.read;
            Resources.Theme theme = this.write;
            Resources resources = this.IconCompatParcelizer;
            int i = this.serializer;
            int i2 = navContext.read;
            if (i2 == 2) {
                objOpenRawResourceFd = resources.openRawResourceFd(i);
            } else if (i2 != 3) {
                objOpenRawResourceFd = resources.openRawResource(i);
            } else {
                Context context = navContext.IconCompatParcelizer;
                objOpenRawResourceFd = PositionCalculator.read(context, context, i, theme);
            }
            this.RemoteActionCompatParcelizer = objOpenRawResourceFd;
            getinversetransformui_graphics.serializer(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            getinversetransformui_graphics.write(e);
        }
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        int i = this.read.read;
        if (i != 2) {
            return i != 3 ? InputStream.class : Drawable.class;
        }
        return AssetFileDescriptor.class;
    }

    public configureStrokePaintho4zsrMdefault(Resources.Theme theme, Resources resources, androidx.navigation.internal.NavContext navContext, int i) {
        this.write = theme;
        this.IconCompatParcelizer = resources;
        this.read = navContext;
        this.serializer = i;
    }

    @Override // o.getPrimaries
    public final void write() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj != null) {
            try {
                int i = this.read.read;
                if (i == 2) {
                    ((AssetFileDescriptor) obj).close();
                } else if (i != 3) {
                    ((InputStream) obj).close();
                }
            } catch (IOException unused) {
            }
        }
    }
}
